package Ki;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final b f10873b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f10874c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f10875a;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f10876a;

        public a(Throwable th2) {
            this.f10876a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(this.f10876a, ((a) obj).f10876a);
        }

        public int hashCode() {
            Throwable th2 = this.f10876a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // Ki.k.c
        public String toString() {
            return "Closed(" + this.f10876a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th2) {
            return k.c(new a(th2));
        }

        public final Object b() {
            return k.c(k.f10874c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f10875a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && AbstractC6492s.d(obj, ((k) obj2).l());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f10876a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return obj instanceof c;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof c);
    }

    public static String k(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f10875a, obj);
    }

    public int hashCode() {
        return g(this.f10875a);
    }

    public final /* synthetic */ Object l() {
        return this.f10875a;
    }

    public String toString() {
        return k(this.f10875a);
    }
}
