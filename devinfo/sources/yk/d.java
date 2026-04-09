package yk;

import android.os.Handler;
import android.os.Looper;
import cl.o;
import java.util.concurrent.CancellationException;
import nk.k;
import p4.s0;
import xk.b0;
import xk.g0;
import xk.h;
import xk.i0;
import xk.j1;
import xk.r;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends r implements b0 {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f37655c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37656d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37657e;

    /* renamed from: f, reason: collision with root package name */
    public final d f37658f;

    public d(Handler handler, String str, boolean z3) {
        this.f37655c = handler;
        this.f37656d = str;
        this.f37657e = z3;
        this.f37658f = z3 ? this : new d(handler, str, true);
    }

    @Override // xk.b0
    public final void A(long j, h hVar) {
        c cVar = new c(0, hVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f37655c.postDelayed(cVar, j)) {
            hVar.u(new b7.b(26, this, cVar));
        } else {
            X(hVar.f37194e, cVar);
        }
    }

    @Override // xk.b0
    public final i0 F(long j, Runnable runnable, ck.h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f37655c.postDelayed(runnable, j)) {
            return new s0(1, this, runnable);
        }
        X(hVar, runnable);
        return j1.f37202a;
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        if (this.f37655c.post(runnable)) {
            return;
        }
        X(hVar, runnable);
    }

    @Override // xk.r
    public final boolean V(ck.h hVar) {
        return (this.f37657e && k.a(Looper.myLooper(), this.f37655c.getLooper())) ? false : true;
    }

    public final void X(ck.h hVar, Runnable runnable) {
        x.f(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        el.e eVar = g0.f37189a;
        el.d.f23561c.T(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f37655c == this.f37655c && dVar.f37657e == this.f37657e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f37655c) ^ (this.f37657e ? 1231 : 1237);
    }

    @Override // xk.r
    public final String toString() {
        d dVar;
        String str;
        el.e eVar = g0.f37189a;
        d dVar2 = o.f2935a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f37658f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f37656d;
        if (string == null) {
            string = this.f37655c.toString();
        }
        return this.f37657e ? d.h.s(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
