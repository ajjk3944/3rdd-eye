package Q4;

import androidx.lifecycle.Z;

/* loaded from: classes.dex */
public final class s extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f3230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i) {
        super(0);
        this.f3229b = i;
        this.f3230c = tVar;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f3229b) {
            case 0:
                return this.f3230c.Q().d();
            case 1:
                return this.f3230c.Q().c();
            default:
                Z zN = this.f3230c.Q().n();
                q5.i.d(zN, "requireActivity().defaultViewModelProviderFactory");
                return zN;
        }
    }
}
