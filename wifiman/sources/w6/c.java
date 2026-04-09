package w6;

import kotlin.jvm.internal.AbstractC6492s;
import w6.b;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private float f64470a;

    /* renamed from: b, reason: collision with root package name */
    private float f64471b;

    /* renamed from: c, reason: collision with root package name */
    private float f64472c;

    /* renamed from: d, reason: collision with root package name */
    private float f64473d;

    public c(float f10, float f11, float f12, float f13) {
        this.f64470a = f10;
        this.f64471b = f11;
        this.f64472c = f12;
        this.f64473d = f13;
    }

    @Override // w6.b
    public float a() {
        return this.f64473d;
    }

    @Override // w6.b
    public float b() {
        return this.f64472c;
    }

    @Override // w6.b
    public float c() {
        return this.f64471b;
    }

    @Override // w6.b
    public float d() {
        return this.f64470a;
    }

    public final float e() {
        return d() + b();
    }

    public float f(boolean z10) {
        return b.a.a(this, z10);
    }

    public float g(boolean z10) {
        return b.a.b(this, z10);
    }

    public final float h() {
        return c() + a();
    }

    public final c i(float f10, float f11, float f12, float f13) {
        m(f10);
        n(f11);
        l(f12);
        k(f13);
        return this;
    }

    public final c j(b other) {
        AbstractC6492s.i(other, "other");
        return i(other.d(), other.c(), other.b(), other.a());
    }

    public void k(float f10) {
        this.f64473d = f10;
    }

    public void l(float f10) {
        this.f64472c = f10;
    }

    public void m(float f10) {
        this.f64470a = f10;
    }

    public void n(float f10) {
        this.f64471b = f10;
    }
}
