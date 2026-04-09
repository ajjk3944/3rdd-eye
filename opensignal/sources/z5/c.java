package z5;

import dj.i;
import u5.w;
import u5.x;
import u5.y;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f26684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f26685b;

    public c(i iVar, x xVar) {
        this.f26685b = iVar;
        this.f26684a = xVar;
    }

    @Override // u5.x
    public final boolean b() {
        return this.f26684a.b();
    }

    @Override // u5.x
    public final w d(long j) {
        w wVarD = this.f26684a.d(j);
        y yVar = wVarD.f23354a;
        long j7 = yVar.f23357a;
        long j10 = yVar.f23358b;
        long j11 = this.f26685b.f7404d;
        y yVar2 = new y(j7, j10 + j11);
        y yVar3 = wVarD.f23355b;
        return new w(yVar2, new y(yVar3.f23357a, yVar3.f23358b + j11));
    }

    @Override // u5.x
    public final long e() {
        return this.f26684a.e();
    }
}
