package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdkn implements zzcwl {
    private final zzdim zza;
    private final zzdir zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkn(zzdim zzdimVar, zzdir zzdirVar, Executor executor, Executor executor2) {
        this.zza = zzdimVar;
        this.zzb = zzdirVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfe zzcfeVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // java.lang.Runnable
            public final void run() {
                zzcfeVar.zzd("onSdkImpression", new C5308a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        if (this.zzb.zzd()) {
            zzdim zzdimVar = this.zza;
            zzecz zzeczVarZzu = zzdimVar.zzu();
            if (zzeczVarZzu == null && zzdimVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfB)).booleanValue()) {
                A4.a aVarZzw = zzdimVar.zzw();
                zzcai zzcaiVarZzp = zzdimVar.zzp();
                if (aVarZzw == null || zzcaiVarZzp == null) {
                    return;
                }
                zzgdb.zzr(zzgdb.zzl(aVarZzw, zzcaiVarZzp), new zzdkm(this), this.zzd);
                return;
            }
            if (zzeczVarZzu != null) {
                zzcfe zzcfeVarZzr = zzdimVar.zzr();
                zzcfe zzcfeVarZzs = zzdimVar.zzs();
                if (zzcfeVarZzr == null) {
                    zzcfeVarZzr = zzcfeVarZzs == null ? null : zzcfeVarZzs;
                }
                if (zzcfeVarZzr != null) {
                    zzb(zzcfeVarZzr);
                }
            }
        }
    }
}
