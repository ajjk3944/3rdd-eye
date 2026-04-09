package w;

import g1.C2331b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f23924a;

    /* renamed from: b, reason: collision with root package name */
    public k f23925b;

    /* renamed from: c, reason: collision with root package name */
    public l f23926c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23927d;

    public final void a(Object obj) {
        this.f23927d = true;
        k kVar = this.f23925b;
        if (kVar != null) {
            j jVar = kVar.f23930b;
            jVar.getClass();
            if (obj == null) {
                obj = g.f23920g;
            }
            if (g.f23919f.b(jVar, null, obj)) {
                g.c(jVar);
                this.f23924a = null;
                this.f23925b = null;
                this.f23926c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.f23927d = true;
        k kVar = this.f23925b;
        if (kVar == null || !kVar.f23930b.i(th)) {
            return;
        }
        this.f23924a = null;
        this.f23925b = null;
        this.f23926c = null;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f23925b;
        if (kVar != null) {
            j jVar = kVar.f23930b;
            if (!jVar.isDone()) {
                jVar.i(new C2331b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23924a, 2));
            }
        }
        if (this.f23927d || (lVar = this.f23926c) == null) {
            return;
        }
        lVar.j(null);
    }
}
