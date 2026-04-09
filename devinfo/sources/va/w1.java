package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w1 extends qb.a {
    public static final Parcelable.Creator<w1> CREATOR = new f1(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f36177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36178b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36179c;

    /* renamed from: d, reason: collision with root package name */
    public w1 f36180d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f36181e;

    public w1(int i4, String str, String str2, w1 w1Var, IBinder iBinder) {
        this.f36177a = i4;
        this.f36178b = str;
        this.f36179c = str2;
        this.f36180d = w1Var;
        this.f36181e = iBinder;
    }

    public final pa.a a() {
        w1 w1Var = this.f36180d;
        pa.a aVar = null;
        if (w1Var != null) {
            String str = w1Var.f36179c;
            aVar = new pa.a(w1Var.f36177a, w1Var.f36178b, str, null);
        }
        return new pa.a(this.f36177a, this.f36178b, this.f36179c, aVar);
    }

    public final pa.l c() {
        pa.a aVar;
        x1 v1Var;
        w1 w1Var = this.f36180d;
        if (w1Var == null) {
            aVar = null;
        } else {
            aVar = new pa.a(w1Var.f36177a, w1Var.f36178b, w1Var.f36179c, null);
        }
        IBinder iBinder = this.f36181e;
        if (iBinder == null) {
            v1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            v1Var = iInterfaceQueryLocalInterface instanceof x1 ? (x1) iInterfaceQueryLocalInterface : new v1(iBinder);
        }
        return new pa.l(this.f36177a, this.f36178b, this.f36179c, aVar, v1Var != null ? new pa.q(v1Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f36177a);
        com.bumptech.glide.f.I(parcel, 2, this.f36178b);
        com.bumptech.glide.f.I(parcel, 3, this.f36179c);
        com.bumptech.glide.f.H(parcel, 4, this.f36180d, i4);
        com.bumptech.glide.f.F(parcel, 5, this.f36181e);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
