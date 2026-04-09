package xe;

import Li.InterfaceC3220g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* renamed from: xe.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8511f {

    /* renamed from: xe.f$a */
    public static abstract class a {

        /* renamed from: xe.f$a$a, reason: collision with other inner class name */
        public static final class C2336a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2336a f66005a = new C2336a();

            private C2336a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2336a);
            }

            public int hashCode() {
                return 816900063;
            }

            public String toString() {
                return "CloseCurrent";
            }
        }

        /* renamed from: xe.f$a$b */
        public static abstract class b extends a {

            /* renamed from: xe.f$a$b$a, reason: collision with other inner class name */
            public static final class C2337a extends b {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC8464F f66006a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2337a(AbstractC8464F screen) {
                    super(null);
                    AbstractC6492s.i(screen, "screen");
                    this.f66006a = screen;
                }

                public final AbstractC8464F a() {
                    return this.f66006a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2337a) && AbstractC6492s.d(this.f66006a, ((C2337a) obj).f66006a);
                }

                public int hashCode() {
                    return this.f66006a.hashCode();
                }

                public String toString() {
                    return "AppScreen(screen=" + this.f66006a + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: xe.f$b */
    public interface b {
        void a();
    }

    InterfaceC3220g a();

    /* renamed from: xe.f$c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final long f66007a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6824a f66008b;

        /* renamed from: c, reason: collision with root package name */
        private long f66009c;

        public c(long j10, InterfaceC6824a onNavigateBack) {
            AbstractC6492s.i(onNavigateBack, "onNavigateBack");
            this.f66007a = j10;
            this.f66008b = onNavigateBack;
        }

        @Override // xe.InterfaceC8511f.b
        public void a() {
            if (System.currentTimeMillis() - this.f66009c > this.f66007a) {
                this.f66009c = System.currentTimeMillis();
                this.f66008b.invoke();
            }
        }

        public /* synthetic */ c(long j10, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 500L : j10, interfaceC6824a);
        }
    }
}
