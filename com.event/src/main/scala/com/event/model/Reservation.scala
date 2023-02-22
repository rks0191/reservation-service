package com.event.model

case class Address(firstLine:String,secondLine:Option[String],pincode:Int)

case class Hotel(hotelId:String,hotelName:String,hotelAddress:Address)

case class ReservationAdded(reservationId:String)

case class ReservationRemoved(reservationId:String)

case class RoomAdded(roomNumber:String)

case class RoomRemoved(roomNumber:String)

case class HotelAdded(hotelId:String,hotel:Hotel)

case class HotelRemoved(hotelId:String)
