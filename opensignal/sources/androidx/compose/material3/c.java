package androidx.compose.material3;

import g1.r;
import k0.o;
import t2.f;
import w.g;
import x1.i;
import y.q;

/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1115a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1116b;

    public c(long j, boolean z10) {
        this.f1115a = z10;
        this.f1116b = j;
    }

    @Override // y.q
    public final i a(a0.i iVar) {
        return new DelegatingThemeAwareRippleNode(iVar, this.f1115a, new o(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1115a == cVar.f1115a && f.a(Float.NaN, Float.NaN)) {
            return r.c(this.f1116b, cVar.f1116b);
        }
        return false;
    }

    @Override // y.q
    public final int hashCode() {
        int iA = g.a(Boolean.hashCode(this.f1115a) * 31, Float.NaN, 961);
        int i10 = r.f9270h;
        return Long.hashCode(this.f1116b) + iA;
    }
}
