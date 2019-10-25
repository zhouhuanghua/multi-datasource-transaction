package cn.zhh;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
public class MultiDatasourceTransactionApplicationTests {

    @Test
    public void contextLoads() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        /*for (Integer integer : stack) {
			System.out.println(integer);
		}*/
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
