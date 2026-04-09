package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeyz implements zzezk {
    private zzcux zza;

    @Override // com.google.android.gms.internal.ads.zzezk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcux zzd() {
        return this.zza;
    }

    public final synchronized A4.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzcrz zzcrzVarZzb;
        try {
            if (zzcuxVar != null) {
                this.zza = zzcuxVar;
            } else {
                this.zza = (zzcux) zzezjVar.zza(zzezlVar.zzb).zzh();
            }
            zzcrzVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ A4.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }
}
