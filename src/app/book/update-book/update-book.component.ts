import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { Book } from 'src/app/Book';
import { LiberaryserviceService } from 'src/app/liberaryservice.service';

@Component({
  selector: 'app-update-course',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent {
  id:number=0;
  book:Book=new Book();
  constructor(
    private studentService: LiberaryserviceService,
    private router: Router,
    private route: ActivatedRoute
    ) {}
    ngOnInit(): void {
      this.route.paramMap.subscribe((param) => {
         this.id = Number(param.get('id'));
        this.getById(this.id);
      });
    }

    getById(id:number) {
      this.studentService.getBook(id).subscribe((data: Book) => {
        this.book=data;
      });
    }

  update(){
    this.studentService.updateBook(this.book,this.id).subscribe(() => {
      this.router.navigate(['/books'])
    });
 
  }
}
