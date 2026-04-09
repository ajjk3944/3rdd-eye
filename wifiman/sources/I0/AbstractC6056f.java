package i0;

import C0.AbstractC2538s;
import C0.r;
import E0.A0;
import E0.AbstractC2633k;
import E0.B0;
import E0.z0;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6056f {

    /* renamed from: i0.f$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f48773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6057g f48774b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC6057g interfaceC6057g) {
            super(1);
            this.f48773a = interfaceC6835l;
            this.f48774b = interfaceC6057g;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6057g invoke(C6052b c6052b) {
            if (((Boolean) this.f48773a.invoke(c6052b)).booleanValue()) {
                return this.f48774b;
            }
            return null;
        }
    }

    public static final InterfaceC6054d a(InterfaceC6835l interfaceC6835l, InterfaceC6057g interfaceC6057g) {
        return new C6055e(new a(interfaceC6835l, interfaceC6057g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC6054d interfaceC6054d, long j10) {
        if (!interfaceC6054d.h1().k2()) {
            return false;
        }
        r rVarC = AbstractC2633k.m(interfaceC6054d).c();
        if (!rVarC.M()) {
            return false;
        }
        long jH = rVarC.h();
        int iG = Y0.r.g(jH);
        int iF = Y0.r.f(jH);
        long jE = AbstractC2538s.e(rVarC);
        float fM = C6531g.m(jE);
        float fN = C6531g.n(jE);
        float f10 = iG + fM;
        float f11 = iF + fN;
        float fM2 = C6531g.m(j10);
        if (fM > fM2 || fM2 > f10) {
            return false;
        }
        float fN2 = C6531g.n(j10);
        return fN <= fN2 && fN2 <= f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC6057g interfaceC6057g, C6052b c6052b) {
        interfaceC6057g.T(c6052b);
        interfaceC6057g.G0(c6052b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(A0 a02, InterfaceC6835l interfaceC6835l) {
        if (interfaceC6835l.invoke(a02) != z0.ContinueTraversal) {
            return;
        }
        B0.f(a02, interfaceC6835l);
    }
}
