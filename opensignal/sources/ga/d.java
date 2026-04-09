package ga;

import ca.t;
import ca.u;
import ca.v;
import dj.i;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f9422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f9423b;

    public d(i iVar, u uVar) {
        this.f9423b = iVar;
        this.f9422a = uVar;
    }

    @Override // ca.u
    public final boolean b() {
        return this.f9422a.b();
    }

    @Override // ca.u
    public final t d(long j) {
        t tVarD = this.f9422a.d(j);
        v vVar = tVarD.f3508a;
        long j7 = vVar.f3511a;
        long j10 = vVar.f3512b;
        long j11 = this.f9423b.f7404d;
        v vVar2 = new v(j7, j10 + j11);
        v vVar3 = tVarD.f3509b;
        return new t(vVar2, new v(vVar3.f3511a, vVar3.f3512b + j11));
    }

    @Override // ca.u
    public final long e() {
        return this.f9422a.e();
    }
}
