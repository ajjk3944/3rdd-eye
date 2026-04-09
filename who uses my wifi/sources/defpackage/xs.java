package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class xs implements Parcelable {
    public static final Parcelable.Creator<xs> CREATOR = new k2(7);
    public float f;
    public Parcelable g = null;
    public float h;

    public xs(float f, float f2) {
        this.f = f2;
        this.h = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.h + " y: " + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.f);
        if (this.g == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.g, i);
        }
    }
}
