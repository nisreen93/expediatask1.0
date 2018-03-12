package com.expedia.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import com.expedia.domain.Destination;
import com.expedia.domain.GeneralResponse;
import com.expedia.domain.Hotel;
import com.expedia.domain.HotelInfo;
import com.expedia.domain.HotelPricingInfo;
import com.expedia.domain.HotelUrls;
import com.expedia.domain.OfferDateRange;
import com.expedia.domain.OfferInfo;
import com.expedia.domain.Offers;
import com.expedia.domain.Persona;
import com.expedia.domain.Root;
import com.expedia.domain.UserInfo;

public class ApiUtil {

	public static Root root;
	public ApiUtil(){generateRoot();}
	public static Root generateRoot() {
		root = new Root();
		root.setUserInfo(new UserInfo(new Persona("OTHERS"), "foo"));
		root.setOfferInfo(new OfferInfo("1", "en_US", "USD", "USD"));

		List<Hotel> hotels = new ArrayList<Hotel>();
		Hotel hotel1 = new Hotel(new OfferDateRange(Arrays.asList(2018, 3, 8), Arrays.asList(2018, 3, 11), 3),
				new Destination("178286", "178286", "Miami (and vicinity), Florida, United States of America", "Miami",
						"United States of America", "Florida", "Miami", "FLL", "Miami"),
				new HotelInfo("10980182", "Ocean Reserve OceanView Sunny Isles Luxury Condos",
						"Ocean Reserve OceanView Sunny Isles Luxury Condos", "Sunny Isles Beach", "10405",
						"Sunny Isles Beach,FL,USA", "19370-19390 Collins Avenue", "Sunny Isles Beach", "FL", "USA",
						25.954882, -80.120415, "4.0", 2.64, 28,
						"https://images.trvl-media.com/hotels/11000000/10990000/10980200/10980182/10980182_143_t.jpg",
						false, false),
				new HotelPricingInfo(186.82, 560.46, 783.07, 783.07, "USD", 76.14, false),
				new HotelUrls("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F10980182%2F2018-03-08%2F2018-03-11",
						"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-03-08%2F2018-03-11%3FSearchType%3DDestination%26CityName%3DSunny+Isles+Beach%26RegionId%3D178286%26Selected%3D10980182"));

		Hotel hotel2 = new Hotel(new OfferDateRange(Arrays.asList(2018, 3, 21), Arrays.asList(2018, 3, 22), 1),
				new Destination("178276", "178276", "Las Vegas (and vicinity), Nevada, United States of America",
						"Las Vegas", "United States of America", "Nevada", "Las Vegas", "LAS", "Las Vegas"),
				new HotelInfo("8753178", "The LINQ Hotel & Casino", "The LINQ Hotel & Casino", "Las Vegas", "2008",
						"Las Vegas,NV,USA", "3535 Las Vegas Blvd South", "Las Vegas", "NV", "USA", 36.117607,
						-115.172806, "4.0", 3.81, 8744,
						"https://images.trvl-media.com/hotels/9000000/8760000/8753200/8753178/63fb68e8_t.jpg", false,
						false),
				new HotelPricingInfo(48.84, 48.84, 139, 139, "USD", 64.86, false),
				new HotelUrls("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F8753178%2F2018-03-21%2F2018-03-22",
						"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-03-21%2F2018-03-22%3FSearchType%3DDestination%26CityName%3DLas+Vegas%26RegionId%3D178276%26Selected%3D8753178"));

		Hotel hotel3 = new Hotel(new OfferDateRange(Arrays.asList(2018, 4, 6), Arrays.asList(2018, 4, 10), 4),
				new Destination("178294", "178294", "Orlando (and vicinity), Florida, United States of America",
						"Orlando", "United States of America", "Florida", "Orlando", "ORL", "Orlando"),
				new HotelInfo("22474881", "Axis West Orlando by Nuovo", "Axis West Orlando by Nuovo", "Orlando", "2693",
						"Orlando,FL,USA", "6820 Axis West Circle", "Orlando", "FL", "USA", 28.406845, -81.47654, "4.0",
						0, 0, "https://images.trvl-media.com/hotels/23000000/22480000/22474900/22474881/90e3903c_t.jpg",
						false, false),
				new HotelPricingInfo(103.5, 414, 272.25, 272.25, "USD", 61.98, false),
				new HotelUrls("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F22474881%2F2018-04-06%2F2018-04-10",
						"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-04-06%2F2018-04-10%3FSearchType%3DDestination%26CityName%3DOrlando%26RegionId%3D178294%26Selected%3D22474881"));

		Hotel hotel4 = new Hotel(new OfferDateRange(Arrays.asList(2018, 4, 6), Arrays.asList(2018, 6, 8), 4),
				new Destination("178293", "178293", "New York (and vicinity), New York, United States of America",
						"New York", "United States of America", "New York", "New York", "NYC", "New York"),
				new HotelInfo("23855", "The Peninsula New York", "The Peninsula New York", "New York", "2621",
						"New York,NY,USA", "700 Fifth Avenue at 55th street", "New York", "NY", "USA", 40.76165,
						-73.9749, "5.0", 4.73, 1186,
						"https://images.trvl-media.com/hotels/1000000/30000/23900/23855/67899a5d_t.jpg", true, false),
				new HotelPricingInfo(545.28, 2181.12, 1355.75, 1355.75, "USD", 59.78, false),
				new HotelUrls("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F23855%2F2018-06-04%2F2018-06-08",
						"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-06-04%2F2018-06-08%3FSearchType%3DDestination%26CityName%3DNew+York%26RegionId%3D178293%26Selected%3D23855"));

		Hotel hotel5 = new Hotel(new OfferDateRange(Arrays.asList(2018, 5, 14), Arrays.asList(2018, 5, 16), 2),
				new Destination("178280", "178280", "Los Angeles (and vicinity), California, United States Of America",
						"Los Angeles", "United States of America", "California", "Los Angeles", "QLA", "Los Angeles"),
				new HotelInfo("1180295", "Hollywood Inn Express South", "Hollywood Inn Express South", "Los Angeles",
						"2011", "Los Angeles,CA,USA", "141 N Alvarado St.", "Los Angeles", "CA", "USA", 34.067783,
						-118.26963, "2.0", 2.66, 1822,
						"https://images.trvl-media.com/hotels/2000000/1190000/1180300/1180295/1180295_19_t.jpg", false,
						false),
				new HotelPricingInfo(93.15, 186.3, 197.15, 197.15, "USD", 52.75, false),
				new HotelUrls("https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Finfo%2F1180295%2F2018-05-14%2F2018-05-16",
						"https%3A%2F%2Fwww.expedia.com%2Fgo%2Fhotel%2Fsearch%2FDestination%2F2018-05-14%2F2018-05-16%3FSearchType%3DDestination%26CityName%3DLos+Angeles%26RegionId%3D178280%26Selected%3D1180295"));

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		root.setOffers(new Offers(hotels));
		return root;
	}

	
	public static List<GeneralResponse> getLengthOfStay() {
		List<GeneralResponse> response = new ArrayList<GeneralResponse>();
		for (Hotel hotel : root.getOffers().getHotel()) {
			response.add(new GeneralResponse(hotel.getHotelInfo().getHotelName(),
					String.valueOf(hotel.getOfferDateRange().getLengthOfStay())));
		}
		return response;
	}

