package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdkm implements zzgcx {
    final /* synthetic */ zzdkn zza;

    public zzdkm(zzdkn zzdknVar) {
        this.zza = zzdknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcfe zzcfeVar = (zzcfe) list.get(0);
            if (zzcfeVar != null) {
                this.zza.zzb(zzcfeVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e4) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "omid native display exp");
            }
        }
    }
}
