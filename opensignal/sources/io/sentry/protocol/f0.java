package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12551a;

    /* renamed from: d, reason: collision with root package name */
    public final List f12552d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12553g;

    public f0(String str, List list) {
        this.f12551a = str;
        this.f12552d = list;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        String str = this.f12551a;
        if (str != null) {
            bVar.I("rendering_system");
            bVar.V(str);
        }
        List list = this.f12552d;
        if (list != null) {
            bVar.I("windows");
            bVar.S(u0Var, list);
        }
        HashMap map = this.f12553g;
        if (map != null) {
            for (String str2 : map.keySet()) {
                h0.b.C(this.f12553g, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
    }
}
