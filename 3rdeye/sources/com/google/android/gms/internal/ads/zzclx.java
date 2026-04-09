package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import g0.C4356c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzclx implements zzclb {
    private final CookieManager zza;

    public zzclx(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzs().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzba), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzba);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZzf = zzfvt.zzb(zzfup.zzc(';')).zzf(cookie);
            for (int i = 0; i < listZzf.size(); i++) {
                Iterator it = zzfvt.zzb(zzfup.zzc('=')).zzd((String) listZzf.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(C4356c.i(0, "position (0) must be less than the number of elements that remained (", ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaM))));
            }
        }
    }
}