	public static Hotel getMinTripStartDate() {
		Hotel minStartDate = root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if (hotel.getOfferDateRange().getTravelStartDate().get(0) < minStartDate.getOfferDateRange()
					.getTravelStartDate().get(0)) {
				minStartDate = hotel;
			}else if(hotel.getOfferDateRange().getTravelStartDate().get(1) < minStartDate.getOfferDateRange()
					.getTravelStartDate().get(1)){
				minStartDate = hotel;
			}else if(hotel.getOfferDateRange().getTravelStartDate().get(2) < minStartDate.getOfferDateRange()
					.getTravelStartDate().get(2)){
				minStartDate = hotel;
			}
		}
		return minStartDate;
	}

	public static Hotel getMaxTripStartDate() {
		Hotel maxStartDate = root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if (hotel.getOfferDateRange().getTravelStartDate().get(0) > maxStartDate.getOfferDateRange()
					.getTravelStartDate().get(0)) {
				maxStartDate = hotel;
			}else if(hotel.getOfferDateRange().getTravelStartDate().get(1) > maxStartDate.getOfferDateRange()
					.getTravelStartDate().get(1)){
				maxStartDate = hotel;
			}else if(hotel.getOfferDateRange().getTravelStartDate().get(2) > maxStartDate.getOfferDateRange()
					.getTravelStartDate().get(2)){
				maxStartDate = hotel;
			}
		}
		return maxStartDate;
	}

	public static Hotel getMinStarRating() {
		Hotel minStarRatingHotel=root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if(Double.parseDouble(hotel.getHotelInfo().getHotelStarRating()) < Double.parseDouble(minStarRatingHotel.getHotelInfo().getHotelStarRating())){
				minStarRatingHotel = hotel;
			}
		}

		return minStarRatingHotel;
	}

	public static Hotel getMaxStarRating() {
		Hotel maxStarRatingHotel=root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if(Double.parseDouble(hotel.getHotelInfo().getHotelStarRating()) > Double.parseDouble(maxStarRatingHotel.getHotelInfo().getHotelStarRating())){
				maxStarRatingHotel = hotel;
			}
		}

		return maxStarRatingHotel;
	}

	public static Hotel getMinGuestRating() {
		Hotel minGuestRating=root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if(hotel.getHotelInfo().getHotelGuestReviewRating() < minGuestRating.getHotelInfo().getHotelGuestReviewRating()){
				minGuestRating = hotel;
			}
		}

		return minGuestRating;
	}
	
	public static Hotel getMaxGuestRating() {
		Hotel maxGuestRating=root.getOffers().getHotel().get(0);
		for (int i = 1; i < root.getOffers().getHotel().size(); i++) {
			Hotel hotel = root.getOffers().getHotel().get(i);
			if(hotel.getHotelInfo().getHotelGuestReviewRating() > maxGuestRating.getHotelInfo().getHotelGuestReviewRating()){
				maxGuestRating = hotel;
			}
		}

		return maxGuestRating;
	}
	
	public static List<GeneralResponse> getDestinationName() {
		return new ArrayList<GeneralResponse>();
	}

	
	public static Hotel getMinTotalRate() {
		return null;
	}

	public static Hotel getMaxTotalRate() {
		return null;
	}
}
