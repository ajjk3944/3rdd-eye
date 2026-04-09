package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzavg {
    public static final String zza(Context context, String str, long j4, boolean z10) {
        try {
            zzatx zzatxVarZza = zzaty.zza();
            zzatxVarZza.zzb(str);
            zzatxVarZza.zza("0.460000000");
            zzatxVarZza.zzc(context.getPackageName());
            zzatxVarZza.zze((System.currentTimeMillis() - j4) / 1000);
            zzatxVarZza.zzd(System.currentTimeMillis() / 1000);
            try {
                zzatxVarZza.zzf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzatxVarZza.zzf(-1L);
            }
            zzaue zzaueVarZza = zzauq.zza(((zzaty) zzatxVarZza.zzbr()).zzaV(), null);
            zzaueVarZza.zzd(5);
            zzaueVarZza.zzc(2);
            return Base64.encodeToString(((zzauf) zzaueVarZza.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
