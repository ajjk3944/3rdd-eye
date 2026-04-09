package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28823b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f28824c = j(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f28825d = j(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f28826e = j(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f28827f = j(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f28828g = j(5);

    /* renamed from: h, reason: collision with root package name */
    private static final int f28829h = j(6);

    /* renamed from: i, reason: collision with root package name */
    private static final int f28830i = j(7);

    /* renamed from: j, reason: collision with root package name */
    private static final int f28831j = j(8);

    /* renamed from: a, reason: collision with root package name */
    private final int f28832a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f28829h;
        }

        public final int b() {
            return d.f28830i;
        }

        public final int c() {
            return d.f28831j;
        }

        public final int d() {
            return d.f28826e;
        }

        public final int e() {
            return d.f28824c;
        }

        public final int f() {
            return d.f28825d;
        }

        public final int g() {
            return d.f28827f;
        }

        public final int h() {
            return d.f28828g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f28832a = i10;
    }

    public static final /* synthetic */ d i(int i10) {
        return new d(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f28824c) ? "Next" : l(i10, f28825d) ? "Previous" : l(i10, f28826e) ? "Left" : l(i10, f28827f) ? "Right" : l(i10, f28828g) ? "Up" : l(i10, f28829h) ? "Down" : l(i10, f28830i) ? "Enter" : l(i10, f28831j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f28832a, obj);
    }

    public int hashCode() {
        return m(this.f28832a);
    }

    public final /* synthetic */ int o() {
        return this.f28832a;
    }

    public String toString() {
        return n(this.f28832a);
    }
}
