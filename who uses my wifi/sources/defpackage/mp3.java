package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mp3 extends ob1 {
    public static final Unsafe q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(pp3.a);
        }
        try {
            s = unsafe.objectFieldOffset(op3.class.getDeclaredField("h"));
            r = unsafe.objectFieldOffset(op3.class.getDeclaredField("g"));
            t = unsafe.objectFieldOffset(op3.class.getDeclaredField("f"));
            u = unsafe.objectFieldOffset(np3.class.getDeclaredField("a"));
            v = unsafe.objectFieldOffset(np3.class.getDeclaredField("b"));
            q = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.ob1
    public final void A(np3 np3Var, np3 np3Var2) {
        q.putObject(np3Var, v, np3Var2);
    }

    @Override // defpackage.ob1
    public final boolean E(op3 op3Var, np3 np3Var, np3 np3Var2) {
        return jp3.a(q, op3Var, s, np3Var, np3Var2);
    }

    @Override // defpackage.ob1
    public final boolean G(gp3 gp3Var, dp3 dp3Var, dp3 dp3Var2) {
        return kp3.a(q, gp3Var, r, dp3Var, dp3Var2);
    }

    @Override // defpackage.ob1
    public final np3 H(gp3 gp3Var) {
        np3 np3Var;
        np3 np3Var2 = np3.c;
        do {
            np3Var = gp3Var.h;
            if (np3Var2 == np3Var) {
                break;
            }
        } while (!E(gp3Var, np3Var, np3Var2));
        return np3Var;
    }

    @Override // defpackage.ob1
    public final dp3 K(gp3 gp3Var) {
        dp3 dp3Var;
        dp3 dp3Var2 = dp3.d;
        do {
            dp3Var = gp3Var.g;
            if (dp3Var2 == dp3Var) {
                break;
            }
        } while (!G(gp3Var, dp3Var, dp3Var2));
        return dp3Var;
    }

    @Override // defpackage.ob1
    public final boolean L(op3 op3Var, Object obj, Object obj2) {
        return lp3.a(q, op3Var, t, obj, obj2);
    }

    @Override // defpackage.ob1
    public final void x(np3 np3Var, Thread thread) {
        q.putObject(np3Var, u, thread);
    }
}
