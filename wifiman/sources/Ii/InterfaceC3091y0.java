package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import zi.InterfaceC8780j;

/* renamed from: Ii.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3091y0 extends InterfaceC5384i.b {

    /* renamed from: O, reason: collision with root package name */
    public static final b f9363O = b.f9364a;

    /* renamed from: Ii.y0$a */
    public static final class a {
        public static /* synthetic */ void b(InterfaceC3091y0 interfaceC3091y0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC3091y0.cancel(cancellationException);
        }

        public static Object c(InterfaceC3091y0 interfaceC3091y0, Object obj, InterfaceC6839p interfaceC6839p) {
            return InterfaceC5384i.b.a.a(interfaceC3091y0, obj, interfaceC6839p);
        }

        public static InterfaceC5384i.b d(InterfaceC3091y0 interfaceC3091y0, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.b(interfaceC3091y0, cVar);
        }

        public static InterfaceC5384i e(InterfaceC3091y0 interfaceC3091y0, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.c(interfaceC3091y0, cVar);
        }

        public static InterfaceC3091y0 f(InterfaceC3091y0 interfaceC3091y0, InterfaceC3091y0 interfaceC3091y02) {
            return interfaceC3091y02;
        }

        public static InterfaceC5384i g(InterfaceC3091y0 interfaceC3091y0, InterfaceC5384i interfaceC5384i) {
            return InterfaceC5384i.b.a.d(interfaceC3091y0, interfaceC5384i);
        }
    }

    /* renamed from: Ii.y0$b */
    public static final class b implements InterfaceC5384i.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f9364a = new b();

        private b() {
        }
    }

    InterfaceC3082u attachChild(InterfaceC3086w interfaceC3086w);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th2);

    CancellationException getCancellationException();

    InterfaceC8780j getChildren();

    Si.a getOnJoin();

    InterfaceC3091y0 getParent();

    InterfaceC3052e0 invokeOnCompletion(InterfaceC6835l interfaceC6835l);

    InterfaceC3052e0 invokeOnCompletion(boolean z10, boolean z11, InterfaceC6835l interfaceC6835l);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(InterfaceC5380e interfaceC5380e);

    InterfaceC3091y0 plus(InterfaceC3091y0 interfaceC3091y0);

    boolean start();
}
