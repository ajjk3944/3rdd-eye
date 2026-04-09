package H6;

import N7.Z;
import android.view.View;

/* compiled from: DivVisibilityActionTracker.kt */
/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements p9.p<View, Z, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L f2089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f2090h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(L l5, C0672i c0672i) {
        super(2);
        this.f2089g = l5;
        this.f2090h = c0672i;
    }

    @Override // p9.p
    public final Boolean invoke(View view, Z z10) {
        View currentView = view;
        Z z11 = z10;
        kotlin.jvm.internal.l.f(currentView, "currentView");
        L l5 = this.f2089g;
        l5.i.remove(currentView);
        if (z11 != null) {
            C0672i c0672i = this.f2090h;
            L.j(l5, c0672i.f2146a, c0672i.f2147b, null, z11);
        }
        return Boolean.TRUE;
    }
}
