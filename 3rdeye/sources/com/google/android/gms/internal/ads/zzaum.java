package com.google.android.gms.internal.ads;

import I0.f;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaum implements PackageManager$OnChecksumsReadyListener {
    final zzgdv zza = zzgdv.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumC = f.c(list.get(i));
                if (apkChecksumC.getType() == 8) {
                    zzgdv zzgdvVar = this.zza;
                    zzgas zzgasVarZzf = zzgas.zzi().zzf();
                    byte[] value = apkChecksumC.getValue();
                    zzgdvVar.zzc(zzgasVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
