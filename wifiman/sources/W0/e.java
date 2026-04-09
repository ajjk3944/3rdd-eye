package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23483b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f23484c = e(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f23485d = e(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f23486e = e(PduHandle.NONE);

    /* renamed from: a, reason: collision with root package name */
    private final int f23487a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f23485d;
        }

        public final int b() {
            return e.f23484c;
        }

        public final int c() {
            return e.f23486e;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i10) {
        this.f23487a = i10;
    }

    public static final /* synthetic */ e d(int i10) {
        return new e(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f23484c) ? "Hyphens.None" : g(i10, f23485d) ? "Hyphens.Auto" : g(i10, f23486e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f23487a, obj);
    }

    public int hashCode() {
        return h(this.f23487a);
    }

    public final /* synthetic */ int j() {
        return this.f23487a;
    }

    public String toString() {
        return i(this.f23487a);
    }
}
