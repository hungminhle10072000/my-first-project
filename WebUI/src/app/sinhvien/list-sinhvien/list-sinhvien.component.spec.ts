import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSinhvienComponent } from './list-sinhvien.component';

describe('ListSinhvienComponent', () => {
  let component: ListSinhvienComponent;
  let fixture: ComponentFixture<ListSinhvienComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListSinhvienComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListSinhvienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
