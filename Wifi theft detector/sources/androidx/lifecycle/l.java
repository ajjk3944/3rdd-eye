package androidx.lifecycle;

import kotlinx.coroutines.n2;
import kotlinx.coroutines.w0;

/* loaded from: classes.dex */
public abstract class l {
    public static final h a(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.jvm.internal.p.e(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, n2.b(null, 1, null).plus(w0.c().b0()));
        } while (!k.a(lifecycle.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.h();
        return lifecycleCoroutineScopeImpl;
    }
}
