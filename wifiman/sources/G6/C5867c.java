package g6;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5867c implements InterfaceC5866b {

    /* renamed from: a, reason: collision with root package name */
    private float f47719a;

    /* renamed from: b, reason: collision with root package name */
    private float f47720b;

    /* renamed from: c, reason: collision with root package name */
    private float f47721c;

    /* renamed from: d, reason: collision with root package name */
    private float f47722d;

    public C5867c(float f10, float f11, float f12, float f13) {
        this.f47719a = f10;
        this.f47720b = f11;
        this.f47721c = f12;
        this.f47722d = f13;
    }

    public static /* synthetic */ C5867c l(C5867c c5867c, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return c5867c.k(f10, f11, f12, f13);
    }

    @Override // g6.InterfaceC5866b
    public void a(float f10, float f11) {
        this.f47719a = f10;
        this.f47721c = f11;
    }

    public final void b() {
        j(0.0f);
    }

    public final float c() {
        return this.f47722d;
    }

    public final float d() {
        return this.f47721c;
    }

    public final float e(boolean z10) {
        return z10 ? this.f47719a : this.f47721c;
    }

    public final float f(boolean z10) {
        return z10 ? this.f47721c : this.f47719a;
    }

    public final float g() {
        return this.f47719a;
    }

    public final float h() {
        return this.f47720b;
    }

    public final float i() {
        return this.f47720b + this.f47722d;
    }

    public final C5867c j(float f10) {
        return k(f10, f10, f10, f10);
    }

    public final C5867c k(float f10, float f11, float f12, float f13) {
        this.f47719a = f10;
        this.f47720b = f11;
        this.f47721c = f12;
        this.f47722d = f13;
        return this;
    }

    public final void m(float f10) {
        this.f47722d = f10;
    }

    public final C5867c n(float f10) {
        float f11 = f10 / 2;
        this.f47719a = f11;
        this.f47721c = f11;
        return this;
    }

    public final void o(float f10) {
        this.f47720b = f10;
    }

    public final void p(C5867c other) {
        AbstractC6492s.i(other, "other");
        this.f47719a = Math.max(this.f47719a, other.f47719a);
        this.f47720b = Math.max(this.f47720b, other.f47720b);
        this.f47721c = Math.max(this.f47721c, other.f47721c);
        this.f47722d = Math.max(this.f47722d, other.f47722d);
    }

    public final C5867c q(float f10) {
        float f11 = f10 / 2;
        this.f47720b = f11;
        this.f47722d = f11;
        return this;
    }

    public /* synthetic */ C5867c(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }
}
