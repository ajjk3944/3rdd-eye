package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.google.android.gms.common.internal.ImagesContract;
import com.singular.sdk.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j80 {

    /* renamed from: a, reason: collision with root package name */
    private final l80 f29015a;

    /* renamed from: b, reason: collision with root package name */
    private final C4082c f29016b;

    public /* synthetic */ j80(int i) {
        this(new l80(), new C4082c());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0001, B:6:0x0006, B:9:0x0020, B:10:0x0031, B:13:0x0036, B:16:0x0050, B:18:0x006b, B:25:0x0086, B:21:0x007f), top: B:30:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0001, B:6:0x0006, B:9:0x0020, B:10:0x0031, B:13:0x0036, B:16:0x0050, B:18:0x006b, B:25:0x0086, B:21:0x007f), top: B:30:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.i80 a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c
            if (r14 != 0) goto L6
            return r0
        L6:
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.ns$a r14 = com.yandex.mobile.ads.impl.ns.f30987c     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "ad_type"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.l.e(r2, r3)     // Catch: java.lang.Throwable -> L8c
            r14.getClass()     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.ns r5 = com.yandex.mobile.ads.impl.ns.a.a(r2)     // Catch: java.lang.Throwable -> L8c
            if (r5 != 0) goto L20
            return r0
        L20:
            java.lang.String r14 = "start_time"
            long r6 = r1.getLong(r14)     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.l80 r14 = r13.f29015a     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "false_click"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L8c
            r14.getClass()     // Catch: java.lang.Throwable -> L8c
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            if (r2 != 0) goto L36
            goto L4f
        L36:
            r14.<init>(r2)     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            java.lang.String r2 = "url"
            java.lang.String r2 = r14.getString(r2)     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            java.lang.String r3 = "interval"
            long r3 = r14.getLong(r3)     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.h80 r14 = new com.yandex.mobile.ads.impl.h80     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            kotlin.jvm.internal.l.c(r2)     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            r14.<init>(r2, r3)     // Catch: org.json.JSONException -> L4f java.lang.Throwable -> L8c
            r9 = r14
            goto L50
        L4f:
            r9 = r0
        L50:
            java.util.HashMap r10 = a(r1)     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.c r14 = r13.f29016b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "ab_experiments"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> L8c
            r14.getClass()     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.b r11 = com.yandex.mobile.ads.impl.C4082c.a(r2)     // Catch: java.lang.Throwable -> L8c
            com.yandex.mobile.ads.impl.k0$a[] r14 = com.yandex.mobile.ads.impl.C4139k0.a.values()     // Catch: java.lang.Throwable -> L8c
            int r2 = r14.length     // Catch: java.lang.Throwable -> L8c
            r3 = 0
        L69:
            if (r3 >= r2) goto L82
            r4 = r14[r3]     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r4.a()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r12 = "type"
            java.lang.String r12 = r1.getString(r12)     // Catch: java.lang.Throwable -> L8c
            boolean r8 = kotlin.jvm.internal.l.b(r8, r12)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L7f
            r8 = r4
            goto L83
        L7f:
            int r3 = r3 + 1
            goto L69
        L82:
            r8 = r0
        L83:
            if (r8 != 0) goto L86
            return r0
        L86:
            com.yandex.mobile.ads.impl.i80 r4 = new com.yandex.mobile.ads.impl.i80     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8c
            r0 = r4
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j80.a(java.lang.String):com.yandex.mobile.ads.impl.i80");
    }

    public j80(l80 falseClickFormatter, C4082c abExperimentDataConverter) {
        kotlin.jvm.internal.l.f(falseClickFormatter, "falseClickFormatter");
        kotlin.jvm.internal.l.f(abExperimentDataConverter, "abExperimentDataConverter");
        this.f29015a = falseClickFormatter;
        this.f29016b = abExperimentDataConverter;
    }

    private static HashMap a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> itKeys = jSONObject2.keys();
            kotlin.jvm.internal.l.e(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                kotlin.jvm.internal.l.c(next);
                map.put(next, jSONObject2.get(next));
            }
            C1992A c1992a = C1992A.f18074a;
            return map;
        } catch (Throwable th) {
            b9.n.a(th);
            return map;
        }
    }

    public final String a(i80 i80Var) throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ADMON_AD_TYPE, i80Var.c().b());
        jSONObject.put("start_time", i80Var.f());
        jSONObject.put("type", i80Var.b().a());
        l80 l80Var = this.f29015a;
        h80 h80VarD = i80Var.d();
        l80Var.getClass();
        String string2 = null;
        if (h80VarD != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", h80VarD.c());
            jSONObject2.put(ImagesContract.URL, h80VarD.d());
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(i80Var.e()));
        C4082c c4082c = this.f29016b;
        C4075b c4075bA = i80Var.a();
        c4082c.getClass();
        if (c4075bA != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("experiments", c4075bA.a());
            jSONObject3.put("test_ids", c4075bA.b());
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        return jSONObject.toString();
    }
}
