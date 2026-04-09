package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2253zs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17987a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17988b;

    public /* synthetic */ C2253zs(HashMap map, int i) {
        this.f17987a = i;
        this.f17988b = map;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) throws JSONException {
        switch (this.f17987a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                HashMap map = this.f17988b;
                if (!map.isEmpty()) {
                    Bundle bundle = c0797Wj.f12308a;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : map.entrySet()) {
                        ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                        if (!arrayDeque.isEmpty()) {
                            C1226go c1226go = (C1226go) entry.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", c1226go.f14376a);
                                jSONObject.put("event_type", c1226go.f14377b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException e6) {
                                AbstractC2907C.n("Failed putting the on-device storage record.", e6);
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
                    ((JSONObject) obj).put("video_decoders", q2.r.f23260g.f23261a.j(this.f17988b));
                    break;
                } catch (JSONException e7) {
                    AbstractC2907C.m("Could not encode video decoder properties: ".concat(String.valueOf(e7.getMessage())));
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f17987a;
    }
}
