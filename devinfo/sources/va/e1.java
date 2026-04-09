package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.ip;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.ng;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e1 extends ac.a implements h1 {
    public e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 1);
    }

    @Override // va.h1
    public final List E1() {
        Parcel parcelR0 = r0(T(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelR0.createTypedArrayList(ip.CREATOR);
        parcelR0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // va.h1
    public final void G3(ar arVar) {
        Parcel parcelT = T();
        ng.e(parcelT, arVar);
        g1(parcelT, 11);
    }

    @Override // va.h1
    public final void H(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 18);
    }

    @Override // va.h1
    public final void I() {
        g1(T(), 19);
    }

    @Override // va.h1
    public final void U1(mp mpVar) {
        Parcel parcelT = T();
        ng.e(parcelT, mpVar);
        g1(parcelT, 12);
    }

    @Override // va.h1
    public final void c() {
        g1(T(), 1);
    }

    @Override // va.h1
    public final void n3(String str, vb.a aVar) {
        Parcel parcelT = T();
        parcelT.writeString(null);
        ng.e(parcelT, aVar);
        g1(parcelT, 6);
    }

    @Override // va.h1
    public final void r3(u2 u2Var) {
        Parcel parcelT = T();
        ng.c(parcelT, u2Var);
        g1(parcelT, 14);
    }
}
