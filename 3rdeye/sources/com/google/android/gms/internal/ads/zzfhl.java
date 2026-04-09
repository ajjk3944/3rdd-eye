package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfhl {
    public static void zza(A4.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        zzg(aVar, zzfhmVar, zzfhbVar, false);
    }

    public static void zzb(A4.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        zzg(aVar, zzfhmVar, zzfhbVar, true);
    }

    public static void zzc(A4.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhk(zzfhmVar, zzfhbVar), zzcad.zzg);
        }
    }

    public static void zzd(A4.a aVar, zzfhb zzfhbVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhi(zzfhbVar), zzcad.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzja), str);
    }

    public static int zzf(zzfco zzfcoVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfcoVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzg(A4.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar, boolean z10) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhj(zzfhmVar, zzfhbVar, z10), zzcad.zzg);
        }
    }
}
