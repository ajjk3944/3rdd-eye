package kotlinx.coroutines.channels;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final b f22291b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final c f22292c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f22293a;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f22294a;

        public a(Throwable th) {
            this.f22294a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.p.a(this.f22294a, ((a) obj).f22294a);
        }

        public int hashCode() {
            Throwable th = this.f22294a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.e.c
        public String toString() {
            return "Closed(" + this.f22294a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final Object a(Throwable th) {
            return e.c(new a(th));
        }

        public final Object b() {
            return e.c(e.f22292c);
        }

        public final Object c(Object obj) {
            return e.c(obj);
        }

        public b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f22293a = obj;
    }

    public static final /* synthetic */ e b(Object obj) {
        return new e(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof e) && kotlin.jvm.internal.p.a(obj, ((e) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f22294a;
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
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f22293a, obj);
    }

    public int hashCode() {
        return g(this.f22293a);
    }

    public final /* synthetic */ Object k() {
        return this.f22293a;
    }

    public String toString() {
        return j(this.f22293a);
    }
}
