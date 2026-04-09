package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class o implements fk {
    public final gk f;

    public o(gk gkVar) {
        this.f = gkVar;
    }

    @Override // defpackage.hk
    public final Object f(Object obj, hy hyVar) {
        return hyVar.f(obj, this);
    }

    @Override // defpackage.hk
    public final hk g(hk hkVar) {
        i30.m(hkVar, "context");
        return hkVar == ls.f ? this : (hk) hkVar.f(this, new ig(1));
    }

    @Override // defpackage.fk
    public final gk getKey() {
        return this.f;
    }

    @Override // defpackage.hk
    public fk h(gk gkVar) {
        i30.m(gkVar, "key");
        if (i30.c(getKey(), gkVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.hk
    public hk i(gk gkVar) {
        return g82.n(this, gkVar);
    }
}
