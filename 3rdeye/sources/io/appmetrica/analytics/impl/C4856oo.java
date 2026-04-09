package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.oo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4856oo implements InterfaceC4830no {

    /* renamed from: a, reason: collision with root package name */
    public final S8 f41400a;

    public C4856oo() {
        this(new S8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        if (!((C4940s5) c5028vh.f41868l).A() && !TextUtils.isEmpty(c4557d9.f40723b)) {
            try {
                JSONObject jSONObject = new JSONObject(c4557d9.f40723b);
                jSONObject.remove("preloadInfo");
                c4557d9.f40723b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f41400a.a(c4557d9, c5028vh);
    }

    public C4856oo(S8 s82) {
        this.f41400a = s82;
    }
}
