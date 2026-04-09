package com.yandex.mobile.ads.impl;

import b9.m;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vj1 {

    /* renamed from: a, reason: collision with root package name */
    private final d82 f34608a;

    /* renamed from: b, reason: collision with root package name */
    private final c80 f34609b;

    public /* synthetic */ vj1(d82 d82Var) {
        this(d82Var, new c80());
    }

    public final tj1 a(JSONObject jsonObject) throws k61, JSONException {
        Object objA;
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        String strA = y81.a(jsonObject, "jsonAsset", "package", "jsonAttribute", "package");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        this.f34608a.getClass();
        String strA2 = d82.a(ImagesContract.URL, jsonObject);
        LinkedHashMap linkedHashMapA = this.f34609b.a(jsonObject.optJSONObject("extras"));
        try {
            objA = Integer.valueOf(jsonObject.getInt("flags"));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        sy syVar = null;
        if (objA instanceof m.a) {
            objA = null;
        }
        Integer num = (Integer) objA;
        String strA3 = jq0.a("launchMode", jsonObject);
        sy.f33318b.getClass();
        Iterator<sy> it = sy.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sy next = it.next();
            if (y9.n.U(next.name(), strA3, true)) {
                syVar = next;
                break;
            }
        }
        sy syVar2 = syVar;
        if (syVar2 == null) {
            syVar2 = sy.f33319c;
        }
        return new tj1(strA, strA2, linkedHashMapA, num, syVar2);
    }

    public vj1(d82 urlJsonParser, c80 extrasParser) {
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(extrasParser, "extrasParser");
        this.f34608a = urlJsonParser;
        this.f34609b = extrasParser;
    }
}
