package K6;

import H6.C0675l;
import N7.C1130d0;
import N7.S2;
import android.view.View;
import b9.C1992A;

/* compiled from: DivBaseBinder.kt */
/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements p9.l<C1130d0.a, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f3214g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f3215h;
    public final /* synthetic */ C0675l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3216j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3217k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(D d10, View view, C0675l c0675l, S2 s22, A7.d dVar) {
        super(1);
        this.f3214g = d10;
        this.f3215h = view;
        this.i = c0675l;
        this.f3216j = s22;
        this.f3217k = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [N7.S2, java.lang.Object] */
    @Override // p9.l
    public final C1992A invoke(C1130d0.a aVar) {
        C1130d0.b bVar;
        C1130d0.a mode = aVar;
        kotlin.jvm.internal.l.f(mode, "mode");
        ?? r02 = this.f3216j;
        D d10 = this.f3214g;
        View view = this.f3215h;
        d10.a(view, this.i, r02, mode);
        C1130d0 c1130d0F = r02.f();
        if (c1130d0F == null || (bVar = c1130d0F.f8042g) == null) {
            bVar = C1130d0.b.AUTO;
        }
        if (bVar == C1130d0.b.AUTO) {
            d10.f3198c.c(view, r02, bVar, this.f3217k);
        }
        return C1992A.f18074a;
    }
}
