package M;

import C0.AbstractC2538s;
import l0.AbstractC6534j;
import l0.C6531g;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    private static final C6533i f12068a = new C6533i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(C6533i c6533i, long j10) {
        float fK = c6533i.k();
        float fL = c6533i.l();
        float fM = C6531g.m(j10);
        if (fK <= fM && fM <= fL) {
            float fN = c6533i.n();
            float fE = c6533i.e();
            float fN2 = C6531g.n(j10);
            if (fN <= fN2 && fN2 <= fE) {
                return true;
            }
        }
        return false;
    }

    public static final C6533i b(C0.r rVar) {
        C6533i c6533iC = AbstractC2538s.c(rVar);
        return AbstractC6534j.a(rVar.W(c6533iC.p()), rVar.W(c6533iC.h()));
    }
}
