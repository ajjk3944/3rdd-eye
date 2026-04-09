package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xa0 extends mz0 implements hy {
    public Iterator j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cp0 n;
    public final /* synthetic */ eu0 o;
    public final /* synthetic */ MainActivity p;
    public final /* synthetic */ hy q;
    public final /* synthetic */ so1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(cp0 cp0Var, eu0 eu0Var, MainActivity mainActivity, hy hyVar, so1 so1Var, oj ojVar) {
        super(2, ojVar);
        this.n = cp0Var;
        this.o = eu0Var;
        this.p = mainActivity;
        this.q = hyVar;
        this.r = so1Var;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        return ((xa0) h((oj) obj2, (qk) obj)).m(z31.a);
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        xa0 xa0Var = new xa0(this.n, this.o, this.p, this.q, this.r, ojVar);
        xa0Var.m = obj;
        return xa0Var;
    }

    @Override // defpackage.s9
    public final Object m(Object obj) throws Throwable {
        Iterator it;
        int i;
        Object obj2;
        Object obj3;
        qk qkVar = (qk) this.m;
        int i2 = this.l;
        if (i2 == 0) {
            bd2.x(obj);
            Iterable iterable = (Iterable) this.n.f;
            ArrayList arrayList = new ArrayList(ag.k0(iterable));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(gi2.q(qkVar, fp.b, new wa0(this.o, this.p, this.q, ((Number) it2.next()).longValue(), this.r, null), 2));
            }
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.k;
            it = this.j;
            bd2.x(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            obj2 = z31.a;
            if (!zHasNext) {
                return obj2;
            }
            w30 w30Var = (w30) it.next();
            this.m = null;
            this.j = it;
            this.k = i;
            this.l = 1;
            g40 g40Var = (g40) w30Var;
            while (true) {
                Object objA = g40Var.A();
                boolean z = objA instanceof l20;
                obj3 = rk.f;
                if (!z) {
                    hk hkVar = this.g;
                    i30.j(hkVar);
                    wl2.g(hkVar);
                    break;
                }
                if (g40Var.N(objA) >= 0) {
                    kd kdVar = new kd(1, uk2.r(this));
                    kdVar.u();
                    kdVar.w(new kp(wl2.o(g40Var, false, new lp(3, kdVar), 3)));
                    Object objT = kdVar.t();
                    Object obj4 = objT;
                    if (objT != obj3) {
                        obj4 = obj2;
                    }
                    if (obj4 == obj3) {
                        obj2 = obj4;
                    }
                }
            }
        } while (obj2 != obj3);
        return obj3;
    }
}
