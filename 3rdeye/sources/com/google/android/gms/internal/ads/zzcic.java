package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcic implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzcic(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvi zzb() {
        Context contextZza = ((zzchg) this.zza).zza();
        zzfhp zzfhpVar = (zzfhp) this.zzb.zzb();
        zzbou zzbouVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, VersionInfoParcel.forPackage(), zzfhpVar);
        zzboo zzbooVar = zzbor.zza;
        zzbouVarZzb.zza("google.afma.request.getAdDictionary", zzbooVar, zzbooVar);
        return new zzbvk(contextZza, com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, VersionInfoParcel.forPackage(), zzfhpVar).zza("google.afma.sdkConstants.getSdkConstants", zzbooVar, zzbooVar), VersionInfoParcel.forPackage());
    }
}
