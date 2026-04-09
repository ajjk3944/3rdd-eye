package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f900a;

    /* renamed from: d, reason: collision with root package name */
    public int f901d;

    /* renamed from: g, reason: collision with root package name */
    public int f902g;

    /* renamed from: r, reason: collision with root package name */
    public int f903r;

    /* renamed from: x, reason: collision with root package name */
    public int f904x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f900a);
        parcel.writeInt(this.f902g);
        parcel.writeInt(this.f903r);
        parcel.writeInt(this.f904x);
        parcel.writeInt(this.f901d);
    }
}
