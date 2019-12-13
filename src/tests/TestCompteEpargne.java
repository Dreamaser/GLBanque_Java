package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myPackage.CompteEpargne;

class TestCompteEpargne
{
	@Test
	void testConstructeur()
	{
		CompteEpargne compte = new CompteEpargne();
		assertEquals(0, compte.getSolde());
	}

	@Test
	void testAddMoney()
	{
		CompteEpargne compte = new CompteEpargne();
		compte.addMoney(50);
		
		assertEquals(50, compte.getSolde());
	}
	
	@Test
	void testRemunererSolde()
	{
		CompteEpargne compte = new CompteEpargne();
		
		compte.addMoney(100);
		compte.remunererSolde(15.2);
		
		assertEquals(115.2, compte.getSolde());
	}
}
