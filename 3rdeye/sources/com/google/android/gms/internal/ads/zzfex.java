package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfex {
    private final zzfeb zza;
    private final zzfev zzb;
    private final zzfdx zzc;
    private zzffd zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfex(zzfeb zzfebVar, zzfdx zzfdxVar, zzfev zzfevVar) {
        this.zza = zzfebVar;
        this.zzc = zzfdxVar;
        this.zzb = zzfevVar;
        zzfdxVar.zzb(new zzfes(this));
    }

    public static /* synthetic */ void zzc(zzfex zzfexVar) {
        synchronized (zzfexVar) {
            zzfexVar.zzf = 1;
            zzfexVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        zzfew zzfewVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgt)).booleanValue() && !com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfewVar = (zzfew) arrayDeque.pollFirst();
                if (zzfewVar == null || (zzfewVar.zza() != null && this.zza.zze(zzfewVar.zza()))) {
                    break;
                }
            }
            zzffd zzffdVar = new zzffd(this.zza, this.zzb, zzfewVar);
            this.zze = zzffdVar;
            zzffdVar.zzd(new zzfet(this, zzfewVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized A4.a zza(zzfew zzfewVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzfewVar);
    }

    public final synchronized void zzf(zzfew zzfewVar) {
        this.zzd.add(zzfewVar);
    }
}
