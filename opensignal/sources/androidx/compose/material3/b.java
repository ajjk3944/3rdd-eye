package androidx.compose.material3;

import g1.r;
import g1.s;
import k0.d;
import k0.l;
import k0.n;
import x1.k;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f1114a;

    public b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f1114a = delegatingThemeAwareRippleNode;
    }

    @Override // g1.s
    public final long a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f1114a;
        long jA = delegatingThemeAwareRippleNode.color.a();
        if (jA != 16) {
            return jA;
        }
        l lVar = (l) k.h(delegatingThemeAwareRippleNode, n.f13916a);
        if (lVar != null) {
            long j = lVar.f13914a;
            if (j != 16) {
                return j;
            }
        }
        return ((r) k.h(delegatingThemeAwareRippleNode, d.f13893a)).f9271a;
    }
}
