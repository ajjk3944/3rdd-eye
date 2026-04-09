package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class h2 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f26594a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f26595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26596c;

    @Override // j$.util.stream.e2
    public final int o() {
        return 2;
    }

    public h2(e2 e2Var, e2 e2Var2) {
        this.f26594a = e2Var;
        this.f26595b = e2Var2;
        this.f26596c = e2Var2.count() + e2Var.count();
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i4) {
        if (i4 == 0) {
            return this.f26594a;
        }
        if (i4 == 1) {
            return this.f26595b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.f26596c;
    }

    @Override // j$.util.stream.e2
    public /* bridge */ /* synthetic */ d2 a(int i4) {
        return (d2) a(i4);
    }
}
