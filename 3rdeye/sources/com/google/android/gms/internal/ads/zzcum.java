package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcum implements zzcvr, zzddb, zzdaq, zzcwh, zzazb {
    private final zzcwj zza;
    private final zzcyf zzb;
    private final zzfbt zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzgdv zzf = zzgdv.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    public zzcum(zzcwj zzcwjVar, zzfbt zzfbtVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzcyf zzcyfVar) {
        this.zza = zzcwjVar;
        this.zzc = zzfbtVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzcyfVar;
    }

    public static /* synthetic */ void zzh(zzcum zzcumVar) {
        synchronized (zzcumVar) {
            try {
                zzgdv zzgdvVar = zzcumVar.zzf;
                if (zzgdvVar.isDone()) {
                    return;
                }
                zzgdvVar.zzc(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zzk() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
        zzfbt zzfbtVar = this.zzc;
        if (zzfbtVar.zze == 3) {
            return;
        }
        int i = zzfbtVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlJ)).booleanValue() && zzk()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final synchronized void zzdq() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzgdv zzgdvVar = this.zzf;
        if (zzgdvVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzgdvVar.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlJ)).booleanValue() && zzk() && zzazaVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzi() {
        zzfbt zzfbtVar = this.zzc;
        int i = zzfbtVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbG)).booleanValue() && zzfbtVar.zzY == 2) {
            int i10 = zzfbtVar.zzq;
            if (i10 == 0) {
                this.zza.zza();
            } else {
                zzgdb.zzr(this.zzf, new zzcul(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcum.zzh(this.zza);
                    }
                }, i10, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final synchronized void zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzgdv zzgdvVar = this.zzf;
            if (zzgdvVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzgdvVar.zzd(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }
}
