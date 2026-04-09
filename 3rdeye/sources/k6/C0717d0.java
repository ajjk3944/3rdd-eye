package K6;

import N7.C1431y3;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* renamed from: K6.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717d0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1431y3.c f3428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3429h;
    public final /* synthetic */ O6.E i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f3430j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3431k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0717d0(C1431y3.c cVar, A7.d dVar, O6.E e4, S s10, A7.d dVar2) {
        super(1);
        this.f3428g = cVar;
        this.f3429h = dVar;
        this.i = e4;
        this.f3430j = s10;
        this.f3431k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        A7.d dVar = this.f3431k;
        this.i.setShowSeparators(S.n(this.f3430j, this.f3428g, dVar));
        return C1992A.f18074a;
    }
}
