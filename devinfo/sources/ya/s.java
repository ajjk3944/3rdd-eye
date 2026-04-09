package ya;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends ac.a implements t {
    @Override // ya.t
    public final boolean zze(vb.a aVar, String str, String str2) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeString(str);
        parcelT.writeString(str2);
        Parcel parcelR0 = r0(parcelT, 1);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }

    @Override // ya.t
    public final void zzf(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 2);
    }

    @Override // ya.t
    public final boolean zzg(vb.a aVar, wa.a aVar2) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, aVar2);
        Parcel parcelR0 = r0(parcelT, 3);
        boolean z3 = parcelR0.readInt() != 0;
        parcelR0.recycle();
        return z3;
    }
}
