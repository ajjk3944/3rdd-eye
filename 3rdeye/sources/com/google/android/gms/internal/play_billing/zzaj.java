package com.google.android.gms.internal.play_billing;

import j6.l;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzaj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzaj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        StringBuilder sbD = l.d("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbD.append(strValueOf3);
        sbD.append("=");
        sbD.append(strValueOf4);
        return new IllegalArgumentException(sbD.toString());
    }
}
