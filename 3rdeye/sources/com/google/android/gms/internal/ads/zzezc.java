package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzezc implements zzfut {
    final /* synthetic */ zzezg zza;

    public zzezc(zzezg zzezgVar) {
        this.zza = zzezgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("", (zzdyp) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezg zzezgVar = this.zza;
        zzezgVar.zzd = new zzeze(null, zzezgVar.zze(), null);
        return zzezgVar.zzd;
    }
}
