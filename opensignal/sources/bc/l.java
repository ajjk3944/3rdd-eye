package bc;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f2619a;

    public l(d dVar) {
        this.f2619a = dVar;
    }

    @Override // bc.b
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        d dVar = this.f2619a;
        dVar.J.sendMessage(dVar.J.obtainMessage(1, boolValueOf));
    }
}
