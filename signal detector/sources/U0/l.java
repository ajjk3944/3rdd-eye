package U0;

import a.AbstractC0241a;

/* loaded from: classes.dex */
public final class l extends b {
    @Override // U0.c
    public final boolean b() {
        if (!super.b() || !AbstractC0241a.k("MULTI_PROCESS")) {
            return false;
        }
        int i = T0.f.f3557a;
        if (m.f3681c.b()) {
            return n.f3687a.getStatics().isMultiProcessEnabled();
        }
        throw m.a();
    }
}
