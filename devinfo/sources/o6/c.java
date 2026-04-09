package o6;

import androidx.webkit.ProfileStore;
import p6.g;
import p6.l;
import p6.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static ProfileStore a() {
        if (!l.g.b()) {
            throw l.a();
        }
        if (g.f31382b == null) {
            g.f31382b = new g(m.f31394a.getProfileStore());
        }
        return g.f31382b;
    }
}
