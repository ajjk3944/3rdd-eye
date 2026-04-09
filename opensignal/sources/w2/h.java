package w2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f24184a;

    /* renamed from: b, reason: collision with root package name */
    public j f24185b;

    /* renamed from: c, reason: collision with root package name */
    public k f24186c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24187d;

    public final void finalize() {
        k kVar;
        j jVar = this.f24185b;
        if (jVar != null) {
            i iVar = jVar.f24189d;
            if (!iVar.isDone()) {
                iVar.k(new ev.a("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f24184a, 2));
            }
        }
        if (this.f24187d || (kVar = this.f24186c) == null) {
            return;
        }
        kVar.j(null);
    }
}
