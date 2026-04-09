package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzefe implements zzdgg {
    private final zzfbt zza;
    private final zzbrn zzb;
    private final AdFormat zzc;
    private zzcwj zzd = null;

    public zzefe(zzfbt zzfbtVar, zzbrn zzbrnVar, AdFormat adFormat) {
        this.zza = zzfbtVar;
        this.zzb = zzbrnVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z10, Context context, zzcwe zzcweVar) throws zzdgf {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdgf("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                zzcwj zzcwjVar = this.zzd;
                if (zzcwjVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbG)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwjVar.zza();
                return;
            }
            throw new zzdgf("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgf(th);
        }
    }

    public final void zzc(zzcwj zzcwjVar) {
        this.zzd = zzcwjVar;
    }
}
