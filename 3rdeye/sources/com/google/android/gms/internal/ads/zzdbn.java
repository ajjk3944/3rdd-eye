package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdbn {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzezh zzo;

    public final zzdbn zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzddo(zzaVar, executor));
        return this;
    }

    public final zzdbn zzb(zzcvu zzcvuVar, Executor executor) {
        this.zzi.add(new zzddo(zzcvuVar, executor));
        return this;
    }

    public final zzdbn zzc(zzcwh zzcwhVar, Executor executor) {
        this.zzl.add(new zzddo(zzcwhVar, executor));
        return this;
    }

    public final zzdbn zzd(zzcwl zzcwlVar, Executor executor) {
        this.zzf.add(new zzddo(zzcwlVar, executor));
        return this;
    }

    public final zzdbn zze(zzcvr zzcvrVar, Executor executor) {
        this.zze.add(new zzddo(zzcvrVar, executor));
        return this;
    }

    public final zzdbn zzf(zzcxf zzcxfVar, Executor executor) {
        this.zzh.add(new zzddo(zzcxfVar, executor));
        return this;
    }

    public final zzdbn zzg(zzcxq zzcxqVar, Executor executor) {
        this.zzg.add(new zzddo(zzcxqVar, executor));
        return this;
    }

    public final zzdbn zzh(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzddo(zzrVar, executor));
        return this;
    }

    public final zzdbn zzi(zzcyd zzcydVar, Executor executor) {
        this.zzm.add(new zzddo(zzcydVar, executor));
        return this;
    }

    public final zzdbn zzj(zzcyt zzcytVar, Executor executor) {
        this.zzb.add(new zzddo(zzcytVar, executor));
        return this;
    }

    public final zzdbn zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzddo(appEventListener, executor));
        return this;
    }

    public final zzdbn zzl(zzddw zzddwVar, Executor executor) {
        this.zzd.add(new zzddo(zzddwVar, executor));
        return this;
    }

    public final zzdbn zzm(zzezh zzezhVar) {
        this.zzo = zzezhVar;
        return this;
    }

    public final zzdbp zzn() {
        return new zzdbp(this, null);
    }
}
