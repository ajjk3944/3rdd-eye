package N6;

import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f4723g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4724h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, int i) {
        super(0);
        this.f4723g = oVar;
        this.f4724h = i;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        this.f4723g.a(this.f4724h);
        return C1992A.f18074a;
    }
}
