package N6;

import N7.Ba;
import O6.C;
import b9.C1992A;
import y7.t;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f4731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C f4732h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ba.c f4733j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, C c10, A7.d dVar2, Ba.c cVar) {
        super(1);
        this.f4731g = dVar;
        this.f4732h = c10;
        this.i = dVar2;
        this.f4733j = cVar;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        t<?> titleLayout = this.f4732h.getTitleLayout();
        Ba.c cVar = this.f4733j;
        if (cVar == null) {
            cVar = d.f4698q;
        }
        this.f4731g.getClass();
        d.n(titleLayout, this.i, cVar);
        return C1992A.f18074a;
    }
}
