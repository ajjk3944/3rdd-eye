package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcgb implements zzbkd {
    final /* synthetic */ zzcgd zza;

    public zzcgb(zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                zzcgd zzcgdVar = this.zza;
                synchronized (zzcgdVar) {
                    try {
                        if (zzcgdVar.zzI != i) {
                            zzcgdVar.zzI = i;
                            zzcgdVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e4) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Exception occurred while getting webview content height", e4);
            }
        }
    }
}
