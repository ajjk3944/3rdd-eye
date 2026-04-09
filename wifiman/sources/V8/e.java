package V8;

import T8.b;
import Z8.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class e extends com.ui.btle.v2.b {

    public interface a extends b.a {
    }

    public static final class b implements b.InterfaceC0787b {

        /* renamed from: a, reason: collision with root package name */
        private final a.AbstractC0966a f23161a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC0859b f23162b;

        /* renamed from: c, reason: collision with root package name */
        private final a f23163c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f23164d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f23165e;

        public static abstract class a {

            /* renamed from: V8.e$b$a$a, reason: collision with other inner class name */
            public static final class C0858a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final int f23166a;

                /* renamed from: b, reason: collision with root package name */
                private final long f23167b;

                public C0858a(int i10, long j10) {
                    super(null);
                    this.f23166a = i10;
                    this.f23167b = j10;
                }

                public final long a() {
                    return this.f23167b;
                }

                public final int b() {
                    return this.f23166a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0858a)) {
                        return false;
                    }
                    C0858a c0858a = (C0858a) obj;
                    return this.f23166a == c0858a.f23166a && this.f23167b == c0858a.f23167b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f23166a) * 31) + Long.hashCode(this.f23167b);
                }

                public String toString() {
                    return "Specified(priorityValue=" + this.f23166a + ", prioritySetDelay=" + this.f23167b + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* renamed from: V8.e$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0859b {

            /* renamed from: V8.e$b$b$a */
            public static final class a extends AbstractC0859b {

                /* renamed from: a, reason: collision with root package name */
                private final int f23168a;

                public a(int i10) {
                    super(null);
                    this.f23168a = i10;
                }

                public final int a() {
                    return this.f23168a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.f23168a == ((a) obj).f23168a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f23168a);
                }

                public String toString() {
                    return "Specified(mtuValue=" + this.f23168a + ")";
                }
            }

            public /* synthetic */ AbstractC0859b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0859b() {
            }
        }

        public b(a.AbstractC0966a encryption, AbstractC0859b mtuRequested, a connectionPriority, boolean z10, boolean z11) {
            AbstractC6492s.i(encryption, "encryption");
            AbstractC6492s.i(mtuRequested, "mtuRequested");
            AbstractC6492s.i(connectionPriority, "connectionPriority");
            this.f23161a = encryption;
            this.f23162b = mtuRequested;
            this.f23163c = connectionPriority;
            this.f23164d = z10;
            this.f23165e = z11;
        }

        public final a a() {
            return this.f23163c;
        }

        public a.AbstractC0966a b() {
            return this.f23161a;
        }

        public final boolean c() {
            return this.f23164d;
        }

        public final AbstractC0859b d() {
            return this.f23162b;
        }

        public final boolean e() {
            return this.f23165e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f23161a, bVar.f23161a) && AbstractC6492s.d(this.f23162b, bVar.f23162b) && AbstractC6492s.d(this.f23163c, bVar.f23163c) && this.f23164d == bVar.f23164d && this.f23165e == bVar.f23165e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((((this.f23161a.hashCode() * 31) + this.f23162b.hashCode()) * 31) + this.f23163c.hashCode()) * 31;
            boolean z10 = this.f23164d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (iHashCode + i10) * 31;
            boolean z11 = this.f23165e;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "Params(encryption=" + this.f23161a + ", mtuRequested=" + this.f23162b + ", connectionPriority=" + this.f23163c + ", longWriteSupported=" + this.f23164d + ", writeFragmentationSupported=" + this.f23165e + ")";
        }

        public /* synthetic */ b(a.AbstractC0966a abstractC0966a, AbstractC0859b abstractC0859b, a aVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new a.AbstractC0966a.C0967a(null, null, 3, null) : abstractC0966a, (i10 & 2) != 0 ? new AbstractC0859b.a(com.ui.btle.rxandroidble.a.f41105a.a()) : abstractC0859b, (i10 & 4) != 0 ? new a.C0858a(1, 1000L) : aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11);
        }
    }
}
