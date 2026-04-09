package V7;

import W7.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a extends f {

    /* renamed from: V7.a$a, reason: collision with other inner class name */
    public static final class C0841a extends a {

        /* renamed from: e, reason: collision with root package name */
        public static final C0842a f23089e = new C0842a(null);

        /* renamed from: c, reason: collision with root package name */
        private final int f23090c;

        /* renamed from: d, reason: collision with root package name */
        private final f.a f23091d;

        /* renamed from: V7.a$a$a, reason: collision with other inner class name */
        public static final class C0842a {
            public /* synthetic */ C0842a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C0841a a(int i10) {
                if (i10 < -10 && i10 > -150) {
                    return new C0841a(Math.max(Math.min(i10, -50), -110));
                }
                return null;
            }

            private C0842a() {
            }
        }

        public C0841a(int i10) {
            super(null);
            this.f23090c = i10;
            this.f23091d = b() >= -80 ? f.a.EXCELLENT : b() >= -100 ? f.a.GOOD : f.a.POOR;
        }

        @Override // W7.f
        public int b() {
            return this.f23090c;
        }

        @Override // W7.f
        public int c() {
            return -50;
        }

        @Override // W7.f
        public int d() {
            return -110;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0841a) && this.f23090c == ((C0841a) obj).f23090c;
        }

        @Override // W7.f
        public f.a h() {
            return this.f23091d;
        }

        @Override // W7.f
        public int hashCode() {
            return Integer.hashCode(this.f23090c);
        }

        public String toString() {
            return "G3(dbm=" + this.f23090c + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: e, reason: collision with root package name */
        public static final C0843a f23092e = new C0843a(null);

        /* renamed from: c, reason: collision with root package name */
        private final int f23093c;

        /* renamed from: d, reason: collision with root package name */
        private final f.a f23094d;

        /* renamed from: V7.a$b$a, reason: collision with other inner class name */
        public static final class C0843a {
            public /* synthetic */ C0843a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i10) {
                if (i10 < -30 && i10 > -150) {
                    return new b(Math.max(Math.min(i10, -70), -120));
                }
                return null;
            }

            private C0843a() {
            }
        }

        public b(int i10) {
            super(null);
            this.f23093c = i10;
            this.f23094d = b() >= -95 ? f.a.EXCELLENT : b() >= -110 ? f.a.GOOD : f.a.POOR;
        }

        @Override // W7.f
        public int b() {
            return this.f23093c;
        }

        @Override // W7.f
        public int c() {
            return -70;
        }

        @Override // W7.f
        public int d() {
            return -120;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f23093c == ((b) obj).f23093c;
        }

        @Override // W7.f
        public f.a h() {
            return this.f23094d;
        }

        @Override // W7.f
        public int hashCode() {
            return Integer.hashCode(this.f23093c);
        }

        public String toString() {
            return "G5(dbm=" + this.f23093c + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
