package a7;

import a7.AbstractC1664a;
import p9.InterfaceC5480a;

/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<Object> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1668e f14213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1664a.C0224a f14214h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1668e c1668e, AbstractC1664a.C0224a c0224a) {
        super(0);
        this.f14213g = c1668e;
        this.f14214h = c0224a;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        AbstractC1664a.C0224a c0224a = this.f14214h;
        Object objB = this.f14213g.b(c0224a.f14171e);
        c0224a.d(c0224a.f14171e.f14168b);
        return objB;
    }
}
