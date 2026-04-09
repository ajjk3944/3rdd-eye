package z0;

import wt.r;
import wt.t;
import wt.t0;
import wt.v0;
import wt.w;
import x1.f1;
import x1.i1;

/* loaded from: classes.dex */
public abstract class l implements x1.i {

    /* renamed from: c, reason: collision with root package name */
    public t f26496c;

    /* renamed from: d, reason: collision with root package name */
    public int f26497d;

    /* renamed from: f, reason: collision with root package name */
    public l f26499f;

    /* renamed from: g, reason: collision with root package name */
    public l f26500g;

    /* renamed from: h, reason: collision with root package name */
    public i1 f26501h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f26502i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26503l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26504m;

    /* renamed from: n, reason: collision with root package name */
    public qr.g f26505n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26506o;

    /* renamed from: b, reason: collision with root package name */
    public l f26495b = this;

    /* renamed from: e, reason: collision with root package name */
    public int f26498e = -1;

    public final t Q() {
        t tVar = this.f26496c;
        if (tVar != null) {
            return tVar;
        }
        bu.c cVarB = w.b(x1.k.s(this).getCoroutineContext().i0(new v0((t0) x1.k.s(this).getCoroutineContext().Y(r.f24653d))));
        this.f26496c = cVarB;
        return cVarB;
    }

    public boolean R() {
        return !(this instanceof y.g);
    }

    public void S() {
        if (this.f26506o) {
            u1.a.b("node attached multiple times");
        }
        if (this.f26502i == null) {
            u1.a.b("attach invoked on a node without a coordinator");
        }
        this.f26506o = true;
        this.f26503l = true;
    }

    public void T() {
        if (!this.f26506o) {
            u1.a.b("Cannot detach a node that is not attached");
        }
        if (this.f26503l) {
            u1.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f26504m) {
            u1.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f26506o = false;
        t tVar = this.f26496c;
        if (tVar != null) {
            w.f(tVar, new au.m("The Modifier.Node was detached", 3));
            this.f26496c = null;
        }
    }

    public void X() {
        if (!this.f26506o) {
            u1.a.b("reset() called on an unattached node");
        }
        W();
    }

    public void Y() {
        if (!this.f26506o) {
            u1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f26503l) {
            u1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f26503l = false;
        U();
        this.f26504m = true;
    }

    public void Z() {
        if (!this.f26506o) {
            u1.a.b("node detached multiple times");
        }
        if (this.f26502i == null) {
            u1.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f26504m) {
            u1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f26504m = false;
        qr.g gVar = this.f26505n;
        if (gVar != null) {
            gVar.c();
        }
        V();
    }

    public void a0(l lVar) {
        this.f26495b = lVar;
    }

    public void b0(f1 f1Var) {
        this.f26502i = f1Var;
    }

    public void U() {
    }

    public void V() {
    }

    public void W() {
    }
}
