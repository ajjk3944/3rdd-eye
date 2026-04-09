package u5;

import a5.d0;

/* loaded from: classes.dex */
public class n implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23296a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23297b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23298c;

    public /* synthetic */ n(int i10, long j, Object obj) {
        this.f23296a = i10;
        this.f23298c = obj;
        this.f23297b = j;
    }

    @Override // u5.x
    public final boolean b() {
        switch (this.f23296a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // u5.x
    public final w d(long j) {
        switch (this.f23296a) {
            case 0:
                o oVar = (o) this.f23298c;
                a5.a.j(oVar.k);
                ca.p pVar = oVar.k;
                long[] jArr = pVar.f3489a;
                long[] jArr2 = pVar.f3490b;
                int iE = d0.e(jArr, d0.i((oVar.f23303e * j) / 1000000, 0L, oVar.j - 1), false);
                long j7 = iE == -1 ? 0L : jArr[iE];
                long j10 = iE != -1 ? jArr2[iE] : 0L;
                int i10 = oVar.f23303e;
                long j11 = (j7 * 1000000) / i10;
                long j12 = this.f23297b;
                y yVar = new y(j11, j10 + j12);
                if (j11 == j || iE == jArr.length - 1) {
                    return new w(yVar, yVar);
                }
                int i11 = iE + 1;
                return new w(yVar, new y((jArr[i11] * 1000000) / i10, j12 + jArr2[i11]));
            case 1:
                return (w) this.f23298c;
            default:
                w5.b bVar = (w5.b) this.f23298c;
                w wVarB = bVar.f24204g[0].b(j);
                int i12 = 1;
                while (true) {
                    w5.e[] eVarArr = bVar.f24204g;
                    if (i12 >= eVarArr.length) {
                        return wVarB;
                    }
                    w wVarB2 = eVarArr[i12].b(j);
                    if (wVarB2.f23354a.f23358b < wVarB.f23354a.f23358b) {
                        wVarB = wVarB2;
                    }
                    i12++;
                }
        }
    }

    @Override // u5.x
    public final long e() {
        switch (this.f23296a) {
        }
        return this.f23297b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(long j) {
        this(j, 0L);
        this.f23296a = 1;
    }

    public n(long j, long j7) {
        this.f23296a = 1;
        this.f23297b = j;
        y yVar = j7 == 0 ? y.f23356c : new y(0L, j7);
        this.f23298c = new w(yVar, yVar);
    }
}
