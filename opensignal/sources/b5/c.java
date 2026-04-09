package b5;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2424a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2425d = new ArrayList(1);

    /* renamed from: g, reason: collision with root package name */
    public int f2426g;

    /* renamed from: r, reason: collision with root package name */
    public k f2427r;

    public c(boolean z10) {
        this.f2424a = z10;
    }

    public final void a(int i10) {
        k kVar = this.f2427r;
        int i11 = a5.d0.f105a;
        for (int i12 = 0; i12 < this.f2426g; i12++) {
            ((b0) this.f2425d.get(i12)).g(kVar, this.f2424a, i10);
        }
    }

    public final void e() {
        k kVar = this.f2427r;
        int i10 = a5.d0.f105a;
        for (int i11 = 0; i11 < this.f2426g; i11++) {
            ((b0) this.f2425d.get(i11)).f(kVar, this.f2424a);
        }
        this.f2427r = null;
    }

    public final void f(k kVar) {
        for (int i10 = 0; i10 < this.f2426g; i10++) {
            ((b0) this.f2425d.get(i10)).getClass();
        }
    }

    public final void h(k kVar) {
        this.f2427r = kVar;
        for (int i10 = 0; i10 < this.f2426g; i10++) {
            ((b0) this.f2425d.get(i10)).d(kVar, this.f2424a);
        }
    }

    @Override // b5.h
    public final void w(b0 b0Var) {
        b0Var.getClass();
        ArrayList arrayList = this.f2425d;
        if (arrayList.contains(b0Var)) {
            return;
        }
        arrayList.add(b0Var);
        this.f2426g++;
    }
}
