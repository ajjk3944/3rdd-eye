package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2849w extends W2.a implements InterfaceC2853y {
    public C2849w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 2);
    }

    @Override // q2.InterfaceC2853y
    public final void E(int i) {
        Parcel parcelH0 = h0();
        parcelH0.writeInt(i);
        I0(parcelH0, 2);
    }

    @Override // q2.InterfaceC2853y
    public final void b() {
        I0(h0(), 3);
    }

    @Override // q2.InterfaceC2853y
    public final void d() {
        I0(h0(), 4);
    }

    @Override // q2.InterfaceC2853y
    public final void e() {
        I0(h0(), 5);
    }

    @Override // q2.InterfaceC2853y
    public final void g() {
        I0(h0(), 6);
    }

    @Override // q2.InterfaceC2853y
    public final void h() {
        I0(h0(), 7);
    }

    @Override // q2.InterfaceC2853y
    public final void j() {
        I0(h0(), 9);
    }

    @Override // q2.InterfaceC2853y
    public final void j0(C2852x0 c2852x0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c2852x0);
        I0(parcelH0, 8);
    }

    @Override // q2.InterfaceC2853y
    public final void z() {
        I0(h0(), 1);
    }
}
