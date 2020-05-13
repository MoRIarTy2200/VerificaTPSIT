import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SarcinellaTest {

	@Test
	void Test1() {
		SarcinellaClass s=new SarcinellaClass();
		
		assertEquals(2187,s.cognomeMet(3, 7));

		
	}
	
	@Test
	void Test2() {
		SarcinellaClass s=new SarcinellaClass();
		
		assertEquals(0,s.cognomeMet(0, 1));
	}
	
	@Test
	void Test3() {
		SarcinellaClass s=new SarcinellaClass();
		
		assertEquals(0,s.cognomeMet(0, 0));
	}

}
