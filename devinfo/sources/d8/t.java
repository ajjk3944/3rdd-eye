package d8;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f22045b;

    /* renamed from: a, reason: collision with root package name */
    public Object f22046a;

    static {
        char[] cArr = t8.m.f34520a;
        f22045b = new ArrayDeque(0);
    }

    public static t a(Object obj) {
        t tVar;
        ArrayDeque arrayDeque = f22045b;
        synchronized (arrayDeque) {
            tVar = (t) arrayDeque.poll();
        }
        if (tVar == null) {
            tVar = new t();
        }
        tVar.f22046a = obj;
        return tVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && this.f22046a.equals(((t) obj).f22046a);
    }

    public final int hashCode() {
        return this.f22046a.hashCode();
    }
}
