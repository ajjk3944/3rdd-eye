package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.vh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends ac.a implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 1);
    }

    @Override // va.l0
    public final void D0(long j) {
        Parcel parcelT = T();
        parcelT.writeLong(j);
        g1(parcelT, 48);
    }

    @Override // va.l0
    public final void E0(boolean z3) {
        Parcel parcelT = T();
        ClassLoader classLoader = ng.f14287a;
        parcelT.writeInt(z3 ? 1 : 0);
        g1(parcelT, 34);
    }

    @Override // va.l0
    public final void F0(a1 a1Var) {
        Parcel parcelT = T();
        ng.e(parcelT, a1Var);
        g1(parcelT, 45);
    }

    @Override // va.l0
    public final c3 G1() {
        Parcel parcelR0 = r0(T(), 12);
        c3 c3Var = (c3) ng.b(parcelR0, c3.CREATOR);
        parcelR0.recycle();
        return c3Var;
    }

    @Override // va.l0
    public final long M() {
        Parcel parcelR0 = r0(T(), 47);
        long j = parcelR0.readLong();
        parcelR0.recycle();
        return j;
    }

    @Override // va.l0
    public final String M1() {
        Parcel parcelR0 = r0(T(), 31);
        String string = parcelR0.readString();
        parcelR0.recycle();
        return string;
    }

    @Override // va.l0
    public final x1 N1() {
        x1 v1Var;
        Parcel parcelR0 = r0(T(), 41);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            v1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            v1Var = iInterfaceQueryLocalInterface instanceof x1 ? (x1) iInterfaceQueryLocalInterface : new v1(strongBinder);
        }
        parcelR0.recycle();
        return v1Var;
    }

    @Override // va.l0
    public final boolean P(z2 z2Var) {
        Parcel parcelT = T();
        ng.c(parcelT, z2Var);
        Parcel parcelR0 = r0(parcelT, 4);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // va.l0
    public final void P2(x2 x2Var) {
        Parcel parcelT = T();
        ng.c(parcelT, x2Var);
        g1(parcelT, 29);
    }

    @Override // va.l0
    public final void S2(boolean z3) {
        Parcel parcelT = T();
        ClassLoader classLoader = ng.f14287a;
        parcelT.writeInt(z3 ? 1 : 0);
        g1(parcelT, 22);
    }

    @Override // va.l0
    public final void X3(v0 v0Var) {
        Parcel parcelT = T();
        ng.e(parcelT, v0Var);
        g1(parcelT, 8);
    }

    @Override // va.l0
    public final void Z3(z2 z2Var, b0 b0Var) {
        Parcel parcelT = T();
        ng.c(parcelT, z2Var);
        ng.e(parcelT, b0Var);
        g1(parcelT, 43);
    }

    @Override // va.l0
    public final vb.a a() {
        return r5.c.p(r0(T(), 1));
    }

    @Override // va.l0
    public final void d() {
        g1(T(), 5);
    }

    @Override // va.l0
    public final void d1(r1 r1Var) {
        Parcel parcelT = T();
        ng.e(parcelT, r1Var);
        g1(parcelT, 42);
    }

    @Override // va.l0
    public final void e() {
        g1(T(), 6);
    }

    @Override // va.l0
    public final void h() {
        g1(T(), 2);
    }

    @Override // va.l0
    public final void j1(c3 c3Var) {
        Parcel parcelT = T();
        ng.c(parcelT, c3Var);
        g1(parcelT, 13);
    }

    @Override // va.l0
    public final void j3(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 44);
    }

    @Override // va.l0
    public final void t0(v vVar) {
        Parcel parcelT = T();
        ng.e(parcelT, vVar);
        g1(parcelT, 20);
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
        Parcel parcelT = T();
        ng.e(parcelT, vhVar);
        g1(parcelT, 40);
    }

    @Override // va.l0
    public final void x3(y yVar) {
        Parcel parcelT = T();
        ng.e(parcelT, yVar);
        g1(parcelT, 7);
    }

    @Override // va.l0
    public final a2 y() {
        a2 y1Var;
        Parcel parcelR0 = r0(T(), 26);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            y1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            y1Var = iInterfaceQueryLocalInterface instanceof a2 ? (a2) iInterfaceQueryLocalInterface : new y1(strongBinder);
        }
        parcelR0.recycle();
        return y1Var;
    }
}
