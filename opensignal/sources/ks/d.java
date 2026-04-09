package ks;

import java.util.ArrayList;
import js.o;
import js.p;
import n0.k0;

/* loaded from: classes.dex */
public abstract class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14495a;

    public d(int i10) {
        switch (i10) {
            case 1:
                this.f14495a = new ArrayList();
                break;
            default:
                this.f14495a = new ArrayList();
                break;
        }
    }

    @Override // js.p
    public void b() {
        g((String[]) this.f14495a.toArray(new String[0]));
    }

    @Override // js.p
    public void c(Object obj) {
        if (obj instanceof String) {
            this.f14495a.add((String) obj);
        }
    }

    @Override // js.p
    public o d(qs.b bVar) {
        return null;
    }

    public boolean e(k0 k0Var, Object obj) {
        ArrayList arrayList = k0Var.f17203a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof n0.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof k0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (e((k0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void g(String[] strArr);

    @Override // js.p
    public void h(vs.f fVar) {
    }

    @Override // js.p
    public void a(qs.b bVar, qs.g gVar) {
    }

    public void f(k0 k0Var, Object obj) {
    }
}
