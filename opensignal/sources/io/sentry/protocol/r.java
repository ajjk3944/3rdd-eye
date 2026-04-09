package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import io.sentry.z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class r implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12625a;

    /* renamed from: d, reason: collision with root package name */
    public String f12626d;

    /* renamed from: g, reason: collision with root package name */
    public CopyOnWriteArraySet f12627g;

    /* renamed from: r, reason: collision with root package name */
    public CopyOnWriteArraySet f12628r;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12629x;

    public r(String str, String str2) {
        this.f12625a = str;
        this.f12626d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f12625a.equals(rVar.f12625a) && this.f12626d.equals(rVar.f12626d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12625a, this.f12626d});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("name");
        bVar.V(this.f12625a);
        bVar.I("version");
        bVar.V(this.f12626d);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f12627g;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = z4.d().f12886b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f12628r;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = z4.d().f12885a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            bVar.I("packages");
            bVar.S(u0Var, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            bVar.I("integrations");
            bVar.S(u0Var, copyOnWriteArraySet2);
        }
        HashMap map = this.f12629x;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12629x, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
