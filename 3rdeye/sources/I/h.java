package I;

import C.g0;
import E.u;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A4.a f2357c;

    public /* synthetic */ h(int i, A4.a aVar) {
        this.f2356b = i;
        this.f2357c = aVar;
    }

    @Override // o0.b.c
    public final Object i(b.a aVar) {
        switch (this.f2356b) {
            case 0:
                g0 g0Var = new g0(aVar, 3);
                H.b bVarY = u.y();
                A4.a aVar2 = this.f2357c;
                aVar2.addListener(g0Var, bVarY);
                return "transformVoidFuture [" + aVar2 + "]";
            default:
                H.b bVarY2 = u.y();
                A4.a aVar3 = this.f2357c;
                j.h(false, aVar3, aVar, bVarY2);
                return "nonCancellationPropagating[" + aVar3 + "]";
        }
    }
}
