package yg;

/* renamed from: yg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC8669d implements Dg.d {
    INSTANCE;

    public static void complete(Dj.b bVar) {
        bVar.j(INSTANCE);
        bVar.a();
    }

    public static void error(Throwable th2, Dj.b bVar) {
        bVar.j(INSTANCE);
        bVar.onError(th2);
    }

    @Override // Dj.c
    public void cancel() {
    }

    @Override // Dg.g
    public void clear() {
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

    @Override // Dj.c
    public void request(long j10) {
        EnumC8672g.validate(j10);
    }

    @Override // Dg.c
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
