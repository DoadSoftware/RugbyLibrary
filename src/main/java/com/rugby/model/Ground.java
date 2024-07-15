package com.rugby.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Grounds")
public class Ground {

  @Override
	public String toString() {
		return "Ground [groundId=" + groundId + ", fullname=" + fullname + ", shortname=" + shortname + ", city=" + city
				+ ", country=" + country + ", first_bowling_end=" + first_bowling_end + ", second_bowling_end="
				+ second_bowling_end + ", dimension_two_o_clock=" + dimension_two_o_clock + ", dimension_three_o_clock="
				+ dimension_three_o_clock + ", dimension_five_o_clock=" + dimension_five_o_clock
				+ ", dimension_six_o_clock=" + dimension_six_o_clock + ", dimension_seven_o_clock="
				+ dimension_seven_o_clock + ", dimension_nine_o_clock=" + dimension_nine_o_clock
				+ ", dimension_ten_o_clock=" + dimension_ten_o_clock + ", dimension_twelve_o_clock="
				+ dimension_twelve_o_clock + ", dimension_unit=" + dimension_unit + "]";
	}

public int getGroundId() {
		return groundId;
	}

	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirst_bowling_end() {
		return first_bowling_end;
	}

	public void setFirst_bowling_end(String first_bowling_end) {
		this.first_bowling_end = first_bowling_end;
	}

	public String getSecond_bowling_end() {
		return second_bowling_end;
	}

	public void setSecond_bowling_end(String second_bowling_end) {
		this.second_bowling_end = second_bowling_end;
	}

	public Integer getDimension_two_o_clock() {
		return dimension_two_o_clock;
	}

	public void setDimension_two_o_clock(Integer dimension_two_o_clock) {
		this.dimension_two_o_clock = dimension_two_o_clock;
	}

	public Integer getDimension_three_o_clock() {
		return dimension_three_o_clock;
	}

	public void setDimension_three_o_clock(Integer dimension_three_o_clock) {
		this.dimension_three_o_clock = dimension_three_o_clock;
	}

	public Integer getDimension_five_o_clock() {
		return dimension_five_o_clock;
	}

	public void setDimension_five_o_clock(Integer dimension_five_o_clock) {
		this.dimension_five_o_clock = dimension_five_o_clock;
	}

	public Integer getDimension_six_o_clock() {
		return dimension_six_o_clock;
	}

	public void setDimension_six_o_clock(Integer dimension_six_o_clock) {
		this.dimension_six_o_clock = dimension_six_o_clock;
	}

	public Integer getDimension_seven_o_clock() {
		return dimension_seven_o_clock;
	}

	public void setDimension_seven_o_clock(Integer dimension_seven_o_clock) {
		this.dimension_seven_o_clock = dimension_seven_o_clock;
	}

	public Integer getDimension_nine_o_clock() {
		return dimension_nine_o_clock;
	}

	public void setDimension_nine_o_clock(Integer dimension_nine_o_clock) {
		this.dimension_nine_o_clock = dimension_nine_o_clock;
	}

	public Integer getDimension_ten_o_clock() {
		return dimension_ten_o_clock;
	}

	public void setDimension_ten_o_clock(Integer dimension_ten_o_clock) {
		this.dimension_ten_o_clock = dimension_ten_o_clock;
	}

	public Integer getDimension_twelve_o_clock() {
		return dimension_twelve_o_clock;
	}

	public void setDimension_twelve_o_clock(Integer dimension_twelve_o_clock) {
		this.dimension_twelve_o_clock = dimension_twelve_o_clock;
	}

	public String getDimension_unit() {
		return dimension_unit;
	}

	public void setDimension_unit(String dimension_unit) {
		this.dimension_unit = dimension_unit;
	}

@Id
  @Column(name = "GroundId")
  private int groundId;
	
  @Column(name = "FullName")
  private String fullname;

  @Column(name = "Shortname")
  private String shortname;

  @Column(name = "City")
  private String city;

  @Column(name = "Country")
  private String country;

  @Column(name = "FirstBowlingEnd")
  private String first_bowling_end;

  @Column(name = "SecondBowlingEnd")
  private String second_bowling_end;
  
  @Column(name = "DimensionTwoOClock")
  private Integer dimension_two_o_clock;

  @Column(name = "DimensionThreeOClock")
  private Integer dimension_three_o_clock;

  @Column(name = "DimensionFiveOClock")
  private Integer dimension_five_o_clock;

  @Column(name = "DimensionSixOClock")
  private Integer dimension_six_o_clock;

  @Column(name = "DimensionSevenOClock")
  private Integer dimension_seven_o_clock;

  @Column(name = "DimensionNineOClock")
  private Integer dimension_nine_o_clock;

  @Column(name = "DimensionTenOClock")
  private Integer dimension_ten_o_clock;

  @Column(name = "DimensionTwelveOClock")
  private Integer dimension_twelve_o_clock;

  @Column(name = "DimensionUnit")
  private String dimension_unit;

}