package K6;

import H6.C0672i;
import H6.C0675l;
import K6.C0713c;
import L0.ViewTreeObserverOnPreDrawListenerC0791w;
import N7.AbstractC1293o4;
import N7.C1325q8;
import N7.C1362t4;
import N7.EnumC1195h5;
import N7.H9;
import N7.L9;
import N7.S2;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import j6.C5195A;
import j6.g;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import w7.C5741a;
import w7.C5742b;
import x7.C5780b;
import z6.C5865d;
import z7.InterfaceC5868a;

/* compiled from: DivSliderBinder.kt */
/* loaded from: classes.dex */
public final class Z0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final g.a f3368c;

    /* renamed from: d, reason: collision with root package name */
    public final u6.a f3369d;

    /* renamed from: e, reason: collision with root package name */
    public final s6.g f3370e;

    /* renamed from: f, reason: collision with root package name */
    public final Q6.d f3371f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3372g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3373h;
    public Q6.c i;

    /* compiled from: DivSliderBinder.kt */
    public static final class a {

        /* compiled from: DivSliderBinder.kt */
        /* renamed from: K6.Z0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0056a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3374a;

            static {
                int[] iArr = new int[H9.values().length];
                try {
                    iArr[H9.DP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[H9.SP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[H9.PX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3374a = iArr;
            }
        }

        public static int a(long j4, H9 unit, DisplayMetrics metrics) {
            kotlin.jvm.internal.l.f(unit, "unit");
            kotlin.jvm.internal.l.f(metrics, "metrics");
            int i = C0056a.f3374a[unit.ordinal()];
            if (i == 1) {
                return C0713c.B(Long.valueOf(j4), metrics);
            }
            if (i == 2) {
                return C0713c.W(Long.valueOf(j4), metrics);
            }
            if (i != 3) {
                throw new b9.j();
            }
            long j10 = j4 >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) j4;
            }
            if (j4 > 0) {
                return Integer.MAX_VALUE;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }

        public static C5741a b(L9.b bVar, DisplayMetrics displayMetrics, u6.a typefaceProvider, A7.d resolver) {
            Number numberValueOf;
            kotlin.jvm.internal.l.f(bVar, "<this>");
            kotlin.jvm.internal.l.f(typefaceProvider, "typefaceProvider");
            kotlin.jvm.internal.l.f(resolver, "resolver");
            long jLongValue = bVar.f5818b.a(resolver).longValue();
            H9 unit = bVar.f5819c.a(resolver);
            kotlin.jvm.internal.l.f(unit, "unit");
            int i = C0713c.a.f3394a[unit.ordinal()];
            if (i == 1) {
                numberValueOf = Integer.valueOf(C0713c.B(Long.valueOf(jLongValue), displayMetrics));
            } else if (i == 2) {
                numberValueOf = Integer.valueOf(C0713c.W(Long.valueOf(jLongValue), displayMetrics));
            } else {
                if (i != 3) {
                    throw new b9.j();
                }
                numberValueOf = Long.valueOf(jLongValue);
            }
            float fFloatValue = numberValueOf.floatValue();
            EnumC1195h5 enumC1195h5A = bVar.f5821e.a(resolver);
            Integer numValueOf = null;
            A7.b<Long> bVar2 = bVar.f5822f;
            Long lA = bVar2 != null ? bVar2.a(resolver) : null;
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                long j4 = jLongValue2 >> 31;
                numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue2 : jLongValue2 > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
            }
            Typeface typefaceO = C0713c.O(C0713c.P(enumC1195h5A, numValueOf), typefaceProvider);
            C1325q8 c1325q8 = bVar.f5823g;
            return new C5741a(fFloatValue, typefaceO, c1325q8 != null ? C0713c.g0(c1325q8.f8992a, displayMetrics, resolver) : 0.0f, c1325q8 != null ? C0713c.g0(c1325q8.f8993b, displayMetrics, resolver) : 0.0f, bVar.f5824h.a(resolver).intValue());
        }
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O6.y f3375b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Z0 f3376c;

        public b(O6.y yVar, O6.y yVar2, Z0 z02) {
            this.f3375b = yVar2;
            this.f3376c = z02;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Z0 z02;
            Q6.c cVar;
            Q6.c cVar2;
            O6.y yVar = this.f3375b;
            if (yVar.getActiveTickMarkDrawable() == null && yVar.getInactiveTickMarkDrawable() == null) {
                return;
            }
            float maxValue = yVar.getMaxValue() - yVar.getMinValue();
            Drawable activeTickMarkDrawable = yVar.getActiveTickMarkDrawable();
            boolean z10 = false;
            int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
            if (Math.max(intrinsicWidth, yVar.getInactiveTickMarkDrawable() != null ? r4.getIntrinsicWidth() : 0) * maxValue <= yVar.getWidth() || (cVar = (z02 = this.f3376c).i) == null) {
                return;
            }
            ListIterator listIterator = cVar.f11320d.listIterator();
            while (listIterator.hasNext()) {
                if (kotlin.jvm.internal.l.b(((Throwable) listIterator.next()).getMessage(), "Slider ticks overlap each other.")) {
                    z10 = true;
                }
            }
            if (z10 || (cVar2 = z02.i) == null) {
                return;
            }
            cVar2.f11320d.add(new Throwable("Slider ticks overlap each other."));
            cVar2.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(D d10, g.a logger, u6.a typefaceProvider, s6.g gVar, Q6.d dVar, float f10, boolean z10) {
        super(d10);
        kotlin.jvm.internal.l.f(logger, "logger");
        kotlin.jvm.internal.l.f(typefaceProvider, "typefaceProvider");
        this.f3368c = logger;
        this.f3369d = typefaceProvider;
        this.f3370e = gVar;
        this.f3371f = dVar;
        this.f3372g = f10;
        this.f3373h = z10;
    }

    @Override // H6.B
    public final void e(View view, C0672i c0672i, S2 s22, S2 s23, C5865d path) {
        AbstractC1293o4 abstractC1293o4;
        C1992A c1992a;
        Drawable drawableB0;
        C1362t4 c1362t4;
        A7.d dVar;
        A7.d dVar2;
        Z0 z02 = this;
        O6.y yVar = (O6.y) view;
        L9 l92 = (L9) s22;
        kotlin.jvm.internal.l.f(yVar, "<this>");
        kotlin.jvm.internal.l.f(path, "path");
        C0675l c0675l = c0672i.f2146a;
        z02.i = z02.f3371f.a(c0675l.getDivData(), c0675l.getDataTag());
        yVar.setInterceptionAngle(z02.f3372g);
        L l5 = new L(1, yVar, z02);
        A7.b<Long> bVar = l92.f5799s;
        A7.d dVar3 = c0672i.f2147b;
        yVar.b(bVar.e(dVar3, l5));
        J j4 = new J(1, yVar, z02);
        A7.b<Long> bVar2 = l92.f5798r;
        yVar.b(bVar2.e(dVar3, j4));
        yVar.b(l92.f5795o.e(dVar3, new C9.r(yVar, 5)));
        C5195A<C5742b.c> c5195a = yVar.f47511c;
        c5195a.getClass();
        int i = c5195a.f42977c;
        ArrayList arrayList = c5195a.f42976b;
        Drawable drawableB02 = null;
        if (i == 0) {
            arrayList.clear();
        } else {
            int size = arrayList.size();
            c5195a.f42978d |= size != 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.set(i10, null);
            }
        }
        s6.g gVar = z02.f3370e;
        String str = l92.f5764E;
        if (str != null) {
            yVar.b(gVar.a(c0672i, str, new C0727g1(yVar, z02, c0672i), path));
        }
        AbstractC1293o4 abstractC1293o42 = l92.f5762C;
        DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        yVar.setThumbDrawable(C0713c.b0(abstractC1293o42, displayMetrics, dVar3));
        C6.g.b(yVar, abstractC1293o42, dVar3, new C0748o0((Object) z02, (Object) yVar, dVar3, (Object) abstractC1293o42, 3));
        L9.b bVar3 = l92.f5763D;
        z02.n(yVar, dVar3, bVar3);
        if (bVar3 != null) {
            yVar.b(bVar3.f5824h.d(dVar3, new C0721e1(z02, yVar, dVar3, bVar3)));
        }
        String str2 = l92.f5761B;
        if (str2 == null) {
            yVar.setThumbSecondaryDrawable(null);
            yVar.v(null, false, true);
        } else {
            yVar.b(gVar.a(c0672i, str2, new C0718d1(yVar, z02, c0672i), path));
            AbstractC1293o4 abstractC1293o43 = l92.f5806z;
            if (abstractC1293o43 != null) {
                DisplayMetrics displayMetrics2 = yVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
                yVar.setThumbSecondaryDrawable(C0713c.b0(abstractC1293o43, displayMetrics2, dVar3));
                abstractC1293o4 = abstractC1293o42;
                C6.g.b(yVar, abstractC1293o43, dVar3, new C0709a1(z02, yVar, dVar3, abstractC1293o43, 0));
                c1992a = C1992A.f18074a;
            } else {
                abstractC1293o4 = abstractC1293o42;
                c1992a = null;
            }
            if (c1992a == null) {
                DisplayMetrics displayMetrics3 = yVar.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics3, "resources.displayMetrics");
                yVar.setThumbSecondaryDrawable(C0713c.b0(abstractC1293o4, displayMetrics3, dVar3));
                z02 = this;
                AbstractC1293o4 abstractC1293o44 = abstractC1293o4;
                C6.g.b(yVar, abstractC1293o44, dVar3, new C0709a1(z02, yVar, dVar3, abstractC1293o44, 0));
            } else {
                z02 = this;
            }
            L9.b bVar4 = l92.f5760A;
            z02.m(yVar, dVar3, bVar4);
            if (bVar4 != null) {
                yVar.b(bVar4.f5824h.d(dVar3, new C0712b1(z02, yVar, dVar3, bVar4)));
            }
        }
        AbstractC1293o4 abstractC1293o45 = l92.f5768I;
        DisplayMetrics displayMetrics4 = yVar.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics4, "resources.displayMetrics");
        yVar.setActiveTrackDrawable(C0713c.b0(abstractC1293o45, displayMetrics4, dVar3));
        C6.g.b(yVar, abstractC1293o45, dVar3, new L0(z02, yVar, dVar3, abstractC1293o45));
        AbstractC1293o4 abstractC1293o46 = l92.f5769J;
        DisplayMetrics displayMetrics5 = yVar.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics5, "resources.displayMetrics");
        yVar.setInactiveTrackDrawable(C0713c.b0(abstractC1293o46, displayMetrics5, dVar3));
        C6.g.b(yVar, abstractC1293o46, dVar3, new C0709a1(z02, yVar, dVar3, abstractC1293o46, 1));
        AbstractC1293o4 abstractC1293o47 = l92.f5765F;
        if (abstractC1293o47 != null) {
            DisplayMetrics displayMetrics6 = yVar.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics6, "resources.displayMetrics");
            drawableB0 = C0713c.b0(abstractC1293o47, displayMetrics6, dVar3);
        } else {
            drawableB0 = null;
        }
        yVar.setActiveTickMarkDrawable(drawableB0);
        z02.o(yVar);
        C6.g.b(yVar, abstractC1293o47, dVar3, new C0753r0(z02, yVar, dVar3, abstractC1293o47));
        AbstractC1293o4 abstractC1293o48 = l92.f5766G;
        if (abstractC1293o48 != null) {
            DisplayMetrics displayMetrics7 = yVar.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics7, "resources.displayMetrics");
            drawableB02 = C0713c.b0(abstractC1293o48, displayMetrics7, dVar3);
        }
        yVar.setInactiveTickMarkDrawable(drawableB02);
        z02.o(yVar);
        C6.g.b(yVar, abstractC1293o48, dVar3, new E((H6.B) z02, (View) yVar, dVar3, (InterfaceC5868a) abstractC1293o48, 3));
        yVar.getRanges().clear();
        List<L9.a> list = l92.f5801u;
        if (list == null) {
            return;
        }
        DisplayMetrics displayMetrics8 = yVar.getResources().getDisplayMetrics();
        for (L9.a aVar : list) {
            C5742b.d dVar4 = new C5742b.d();
            yVar.getRanges().add(dVar4);
            A7.b<Long> bVar5 = aVar.f5809c;
            if (bVar5 == null) {
                bVar5 = bVar;
            }
            yVar.b(bVar5.e(dVar3, new C0730h1(yVar, dVar4)));
            A7.b<Long> bVar6 = aVar.f5807a;
            if (bVar6 == null) {
                bVar6 = bVar2;
            }
            yVar.b(bVar6.e(dVar3, new C0733i1(yVar, dVar4)));
            A7.d dVar5 = dVar3;
            C1362t4 c1362t42 = aVar.f5808b;
            if (c1362t42 == null) {
                dVar4.f47541c = 0;
                dVar4.f47542d = 0;
                dVar2 = dVar5;
            } else {
                A7.b<Long> bVar7 = c1362t42.f9217b;
                A7.b<Long> bVar8 = c1362t42.f9220e;
                boolean z10 = (bVar8 == null && bVar7 == null) ? false : true;
                if (!z10) {
                    bVar8 = c1362t42.f9218c;
                }
                if (!z10) {
                    bVar7 = c1362t42.f9219d;
                }
                A7.b<Long> bVar9 = bVar7;
                if (bVar8 != null) {
                    O6.y yVar2 = yVar;
                    DisplayMetrics displayMetrics9 = displayMetrics8;
                    C0736j1 c0736j1 = new C0736j1(yVar2, dVar4, c1362t42, dVar5, displayMetrics9);
                    dVar4 = dVar4;
                    yVar = yVar2;
                    c1362t4 = c1362t42;
                    dVar = dVar5;
                    displayMetrics8 = displayMetrics9;
                    yVar.b(bVar8.d(dVar, c0736j1));
                } else {
                    c1362t4 = c1362t42;
                    dVar = dVar5;
                }
                if (bVar9 != null) {
                    A7.d dVar6 = dVar;
                    C1362t4 c1362t43 = c1362t4;
                    O6.y yVar3 = yVar;
                    C5742b.d dVar7 = dVar4;
                    DisplayMetrics displayMetrics10 = displayMetrics8;
                    C0739k1 c0739k1 = new C0739k1(yVar3, dVar7, c1362t43, dVar6, displayMetrics10);
                    dVar4 = dVar7;
                    yVar = yVar3;
                    c1362t4 = c1362t43;
                    dVar = dVar6;
                    displayMetrics8 = displayMetrics10;
                    yVar.b(bVar9.d(dVar, c0739k1));
                }
                DisplayMetrics displayMetrics11 = displayMetrics8;
                C5742b.d dVar8 = dVar4;
                C1362t4 c1362t44 = c1362t4;
                O6.y yVar4 = yVar;
                A7.d dVar9 = dVar;
                C0742l1 c0742l1 = new C0742l1(yVar4, bVar8, bVar9, dVar8, dVar9, displayMetrics11);
                yVar = yVar4;
                dVar2 = dVar9;
                dVar4 = dVar8;
                displayMetrics8 = displayMetrics11;
                c1362t44.f9222g.e(dVar2, c0742l1);
            }
            AbstractC1293o4 abstractC1293o49 = aVar.f5810d;
            if (abstractC1293o49 == null) {
                abstractC1293o49 = abstractC1293o45;
            }
            O6.y yVar5 = yVar;
            C5742b.d dVar10 = dVar4;
            A7.d dVar11 = dVar2;
            AbstractC1293o4 abstractC1293o410 = abstractC1293o49;
            m1 m1Var = new m1(yVar5, dVar10, abstractC1293o410, displayMetrics8, dVar11);
            C1992A c1992a2 = C1992A.f18074a;
            m1Var.invoke(c1992a2);
            C6.g.b(yVar5, abstractC1293o410, dVar11, m1Var);
            AbstractC1293o4 abstractC1293o411 = aVar.f5811e;
            if (abstractC1293o411 == null) {
                abstractC1293o411 = abstractC1293o46;
            }
            AbstractC1293o4 abstractC1293o412 = abstractC1293o411;
            n1 n1Var = new n1(yVar5, dVar10, abstractC1293o412, displayMetrics8, dVar11);
            yVar = yVar5;
            dVar3 = dVar11;
            n1Var.invoke(c1992a2);
            C6.g.b(yVar, abstractC1293o412, dVar3, n1Var);
        }
    }

    public final void m(C5742b c5742b, A7.d dVar, L9.b bVar) {
        C5780b c5780b;
        if (bVar != null) {
            DisplayMetrics displayMetrics = c5742b.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            c5780b = new C5780b(a.b(bVar, displayMetrics, this.f3369d, dVar));
        } else {
            c5780b = null;
        }
        c5742b.setThumbSecondTextDrawable(c5780b);
    }

    public final void n(C5742b c5742b, A7.d dVar, L9.b bVar) {
        C5780b c5780b;
        if (bVar != null) {
            DisplayMetrics displayMetrics = c5742b.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            c5780b = new C5780b(a.b(bVar, displayMetrics, this.f3369d, dVar));
        } else {
            c5780b = null;
        }
        c5742b.setThumbTextDrawable(c5780b);
    }

    public final void o(O6.y yVar) {
        if (!this.f3373h || this.i == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC0791w.a(yVar, new b(yVar, yVar, this));
    }
}
