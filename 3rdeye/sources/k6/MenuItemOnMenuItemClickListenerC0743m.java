package K6;

import H6.C0675l;
import K6.C0745n;
import N7.C1175g0;
import android.view.MenuItem;

/* compiled from: R8$$SyntheticClass */
/* renamed from: K6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC0743m implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f3525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1175g0.a f3526c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A7.d f3527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0745n f3528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3529f;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC0743m(C0675l c0675l, C1175g0.a aVar, A7.d dVar, C0745n c0745n, int i) {
        this.f3525b = c0675l;
        this.f3526c = aVar;
        this.f3527d = dVar;
        this.f3528e = c0745n;
        this.f3529f = i;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem it) {
        C0675l divView = this.f3525b;
        kotlin.jvm.internal.l.f(divView, "$divView");
        C1175g0.a aVar = this.f3526c;
        A7.d expressionResolver = this.f3527d;
        kotlin.jvm.internal.l.f(expressionResolver, "$expressionResolver");
        C0745n this$0 = this.f3528e;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
        divView.s(new C0745n.a.C0058a(aVar, expressionResolver, tVar, this$0, divView, this.f3529f));
        return tVar.f43657b;
    }
}
