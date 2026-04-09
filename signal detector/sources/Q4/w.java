package Q4;

import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class w extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f3252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i) {
        super(0);
        this.f3251b = i;
        this.f3252c = xVar;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3251b) {
            case 0:
                return this.f3252c.Q().d();
            case 1:
                return this.f3252c.Q().c();
            default:
                Z zN = this.f3252c.Q().n();
                q5.i.d(zN, "requireActivity().defaultViewModelProviderFactory");
                return zN;
        }
    }
}
