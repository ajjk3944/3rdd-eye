package y0;

import android.view.MotionEvent;
import l0.C6531g;
import mh.InterfaceC6835l;

/* renamed from: y0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8570J {
    public static final void a(long j10, InterfaceC6835l interfaceC6835l) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        interfaceC6835l.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C8593n c8593n, long j10, InterfaceC6835l interfaceC6835l) {
        d(c8593n, j10, interfaceC6835l, true);
    }

    public static final void c(C8593n c8593n, long j10, InterfaceC6835l interfaceC6835l) {
        d(c8593n, j10, interfaceC6835l, false);
    }

    private static final void d(C8593n c8593n, long j10, InterfaceC6835l interfaceC6835l, boolean z10) {
        MotionEvent motionEventE = c8593n.e();
        if (motionEventE == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventE.getAction();
        if (z10) {
            motionEventE.setAction(3);
        }
        motionEventE.offsetLocation(-C6531g.m(j10), -C6531g.n(j10));
        interfaceC6835l.invoke(motionEventE);
        motionEventE.offsetLocation(C6531g.m(j10), C6531g.n(j10));
        motionEventE.setAction(action);
    }
}
