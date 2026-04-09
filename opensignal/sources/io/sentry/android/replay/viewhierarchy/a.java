package io.sentry.android.replay.viewhierarchy;

import br.n;
import java.lang.reflect.Method;
import x1.f0;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12016d = new a(0);

    @Override // ar.a
    public final Object c() {
        try {
            Method declaredMethod = f0.class.getDeclaredMethod("E", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
