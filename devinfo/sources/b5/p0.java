package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new androidx.recyclerview.widget.i0(5);

    /* renamed from: a, reason: collision with root package name */
    public String f1849a;

    /* renamed from: b, reason: collision with root package name */
    public int f1850b;

    public p0(String str, int i4) {
        this.f1849a = str;
        this.f1850b = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f1849a);
        parcel.writeInt(this.f1850b);
    }
}
