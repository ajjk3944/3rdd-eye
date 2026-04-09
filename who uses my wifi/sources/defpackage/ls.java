package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ls implements hk, Serializable {
    public static final ls f = new ls();

    @Override // defpackage.hk
    public final hk g(hk hkVar) {
        i30.m(hkVar, "context");
        return hkVar;
    }

    @Override // defpackage.hk
    public final fk h(gk gkVar) {
        i30.m(gkVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.hk
    public final hk i(gk gkVar) {
        i30.m(gkVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.hk
    public final Object f(Object obj, hy hyVar) {
        return obj;
    }
}
