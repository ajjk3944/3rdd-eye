package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Entry extends g3.a implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    public float f9446d;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Entry[] newArray(int i10) {
            return new Entry[i10];
        }
    }

    public Entry(Parcel parcel) {
        this.f9446d = 0.0f;
        this.f9446d = parcel.readFloat();
        h(parcel.readFloat());
        if (parcel.readInt() == 1) {
            g(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Entry, x: " + this.f9446d + " y: " + e();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f9446d);
        parcel.writeFloat(e());
        if (c() == null) {
            parcel.writeInt(0);
        } else {
            if (!(c() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) c(), i10);
        }
    }
}
