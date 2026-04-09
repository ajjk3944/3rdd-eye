package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements c2 {
    public AbstractMap B;

    /* renamed from: a, reason: collision with root package name */
    public String f12554a;

    /* renamed from: d, reason: collision with root package name */
    public String f12555d;

    /* renamed from: g, reason: collision with root package name */
    public String f12556g;

    /* renamed from: r, reason: collision with root package name */
    public t f12557r;

    /* renamed from: x, reason: collision with root package name */
    public t f12558x;

    /* renamed from: y, reason: collision with root package name */
    public String f12559y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return ir.f0.s(this.f12554a, gVar.f12554a) && ir.f0.s(this.f12555d, gVar.f12555d) && ir.f0.s(this.f12556g, gVar.f12556g) && ir.f0.s(this.f12557r, gVar.f12557r) && ir.f0.s(this.f12558x, gVar.f12558x) && ir.f0.s(this.f12559y, gVar.f12559y) && ir.f0.s(this.B, gVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12554a, this.f12555d, this.f12556g, this.f12557r, this.f12558x, this.f12559y, this.B});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("message");
        bVar.V(this.f12554a);
        if (this.f12555d != null) {
            bVar.I("contact_email");
            bVar.V(this.f12555d);
        }
        if (this.f12556g != null) {
            bVar.I("name");
            bVar.V(this.f12556g);
        }
        if (this.f12557r != null) {
            bVar.I("associated_event_id");
            this.f12557r.serialize(bVar, u0Var);
        }
        if (this.f12558x != null) {
            bVar.I("replay_id");
            this.f12558x.serialize(bVar, u0Var);
        }
        if (this.f12559y != null) {
            bVar.I("url");
            bVar.V(this.f12559y);
        }
        AbstractMap abstractMap = this.B;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.B.get(str);
                bVar.I(str);
                bVar.S(u0Var, obj);
            }
        }
        bVar.F();
    }

    public final String toString() {
        return "Feedback{message='" + this.f12554a + "', contactEmail='" + this.f12555d + "', name='" + this.f12556g + "', associatedEventId=" + this.f12557r + ", replayId=" + this.f12558x + ", url='" + this.f12559y + "', unknown=" + this.B + '}';
    }
}
