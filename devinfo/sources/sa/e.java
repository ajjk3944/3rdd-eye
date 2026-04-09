package sa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.bh;
import va.u0;
import va.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends qb.a {
    public static final Parcelable.Creator<e> CREATOR = new j4.g(23);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33517a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f33518b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f33519c;

    public e(boolean z3, IBinder iBinder, IBinder iBinder2) {
        v0 u0Var;
        this.f33517a = z3;
        if (iBinder != null) {
            int i4 = bh.f9682b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            u0Var = iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new u0(iBinder);
        } else {
            u0Var = null;
        }
        this.f33518b = u0Var;
        this.f33519c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f33517a ? 1 : 0);
        v0 v0Var = this.f33518b;
        com.bumptech.glide.f.F(parcel, 2, v0Var == null ? null : v0Var.asBinder());
        com.bumptech.glide.f.F(parcel, 3, this.f33519c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
