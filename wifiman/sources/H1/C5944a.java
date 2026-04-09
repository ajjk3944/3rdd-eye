package h1;

import g1.AbstractC5849g;
import g1.C5843a;
import g1.C5847e;
import java.util.Iterator;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5944a extends C5847e {

    /* renamed from: q0, reason: collision with root package name */
    private float f48334q0;

    public C5944a(AbstractC5849g abstractC5849g) {
        super(abstractC5849g, AbstractC5849g.d.ALIGN_VERTICALLY);
        this.f48334q0 = 0.5f;
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        Iterator it = this.f47483o0.iterator();
        while (it.hasNext()) {
            C5843a c5843aD = this.f47481m0.d(it.next());
            c5843aD.u();
            Object obj = this.f47400O;
            if (obj != null) {
                c5843aD.i0(obj);
            } else {
                Object obj2 = this.f47401P;
                if (obj2 != null) {
                    c5843aD.h0(obj2);
                } else {
                    c5843aD.i0(AbstractC5849g.f47485k);
                }
            }
            Object obj3 = this.f47402Q;
            if (obj3 != null) {
                c5843aD.A(obj3);
            } else {
                Object obj4 = this.f47403R;
                if (obj4 != null) {
                    c5843aD.z(obj4);
                } else {
                    c5843aD.z(AbstractC5849g.f47485k);
                }
            }
            float f10 = this.f48334q0;
            if (f10 != 0.5f) {
                c5843aD.F(f10);
            }
        }
    }
}
