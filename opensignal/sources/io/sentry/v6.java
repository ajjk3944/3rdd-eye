package io.sentry;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v6 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12831a;

    /* renamed from: d, reason: collision with root package name */
    public final String f12832d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12833g;

    /* renamed from: r, reason: collision with root package name */
    public final String f12834r;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f12835x;

    public v6(io.sentry.protocol.t tVar, String str, String str2, String str3) {
        this.f12831a = tVar;
        this.f12832d = str;
        this.f12833g = str2;
        this.f12834r = str3;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("event_id");
        this.f12831a.serialize(bVar, u0Var);
        String str = this.f12832d;
        if (str != null) {
            bVar.I("name");
            bVar.V(str);
        }
        String str2 = this.f12833g;
        if (str2 != null) {
            bVar.I("email");
            bVar.V(str2);
        }
        String str3 = this.f12834r;
        if (str3 != null) {
            bVar.I("comments");
            bVar.V(str3);
        }
        HashMap map = this.f12835x;
        if (map != null) {
            for (String str4 : map.keySet()) {
                h0.b.C(this.f12835x, str4, bVar, str4, u0Var);
            }
        }
        bVar.F();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f12831a);
        sb2.append(", name='");
        sb2.append(this.f12832d);
        sb2.append("', email='");
        sb2.append(this.f12833g);
        sb2.append("', comments='");
        return w.g.j(sb2, this.f12834r, "'}");
    }
}
