package com.android.airbnb.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MDY on 2017-08-03.
 */

public class RoomsData implements Parcelable
{
    private Host host;

    private String cleaning_fee;

    private Amenities[] amenities;

    private String modified_date;

    private String guest_access;

    private String bathrooms;

    private String introduce;

    private String bedrooms;

    private String room_type;

    private String weekly_discount;

    private String title;

    private String beds;

    private String create_date;

    private String extra_people_fee;

    private String address;

    private String accommodates;

    public House_images[] house_images;

    private String longitude;

    private String latitude;

    private String price_per_day;

    private String pk;

    private String space_info;

    protected RoomsData(Parcel in) {
        house_images = in.createTypedArray(House_images.CREATOR);
        amenities = in.createTypedArray(Amenities.CREATOR);
        cleaning_fee = in.readString();
        modified_date = in.readString();
        guest_access = in.readString();
        bathrooms = in.readString();
        introduce = in.readString();
        bedrooms = in.readString();
        room_type = in.readString();
        weekly_discount = in.readString();
        title = in.readString();
        beds = in.readString();
        create_date = in.readString();
        extra_people_fee = in.readString();
        address = in.readString();
        accommodates = in.readString();
        longitude = in.readString();
        latitude = in.readString();
        price_per_day = in.readString();
        pk = in.readString();
        space_info = in.readString();
    }

    public static final Creator<RoomsData> CREATOR = new Creator<RoomsData>() {
        @Override
        public RoomsData createFromParcel(Parcel in) {
            return new RoomsData(in);
        }

        @Override
        public RoomsData[] newArray(int size) {
            return new RoomsData[size];
        }
    };

    public Host getHost ()
    {
        return host;
    }

    public void setHost (Host host)
    {
        this.host = host;
    }

    public String getCleaning_fee ()
    {
        return cleaning_fee;
    }

    public void setCleaning_fee (String cleaning_fee)
    {
        this.cleaning_fee = cleaning_fee;
    }

    public Amenities[] getAmenities ()
    {
        return amenities;
    }

    public void setAmenities (Amenities[] amenities)
    {
        this.amenities = amenities;
    }

    public String getModified_date ()
    {
        return modified_date;
    }

    public void setModified_date (String modified_date)
    {
        this.modified_date = modified_date;
    }

    public String getGuest_access ()
    {
        return guest_access;
    }

    public void setGuest_access (String guest_access)
    {
        this.guest_access = guest_access;
    }

    public String getBathrooms ()
    {
        return bathrooms;
    }

    public void setBathrooms (String bathrooms)
    {
        this.bathrooms = bathrooms;
    }

    public String getIntroduce ()
    {
        return introduce;
    }

    public void setIntroduce (String introduce)
    {
        this.introduce = introduce;
    }

    public String getBedrooms ()
    {
        return bedrooms;
    }

    public void setBedrooms (String bedrooms)
    {
        this.bedrooms = bedrooms;
    }

    public String getRoom_type ()
    {
        return room_type;
    }

    public void setRoom_type (String room_type)
    {
        this.room_type = room_type;
    }

    public String getWeekly_discount ()
    {
        return weekly_discount;
    }

    public void setWeekly_discount (String weekly_discount)
    {
        this.weekly_discount = weekly_discount;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBeds ()
    {
        return beds;
    }

    public void setBeds (String beds)
    {
        this.beds = beds;
    }

    public String getCreate_date ()
    {
        return create_date;
    }

    public void setCreate_date (String create_date)
    {
        this.create_date = create_date;
    }

    public String getExtra_people_fee ()
    {
        return extra_people_fee;
    }

    public void setExtra_people_fee (String extra_people_fee)
    {
        this.extra_people_fee = extra_people_fee;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getAccommodates ()
    {
        return accommodates;
    }

    public void setAccommodates (String accommodates)
    {
        this.accommodates = accommodates;
    }

    public House_images[] getHouse_images ()
    {
        return house_images;
    }

    public void setHouse_images (House_images[] house_images)
    {
        this.house_images = house_images;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getPrice_per_day ()
    {
        return price_per_day;
    }

    public void setPrice_per_day (String price_per_day)
    {
        this.price_per_day = price_per_day;
    }

    public String getPk ()
    {
        return pk;
    }

    public void setPk (String pk)
    {
        this.pk = pk;
    }

    public String getSpace_info ()
    {
        return space_info;
    }

    public void setSpace_info (String space_info)
    {
        this.space_info = space_info;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [host = "+host+", cleaning_fee = "+cleaning_fee+", amenities = "+amenities+", modified_date = "+modified_date+", guest_access = "+guest_access+", bathrooms = "+bathrooms+", introduce = "+introduce+", bedrooms = "+bedrooms+", room_type = "+room_type+", weekly_discount = "+weekly_discount+", title = "+title+", beds = "+beds+", create_date = "+create_date+", extra_people_fee = "+extra_people_fee+", address = "+address+", accommodates = "+accommodates+", house_images = "+house_images+", longitude = "+longitude+", latitude = "+latitude+", price_per_day = "+price_per_day+", pk = "+pk+", space_info = "+space_info+"]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(house_images, 0);
        dest.writeTypedArray(amenities, 0);
        dest.writeString(cleaning_fee);
        dest.writeString(modified_date);
        dest.writeString(guest_access);
        dest.writeString(bathrooms);
        dest.writeString(introduce);
        dest.writeString(bedrooms);
        dest.writeString(room_type);
        dest.writeString(weekly_discount);
        dest.writeString(title);
        dest.writeString(beds);
        dest.writeString(create_date);
        dest.writeString(extra_people_fee);
        dest.writeString(address);
        dest.writeString(accommodates);
        dest.writeString(longitude);
        dest.writeString(latitude);
        dest.writeString(price_per_day);
        dest.writeString(pk);
        dest.writeString(space_info);
    }
}