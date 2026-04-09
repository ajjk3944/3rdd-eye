package H6;

import N7.Z;
import android.view.View;
import r7.C5533d;
import z6.C5865d;

/* compiled from: Div2Builder.kt */
/* renamed from: H6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674k {

    /* renamed from: a, reason: collision with root package name */
    public final H f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final C0683u f2155b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.d f2156c;

    public C0674k(H viewCreator, C0683u viewBinder, p6.d dVar) {
        kotlin.jvm.internal.l.f(viewCreator, "viewCreator");
        kotlin.jvm.internal.l.f(viewBinder, "viewBinder");
        this.f2154a = viewCreator;
        this.f2155b = viewBinder;
        this.f2156c = dVar;
    }

    public final View a(C0672i context, Z z10, C5865d c5865d) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f2156c.b(z10, c5865d, context.f2146a);
        View viewO = this.f2154a.o(z10, context.f2147b);
        viewO.setLayoutParams(new C5533d(-1, -2));
        return viewO;
    }
}
