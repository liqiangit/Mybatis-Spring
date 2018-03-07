package com.isea533.mybatis.mapper;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.isea533.mybatis.model.Country;
import com.isea533.mybatis.test.BasicTest;

public class CountryMapperTest extends BasicTest{
@Resource
private CountryMapper countryMapper;
	@Test
	public void testSelectOne() {
		Country country=new Country();
		country.setId(1);
		Country c=countryMapper.selectOne(country);
        Assert.assertEquals(true, c!=null);
	}

	@Test
	public void testSelect() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}
//	delete from country where id=311;
//	select * from country where id=311;
//	Caused by: org.apache.ibatis.type.TypeException: Error setting null for parameter #2 with JdbcType OTHER . Try setting a different JdbcType for this parameter or a different jdbcTypeForNull configuration property. Cause: java.sql.SQLException: 无效的列类型: 1111
	@Test
	public void testInsert() {
		Country country=new Country();
		country.setId(311);
		country.setCountrycode("test");
//		country.setCountryname("test");
        Assert.assertEquals(1,countryMapper.insert(country));
	}
	@Test
	public void insertByXML() {
		Country country=new Country();
		country.setId(311);
		country.setCountrycode("test");
//		country.setCountryname("test");
        Assert.assertEquals(1,countryMapper.insertByXML(country));
	}
	@Test
	public void insertByXML2() {
		Country country=new Country();
		country.setId(311);
		country.setCountrycode("test");
//		country.setCountryname("test");
        Assert.assertEquals(1,countryMapper.insertByXML2(country));
	}	
	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		Country country=new Country();
		country.setId(311);
		country.setCountrycode("test");
//		country.setCountryname("test");
        Assert.assertEquals(1,countryMapper.updateByPrimaryKey(country));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExampleAndRowBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByRowBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertList() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertUseGeneratedKeys() {
		fail("Not yet implemented");
	}

}
