package M6;

import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* compiled from: DivPagerBinder.kt */
/* renamed from: M6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797c extends kotlin.jvm.internal.m implements p9.l<Boolean, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.t f4234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w<RecyclerView.u> f4235h;
    public final /* synthetic */ RecyclerView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797c(O6.t tVar, kotlin.jvm.internal.w<RecyclerView.u> wVar, i iVar, RecyclerView recyclerView) {
        super(1);
        this.f4234g = tVar;
        this.f4235h = wVar;
        this.i = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [M6.g, T] */
    @Override // p9.l
    public final C1992A invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        O6.t tVar = this.f4234g;
        RecyclerView.h adapter = tVar.getViewPager().getAdapter();
        C0795a c0795a = adapter instanceof C0795a ? (C0795a) adapter : null;
        if (c0795a != null && c0795a.f4230y != zBooleanValue) {
            c0795a.f4230y = zBooleanValue;
            c0795a.notifyItemRangeChanged(0, c0795a.f4227v.c());
            O6.t tVar2 = c0795a.f4226u;
            tVar2.setCurrentItem$div_release(tVar2.getCurrentItem$div_release() + (zBooleanValue ? 2 : -2));
        }
        RecyclerView recyclerView = this.i;
        kotlin.jvm.internal.w<RecyclerView.u> wVar = this.f4235h;
        if (zBooleanValue) {
            RecyclerView.u uVar = wVar.f43660b;
            RecyclerView.u uVar2 = uVar;
            if (uVar == null) {
                ?? gVar = new g(tVar);
                wVar.f43660b = gVar;
                uVar2 = gVar;
            }
            recyclerView.addOnScrollListener(uVar2);
        } else {
            RecyclerView.u uVar3 = wVar.f43660b;
            if (uVar3 != null) {
                recyclerView.removeOnScrollListener(uVar3);
            }
        }
        return C1992A.f18074a;
    }
}
