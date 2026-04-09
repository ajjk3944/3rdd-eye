package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdhb implements zzbkd {
    private final WeakReference zza;

    public /* synthetic */ zzdhb(zzdhg zzdhgVar, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        if (zzdhgVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdhgVar.zzh.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
                zzdhgVar.zzi.zzdf();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdhgVar.zzi.zzu();
            }
        }
    }
}
