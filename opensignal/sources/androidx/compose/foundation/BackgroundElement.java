package androidx.compose.foundation;

import g1.i0;
import g1.r;
import kotlin.Metadata;
import x1.k;
import x1.z0;
import y.g;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lx1/z0;", "Ly/g;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1061a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1062b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1063c;

    public BackgroundElement(long j, i0 i0Var) {
        this.f1061a = j;
        this.f1063c = i0Var;
    }

    @Override // x1.z0
    public final l d() {
        g gVar = new g();
        gVar.f25575p = this.f1061a;
        gVar.f25576q = this.f1063c;
        gVar.f25577r = 9205357640488583168L;
        return gVar;
    }

    @Override // x1.z0
    public final void e(l lVar) {
        g gVar = (g) lVar;
        gVar.f25575p = this.f1061a;
        gVar.f25576q = this.f1063c;
        k.j(gVar);
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && r.c(this.f1061a, backgroundElement.f1061a) && this.f1062b == backgroundElement.f1062b && br.l.a(this.f1063c, backgroundElement.f1063c);
    }

    public final int hashCode() {
        int i10 = r.f9270h;
        return this.f1063c.hashCode() + w.g.a(Long.hashCode(this.f1061a) * 961, this.f1062b, 31);
    }
}
