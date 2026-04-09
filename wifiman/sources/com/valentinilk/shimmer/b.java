package com.valentinilk.shimmer;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import com.valentinilk.shimmer.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;

/* loaded from: classes4.dex */
public abstract class b {
    public static final C6533i a(a shimmerBounds, InterfaceC3540l interfaceC3540l, int i10) {
        C6533i c6533iA;
        AbstractC6492s.i(shimmerBounds, "shimmerBounds");
        interfaceC3540l.U(1234290070);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1234290070, i10, -1, "com.valentinilk.shimmer.rememberShimmerBounds (ShimmerBounds.kt:8)");
        }
        if (AbstractC6492s.d(shimmerBounds, a.C1686a.f45577a)) {
            c6533iA = C6533i.f52340e.a();
        } else if (AbstractC6492s.d(shimmerBounds, a.b.f45578a)) {
            c6533iA = null;
        } else {
            if (!AbstractC6492s.d(shimmerBounds, a.c.f45580a)) {
                throw new NoWhenBranchMatchedException();
            }
            c6533iA = Vf.a.a(interfaceC3540l, 0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c6533iA;
    }
}
