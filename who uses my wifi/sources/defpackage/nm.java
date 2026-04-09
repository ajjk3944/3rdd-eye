package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nm extends mz0 implements hy {
    public final /* synthetic */ int j = 1;
    public int k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(ga0 ga0Var, MainActivity mainActivity, ya0 ya0Var, ha0 ha0Var, m mVar, oj ojVar) {
        super(2, ojVar);
        this.l = ga0Var;
        this.m = mainActivity;
        this.n = ya0Var;
        this.o = ha0Var;
        this.p = mVar;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((nm) h((oj) obj2, obj)).m(z31.a);
            default:
                return ((nm) h((oj) obj2, (qk) obj)).m(z31.a);
        }
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        switch (this.j) {
            case 0:
                nm nmVar = new nm((List) this.o, (ArrayList) this.p, ojVar);
                nmVar.n = obj;
                return nmVar;
            default:
                return new nm((ga0) this.l, (MainActivity) this.m, (ya0) this.n, (ha0) this.o, (m) this.p, ojVar);
        }
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        List list;
        Iterator it;
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        oj ojVar = null;
        int i2 = 2;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 == 0) {
                    bd2.x(obj);
                    obj = this.n;
                    list = (ArrayList) obj2;
                    it = ((List) obj3).iterator();
                } else if (i3 == 1) {
                    Object obj4 = this.m;
                    Iterator it2 = (Iterator) this.l;
                    List list2 = (List) this.n;
                    bd2.x(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list2.add(new mm(1, null));
                        this.n = list2;
                        this.l = it2;
                        this.m = null;
                        this.k = 2;
                        throw null;
                    }
                    obj = obj4;
                    it = it2;
                    list = list2;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.l;
                    list = (List) this.n;
                    bd2.x(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.n = list;
                this.l = it;
                this.m = obj;
                this.k = 1;
                throw null;
            default:
                MainActivity mainActivity = (MainActivity) this.m;
                int i4 = this.k;
                boolean z = false;
                byte b = 0;
                rk rkVar = rk.f;
                try {
                    try {
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i4 == 0) {
                        bd2.x(obj);
                        ((ga0) this.l).a();
                        en enVar = fp.b;
                        km kmVar = new km((ya0) this.n, (ha0) obj3, ojVar, i2);
                        this.k = 1;
                        obj = gi2.A(this, enVar, kmVar);
                        if (obj == rkVar) {
                            return rkVar;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bd2.x(obj);
                            return z31.a;
                        }
                        bd2.x(obj);
                    }
                    on onVar = fp.a;
                    i00 i00Var = za0.a;
                    pa0 pa0Var = new pa0((m) obj2, obj, ojVar, b == true ? 1 : 0);
                    this.k = 2;
                    if (gi2.A(this, i00Var, pa0Var) == rkVar) {
                        return rkVar;
                    }
                    return z31.a;
                } finally {
                    mainActivity.a0 = false;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(List list, ArrayList arrayList, oj ojVar) {
        super(2, ojVar);
        this.o = list;
        this.p = arrayList;
    }
}
