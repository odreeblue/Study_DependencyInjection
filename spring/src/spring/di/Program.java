package spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스프링에게 지시하는 방법으로 코드를 변경
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		//
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		System.out.println("main file1");
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		System.out.println("main file2");
		ExamConsole console = (ExamConsole)(context.getBean("console"));
		//ExamConsole console = context.getBean(ExamConsole.class);
		
		
		console.print();
		
		
		
		
		
		/**
		 * 소스 코드 변경이 없이도 Inline과 Grid를 바꿔 끼울 수 있음 --> 스프링이 해줌
		 */
		
		
		
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>)context.getBean("exams");
//		//exams.add(new NewlecExam(1,1,1,1));
//		for(Exam e:exams)
//			System.out.println(e);

	}

}
