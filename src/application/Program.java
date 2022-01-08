package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Test 1: Seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== Test 2: Seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for(Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== Test 3: Seller findAll =====");
		sellerList = sellerDao.findAll();
		for(Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\n===== Test 4: Insert Seller =====");
		Seller newSeller = new Seller(null, "Gregory Orange", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n===== Test 5: Update Seller =====");
		seller = sellerDao.findById(1);
		seller.setName("Robert Brown");
		sellerDao.update(seller);
		System.out.println("Updated!");
		
		System.out.println("\n===== Test 6: Delete Seller =====");
		sellerDao.deleteById(10);
		System.out.println("Deleted!");
		*/
		
		System.out.println("\n===== Test 7: Department findById =====");
		department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n===== Test 8: Department findAll =====");
		List<Department> departmentList = departmentDao.findAll();
		for (Department obj : departmentList) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\n===== Test 9: Department insert =====");
		Department newDepartment = new Department(null, "D1");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted!");
		departmentList = departmentDao.findAll();
		for (Department obj : departmentList) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== Test 10: Department update =====");
		department = departmentDao.findById(7);
		department.setName("Sports");
		departmentDao.update(department);
		System.out.println("Department updated!");
		departmentList = departmentDao.findAll();
		for (Department obj : departmentList) {
			System.out.println(obj);
		}
		*/
		
		System.out.println("\n===== Test 11: Department deleteById =====");
		departmentDao.deleteById(6);
		System.out.println("Department deleted!");
	}
}
