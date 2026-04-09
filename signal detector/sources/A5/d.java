package A5;

import E5.o;
import android.os.Handler;
import android.os.Looper;
import h5.InterfaceC2375i;
import java.util.concurrent.CancellationException;
import o4.AbstractC2763b;
import q5.i;
import z5.A;
import z5.AbstractC3042s;
import z5.AbstractC3046w;
import z5.C3030f;
import z5.D;

/* loaded from: classes3.dex */
public final class d extends AbstractC3042s implements A {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f514c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f515d;

    /* renamed from: e, reason: collision with root package name */
    public final d f516e;

    public d(Handler handler, boolean z6) {
        this.f514c = handler;
        this.f515d = z6;
        this.f516e = z6 ? this : new d(handler, true);
    }

    @Override // z5.A
    public final void b(long j6, C3030f c3030f) {
        A1.d dVar = new A1.d(c3030f, this, 4, false);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f514c.postDelayed(dVar, j6)) {
            c3030f.v(new c(this, 0, dVar));
        } else {
            k(c3030f.f24532e, dVar);
        }
    }

    @Override // z5.AbstractC3042s
    public final void d(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        if (this.f514c.post(runnable)) {
            return;
        }
        k(interfaceC2375i, runnable);
    }

    @Override // z5.AbstractC3042s
    public final boolean e() {
        return (this.f515d && i.a(Looper.myLooper(), this.f514c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f514c == this.f514c && dVar.f515d == this.f515d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f514c) ^ (this.f515d ? 1231 : 1237);
    }

    public final void k(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        AbstractC3046w.d(interfaceC2375i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        D.f24486b.d(interfaceC2375i, runnable);
    }

    @Override // z5.AbstractC3042s
    public final String toString() {
        d dVar;
        String str;
        G5.e eVar = D.f24485a;
        d dVar2 = o.f1409a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f516e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f514c.toString();
        return this.f515d ? AbstractC2763b.e(string, ".immediate") : string;
    }
}
