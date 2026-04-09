package com.yandex.mobile.ads.impl;

import N7.V3;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a20 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f24392a;

    /* renamed from: b, reason: collision with root package name */
    private final g30 f24393b;

    /* renamed from: c, reason: collision with root package name */
    private final b20 f24394c;

    public /* synthetic */ a20(mp1 mp1Var) {
        this(mp1Var, new g30(), new b20());
    }

    public final N7.U3 a(JSONObject card, JSONObject jSONObject) {
        int i = 0;
        kotlin.jvm.internal.l.f(card, "card");
        try {
            this.f24393b.getClass();
            Z6.a aVar = new Z6.a(new B7.a(new B7.b(0), new B7.d(i)));
            if (jSONObject != null) {
                aVar.b(jSONObject);
            }
            this.f24394c.getClass();
            int i10 = N7.U3.i;
            return ((V3.b) D7.a.f1071b.f6419B2.getValue()).a(aVar, card);
        } catch (Throwable th) {
            this.f24392a.reportError("Failed to create DivData", th);
            return null;
        }
    }

    public a20(mp1 reporter, g30 divParsingEnvironmentFactory, b20 divDataFactory) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divParsingEnvironmentFactory, "divParsingEnvironmentFactory");
        kotlin.jvm.internal.l.f(divDataFactory, "divDataFactory");
        this.f24392a = reporter;
        this.f24393b = divParsingEnvironmentFactory;
        this.f24394c = divDataFactory;
    }
}
