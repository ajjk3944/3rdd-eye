package N;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* renamed from: N.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3356y0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f14864a;

    /* renamed from: b, reason: collision with root package name */
    private final P.g f14865b;

    public /* synthetic */ C3356y0(long j10, P.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, gVar);
    }

    public final long a() {
        return this.f14864a;
    }

    public final P.g b() {
        return this.f14865b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3356y0)) {
            return false;
        }
        C3356y0 c3356y0 = (C3356y0) obj;
        return C6733v0.m(this.f14864a, c3356y0.f14864a) && AbstractC6492s.d(this.f14865b, c3356y0.f14865b);
    }

    public int hashCode() {
        int iS = C6733v0.s(this.f14864a) * 31;
        P.g gVar = this.f14865b;
        return iS + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) C6733v0.t(this.f14864a)) + ", rippleAlpha=" + this.f14865b + ')';
    }

    private C3356y0(long j10, P.g gVar) {
        this.f14864a = j10;
        this.f14865b = gVar;
    }

    public /* synthetic */ C3356y0(long j10, P.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i10 & 2) != 0 ? null : gVar, null);
    }
}
