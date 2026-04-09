package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdgn implements zzcqy {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhgn zzd;
    private final zzdix zze;

    public zzdgn(Map map, Map map2, Map map3, zzhgn zzhgnVar, zzdix zzdixVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhgnVar;
        this.zze = zzdixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final zzede zza(int i, String str) {
        zzede zzedeVarZza;
        zzede zzedeVar = (zzede) this.zza.get(str);
        if (zzedeVar != null) {
            return zzedeVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefn zzefnVar = (zzefn) this.zzc.get(str);
            if (zzefnVar != null) {
                return new zzedf(zzefnVar, new zzfut() { // from class: com.google.android.gms.internal.ads.zzcra
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return new zzcrd((List) obj);
                    }
                });
            }
            zzedeVarZza = (zzede) this.zzb.get(str);
            if (zzedeVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzedeVarZza = ((zzcqy) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzedf(zzedeVarZza, new zzfut() { // from class: com.google.android.gms.internal.ads.zzcrb
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzcrd((zzcqv) obj);
            }
        });
    }
}
