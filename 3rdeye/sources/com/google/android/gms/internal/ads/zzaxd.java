package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaxd implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzaxe zza;

    public zzaxd(zzaxe zzaxeVar) {
        this.zza = zzaxeVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z10) {
        if (z10) {
            zzaxe zzaxeVar = this.zza;
            zzaxeVar.zzb = System.currentTimeMillis();
            zzaxeVar.zze = true;
        } else {
            zzaxe zzaxeVar2 = this.zza;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (zzaxeVar2.zzc > 0 && jCurrentTimeMillis >= zzaxeVar2.zzc) {
                zzaxeVar2.zzd = jCurrentTimeMillis - zzaxeVar2.zzc;
            }
            zzaxeVar2.zze = false;
        }
    }
}
