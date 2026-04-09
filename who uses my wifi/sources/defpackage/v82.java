package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v82 extends sb1 implements ba2 {
    public v82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 2);
    }

    @Override // defpackage.ba2
    public final py2 A() {
        py2 xx2Var;
        Parcel parcelY = Y(U(), 26);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            xx2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            xx2Var = iInterfaceQueryLocalInterface instanceof py2 ? (py2) iInterfaceQueryLocalInterface : new xx2(strongBinder);
        }
        parcelY.recycle();
        return xx2Var;
    }

    @Override // defpackage.ba2
    public final void H2(b12 b12Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, b12Var);
        M0(parcelU, 20);
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, wi2Var);
        M0(parcelU, 8);
    }

    @Override // defpackage.ba2
    public final void J2(ih3 ih3Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, ih3Var);
        M0(parcelU, 29);
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, nw1Var);
        M0(parcelU, 40);
    }

    @Override // defpackage.ba2
    public final tx2 N() {
        tx2 ow2Var;
        Parcel parcelY = Y(U(), 41);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            ow2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            ow2Var = iInterfaceQueryLocalInterface instanceof tx2 ? (tx2) iInterfaceQueryLocalInterface : new ow2(strongBinder);
        }
        parcelY.recycle();
        return ow2Var;
    }

    @Override // defpackage.ba2
    public final void N0(xe4 xe4Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, xe4Var);
        M0(parcelU, 13);
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, d32Var);
        M0(parcelU, 7);
    }

    @Override // defpackage.ba2
    public final boolean Z(pc4 pc4Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, pc4Var);
        Parcel parcelY = Y(parcelU, 4);
        boolean z = parcelY.readInt() != 0;
        parcelY.recycle();
        return z;
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, zu2Var);
        M0(parcelU, 42);
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
        Parcel parcelU = U();
        iv1.c(parcelU, pc4Var);
        iv1.e(parcelU, p42Var);
        M0(parcelU, 43);
    }

    @Override // defpackage.ba2
    public final void c() {
        M0(U(), 5);
    }

    @Override // defpackage.ba2
    public final u10 d() {
        return ga1.j(Y(U(), 1));
    }

    @Override // defpackage.ba2
    public final void e() {
        M0(U(), 6);
    }

    @Override // defpackage.ba2
    public final void g1(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = iv1.a;
        parcelU.writeInt(z ? 1 : 0);
        M0(parcelU, 22);
    }

    @Override // defpackage.ba2
    public final long k0() {
        Parcel parcelY = Y(U(), 47);
        long j = parcelY.readLong();
        parcelY.recycle();
        return j;
    }

    @Override // defpackage.ba2
    public final void k3(u10 u10Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, u10Var);
        M0(parcelU, 44);
    }

    @Override // defpackage.ba2
    public final xe4 o() {
        Parcel parcelY = Y(U(), 12);
        xe4 xe4Var = (xe4) iv1.b(parcelY, xe4.CREATOR);
        parcelY.recycle();
        return xe4Var;
    }

    @Override // defpackage.ba2
    public final void o2(pl2 pl2Var) {
        Parcel parcelU = U();
        iv1.e(parcelU, pl2Var);
        M0(parcelU, 45);
    }

    @Override // defpackage.ba2
    public final void r() {
        M0(U(), 2);
    }

    @Override // defpackage.ba2
    public final void s1(long j) {
        Parcel parcelU = U();
        parcelU.writeLong(j);
        M0(parcelU, 48);
    }

    @Override // defpackage.ba2
    public final void t1(boolean z) {
        Parcel parcelU = U();
        ClassLoader classLoader = iv1.a;
        parcelU.writeInt(z ? 1 : 0);
        M0(parcelU, 34);
    }

    @Override // defpackage.ba2
    public final String v() {
        Parcel parcelY = Y(U(), 31);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }
}
