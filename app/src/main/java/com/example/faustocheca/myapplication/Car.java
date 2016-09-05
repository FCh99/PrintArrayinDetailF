package com.example.faustocheca.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by faustocheca on 25/4/16.
 */
public class Car implements Parcelable {

    String marca;
    int kms;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", kms=" + kms +
                '}';
    }

    public static Creator<Car> getCREATOR() {
        return CREATOR;
    }

    public Car(String marca, int kms) {

        this.marca = marca;
        this.kms = kms;
    }

    protected Car(Parcel in) {
        marca = in.readString();
        kms = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(marca);
        dest.writeInt(kms);
    }



    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };
}