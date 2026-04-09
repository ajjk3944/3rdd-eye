package androidx.camera.core.impl;

import java.util.Set;

/* compiled from: Config.java */
/* loaded from: classes.dex */
public interface U {

    /* compiled from: Config.java */
    public static abstract class a<T> {
        public static C1683d a(Class cls, String str) {
            return new C1683d(str, cls, null);
        }

        public abstract String b();

        public abstract Object c();

        public abstract Class<T> d();
    }

    /* compiled from: Config.java */
    public enum b {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT b(a<ValueT> aVar);

    boolean f(a<?> aVar);

    void g(B.i iVar);

    <ValueT> ValueT j(a<ValueT> aVar, b bVar);

    Set<a<?>> l();

    <ValueT> ValueT o(a<ValueT> aVar, ValueT valuet);

    b w(a<?> aVar);

    Set<b> x(a<?> aVar);
}
