package xt;

import android.os.Handler;
import android.os.Looper;
import br.l;
import bu.n;
import c0.s;
import du.e;
import du.f;
import java.util.concurrent.CancellationException;
import pq.h;
import wt.a0;
import wt.d0;
import wt.g;
import wt.q;
import wt.w;

/* loaded from: classes.dex */
public final class c extends q implements a0 {

    /* renamed from: g, reason: collision with root package name */
    public final Handler f25524g;

    /* renamed from: r, reason: collision with root package name */
    public final String f25525r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25526x;

    /* renamed from: y, reason: collision with root package name */
    public final c f25527y;

    public c(Handler handler, String str, boolean z10) {
        this.f25524g = handler;
        this.f25525r = str;
        this.f25526x = z10;
        this.f25527y = z10 ? this : new c(handler, str, true);
    }

    @Override // wt.a0
    public final void G(long j, g gVar) {
        re.a aVar = new re.a(gVar, 23, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f25524g.postDelayed(aVar, j)) {
            gVar.x(new s(this, 6, aVar));
        } else {
            r0(gVar.f24618x, aVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f25524g == this.f25524g && cVar.f25526x == this.f25526x;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f25524g) ^ (this.f25526x ? 1231 : 1237);
    }

    @Override // wt.q
    public final void n0(h hVar, Runnable runnable) {
        if (this.f25524g.post(runnable)) {
            return;
        }
        r0(hVar, runnable);
    }

    @Override // wt.q
    public final boolean p0(h hVar) {
        return (this.f25526x && l.a(Looper.myLooper(), this.f25524g.getLooper())) ? false : true;
    }

    @Override // wt.q
    public q q0(int i10) {
        bu.a.a(1);
        return this;
    }

    public final void r0(h hVar, Runnable runnable) {
        w.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        f fVar = d0.f24610a;
        e.f7570g.n0(hVar, runnable);
    }

    @Override // wt.q
    public final String toString() {
        c cVar;
        String str;
        f fVar = d0.f24610a;
        c cVar2 = n.f2983a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f25527y;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f25525r;
        if (string == null) {
            string = this.f25524g.toString();
        }
        return this.f25526x ? w.g.f(string, ".immediate") : string;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
