package com.google.android.gms.internal.ads;

import B4.g;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzegs {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzegs(String str, String str2, int i, long j4, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j4;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String strO = this.zza + "." + this.zzc + "." + this.zzd;
        String str = this.zzb;
        if (!TextUtils.isEmpty(str)) {
            strO = g.o(strO, ".", str);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbM)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str)) {
            return strO;
        }
        return strO + "." + num;
    }
}
