package f0;

import Y0.o;
import Y0.r;
import Y0.t;
import f0.c;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    private final float f46593b;

    /* renamed from: c, reason: collision with root package name */
    private final float f46594c;

    public static final class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f46595a;

        public a(float f10) {
            this.f46595a = f10;
        }

        @Override // f0.c.b
        public int a(int i10, int i11, t tVar) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + (tVar == t.Ltr ? this.f46595a : (-1) * this.f46595a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f46595a, ((a) obj).f46595a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f46595a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f46595a + ')';
        }
    }

    public static final class b implements c.InterfaceC1752c {

        /* renamed from: a, reason: collision with root package name */
        private final float f46596a;

        public b(float f10) {
            this.f46596a = f10;
        }

        @Override // f0.c.InterfaceC1752c
        public int a(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f46596a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f46596a, ((b) obj).f46596a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f46596a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f46596a + ')';
        }
    }

    public e(float f10, float f11) {
        this.f46593b = f10;
        this.f46594c = f11;
    }

    @Override // f0.c
    public long a(long j10, long j11, t tVar) {
        float fG = (r.g(j11) - r.g(j10)) / 2.0f;
        float f10 = (r.f(j11) - r.f(j10)) / 2.0f;
        float f11 = 1;
        return o.a(Math.round(fG * ((tVar == t.Ltr ? this.f46593b : (-1) * this.f46593b) + f11)), Math.round(f10 * (f11 + this.f46594c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f46593b, eVar.f46593b) == 0 && Float.compare(this.f46594c, eVar.f46594c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f46593b) * 31) + Float.hashCode(this.f46594c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f46593b + ", verticalBias=" + this.f46594c + ')';
    }
}
