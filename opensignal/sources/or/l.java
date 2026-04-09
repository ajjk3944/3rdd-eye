package or;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rr.i0;
import ur.a0;
import ur.x;

/* loaded from: classes.dex */
public final class l extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19679d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f19680g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a0 a0Var, int i10) {
        super(0);
        this.f19679d = i10;
        this.f19680g = a0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f19679d) {
            case 0:
                return ((x) this.f19680g.J0(o.f19720h)).D;
            case 1:
                return new qr.j(this.f19680g);
            default:
                a0 a0Var = this.f19680g;
                gb.k kVar = a0Var.D;
                if (kVar == null) {
                    StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                    String str = a0Var.getName().f21035a;
                    br.l.d(str, "name.toString()");
                    sb2.append(str);
                    sb2.append(" were not set before querying module content");
                    throw new AssertionError(sb2.toString());
                }
                List list = kVar.f9478d;
                a0Var.u1();
                list.contains(a0Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    i0 i0Var = ((a0) it2.next()).E;
                    br.l.b(i0Var);
                    arrayList.add(i0Var);
                }
                return new ur.m(arrayList, "CompositeProvider@ModuleDescriptor for " + a0Var.getName());
        }
    }
}
