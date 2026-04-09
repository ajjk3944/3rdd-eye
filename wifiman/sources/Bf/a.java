package Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class a implements x6.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f1710a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1711b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1712c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1713d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1714e;

    /* renamed from: f, reason: collision with root package name */
    private final float f1715f;

    /* renamed from: g, reason: collision with root package name */
    private final float f1716g;

    /* renamed from: h, reason: collision with root package name */
    private final float f1717h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1718i;

    public a(List entries, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        AbstractC6492s.i(entries, "entries");
        this.f1710a = entries;
        this.f1711b = f10;
        this.f1712c = f11;
        this.f1713d = f12;
        this.f1714e = f13;
        this.f1715f = f14;
        this.f1716g = f15;
        this.f1717h = f16;
        this.f1718i = i10;
    }

    @Override // x6.b
    public float a() {
        return this.f1714e;
    }

    @Override // x6.b
    public float b() {
        return this.f1712c;
    }

    @Override // x6.b
    public float c() {
        return this.f1713d;
    }

    @Override // x6.b
    public float d() {
        return this.f1717h;
    }

    @Override // x6.b
    public float e() {
        return this.f1711b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f1710a, aVar.f1710a) && Float.compare(this.f1711b, aVar.f1711b) == 0 && Float.compare(this.f1712c, aVar.f1712c) == 0 && Float.compare(this.f1713d, aVar.f1713d) == 0 && Float.compare(this.f1714e, aVar.f1714e) == 0 && Float.compare(this.f1715f, aVar.f1715f) == 0 && Float.compare(this.f1716g, aVar.f1716g) == 0 && Float.compare(this.f1717h, aVar.f1717h) == 0 && this.f1718i == aVar.f1718i;
    }

    @Override // x6.b
    public List f() {
        return this.f1710a;
    }

    @Override // x6.b
    public float g() {
        return this.f1716g;
    }

    @Override // x6.b
    public int getId() {
        return this.f1718i;
    }

    @Override // x6.b
    public float h() {
        return this.f1715f;
    }

    public int hashCode() {
        return (((((((((((((((this.f1710a.hashCode() * 31) + Float.hashCode(this.f1711b)) * 31) + Float.hashCode(this.f1712c)) * 31) + Float.hashCode(this.f1713d)) * 31) + Float.hashCode(this.f1714e)) * 31) + Float.hashCode(this.f1715f)) * 31) + Float.hashCode(this.f1716g)) * 31) + Float.hashCode(this.f1717h)) * 31) + Integer.hashCode(this.f1718i);
    }

    public String toString() {
        return "SpectrumChartModel(entries=" + this.f1710a + ", minX=" + this.f1711b + ", maxX=" + this.f1712c + ", minY=" + this.f1713d + ", maxY=" + this.f1714e + ", stackedPositiveY=" + this.f1715f + ", stackedNegativeY=" + this.f1716g + ", stepX=" + this.f1717h + ", id=" + this.f1718i + ")";
    }
}
