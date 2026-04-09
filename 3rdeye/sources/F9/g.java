package F9;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection<A9.B> f1753a;

    static {
        try {
            f1753a = x9.l.L(x9.j.D(Arrays.asList(new B9.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
