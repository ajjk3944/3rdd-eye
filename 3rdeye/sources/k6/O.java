package K6;

import N7.C9;
import N7.S2;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f3291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3292h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f3293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(View view, S2 s22, A7.d dVar, D d10) {
        super(1);
        this.f3291g = view;
        this.f3292h = s22;
        this.i = dVar;
        this.f3293j = d10;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final C1992A invoke(Object it) {
        kotlin.jvm.internal.l.f(it, "it");
        ?? r52 = this.f3292h;
        View view = this.f3291g;
        A7.d dVar = this.i;
        C0713c.r(dVar, r52, view);
        C0713c.g(view, C0713c.Q(r52.getWidth(), dVar));
        C9 width = r52.getWidth();
        this.f3293j.getClass();
        C0713c.n(view, D.h(width), dVar);
        C0713c.l(view, D.g(r52.getWidth()), dVar);
        return C1992A.f18074a;
    }
}
