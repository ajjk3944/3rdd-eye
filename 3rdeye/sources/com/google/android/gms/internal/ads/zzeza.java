package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeza implements zzezk {
    private final zzezk zza;
    private zzcux zzb;

    public zzeza(zzezk zzezkVar) {
        this.zza = zzezkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcux zzd() {
        return this.zzb;
    }

    public final synchronized A4.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzbvo zzbvoVar;
        this.zzb = zzcuxVar;
        if (zzcuxVar == null || (zzbvoVar = zzezlVar.zza) == null) {
            return ((zzeyz) this.zza).zzb(zzezlVar, zzezjVar, zzcuxVar);
        }
        zzcrz zzcrzVarZzb = zzcuxVar.zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzj(zzgdb.zzh(zzbvoVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ A4.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }
}
