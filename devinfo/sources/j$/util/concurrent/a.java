package j$.util.concurrent;

/* loaded from: classes2.dex */
public abstract class a extends p {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f26315i;
    public l j;

    public a(l[] lVarArr, int i4, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i4, 0, i10);
        this.f26315i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f26333b != null;
    }

    public final boolean hasMoreElements() {
        return this.f26333b != null;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.f26315i.g(lVar.f26325b, null, null);
    }
}
