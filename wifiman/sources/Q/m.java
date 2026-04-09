package Q;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f18840a;

    /* renamed from: b, reason: collision with root package name */
    private final P.g f18841b;

    public /* synthetic */ m(long j10, P.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, gVar);
    }

    public final long a() {
        return this.f18840a;
    }

    public final P.g b() {
        return this.f18841b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C6733v0.m(this.f18840a, mVar.f18840a) && AbstractC6492s.d(this.f18841b, mVar.f18841b);
    }

    public int hashCode() {
        int iS = C6733v0.s(this.f18840a) * 31;
        P.g gVar = this.f18841b;
        return iS + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) C6733v0.t(this.f18840a)) + ", rippleAlpha=" + this.f18841b + ')';
    }

    private m(long j10, P.g gVar) {
        this.f18840a = j10;
        this.f18841b = gVar;
    }

    public /* synthetic */ m(long j10, P.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i10 & 2) != 0 ? null : gVar, null);
    }
}
