package V4;

import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class p extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(0);
        this.f3923b = i;
        this.f3924c = qVar;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3923b) {
            case 0:
                return this.f3924c.Q().d();
            case 1:
                return this.f3924c.Q().c();
            default:
                Z zN = this.f3924c.Q().n();
                q5.i.d(zN, "requireActivity().defaultViewModelProviderFactory");
                return zN;
        }
    }
}
