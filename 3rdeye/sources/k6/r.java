package K6;

import H6.C0672i;
import H6.C0675l;
import K6.C0745n;
import N7.C1175g0;
import android.view.View;
import b9.C1992A;
import p9.InterfaceC5480a;
import v7.C5683a;

/* compiled from: DivActionBinder.kt */
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0745n f3612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0672i f3613h;
    public final /* synthetic */ View i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1175g0 f3614j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.b<Boolean> f3615k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C5683a f3616l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0745n c0745n, C0672i c0672i, View view, C1175g0 c1175g0, A7.b<Boolean> bVar, C5683a c5683a) {
        super(0);
        this.f3612g = c0745n;
        this.f3613h = c0672i;
        this.i = view;
        this.f3614j = c1175g0;
        this.f3615k = bVar;
        this.f3616l = c5683a;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        C0745n c0745n = this.f3612g;
        C0672i c0672i = this.f3613h;
        C0675l c0675l = c0672i.f2146a;
        C1175g0 c1175g0 = this.f3614j;
        c0745n.f3537b.getClass();
        C0719e c0719e = c0745n.f3538c;
        A7.d dVar = c0672i.f2147b;
        c0719e.b(c1175g0, dVar);
        T6.b inputFocusTracker$div_release = c0672i.f2146a.getInputFocusTracker$div_release();
        A7.b<Boolean> bVar = this.f3615k;
        View view = this.i;
        A9.I.a(view, bVar, inputFocusTracker$div_release, dVar);
        C5683a c5683a = this.f3616l;
        o.M m10 = new o.M(view.getContext(), view, 83);
        C0745n.a aVar = c5683a.f47061c;
        if (aVar != null) {
            aVar.T(m10);
        }
        m10.f44571c.d();
        return C1992A.f18074a;
    }
}
