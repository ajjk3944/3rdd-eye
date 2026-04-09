package r1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f23366b;

    /* renamed from: a, reason: collision with root package name */
    public Object f23367a;

    static {
        char[] cArr = H1.p.f1779a;
        f23366b = new ArrayDeque(0);
    }

    public static p a(Object obj) {
        p pVar;
        ArrayDeque arrayDeque = f23366b;
        synchronized (arrayDeque) {
            pVar = (p) arrayDeque.poll();
        }
        if (pVar == null) {
            pVar = new p();
        }
        pVar.f23367a = obj;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        pVar.getClass();
        return this.f23367a.equals(pVar.f23367a);
    }

    public final int hashCode() {
        return this.f23367a.hashCode();
    }
}
