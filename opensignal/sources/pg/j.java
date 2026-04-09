package pg;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20528a;

    public j(k kVar) {
        this.f20528a = kVar;
    }

    public final void a() {
        k kVar = this.f20528a;
        synchronized (kVar) {
            kVar.f20534d = true;
        }
        this.f20528a.g();
    }
}
