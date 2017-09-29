package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import server.logic.tables.ItemTable;

public class TestItemTable {
	
	ItemTable itemTable1;
	ItemTable itemTable2;

	@Before
	public void setUp() throws Exception {
		
		itemTable1 = new ItemTable();
		itemTable2 = new ItemTable();
	}

	@Test
	public void test() {
		
		//Test constructor
		assertNotNull(new ItemTable());
		assertNotNull(itemTable1);
		
		//test getInstance function
		assertEquals(itemTable1.getInstance(), itemTable2.getInstance());
		assertEquals(ItemTable.getInstance(), ItemTable.getInstance());
		
		

	}

}