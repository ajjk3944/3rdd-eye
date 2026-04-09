package kotlinx.coroutines.internal;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f22526a = new c0("CLOSED");

    public static final e b(e eVar) {
        while (true) {
            Object objF = eVar.f();
            if (objF == f22526a) {
                return eVar;
            }
            e eVar2 = (e) objF;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.l()) {
                return eVar;
            }
        }
    }

    public static final Object c(z zVar, long j10, l9.p pVar) {
        while (true) {
            if (zVar.f22569c >= j10 && !zVar.j()) {
                return a0.a(zVar);
            }
            Object objF = zVar.f();
            if (objF == f22526a) {
                return a0.a(f22526a);
            }
            z zVar2 = (z) ((e) objF);
            if (zVar2 == null) {
                zVar2 = (z) pVar.invoke(Long.valueOf(zVar.f22569c + 1), zVar);
                if (zVar.n(zVar2)) {
                    if (zVar.j()) {
                        zVar.m();
                    }
                }
            }
            zVar = zVar2;
        }
    }
}
