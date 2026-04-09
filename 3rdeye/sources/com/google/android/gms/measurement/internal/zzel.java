package com.google.android.gms.measurement.internal;

import B4.f;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzel implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeo zzf;

    public zzel(zzeo zzeoVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeoVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfd zzfdVarZzm = this.zzf.zzs.zzm();
        if (!zzfdVarZzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeo zzeoVar = this.zzf;
        if (zzeoVar.zza == 0) {
            if (zzeoVar.zzs.zzf().zzy()) {
                zzeo zzeoVar2 = this.zzf;
                zzeoVar2.zzs.zzaw();
                zzeoVar2.zza = 'C';
            } else {
                zzeo zzeoVar3 = this.zzf;
                zzeoVar3.zzs.zzaw();
                zzeoVar3.zza = 'c';
            }
        }
        zzeo zzeoVar4 = this.zzf;
        if (zzeoVar4.zzb < 0) {
            zzeoVar4.zzs.zzf().zzh();
            zzeoVar4.zzb = 73000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        zzeo zzeoVar5 = this.zzf;
        char c10 = zzeoVar5.zza;
        long j4 = zzeoVar5.zzb;
        String strZzo = zzeo.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder("2");
        sb.append(cCharAt);
        sb.append(c10);
        sb.append(j4);
        String strC = f.c(sb, StringUtils.PROCESS_POSTFIX_DELIMITER, strZzo);
        if (strC.length() > 1024) {
            strC = this.zzb.substring(0, 1024);
        }
        zzfb zzfbVar = zzfdVarZzm.zzb;
        if (zzfbVar != null) {
            zzfbVar.zzb(strC, 1L);
        }
    }
}
