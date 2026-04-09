package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12638a;

    /* renamed from: d, reason: collision with root package name */
    public final String f12639d;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12640g;

    public u(String str, String str2) {
        this.f12638a = str;
        this.f12639d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (Objects.equals(this.f12638a, uVar.f12638a) && Objects.equals(this.f12639d, uVar.f12639d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12638a, this.f12639d);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("name");
        bVar.V(this.f12638a);
        bVar.I("version");
        bVar.V(this.f12639d);
        HashMap map = this.f12640g;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.f12640g, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
