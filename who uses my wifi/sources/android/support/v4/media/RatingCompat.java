package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k2;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new k2(29);
    public final int f;
    public final float g;

    public RatingCompat(int i, float f) {
        this.f = i;
        this.g = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f);
        sb.append(" rating=");
        float f = this.g;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeFloat(this.g);
    }
}
