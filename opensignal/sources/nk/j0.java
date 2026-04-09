package nk;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f18407d;

    /* renamed from: a, reason: collision with root package name */
    public final List f18408a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f18409b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18410c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f18407d = arrayList;
        arrayList.add(p0.f18437a);
        arrayList.add(m.f18420c);
        arrayList.add(g.f18383e);
        arrayList.add(g.f18382d);
        arrayList.add(k0.f18414a);
        arrayList.add(l.f18415d);
    }

    public j0(kf.n nVar) {
        ArrayList arrayList = nVar.f14328a;
        int size = arrayList.size();
        ArrayList arrayList2 = f18407d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f18408a = Collections.unmodifiableList(arrayList3);
    }

    public final r a(Class cls) {
        return b(cls, ok.f.f19537a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [nk.r] */
    public final r b(Type type, Set set, String str) {
        h0 h0Var;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = ok.f.g(ok.f.a(type));
        Object objAsList = set.isEmpty() ? typeG : Arrays.asList(typeG, set);
        synchronized (this.f18410c) {
            try {
                r rVar = (r) this.f18410c.get(objAsList);
                if (rVar != null) {
                    return rVar;
                }
                i0 i0Var = (i0) this.f18409b.get();
                if (i0Var == null) {
                    i0Var = new i0(this);
                    this.f18409b.set(i0Var);
                }
                ArrayDeque arrayDeque = i0Var.f18402b;
                ArrayList arrayList = i0Var.f18401a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        h0 h0Var2 = new h0(typeG, str, objAsList);
                        arrayList.add(h0Var2);
                        arrayDeque.add(h0Var2);
                        h0Var = null;
                        break;
                    }
                    h0Var = (h0) arrayList.get(i10);
                    if (h0Var.f18397c.equals(objAsList)) {
                        arrayDeque.add(h0Var);
                        ?? r12 = h0Var.f18398d;
                        if (r12 != 0) {
                            h0Var = r12;
                        }
                    } else {
                        i10++;
                    }
                }
                try {
                    if (h0Var != null) {
                        return h0Var;
                    }
                    try {
                        int size2 = this.f18408a.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            r rVarCreate = ((q) this.f18408a.get(i11)).create(typeG, set, this);
                            if (rVarCreate != null) {
                                ((h0) i0Var.f18402b.getLast()).f18398d = rVarCreate;
                                i0Var.b(true);
                                return rVarCreate;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + ok.f.j(typeG, set));
                    } catch (IllegalArgumentException e4) {
                        throw i0Var.a(e4);
                    }
                } finally {
                    i0Var.b(false);
                }
            } finally {
            }
        }
    }

    public final r c(e eVar, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeG = ok.f.g(ok.f.a(type));
        List list = this.f18408a;
        int iIndexOf = list.indexOf(eVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = list.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            r rVarCreate = ((q) list.get(i10)).create(typeG, set, this);
            if (rVarCreate != null) {
                return rVarCreate;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + ok.f.j(typeG, set));
    }
}
