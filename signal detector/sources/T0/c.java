package T0;

import U0.h;
import U0.m;
import U0.n;
import androidx.webkit.ProfileStore;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static ProfileStore a() {
        if (!m.f3685g.b()) {
            throw m.a();
        }
        if (h.f3673b == null) {
            h.f3673b = new h(n.f3687a.getProfileStore());
        }
        return h.f3673b;
    }
}
