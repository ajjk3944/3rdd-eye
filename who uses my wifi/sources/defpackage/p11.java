package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class p11 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ft a() {
        ThreadLocal threadLocal = a;
        ft ftVar = (ft) threadLocal.get();
        if (ftVar != null) {
            return ftVar;
        }
        za zaVar = new za(Thread.currentThread());
        threadLocal.set(zaVar);
        return zaVar;
    }
}
