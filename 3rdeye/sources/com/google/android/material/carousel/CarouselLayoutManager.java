package com.google.android.material.carousel;

import A2.l;
import C0.d;
import S3.e;
import S3.f;
import S3.h;
import S3.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.carousel.b;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public int f22637A;

    /* renamed from: B, reason: collision with root package name */
    public int f22638B;

    /* renamed from: C, reason: collision with root package name */
    public final int f22639C;

    /* renamed from: p, reason: collision with root package name */
    public int f22640p;

    /* renamed from: q, reason: collision with root package name */
    public int f22641q;

    /* renamed from: r, reason: collision with root package name */
    public int f22642r;

    /* renamed from: s, reason: collision with root package name */
    public final b f22643s;

    /* renamed from: t, reason: collision with root package name */
    public final i f22644t;

    /* renamed from: u, reason: collision with root package name */
    public com.google.android.material.carousel.c f22645u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.material.carousel.b f22646v;

    /* renamed from: w, reason: collision with root package name */
    public int f22647w;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f22648x;

    /* renamed from: y, reason: collision with root package name */
    public f f22649y;

    /* renamed from: z, reason: collision with root package name */
    public final View.OnLayoutChangeListener f22650z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final View f22651a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22652b;

        /* renamed from: c, reason: collision with root package name */
        public final float f22653c;

        /* renamed from: d, reason: collision with root package name */
        public final c f22654d;

        public a(View view, float f10, float f11, c cVar) {
            this.f22651a = view;
            this.f22652b = f10;
            this.f22653c = f11;
            this.f22654d = cVar;
        }
    }

    public static class b extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f22655a;

        /* renamed from: b, reason: collision with root package name */
        public List<b.C0340b> f22656b;

        public b() {
            Paint paint = new Paint();
            this.f22655a = paint;
            this.f22656b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, b10);
            Paint paint = this.f22655a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (b.C0340b c0340b : this.f22656b) {
                paint.setColor(d.b(c0340b.f22673c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).k1()) {
                    float fI = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f22649y.i();
                    float fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f22649y.d();
                    float f10 = c0340b.f22672b;
                    float f11 = c0340b.f22672b;
                    canvas2 = canvas;
                    canvas2.drawLine(f10, fI, f11, fD, paint);
                } else {
                    float f12 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f22649y.f();
                    float fG = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f22649y.g();
                    float f13 = c0340b.f22672b;
                    float f14 = c0340b.f22672b;
                    canvas2 = canvas;
                    canvas2.drawLine(f12, f14, fG, f13, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final b.C0340b f22657a;

        /* renamed from: b, reason: collision with root package name */
        public final b.C0340b f22658b;

        public c(b.C0340b c0340b, b.C0340b c0340b2) {
            l.l(c0340b.f22671a <= c0340b2.f22671a);
            this.f22657a = c0340b;
            this.f22658b = c0340b2;
        }
    }

    public CarouselLayoutManager() {
        i iVar = new i();
        this.f22643s = new b();
        this.f22647w = 0;
        this.f22650z = new S3.b(this, 0);
        this.f22638B = -1;
        this.f22639C = 0;
        this.f22644t = iVar;
        q1();
        s1(0);
    }

    public static c j1(List<b.C0340b> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            b.C0340b c0340b = list.get(i13);
            float f15 = z10 ? c0340b.f22672b : c0340b.f22671a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i = i13;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i11 = i13;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i10 = i13;
                f14 = f15;
            }
            if (f15 > f12) {
                i12 = i13;
                f12 = f15;
            }
        }
        if (i == -1) {
            i = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        return new c(list.get(i), list.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int B(RecyclerView.B b10) {
        if (O() == 0 || this.f22645u == null || V() <= 1) {
            return 0;
        }
        return (int) (this.f16510n * (this.f22645u.f22679a.f22659a / D(b10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int C(RecyclerView.B b10) {
        return this.f22640p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int D(RecyclerView.B b10) {
        return this.f22642r - this.f22641q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int E(RecyclerView.B b10) {
        if (O() == 0 || this.f22645u == null || V() <= 1) {
            return 0;
        }
        return (int) (this.f16511o * (this.f22645u.f22679a.f22659a / G(b10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int F(RecyclerView.B b10) {
        return this.f22640p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int G(RecyclerView.B b10) {
        return this.f22642r - this.f22641q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean I0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iI1;
        if (this.f22645u == null || (iI1 = i1(RecyclerView.p.b0(view), g1(RecyclerView.p.b0(view)))) == 0) {
            return false;
        }
        int i = this.f22640p;
        int i10 = this.f22641q;
        int i11 = this.f22642r;
        int i12 = i + iI1;
        if (i12 < i10) {
            iI1 = i10 - i;
        } else if (i12 > i11) {
            iI1 = i11 - i;
        }
        int iI12 = i1(RecyclerView.p.b0(view), this.f22645u.b(i + iI1, i10, i11));
        if (k1()) {
            recyclerView.scrollBy(iI12, 0);
            return true;
        }
        recyclerView.scrollBy(0, iI12);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q K() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int K0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (k1()) {
            return r1(i, wVar, b10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void L0(int i) {
        this.f22638B = i;
        if (this.f22645u == null) {
            return;
        }
        this.f22640p = h1(i, g1(i));
        this.f22647w = B7.d.h(i, 0, Math.max(0, V() - 1));
        u1(this.f22645u);
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int M0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (w()) {
            return r1(i, wVar, b10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void S(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        float fCenterY = rect.centerY();
        if (k1()) {
            fCenterY = rect.centerX();
        }
        c cVarJ1 = j1(this.f22646v.f22660b, fCenterY, true);
        b.C0340b c0340b = cVarJ1.f22657a;
        float f10 = c0340b.f22674d;
        b.C0340b c0340b2 = cVarJ1.f22658b;
        float fB = L3.a.b(f10, c0340b2.f22674d, c0340b.f22672b, c0340b2.f22672b, fCenterY);
        float fWidth = k1() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = k1() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void V0(RecyclerView recyclerView, int i) {
        S3.c cVar = new S3.c(this, recyclerView.getContext());
        cVar.f16448a = i;
        W0(cVar);
    }

    public final void Y0(View view, int i, a aVar) {
        float f10 = this.f22646v.f22659a / 2.0f;
        s(view, i, false);
        float f11 = aVar.f22653c;
        this.f22649y.j(view, (int) (f11 - f10), (int) (f11 + f10));
        t1(view, aVar.f22652b, aVar.f22654d);
    }

    public final float Z0(float f10, float f11) {
        return l1() ? f10 - f11 : f10 + f11;
    }

    public final void a1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        float fD1 = d1(i);
        while (i < b10.b()) {
            a aVarO1 = o1(wVar, fD1, i);
            float f10 = aVarO1.f22653c;
            c cVar = aVarO1.f22654d;
            if (m1(f10, cVar)) {
                return;
            }
            fD1 = Z0(fD1, this.f22646v.f22659a);
            if (!n1(f10, cVar)) {
                Y0(aVarO1.f22651a, -1, aVarO1);
            }
            i++;
        }
    }

    public final void b1(RecyclerView.w wVar, int i) {
        float fD1 = d1(i);
        while (i >= 0) {
            a aVarO1 = o1(wVar, fD1, i);
            c cVar = aVarO1.f22654d;
            float f10 = aVarO1.f22653c;
            if (n1(f10, cVar)) {
                return;
            }
            float f11 = this.f22646v.f22659a;
            fD1 = l1() ? fD1 + f11 : fD1 - f11;
            if (!m1(f10, cVar)) {
                Y0(aVarO1.f22651a, 0, aVarO1);
            }
            i--;
        }
    }

    public final float c1(View view, float f10, c cVar) {
        b.C0340b c0340b = cVar.f22657a;
        float f11 = c0340b.f22672b;
        b.C0340b c0340b2 = cVar.f22658b;
        float f12 = c0340b2.f22672b;
        float f13 = c0340b.f22671a;
        float f14 = c0340b2.f22671a;
        float fB = L3.a.b(f11, f12, f13, f14, f10);
        if (c0340b2 != this.f22646v.b() && c0340b != this.f22646v.d()) {
            return fB;
        }
        return (((1.0f - c0340b2.f22673c) + (this.f22649y.b((RecyclerView.q) view.getLayoutParams()) / this.f22646v.f22659a)) * (f10 - f14)) + fB;
    }

    public final float d1(int i) {
        return Z0(this.f22649y.h() - this.f22640p, this.f22646v.f22659a * i);
    }

    public final void e1(RecyclerView.w wVar, RecyclerView.B b10) {
        while (O() > 0) {
            View viewN = N(0);
            Rect rect = new Rect();
            RecyclerView.getDecoratedBoundsWithMarginsInt(viewN, rect);
            float fCenterX = k1() ? rect.centerX() : rect.centerY();
            if (!n1(fCenterX, j1(this.f22646v.f22660b, fCenterX, true))) {
                break;
            }
            G0(viewN);
            wVar.i(viewN);
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            Rect rect2 = new Rect();
            RecyclerView.getDecoratedBoundsWithMarginsInt(viewN2, rect2);
            float fCenterX2 = k1() ? rect2.centerX() : rect2.centerY();
            if (!m1(fCenterX2, j1(this.f22646v.f22660b, fCenterX2, true))) {
                break;
            }
            G0(viewN2);
            wVar.i(viewN2);
        }
        if (O() == 0) {
            b1(wVar, this.f22647w - 1);
            a1(this.f22647w, wVar, b10);
        } else {
            int iB0 = RecyclerView.p.b0(N(0));
            int iB02 = RecyclerView.p.b0(N(O() - 1));
            b1(wVar, iB0 - 1);
            a1(iB02 + 1, wVar, b10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public final PointF f(int i) {
        if (this.f22645u == null) {
            return null;
        }
        int iH1 = h1(i, g1(i)) - this.f22640p;
        return k1() ? new PointF(iH1, 0.0f) : new PointF(0.0f, iH1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean f0() {
        return true;
    }

    public final int f1() {
        return k1() ? this.f16510n : this.f16511o;
    }

    public final com.google.android.material.carousel.b g1(int i) {
        com.google.android.material.carousel.b bVar;
        HashMap map = this.f22648x;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(B7.d.h(i, 0, Math.max(0, V() + (-1)))))) == null) ? this.f22645u.f22679a : bVar;
    }

    public final int h1(int i, com.google.android.material.carousel.b bVar) {
        if (!l1()) {
            return (int) ((bVar.f22659a / 2.0f) + ((i * bVar.f22659a) - bVar.a().f22671a));
        }
        float fF1 = f1() - bVar.c().f22671a;
        float f10 = bVar.f22659a;
        return (int) ((fF1 - (i * f10)) - (f10 / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void i0(View view) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        u(view, rect);
        int i = rect.left + rect.right;
        int i10 = rect.top + rect.bottom;
        com.google.android.material.carousel.c cVar = this.f22645u;
        view.measure(RecyclerView.p.P(k1(), this.f16510n, this.f16508l, Z() + Y() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i, (int) ((cVar == null || this.f22649y.f11902a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : cVar.f22679a.f22659a)), RecyclerView.p.P(w(), this.f16511o, this.f16509m, X() + a0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i10, (int) ((cVar == null || this.f22649y.f11902a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : cVar.f22679a.f22659a)));
    }

    public final int i1(int i, com.google.android.material.carousel.b bVar) {
        int i10 = Integer.MAX_VALUE;
        for (b.C0340b c0340b : bVar.f22660b.subList(bVar.f22661c, bVar.f22662d + 1)) {
            float f10 = bVar.f22659a;
            float f11 = (f10 / 2.0f) + (i * f10);
            int iF1 = (l1() ? (int) ((f1() - c0340b.f22671a) - f11) : (int) (f11 - c0340b.f22671a)) - this.f22640p;
            if (Math.abs(i10) > Math.abs(iF1)) {
                i10 = iF1;
            }
        }
        return i10;
    }

    public final boolean k1() {
        return this.f22649y.f11902a == 0;
    }

    public final boolean l1() {
        return k1() && W() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void m0(RecyclerView recyclerView) throws Resources.NotFoundException {
        i iVar = this.f22644t;
        Context context = recyclerView.getContext();
        float dimension = iVar.f11903a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        iVar.f11903a = dimension;
        float dimension2 = iVar.f11904b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        iVar.f11904b = dimension2;
        q1();
        recyclerView.addOnLayoutChangeListener(this.f22650z);
    }

    public final boolean m1(float f10, c cVar) {
        b.C0340b c0340b = cVar.f22657a;
        float f11 = c0340b.f22674d;
        b.C0340b c0340b2 = cVar.f22658b;
        float fB = L3.a.b(f11, c0340b2.f22674d, c0340b.f22672b, c0340b2.f22672b, f10) / 2.0f;
        float f12 = l1() ? f10 + fB : f10 - fB;
        return l1() ? f12 < 0.0f : f12 > ((float) f1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void n0(RecyclerView recyclerView, RecyclerView.w wVar) {
        recyclerView.removeOnLayoutChangeListener(this.f22650z);
    }

    public final boolean n1(float f10, c cVar) {
        b.C0340b c0340b = cVar.f22657a;
        float f11 = c0340b.f22674d;
        b.C0340b c0340b2 = cVar.f22658b;
        float fZ0 = Z0(f10, L3.a.b(f11, c0340b2.f22674d, c0340b.f22672b, c0340b2.f22672b, f10) / 2.0f);
        return l1() ? fZ0 > ((float) f1()) : fZ0 < 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View o0(android.view.View r5, int r6, androidx.recyclerview.widget.RecyclerView.w r7, androidx.recyclerview.widget.RecyclerView.B r8) {
        /*
            r4 = this;
            int r8 = r4.O()
            if (r8 != 0) goto L8
            goto L90
        L8:
            S3.f r8 = r4.f22649y
            int r8 = r8.f11902a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L3a
            r3 = 2
            if (r6 == r3) goto L30
            r3 = 17
            if (r6 == r3) goto L3f
            r3 = 33
            if (r6 == r3) goto L3c
            r3 = 66
            if (r6 == r3) goto L32
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L2e
            java.lang.String r8 = "Unknown focus request:"
            java.lang.String r3 = "CarouselLayoutManager"
            com.google.android.gms.measurement.internal.a.i(r6, r8, r3)
        L2c:
            r6 = r0
            goto L48
        L2e:
            if (r8 != r2) goto L2c
        L30:
            r6 = r2
            goto L48
        L32:
            if (r8 != 0) goto L2c
            boolean r6 = r4.l1()
            if (r6 == 0) goto L30
        L3a:
            r6 = r1
            goto L48
        L3c:
            if (r8 != r2) goto L2c
            goto L3a
        L3f:
            if (r8 != 0) goto L2c
            boolean r6 = r4.l1()
            if (r6 == 0) goto L3a
            goto L30
        L48:
            if (r6 != r0) goto L4b
            goto L90
        L4b:
            r8 = 0
            if (r6 != r1) goto L85
            int r5 = androidx.recyclerview.widget.RecyclerView.p.b0(r5)
            if (r5 != 0) goto L55
            goto L90
        L55:
            android.view.View r5 = r4.N(r8)
            int r5 = androidx.recyclerview.widget.RecyclerView.p.b0(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L74
            int r6 = r4.V()
            if (r5 < r6) goto L67
            goto L74
        L67:
            float r6 = r4.d1(r5)
            com.google.android.material.carousel.CarouselLayoutManager$a r5 = r4.o1(r7, r6, r5)
            android.view.View r6 = r5.f22651a
            r4.Y0(r6, r8, r5)
        L74:
            boolean r5 = r4.l1()
            if (r5 == 0) goto L80
            int r5 = r4.O()
            int r8 = r5 + (-1)
        L80:
            android.view.View r5 = r4.N(r8)
            return r5
        L85:
            int r5 = androidx.recyclerview.widget.RecyclerView.p.b0(r5)
            int r6 = r4.V()
            int r6 = r6 - r2
            if (r5 != r6) goto L92
        L90:
            r5 = 0
            return r5
        L92:
            int r5 = r4.O()
            int r5 = r5 - r2
            android.view.View r5 = r4.N(r5)
            int r5 = androidx.recyclerview.widget.RecyclerView.p.b0(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb6
            int r6 = r4.V()
            if (r5 < r6) goto La9
            goto Lb6
        La9:
            float r6 = r4.d1(r5)
            com.google.android.material.carousel.CarouselLayoutManager$a r5 = r4.o1(r7, r6, r5)
            android.view.View r6 = r5.f22651a
            r4.Y0(r6, r1, r5)
        Lb6:
            boolean r5 = r4.l1()
            if (r5 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r5 = r4.O()
            int r8 = r5 + (-1)
        Lc3:
            android.view.View r5 = r4.N(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.o0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    public final a o1(RecyclerView.w wVar, float f10, int i) {
        View view = wVar.l(i, Long.MAX_VALUE).itemView;
        i0(view);
        float fZ0 = Z0(f10, this.f22646v.f22659a / 2.0f);
        c cVarJ1 = j1(this.f22646v.f22660b, fZ0, false);
        return new a(view, fZ0, c1(view, fZ0, cVarJ1), cVarJ1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void p0(AccessibilityEvent accessibilityEvent) {
        super.p0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.p.b0(N(0)));
            accessibilityEvent.setToIndex(RecyclerView.p.b0(N(O() - 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0571 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(androidx.recyclerview.widget.RecyclerView.w r30) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.p1(androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public final void q1() {
        this.f22645u = null;
        J0();
    }

    public final int r1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        if (this.f22645u == null) {
            p1(wVar);
        }
        int i10 = this.f22640p;
        int i11 = this.f22641q;
        int i12 = this.f22642r;
        int i13 = i10 + i;
        if (i13 < i11) {
            i = i11 - i10;
        } else if (i13 > i12) {
            i = i12 - i10;
        }
        this.f22640p = i10 + i;
        u1(this.f22645u);
        float f10 = this.f22646v.f22659a / 2.0f;
        float fD1 = d1(RecyclerView.p.b0(N(0)));
        Rect rect = new Rect();
        float f11 = l1() ? this.f22646v.c().f22672b : this.f22646v.a().f22672b;
        float f12 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < O(); i14++) {
            View viewN = N(i14);
            float fZ0 = Z0(fD1, f10);
            c cVarJ1 = j1(this.f22646v.f22660b, fZ0, false);
            float fC1 = c1(viewN, fZ0, cVarJ1);
            RecyclerView.getDecoratedBoundsWithMarginsInt(viewN, rect);
            t1(viewN, fZ0, cVarJ1);
            this.f22649y.l(viewN, rect, f10, fC1);
            float fAbs = Math.abs(f11 - fC1);
            if (fAbs < f12) {
                this.f22638B = RecyclerView.p.b0(viewN);
                f12 = fAbs;
            }
            fD1 = Z0(fD1, this.f22646v.f22659a);
        }
        e1(wVar, b10);
        return i;
    }

    public final void s1(int i) {
        f eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C4356c.h(i, "invalid orientation:"));
        }
        t(null);
        f fVar = this.f22649y;
        if (fVar == null || i != fVar.f11902a) {
            if (i == 0) {
                eVar = new e(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new S3.d(this);
            }
            this.f22649y = eVar;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void t0(int i, int i10) {
        v1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t1(View view, float f10, c cVar) {
        if (view instanceof h) {
            b.C0340b c0340b = cVar.f22657a;
            float f11 = c0340b.f22673c;
            b.C0340b c0340b2 = cVar.f22658b;
            float fB = L3.a.b(f11, c0340b2.f22673c, c0340b.f22671a, c0340b2.f22671a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFC = this.f22649y.c(height, width, L3.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), L3.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fC1 = c1(view, f10, cVar);
            RectF rectF = new RectF(fC1 - (rectFC.width() / 2.0f), fC1 - (rectFC.height() / 2.0f), (rectFC.width() / 2.0f) + fC1, (rectFC.height() / 2.0f) + fC1);
            RectF rectF2 = new RectF(this.f22649y.f(), this.f22649y.i(), this.f22649y.g(), this.f22649y.d());
            this.f22644t.getClass();
            this.f22649y.a(rectFC, rectF, rectF2);
            this.f22649y.k(rectFC, rectF, rectF2);
            ((h) view).a();
        }
    }

    public final void u1(com.google.android.material.carousel.c cVar) {
        int i = this.f22642r;
        int i10 = this.f22641q;
        if (i <= i10) {
            this.f22646v = l1() ? cVar.a() : cVar.c();
        } else {
            this.f22646v = cVar.b(this.f22640p, i10, i);
        }
        List<b.C0340b> list = this.f22646v.f22660b;
        b bVar = this.f22643s;
        bVar.getClass();
        bVar.f22656b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean v() {
        return k1();
    }

    public final void v1() {
        int iV = V();
        int i = this.f22637A;
        if (iV == i || this.f22645u == null) {
            return;
        }
        i iVar = this.f22644t;
        if ((i < iVar.f11907c && V() >= iVar.f11907c) || (i >= iVar.f11907c && V() < iVar.f11907c)) {
            q1();
        }
        this.f22637A = iV;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean w() {
        return !k1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void w0(int i, int i10) {
        v1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void y0(RecyclerView.w wVar, RecyclerView.B b10) {
        float f10;
        if (b10.b() <= 0 || f1() <= 0.0f) {
            E0(wVar);
            this.f22647w = 0;
            return;
        }
        boolean zL1 = l1();
        boolean z10 = this.f22645u == null;
        if (z10) {
            p1(wVar);
        }
        com.google.android.material.carousel.c cVar = this.f22645u;
        boolean zL12 = l1();
        com.google.android.material.carousel.b bVarA = zL12 ? cVar.a() : cVar.c();
        float f11 = (zL12 ? bVarA.c() : bVarA.a()).f22671a;
        float f12 = bVarA.f22659a / 2.0f;
        int iH = (int) (this.f22649y.h() - (l1() ? f11 + f12 : f11 - f12));
        com.google.android.material.carousel.c cVar2 = this.f22645u;
        boolean zL13 = l1();
        com.google.android.material.carousel.b bVarC = zL13 ? cVar2.c() : cVar2.a();
        b.C0340b c0340bA = zL13 ? bVarC.a() : bVarC.c();
        int iB = (int) (((((b10.b() - 1) * bVarC.f22659a) * (zL13 ? -1.0f : 1.0f)) - (c0340bA.f22671a - this.f22649y.h())) + (this.f22649y.e() - c0340bA.f22671a) + (zL13 ? -c0340bA.f22677g : c0340bA.f22678h));
        int iMin = zL13 ? Math.min(0, iB) : Math.max(0, iB);
        this.f22641q = zL1 ? iMin : iH;
        if (zL1) {
            iMin = iH;
        }
        this.f22642r = iMin;
        if (z10) {
            this.f22640p = iH;
            com.google.android.material.carousel.c cVar3 = this.f22645u;
            int iV = V();
            int i = this.f22641q;
            int i10 = this.f22642r;
            boolean zL14 = l1();
            com.google.android.material.carousel.b bVar = cVar3.f22679a;
            HashMap map = new HashMap();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                f10 = bVar.f22659a;
                if (i11 >= iV) {
                    break;
                }
                int i13 = zL14 ? (iV - i11) - 1 : i11;
                float f13 = i13 * f10 * (zL14 ? -1 : 1);
                float f14 = i10 - cVar3.f22685g;
                List<com.google.android.material.carousel.b> list = cVar3.f22681c;
                if (f13 > f14 || i11 >= iV - list.size()) {
                    map.put(Integer.valueOf(i13), list.get(B7.d.h(i12, 0, list.size() - 1)));
                    i12++;
                }
                i11++;
            }
            int i14 = 0;
            for (int i15 = iV - 1; i15 >= 0; i15--) {
                int i16 = zL14 ? (iV - i15) - 1 : i15;
                float f15 = i16 * f10 * (zL14 ? -1 : 1);
                float f16 = i + cVar3.f22684f;
                List<com.google.android.material.carousel.b> list2 = cVar3.f22680b;
                if (f15 < f16 || i15 < list2.size()) {
                    map.put(Integer.valueOf(i16), list2.get(B7.d.h(i14, 0, list2.size() - 1)));
                    i14++;
                }
            }
            this.f22648x = map;
            int i17 = this.f22638B;
            if (i17 != -1) {
                this.f22640p = h1(i17, g1(i17));
            }
        }
        int i18 = this.f22640p;
        int i19 = this.f22641q;
        int i20 = this.f22642r;
        this.f22640p = (i18 < i19 ? i19 - i18 : i18 > i20 ? i20 - i18 : 0) + i18;
        this.f22647w = B7.d.h(this.f22647w, 0, b10.b());
        u1(this.f22645u);
        H(wVar);
        e1(wVar, b10);
        this.f22637A = V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void z0(RecyclerView.B b10) {
        if (O() == 0) {
            this.f22647w = 0;
        } else {
            this.f22647w = RecyclerView.p.b0(N(0));
        }
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f22643s = new b();
        this.f22647w = 0;
        this.f22650z = new S3.b(this, 0);
        this.f22638B = -1;
        this.f22639C = 0;
        this.f22644t = new i();
        q1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3116c);
            this.f22639C = typedArrayObtainStyledAttributes.getInt(0, 0);
            q1();
            s1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
