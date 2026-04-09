package x;

import C.A;
import C.C;
import C.n;
import C.o;
import Y0.t;
import Yg.s;
import Yg.z;
import java.util.List;
import l0.C6531g;
import mh.q;
import sh.AbstractC7978m;
import x.AbstractC8403d;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8405f {

    /* renamed from: x.f$a */
    public static final class a implements InterfaceC8408i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f65248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f65249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A f65250c;

        a(C c10, q qVar, A a10) {
            this.f65248a = c10;
            this.f65249b = qVar;
            this.f65250c = a10;
        }

        private final s e(InterfaceC8409j interfaceC8409j) {
            float f10;
            List listH = c().h();
            C c10 = this.f65248a;
            int size = listH.size();
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                f10 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                C.f fVar = (C.f) listH.get(i10);
                float fA = AbstractC8410k.a(o.a(c()), c().f(), c().c(), c().i(), fVar.b(), fVar.getIndex(), interfaceC8409j, c10.F());
                if (fA <= 0.0f && fA > f11) {
                    f11 = fA;
                }
                if (fA >= 0.0f && fA < f12) {
                    f12 = fA;
                }
                i10++;
            }
            if (f11 == Float.NEGATIVE_INFINITY) {
                f11 = f12;
            }
            if (f12 == Float.POSITIVE_INFINITY) {
                f12 = f11;
            }
            boolean z10 = AbstractC8405f.e(this.f65248a) == 0.0f;
            if (!this.f65248a.e()) {
                if (z10 || !AbstractC8405f.g(this.f65248a)) {
                    f12 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
            }
            if (this.f65248a.d()) {
                f10 = f11;
            } else if (!z10 && !AbstractC8405f.g(this.f65248a)) {
                f12 = 0.0f;
            }
            return z.a(Float.valueOf(f10), Float.valueOf(f12));
        }

        @Override // x.InterfaceC8408i
        public float a(float f10, float f11) {
            int iG = this.f65248a.G() + this.f65248a.I();
            if (iG == 0) {
                return 0.0f;
            }
            int iY = f10 < 0.0f ? this.f65248a.y() + 1 : this.f65248a.y();
            int iD = AbstractC7978m.d(Math.abs((AbstractC7978m.k(this.f65250c.a(iY, AbstractC7978m.k(((int) (f11 / iG)) + iY, 0, this.f65248a.F()), f10, this.f65248a.G(), this.f65248a.I()), 0, this.f65248a.F()) - iY) * iG) - iG, 0);
            if (iD == 0) {
                return iD;
            }
            return Math.signum(f10) * iD;
        }

        @Override // x.InterfaceC8408i
        public float b(float f10) {
            s sVarE = e(this.f65248a.C().l());
            float fFloatValue = ((Number) sVarE.a()).floatValue();
            float fFloatValue2 = ((Number) sVarE.c()).floatValue();
            float fFloatValue3 = ((Number) this.f65249b.s(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
            if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f) {
                if (d(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
        }

        public final n c() {
            return this.f65248a.C();
        }

        public final boolean d(float f10) {
            return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    public static final InterfaceC8408i a(C c10, A a10, q qVar) {
        return new a(c10, qVar, a10);
    }

    public static final float d(C c10, t tVar, float f10, float f11, float f12, float f13) {
        boolean zG = (c10.C().e() == w.q.Vertical || tVar == t.Ltr) ? g(c10) : !g(c10);
        int i10 = c10.C().i();
        float fE = i10 == 0 ? 0.0f : e(c10) / i10;
        float f14 = fE - ((int) fE);
        int iA = AbstractC8404e.a(c10.x(), f11);
        AbstractC8403d.a aVar = AbstractC8403d.f65244a;
        if (AbstractC8403d.e(iA, aVar.a())) {
            if (Math.abs(f14) > f10) {
                if (!zG) {
                    return f12;
                }
            } else if (Math.abs(fE) >= Math.abs(c10.L())) {
                if (zG) {
                    return f12;
                }
            } else if (Math.abs(f12) < Math.abs(f13)) {
                return f12;
            }
        } else if (!AbstractC8403d.e(iA, aVar.b())) {
            if (AbstractC8403d.e(iA, aVar.c())) {
                return f12;
            }
            return 0.0f;
        }
        return f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(C c10) {
        return c10.C().e() == w.q.Horizontal ? C6531g.m(c10.R()) : C6531g.n(c10.R());
    }

    private static final boolean f(C c10) {
        return e(c10) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C c10) {
        boolean zA = c10.C().a();
        return (f(c10) && zA) || !(f(c10) || zA);
    }
}
