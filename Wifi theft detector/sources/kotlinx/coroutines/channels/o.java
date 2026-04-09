package kotlinx.coroutines.channels;

/* loaded from: classes4.dex */
public interface o {

    public static final class a {
        public static /* synthetic */ boolean a(o oVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return oVar.A(th);
        }
    }

    boolean A(Throwable th);

    boolean B();

    Object b(Object obj, c9.c cVar);

    Object n(Object obj);

    void w(l9.l lVar);
}
