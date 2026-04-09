package W;

import N7.G8;
import W.AbstractC1613a;
import android.util.Range;

/* compiled from: AutoValue_AudioSpec.java */
/* renamed from: W.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615c extends AbstractC1613a {

    /* renamed from: c, reason: collision with root package name */
    public final Range<Integer> f13238c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13239d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13240e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f13241f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13242g;

    /* compiled from: AutoValue_AudioSpec.java */
    /* renamed from: W.c$a */
    public static final class a extends AbstractC1613a.AbstractC0187a {

        /* renamed from: a, reason: collision with root package name */
        public Range<Integer> f13243a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13244b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13245c;

        /* renamed from: d, reason: collision with root package name */
        public Range<Integer> f13246d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f13247e;

        public final C1615c a() {
            String strS = this.f13243a == null ? " bitrate" : "";
            if (this.f13246d == null) {
                strS = G8.s(strS, " sampleRate");
            }
            if (strS.isEmpty()) {
                return new C1615c(this.f13243a, this.f13244b.intValue(), this.f13245c.intValue(), this.f13246d, this.f13247e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }
    }

    public C1615c(Range range, int i, int i10, Range range2, int i11) {
        this.f13238c = range;
        this.f13239d = i;
        this.f13240e = i10;
        this.f13241f = range2;
        this.f13242g = i11;
    }

    @Override // W.AbstractC1613a
    public final Range<Integer> b() {
        return this.f13238c;
    }

    @Override // W.AbstractC1613a
    public final int c() {
        return this.f13242g;
    }

    @Override // W.AbstractC1613a
    public final Range<Integer> d() {
        return this.f13241f;
    }

    @Override // W.AbstractC1613a
    public final int e() {
        return this.f13240e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1613a)) {
            return false;
        }
        AbstractC1613a abstractC1613a = (AbstractC1613a) obj;
        return this.f13238c.equals(abstractC1613a.b()) && this.f13239d == abstractC1613a.f() && this.f13240e == abstractC1613a.e() && this.f13241f.equals(abstractC1613a.d()) && this.f13242g == abstractC1613a.c();
    }

    @Override // W.AbstractC1613a
    public final int f() {
        return this.f13239d;
    }

    public final int hashCode() {
        return ((((((((this.f13238c.hashCode() ^ 1000003) * 1000003) ^ this.f13239d) * 1000003) ^ this.f13240e) * 1000003) ^ this.f13241f.hashCode()) * 1000003) ^ this.f13242g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.f13238c);
        sb.append(", sourceFormat=");
        sb.append(this.f13239d);
        sb.append(", source=");
        sb.append(this.f13240e);
        sb.append(", sampleRate=");
        sb.append(this.f13241f);
        sb.append(", channelCount=");
        return B4.i.j(sb, this.f13242g, "}");
    }
}
