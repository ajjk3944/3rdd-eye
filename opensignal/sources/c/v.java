package c;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final am.d f3052a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f3053d;

    public v(w wVar, am.d dVar) {
        br.l.e(dVar, "onBackPressedCallback");
        this.f3053d = wVar;
        this.f3052a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ar.a, br.k] */
    @Override // c.c
    public final void cancel() {
        w wVar = this.f3053d;
        mq.k kVar = wVar.f3055b;
        am.d dVar = this.f3052a;
        kVar.remove(dVar);
        if (br.l.a(wVar.f3056c, dVar)) {
            dVar.a();
            wVar.f3056c = null;
        }
        dVar.f859b.remove(this);
        ?? r02 = dVar.f860c;
        if (r02 != 0) {
            r02.c();
        }
        dVar.f860c = null;
    }
}
