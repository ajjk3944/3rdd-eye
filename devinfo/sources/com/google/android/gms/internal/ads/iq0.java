package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iq0 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12420a;

    public iq0(JSONObject jSONObject) {
        this.f12420a = jSONObject;
    }

    public final int a() {
        int iOptInt = this.f12420a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
