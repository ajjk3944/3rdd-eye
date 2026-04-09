package W;

import N7.G8;
import W.b0;
import android.util.Range;

/* compiled from: AutoValue_VideoSpec.java */
/* renamed from: W.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626n extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final A f13285d;

    /* renamed from: e, reason: collision with root package name */
    public final Range<Integer> f13286e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f13287f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13288g;

    /* compiled from: AutoValue_VideoSpec.java */
    /* renamed from: W.n$a */
    public static final class a extends b0.a {

        /* renamed from: a, reason: collision with root package name */
        public A f13289a;

        /* renamed from: b, reason: collision with root package name */
        public Range<Integer> f13290b;

        /* renamed from: c, reason: collision with root package name */
        public Range<Integer> f13291c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f13292d;

        public final C1626n a() {
            String strS = this.f13289a == null ? " qualitySelector" : "";
            if (this.f13290b == null) {
                strS = strS.concat(" frameRate");
            }
            if (this.f13291c == null) {
                strS = G8.s(strS, " bitrate");
            }
            if (this.f13292d == null) {
                strS = G8.s(strS, " aspectRatio");
            }
            if (strS.isEmpty()) {
                return new C1626n(this.f13289a, this.f13290b, this.f13291c, this.f13292d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }

        public final a b(int i) {
            this.f13292d = Integer.valueOf(i);
            return this;
        }
    }

    public C1626n(A a10, Range range, Range range2, int i) {
        this.f13285d = a10;
        this.f13286e = range;
        this.f13287f = range2;
        this.f13288g = i;
    }

    @Override // W.b0
    public final int b() {
        return this.f13288g;
    }

    @Override // W.b0
    public final Range<Integer> c() {
        return this.f13287f;
    }

    @Override // W.b0
    public final Range<Integer> d() {
        return this.f13286e;
    }

    @Override // W.b0
    public final A e() {
        return this.f13285d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f13285d.equals(b0Var.e()) && this.f13286e.equals(b0Var.d()) && this.f13287f.equals(b0Var.c()) && this.f13288g == b0Var.b();
    }

    @Override // W.b0
    public final a f() {
        a aVar = new a();
        aVar.f13289a = this.f13285d;
        aVar.f13290b = this.f13286e;
        aVar.f13291c = this.f13287f;
        aVar.f13292d = Integer.valueOf(this.f13288g);
        return aVar;
    }

    public final int hashCode() {
        return ((((((this.f13285d.hashCode() ^ 1000003) * 1000003) ^ this.f13286e.hashCode()) * 1000003) ^ this.f13287f.hashCode()) * 1000003) ^ this.f13288g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.f13285d);
        sb.append(", frameRate=");
        sb.append(this.f13286e);
        sb.append(", bitrate=");
        sb.append(this.f13287f);
        sb.append(", aspectRatio=");
        return B4.i.j(sb, this.f13288g, "}");
    }
}
