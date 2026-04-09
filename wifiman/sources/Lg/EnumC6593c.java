package lg;

import gg.B;
import gg.InterfaceC5914d;
import gg.p;
import gg.x;

/* renamed from: lg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6593c implements Dg.b {
    INSTANCE,
    NEVER;

    public static void complete(x xVar) {
        xVar.c(INSTANCE);
        xVar.a();
    }

    public static void error(Throwable th2, x xVar) {
        xVar.c(INSTANCE);
        xVar.onError(th2);
    }

    @Override // Dg.g
    public void clear() {
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return true;
    }

    @Override // Dg.g
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dg.g
    public Object poll() {
        return null;
    }

    @Override // Dg.c
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(p pVar) {
        pVar.c(INSTANCE);
        pVar.a();
    }

    public static void error(Throwable th2, InterfaceC5914d interfaceC5914d) {
        interfaceC5914d.c(INSTANCE);
        interfaceC5914d.onError(th2);
    }

    public static void complete(InterfaceC5914d interfaceC5914d) {
        interfaceC5914d.c(INSTANCE);
        interfaceC5914d.a();
    }

    public static void error(Throwable th2, B b10) {
        b10.c(INSTANCE);
        b10.onError(th2);
    }

    public static void error(Throwable th2, p pVar) {
        pVar.c(INSTANCE);
        pVar.onError(th2);
    }
}
