package i0;

import Y0.t;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;
import mh.InterfaceC6835l;
import o0.C7034a;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6051a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final Y0.d f48755a;

    /* renamed from: b, reason: collision with root package name */
    private final long f48756b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f48757c;

    public /* synthetic */ C6051a(Y0.d dVar, long j10, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, interfaceC6835l);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        C7034a c7034a = new C7034a();
        Y0.d dVar = this.f48755a;
        long j10 = this.f48756b;
        t tVar = t.Ltr;
        InterfaceC6717n0 interfaceC6717n0B = AbstractC6670H.b(canvas);
        InterfaceC6835l interfaceC6835l = this.f48757c;
        C7034a.C1996a c1996aB = c7034a.B();
        Y0.d dVarA = c1996aB.a();
        t tVarB = c1996aB.b();
        InterfaceC6717n0 interfaceC6717n0C = c1996aB.c();
        long jD = c1996aB.d();
        C7034a.C1996a c1996aB2 = c7034a.B();
        c1996aB2.j(dVar);
        c1996aB2.k(tVar);
        c1996aB2.i(interfaceC6717n0B);
        c1996aB2.l(j10);
        interfaceC6717n0B.j();
        interfaceC6835l.invoke(c7034a);
        interfaceC6717n0B.r();
        C7034a.C1996a c1996aB3 = c7034a.B();
        c1996aB3.j(dVarA);
        c1996aB3.k(tVarB);
        c1996aB3.i(interfaceC6717n0C);
        c1996aB3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        Y0.d dVar = this.f48755a;
        point.set(dVar.x1(dVar.N0(C6537m.i(this.f48756b))), dVar.x1(dVar.N0(C6537m.g(this.f48756b))));
        point2.set(point.x / 2, point.y / 2);
    }

    private C6051a(Y0.d dVar, long j10, InterfaceC6835l interfaceC6835l) {
        this.f48755a = dVar;
        this.f48756b = j10;
        this.f48757c = interfaceC6835l;
    }
}
