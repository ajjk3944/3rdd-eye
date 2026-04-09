package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import b2.g;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzfst implements g.a {
    final /* synthetic */ zzfsv zza;

    public zzfst(zzfsv zzfsvVar) {
        Objects.requireNonNull(zzfsvVar);
        this.zza = zzfsvVar;
    }

    @Override // b2.g.a
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z10, b2.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfsg.zza.getClass();
            }
        } catch (JSONException e10) {
            zzfue.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
