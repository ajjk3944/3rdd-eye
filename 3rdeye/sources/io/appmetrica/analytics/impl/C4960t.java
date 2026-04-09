package io.appmetrica.analytics.impl;

import c9.C2097r;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4960t implements InterfaceC5010v {

    /* renamed from: a, reason: collision with root package name */
    public final String f41656a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) C2097r.y0(C5065x4.l().m().f41706d, E.u.G(this.f41656a))).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
