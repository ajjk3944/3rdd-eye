package z;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8693p implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final float f66937b;

    /* renamed from: c, reason: collision with root package name */
    private final float f66938c;

    /* renamed from: d, reason: collision with root package name */
    private final float f66939d;

    /* renamed from: e, reason: collision with root package name */
    private final float f66940e;

    public /* synthetic */ C8693p(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return dVar.x1(this.f66939d);
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return dVar.x1(this.f66940e);
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return dVar.x1(this.f66938c);
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return dVar.x1(this.f66937b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8693p)) {
            return false;
        }
        C8693p c8693p = (C8693p) obj;
        return Y0.h.n(this.f66937b, c8693p.f66937b) && Y0.h.n(this.f66938c, c8693p.f66938c) && Y0.h.n(this.f66939d, c8693p.f66939d) && Y0.h.n(this.f66940e, c8693p.f66940e);
    }

    public int hashCode() {
        return (((((Y0.h.p(this.f66937b) * 31) + Y0.h.p(this.f66938c)) * 31) + Y0.h.p(this.f66939d)) * 31) + Y0.h.p(this.f66940e);
    }

    public String toString() {
        return "Insets(left=" + ((Object) Y0.h.r(this.f66937b)) + ", top=" + ((Object) Y0.h.r(this.f66938c)) + ", right=" + ((Object) Y0.h.r(this.f66939d)) + ", bottom=" + ((Object) Y0.h.r(this.f66940e)) + ')';
    }

    private C8693p(float f10, float f11, float f12, float f13) {
        this.f66937b = f10;
        this.f66938c = f11;
        this.f66939d = f12;
        this.f66940e = f13;
    }
}
