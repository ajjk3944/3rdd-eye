package Q4;

import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class b extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i) {
        super(0);
        this.f3191b = i;
        this.f3192c = cVar;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3191b) {
            case 0:
                return this.f3192c.Q().d();
            case 1:
                return this.f3192c.Q().c();
            default:
                Z zN = this.f3192c.Q().n();
                q5.i.d(zN, "requireActivity().defaultViewModelProviderFactory");
                return zN;
        }
    }
}
