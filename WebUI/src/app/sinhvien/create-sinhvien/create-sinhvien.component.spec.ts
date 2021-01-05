import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateSinhvienComponent } from './create-sinhvien.component';

describe('CreateSinhvienComponent', () => {
  let component: CreateSinhvienComponent;
  let fixture: ComponentFixture<CreateSinhvienComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateSinhvienComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateSinhvienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
