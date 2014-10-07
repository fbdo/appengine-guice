package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PlaceType {

    ACCOUNTING("accounting"),
    AIRPORT("airport"),
    AMUSEMENT_TYPE("amusement_park"),
    AQUARIUM("aquarium"),
    ART_GALERY("art_galery"),
    ATM("atm"),
    BAKERY("bakery"),
    BANK("bank"),
    BAR("bar"),
    BEAUTY_SALON("beauty_salon"),
    BICYCLE_STORE("bicycle_store"),
    BOOK_STORE("book_store"),
    BOWLING_ALLEY("bowling_alley"),
    BUS_STATION("bus_station"),
    CAFE("cafe"),
    CAMPGROUND("campground"),
    CAR_DEALER("car_dealer"),
    CAR_RENTAL("car_rental"),
    CAR_REPAIR("car_repair"),
    CAR_WASH("car_wash"),
    CASINO("casino"),
    CEMETERY("cemetery"),
    CHURCH("church"),
    CITY_HALL("city_hall"),
    CLOTHING_STORE("clothing_store"),
    CONVENIENCE_STORE("convenience_store"),
    COURTHOUSE("courthouse"),
    DENTIST("dentist"),
    DEPARTMENT_STORE("department_store"),
    DOCTOR("doctor"),
    ELECTRICIAN("electrician"),
    ELECTRONICS_STORE("electronics_store"),
    EMBASSY("embassy"),
    ESTABLISHMENT("establishment"),
    FINANCE("finance"),
    FIRE_STATION("fire_station"),
    FLORIST("florist"),
    FOOD("food"),
    FUNERAL_HOME("funeral_home"),
    FURNITURE_STORE("furniture_store"),
    GAS_STATION("gas_station"),
    GENERAL_CONTRACTOR("general_contractor"),
    GROCERY_OR_SUPERMARKET("grocery_or_supermarket"),
    GYM("gym"),
    HAIR_CARE("hair_care"),
    HARDWARE_STORE("hardware_store"),
    HEALTH("health"),
    HINDU_TEMPLE("hindu_temple"),
    HOME_GOODS_STORE("home_goods_store"),
    HOSPITAL("hospital"),
    INSURANCE_AGENCY("insurance_agency"),
    JEWELRY_STORE("jewelry_store"),
    LAUNDRY("laundry"),
    LAWYER("lawyer"),
    LIBRARY("library"),
    LIQUOR_STORE("liquor_store"),
    LOCAL_GOVERNMENT_OFFICE("local_government_office"),
    LOCKSMITH("locksmith"),
    LODGING("lodging"),
    MEAL_DELIVERY("meal_delivery"),
    MEAL_TAKEAWAY("meal_takeaway"),
    MOSQUE("mosque"),
    MOVIE_RENTAL("movie_rental"),
    MOVIE_THEATER("movie_theater"),
    MOVING_COMPANY("moving_company"),
    MUSEUM("museum"),
    NIGHT_CLUB("night_club"),
    PAINTER("painter"),
    PARK("park"),
    PARKING("parking"),
    PET_STORE("pet_store"),
    PHARMACY("pharmacy"),
    PHYSIOTHERAPIST("physiotherapist"),
    PLACE_OF_WORSHIP("place_of_worship"),
    PLUMBER("plumber"),
    POLICE("police"),
    POST_OFFICE("post_office"),
    REAL_STATE_AGENCY("real_estate_agency"),
    RESTAURANT("restaurant"),
    ROOFING_CONTRACTOR("roofing_contractor"),
    RV_PARK("rv_park"),
    SCHOOL("school"),
    SHOE_STORE("shoe_store"),
    SHOPPING_MALL("shopping_mall"),
    SPA("spa"),
    STADIUM("stadium"),
    STORAGE("storage"),
    STORE("store"),
    SUBWAY_STATION("subway_station"),
    SYNAGOGUE("synagogue"),
    TAXI_STAND("taxi_stand"),
    TRAIN_STATION("train_station"),
    TRAVEL_AGENCY("travel_agency"),
    UNIVERSITY("university"),
    VETERINARY_CARE("veterinary_care"),
    ZOO("zoo"),
    ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
    ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
    ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
    COLOQUIAL_AREA("colloquial_area"),
    COUNTRY("country"),
    FLOOR("floor"),
    GEOCODE("geocode"),
    INTERSECTION("intersection"),
    LOCALITY("locality"),
    NATURAL_FEATURE("natural_feature"),
    NEIGHBORHOOD("neighborhood"),
    POLITICAL("political"),
    POINT_OF_INTEREST("point_of_interest"),
    POST_BOX("post_box"),
    POSTAL_CODE("postal_code"),
    POSTAL_CODE_PREFIX("postal_code_prefix"),
    POSTAL_TOWN("postal_town"),
    PREMISE("premise"),
    room("room"),
    ROUTE("route"),
    STREET_ADDRESS("street_address"),
    STREET_NUMBER("street_number"),
    SUBLOCALITY("sublocality"),
    SUBLOCALITY_LEVEL_4("sublocality_level_4"),
    SUBLOCALITY_LEVEL_5("sublocality_level_5"),
    SUBLOCALITY_LEVEL_3("sublocality_level_3"),
    SUBLOCALITY_LEVEL_2("sublocality_level_2"),
    SUBLOCALITY_LEVEL_1("sublocality_level_1"),
    SUBPREMISE("subpremise"),
    TRANSIT_STATION("transit_station");

    private String value;

    private PlaceType(String v) {
        this.value = v;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @JsonCreator
    public static PlaceType fromValue(String value) {
        for (PlaceType c : PlaceType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }


}
