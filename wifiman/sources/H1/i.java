package h1;

import g1.AbstractC5849g;
import g1.C5843a;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48394a;

        static {
            int[] iArr = new int[AbstractC5849g.a.values().length];
            f48394a = iArr;
            try {
                iArr[AbstractC5849g.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48394a[AbstractC5849g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48394a[AbstractC5849g.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(AbstractC5849g abstractC5849g) {
        super(abstractC5849g, AbstractC5849g.d.HORIZONTAL_CHAIN);
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        Iterator it = this.f47483o0.iterator();
        while (it.hasNext()) {
            this.f47481m0.d(it.next()).u();
        }
        Iterator it2 = this.f47483o0.iterator();
        C5843a c5843a = null;
        C5843a c5843a2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C5843a c5843aD = this.f47481m0.d(next);
            if (c5843a2 == null) {
                Object obj = this.f47400O;
                if (obj != null) {
                    c5843aD.i0(obj).J(this.f47436m).L(this.f47442s);
                } else {
                    Object obj2 = this.f47401P;
                    if (obj2 != null) {
                        c5843aD.h0(obj2).J(this.f47436m).L(this.f47442s);
                    } else {
                        Object obj3 = this.f47396K;
                        if (obj3 != null) {
                            c5843aD.i0(obj3).J(this.f47432k).L(this.f47440q);
                        } else {
                            Object obj4 = this.f47397L;
                            if (obj4 != null) {
                                c5843aD.h0(obj4).J(this.f47432k).L(this.f47440q);
                            } else {
                                String string = c5843aD.getKey().toString();
                                c5843aD.i0(AbstractC5849g.f47485k).K(Float.valueOf(B0(string))).M(Float.valueOf(A0(string)));
                            }
                        }
                    }
                }
                c5843a2 = c5843aD;
            }
            if (c5843a != null) {
                String string2 = c5843a.getKey().toString();
                String string3 = c5843aD.getKey().toString();
                c5843a.A(c5843aD.getKey()).K(Float.valueOf(z0(string2))).M(Float.valueOf(y0(string2)));
                c5843aD.h0(c5843a.getKey()).K(Float.valueOf(B0(string3))).M(Float.valueOf(A0(string3)));
            }
            float fC0 = C0(next.toString());
            if (fC0 != -1.0f) {
                c5843aD.a0(fC0);
            }
            c5843a = c5843aD;
        }
        if (c5843a != null) {
            Object obj5 = this.f47402Q;
            if (obj5 != null) {
                c5843a.A(obj5).J(this.f47437n).L(this.f47443t);
            } else {
                Object obj6 = this.f47403R;
                if (obj6 != null) {
                    c5843a.z(obj6).J(this.f47437n).L(this.f47443t);
                } else {
                    Object obj7 = this.f47398M;
                    if (obj7 != null) {
                        c5843a.A(obj7).J(this.f47434l).L(this.f47441r);
                    } else {
                        Object obj8 = this.f47399N;
                        if (obj8 != null) {
                            c5843a.z(obj8).J(this.f47434l).L(this.f47441r);
                        } else {
                            String string4 = c5843a.getKey().toString();
                            c5843a.z(AbstractC5849g.f47485k).K(Float.valueOf(z0(string4))).M(Float.valueOf(y0(string4)));
                        }
                    }
                }
            }
        }
        if (c5843a2 == null) {
            return;
        }
        float f10 = this.f48340q0;
        if (f10 != 0.5f) {
            c5843a2.F(f10);
        }
        int i10 = a.f48394a[this.f48346w0.ordinal()];
        if (i10 == 1) {
            c5843a2.Z(0);
        } else if (i10 == 2) {
            c5843a2.Z(1);
        } else {
            if (i10 != 3) {
                return;
            }
            c5843a2.Z(2);
        }
    }
}
