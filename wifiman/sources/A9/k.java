package A9;

import A9.i;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import q.AbstractC7385d;
import q.InterfaceC7386e;

/* loaded from: classes3.dex */
public abstract class k implements i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f575a;

        a(InterfaceC6839p interfaceC6839p) {
            this.f575a = interfaceC6839p;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1027677936, i10, -1, "com.ui.core.ui.component.layout.UiColumnWithDividersScopeImpl.AnimatedVisibility.<anonymous>.<anonymous> (UiColumnWithDividersScopeImpl.kt:32)");
            }
            this.f575a.invoke(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(k kVar, androidx.compose.ui.e eVar, boolean z10, InterfaceC6839p interfaceC6839p, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        kVar.a(eVar, z10, interfaceC6839p, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    @Override // A9.i
    public void a(final androidx.compose.ui.e modifier, final boolean z10, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1887791090);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(content) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1887791090, i11, -1, "com.ui.core.ui.component.layout.UiColumnWithDividersScopeImpl.AnimatedVisibility (UiColumnWithDividersScopeImpl.kt:21)");
            }
            androidx.compose.ui.e eVarD = d(modifier, z10);
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC7385d.f(z10, modifier, androidx.compose.animation.g.m(null, null, false, null, 15, null).c(androidx.compose.animation.g.o(null, 0.0f, 3, null)), androidx.compose.animation.g.y(null, null, false, null, 15, null).c(androidx.compose.animation.g.q(null, 0.0f, 3, null)), null, b0.c.e(1027677936, true, new a(content), interfaceC3540lR, 54), interfaceC3540lR, ((i11 >> 3) & 14) | 200064 | ((i11 << 3) & 112), 16);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: A9.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return k.c(this.f570a, modifier, z10, content, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10) {
        return i.a.a(this, eVar, z10);
    }
}
