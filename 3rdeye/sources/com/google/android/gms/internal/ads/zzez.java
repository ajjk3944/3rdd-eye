package com.google.android.gms.internal.ads;

import N7.G8;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzez {
    public final String zza;

    private zzez(int i, int i10, String str) {
        this.zza = str;
    }

    public static zzez zza(zzen zzenVar) {
        String str;
        zzenVar.zzM(2);
        int iZzm = zzenVar.zzm();
        int i = iZzm >> 1;
        int i10 = iZzm & 1;
        int iZzm2 = zzenVar.zzm() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i11 = iZzm2 | (i10 << 5);
        StringBuilder sbU = G8.u(str);
        sbU.append(i < 10 ? ".0" : ".");
        sbU.append(i);
        sbU.append(i11 < 10 ? ".0" : ".");
        sbU.append(i11);
        return new zzez(i, i11, sbU.toString());
    }
}
