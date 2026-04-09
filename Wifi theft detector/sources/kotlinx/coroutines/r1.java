package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public interface r1 extends d.b {
    public static final b H8 = b.f22594a;

    public static final class a {
        public static /* synthetic */ void a(r1 r1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            r1Var.a(cancellationException);
        }

        public static Object b(r1 r1Var, Object obj, l9.p pVar) {
            return d.b.a.a(r1Var, obj, pVar);
        }

        public static d.b c(r1 r1Var, d.c cVar) {
            return d.b.a.b(r1Var, cVar);
        }

        public static /* synthetic */ y0 d(r1 r1Var, boolean z10, boolean z11, l9.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return r1Var.f(z10, z11, lVar);
        }

        public static kotlin.coroutines.d e(r1 r1Var, d.c cVar) {
            return d.b.a.c(r1Var, cVar);
        }

        public static kotlin.coroutines.d f(r1 r1Var, kotlin.coroutines.d dVar) {
            return d.b.a.d(r1Var, dVar);
        }
    }

    public static final class b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f22594a = new b();
    }

    y0 U(l9.l lVar);

    u W(w wVar);

    void a(CancellationException cancellationException);

    boolean d();

    y0 f(boolean z10, boolean z11, l9.l lVar);

    r1 getParent();

    boolean isActive();

    boolean isCancelled();

    CancellationException m();

    boolean start();

    Object t(c9.c cVar);
}
