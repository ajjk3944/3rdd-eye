package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C0772Vb;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import com.google.android.gms.internal.ads.InterfaceC0840Zb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2817f0 extends W2.a implements InterfaceC2823i0 {
    public C2817f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 2);
    }

    @Override // q2.InterfaceC2823i0
    public final void F1(InterfaceC0840Zb interfaceC0840Zb) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0840Zb);
        I0(parcelH0, 12);
    }

    @Override // q2.InterfaceC2823i0
    public final void V1(S2.a aVar, String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(null);
        C7.e(parcelH0, aVar);
        I0(parcelH0, 6);
    }

    @Override // q2.InterfaceC2823i0
    public final void X(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        I0(parcelH0, 18);
    }

    @Override // q2.InterfaceC2823i0
    public final void Y() {
        I0(h0(), 19);
    }

    @Override // q2.InterfaceC2823i0
    public final void b() {
        I0(h0(), 1);
    }

    @Override // q2.InterfaceC2823i0
    public final void j1(V0 v0) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, v0);
        I0(parcelH0, 14);
    }

    @Override // q2.InterfaceC2823i0
    public final List l() {
        Parcel parcelK0 = k0(h0(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelK0.createTypedArrayList(C0772Vb.CREATOR);
        parcelK0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // q2.InterfaceC2823i0
    public final void l3(InterfaceC0603Lc interfaceC0603Lc) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC0603Lc);
        I0(parcelH0, 11);
    }
}
