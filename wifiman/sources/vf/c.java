package Vf;

import kotlin.jvm.internal.AbstractC6492s;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float f23394a;

    /* renamed from: b, reason: collision with root package name */
    private final float f23395b;

    /* renamed from: c, reason: collision with root package name */
    private C6533i f23396c;

    /* renamed from: e, reason: collision with root package name */
    private float f23398e;

    /* renamed from: g, reason: collision with root package name */
    private C6533i f23400g;

    /* renamed from: h, reason: collision with root package name */
    private C6533i f23401h;

    /* renamed from: d, reason: collision with root package name */
    private long f23397d = C6537m.f52356b.b();

    /* renamed from: f, reason: collision with root package name */
    private long f23399f = C6531g.f52335b.b();

    public c(float f10, float f11) {
        this.f23394a = f10;
        this.f23395b = i(g(f11));
        C6533i.a aVar = C6533i.f52340e;
        this.f23400g = aVar.a();
        this.f23401h = aVar.a();
    }

    private final void a() {
        if (this.f23401h.u()) {
            return;
        }
        C6533i c6533i = this.f23396c;
        if (c6533i == null) {
            c6533i = this.f23401h;
        }
        this.f23400g = c6533i;
        this.f23399f = C6531g.r(C6531g.u(this.f23401h.p()), this.f23400g.i());
        long jM = this.f23400g.m();
        if (C6537m.f(this.f23397d, jM)) {
            return;
        }
        this.f23397d = jM;
        b();
    }

    private final void b() {
        float f10 = 2;
        float fI = C6537m.i(this.f23397d) / f10;
        double d10 = 2;
        this.f23398e = (((float) Math.cos(((float) Math.acos(fI / r1)) - this.f23395b)) * ((float) Math.sqrt(((float) Math.pow(fI, d10)) + ((float) Math.pow(C6537m.g(this.f23397d) / f10, d10)))) * f10) + this.f23394a;
    }

    private final float g(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("The shimmer's rotation must be a positive number");
        }
        float f11 = 90;
        return (-Math.abs((f10 % 180) - f11)) + f11;
    }

    private final float i(float f10) {
        return (f10 / 180) * 3.1415927f;
    }

    public final long c() {
        return this.f23399f;
    }

    public final C6533i d() {
        return this.f23400g;
    }

    public final float e() {
        return this.f23398e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f23394a == cVar.f23394a && this.f23395b == cVar.f23395b) {
                return true;
            }
        }
        return false;
    }

    public final C6533i f() {
        return this.f23401h;
    }

    public final void h(C6533i value) {
        AbstractC6492s.i(value, "value");
        if (AbstractC6492s.d(value, this.f23401h)) {
            return;
        }
        this.f23401h = value;
        a();
    }

    public int hashCode() {
        return (Float.hashCode(this.f23394a) * 31) + Float.hashCode(this.f23395b);
    }

    public final void j(C6533i c6533i) {
        if (AbstractC6492s.d(this.f23396c, c6533i)) {
            return;
        }
        this.f23396c = c6533i;
        a();
    }
}
