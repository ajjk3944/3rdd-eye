package K6;

import H6.C0672i;
import H6.C0675l;
import android.view.View;
import b9.C1992A;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754s extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3623h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3624j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3625k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3626l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0754s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.f3622g = i;
        this.f3623h = obj;
        this.i = obj2;
        this.f3624j = obj3;
        this.f3625k = obj4;
        this.f3626l = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f3622g) {
            case 0:
                C0672i c0672i = (C0672i) this.f3624j;
                T6.b inputFocusTracker$div_release = c0672i.f2146a.getInputFocusTracker$div_release();
                A7.d dVar = c0672i.f2147b;
                View view = (View) this.f3623h;
                A9.I.a(view, (A7.b) this.i, inputFocusTracker$div_release, dVar);
                ((C0745n) this.f3625k).e(c0672i, view, this.f3626l, "double_click");
                break;
            default:
                v1 v1Var = (v1) this.f3623h;
                O6.A a10 = (O6.A) this.f3626l;
                C0675l c0675l = (C0675l) this.i;
                A7.d dVar2 = (A7.d) this.f3624j;
                L l5 = new L(v1Var, c0675l, dVar2, a10);
                v1Var.f3664h.d(c0675l, dVar2, (List) this.f3625k, "state_swipe_out", l5);
                break;
        }
        return C1992A.f18074a;
    }
}
