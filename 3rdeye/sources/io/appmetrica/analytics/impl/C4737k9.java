package io.appmetrica.analytics.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4737k9 {

    /* renamed from: a, reason: collision with root package name */
    public final C4933ro f41135a;

    public C4737k9(C4933ro c4933ro) {
        this.f41135a = c4933ro;
    }

    public final void a(int i, long j4) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        C4933ro c4933ro = this.f41135a;
        synchronized (c4933ro) {
            jSONObjectOptJSONObject = c4933ro.f41594a.a().optJSONObject("numbers_of_type");
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(String.valueOf(i), j4);
        this.f41135a.a(jSONObjectOptJSONObject);
    }
}
