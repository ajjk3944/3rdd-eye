package K6;

import N7.C1431y3;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* renamed from: K6.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714c0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1431y3.c f3420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3421h;
    public final /* synthetic */ O6.r i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f3422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3423k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0714c0(C1431y3.c cVar, A7.d dVar, O6.r rVar, S s10, A7.d dVar2) {
        super(1);
        this.f3420g = cVar;
        this.f3421h = dVar;
        this.i = rVar;
        this.f3422j = s10;
        this.f3423k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        A7.d dVar = this.f3423k;
        this.i.setShowDividers(S.n(this.f3422j, this.f3420g, dVar));
        return C1992A.f18074a;
    }
}
