package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayf extends zzayi {
    private final View zzh;

    public zzayf(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, View view) {
        super(zzawvVar, "h7NW4UTeHoapcAfHjNS1jSIEsdu+S9XbBUhqH3zqKlRoFqG3FEF52d6iyzd+cmzU", "UQVAYGHTy6RzP6i5dxbs04Nz2BVdis2XDzzm3D3JwpQ=", zzasrVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdG);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlj);
            zzawz zzawzVar = new zzawz((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzatm zzatmVarZza = zzatn.zza();
            zzatmVarZza.zzb(zzawzVar.zza.longValue());
            zzatmVarZza.zzd(zzawzVar.zzb.longValue());
            zzatmVarZza.zze(zzawzVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzatmVarZza.zzc(zzawzVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzatmVarZza.zza(zzawzVar.zzd.longValue());
            }
            this.zzd.zzW((zzatn) zzatmVarZza.zzbr());
        }
    }
}
