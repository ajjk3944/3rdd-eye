package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzcap {
    private final zzcai zza;
    private final AtomicInteger zzb;

    public zzcap() {
        zzcai zzcaiVar = new zzcai();
        this.zza = zzcaiVar;
        this.zzb = new AtomicInteger(0);
        zzgdb.zzr(zzcaiVar, new zzcan(this), zzcad.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcam zzcamVar, zzcak zzcakVar) {
        zzgdb.zzr(this.zza, new zzcao(this, zzcamVar, zzcakVar), zzcad.zzg);
    }
}
