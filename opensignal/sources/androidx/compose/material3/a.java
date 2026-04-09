package androidx.compose.material3;

import a0.i;
import j0.f;
import k0.l;
import k0.m;
import k0.n;
import lq.b0;
import w.e0;
import x1.k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1112a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f1113d;

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i10) {
        this.f1112a = i10;
        this.f1113d = delegatingThemeAwareRippleNode;
    }

    @Override // ar.a
    public final Object c() {
        int i10 = this.f1112a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f1113d;
        switch (i10) {
            case 0:
                if (((l) k.h(delegatingThemeAwareRippleNode, n.f13916a)) == null) {
                    j0.a aVar = delegatingThemeAwareRippleNode.f1111u;
                    if (aVar != null) {
                        delegatingThemeAwareRippleNode.d0(aVar);
                    }
                    delegatingThemeAwareRippleNode.f1111u = null;
                } else if (delegatingThemeAwareRippleNode.f1111u == null) {
                    b bVar = new b(delegatingThemeAwareRippleNode);
                    a aVar2 = new a(delegatingThemeAwareRippleNode, 1);
                    i iVar = delegatingThemeAwareRippleNode.f1108r;
                    boolean z10 = delegatingThemeAwareRippleNode.f1109s;
                    float f10 = delegatingThemeAwareRippleNode.f1110t;
                    e0 e0Var = f.f13035a;
                    j0.a aVar3 = new j0.a(iVar, z10, f10, bVar, aVar2);
                    delegatingThemeAwareRippleNode.c0(aVar3);
                    delegatingThemeAwareRippleNode.f1111u = aVar3;
                }
                return b0.f15562a;
            default:
                return m.f13915a;
        }
    }
}
