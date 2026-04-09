package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC1407k8;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class J extends W2.a implements L {
    public J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 2);
    }

    @Override // q2.L
    public final String A() {
        Parcel parcelK0 = k0(h0(), 31);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // q2.L
    public final void B2(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 44);
    }

    @Override // q2.L
    public final B0 C() {
        B0 c2856z0;
        Parcel parcelK0 = k0(h0(), 26);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2856z0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c2856z0 = iInterfaceQueryLocalInterface instanceof B0 ? (B0) iInterfaceQueryLocalInterface : new C2856z0(strongBinder);
        }
        parcelK0.recycle();
        return c2856z0;
    }

    @Override // q2.L
    public final void C3(W w6) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, w6);
        I0(parcelH0, 8);
    }

    @Override // q2.L
    public final void D1(d1 d1Var) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, d1Var);
        I0(parcelH0, 13);
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC2809b0);
        I0(parcelH0, 45);
    }

    @Override // q2.L
    public final InterfaceC2854y0 N() {
        InterfaceC2854y0 c2850w0;
        Parcel parcelK0 = k0(h0(), 41);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2850w0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c2850w0 = iInterfaceQueryLocalInterface instanceof InterfaceC2854y0 ? (InterfaceC2854y0) iInterfaceQueryLocalInterface : new C2850w0(strongBinder);
        }
        parcelK0.recycle();
        return c2850w0;
    }

    @Override // q2.L
    public final void O0(Y0 y02) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, y02);
        I0(parcelH0, 29);
    }

    @Override // q2.L
    public final void R0(long j6) {
        Parcel parcelH0 = h0();
        parcelH0.writeLong(j6);
        I0(parcelH0, 48);
    }

    @Override // q2.L
    public final void S0(boolean z6) {
        Parcel parcelH0 = h0();
        ClassLoader classLoader = C7.f7544a;
        parcelH0.writeInt(z6 ? 1 : 0);
        I0(parcelH0, 34);
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC2842s0);
        I0(parcelH0, 42);
    }

    @Override // q2.L
    public final long a0() {
        Parcel parcelK0 = k0(h0(), 47);
        long j6 = parcelK0.readLong();
        parcelK0.recycle();
        return j6;
    }

    @Override // q2.L
    public final S2.a c() {
        return AbstractC2763b.c(k0(h0(), 1));
    }

    @Override // q2.L
    public final void d() {
        I0(h0(), 5);
    }

    @Override // q2.L
    public final void e() {
        I0(h0(), 6);
    }

    @Override // q2.L
    public final boolean f0(a1 a1Var) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        Parcel parcelK0 = k0(parcelH0, 4);
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC2853y);
        I0(parcelH0, 7);
    }

    @Override // q2.L
    public final d1 o() {
        Parcel parcelK0 = k0(h0(), 12);
        d1 d1Var = (d1) C7.b(parcelK0, d1.CREATOR);
        parcelK0.recycle();
        return d1Var;
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC2847v);
        I0(parcelH0, 20);
    }

    @Override // q2.L
    public final void s() {
        I0(h0(), 2);
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC1407k8);
        I0(parcelH0, 40);
    }

    @Override // q2.L
    public final void w2(boolean z6) {
        Parcel parcelH0 = h0();
        ClassLoader classLoader = C7.f7544a;
        parcelH0.writeInt(z6 ? 1 : 0);
        I0(parcelH0, 22);
    }

    @Override // q2.L
    public final void x3(a1 a1Var, InterfaceC2803B interfaceC2803B) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, a1Var);
        C7.e(parcelH0, interfaceC2803B);
        I0(parcelH0, 43);
    }
}
