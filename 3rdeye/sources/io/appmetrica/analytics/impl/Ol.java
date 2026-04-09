package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Ol implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f39946a;

    /* renamed from: b, reason: collision with root package name */
    public final C4912r3 f39947b;

    public Ol() {
        this(new Vl(), new C4912r3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4492am handle(ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC4623fo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f39947b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Vl vl = this.f39946a;
                vl.getClass();
                C4492am c4492am = new C4492am();
                try {
                    vl.i.getClass();
                    C5097yb c5097yb = new C5097yb(new String(responseData, Constants.ENCODING));
                    JSONObject jSONObjectOptJSONObject = c5097yb.optJSONObject("device_id");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c4492am.f40537h = strOptString2;
                    c4492am.i = strOptString;
                    vl.a(c4492am, c5097yb);
                    c4492am.f40530a = TextUtils.isEmpty(c4492am.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c4492am = new C4492am();
                    c4492am.f40530a = 1;
                }
                if (2 == c4492am.f40530a) {
                    return c4492am;
                }
            }
        }
        return null;
    }

    public Ol(Vl vl, C4912r3 c4912r3) {
        this.f39946a = vl;
        this.f39947b = c4912r3;
    }
}
