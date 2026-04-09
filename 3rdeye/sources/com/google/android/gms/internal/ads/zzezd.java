package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzezd implements zzfut {
    final /* synthetic */ zzezg zza;

    public zzezd(zzezg zzezgVar) {
        this.zza = zzezgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbvo zzbvoVar = (zzbvo) obj;
        zzeze zzezeVar = new zzeze(zzbvoVar, new zzfen(zzbvoVar.zzj), null);
        zzezg zzezgVar = this.zza;
        zzezgVar.zzd = zzezeVar;
        return zzezgVar.zzd;
    }
}
