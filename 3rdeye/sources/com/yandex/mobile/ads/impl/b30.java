package com.yandex.mobile.ads.impl;

import i6.C4458a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b30 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f25072a;

    /* renamed from: b, reason: collision with root package name */
    private final a20 f25073b;

    /* renamed from: c, reason: collision with root package name */
    private final c20 f25074c;

    /* renamed from: d, reason: collision with root package name */
    private final y20 f25075d;

    /* renamed from: e, reason: collision with root package name */
    private final lj f25076e;

    public /* synthetic */ b30(mp1 mp1Var) {
        this(mp1Var, new a20(mp1Var), new c20(), new y20(), new lj());
    }

    public final w20 a(v00 design, boolean z10) {
        kotlin.jvm.internal.l.f(design, "design");
        if (kotlin.jvm.internal.l.b(b10.f25040c.a(), design.d())) {
            try {
                String strC = design.c();
                String strB = design.b();
                if (z10) {
                    this.f25076e.getClass();
                    strB = lj.a(strB);
                }
                JSONObject jSONObject = new JSONObject(strB);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List<jj0> listA = design.a();
                a20 a20Var = this.f25073b;
                kotlin.jvm.internal.l.c(jSONObject2);
                N7.U3 u3A = a20Var.a(jSONObject2, jSONObject3);
                this.f25074c.getClass();
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.l.e(string, "toString(...)");
                C4458a c4458a = new C4458a(string);
                Set<n20> setA = this.f25075d.a(jSONObject2);
                if (u3A != null) {
                    return new w20(strC, jSONObject2, jSONObject3, listA, u3A, c4458a, setA);
                }
            } catch (Throwable th) {
                this.f25072a.reportError("Failed to parse DivKit design", th);
            }
        }
        return null;
    }

    public b30(mp1 reporter, a20 divDataCreator, c20 divDataTagCreator, y20 assetsProvider, lj base64Decoder) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divDataCreator, "divDataCreator");
        kotlin.jvm.internal.l.f(divDataTagCreator, "divDataTagCreator");
        kotlin.jvm.internal.l.f(assetsProvider, "assetsProvider");
        kotlin.jvm.internal.l.f(base64Decoder, "base64Decoder");
        this.f25072a = reporter;
        this.f25073b = divDataCreator;
        this.f25074c = divDataTagCreator;
        this.f25075d = assetsProvider;
        this.f25076e = base64Decoder;
    }
}
