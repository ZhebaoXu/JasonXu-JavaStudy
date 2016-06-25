package com.jasonxu.fantype.FanTypeFunction;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by t_xuz on 6/25/16.
 */
public class xuliehua implements Parcelable {

    private int A;
    private int B;
    private float C;
    private String D;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.A);
        dest.writeInt(this.B);
        dest.writeFloat(this.C);
        dest.writeString(this.D);
    }

    public xuliehua() {
    }

    protected xuliehua(Parcel in) {
        this.A = in.readInt();
        this.B = in.readInt();
        this.C = in.readFloat();
        this.D = in.readString();
    }

    public static final Parcelable.Creator<xuliehua> CREATOR = new Parcelable.Creator<xuliehua>() {
        @Override
        public xuliehua createFromParcel(Parcel source) {
            return new xuliehua(source);
        }

        @Override
        public xuliehua[] newArray(int size) {
            return new xuliehua[size];
        }
    };
}
