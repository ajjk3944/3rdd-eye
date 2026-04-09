package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdhd implements zzbkd {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdhd(zzdhg zzdhgVar, View view, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznc)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        if (zzdhgVar == null) {
            return;
        }
        zzdhgVar.zzg.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznc)).booleanValue()) {
            zzdhgVar.zzE.zza((View) this.zzb.get(), zzdhgVar.zzj);
        }
    }
}
