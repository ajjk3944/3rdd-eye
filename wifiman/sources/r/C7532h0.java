package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7532h0 implements H {

    /* renamed from: a, reason: collision with root package name */
    private final float f59714a;

    /* renamed from: b, reason: collision with root package name */
    private final float f59715b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f59716c;

    public C7532h0(float f10, float f11, Object obj) {
        this.f59714a = f10;
        this.f59715b = f11;
        this.f59716c = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7532h0)) {
            return false;
        }
        C7532h0 c7532h0 = (C7532h0) obj;
        return c7532h0.f59714a == this.f59714a && c7532h0.f59715b == this.f59715b && AbstractC6492s.d(c7532h0.f59716c, this.f59716c);
    }

    public final float f() {
        return this.f59714a;
    }

    public final float g() {
        return this.f59715b;
    }

    public final Object h() {
        return this.f59716c;
    }

    public int hashCode() {
        Object obj = this.f59716c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f59714a)) * 31) + Float.hashCode(this.f59715b);
    }

    @Override // r.H, r.InterfaceC7533i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public G0 a(s0 s0Var) {
        return new G0(this.f59714a, this.f59715b, AbstractC7535j.b(s0Var, this.f59716c));
    }

    public /* synthetic */ C7532h0(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
