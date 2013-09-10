package com.jcsm.pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

public class DuckTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	
	@Test
	public void testDuck_shouldExistMallardDuck() {
		MallardDuck mallardDuck = new MallardDuck();
		assertNotNull(mallardDuck);
	}
	
	@Test
	public void testDuck_shouldMallardDuckCanDisplayDescription() {
		MallardDuck mallardDuck = new MallardDuck();
		assertEquals("I'm a Mallard Duck!", mallardDuck.getDisplay());
	}
	
	@Test
	public void testDuck_shouldMallardDuckCanShowDisplayDescription() {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		assertEquals("I'm a Mallard Duck!", log.getLog());
	}
	
	@Test
	public void testDuck_shouldExistRedheadDuck() {
		RedheadDuck redheadDuck = new RedheadDuck();
		assertNotNull(redheadDuck);
	}
	
	@Test
	public void testDuck_shouldRedheadDuckCanDisplayDescription() {
		RedheadDuck redheadDuck = new RedheadDuck();
		assertEquals("I'm a Redhead Duck!", redheadDuck.getDisplay());
	}
	
	@Test
	public void testDuck_shouldRedheadDuckCanShowDisplayDescription() {
		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		assertEquals("I'm a Redhead Duck!", log.getLog());
	}
	
	@Test
	public void testDuck_shouldMallardDuckFly() {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		assertEquals("I'm flying!\n", log.getLog());
	}
	
	@Test
	public void testDuck_shouldRedheadDuckFly() {
		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.performFly();
		assertEquals("I'm flying!\n", log.getLog());
	}
	
	@Test
	public void testDuck_shouldMallardDuckSwim() {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performSwim();
		assertEquals("I'm swimming!\n", log.getLog());
	}
	
	@Test
	public void testDuck_shouldRedheadDuckSwim() {
		RedheadDuck redheadDuck = new RedheadDuck();
		redheadDuck.performSwim();
		assertEquals("I'm swimming!\n", log.getLog());
	}
	
	
	
	

}
