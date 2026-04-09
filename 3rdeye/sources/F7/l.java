package F7;

import H6.C0675l;
import H7.b;
import b9.C1992A;
import c.C2023u;
import p9.InterfaceC5480a;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1698h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i) {
        super(0);
        this.f1697g = i;
        this.f1698h = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f1697g) {
            case 0:
                B7.d.i((b.a) this.f1698h);
                break;
            case 1:
                C0675l c0675l = (C0675l) this.f1698h;
                break;
            case 2:
                break;
            case 3:
                Q6.g gVar = ((Q6.i) this.f1698h).f11338c;
                gVar.b(Q6.j.a(gVar.i, false, 0, 0, null, null, 30));
                break;
            default:
                ((C2023u) this.f1698h).d();
                break;
        }
        return C1992A.f18074a;
    }
}
