package H6;

import H6.L;
import K6.C0738k0;
import K6.C0741l0;
import K6.C0744m0;
import K6.C0752q0;
import N7.B9;
import N7.C1179g4;
import N7.C1363t5;
import N7.C1370tc;
import N7.C1447z5;
import N7.Z;
import android.net.Uri;
import android.view.View;
import b9.C1992A;
import c9.C2099t;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import z7.InterfaceC5868a;

/* compiled from: SightActionIsEnabledObserver.kt */
/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2121g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2122h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2123j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2124k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5868a f2125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2126m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(V v10, C0675l c0675l, A7.d dVar, View view, Z z10, B9 b92) {
        super(1);
        this.f2123j = v10;
        this.f2122h = c0675l;
        this.i = dVar;
        this.f2124k = view;
        this.f2125l = z10;
        this.f2126m = b92;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f2121g) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                B9 b92 = (B9) this.f2126m;
                V v10 = (V) this.f2123j;
                if (zBooleanValue) {
                    L.b bVar = v10.f2114a;
                    Z div = (Z) this.f2125l;
                    C0675l scope = (C0675l) this.f2122h;
                    A7.d dVar = this.i;
                    View view = (View) this.f2124k;
                    bVar.getClass();
                    A7.d resolver = dVar;
                    B9 b93 = b92;
                    kotlin.jvm.internal.l.f(scope, "scope");
                    kotlin.jvm.internal.l.f(resolver, "resolver");
                    kotlin.jvm.internal.l.f(view, "view");
                    kotlin.jvm.internal.l.f(div, "div");
                    boolean z10 = b93 instanceof C1370tc;
                    C2099t c2099t = C2099t.f18581b;
                    if (z10) {
                        L.this.h(scope, resolver, view, div, E.u.G(b93), c2099t);
                    } else if (b93 instanceof C1179g4) {
                        L.this.h(scope, resolver, view, div, c2099t, E.u.G(b93));
                    }
                    C1992A c1992a = C1992A.f18074a;
                } else {
                    L.c cVar = v10.f2115b;
                    Z z11 = (Z) this.f2125l;
                    C0675l scope2 = (C0675l) this.f2122h;
                    A7.d dVar2 = this.i;
                    View view2 = (View) this.f2124k;
                    cVar.getClass();
                    A7.d resolver2 = dVar2;
                    B9 b94 = b92;
                    kotlin.jvm.internal.l.f(scope2, "scope");
                    kotlin.jvm.internal.l.f(resolver2, "resolver");
                    kotlin.jvm.internal.l.f(view2, "<anonymous parameter 2>");
                    kotlin.jvm.internal.l.f(z11, "<anonymous parameter 3>");
                    boolean z12 = b94 instanceof C1370tc;
                    L l5 = L.this;
                    if (z12) {
                        l5.c(scope2, resolver2, null, b94, 0, l5.f2067d);
                    } else if (b94 instanceof C1179g4) {
                        l5.c(scope2, resolver2, null, b94, 0, l5.f2068e);
                    }
                    C1992A c1992a2 = C1992A.f18074a;
                }
                break;
            case 1:
                Uri it = (Uri) obj;
                kotlin.jvm.internal.l.f(it, "it");
                C0738k0 c0738k0 = (C0738k0) this.f2123j;
                c0738k0.getClass();
                C1363t5 c1363t5 = (C1363t5) this.f2125l;
                A7.b<Uri> bVar2 = c1363t5.f9269u;
                A7.d dVar3 = this.i;
                Uri uriA = bVar2.a(dVar3);
                O6.j jVar = (O6.j) this.f2124k;
                if (!kotlin.jvm.internal.l.b(uriA, jVar.getGifUrl$div_release())) {
                    jVar.setTag(R.id.image_loaded_flag, null);
                    jVar.f10426r = null;
                    w6.e loadReference$div_release = jVar.getLoadReference$div_release();
                    if (loadReference$div_release != null) {
                        loadReference$div_release.cancel();
                    }
                    A7.b<String> bVar3 = c1363t5.f9232H;
                    String strA = bVar3 != null ? bVar3.a(dVar3) : null;
                    c0738k0.f3510d.a(jVar, (Q6.c) this.f2126m, strA, c1363t5.f9228D.a(dVar3).intValue(), false, new C0680q(jVar, 3), new C0741l0(jVar));
                    jVar.setGifUrl$div_release(uriA);
                    String string = uriA.toString();
                    C0675l c0675l = (C0675l) this.f2122h;
                    w6.e eVarLoadImageBytes = c0738k0.f3509c.loadImageBytes(string, new C0744m0(c0675l, c0738k0, jVar));
                    c0675l.l(eVarLoadImageBytes, jVar);
                    jVar.setLoadReference$div_release(eVarLoadImageBytes);
                }
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                O6.n nVar = (O6.n) this.f2123j;
                if (!nVar.m()) {
                    C1447z5 c1447z5 = (C1447z5) this.f2125l;
                    C0752q0 c0752q0 = (C0752q0) this.f2122h;
                    c0752q0.getClass();
                    c0752q0.p(nVar, (C0672i) this.f2124k, c1447z5, C0752q0.r(this.i, nVar, c1447z5), (Q6.c) this.f2126m);
                }
                break;
        }
        return C1992A.f18074a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C0738k0 c0738k0, O6.j jVar, C0675l c0675l, A7.d dVar, C1363t5 c1363t5, Q6.c cVar) {
        super(1);
        this.f2123j = c0738k0;
        this.f2124k = jVar;
        this.f2122h = c0675l;
        this.i = dVar;
        this.f2125l = c1363t5;
        this.f2126m = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(O6.n nVar, C0752q0 c0752q0, C0672i c0672i, C1447z5 c1447z5, A7.d dVar, Q6.c cVar) {
        super(1);
        this.f2123j = nVar;
        this.f2122h = c0752q0;
        this.f2124k = c0672i;
        this.f2125l = c1447z5;
        this.i = dVar;
        this.f2126m = cVar;
    }
}
