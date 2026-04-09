package od;

import android.graphics.Color;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.InterfaceC6548c;

/* loaded from: classes4.dex */
public final class g implements InterfaceC6548c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f55636c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final int f55637d = Color.argb(255, 255, 255, 255);

    /* renamed from: a, reason: collision with root package name */
    private final W7.d f55638a;

    /* renamed from: b, reason: collision with root package name */
    private b f55639b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g.f55637d;
        }

        private a() {
        }
    }

    public static final class b implements InterfaceC6548c.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f55640a;

        /* renamed from: b, reason: collision with root package name */
        private long f55641b;

        /* renamed from: c, reason: collision with root package name */
        private int f55642c = g.f55636c.a();

        public b(boolean z10, long j10) {
            this.f55640a = z10;
            this.f55641b = j10;
        }

        @Override // l7.InterfaceC6548c.b
        public void a(int i10) {
            this.f55642c = i10;
        }

        @Override // l7.InterfaceC6548c.b
        public int b() {
            return this.f55642c;
        }

        @Override // l7.InterfaceC6548c.b
        public long c() {
            return this.f55641b;
        }

        @Override // l7.InterfaceC6548c.b
        public void d(boolean z10) {
            this.f55640a = z10;
        }

        @Override // l7.InterfaceC6548c.b
        public boolean e() {
            return this.f55640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55640a == bVar.f55640a && this.f55641b == bVar.f55641b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f55640a) * 31) + Long.hashCode(this.f55641b);
        }

        public String toString() {
            return "Stats(discovered=" + this.f55640a + ", updatedAt=" + this.f55641b + ")";
        }
    }

    public g(W7.d coordinates, b stats) {
        AbstractC6492s.i(coordinates, "coordinates");
        AbstractC6492s.i(stats, "stats");
        this.f55638a = coordinates;
        this.f55639b = stats;
    }

    @Override // l7.InterfaceC6548c, l7.InterfaceC6546a
    public int b() {
        return InterfaceC6548c.a.a(this);
    }

    @Override // l7.InterfaceC6554i
    public W7.d c() {
        return this.f55638a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC6492s.d(this.f55638a, gVar.f55638a) && AbstractC6492s.d(this.f55639b, gVar.f55639b);
    }

    @Override // l7.InterfaceC6548c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        return this.f55639b;
    }

    public int hashCode() {
        return (this.f55638a.hashCode() * 31) + this.f55639b.hashCode();
    }

    public String toString() {
        return "Floor(coordinates=" + this.f55638a + ", stats=" + this.f55639b + ")";
    }
}
