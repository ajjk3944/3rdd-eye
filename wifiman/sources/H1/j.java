package h1;

import g1.AbstractC5849g;
import g1.C5843a;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48395a;

        static {
            int[] iArr = new int[AbstractC5849g.a.values().length];
            f48395a = iArr;
            try {
                iArr[AbstractC5849g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48395a[AbstractC5849g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48395a[AbstractC5849g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(AbstractC5849g abstractC5849g) {
        super(abstractC5849g, AbstractC5849g.d.VERTICAL_CHAIN);
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        Iterator it = this.f47483o0.iterator();
        while (it.hasNext()) {
            this.f47481m0.d(it.next()).v();
        }
        Iterator it2 = this.f47483o0.iterator();
        C5843a c5843a = null;
        C5843a c5843a2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C5843a c5843aD = this.f47481m0.d(next);
            if (c5843a2 == null) {
                Object obj = this.f47404S;
                if (obj != null) {
                    c5843aD.m0(obj).J(this.f47438o).L(this.f47444u);
                } else {
                    Object obj2 = this.f47405T;
                    if (obj2 != null) {
                        c5843aD.l0(obj2).J(this.f47438o).L(this.f47444u);
                    } else {
                        String string = c5843aD.getKey().toString();
                        c5843aD.m0(AbstractC5849g.f47485k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                    }
                }
                c5843a2 = c5843aD;
            }
            if (c5843a != null) {
                String string2 = c5843a.getKey().toString();
                String string3 = c5843aD.getKey().toString();
                c5843a.q(c5843aD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                c5843aD.l0(c5843a.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(next.toString());
            if (fC0 != -1.0f) {
                c5843aD.d0(fC0);
            }
            c5843a = c5843aD;
        }
        if (c5843a != null) {
            Object obj3 = this.f47407V;
            if (obj3 != null) {
                c5843a.q(obj3).J(this.f47439p).L(this.f47445v);
            } else {
                Object obj4 = this.f47408W;
                if (obj4 != null) {
                    c5843a.p(obj4).J(this.f47439p).L(this.f47445v);
                } else {
                    String string4 = c5843a.getKey().toString();
                    c5843a.p(AbstractC5849g.f47485k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                }
            }
        }
        if (c5843a2 == null) {
            return;
        }
        float f10 = this.f48340q0;
        if (f10 != 0.5f) {
            c5843a2.q0(f10);
        }
        int i10 = a.f48395a[this.f48346w0.ordinal()];
        if (i10 == 1) {
            c5843a2.c0(0);
        } else if (i10 == 2) {
            c5843a2.c0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            c5843a2.c0(2);
        }
    }
}
