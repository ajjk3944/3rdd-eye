package zg;

import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;

/* renamed from: zg.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8761n {
    public static boolean a(boolean z10, boolean z11, Dj.b bVar, boolean z12, Dg.g gVar, InterfaceC8760m interfaceC8760m) {
        if (interfaceC8760m.c()) {
            gVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thError = interfaceC8760m.error();
            if (thError != null) {
                bVar.onError(thError);
            } else {
                bVar.a();
            }
            return true;
        }
        Throwable thError2 = interfaceC8760m.error();
        if (thError2 != null) {
            gVar.clear();
            bVar.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        bVar.a();
        return true;
    }

    public static void b(Dg.f fVar, Dj.b bVar, boolean z10, InterfaceC6043c interfaceC6043c, InterfaceC8760m interfaceC8760m) {
        int iE = 1;
        while (true) {
            boolean zB = interfaceC8760m.b();
            Object objPoll = fVar.poll();
            boolean z11 = objPoll == null;
            if (a(zB, z11, bVar, z10, fVar, interfaceC8760m)) {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                    return;
                }
                return;
            } else if (z11) {
                iE = interfaceC8760m.e(-iE);
                if (iE == 0) {
                    return;
                }
            } else {
                long jD = interfaceC8760m.d();
                if (jD == 0) {
                    fVar.clear();
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    bVar.onError(MissingBackpressureException.a());
                    return;
                }
                if (interfaceC8760m.g(bVar, objPoll) && jD != Long.MAX_VALUE) {
                    interfaceC8760m.f(1L);
                }
            }
        }
    }
}
