package ma;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import r9.C7579a;

/* renamed from: ma.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6784a {

    /* renamed from: ma.a$a, reason: collision with other inner class name */
    public static final class C1953a {

        /* renamed from: a, reason: collision with root package name */
        private final C7579a.b f53637a;

        /* renamed from: b, reason: collision with root package name */
        private final C7579a.b f53638b;

        /* renamed from: c, reason: collision with root package name */
        private final C7579a.C2093a f53639c;

        /* renamed from: d, reason: collision with root package name */
        private final C7579a.C2093a f53640d;

        /* renamed from: e, reason: collision with root package name */
        private final C7579a.C2093a f53641e;

        /* renamed from: f, reason: collision with root package name */
        private final C7579a.C2093a f53642f;

        /* renamed from: g, reason: collision with root package name */
        private final C7579a.C2093a f53643g;

        /* renamed from: h, reason: collision with root package name */
        private final C7579a.C2093a f53644h;

        /* renamed from: i, reason: collision with root package name */
        private final C7579a.C2093a f53645i;

        /* renamed from: j, reason: collision with root package name */
        private final C7579a.C2093a f53646j;

        /* renamed from: k, reason: collision with root package name */
        private final C7579a.C2093a f53647k;

        public C1953a(C7579a.b neutral, C7579a.b neutralAlpha, C7579a.C2093a blue, C7579a.C2093a navy, C7579a.C2093a aqua, C7579a.C2093a green, C7579a.C2093a lime, C7579a.C2093a yellow, C7579a.C2093a orange, C7579a.C2093a red, C7579a.C2093a purple) {
            AbstractC6492s.i(neutral, "neutral");
            AbstractC6492s.i(neutralAlpha, "neutralAlpha");
            AbstractC6492s.i(blue, "blue");
            AbstractC6492s.i(navy, "navy");
            AbstractC6492s.i(aqua, "aqua");
            AbstractC6492s.i(green, "green");
            AbstractC6492s.i(lime, "lime");
            AbstractC6492s.i(yellow, "yellow");
            AbstractC6492s.i(orange, "orange");
            AbstractC6492s.i(red, "red");
            AbstractC6492s.i(purple, "purple");
            this.f53637a = neutral;
            this.f53638b = neutralAlpha;
            this.f53639c = blue;
            this.f53640d = navy;
            this.f53641e = aqua;
            this.f53642f = green;
            this.f53643g = lime;
            this.f53644h = yellow;
            this.f53645i = orange;
            this.f53646j = red;
            this.f53647k = purple;
        }

        public final C7579a.C2093a a() {
            return this.f53641e;
        }

        public final C7579a.C2093a b() {
            return this.f53639c;
        }

        public final long c() {
            return this.f53646j.f();
        }

        public final C7579a.C2093a d() {
            return this.f53642f;
        }

        public final C7579a.C2093a e() {
            return this.f53643g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1953a)) {
                return false;
            }
            C1953a c1953a = (C1953a) obj;
            return AbstractC6492s.d(this.f53637a, c1953a.f53637a) && AbstractC6492s.d(this.f53638b, c1953a.f53638b) && AbstractC6492s.d(this.f53639c, c1953a.f53639c) && AbstractC6492s.d(this.f53640d, c1953a.f53640d) && AbstractC6492s.d(this.f53641e, c1953a.f53641e) && AbstractC6492s.d(this.f53642f, c1953a.f53642f) && AbstractC6492s.d(this.f53643g, c1953a.f53643g) && AbstractC6492s.d(this.f53644h, c1953a.f53644h) && AbstractC6492s.d(this.f53645i, c1953a.f53645i) && AbstractC6492s.d(this.f53646j, c1953a.f53646j) && AbstractC6492s.d(this.f53647k, c1953a.f53647k);
        }

        public final C7579a.C2093a f() {
            return this.f53640d;
        }

        public final C7579a.b g() {
            return this.f53637a;
        }

        public final C7579a.C2093a h() {
            return this.f53645i;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f53637a.hashCode() * 31) + this.f53638b.hashCode()) * 31) + this.f53639c.hashCode()) * 31) + this.f53640d.hashCode()) * 31) + this.f53641e.hashCode()) * 31) + this.f53642f.hashCode()) * 31) + this.f53643g.hashCode()) * 31) + this.f53644h.hashCode()) * 31) + this.f53645i.hashCode()) * 31) + this.f53646j.hashCode()) * 31) + this.f53647k.hashCode();
        }

        public final long i() {
            return this.f53642f.f();
        }

        public final long j() {
            return this.f53639c.f();
        }

        public final C7579a.C2093a k() {
            return this.f53647k;
        }

        public final C7579a.C2093a l() {
            return this.f53646j;
        }

        public String toString() {
            return "Base(neutral=" + this.f53637a + ", neutralAlpha=" + this.f53638b + ", blue=" + this.f53639c + ", navy=" + this.f53640d + ", aqua=" + this.f53641e + ", green=" + this.f53642f + ", lime=" + this.f53643g + ", yellow=" + this.f53644h + ", orange=" + this.f53645i + ", red=" + this.f53646j + ", purple=" + this.f53647k + ")";
        }
    }

    /* renamed from: ma.a$b */
    public static final class b extends AbstractC6784a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f53648a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final f f53649b;

        /* renamed from: c, reason: collision with root package name */
        private static final f f53650c;

        /* renamed from: d, reason: collision with root package name */
        private static final c f53651d;

        /* renamed from: e, reason: collision with root package name */
        private static final e f53652e;

        /* renamed from: f, reason: collision with root package name */
        private static final long f53653f;

        /* renamed from: g, reason: collision with root package name */
        private static final long f53654g;

        /* renamed from: h, reason: collision with root package name */
        private static final C1953a f53655h;

        static {
            C7579a c7579a = C7579a.f60138a;
            f53649b = new f(c7579a.n().d(), c7579a.n().c(), c7579a.n().j(), c7579a.n().i(), null);
            f53650c = new f(c7579a.m().d(), c7579a.m().c(), c7579a.m().j(), c7579a.m().i(), null);
            f53651d = new c(c7579a.n().j(), c7579a.d().f(), c7579a.f().f(), c7579a.p().f(), c7579a.t().f(), null);
            f53652e = new e(c7579a.v());
            f53653f = C6733v0.k(c7579a.n().a(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
            f53654g = c7579a.n().e();
            f53655h = new C1953a(c7579a.n(), c7579a.m(), c7579a.d(), c7579a.j(), c7579a.b(), c7579a.f(), c7579a.h(), c7579a.x(), c7579a.p(), c7579a.t(), c7579a.r());
        }

        private b() {
            super(null);
        }

        @Override // ma.AbstractC6784a
        public C1953a a() {
            return f53655h;
        }

        @Override // ma.AbstractC6784a
        public long b() {
            return f53654g;
        }

        @Override // ma.AbstractC6784a
        public c c() {
            return f53651d;
        }

        @Override // ma.AbstractC6784a
        public long d() {
            return f53653f;
        }

        @Override // ma.AbstractC6784a
        public e e() {
            return f53652e;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // ma.AbstractC6784a
        public f f() {
            return f53649b;
        }

        @Override // ma.AbstractC6784a
        public f g() {
            return f53650c;
        }

        public int hashCode() {
            return 2055534960;
        }

        public String toString() {
            return "Dark";
        }
    }

    /* renamed from: ma.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f53656a;

        /* renamed from: b, reason: collision with root package name */
        private final long f53657b;

        /* renamed from: c, reason: collision with root package name */
        private final long f53658c;

        /* renamed from: d, reason: collision with root package name */
        private final long f53659d;

        /* renamed from: e, reason: collision with root package name */
        private final long f53660e;

        public /* synthetic */ c(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, j12, j13, j14);
        }

        public final long a() {
            return this.f53656a;
        }

        public final long b() {
            return this.f53659d;
        }

        public final long c() {
            return this.f53658c;
        }

        public final long d() {
            return this.f53657b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C6733v0.m(this.f53656a, cVar.f53656a) && C6733v0.m(this.f53657b, cVar.f53657b) && C6733v0.m(this.f53658c, cVar.f53658c) && C6733v0.m(this.f53659d, cVar.f53659d) && C6733v0.m(this.f53660e, cVar.f53660e);
        }

        public int hashCode() {
            return (((((((C6733v0.s(this.f53656a) * 31) + C6733v0.s(this.f53657b)) * 31) + C6733v0.s(this.f53658c)) * 31) + C6733v0.s(this.f53659d)) * 31) + C6733v0.s(this.f53660e);
        }

        public String toString() {
            return "Icon(neutral=" + C6733v0.t(this.f53656a) + ", primary=" + C6733v0.t(this.f53657b) + ", positive=" + C6733v0.t(this.f53658c) + ", notice=" + C6733v0.t(this.f53659d) + ", destructive=" + C6733v0.t(this.f53660e) + ")";
        }

        private c(long j10, long j11, long j12, long j13, long j14) {
            this.f53656a = j10;
            this.f53657b = j11;
            this.f53658c = j12;
            this.f53659d = j13;
            this.f53660e = j14;
        }
    }

    /* renamed from: ma.a$d */
    public static final class d extends AbstractC6784a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f53661a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final f f53662b;

        /* renamed from: c, reason: collision with root package name */
        private static final f f53663c;

        /* renamed from: d, reason: collision with root package name */
        private static final c f53664d;

        /* renamed from: e, reason: collision with root package name */
        private static final e f53665e;

        /* renamed from: f, reason: collision with root package name */
        private static final long f53666f;

        /* renamed from: g, reason: collision with root package name */
        private static final long f53667g;

        /* renamed from: h, reason: collision with root package name */
        private static final C1953a f53668h;

        static {
            C7579a c7579a = C7579a.f60138a;
            f53662b = new f(c7579a.k().d(), c7579a.k().c(), c7579a.k().j(), c7579a.k().i(), null);
            f53663c = new f(c7579a.l().d(), c7579a.l().c(), c7579a.l().j(), c7579a.l().i(), null);
            f53664d = new c(c7579a.k().j(), c7579a.c().f(), c7579a.e().f(), c7579a.o().f(), c7579a.s().f(), null);
            f53665e = new e(c7579a.u());
            f53666f = C6733v0.k(c7579a.k().d(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
            f53667g = c7579a.k().e();
            f53668h = new C1953a(c7579a.k(), c7579a.l(), c7579a.c(), c7579a.i(), c7579a.a(), c7579a.e(), c7579a.g(), c7579a.w(), c7579a.o(), c7579a.s(), c7579a.q());
        }

        private d() {
            super(null);
        }

        @Override // ma.AbstractC6784a
        public C1953a a() {
            return f53668h;
        }

        @Override // ma.AbstractC6784a
        public long b() {
            return f53667g;
        }

        @Override // ma.AbstractC6784a
        public c c() {
            return f53664d;
        }

        @Override // ma.AbstractC6784a
        public long d() {
            return f53666f;
        }

        @Override // ma.AbstractC6784a
        public e e() {
            return f53665e;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // ma.AbstractC6784a
        public f f() {
            return f53662b;
        }

        @Override // ma.AbstractC6784a
        public f g() {
            return f53663c;
        }

        public int hashCode() {
            return -695309732;
        }

        public String toString() {
            return "Light";
        }
    }

    /* renamed from: ma.a$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final C7579a.c f53669a;

        public e(C7579a.c palette) {
            AbstractC6492s.i(palette, "palette");
            this.f53669a = palette;
        }

        public final long a() {
            return this.f53669a.a();
        }

        public final long b() {
            return this.f53669a.b();
        }

        public final C7579a.c c() {
            return this.f53669a;
        }

        public final long d() {
            return this.f53669a.d();
        }

        public final long e() {
            return this.f53669a.e();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC6492s.d(this.f53669a, ((e) obj).f53669a);
        }

        public int hashCode() {
            return this.f53669a.hashCode();
        }

        public String toString() {
            return "Surface(palette=" + this.f53669a + ")";
        }
    }

    /* renamed from: ma.a$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final long f53670a;

        /* renamed from: b, reason: collision with root package name */
        private final long f53671b;

        /* renamed from: c, reason: collision with root package name */
        private final long f53672c;

        /* renamed from: d, reason: collision with root package name */
        private final long f53673d;

        public /* synthetic */ f(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, j12, j13);
        }

        public final long a() {
            return this.f53670a;
        }

        public final long b() {
            return this.f53671b;
        }

        public final long c() {
            return this.f53672c;
        }

        public final long d() {
            return this.f53673d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C6733v0.m(this.f53670a, fVar.f53670a) && C6733v0.m(this.f53671b, fVar.f53671b) && C6733v0.m(this.f53672c, fVar.f53672c) && C6733v0.m(this.f53673d, fVar.f53673d);
        }

        public int hashCode() {
            return (((((C6733v0.s(this.f53670a) * 31) + C6733v0.s(this.f53671b)) * 31) + C6733v0.s(this.f53672c)) * 31) + C6733v0.s(this.f53673d);
        }

        public String toString() {
            return "Text(_1=" + C6733v0.t(this.f53670a) + ", _2=" + C6733v0.t(this.f53671b) + ", _3=" + C6733v0.t(this.f53672c) + ", _4=" + C6733v0.t(this.f53673d) + ")";
        }

        private f(long j10, long j11, long j12, long j13) {
            this.f53670a = j10;
            this.f53671b = j11;
            this.f53672c = j12;
            this.f53673d = j13;
        }
    }

    public /* synthetic */ AbstractC6784a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C1953a a();

    public abstract long b();

    public abstract c c();

    public abstract long d();

    public abstract e e();

    public abstract f f();

    public abstract f g();

    private AbstractC6784a() {
    }
}
