package fj;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8930a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br.n f8931d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(ar.a aVar, int i10) {
        this.f8930a = i10;
        this.f8931d = (br.n) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ar.a, br.n] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ar.a, br.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8930a) {
            case 0:
                this.f8931d.c();
                break;
            default:
                this.f8931d.c();
                break;
        }
    }
}
