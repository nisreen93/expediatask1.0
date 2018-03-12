package com.expedia.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.expedia.domain.Hotel;
import com.expedia.util.ApiUtil;
import com.expedia.util.Loggers;


public class TestAPI {

	//This is too much simple sample about test cases 
	
	ApiUtil apiUtil = new ApiUtil();
	@Test
	public void testMinTripStartDate() {
		Loggers.sysUserEventInfo.info("Test case: testMinTripStartDate");
		Hotel minOfferStartDate = ApiUtil.root.getOffers().getHotel().get(2);
		Loggers.sysUserEventInfo.info("Is: "+minOfferStartDate.toString()+"a MinTripStartDate: ");
		assertEquals(apiUtil.getMinTripStartDate() , minOfferStartDate);
	}
	
	@Test
	public void testMaxTripStartDate() {
		Loggers.sysUserEventInfo.info("Test case: testMaxTripStartDate");
		Hotel maxOfferStartDate = ApiUtil.root.getOffers().getHotel().get(4);
		Loggers.sysUserEventInfo.info("Is: "+maxOfferStartDate.toString()+"a MaxTripStartDate: ");
		assertEquals(apiUtil.getMaxTripStartDate() , maxOfferStartDate);
	}
	
	@Test
	public void testMinStarRating() {
		Loggers.sysUserEventInfo.info("Test case: testMinStarRating");
		Hotel minOfferStarRating = ApiUtil.root.getOffers().getHotel().get(4);
		Loggers.sysUserEventInfo.info("Is: "+minOfferStarRating.toString()+"a MinStarRating: ");
		assertEquals(apiUtil.getMinStarRating() , minOfferStarRating);
	}

	@Test
	public void testMaxStarRating() {
		Loggers.sysUserEventInfo.info("Test case: testMaxStarRating");
		Hotel maxOfferStarRating = ApiUtil.root.getOffers().getHotel().get(3);
		Loggers.sysUserEventInfo.info("Is: "+maxOfferStarRating.toString()+"a MaxStarRating: ");
		assertEquals(apiUtil.getMaxStarRating() , maxOfferStarRating);
	}
	
	/*@Test
	public void testMinTotalRate() {
		Loggers.sysUserEventInfo.info("Test case: testMinTotalRate");
		Hotel minOfferTotalRate = ApiUtil.root.getOffers().getHotel().get(2);
		Loggers.sysUserEventInfo.info("Is: "+minOfferTotalRate.toString()+"a MinTotalRate: ");
		assertEquals(ApiUtil.getMinTotalRate() , minOfferTotalRate);
	}
	
	@Test
	public void testMaxTotalRate() {
		Loggers.sysUserEventInfo.info("Test case: testMaxTotalRate");
		Hotel maxOfferTotalRate = ApiUtil.root.getOffers().getHotel().get(4);
		Loggers.sysUserEventInfo.info("Is: "+maxOfferTotalRate.toString()+"a MaxTotalRate: ");
		assertEquals(ApiUtil.getMaxTotalRate() , maxOfferTotalRate);
	}*/
	
	@Test
	public void testMinGuestRating() {
		Loggers.sysUserEventInfo.info("Test case: testMinGuestRating");
		Hotel minOfferGuestRating = ApiUtil.root.getOffers().getHotel().get(2);
		Loggers.sysUserEventInfo.info("Is: "+minOfferGuestRating.toString()+"a MinGuestRating: ");
		assertEquals(apiUtil.getMinGuestRating() , minOfferGuestRating);
	}
	
	@Test
	public void testMaxGuestRating() {
		Loggers.sysUserEventInfo.info("Test case: testMaxGuestRating");
		Hotel maxOfferGuestRating = ApiUtil.root.getOffers().getHotel().get(3);
		Loggers.sysUserEventInfo.info("Is: "+maxOfferGuestRating.toString()+"a MaxGuestRating: ");
		assertEquals(apiUtil.getMaxGuestRating() , maxOfferGuestRating);
	}
}
