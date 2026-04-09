package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f52914d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final g1 f52915e = new g1(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name */
    private final long f52916a;

    /* renamed from: b, reason: collision with root package name */
    private final long f52917b;

    /* renamed from: c, reason: collision with root package name */
    private final float f52918c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g1 a() {
            return g1.f52915e;
        }

        private a() {
        }
    }

    public /* synthetic */ g1(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f52918c;
    }

    public final long c() {
        return this.f52916a;
    }

    public final long d() {
        return this.f52917b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return C6733v0.m(this.f52916a, g1Var.f52916a) && C6531g.j(this.f52917b, g1Var.f52917b) && this.f52918c == g1Var.f52918c;
    }

    public int hashCode() {
        return (((C6733v0.s(this.f52916a) * 31) + C6531g.o(this.f52917b)) * 31) + Float.hashCode(this.f52918c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C6733v0.t(this.f52916a)) + ", offset=" + ((Object) C6531g.t(this.f52917b)) + ", blurRadius=" + this.f52918c + ')';
    }

    private g1(long j10, long j11, float f10) {
        this.f52916a = j10;
        this.f52917b = j11;
        this.f52918c = f10;
    }

    public /* synthetic */ g1(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6737x0.d(4278190080L) : j10, (i10 & 2) != 0 ? C6531g.f52335b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
