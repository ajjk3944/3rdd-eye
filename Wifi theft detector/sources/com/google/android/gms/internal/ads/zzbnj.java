package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbnj implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            zzgal.zzh(zzcjlVar.getContext()).zzk();
            zzgam.zzh(zzcjlVar.getContext()).zzj();
            zzgan.zza(zzcjlVar.getContext()).zzb(null);
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
