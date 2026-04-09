package h1;

import g1.AbstractC5849g;
import g1.C5843a;
import g1.C5847e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends C5847e {

    /* renamed from: q0, reason: collision with root package name */
    private float f48335q0;

    public b(AbstractC5849g abstractC5849g) {
        super(abstractC5849g, AbstractC5849g.d.ALIGN_VERTICALLY);
        this.f48335q0 = 0.5f;
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        Iterator it = this.f47483o0.iterator();
        while (it.hasNext()) {
            C5843a c5843aD = this.f47481m0.d(it.next());
            c5843aD.v();
            Object obj = this.f47404S;
            if (obj != null) {
                c5843aD.m0(obj);
            } else {
                Object obj2 = this.f47405T;
                if (obj2 != null) {
                    c5843aD.l0(obj2);
                } else {
                    c5843aD.m0(AbstractC5849g.f47485k);
                }
            }
            Object obj3 = this.f47407V;
            if (obj3 != null) {
                c5843aD.q(obj3);
            } else {
                Object obj4 = this.f47408W;
                if (obj4 != null) {
                    c5843aD.p(obj4);
                } else {
                    c5843aD.p(AbstractC5849g.f47485k);
                }
            }
            float f10 = this.f48335q0;
            if (f10 != 0.5f) {
                c5843aD.q0(f10);
            }
        }
    }
}
