package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaar implements zzacn {
    private final zzabr zza;
    private final zzabw zzb;
    private final Queue zzc;
    private Surface zzd;
    private zzz zze;
    private long zzf;
    private zzack zzg;
    private Executor zzh;
    private zzabo zzi;

    public zzaar(zzabr zzabrVar, zzdj zzdjVar) {
        this.zza = zzabrVar;
        zzabrVar.zzi(zzdjVar);
        this.zzb = new zzabw(new zzaap(this, null), zzabrVar);
        this.zzc = new ArrayDeque();
        this.zze = new zzx().zzan();
        this.zzf = -9223372036854775807L;
        this.zzg = zzack.zzb;
        this.zzh = new Executor() { // from class: com.google.android.gms.internal.ads.zzaaj
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
            }
        };
        this.zzi = new zzabo() { // from class: com.google.android.gms.internal.ads.zzaak
            @Override // com.google.android.gms.internal.ads.zzabo
            public final void zzcT(long j4, long j10, zzz zzzVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzA(zzz zzzVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzB() {
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzC() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzD(boolean z10) {
        return this.zza.zzm(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final Surface zzb() {
        Surface surface = this.zzd;
        zzdd.zzb(surface);
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzh() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzi() {
        this.zzd = null;
        this.zza.zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzj(boolean z10) {
        if (z10) {
            this.zza.zzg();
        }
        this.zzb.zza();
        this.zzc.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzk(boolean z10) {
        this.zza.zzc(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzl(int i, zzz zzzVar, long j4, int i10, List list) {
        zzdd.zzf(list.isEmpty());
        zzz zzzVar2 = this.zze;
        int i11 = zzzVar2.zzv;
        int i12 = zzzVar.zzv;
        if (i12 != i11 || zzzVar.zzw != zzzVar2.zzw) {
            this.zzb.zzd(i12, zzzVar.zzw);
        }
        float f10 = zzzVar.zzz;
        if (f10 != this.zze.zzz) {
            this.zza.zzj(f10);
        }
        this.zze = zzzVar;
        if (j4 != this.zzf) {
            this.zzb.zzc(i10, j4);
            this.zzf = j4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzm() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzo(long j4, long j10) throws zzacm {
        try {
            this.zzb.zze(j4, j10);
        } catch (zzin e4) {
            throw new zzacm(e4, this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzp(long j4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzq(int i) {
        this.zza.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzr(zzack zzackVar, Executor executor) {
        this.zzg = zzackVar;
        this.zzh = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzs(Surface surface, zzeo zzeoVar) {
        this.zzd = surface;
        this.zza.zzk(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzt(float f10) {
        this.zza.zzl(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzu(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzv(zzabo zzaboVar) {
        this.zzi = zzaboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzw() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzx() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzy() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzz(long j4, zzacl zzaclVar) {
        this.zzc.add(zzaclVar);
        this.zzb.zzb(j4);
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaal
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg.zzb();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzn() {
    }
}
