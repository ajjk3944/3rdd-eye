package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wc0 {
    public final uc0 a;

    public wc0(uc0 uc0Var) {
        this.a = uc0Var;
    }

    public n70 a(co coVar) {
        i30.m(coVar, "deletionRequest");
        throw null;
    }

    public n70 b() {
        return pu1.f(gi2.b(wl2.a(fp.a), new bf3(this, null, 6)));
    }

    public n70 c(Uri uri, InputEvent inputEvent) {
        i30.m(uri, "attributionSource");
        return pu1.f(gi2.b(wl2.a(fp.a), new vc0(this, uri, inputEvent, null)));
    }

    public n70 d(Uri uri) {
        i30.m(uri, "trigger");
        return pu1.f(gi2.b(wl2.a(fp.a), new km(this, uri, null, 3)));
    }

    public n70 e(a81 a81Var) {
        i30.m(a81Var, "request");
        throw null;
    }

    public n70 f(b81 b81Var) {
        i30.m(b81Var, "request");
        throw null;
    }
}
