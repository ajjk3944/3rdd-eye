package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcdd extends com.google.android.gms.ads.internal.util.zzb {
    final zzcbz zza;
    final zzcdl zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdd(zzcbz zzcbzVar, zzcdl zzcdlVar, String str, String[] strArr) {
        this.zza = zzcbzVar;
        this.zzb = zzcdlVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzv.zzA().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcdc(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final A4.a zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcg)).booleanValue() && (this.zzb instanceof zzcdu)) ? zzcad.zzf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcdd zzcddVar = this.zza;
                return Boolean.valueOf(zzcddVar.zzb.zzw(zzcddVar.zzc, zzcddVar.zzd, zzcddVar));
            }
        }) : super.zzb();
    }

    public final String zze() {
        return this.zzc;
    }
}
