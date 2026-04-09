package nk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18371a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18372b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        this.f18371a = arrayList;
        this.f18372b = arrayList2;
    }

    public static d a(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (p0.b(dVar.f18359a, type) && dVar.f18360b.equals(set)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // nk.q
    public final r create(Type type, Set set, j0 j0Var) {
        d dVarA = a(this.f18371a, type, set);
        d dVarA2 = a(this.f18372b, type, set);
        r rVarC = null;
        if (dVarA == null && dVarA2 == null) {
            return null;
        }
        if (dVarA == null || dVarA2 == null) {
            try {
                rVarC = j0Var.c(this, type, set);
            } catch (IllegalArgumentException e4) {
                StringBuilder sbU = c7.a.u("No ", dVarA == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbU.append(ok.f.j(type, set));
                throw new IllegalArgumentException(sbU.toString(), e4);
            }
        }
        r rVar = rVarC;
        if (dVarA != null) {
            dVarA.a(j0Var, this);
        }
        if (dVarA2 != null) {
            dVarA2.a(j0Var, this);
        }
        return new a(dVarA, rVar, j0Var, dVarA2, set, type);
    }
}
