package r;

import mh.InterfaceC6835l;
import r.T;

/* renamed from: r.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7535j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7542q b(s0 s0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC7542q) s0Var.a().invoke(obj);
    }

    public static final InterfaceC7533i c(InterfaceC7533i interfaceC7533i, long j10) {
        return new C7534i0(interfaceC7533i, j10);
    }

    public static final N d(D d10, EnumC7520b0 enumC7520b0, long j10) {
        return new N(d10, enumC7520b0, j10, null);
    }

    public static /* synthetic */ N e(D d10, EnumC7520b0 enumC7520b0, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC7520b0 = EnumC7520b0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = k0.c(0, 0, 2, null);
        }
        return d(d10, enumC7520b0, j10);
    }

    public static final T f(InterfaceC6835l interfaceC6835l) {
        T.b bVar = new T.b();
        interfaceC6835l.invoke(bVar);
        return new T(bVar);
    }

    public static final C7524d0 g(int i10) {
        return new C7524d0(i10);
    }

    public static /* synthetic */ C7524d0 h(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g(i10);
    }

    public static final C7532h0 i(float f10, float f11, Object obj) {
        return new C7532h0(f10, f11, obj);
    }

    public static /* synthetic */ C7532h0 j(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return i(f10, f11, obj);
    }

    public static final r0 k(int i10, int i11, E e10) {
        return new r0(i10, i11, e10);
    }

    public static /* synthetic */ r0 l(int i10, int i11, E e10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            e10 = G.c();
        }
        return k(i10, i11, e10);
    }
}
