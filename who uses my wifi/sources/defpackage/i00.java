package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i00 extends lk implements zn {
    public final Handler h;
    public final boolean i;
    public final i00 j;

    public i00(Handler handler, boolean z) {
        this.h = handler;
        this.i = z;
        this.j = z ? this : new i00(handler, true);
    }

    @Override // defpackage.zn
    public final jp c(long j, final u11 u11Var, hk hkVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.h.postDelayed(u11Var, j)) {
            return new jp() { // from class: h00
                @Override // defpackage.jp
                public final void b() {
                    this.f.h.removeCallbacks(u11Var);
                }
            };
        }
        m(hkVar, u11Var);
        return ph0.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return i00Var.h == this.h && i00Var.i == this.i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h) ^ (this.i ? 1231 : 1237);
    }

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.h.post(runnable)) {
            return;
        }
        m(hkVar, runnable);
    }

    @Override // defpackage.lk
    public final boolean l() {
        return (this.i && i30.c(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    public final void m(hk hkVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        w30 w30Var = (w30) hkVar.h(fr.j);
        if (w30Var != null) {
            ((g40) w30Var).o(cancellationException);
        }
        fp.b.k(hkVar, runnable);
    }

    @Override // defpackage.lk
    public final String toString() {
        i00 i00Var;
        String str;
        on onVar = fp.a;
        i00 i00Var2 = za0.a;
        if (this == i00Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                i00Var = i00Var2.j;
            } catch (UnsupportedOperationException unused) {
                i00Var = null;
            }
            str = this == i00Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.h.toString();
        return this.i ? ex0.g(string, ".immediate") : string;
    }
}
