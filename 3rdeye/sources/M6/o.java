package M6;

import N7.AbstractC1393v7;
import N7.C1449z7;
import N7.C7;
import N7.EnumC1360t2;
import Q1.f;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DivPagerPageTransformer.kt */
/* loaded from: classes.dex */
public final class o implements f.g {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f4282b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<Float> f4283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4284d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1393v7 f4285e;

    /* renamed from: f, reason: collision with root package name */
    public final m f4286f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4287g;

    public o(RecyclerView recyclerView, A7.d resolver, SparseArray<Float> sparseArray, int i, AbstractC1393v7 abstractC1393v7, m mVar, boolean z10) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        this.f4281a = recyclerView;
        this.f4282b = resolver;
        this.f4283c = sparseArray;
        this.f4284d = i;
        this.f4285e = abstractC1393v7;
        this.f4286f = mVar;
        this.f4287g = z10;
    }

    public final void a(View view, float f10, A7.b<EnumC1360t2> bVar, A7.b<Double> bVar2, A7.b<Double> bVar3, A7.b<Double> bVar4, A7.b<Double> bVar5) {
        float f11 = f10 >= -1.0f ? f10 : -1.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float fAbs = Math.abs(f11);
        A7.d dVar = this.f4282b;
        float interpolation = 1 - C6.e.b(bVar.a(dVar)).getInterpolation(fAbs);
        if (f10 > 0.0f) {
            c(view, interpolation, bVar2.a(dVar).doubleValue());
            double dDoubleValue = bVar3.a(dVar).doubleValue();
            if (dDoubleValue == 1.0d) {
                return;
            }
            float fAbs2 = (float) ((Math.abs(dDoubleValue - 1.0d) * interpolation) + Math.min(1.0d, dDoubleValue));
            view.setScaleX(fAbs2);
            view.setScaleY(fAbs2);
            return;
        }
        c(view, interpolation, bVar4.a(dVar).doubleValue());
        double dDoubleValue2 = bVar5.a(dVar).doubleValue();
        if (dDoubleValue2 == 1.0d) {
            return;
        }
        float fAbs3 = (float) ((Math.abs(dDoubleValue2 - 1.0d) * interpolation) + Math.min(1.0d, dDoubleValue2));
        view.setScaleX(fAbs3);
        view.setScaleY(fAbs3);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[PHI: r16
  0x009f: PHI (r16v3 float) = (r16v2 float), (r16v8 float) binds: [B:28:0x008a, B:32:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[EDGE_INSN: B:50:0x00d9->B:131:0x01fb BREAK  A[LOOP:4: B:126:0x01e4->B:129:0x01ec]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3 A[EDGE_INSN: B:53:0x00e3->B:78:0x0137 BREAK  A[LOOP:3: B:69:0x011b->B:76:0x0133]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f A[EDGE_INSN: B:82:0x013f->B:111:0x01b2 BREAK  A[LOOP:2: B:103:0x0197->B:109:0x01ae]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r21, float r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.o.b(android.view.View, float, boolean):void");
    }

    public final void c(View view, float f10, double d10) {
        RecyclerView recyclerView = this.f4281a;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        C0795a c0795a = adapter instanceof C0795a ? (C0795a) adapter : null;
        if (c0795a == null) {
            return;
        }
        double dDoubleValue = ((i7.b) c0795a.f4227v.get(childAdapterPosition)).f38460a.d().y().a(this.f4282b).doubleValue();
        view.setAlpha((float) ((Math.abs(d10 - dDoubleValue) * f10) + Math.min(dDoubleValue, d10)));
    }

    @Override // Q1.f.g
    public final void transformPage(View view, float f10) {
        AbstractC1393v7 abstractC1393v7 = this.f4285e;
        Object objA = abstractC1393v7 != null ? abstractC1393v7.a() : null;
        if (objA instanceof C7) {
            C7 c72 = (C7) objA;
            a(view, f10, c72.f5035a, c72.f5036b, c72.f5037c, c72.f5038d, c72.f5039e);
            b(view, f10, false);
        } else {
            if (!(objA instanceof C1449z7)) {
                b(view, f10, false);
                return;
            }
            C1449z7 c1449z7 = (C1449z7) objA;
            a(view, f10, c1449z7.f10095a, c1449z7.f10096b, c1449z7.f10097c, c1449z7.f10098d, c1449z7.f10099e);
            if (f10 > 0.0f || (f10 < 0.0f && c1449z7.f10100f.a(this.f4282b).booleanValue())) {
                b(view, f10, false);
                view.setTranslationZ(0.0f);
            } else {
                b(view, f10, true);
                view.setTranslationZ(-Math.abs(f10));
            }
        }
    }
}
