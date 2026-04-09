package kotlinx.coroutines.channels;

import kotlin.jvm.internal.t;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.u2;
import y8.s;

/* loaded from: classes4.dex */
public class j extends BufferedChannel {

    /* renamed from: m, reason: collision with root package name */
    public final int f22297m;

    /* renamed from: n, reason: collision with root package name */
    public final BufferOverflow f22298n;

    public j(int i10, BufferOverflow bufferOverflow, l9.l lVar) {
        super(i10, lVar);
        this.f22297m = i10;
        this.f22298n = bufferOverflow;
        if (bufferOverflow == BufferOverflow.f22240a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + t.b(BufferedChannel.class).i() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ Object c1(j jVar, Object obj, c9.c cVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionD;
        Object objF1 = jVar.f1(obj, true);
        if (!(objF1 instanceof e.a)) {
            return s.f25199a;
        }
        e.e(objF1);
        l9.l lVar = jVar.f22255b;
        if (lVar == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, obj, null, 2, null)) == null) {
            throw jVar.Z();
        }
        y8.d.a(undeliveredElementExceptionD, jVar.Z());
        throw undeliveredElementExceptionD;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.o
    public Object b(Object obj, c9.c cVar) {
        return c1(this, obj, cVar);
    }

    public final Object d1(Object obj, boolean z10) {
        l9.l lVar;
        UndeliveredElementException undeliveredElementExceptionD;
        Object objN = super.n(obj);
        if (e.i(objN) || e.h(objN)) {
            return objN;
        }
        if (!z10 || (lVar = this.f22255b) == null || (undeliveredElementExceptionD = OnUndeliveredElementKt.d(lVar, obj, null, 2, null)) == null) {
            return e.f22291b.c(s.f25199a);
        }
        throw undeliveredElementExceptionD;
    }

    public final Object e1(Object obj) {
        g gVarO;
        int i10;
        j jVar;
        Object obj2 = BufferedChannelKt.f22267d;
        g gVar = (g) BufferedChannel.a0().get(this);
        while (true) {
            long andIncrement = BufferedChannel.b0().getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zM0 = m0(andIncrement);
            int i11 = BufferedChannelKt.f22265b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (gVar.f22569c != j11) {
                gVarO = O(j11, gVar);
                if (gVarO != null) {
                    jVar = this;
                    i10 = i12;
                } else if (zM0) {
                    return e.f22291b.a(Z());
                }
            } else {
                gVarO = gVar;
                i10 = i12;
                jVar = this;
            }
            Object obj3 = obj;
            int iX0 = jVar.X0(gVarO, i10, obj3, j10, obj2, zM0);
            gVar = gVarO;
            if (iX0 == 0) {
                gVar.b();
                return e.f22291b.c(s.f25199a);
            }
            if (iX0 == 1) {
                return e.f22291b.c(s.f25199a);
            }
            if (iX0 == 2) {
                if (zM0) {
                    gVar.s();
                    return e.f22291b.a(Z());
                }
                u2 u2Var = obj2 instanceof u2 ? (u2) obj2 : null;
                if (u2Var != null) {
                    D0(u2Var, gVar, i10);
                }
                K((gVar.f22569c * i11) + i10);
                return e.f22291b.c(s.f25199a);
            }
            if (iX0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iX0 == 4) {
                if (j10 < Y()) {
                    gVar.b();
                }
                return e.f22291b.a(Z());
            }
            if (iX0 == 5) {
                gVar.b();
            }
            obj = obj3;
        }
    }

    public final Object f1(Object obj, boolean z10) {
        return this.f22298n == BufferOverflow.f22242c ? d1(obj, z10) : e1(obj);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.o
    public Object n(Object obj) {
        return f1(obj, false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean n0() {
        return this.f22298n == BufferOverflow.f22241b;
    }
}
