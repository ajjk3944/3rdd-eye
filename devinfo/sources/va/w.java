package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ac.a implements y {
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 1);
    }

    @Override // va.y
    public final void A1() {
        g1(T(), 7);
    }

    @Override // va.y
    public final void C1() {
        g1(T(), 9);
    }

    @Override // va.y
    public final void W(w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 8);
    }

    @Override // va.y
    public final void c() {
        g1(T(), 3);
    }

    @Override // va.y
    public final void d() {
        g1(T(), 4);
    }

    @Override // va.y
    public final void e() {
        g1(T(), 5);
    }

    @Override // va.y
    public final void m() {
        g1(T(), 1);
    }

    @Override // va.y
    public final void p(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 2);
    }

    @Override // va.y
    public final void z1() {
        g1(T(), 6);
    }
}
