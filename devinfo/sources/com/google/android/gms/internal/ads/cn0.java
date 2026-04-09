package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10173a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10174b;

    public /* synthetic */ cn0(HashMap map, int i4) {
        this.f10173a = i4;
        this.f10174b = map;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) throws JSONException {
        switch (this.f10173a) {
            case 0:
                t50 t50Var = (t50) obj;
                HashMap map = this.f10174b;
                if (!map.isEmpty()) {
                    Bundle bundle = t50Var.f16705a;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : map.entrySet()) {
                        ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                        if (!arrayDeque.isEmpty()) {
                            ae0 ae0Var = (ae0) entry.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(FacebookMediationAdapter.KEY_ID, ae0Var.f9312a);
                                jSONObject.put("event_type", ae0Var.f9313b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException e2) {
                                ya.a0.n("Failed putting the on-device storage record.", e2);
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
                    ((JSONObject) obj).put("video_decoders", va.r.g.f36157a.j(this.f10174b));
                    break;
                } catch (JSONException e10) {
                    ya.a0.m("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        int i4 = this.f10173a;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
