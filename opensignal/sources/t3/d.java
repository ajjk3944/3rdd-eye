package t3;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f22399c;

    public d(int i10) {
        super(i10);
        this.f22399c = new Object();
    }

    @Override // t3.c
    public final Object a() {
        Object objA;
        synchronized (this.f22399c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // t3.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f22399c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
