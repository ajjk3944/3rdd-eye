package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbpb implements zzboh {
    private final Context zza;

    public zzbpb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (!map.containsKey(MimeTypes.BASE_TYPE_TEXT) || TextUtils.isEmpty((CharSequence) map.get(MimeTypes.BASE_TYPE_TEXT))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(MimeTypes.BASE_TYPE_TEXT))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get(MimeTypes.BASE_TYPE_TEXT));
        if (map.containsKey(CampaignEx.JSON_KEY_TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(CampaignEx.JSON_KEY_TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(this.zza, intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
