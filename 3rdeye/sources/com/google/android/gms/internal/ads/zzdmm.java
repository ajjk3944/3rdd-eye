package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdmm {
    private final Executor zza;
    private final zzcns zzb;
    private final zzddq zzc;
    private final zzcml zzd;

    public zzdmm(Executor executor, zzcns zzcnsVar, zzddq zzddqVar, zzcml zzcmlVar) {
        this.zza = executor;
        this.zzc = zzddqVar;
        this.zzb = zzcnsVar;
        this.zzd = zzcmlVar;
    }

    public final void zzc(final zzcfe zzcfeVar) {
        if (zzcfeVar == null) {
            return;
        }
        zzddq zzddqVar = this.zzc;
        zzddqVar.zza(zzcfeVar.zzF());
        zzazb zzazbVar = new zzazb() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzazb
            public final void zzdr(zzaza zzazaVar) {
                zzcgw zzcgwVarZzN = zzcfeVar.zzN();
                Rect rect = zzazaVar.zzd;
                zzcgwVarZzN.zzr(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzddqVar.zzo(zzazbVar, executor);
        zzddqVar.zzo(new zzazb() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzazb
            public final void zzdr(zzaza zzazaVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzazaVar.zzj ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                zzcfeVar.zzd("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcns zzcnsVar = this.zzb;
        zzddqVar.zzo(zzcnsVar, executor);
        zzcnsVar.zzf(zzcfeVar);
        zzcgw zzcgwVarZzN = zzcfeVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzks)).booleanValue() && zzcgwVarZzN != null) {
            zzcml zzcmlVar = this.zzd;
            zzcgwVarZzN.zzN(zzcmlVar);
            zzcgwVarZzN.zzO(zzcmlVar, null, null);
        }
        zzcfeVar.zzag("/trackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzd();
            }
        });
        zzcfeVar.zzag("/untrackActiveViewUnit", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdml
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzb();
            }
        });
    }
}
