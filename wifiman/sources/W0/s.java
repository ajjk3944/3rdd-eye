package W0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23558c;

    /* renamed from: d, reason: collision with root package name */
    private static final s f23559d;

    /* renamed from: e, reason: collision with root package name */
    private static final s f23560e;

    /* renamed from: a, reason: collision with root package name */
    private final int f23561a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23562b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            return s.f23559d;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23563a = new a(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f23564b = d(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f23565c = d(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f23566d = d(3);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f23565c;
            }

            public final int b() {
                return b.f23564b;
            }

            public final int c() {
                return b.f23566d;
            }

            private a() {
            }
        }

        private static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f23558c = new a(defaultConstructorMarker);
        b.a aVar = b.f23563a;
        f23559d = new s(aVar.a(), false, defaultConstructorMarker);
        f23560e = new s(aVar.b(), true, defaultConstructorMarker);
    }

    public /* synthetic */ s(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f23561a;
    }

    public final boolean c() {
        return this.f23562b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return b.e(this.f23561a, sVar.f23561a) && this.f23562b == sVar.f23562b;
    }

    public int hashCode() {
        return (b.f(this.f23561a) * 31) + Boolean.hashCode(this.f23562b);
    }

    public String toString() {
        return AbstractC6492s.d(this, f23559d) ? "TextMotion.Static" : AbstractC6492s.d(this, f23560e) ? "TextMotion.Animated" : "Invalid";
    }

    private s(int i10, boolean z10) {
        this.f23561a = i10;
        this.f23562b = z10;
    }
}
