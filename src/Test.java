import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Test {
	private int num;
	private int resul;

	public Test(int numel, int resul) {
		this.num = numel;
		this.resul = resul;
	}

	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][]{ 
		{-1,-1},{2,-1},{0,1},{1,1},{3,6},{5,120},{25,2076180480},{31,738197504},{32,-1}});
	}

	@org.junit.Test
	public void testFactorial() {
		Codigo2 cod2 = new Codigo2();
		int resultado = cod2.factorial(num);
		assertEquals(resul, resultado);
		
	}
}