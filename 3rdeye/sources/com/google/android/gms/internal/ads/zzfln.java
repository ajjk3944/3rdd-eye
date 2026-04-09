package com.google.android.gms.internal.ads;

import R1.d;
import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfln implements d.a {
    final /* synthetic */ zzflo zza;

    public zzfln(zzflo zzfloVar) {
        this.zza = zzfloVar;
    }

    @Override // R1.d.a
    public final void onPostMessage(WebView webView, R1.c cVar, Uri uri, boolean z10, R1.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzflo.zze(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzflo.zzc(this.zza, string2);
            } else {
                zzfla.zza.getClass();
            }
        } catch (JSONException e4) {
            zzfmw.zza("Error parsing JS message in JavaScriptSessionService.", e4);
        }
    }
}
