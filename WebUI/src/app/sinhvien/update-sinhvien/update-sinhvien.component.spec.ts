import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateSinhvienComponent } from './update-sinhvien.component';

describe('UpdateSinhvienComponent', () => {
  let component: UpdateSinhvienComponent;
  let fixture: ComponentFixture<UpdateSinhvienComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateSinhvienComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateSinhvienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
