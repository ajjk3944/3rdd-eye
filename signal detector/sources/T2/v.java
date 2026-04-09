package t2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.C7;
import r2.C2876a;

/* loaded from: classes.dex */
public final class v extends W2.a implements w {
    @Override // t2.w
    public final boolean zze(S2.a aVar, String str, String str2) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        parcelH0.writeString(str);
        parcelH0.writeString(str2);
        Parcel parcelK0 = k0(parcelH0, 1);
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // t2.w
    public final void zzf(S2.a aVar) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        I0(parcelH0, 2);
    }

    @Override // t2.w
    public final boolean zzg(S2.a aVar, C2876a c2876a) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, aVar);
        C7.c(parcelH0, c2876a);
        Parcel parcelK0 = k0(parcelH0, 3);
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }
}
