package com.bytedance.sdk.openadsdk.yu;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends ouw {

    /* renamed from: lh, reason: collision with root package name */
    public static final SimpleDateFormat f8779lh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public le(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.yu.ouw
    public final JSONObject yu() {
        return this.vt;
    }
}
