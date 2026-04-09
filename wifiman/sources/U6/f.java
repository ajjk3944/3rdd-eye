package u6;

import android.graphics.RectF;
import k6.C6396c;
import kotlin.jvm.internal.AbstractC6492s;
import u6.e;

/* loaded from: classes3.dex */
public final class f implements e, c {

    /* renamed from: a, reason: collision with root package name */
    private final RectF f62706a;

    /* renamed from: b, reason: collision with root package name */
    private float f62707b;

    /* renamed from: c, reason: collision with root package name */
    private float f62708c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62709d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f62710e;

    /* renamed from: f, reason: collision with root package name */
    private float f62711f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C8136a f62712g;

    /* renamed from: h, reason: collision with root package name */
    private final C6396c f62713h;

    public f(RectF canvasBounds, float f10, float f11, boolean z10, boolean z11, float f12) {
        AbstractC6492s.i(canvasBounds, "canvasBounds");
        this.f62706a = canvasBounds;
        this.f62707b = f10;
        this.f62708c = f11;
        this.f62709d = z10;
        this.f62710e = z11;
        this.f62711f = f12;
        this.f62712g = new C8136a();
        this.f62713h = new C6396c();
    }

    @Override // u6.e
    public float b(float f10) {
        return e.a.e(this, f10);
    }

    @Override // u6.e
    public C6396c c() {
        return this.f62713h;
    }

    @Override // u6.c
    public void e(Object key, Object value) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        this.f62712g.e(key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC6492s.d(s(), fVar.s()) && Float.compare(getDensity(), fVar.getDensity()) == 0 && Float.compare(y(), fVar.y()) == 0 && h() == fVar.h() && f() == fVar.f() && Float.compare(l(), fVar.l()) == 0;
    }

    @Override // u6.e
    public boolean f() {
        return this.f62710e;
    }

    @Override // u6.e
    public float g(float f10) {
        return e.a.b(this, f10);
    }

    @Override // u6.e
    public float getDensity() {
        return this.f62707b;
    }

    @Override // u6.e
    public boolean h() {
        return this.f62709d;
    }

    public int hashCode() {
        int iHashCode = ((((s().hashCode() * 31) + Float.hashCode(getDensity())) * 31) + Float.hashCode(y())) * 31;
        boolean zH = h();
        int i10 = zH;
        if (zH) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean zF = f();
        return ((i11 + (zF ? 1 : zF)) * 31) + Float.hashCode(l());
    }

    @Override // u6.e
    public float j() {
        return e.a.a(this);
    }

    @Override // u6.e
    public float l() {
        return this.f62711f;
    }

    @Override // u6.e
    public float m(float f10) {
        return e.a.d(this, f10);
    }

    @Override // u6.e
    public int o(float f10) {
        return e.a.c(this, f10);
    }

    @Override // u6.c
    public boolean p(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f62712g.p(key);
    }

    @Override // u6.c
    public Object q(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f62712g.q(key);
    }

    public void r() {
        this.f62712g.r();
    }

    public RectF s() {
        return this.f62706a;
    }

    public void t() {
        r();
        c().c();
    }

    public String toString() {
        return "MutableMeasureContext(canvasBounds=" + s() + ", density=" + getDensity() + ", fontScale=" + y() + ", isLtr=" + h() + ", isHorizontalScrollEnabled=" + f() + ", chartScale=" + l() + ')';
    }

    public void u(float f10) {
        this.f62711f = f10;
    }

    public void v(float f10) {
        this.f62707b = f10;
    }

    public void w(float f10) {
        this.f62708c = f10;
    }

    public void x(boolean z10) {
        this.f62710e = z10;
    }

    @Override // u6.e
    public float y() {
        return this.f62708c;
    }

    public void z(boolean z10) {
        this.f62709d = z10;
    }
}
