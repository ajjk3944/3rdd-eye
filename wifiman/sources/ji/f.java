package Ji;

import Ii.A0;
import Ii.C3048c0;
import Ii.InterfaceC3052e0;
import Ii.InterfaceC3069n;
import Ii.K0;
import Ii.X;
import Yg.J;
import android.os.Handler;
import android.os.Looper;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class f extends g implements X {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f10226c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10227d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10228e;

    /* renamed from: f, reason: collision with root package name */
    private final f f10229f;

    private f(Handler handler, String str, boolean z10) {
        super(null);
        this.f10226c = handler;
        this.f10227d = str;
        this.f10228e = z10;
        this.f10229f = z10 ? this : new f(handler, str, true);
    }

    private final void v0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        A0.d(interfaceC5384i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3048c0.b().Y(interfaceC5384i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(f fVar, Runnable runnable) {
        fVar.f10226c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(InterfaceC3069n interfaceC3069n, f fVar) {
        interfaceC3069n.J(fVar, J.f24997a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J z0(f fVar, Runnable runnable, Throwable th2) {
        fVar.f10226c.removeCallbacks(runnable);
        return J.f24997a;
    }

    @Override // Ii.X
    public void J(long j10, final InterfaceC3069n interfaceC3069n) {
        final Runnable runnable = new Runnable() { // from class: Ji.d
            @Override // java.lang.Runnable
            public final void run() {
                f.y0(interfaceC3069n, this);
            }
        };
        if (this.f10226c.postDelayed(runnable, AbstractC7978m.h(j10, 4611686018427387903L))) {
            interfaceC3069n.B(new InterfaceC6835l() { // from class: Ji.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return f.z0(this.f10224a, runnable, (Throwable) obj);
                }
            });
        } else {
            v0(interfaceC3069n.getContext(), runnable);
        }
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        if (this.f10226c.post(runnable)) {
            return;
        }
        v0(interfaceC5384i, runnable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f10226c == this.f10226c && fVar.f10228e == this.f10228e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10226c) ^ (this.f10228e ? 1231 : 1237);
    }

    @Override // Ii.J
    public boolean m0(InterfaceC5384i interfaceC5384i) {
        return (this.f10228e && AbstractC6492s.d(Looper.myLooper(), this.f10226c.getLooper())) ? false : true;
    }

    @Override // Ii.X
    public InterfaceC3052e0 p(long j10, final Runnable runnable, InterfaceC5384i interfaceC5384i) {
        if (this.f10226c.postDelayed(runnable, AbstractC7978m.h(j10, 4611686018427387903L))) {
            return new InterfaceC3052e0() { // from class: Ji.c
                @Override // Ii.InterfaceC3052e0
                public final void dispose() {
                    f.x0(this.f10220a, runnable);
                }
            };
        }
        v0(interfaceC5384i, runnable);
        return K0.f9274a;
    }

    @Override // Ii.J
    public String toString() {
        String strQ0 = q0();
        if (strQ0 != null) {
            return strQ0;
        }
        String string = this.f10227d;
        if (string == null) {
            string = this.f10226c.toString();
        }
        if (!this.f10228e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // Ji.g
    /* renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f r0() {
        return this.f10229f;
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
