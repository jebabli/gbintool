package fr.uvsq.doosa.gbintool


import org.junit.Test

class MainTest {
    @Test
	void  TestreturnHello() {
        Main main = new Main()
		assert main.returnHello()=='Hello'
    }
}