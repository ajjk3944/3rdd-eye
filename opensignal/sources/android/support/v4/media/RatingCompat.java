package android.support.v4.media;

import ac.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new l(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f893a;

    /* renamed from: d, reason: collision with root package name */
    public final float f894d;

    public RatingCompat(int i10, float f10) {
        this.f893a = i10;
        this.f894d = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f893a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f893a);
        sb2.append(" rating=");
        float f10 = this.f894d;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f893a);
        parcel.writeFloat(this.f894d);
    }
}
