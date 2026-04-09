package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C2001h;
import b9.InterfaceC2000g;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4519bn implements InterfaceC4934s {

    /* renamed from: b, reason: collision with root package name */
    public final C4985u f40595b;

    /* renamed from: a, reason: collision with root package name */
    public final C4960t f40594a = new C4960t();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2000g f40596c = C2001h.b(new C4493an(this));

    public C4519bn(Context context) {
        this.f40595b = new C4985u(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4934s
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.f40596c.getValue());
        return map;
    }
}
