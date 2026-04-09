package K6;

import N7.C1431y3;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1431y3.c f3354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3355h;
    public final /* synthetic */ O6.E i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f3356j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3357k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C1431y3.c cVar, A7.d dVar, O6.E e4, S s10, A7.d dVar2) {
        super(1);
        this.f3354g = cVar;
        this.f3355h = dVar;
        this.i = e4;
        this.f3356j = s10;
        this.f3357k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        A7.d dVar = this.f3357k;
        this.i.setShowLineSeparators(S.n(this.f3356j, this.f3354g, dVar));
        return C1992A.f18074a;
    }
}
