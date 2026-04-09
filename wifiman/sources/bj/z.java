package bj;

import Xi.m;
import Zg.U;
import Zg.d0;
import Zi.X;
import aj.AbstractC3866G;
import aj.AbstractC3868b;
import aj.C3861B;
import aj.C3864E;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* loaded from: classes4.dex */
class z extends AbstractC4120c {

    /* renamed from: h, reason: collision with root package name */
    private final C3864E f33471h;

    /* renamed from: i, reason: collision with root package name */
    private final Xi.f f33472i;

    /* renamed from: j, reason: collision with root package name */
    private int f33473j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33474k;

    public /* synthetic */ z(AbstractC3868b abstractC3868b, C3864E c3864e, String str, Xi.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3868b, c3864e, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    private final boolean D0(Xi.f fVar, int i10) {
        boolean z10 = (d().e().j() || fVar.j(i10) || !fVar.i(i10).c()) ? false : true;
        this.f33474k = z10;
        return z10;
    }

    private final boolean E0(Xi.f fVar, int i10, String str) {
        AbstractC3868b abstractC3868bD = d();
        boolean zJ = fVar.j(i10);
        Xi.f fVarI = fVar.i(i10);
        if (zJ && !fVarI.c() && (m0(str) instanceof C3861B)) {
            return true;
        }
        if (AbstractC6492s.d(fVarI.h(), m.b.f24469a) && (!fVarI.c() || !(m0(str) instanceof C3861B))) {
            aj.j jVarM0 = m0(str);
            AbstractC3866G abstractC3866G = jVarM0 instanceof AbstractC3866G ? (AbstractC3866G) jVarM0 : null;
            String strE = abstractC3866G != null ? aj.k.e(abstractC3866G) : null;
            if (strE != null) {
                int i11 = t.i(fVarI, abstractC3868bD, strE);
                boolean z10 = !abstractC3868bD.e().j() && fVarI.c();
                if (i11 == -3 && (zJ || z10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bj.AbstractC4120c
    /* renamed from: F0 */
    public C3864E A0() {
        return this.f33471h;
    }

    @Override // bj.AbstractC4120c, Yi.c
    public void b(Xi.f descriptor) {
        Set setL;
        AbstractC6492s.i(descriptor, "descriptor");
        if (t.m(descriptor, d()) || (descriptor.h() instanceof Xi.d)) {
            return;
        }
        t.n(descriptor, d());
        if (this.f33438g.o()) {
            Set setA = X.a(descriptor);
            Map map = (Map) aj.I.a(d()).a(descriptor, t.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = d0.e();
            }
            setL = d0.l(setA, setKeySet);
        } else {
            setL = X.a(descriptor);
        }
        for (String str : A0().keySet()) {
            if (!setL.contains(str) && !AbstractC6492s.d(str, z0())) {
                throw r.d(-1, "Encountered an unknown key '" + str + "' at element: " + j0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) r.i(A0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // bj.AbstractC4120c, Yi.e
    public Yi.c c(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (descriptor != this.f33472i) {
            return super.c(descriptor);
        }
        AbstractC3868b abstractC3868bD = d();
        aj.j jVarN0 = n0();
        String strA = this.f33472i.a();
        if (jVarN0 instanceof C3864E) {
            return new z(abstractC3868bD, (C3864E) jVarN0, z0(), this.f33472i);
        }
        throw r.e(-1, "Expected " + O.b(C3864E.class).v() + ", but had " + O.b(jVarN0.getClass()).v() + " as the serialized body of " + strA + " at element: " + j0(), jVarN0.toString());
    }

    @Override // Zi.AbstractC3723o0
    protected String g0(Xi.f descriptor, int i10) {
        Object next;
        AbstractC6492s.i(descriptor, "descriptor");
        t.n(descriptor, d());
        String strF = descriptor.f(i10);
        if (!this.f33438g.o() || A0().keySet().contains(strF)) {
            return strF;
        }
        Map mapE = t.e(d(), descriptor);
        Iterator<T> it = A0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapE.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strF;
    }

    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        while (this.f33473j < descriptor.e()) {
            int i10 = this.f33473j;
            this.f33473j = i10 + 1;
            String strA0 = a0(descriptor, i10);
            int i11 = this.f33473j - 1;
            this.f33474k = false;
            if (A0().containsKey(strA0) || D0(descriptor, i11)) {
                if (!this.f33438g.g() || !E0(descriptor, i11, strA0)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bj.AbstractC4120c
    public aj.j m0(String tag) {
        AbstractC6492s.i(tag, "tag");
        return (aj.j) U.i(A0(), tag);
    }

    @Override // bj.AbstractC4120c, Yi.e
    public boolean y() {
        return !this.f33474k && super.y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC3868b json, C3864E value, String str, Xi.f fVar) {
        super(json, value, str, null);
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(value, "value");
        this.f33471h = value;
        this.f33472i = fVar;
    }
}
