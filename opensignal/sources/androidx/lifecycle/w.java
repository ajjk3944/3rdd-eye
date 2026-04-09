package androidx.lifecycle;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public n f1524a;

    /* renamed from: b, reason: collision with root package name */
    public t f1525b;

    public final void a(v vVar, m mVar) {
        n targetState = mVar.getTargetState();
        n nVar = this.f1524a;
        br.l.e(nVar, "state1");
        if (targetState != null && targetState.compareTo(nVar) < 0) {
            nVar = targetState;
        }
        this.f1524a = nVar;
        this.f1525b.b(vVar, mVar);
        this.f1524a = targetState;
    }
}
