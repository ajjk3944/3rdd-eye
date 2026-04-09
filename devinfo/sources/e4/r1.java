package e4;

import com.google.android.gms.internal.measurement.z3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f22385a;

    /* renamed from: b, reason: collision with root package name */
    public v3.b[] f22386b;

    public r1() {
        this(new c2((c2) null));
    }

    public final void a() {
        v3.b[] bVarArr = this.f22386b;
        if (bVarArr != null) {
            v3.b bVarG = bVarArr[0];
            v3.b bVarG2 = bVarArr[1];
            c2 c2Var = this.f22385a;
            if (bVarG2 == null) {
                bVarG2 = c2Var.f22315a.g(2);
            }
            if (bVarG == null) {
                bVarG = c2Var.f22315a.g(1);
            }
            g(v3.b.a(bVarG, bVarG2));
            v3.b bVar = this.f22386b[z3.n(16)];
            if (bVar != null) {
                f(bVar);
            }
            v3.b bVar2 = this.f22386b[z3.n(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            v3.b bVar3 = this.f22386b[z3.n(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract c2 b();

    public void c(int i4, v3.b bVar) {
        if (this.f22386b == null) {
            this.f22386b = new v3.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i4 & i10) != 0) {
                this.f22386b[z3.n(i10)] = bVar;
            }
        }
    }

    public abstract void e(v3.b bVar);

    public abstract void g(v3.b bVar);

    public r1(c2 c2Var) {
        this.f22385a = c2Var;
    }

    public void d(v3.b bVar) {
    }

    public void f(v3.b bVar) {
    }

    public void h(v3.b bVar) {
    }
}
