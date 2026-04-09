package io.appmetrica.analytics.screenshot.impl;

import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final V f42502a;

    /* renamed from: b, reason: collision with root package name */
    public final U f42503b;

    public I() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G parse(JSONObject jSONObject) {
        K k10;
        M m10;
        N n9;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC5148n.f42576a);
        V v10 = this.f42502a;
        U u8 = this.f42503b;
        u8.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            n9 = new N();
            n9.f42515a = new K();
            n9.f42516b = new M();
            L l5 = new L();
            l5.f42510c = AbstractC5148n.f42577b;
            n9.f42517c = l5;
        } else {
            N n10 = new N();
            u8.f42525a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            L l10 = null;
            if (jSONObjectOptJSONObject2 == null) {
                k10 = null;
            } else {
                k10 = new K();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    k10.f42506a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (k10 != null) {
                n10.f42515a = k10;
            }
            u8.f42526b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                m10 = null;
            } else {
                m10 = new M();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    m10.f42512a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    m10.f42513b = lOptLongOrNull.longValue();
                }
            }
            if (m10 != null) {
                n10.f42516b = m10;
            }
            u8.f42527c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                l10 = new L();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    l10.f42508a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    v9.g gVarO = v9.h.O(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(C2092m.T(gVarO, 10));
                    v9.f it = gVarO.iterator();
                    while (it.f47101d) {
                        arrayList.add(jSONArrayOptJSONArray.getString(it.a()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    l10.f42510c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    l10.f42509b = lOptLongOrNull2.longValue();
                }
            }
            if (l10 != null) {
                n10.f42517c = l10;
            }
            n9 = n10;
        }
        return new G(zExtractFeature, v10.toModel(n9));
    }

    public final G b(JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (G) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public I(V v10, U u8) {
        this.f42502a = v10;
        this.f42503b = u8;
    }

    public /* synthetic */ I(V v10, U u8, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new V(null, null, null, 7, null) : v10, (i & 2) != 0 ? new U() : u8);
    }
}
