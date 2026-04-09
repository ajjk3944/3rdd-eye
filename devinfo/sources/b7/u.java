package b7;

import al.i1;
import java.util.concurrent.CancellationException;
import u0.o1;
import u0.s1;
import xk.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2059b;

    public /* synthetic */ u(int i4, Object obj) {
        this.f2058a = i4;
        this.f2059b = obj;
    }

    private final Object c(Object obj) {
        s1 s1Var = (s1) this.f2059b;
        Throwable th2 = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th2);
        synchronized (s1Var.f34965c) {
            try {
                y0 y0Var = s1Var.f34966d;
                if (y0Var != null) {
                    i1 i1Var = s1Var.f34981u;
                    o1 o1Var = o1.f34893b;
                    i1Var.getClass();
                    i1Var.j(null, o1Var);
                    y0Var.e(cancellationException);
                    s1Var.f34978r = null;
                    y0Var.m(new b(24, s1Var, th2));
                } else {
                    s1Var.f34967e = cancellationException;
                    i1 i1Var2 = s1Var.f34981u;
                    o1 o1Var2 = o1.f34892a;
                    i1Var2.getClass();
                    i1Var2.j(null, o1Var2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return yj.u.f37649a;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027e  */
    @Override // mk.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r56) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.u.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ u(gl.c cVar, gl.b bVar) {
        this.f2058a = 8;
        this.f2059b = cVar;
    }
}
