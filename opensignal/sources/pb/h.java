package pb;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20372a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20373d = new ArrayList(1);

    /* renamed from: g, reason: collision with root package name */
    public int f20374g;

    /* renamed from: r, reason: collision with root package name */
    public na.c f20375r;

    public h(boolean z10) {
        this.f20372a = z10;
    }

    public final void a(int i10) {
        na.c cVar = this.f20375r;
        int i11 = qb.v.f20828a;
        for (int i12 = 0; i12 < this.f20374g; i12++) {
            ((u0) this.f20373d.get(i12)).c(cVar, this.f20372a, i10);
        }
    }

    public final void e() {
        na.c cVar = this.f20375r;
        int i10 = qb.v.f20828a;
        for (int i11 = 0; i11 < this.f20374g; i11++) {
            ((u0) this.f20373d.get(i11)).d(cVar, this.f20372a);
        }
        this.f20375r = null;
    }

    public final void f(na.c cVar) {
        for (int i10 = 0; i10 < this.f20374g; i10++) {
            ((u0) this.f20373d.get(i10)).getClass();
        }
    }

    public final void h(na.c cVar) {
        this.f20375r = cVar;
        for (int i10 = 0; i10 < this.f20374g; i10++) {
            ((u0) this.f20373d.get(i10)).g(cVar, this.f20372a);
        }
    }

    @Override // pb.n
    public final void s(u0 u0Var) {
        u0Var.getClass();
        ArrayList arrayList = this.f20373d;
        if (arrayList.contains(u0Var)) {
            return;
        }
        arrayList.add(u0Var);
        this.f20374g++;
    }
}
