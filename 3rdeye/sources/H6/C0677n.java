package H6;

import N7.U3;
import android.view.View;
import b9.C1992A;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: Div2View.kt */
/* renamed from: H6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677n extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0675l f2212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f2213h;
    public final /* synthetic */ U3.a i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C5865d f2214j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677n(C0675l c0675l, View view, U3.a aVar, C5865d c5865d) {
        super(0);
        this.f2212g = c0675l;
        this.f2213h = view;
        this.i = aVar;
        this.f2214j = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        C0675l c0675l = this.f2212g;
        View view = this.f2213h;
        U3.a aVar = this.i;
        try {
            c0675l.getDiv2Component$div_release().v().b(c0675l.getBindingContext$div_release(), view, aVar.f6382a, this.f2214j);
        } catch (z7.d e4) {
            if (!com.google.gson.internal.c.a(e4)) {
                throw e4;
            }
        }
        c0675l.getDiv2Component$div_release().v().a();
        return C1992A.f18074a;
    }
}
