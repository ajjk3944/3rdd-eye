package B9;

import A9.C0572d0;
import A9.C0583j;
import A9.E0;
import A9.P0;
import A9.U;
import A9.W;
import F9.q;
import N7.G8;
import android.os.Handler;
import android.os.Looper;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f600d;

    /* renamed from: e, reason: collision with root package name */
    public final f f601e;

    public f(boolean z10, Handler handler) {
        this.f599c = handler;
        this.f600d = z10;
        this.f601e = z10 ? this : new f(true, handler);
    }

    @Override // B9.g, A9.N
    public final W B0(long j4, final P0 p02, InterfaceC4350h interfaceC4350h) {
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f599c.postDelayed(p02, j4)) {
            return new W() { // from class: B9.c
                @Override // A9.W
                public final void dispose() {
                    this.f592b.f599c.removeCallbacks(p02);
                }
            };
        }
        S0(interfaceC4350h, p02);
        return E0.f187b;
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        if (this.f599c.post(runnable)) {
            return;
        }
        S0(interfaceC4350h, runnable);
    }

    @Override // A9.A
    public final boolean P0(InterfaceC4350h interfaceC4350h) {
        return (this.f600d && l.b(Looper.myLooper(), this.f599c.getLooper())) ? false : true;
    }

    @Override // B9.g
    public final g R0() {
        return this.f601e;
    }

    public final void S0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        C0572d0.b(interfaceC4350h, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        U.f212b.N0(interfaceC4350h, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f599c == this.f599c && fVar.f600d == this.f600d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f599c) ^ (this.f600d ? 1231 : 1237);
    }

    @Override // B9.g, A9.A
    public final String toString() {
        g gVarR0;
        String str;
        I9.c cVar = U.f211a;
        g gVar = q.f1782a;
        if (this == gVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                gVarR0 = gVar.R0();
            } catch (UnsupportedOperationException unused) {
                gVarR0 = null;
            }
            str = this == gVarR0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f599c.toString();
        return this.f600d ? G8.s(string, ".immediate") : string;
    }

    @Override // A9.N
    public final void y0(long j4, C0583j c0583j) {
        d dVar = new d(c0583j, this);
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f599c.postDelayed(dVar, j4)) {
            c0583j.u(new e(0, this, dVar));
        } else {
            S0(c0583j.f253f, dVar);
        }
    }
}
