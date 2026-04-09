package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class d1 implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17149a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17150d;

    public /* synthetic */ d1(int i10, Object obj) {
        this.f17149a = i10;
        this.f17150d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar.a
    public final Object c() {
        int i10 = this.f17149a;
        Object obj = this.f17150d;
        switch (i10) {
            case 0:
                ArrayList arrayList = ((e1) obj).f17161a;
                u.a0 a0Var = new u.a0(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    p0 p0Var = (p0) arrayList.get(i11);
                    Object obj2 = p0Var.f17279b;
                    int i12 = p0Var.f17278a;
                    Object o0Var = obj2 != null ? new o0(Integer.valueOf(i12), p0Var.f17279b) : Integer.valueOf(i12);
                    int iF = a0Var.f(o0Var);
                    boolean z10 = iF < 0;
                    Object obj3 = z10 ? null : a0Var.f23039c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof u.z) {
                            u.z zVar = (u.z) obj3;
                            zVar.a(p0Var);
                            p0Var = zVar;
                        } else {
                            Object[] objArr = u.f0.f23067a;
                            u.z zVar2 = new u.z(2);
                            zVar2.a(obj3);
                            zVar2.a(p0Var);
                            p0Var = zVar2;
                        }
                    }
                    if (z10) {
                        int i13 = ~iF;
                        a0Var.f23038b[i13] = o0Var;
                        a0Var.f23039c[i13] = p0Var;
                    } else {
                        a0Var.f23039c[iF] = p0Var;
                    }
                }
                return new p0.a(a0Var);
            case 1:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                ur.g gVar = (ur.g) obj;
                sb2.append(((qs.g) gVar.f23639d).b());
                return ic.a.j(sb2.toString(), ((ur.i) gVar.f23640g).getUpperBounds());
            case 2:
                ur.q qVar = (ur.q) obj;
                HashSet hashSet = new HashSet();
                for (qs.g gVar2 : (Set) qVar.f23664e.E.c()) {
                    zr.d dVar = zr.d.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(qVar.f(gVar2, dVar));
                    hashSet.addAll(qVar.b(gVar2, dVar));
                }
                return hashSet;
            default:
                return (List) obj;
        }
    }
}
