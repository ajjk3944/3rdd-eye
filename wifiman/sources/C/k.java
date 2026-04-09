package C;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import androidx.compose.ui.platform.AbstractC3932k0;
import kotlin.jvm.internal.AbstractC6494u;
import q.AbstractC7407z;
import r.AbstractC7535j;
import r.I0;
import r.InterfaceC7533i;
import r.InterfaceC7550z;
import w.InterfaceC8236C;
import x.AbstractC8405f;
import x.AbstractC8407h;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2000a = new k();

    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f2001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0.t f2002b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, Y0.t tVar, float f10) {
            super(3);
            this.f2001a = c10;
            this.f2002b = tVar;
            this.f2003c = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(AbstractC8405f.d(this.f2001a, this.f2002b, this.f2003c, f10, f11, f12));
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    }

    private k() {
    }

    public final InterfaceC8236C a(C c10, A a10, InterfaceC7550z interfaceC7550z, InterfaceC7533i interfaceC7533i, float f10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            a10 = A.f1845a.a(1);
        }
        if ((i11 & 4) != 0) {
            interfaceC7550z = AbstractC7407z.b(interfaceC3540l, 0);
        }
        if ((i11 & 8) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 400.0f, Float.valueOf(I0.b(kotlin.jvm.internal.r.f51727a)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10).toString());
        }
        Object obj = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        Y0.t tVar = (Y0.t) interfaceC3540l.t(AbstractC3932k0.m());
        boolean zT = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(c10)) || (i10 & 6) == 4) | interfaceC3540l.T(interfaceC7550z) | interfaceC3540l.T(interfaceC7533i);
        if ((((i10 & 112) ^ 48) <= 32 || !interfaceC3540l.T(a10)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zT2 = zT | z10 | interfaceC3540l.T(obj) | interfaceC3540l.T(tVar);
        Object objF = interfaceC3540l.f();
        if (zT2 || objF == InterfaceC3540l.f21100a.a()) {
            objF = AbstractC8407h.l(AbstractC8405f.a(c10, a10, new a(c10, tVar, f10)), interfaceC7550z, interfaceC7533i);
            interfaceC3540l.K(objF);
        }
        InterfaceC8236C interfaceC8236C = (InterfaceC8236C) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC8236C;
    }

    public final InterfaceC8412a b(C c10, w.q qVar, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(c10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(qVar)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C2516a(c10, qVar);
            interfaceC3540l.K(objF);
        }
        C2516a c2516a = (C2516a) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c2516a;
    }
}
