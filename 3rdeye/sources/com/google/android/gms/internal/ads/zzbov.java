package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbov implements zzcam {
    final /* synthetic */ zzboa zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcai zzc;
    final /* synthetic */ zzboy zzd;

    public zzbov(zzboy zzboyVar, zzboa zzboaVar, Object obj, zzcai zzcaiVar) {
        this.zza = zzboaVar;
        this.zzb = obj;
        this.zzc = zzcaiVar;
        this.zzd = zzboyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcai zzcaiVar = this.zzc;
        zzboy.zzd(this.zzd, this.zza, (zzboh) obj, obj2, zzcaiVar);
    }
}
