package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjp implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        try {
            zzfrv.zzj(zzcfeVar.getContext()).zzk();
            zzfrw.zzi(zzcfeVar.getContext()).zzj();
            zzfrx.zza(zzcfeVar.getContext()).zzb(null);
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
