package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkw implements zzbkd {
    private final Context zza;

    public zzbkw(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(AppIntroBaseFragmentKt.ARG_TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(AppIntroBaseFragmentKt.ARG_TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzr();
            com.google.android.gms.ads.internal.util.zzs.zzU(this.zza, intent);
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to open Share Sheet", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
