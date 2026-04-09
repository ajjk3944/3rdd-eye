package K6;

import H6.C0672i;
import H6.C0683u;
import N7.C1332r2;
import N7.C1405w5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.S2;
import Q9.C1553s;
import a9.InterfaceC1676a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import r7.C5533d;

/* compiled from: DivGridBinder.kt */
/* renamed from: K6.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750p0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D f3573c;

    /* renamed from: d, reason: collision with root package name */
    public final H7.e f3574d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1676a<C0683u> f3575e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1676a<H6.H> f3576f;

    public C0750p0(D d10, H7.e eVar, InterfaceC1676a<C0683u> interfaceC1676a, InterfaceC1676a<H6.H> interfaceC1676a2) {
        super(d10);
        this.f3573c = d10;
        this.f3574d = eVar;
        this.f3575e = interfaceC1676a;
        this.f3576f = interfaceC1676a2;
    }

    public static void m(A7.d dVar, S2 s22, View view) {
        double d10;
        int i;
        A7.b<Long> bVarG = s22.g();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        int i10 = RecyclerView.UNDEFINED_DURATION;
        if (c5533d == null) {
            d10 = 0.0d;
        } else {
            if (bVarG != null) {
                d10 = 0.0d;
                long jLongValue = bVarG.a(dVar).longValue();
                long j4 = jLongValue >> 31;
                i = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                d10 = 0.0d;
                i = 1;
            }
            if (c5533d.a() != i) {
                w9.i<Object> property = C5533d.i[0];
                Number numberValueOf = Integer.valueOf(i);
                C1553s c1553s = c5533d.f45762e;
                c1553s.getClass();
                kotlin.jvm.internal.l.f(property, "property");
                if (numberValueOf.doubleValue() <= d10) {
                    numberValueOf = (Number) c1553s.f11528c;
                }
                c1553s.f11527b = numberValueOf;
                view.requestLayout();
            }
        }
        A7.b<Long> bVarK = s22.k();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        C5533d c5533d2 = layoutParams2 instanceof C5533d ? (C5533d) layoutParams2 : null;
        if (c5533d2 == null) {
            return;
        }
        if (bVarK != null) {
            long jLongValue2 = bVarK.a(dVar).longValue();
            long j10 = jLongValue2 >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue2;
            } else if (jLongValue2 > 0) {
                i10 = Integer.MAX_VALUE;
            }
        } else {
            i10 = 1;
        }
        if (c5533d2.c() != i10) {
            w9.i<Object> property2 = C5533d.i[1];
            Number numberValueOf2 = Integer.valueOf(i10);
            C1553s c1553s2 = c5533d2.f45763f;
            c1553s2.getClass();
            kotlin.jvm.internal.l.f(property2, "property");
            if (numberValueOf2.doubleValue() <= d10) {
                numberValueOf2 = (Number) c1553s2.f11528c;
            }
            c1553s2.f11527b = numberValueOf2;
            view.requestLayout();
        }
    }

    @Override // H6.B
    public final void d(View view, C0672i c0672i, S2 s22, S2 s23) {
        O6.k kVar = (O6.k) view;
        C1405w5 c1405w5 = (C1405w5) s22;
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kVar.setReleaseViewVisitor$div_release(c0672i.f2146a.getReleaseViewVisitor$div_release());
        C1332r2 c1332r2 = c1405w5.f9698c;
        C0713c.d(kVar, c0672i, c1405w5.f9697b, c1405w5.f9699d, c1405w5.f9674A, c1405w5.f9711q, c1405w5.f9717w, c1405w5.f9716v, c1405w5.f9678E, c1405w5.f9677D, c1332r2, c1405w5.f9696a, c1405w5.f9705k);
        C9.r rVar = new C9.r(kVar, 3);
        A7.b<Long> bVar = c1405w5.f9706l;
        A7.d dVar = c0672i.f2147b;
        kVar.b(bVar.e(dVar, rVar));
        A7.b<EnumC1305p2> bVar2 = c1405w5.f9708n;
        EnumC1305p2 enumC1305p2A = bVar2.a(dVar);
        A7.b<EnumC1319q2> bVar3 = c1405w5.f9709o;
        kVar.setGravity(C0713c.F(enumC1305p2A, bVar3.a(dVar)));
        C0748o0 c0748o0 = new C0748o0(kVar, bVar2, dVar, bVar3, 0);
        kVar.b(bVar2.d(dVar, c0748o0));
        kVar.b(bVar3.d(dVar, c0748o0));
    }
}
