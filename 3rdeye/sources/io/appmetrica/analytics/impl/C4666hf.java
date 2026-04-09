package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4666hf extends Ld {

    /* renamed from: d, reason: collision with root package name */
    public static final C4743kf f40998d = new C4743kf("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C4743kf f40999e = new C4743kf("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C4743kf f41000f = new C4743kf("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C4743kf f41001g = new C4743kf("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4743kf f41002h = new C4743kf("AD_URL_REPORT_RESULT", null);
    public static final C4743kf i = new C4743kf("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C4743kf f41003j = new C4743kf("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C4743kf f41004k = new C4743kf("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C4743kf f41005l = new C4743kf("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C4743kf f41006m = new C4743kf("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C4743kf f41007n = new C4743kf("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C4743kf f41008o = new C4743kf("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C4743kf f41009p = new C4743kf("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C4743kf f41010q = new C4743kf("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C4743kf f41011r = new C4743kf("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C4743kf f41012s = new C4743kf("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final C4743kf f41013t = new C4743kf("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final C4743kf f41014u = new C4743kf("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final C4743kf f41015v = new C4743kf("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final C4743kf f41016w = new C4743kf("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final C4743kf f41017x = new C4743kf("APPMETRICA_CLIENT_CONFIG", null);

    public C4666hf(InterfaceC4481ab interfaceC4481ab) {
        super(interfaceC4481ab);
    }

    public final boolean a(boolean z10) {
        return this.f41115a.getBoolean(f41013t.f41141b, z10);
    }

    public final long b(long j4) {
        return this.f41115a.getLong(f41003j.f41140a, j4);
    }

    public final C4666hf c(IdentifiersResult identifiersResult) {
        return a(f41005l.f41141b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f41001g.f41141b);
    }

    public final IdentifiersResult e() {
        return h(f41002h.f41141b);
    }

    public final C4666hf f(IdentifiersResult identifiersResult) {
        return a(f41010q.f41141b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f41005l.f41141b);
    }

    public final IdentifiersResult i() {
        return h(f41000f.f41141b);
    }

    public final IdentifiersResult j() {
        return h(f40999e.f41141b);
    }

    public final C4842oa k() {
        String string = this.f41115a.getString(f41016w.f41141b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C4842oa(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C4842oa(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f41010q.f41141b);
    }

    public final IdentifiersResult m() {
        return h(f41011r.f41141b);
    }

    public final long n() {
        return this.f41115a.getLong(f41009p.f41141b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f41004k.f41141b);
    }

    public final ScreenInfo p() {
        return AbstractC5122zb.e(this.f41115a.getString(f41014u.f41141b, null));
    }

    public final IdentifiersResult q() {
        return h(f40998d.f41141b);
    }

    public final IdentifiersResult r() {
        return h(f41012s.f41141b);
    }

    public final boolean s() {
        return this.f41115a.getBoolean(f41007n.f41141b, false);
    }

    public final boolean t() {
        return this.f41115a.getBoolean(f41015v.f41141b, false);
    }

    public final C4666hf u() {
        return (C4666hf) b(f41007n.f41141b, true);
    }

    public final void v() {
        b(f41015v.f41141b, true);
    }

    public final List<String> g() {
        String string = this.f41115a.getString(i.f41141b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC5122zb.b(string);
    }

    public final long a(long j4) {
        return this.f41115a.getLong(f41008o.f41141b, j4);
    }

    public final C4666hf b(IdentifiersResult identifiersResult) {
        return a(f41002h.f41141b, identifiersResult);
    }

    public final C4666hf c(long j4) {
        return (C4666hf) b(f41008o.f41141b, j4);
    }

    public final C4666hf d(IdentifiersResult identifiersResult) {
        return a(f41000f.f41141b, identifiersResult);
    }

    public final C4666hf e(IdentifiersResult identifiersResult) {
        return a(f40999e.f41141b, identifiersResult);
    }

    public final AppMetricaConfig f() {
        String string = this.f41115a.getString(f41017x.f41141b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f41115a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    public final C4666hf i(IdentifiersResult identifiersResult) {
        return a(f40998d.f41141b, identifiersResult);
    }

    public final C4666hf j(IdentifiersResult identifiersResult) {
        return a(f41012s.f41141b, identifiersResult);
    }

    public final C4666hf g(IdentifiersResult identifiersResult) {
        return a(f41011r.f41141b, identifiersResult);
    }

    public final C4666hf a(IdentifiersResult identifiersResult) {
        return a(f41001g.f41141b, identifiersResult);
    }

    public final C4666hf b(boolean z10) {
        return (C4666hf) b(f41013t.f41141b, z10);
    }

    public final C4666hf d(long j4) {
        return (C4666hf) b(f41009p.f41141b, j4);
    }

    public final C4666hf e(long j4) {
        return (C4666hf) b(f41003j.f41141b, j4);
    }

    public final String i(String str) {
        return this.f41115a.getString(f41006m.f41141b, str);
    }

    public final C4666hf j(String str) {
        return (C4666hf) b(f41006m.f41141b, str);
    }

    @Override // io.appmetrica.analytics.impl.Ld
    public final String f(String str) {
        return new C4743kf(str, null).f41141b;
    }

    public final C4666hf a(List<String> list) {
        return (C4666hf) b(i.f41141b, AbstractC4623fo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C4666hf h(IdentifiersResult identifiersResult) {
        return a(f41004k.f41141b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Ld
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C4666hf g(String str) {
        return (C4666hf) d(new C4743kf(str, null).f41141b);
    }

    public final C4666hf a(C4842oa c4842oa) {
        String str = f41016w.f41141b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c4842oa.f41368a).put("STATUS", c4842oa.f41369b.getValue()).putOpt("ERROR_EXPLANATION", c4842oa.f41370c);
        } catch (Throwable unused) {
        }
        return (C4666hf) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f41014u.f41141b, AbstractC5122zb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f41017x.f41141b, appMetricaConfig.toJson());
    }

    public final C4666hf a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
