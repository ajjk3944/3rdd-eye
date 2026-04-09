package uh;

import ak.y;
import android.net.Uri;
import android.text.TextUtils;
import ch.n;
import java.util.HashMap;
import nh.h;
import nh.l;
import org.json.JSONException;
import org.json.JSONObject;
import sm.m;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: h, reason: collision with root package name */
    public final y f23561h;

    public a(q3.a aVar, qm.c cVar, String str, h hVar, m mVar, y yVar, wh.a aVar2) {
        super(aVar, cVar, str, hVar, mVar, aVar2);
        this.f23561h = yVar;
    }

    @Override // dt.w
    public final l c(String str, String str2) throws JSONException {
        String strI;
        String string;
        n.b("InnerTubeResourceGetter", "getResource() called with: videoId = [" + str + "], urlFormat = [" + str2 + "]");
        qm.c cVar = (qm.c) this.f7548c;
        if (TextUtils.isEmpty(str) || !((q3.a) this.f7547b).K0()) {
            strI = "";
        } else {
            y yVar = this.f23561h;
            Uri uriBuild = Uri.parse(yVar.f790a).buildUpon().appendQueryParameter("key", yVar.f791b).appendQueryParameter("video_id", str).build();
            HashMap map = new HashMap();
            map.put("User-Agent", yVar.f794e);
            map.put("Content-Type", "application/json; charset=utf-8");
            cVar.K();
            String str3 = yVar.f792c;
            String str4 = yVar.f793d;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("clientName", str3);
                jSONObject.put("clientVersion", str4);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("client", jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("context", jSONObject2);
                string = jSONObject3.toString();
            } catch (JSONException e4) {
                n.e("InnerTubeResourceGetter", e4);
                string = "{}";
            }
            strI = cVar.I(uriBuild.toString(), string, map);
        }
        return d(strI);
    }
}
