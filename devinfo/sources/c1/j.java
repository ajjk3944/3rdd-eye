package c1;

import java.util.Set;
import u0.u1;
import u0.v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.e f2564b = new w0.e(new v1[16]);

    public j(Set set) {
        this.f2563a = set;
    }

    @Override // u0.u1
    public final void d() {
        w0.e eVar = this.f2564b;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            u1 u1Var = ((v1) objArr[i10]).f34990a;
            this.f2563a.remove(u1Var);
            u1Var.d();
        }
    }

    @Override // u0.u1
    public final void a() {
    }

    @Override // u0.u1
    public final void b() {
    }
}
