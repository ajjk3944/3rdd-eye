package b5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new androidx.recyclerview.widget.i0(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1902a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1903b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f1904c;

    /* renamed from: d, reason: collision with root package name */
    public int f1905d;

    /* renamed from: e, reason: collision with root package name */
    public String f1906e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1907f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1908h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f1902a);
        parcel.writeStringList(this.f1903b);
        parcel.writeTypedArray(this.f1904c, i4);
        parcel.writeInt(this.f1905d);
        parcel.writeString(this.f1906e);
        parcel.writeStringList(this.f1907f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.f1908h);
    }
}
