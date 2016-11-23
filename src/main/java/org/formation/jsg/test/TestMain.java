package org.formation.jsg.test;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.formation.jsf.model.Student;
import org.formation.jsf.service.IStudentService;
import org.formation.jsf.service.StudentService;

public class TestMain {

	public static void main(String[] args) throws Exception {
		IStudentService stuServ = new StudentService();
		Student stu= stuServ.getStudent(1);
		System.out.println(stu);
		stuServ.deleteStudent(1);
		}

}
