package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class x1 extends e0 implements y0, m1 {

    /* renamed from: d, reason: collision with root package name */
    public y1 f22704d;

    public final void A(y1 y1Var) {
        this.f22704d = y1Var;
    }

    @Override // kotlinx.coroutines.m1
    public d2 a() {
        return null;
    }

    @Override // kotlinx.coroutines.y0
    public void d() {
        z().E0(this);
    }

    @Override // kotlinx.coroutines.m1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return l0.a(this) + '@' + l0.b(this) + "[job@" + l0.b(z()) + ']';
    }

    public final y1 z() {
        y1 y1Var = this.f22704d;
        if (y1Var != null) {
            return y1Var;
        }
        kotlin.jvm.internal.p.t("job");
        return null;
    }
}
