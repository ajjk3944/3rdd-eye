package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f2 implements Parcelable {
    public static final Parcelable.Creator<f2> CREATOR = new i0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f1357a;

    /* renamed from: b, reason: collision with root package name */
    public int f1358b;

    /* renamed from: c, reason: collision with root package name */
    public int f1359c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1360d;

    /* renamed from: e, reason: collision with root package name */
    public int f1361e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1362f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1363h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1364i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f1357a);
        parcel.writeInt(this.f1358b);
        parcel.writeInt(this.f1359c);
        if (this.f1359c > 0) {
            parcel.writeIntArray(this.f1360d);
        }
        parcel.writeInt(this.f1361e);
        if (this.f1361e > 0) {
            parcel.writeIntArray(this.f1362f);
        }
        parcel.writeInt(this.f1363h ? 1 : 0);
        parcel.writeInt(this.f1364i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.g);
    }
}
