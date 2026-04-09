package R2;

import java.util.ArrayDeque;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class p<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final o f11683a = new o(500);

    /* compiled from: ModelCache.java */
    public static final class a<A> {

        /* renamed from: b, reason: collision with root package name */
        public static final ArrayDeque f11684b;

        /* renamed from: a, reason: collision with root package name */
        public A f11685a;

        static {
            char[] cArr = h3.l.f38217a;
            f11684b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f11684b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f11685a = obj;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.f11685a.equals(aVar.f11685a);
        }

        public final int hashCode() {
            return this.f11685a.hashCode();
        }
    }
}
