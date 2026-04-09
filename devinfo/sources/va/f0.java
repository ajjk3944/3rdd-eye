package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.un;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 extends ac.a implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 1);
    }

    @Override // va.h0
    public final void G2(qm qmVar) {
        Parcel parcelT = T();
        ng.c(parcelT, qmVar);
        g1(parcelT, 6);
    }

    @Override // va.h0
    public final void R2(String str, pn pnVar, nn nnVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        ng.e(parcelT, pnVar);
        ng.e(parcelT, nnVar);
        g1(parcelT, 5);
    }

    @Override // va.h0
    public final e0 c() {
        e0 c0Var;
        Parcel parcelR0 = r0(T(), 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            c0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c0Var = iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 1);
        }
        parcelR0.recycle();
        return c0Var;
    }

    @Override // va.h0
    public final void o0(un unVar) {
        Parcel parcelT = T();
        ng.e(parcelT, unVar);
        g1(parcelT, 10);
    }

    @Override // va.h0
    public final void s2(y yVar) {
        Parcel parcelT = T();
        ng.e(parcelT, yVar);
        g1(parcelT, 2);
    }
}
