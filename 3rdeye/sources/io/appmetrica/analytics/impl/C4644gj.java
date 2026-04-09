package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4644gj extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final Ff f40949b;

    public C4644gj(C4940s5 c4940s5) {
        this(c4940s5, Ga.j().s());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(c4683i6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f40949b.b(Cf.a(jSONObjectOptJSONObject));
        return false;
    }

    public C4644gj(C4940s5 c4940s5, Ff ff) {
        super(c4940s5);
        this.f40949b = ff;
    }
}
