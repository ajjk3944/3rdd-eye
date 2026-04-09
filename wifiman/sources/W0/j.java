package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23523b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f23524c = i(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f23525d = i(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f23526e = i(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f23527f = i(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f23528g = i(5);

    /* renamed from: h, reason: collision with root package name */
    private static final int f23529h = i(6);

    /* renamed from: i, reason: collision with root package name */
    private static final int f23530i = i(PduHandle.NONE);

    /* renamed from: a, reason: collision with root package name */
    private final int f23531a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f23526e;
        }

        public final int b() {
            return j.f23529h;
        }

        public final int c() {
            return j.f23527f;
        }

        public final int d() {
            return j.f23524c;
        }

        public final int e() {
            return j.f23525d;
        }

        public final int f() {
            return j.f23528g;
        }

        public final int g() {
            return j.f23530i;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i10) {
        this.f23531a = i10;
    }

    public static final /* synthetic */ j h(int i10) {
        return new j(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f23524c) ? "Left" : k(i10, f23525d) ? "Right" : k(i10, f23526e) ? "Center" : k(i10, f23527f) ? "Justify" : k(i10, f23528g) ? "Start" : k(i10, f23529h) ? "End" : k(i10, f23530i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f23531a, obj);
    }

    public int hashCode() {
        return l(this.f23531a);
    }

    public final /* synthetic */ int n() {
        return this.f23531a;
    }

    public String toString() {
        return m(this.f23531a);
    }
}
