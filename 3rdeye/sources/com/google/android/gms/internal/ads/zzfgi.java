package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfgi {
    final /* synthetic */ zzfgk zza;
    private final Object zzb;
    private final String zzc;
    private final A4.a zzd;
    private final List zze;
    private final A4.a zzf;

    private zzfgi(zzfgk zzfgkVar, Object obj, String str, A4.a aVar, List list, A4.a aVar2) {
        this.zza = zzfgkVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }

    public final zzffy zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzffy zzffyVar = new zzffy(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzffyVar);
        A4.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd.zzc(zzffyVar);
            }
        };
        zzgdm zzgdmVar = zzcad.zzg;
        aVar.addListener(runnable, zzgdmVar);
        zzgdb.zzr(zzffyVar, new zzfgh(this, zzffyVar), zzgdmVar);
        return zzffyVar;
    }

    public final zzfgi zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgi zzc(Class cls, zzgci zzgciVar) {
        zzfgk zzfgkVar = this.zza;
        return new zzfgi(zzfgkVar, this.zzb, this.zzc, this.zzd, this.zze, zzgdb.zzf(this.zzf, cls, zzgciVar, zzfgkVar.zzb));
    }

    public final zzfgi zzd(final A4.a aVar) {
        return zzg(new zzgci() { // from class: com.google.android.gms.internal.ads.zzfgf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return aVar;
            }
        }, zzcad.zzg);
    }

    public final zzfgi zze(final zzffw zzffwVar) {
        return zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzfge
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(zzffwVar.zza(obj));
            }
        });
    }

    public final zzfgi zzf(zzgci zzgciVar) {
        return zzg(zzgciVar, this.zza.zzb);
    }

    public final zzfgi zzg(zzgci zzgciVar, Executor executor) {
        return new zzfgi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgdb.zzn(this.zzf, zzgciVar, executor));
    }

    public final zzfgi zzh(String str) {
        return new zzfgi(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgi zzi(long j4, TimeUnit timeUnit) {
        zzfgk zzfgkVar = this.zza;
        return new zzfgi(zzfgkVar, this.zzb, this.zzc, this.zzd, this.zze, zzgdb.zzo(this.zzf, j4, timeUnit, zzfgkVar.zzc));
    }
}
