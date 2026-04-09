package w9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z.N;

/* renamed from: w9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8285b {

    /* renamed from: a, reason: collision with root package name */
    private final float f64655a;

    /* renamed from: b, reason: collision with root package name */
    private final float f64656b;

    /* renamed from: c, reason: collision with root package name */
    private final float f64657c;

    /* renamed from: d, reason: collision with root package name */
    private final float f64658d;

    /* renamed from: e, reason: collision with root package name */
    private final N f64659e;

    /* renamed from: f, reason: collision with root package name */
    private final N f64660f;

    /* renamed from: g, reason: collision with root package name */
    private final float f64661g;

    public /* synthetic */ C8285b(float f10, float f11, float f12, float f13, N n10, N n11, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, n10, n11, f14);
    }

    public final N a() {
        return this.f64659e;
    }

    public final N b() {
        return this.f64660f;
    }

    public final float c() {
        return this.f64661g;
    }

    public final float d() {
        return this.f64657c;
    }

    public final float e() {
        return this.f64655a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8285b)) {
            return false;
        }
        C8285b c8285b = (C8285b) obj;
        return Y0.h.n(this.f64655a, c8285b.f64655a) && Y0.h.n(this.f64656b, c8285b.f64656b) && Y0.h.n(this.f64657c, c8285b.f64657c) && Y0.h.n(this.f64658d, c8285b.f64658d) && AbstractC6492s.d(this.f64659e, c8285b.f64659e) && AbstractC6492s.d(this.f64660f, c8285b.f64660f) && Y0.h.n(this.f64661g, c8285b.f64661g);
    }

    public final float f() {
        return this.f64658d;
    }

    public final float g() {
        return this.f64656b;
    }

    public int hashCode() {
        return (((((((((((Y0.h.p(this.f64655a) * 31) + Y0.h.p(this.f64656b)) * 31) + Y0.h.p(this.f64657c)) * 31) + Y0.h.p(this.f64658d)) * 31) + this.f64659e.hashCode()) * 31) + this.f64660f.hashCode()) * 31) + Y0.h.p(this.f64661g);
    }

    public String toString() {
        return "Dimens(heightMin=" + Y0.h.r(this.f64655a) + ", widthMin=" + Y0.h.r(this.f64656b) + ", cornerRadius=" + Y0.h.r(this.f64657c) + ", iconSize=" + Y0.h.r(this.f64658d) + ", contentPadding=" + this.f64659e + ", contentPaddingIconOnly=" + this.f64660f + ", contentSpacing=" + Y0.h.r(this.f64661g) + ")";
    }

    private C8285b(float f10, float f11, float f12, float f13, N contentPadding, N contentPaddingIconOnly, float f14) {
        AbstractC6492s.i(contentPadding, "contentPadding");
        AbstractC6492s.i(contentPaddingIconOnly, "contentPaddingIconOnly");
        this.f64655a = f10;
        this.f64656b = f11;
        this.f64657c = f12;
        this.f64658d = f13;
        this.f64659e = contentPadding;
        this.f64660f = contentPaddingIconOnly;
        this.f64661g = f14;
    }
}
