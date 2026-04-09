package i1;

import c2.t;
import i2.d1;
import i2.i1;
import j2.r;
import xk.a1;
import xk.s;
import xk.v;
import xk.x;
import xk.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m implements i2.i {

    /* renamed from: b, reason: collision with root package name */
    public cl.d f25555b;

    /* renamed from: c, reason: collision with root package name */
    public int f25556c;

    /* renamed from: e, reason: collision with root package name */
    public m f25558e;

    /* renamed from: f, reason: collision with root package name */
    public m f25559f;
    public i1 g;

    /* renamed from: h, reason: collision with root package name */
    public d1 f25560h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25561i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25562k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25563l;

    /* renamed from: m, reason: collision with root package name */
    public c2.c f25564m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25565n;

    /* renamed from: a, reason: collision with root package name */
    public m f25554a = this;

    /* renamed from: d, reason: collision with root package name */
    public int f25557d = -1;

    public final v b0() {
        cl.d dVar = this.f25555b;
        if (dVar != null) {
            return dVar;
        }
        cl.d dVarB = x.b(((r) i2.k.t(this)).getCoroutineContext().y(new a1((y0) ((r) i2.k.t(this)).getCoroutineContext().O(s.f37235b))));
        this.f25555b = dVarB;
        return dVarB;
    }

    public boolean c0() {
        return !(this instanceof c0.q);
    }

    public void d0() {
        if (this.f25565n) {
            f2.a.b("node attached multiple times");
        }
        if (this.f25560h == null) {
            f2.a.b("attach invoked on a node without a coordinator");
        }
        this.f25565n = true;
        this.f25562k = true;
    }

    public void e0() {
        if (!this.f25565n) {
            f2.a.b("Cannot detach a node that is not attached");
        }
        if (this.f25562k) {
            f2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f25563l) {
            f2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f25565n = false;
        cl.d dVar = this.f25555b;
        if (dVar != null) {
            x.g(dVar, new t("The Modifier.Node was detached", 2));
            this.f25555b = null;
        }
    }

    public void k0() {
        if (!this.f25565n) {
            f2.a.b("reset() called on an unattached node");
        }
        j0();
    }

    public void l0() {
        if (!this.f25565n) {
            f2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f25562k) {
            f2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f25562k = false;
        f0();
        this.f25563l = true;
    }

    public void m0() {
        if (!this.f25565n) {
            f2.a.b("node detached multiple times");
        }
        if (this.f25560h == null) {
            f2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f25563l) {
            f2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f25563l = false;
        c2.c cVar = this.f25564m;
        if (cVar != null) {
            cVar.invoke();
        }
        h0();
    }

    public void n0(m mVar) {
        this.f25554a = mVar;
    }

    public void o0(d1 d1Var) {
        this.f25560h = d1Var;
    }

    public void f0() {
    }

    public /* synthetic */ void g0() {
    }

    public void h0() {
    }

    public /* synthetic */ void i0() {
    }

    public void j0() {
    }
}
