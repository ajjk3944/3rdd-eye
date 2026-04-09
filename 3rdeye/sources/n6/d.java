package N6;

import C9.r;
import D9.G;
import H6.B;
import H6.C0672i;
import H6.C0675l;
import H6.C0683u;
import H6.H;
import H6.I;
import H6.L;
import K6.A0;
import K6.C0713c;
import K6.C0745n;
import K6.D;
import N7.Ba;
import N7.C1362t4;
import N7.E3;
import N7.H9;
import N7.S2;
import N7.W4;
import O6.C;
import a9.InterfaceC1676a;
import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import j6.g;
import java.util.ArrayList;
import p7.InterfaceC5475g;
import w6.C5738b;
import y7.c;
import y7.e;
import y7.t;
import z6.C5865d;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class d extends B {

    /* renamed from: q, reason: collision with root package name */
    public static final Ba.c f4698q = new Ba.c(0);

    /* renamed from: c, reason: collision with root package name */
    public final D f4699c;

    /* renamed from: d, reason: collision with root package name */
    public final H f4700d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1676a<C0683u> f4701e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC5475g f4702f;

    /* renamed from: g, reason: collision with root package name */
    public final I f4703g;

    /* renamed from: h, reason: collision with root package name */
    public final C0745n f4704h;
    public final g.a i;

    /* renamed from: j, reason: collision with root package name */
    public final G f4705j;

    /* renamed from: k, reason: collision with root package name */
    public final L f4706k;

    /* renamed from: l, reason: collision with root package name */
    public final B7.b f4707l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f4708m;

    /* renamed from: n, reason: collision with root package name */
    public final p6.d f4709n;

    /* renamed from: o, reason: collision with root package name */
    public final F3.f f4710o;

    /* renamed from: p, reason: collision with root package name */
    public Long f4711p;

    /* compiled from: DivTabsBinder.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4712a;

        static {
            int[] iArr = new int[Ba.c.a.values().length];
            try {
                iArr[Ba.c.a.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ba.c.a.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ba.c.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4712a = iArr;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    public static final class b extends j6.o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<?> f4713a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4714b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4715c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t<?> tVar, int i, int i10, C0675l c0675l) {
            super(c0675l);
            this.f4713a = tVar;
            this.f4714b = i;
            this.f4715c = i10;
        }

        @Override // w6.C5739c
        public final void a() {
            this.f4713a.s(null, 0, 0);
        }

        @Override // w6.C5739c
        public final void b(PictureDrawable pictureDrawable) {
            this.f4713a.s(D0.b.a(pictureDrawable), this.f4714b, this.f4715c);
        }

        @Override // w6.C5739c
        public final void c(C5738b c5738b) {
            this.f4713a.s(c5738b.f47495a, this.f4714b, this.f4715c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D d10, H h10, InterfaceC1676a interfaceC1676a, InterfaceC5475g interfaceC5475g, I i, C0745n c0745n, g.a div2Logger, G imageLoader, L l5, B7.b bVar, Context context, p6.d dVar, F3.f fVar) {
        super(d10);
        kotlin.jvm.internal.l.f(div2Logger, "div2Logger");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f4699c = d10;
        this.f4700d = h10;
        this.f4701e = interfaceC1676a;
        this.f4702f = interfaceC5475g;
        this.f4703g = i;
        this.f4704h = c0745n;
        this.i = div2Logger;
        this.f4705j = imageLoader;
        this.f4706k = l5;
        this.f4707l = bVar;
        this.f4708m = context;
        this.f4709n = dVar;
        this.f4710o = fVar;
        interfaceC5475g.m("DIV2.TAB_HEADER_VIEW", new t.b(context), 12);
        interfaceC5475g.m("DIV2.TAB_ITEM_VIEW", new H6.G(this, 3), 2);
    }

    public static void n(t tVar, A7.d dVar, Ba.c cVar) {
        e.b bVar;
        A7.b<Long> bVar2;
        A7.b<Long> bVar3;
        A7.b<Long> bVar4;
        A7.b<Long> bVar5;
        int iIntValue = cVar.f4981d.a(dVar).intValue();
        int iIntValue2 = cVar.f4978a.a(dVar).intValue();
        int iIntValue3 = cVar.f4992p.a(dVar).intValue();
        A7.b<Integer> bVar6 = cVar.f4989m;
        int iIntValue4 = bVar6 != null ? bVar6.a(dVar).intValue() : 0;
        tVar.getClass();
        tVar.setTabTextColors(y7.e.k(iIntValue3, iIntValue));
        tVar.setSelectedTabIndicatorColor(iIntValue2);
        tVar.setTabBackgroundColor(iIntValue4);
        DisplayMetrics metrics = tVar.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(metrics, "metrics");
        A7.b<Long> bVar7 = cVar.f4984g;
        E3 e32 = cVar.f4985h;
        float fB = bVar7 != null ? C0713c.B(bVar7.a(dVar), metrics) : e32 == null ? -1.0f : 0.0f;
        float fB2 = (e32 == null || (bVar5 = e32.f5132c) == null) ? fB : C0713c.B(bVar5.a(dVar), metrics);
        float fB3 = (e32 == null || (bVar4 = e32.f5133d) == null) ? fB : C0713c.B(bVar4.a(dVar), metrics);
        float fB4 = (e32 == null || (bVar3 = e32.f5130a) == null) ? fB : C0713c.B(bVar3.a(dVar), metrics);
        if (e32 != null && (bVar2 = e32.f5131b) != null) {
            fB = C0713c.B(bVar2.a(dVar), metrics);
        }
        tVar.setTabIndicatorCornersRadii(new float[]{fB2, fB2, fB3, fB3, fB, fB, fB4, fB4});
        tVar.setTabItemSpacing(C0713c.B(cVar.f4993q.a(dVar), metrics));
        int i = a.f4712a[cVar.f4983f.a(dVar).ordinal()];
        if (i == 1) {
            bVar = e.b.SLIDE;
        } else if (i == 2) {
            bVar = e.b.FADE;
        } else {
            if (i != 3) {
                throw new b9.j();
            }
            bVar = e.b.NONE;
        }
        tVar.setAnimationType(bVar);
        tVar.setAnimationDuration(cVar.f4982e.a(dVar).longValue());
        tVar.setTabTitleStyle(cVar);
    }

    public static final void p(d dVar, C0672i c0672i, Ba ba2, C c10, C0683u c0683u, C5865d c5865d, ArrayList arrayList, int i) {
        o oVar = new o(c0672i, dVar.f4704h, dVar.i, dVar.f4706k, c10, ba2);
        boolean zBooleanValue = ba2.f4942j.a(c0672i.f2147b).booleanValue();
        y7.k iVar = zBooleanValue ? new B4.i(6) : new F3.h(7);
        int currentItem = c10.getViewPager().getCurrentItem();
        int currentItem2 = c10.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            Handler handler = o7.d.f44878a;
            o7.d.f44878a.post(new C8.a(new f(oVar, currentItem2)));
        }
        c cVar = new c(dVar.f4702f, c10, new c.h(), iVar, zBooleanValue, c0672i, dVar.f4703g, dVar.f4700d, c0683u, oVar, new N6.b(c0672i, c5865d, dVar.i, dVar.f4710o, dVar.f4709n, ba2), c5865d, dVar.f4707l);
        cVar.c(new B8.b(arrayList, 5), i);
        c10.setDivTabsAdapter(cVar);
    }

    @Override // H6.B
    public final /* bridge */ /* synthetic */ void d(View view, C0672i c0672i, S2 s22, S2 s23) {
        o((C) view, c0672i, (Ba) s22);
    }

    public final void m(t<?> tVar, A7.d dVar, Ba.b bVar, C0672i c0672i) {
        DisplayMetrics metrics = tVar.getResources().getDisplayMetrics();
        W4 w42 = bVar.f4965c;
        long jLongValue = w42.f7613b.a(dVar).longValue();
        H9 h9A = w42.f7612a.a(dVar);
        kotlin.jvm.internal.l.e(metrics, "metrics");
        int iF0 = C0713c.f0(jLongValue, h9A, metrics);
        W4 w43 = bVar.f4963a;
        int iF02 = C0713c.f0(w43.f7613b.a(dVar).longValue(), w43.f7612a.a(dVar), metrics);
        String string = bVar.f4964b.a(dVar).toString();
        C0675l c0675l = c0672i.f2146a;
        c0675l.l(this.f4705j.loadImage(string, new b(tVar, iF0, iF02, c0675l)), tVar);
    }

    public final void o(C c10, C0672i c0672i, Ba div) {
        C c11;
        C0672i c0672i2;
        A7.b<Long> bVar;
        A7.b<Ba.c.a> bVar2;
        A7.b<Long> bVar3;
        E3 e32;
        A7.b<Long> bVar4;
        E3 e33;
        A7.b<Long> bVar5;
        E3 e34;
        A7.b<Long> bVar6;
        E3 e35;
        A7.b<Long> bVar7;
        A7.b<Long> bVar8;
        A7.b<Integer> bVar9;
        A7.b<Integer> bVar10;
        A7.b<Integer> bVar11;
        A7.b<Integer> bVar12;
        C1362t4 c1362t4;
        A7.b<Long> bVar13;
        C1362t4 c1362t42;
        A7.b<Long> bVar14;
        A7.b<Long> bVar15;
        A7.b<Long> bVar16;
        kotlin.jvm.internal.l.f(c10, "<this>");
        kotlin.jvm.internal.l.f(div, "div");
        c10.setClipToPadding(false);
        A7.d dVar = c0672i.f2147b;
        K6.G g10 = new K6.G(c10, div, dVar, 2);
        g10.invoke(null);
        C1362t4 c1362t43 = div.f4919E;
        c10.b(c1362t43.f9218c.d(dVar, g10));
        c10.b(c1362t43.f9219d.d(dVar, g10));
        A7.b<Long> bVar17 = c1362t43.f9221f;
        c10.b(bVar17.d(dVar, g10));
        A7.b<Long> bVar18 = c1362t43.f9216a;
        c10.b(bVar18.d(dVar, g10));
        t<?> titleLayout = c10.getTitleLayout();
        h hVar = new h(div, dVar, titleLayout);
        hVar.invoke(null);
        i7.k kVarW = A2.l.w(titleLayout);
        Ba.c cVar = div.f4918D;
        kVarW.b((cVar == null || (bVar16 = cVar.f4995s) == null) ? null : bVar16.d(dVar, hVar));
        kVarW.b((cVar == null || (bVar15 = cVar.f4986j) == null) ? null : bVar15.d(dVar, hVar));
        kVarW.b((cVar == null || (c1362t42 = cVar.f4996t) == null || (bVar14 = c1362t42.f9221f) == null) ? null : bVar14.d(dVar, hVar));
        kVarW.b((cVar == null || (c1362t4 = cVar.f4996t) == null || (bVar13 = c1362t4.f9216a) == null) ? null : bVar13.d(dVar, hVar));
        kVarW.b(bVar17.d(dVar, hVar));
        kVarW.b(bVar18.d(dVar, hVar));
        n(c10.getTitleLayout(), dVar, cVar == null ? f4698q : cVar);
        i iVar = new i(this, c10, dVar, cVar);
        if (cVar != null && (bVar12 = cVar.f4981d) != null) {
            bVar12.d(dVar, iVar);
        }
        if (cVar != null && (bVar11 = cVar.f4978a) != null) {
            bVar11.d(dVar, iVar);
        }
        if (cVar != null && (bVar10 = cVar.f4992p) != null) {
            bVar10.d(dVar, iVar);
        }
        if (cVar != null && (bVar9 = cVar.f4989m) != null) {
            bVar9.d(dVar, iVar);
        }
        if (cVar != null && (bVar8 = cVar.f4984g) != null) {
            bVar8.d(dVar, iVar);
        }
        if (cVar != null && (e35 = cVar.f4985h) != null && (bVar7 = e35.f5132c) != null) {
            bVar7.d(dVar, iVar);
        }
        if (cVar != null && (e34 = cVar.f4985h) != null && (bVar6 = e34.f5133d) != null) {
            bVar6.d(dVar, iVar);
        }
        if (cVar != null && (e33 = cVar.f4985h) != null && (bVar5 = e33.f5131b) != null) {
            bVar5.d(dVar, iVar);
        }
        if (cVar != null && (e32 = cVar.f4985h) != null && (bVar4 = e32.f5130a) != null) {
            bVar4.d(dVar, iVar);
        }
        if (cVar != null && (bVar3 = cVar.f4993q) != null) {
            bVar3.d(dVar, iVar);
        }
        if (cVar != null && (bVar2 = cVar.f4983f) != null) {
            bVar2.d(dVar, iVar);
        }
        if (cVar != null && (bVar = cVar.f4982e) != null) {
            bVar.d(dVar, iVar);
        }
        Ba.b bVar19 = div.f4917C;
        if (bVar19 == null) {
            c11 = c10;
            c0672i2 = c0672i;
        } else {
            m(c10.getTitleLayout(), dVar, bVar19, c0672i);
            c11 = c10;
            c0672i2 = c0672i;
            g gVar = new g(this, c11, dVar, bVar19, c0672i2);
            W4 w42 = bVar19.f4965c;
            w42.f7613b.d(dVar, gVar);
            w42.f7612a.d(dVar, gVar);
            W4 w43 = bVar19.f4963a;
            w43.f7613b.d(dVar, gVar);
            w43.f7612a.d(dVar, gVar);
            bVar19.f4964b.d(dVar, gVar);
        }
        c11.getPagerLayout().setClipToPadding(false);
        A0 a02 = new A0(c11, div, dVar, 2);
        C1362t4 c1362t44 = div.f4915A;
        c11.b(c1362t44.f9218c.d(dVar, a02));
        c11.b(c1362t44.f9219d.d(dVar, a02));
        c11.b(c1362t44.f9221f.d(dVar, a02));
        c11.b(c1362t44.f9216a.d(dVar, a02));
        a02.invoke(null);
        c11.b(div.f4958z.e(dVar, new E7.a(c11, 5)));
        c11.b(div.f4946n.e(dVar, new F7.h(c11, 5)));
        c11.getTitleLayout().setOnScrollChangedListener(new B.d(this, c0672i2));
        c11.getTitleLayout().setFocusTracker(c0672i2.f2146a.getInputFocusTracker$div_release());
        c11.b(div.f4953u.e(dVar, new r(c11, 7)));
    }
}
