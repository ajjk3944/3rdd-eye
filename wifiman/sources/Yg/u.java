package Yg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class u implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25017b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f25018a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f25019a;

        public b(Throwable exception) {
            AbstractC6492s.i(exception, "exception");
            this.f25019a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC6492s.d(this.f25019a, ((b) obj).f25019a);
        }

        public int hashCode() {
            return this.f25019a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f25019a + ')';
        }
    }

    private /* synthetic */ u(Object obj) {
        this.f25018a = obj;
    }

    public static final /* synthetic */ u a(Object obj) {
        return new u(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof u) && AbstractC6492s.d(obj, ((u) obj2).o());
    }

    public static final boolean g(Object obj, Object obj2) {
        return AbstractC6492s.d(obj, obj2);
    }

    public static final Throwable h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f25019a;
        }
        return null;
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean l(Object obj) {
        return obj instanceof b;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof b);
    }

    public static String n(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f25018a, obj);
    }

    public int hashCode() {
        return j(this.f25018a);
    }

    public final /* synthetic */ Object o() {
        return this.f25018a;
    }

    public String toString() {
        return n(this.f25018a);
    }
}
