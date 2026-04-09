package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfuy {
    private final String zza;
    private final zzfux zzb;
    private zzfux zzc;

    public /* synthetic */ zzfuy(String str, zzfuz zzfuzVar) {
        zzfux zzfuxVar = new zzfux();
        this.zzb = zzfuxVar;
        this.zzc = zzfuxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfux zzfuxVar = this.zzb.zzb;
        String str = "";
        while (zzfuxVar != null) {
            Object obj = zzfuxVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzfuxVar = zzfuxVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfuy zza(Object obj) {
        zzfux zzfuxVar = new zzfux();
        this.zzc.zzb = zzfuxVar;
        this.zzc = zzfuxVar;
        zzfuxVar.zza = obj;
        return this;
    }
}
