package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcup implements zzcxf, zzcwm {
    private final zzfbt zza;

    public zzcup(Context context, zzfbt zzfbtVar, zzbtt zzbttVar) {
        this.zza = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzbtu zzbtuVar = this.zza.zzad;
        if (zzbtuVar == null || !zzbtuVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbtuVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
    }
}
