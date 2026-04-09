package ze;

import T.AbstractC3561w;
import T.H0;
import mh.InterfaceC6824a;
import org.kodein.di.DI;

/* renamed from: ze.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8734c {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f67253a = AbstractC3561w.f(new InterfaceC6824a() { // from class: ze.b
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return AbstractC8734c.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final DI b() {
        throw new IllegalStateException("No DI set");
    }

    public static final H0 c() {
        return f67253a;
    }
}
