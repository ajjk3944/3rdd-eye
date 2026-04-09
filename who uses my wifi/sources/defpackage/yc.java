package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yc {
    public Object a;
    public bd b;
    public up0 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        bd bdVar = this.b;
        if (bdVar != null) {
            ad adVar = bdVar.g;
            adVar.getClass();
            if (obj == null) {
                obj = k0.l;
            }
            if (k0.k.f(adVar, null, obj)) {
                k0.b(adVar);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        bd bdVar = this.b;
        if (bdVar == null || !bdVar.g.i(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        up0 up0Var;
        bd bdVar = this.b;
        if (bdVar != null) {
            ad adVar = bdVar.g;
            if (!adVar.isDone()) {
                adVar.i(new r("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.d || (up0Var = this.c) == null) {
            return;
        }
        up0Var.j(null);
    }
}
