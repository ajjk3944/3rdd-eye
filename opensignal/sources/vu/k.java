package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i10) {
        super(str, true);
        this.f24009e = i10;
        this.f24010f = obj;
        this.f24011g = obj2;
    }

    @Override // ru.a
    public final long a() {
        long jA;
        int i10;
        y[] yVarArr;
        switch (this.f24009e) {
            case 0:
                q qVar = (q) this.f24010f;
                qVar.f24028a.a(qVar, (c0) ((br.w) this.f24011g).f2917a);
                return -1L;
            case 1:
                try {
                    ((q) this.f24010f).f24028a.b((y) this.f24011g);
                } catch (IOException e4) {
                    xu.n nVar = xu.n.f25563a;
                    xu.n nVar2 = xu.n.f25563a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f24010f).f24030g;
                    nVar2.getClass();
                    xu.n.i(str, 4, e4);
                    try {
                        ((y) this.f24011g).c(c.PROTOCOL_ERROR, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                ur.g gVar = (ur.g) this.f24010f;
                c0 c0Var = (c0) this.f24011g;
                br.w wVar = new br.w();
                q qVar2 = (q) gVar.f23640g;
                synchronized (qVar2.S) {
                    synchronized (qVar2) {
                        try {
                            c0 c0Var2 = qVar2.M;
                            c0 c0Var3 = new c0();
                            c0Var3.b(c0Var2);
                            c0Var3.b(c0Var);
                            wVar.f2917a = c0Var3;
                            jA = c0Var3.a() - c0Var2.a();
                            i10 = 0;
                            yVarArr = (jA == 0 || qVar2.f24029d.isEmpty()) ? null : (y[]) qVar2.f24029d.values().toArray(new y[0]);
                            c0 c0Var4 = (c0) wVar.f2917a;
                            br.l.e(c0Var4, "<set-?>");
                            qVar2.M = c0Var4;
                            qVar2.F.c(new k(qVar2.f24030g + " onSettings", qVar2, wVar, i10), 0L);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        qVar2.S.b((c0) wVar.f2917a);
                    } catch (IOException e10) {
                        qVar2.f(e10);
                    }
                }
                if (yVarArr != null) {
                    int length = yVarArr.length;
                    while (i10 < length) {
                        y yVar = yVarArr[i10];
                        synchronized (yVar) {
                            yVar.f24068f += jA;
                            if (jA > 0) {
                                yVar.notifyAll();
                            }
                        }
                        i10++;
                    }
                }
                return -1L;
        }
    }
}
