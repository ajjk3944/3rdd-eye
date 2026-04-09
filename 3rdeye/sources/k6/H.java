package K6;

import N7.C9;
import N7.S2;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f3225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3226h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f3227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(View view, S2 s22, A7.d dVar, D d10) {
        super(1);
        this.f3225g = view;
        this.f3226h = s22;
        this.i = dVar;
        this.f3227j = d10;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        ?? r52 = this.f3226h;
        View view = this.f3225g;
        A7.d dVar = this.i;
        C0713c.f(dVar, r52, view);
        C0713c.q(view, C0713c.Q(r52.getHeight(), dVar));
        C9 height = r52.getHeight();
        this.f3227j.getClass();
        C0713c.m(view, D.h(height), dVar);
        C0713c.k(view, D.g(r52.getHeight()), dVar);
        return C1992A.f18074a;
    }
}
