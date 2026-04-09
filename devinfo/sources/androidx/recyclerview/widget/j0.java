package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new i0(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1417a;

    /* renamed from: b, reason: collision with root package name */
    public int f1418b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1419c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1417a);
        parcel.writeInt(this.f1418b);
        parcel.writeInt(this.f1419c ? 1 : 0);
    }
}
