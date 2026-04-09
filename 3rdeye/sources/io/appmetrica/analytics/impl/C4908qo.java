package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.qo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4908qo {

    /* renamed from: a, reason: collision with root package name */
    public final C4959so f41502a;

    public C4908qo(C4769lf c4769lf, C4996ua c4996ua) {
        this.f41502a = new C4959so(c4769lf, c4996ua, new androidx.work.s());
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC5122zb.a(jSONObject2, "last_migration_api_level", AbstractC5122zb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        C4959so c4959so = this.f41502a;
        c4959so.a(c4959so.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f41502a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        C4959so c4959so = this.f41502a;
        c4959so.a(c4959so.a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized io.appmetrica.analytics.impl.C5102yg b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.so r0 = r2.f41502a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = y9.C5819a.f48359b     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            int r1 = r0.length     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            goto L26
        L20:
            io.appmetrica.analytics.impl.yg r1 = new io.appmetrica.analytics.impl.yg     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = 0
        L27:
            monitor-exit(r2)
            return r1
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4908qo.b():io.appmetrica.analytics.impl.yg");
    }

    public final synchronized void a(String str) {
        C4959so c4959so = this.f41502a;
        c4959so.a(c4959so.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f41502a.a(), "device_id_hash");
    }

    public final synchronized void a(C5102yg c5102yg) {
        try {
            C4959so c4959so = this.f41502a;
            c4959so.a(c4959so.a().put("referrer", c5102yg != null ? new String(Base64.encode(c5102yg.a(), 0), C5819a.f48359b) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
