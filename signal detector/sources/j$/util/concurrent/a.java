package j$.util.concurrent;

/* loaded from: classes2.dex */
public abstract class a extends p {
    public final ConcurrentHashMap i;

    /* renamed from: j, reason: collision with root package name */
    public l f20728j;

    public a(l[] lVarArr, int i, int i3, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i3);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f20746b != null;
    }

    public final boolean hasMoreElements() {
        return this.f20746b != null;
    }

    public final void remove() {
        l lVar = this.f20728j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f20728j = null;
        this.i.g(lVar.f20738b, null, null);
    }
}
