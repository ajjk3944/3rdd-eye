package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeyo implements zzfev {
    private final zzezk zza;

    public zzeyo(zzezk zzezkVar) {
        this.zza = zzezkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final A4.a zza(zzfew zzfewVar) {
        zzeyp zzeypVar = (zzeyp) zzfewVar;
        return ((zzeyl) this.zza).zzb(zzeypVar.zzb, zzeypVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfev
    public final void zzb(zzfek zzfekVar) {
        zzfekVar.zza = ((zzeyl) this.zza).zza();
    }
}
