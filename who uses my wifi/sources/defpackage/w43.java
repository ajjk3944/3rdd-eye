package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w43 implements n53 {
    public final /* synthetic */ int a;
    public final HashMap b;

    public /* synthetic */ w43(HashMap map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.n53
    public final void c(Object obj) throws JSONException {
        switch (this.a) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                HashMap map = this.b;
                if (!map.isEmpty()) {
                    Bundle bundle = jm2Var.a;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : map.entrySet()) {
                        ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                        if (!arrayDeque.isEmpty()) {
                            wv2 wv2Var = (wv2) entry.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", wv2Var.a);
                                jSONObject.put("event_type", wv2Var.b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException unused) {
                                gi2.R();
                            }
                        }
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("on_device_storage_records", jSONArray.toString());
                        break;
                    }
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", sv1.f.a.i(this.b));
                    break;
                } catch (JSONException e) {
                    gi2.G("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
                }
        }
    }
}
