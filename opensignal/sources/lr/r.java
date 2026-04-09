package lr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r implements ir.c, p1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f15672a = t1.n(null, new o(this, 1));

    /* renamed from: d, reason: collision with root package name */
    public final r1 f15673d = t1.n(null, new o(this, 2));

    /* renamed from: g, reason: collision with root package name */
    public final r1 f15674g = t1.n(null, new o(this, 4));

    /* renamed from: r, reason: collision with root package name */
    public final r1 f15675r;

    public r() {
        t1.n(null, new o(this, 5));
        this.f15675r = t1.n(null, new o(this, 0));
    }

    public static Object j(m1 m1Var) throws NegativeArraySizeException {
        Class clsD = ir.f0.D(xu.d.A(m1Var));
        if (clsD.isArray()) {
            Object objNewInstance = Array.newInstance(clsD.getComponentType(), 0);
            br.l.d(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new lq.k("Cannot instantiate the default empty array of type " + clsD.getSimpleName() + ", because it is not an array type", 1);
    }

    public abstract d0 A();

    public abstract mr.g B();

    public abstract rr.d C();

    public final boolean D() {
        return br.l.a(getName(), "<init>") && A().a().isAnnotation();
    }

    public abstract boolean E();

    @Override // ir.b
    public final List e() {
        Object objC = this.f15672a.c();
        br.l.d(objC, "_annotations()");
        return (List) objC;
    }

    @Override // ir.c
    public final br.m i() {
        Object objC = this.f15674g.c();
        br.l.d(objC, "_returnType()");
        return (br.m) objC;
    }

    @Override // ir.c
    public final List o() {
        Object objC = this.f15673d.c();
        br.l.d(objC, "_parameters()");
        return (List) objC;
    }

    @Override // ir.c
    public final Object s(Object... objArr) {
        br.l.e(objArr, "args");
        try {
            return z().s(objArr);
        } catch (IllegalAccessException e4) {
            throw new ba.l(e4);
        }
    }

    @Override // ir.c
    public final Object t(pk.b bVar) throws ba.l, NegativeArraySizeException {
        Object objJ;
        boolean z10 = false;
        if (D()) {
            List<ir.m> listO = o();
            ArrayList arrayList = new ArrayList(mq.p.a0(listO, 10));
            for (ir.m mVar : listO) {
                if (bVar.containsKey(mVar)) {
                    objJ = bVar.get(mVar);
                    if (objJ == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + mVar + ')');
                    }
                } else {
                    t0 t0Var = (t0) mVar;
                    if (t0Var.f()) {
                        objJ = null;
                    } else {
                        if (!t0Var.g()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + t0Var);
                        }
                        objJ = j(t0Var.c());
                    }
                }
                arrayList.add(objJ);
            }
            mr.g gVarB = B();
            if (gVarB != null) {
                try {
                    return gVarB.s(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e4) {
                    throw new ba.l(e4);
                }
            }
            throw new lq.k("This callable does not support a default call: " + C(), 1);
        }
        List<ir.m> listO2 = o();
        if (listO2.isEmpty()) {
            try {
                return z().s(r() ? new pq.c[]{null} : new pq.c[0]);
            } catch (IllegalAccessException e10) {
                throw new ba.l(e10);
            }
        }
        int size = (r() ? 1 : 0) + listO2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f15675r.c()).clone();
        if (r()) {
            objArr[listO2.size()] = null;
        }
        int i10 = 0;
        for (ir.m mVar2 : listO2) {
            if (bVar.containsKey(mVar2)) {
                objArr[((t0) mVar2).f15690d] = bVar.get(mVar2);
            } else {
                t0 t0Var2 = (t0) mVar2;
                if (t0Var2.f()) {
                    int i11 = (i10 / 32) + size;
                    Object obj = objArr[i11];
                    br.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i11] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i10 % 32)));
                    z10 = true;
                } else if (!t0Var2.g()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + t0Var2);
                }
            }
            if (((t0) mVar2).f15691g == ir.l.VALUE) {
                i10++;
            }
        }
        if (!z10) {
            try {
                mr.g gVarZ = z();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                br.l.d(objArrCopyOf, "copyOf(this, newSize)");
                return gVarZ.s(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new ba.l(e11);
            }
        }
        mr.g gVarB2 = B();
        if (gVarB2 != null) {
            try {
                return gVarB2.s(objArr);
            } catch (IllegalAccessException e12) {
                throw new ba.l(e12);
            }
        }
        throw new lq.k("This callable does not support a default call: " + C(), 1);
    }

    public abstract mr.g z();
}
