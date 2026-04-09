package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class Model implements Parcelable {
    public static final Parcelable.Creator<Model> CREATOR = new a();
    private int id;
    private String name;
    private String pack;

    public class a implements Parcelable.Creator<Model> {
        @Override // android.os.Parcelable.Creator
        public final Model createFromParcel(Parcel parcel) {
            return new Model(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Model[] newArray(int i) {
            return new Model[i];
        }
    }

    public Model() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPack() {
        return this.pack;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPack(String str) {
        this.pack = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }

    public Model(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
    }
}
