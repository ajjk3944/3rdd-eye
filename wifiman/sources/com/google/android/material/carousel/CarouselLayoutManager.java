package com.google.android.material.carousel;

import O3.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import w1.AbstractC8253a;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.o implements com.google.android.material.carousel.b, RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    private int f37177A;

    /* renamed from: B, reason: collision with root package name */
    private Map f37178B;

    /* renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f37179C;

    /* renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f37180D;

    /* renamed from: E, reason: collision with root package name */
    private int f37181E;

    /* renamed from: F, reason: collision with root package name */
    private int f37182F;

    /* renamed from: G, reason: collision with root package name */
    private int f37183G;

    /* renamed from: s, reason: collision with root package name */
    int f37184s;

    /* renamed from: t, reason: collision with root package name */
    int f37185t;

    /* renamed from: u, reason: collision with root package name */
    int f37186u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37187v;

    /* renamed from: w, reason: collision with root package name */
    private final c f37188w;

    /* renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f37189x;

    /* renamed from: y, reason: collision with root package name */
    private g f37190y;

    /* renamed from: z, reason: collision with root package name */
    private f f37191z;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i10) {
            return CarouselLayoutManager.this.b(i10);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f37190y == null || !CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f37190y == null || CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final View f37193a;

        /* renamed from: b, reason: collision with root package name */
        final float f37194b;

        /* renamed from: c, reason: collision with root package name */
        final float f37195c;

        /* renamed from: d, reason: collision with root package name */
        final d f37196d;

        b(View view, float f10, float f11, d dVar) {
            this.f37193a = view;
            this.f37194b = f10;
            this.f37195c = f11;
            this.f37196d = dVar;
        }
    }

    private static class c extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Paint f37197a;

        /* renamed from: b, reason: collision with root package name */
        private List f37198b;

        c() {
            Paint paint = new Paint();
            this.f37197a = paint;
            this.f37198b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.f37197a.setStrokeWidth(recyclerView.getResources().getDimension(O3.c.f17029k));
            for (f.c cVar : this.f37198b) {
                this.f37197a.setColor(AbstractC8253a.c(-65281, -16776961, cVar.f37229c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).j()) {
                    canvas.drawLine(cVar.f37228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f37228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.f37197a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f37228b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f37228b, this.f37197a);
                }
            }
        }

        void j(List list) {
            this.f37198b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final f.c f37199a;

        /* renamed from: b, reason: collision with root package name */
        final f.c f37200b;

        d(f.c cVar, f.c cVar2) {
            E1.h.a(cVar.f37227a <= cVar2.f37227a);
            this.f37199a = cVar;
            this.f37200b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.f37179C.j();
    }

    private int B2() {
        if (R() || !this.f37189x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    private int C2(int i10, f fVar) {
        return F2() ? (int) (((n2() - fVar.h().f37227a) - (i10 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i10 * fVar.f()) - fVar.a().f37227a) + (fVar.f() / 2.0f));
    }

    private int D2(int i10, f fVar) {
        int i11 = MPv3.MAX_MESSAGE_ID;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            int iN2 = (F2() ? (int) ((n2() - cVar.f37227a) - f10) : (int) (f10 - cVar.f37227a)) - this.f37184s;
            if (Math.abs(i11) > Math.abs(iN2)) {
                i11 = iN2;
            }
        }
        return i11;
    }

    private static d E2(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = (f.c) list.get(i14);
            float f15 = z10 ? cVar.f37228b : cVar.f37227a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((f.c) list.get(i10), (f.c) list.get(i12));
    }

    private boolean G2(float f10, d dVar) {
        float fZ1 = Z1(f10, s2(f10, dVar) / 2.0f);
        if (F2()) {
            if (fZ1 >= 0.0f) {
                return false;
            }
        } else if (fZ1 <= n2()) {
            return false;
        }
        return true;
    }

    private boolean H2(float f10, d dVar) {
        float fY1 = Y1(f10, s2(f10, dVar) / 2.0f);
        if (F2()) {
            if (fY1 <= n2()) {
                return false;
            }
        } else if (fY1 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: S3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f20245a.N2();
            }
        });
    }

    private void J2() {
        if (this.f37187v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View viewN = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + o2(viewN) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b K2(RecyclerView.u uVar, float f10, int i10) {
        View viewO = uVar.o(i10);
        E0(viewO, 0, 0);
        float fY1 = Y1(f10, this.f37191z.f() / 2.0f);
        d dVarE2 = E2(this.f37191z.g(), fY1, false);
        return new b(viewO, fY1, d2(viewO, fY1, dVarE2), dVarE2);
    }

    private float L2(View view, float f10, float f11, Rect rect) {
        float fY1 = Y1(f10, f11);
        d dVarE2 = E2(this.f37191z.g(), fY1, false);
        float fD2 = d2(view, fY1, dVarE2);
        super.U(view, rect);
        V2(view, fY1, dVarE2);
        this.f37179C.l(view, rect, f11, fD2);
        return fD2;
    }

    private void M2(RecyclerView.u uVar) {
        View viewO = uVar.o(0);
        E0(viewO, 0, 0);
        f fVarG = this.f37189x.g(this, viewO);
        if (F2()) {
            fVarG = f.n(fVarG, n2());
        }
        this.f37190y = g.f(this, fVarG, p2(), r2(), B2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.f37190y = null;
        x1();
    }

    private void O2(RecyclerView.u uVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fO2 = o2(viewN);
            if (!H2(fO2, E2(this.f37191z.g(), fO2, true))) {
                break;
            } else {
                q1(viewN, uVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fO22 = o2(viewN2);
            if (!G2(fO22, E2(this.f37191z.g(), fO22, true))) {
                return;
            } else {
                q1(viewN2, uVar);
            }
        }
    }

    private int P2(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f37190y == null) {
            M2(uVar);
        }
        int iH2 = h2(i10, this.f37184s, this.f37185t, this.f37186u);
        this.f37184s += iH2;
        W2(this.f37190y);
        float f10 = this.f37191z.f() / 2.0f;
        float fE2 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f11 = F2() ? this.f37191z.h().f37228b : this.f37191z.a().f37228b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View viewN = N(i11);
            float fAbs = Math.abs(f11 - L2(viewN, fE2, f10, rect));
            if (viewN != null && fAbs < f12) {
                this.f37182F = l0(viewN);
                f12 = fAbs;
            }
            fE2 = Y1(fE2, this.f37191z.f());
        }
        k2(uVar, zVar);
        return iH2;
    }

    private void Q2(RecyclerView recyclerView, int i10) {
        if (j()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17342Y);
            R2(typedArrayObtainStyledAttributes.getInt(j.f17349Z, 0));
            U2(typedArrayObtainStyledAttributes.getInt(j.f17377c4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void V2(View view, float f10, d dVar) {
    }

    private void W2(g gVar) {
        int i10 = this.f37186u;
        int i11 = this.f37185t;
        if (i10 <= i11) {
            this.f37191z = F2() ? gVar.h() : gVar.l();
        } else {
            this.f37191z = gVar.j(this.f37184s, i11, i10);
        }
        this.f37188w.j(this.f37191z.g());
    }

    private void X1(View view, int i10, b bVar) {
        float f10 = this.f37191z.f() / 2.0f;
        f(view, i10);
        float f11 = bVar.f37195c;
        this.f37179C.k(view, (int) (f11 - f10), (int) (f11 + f10));
        V2(view, bVar.f37194b, bVar.f37196d);
    }

    private void X2() {
        int iA = a();
        int i10 = this.f37181E;
        if (iA == i10 || this.f37190y == null) {
            return;
        }
        if (this.f37189x.h(this, i10)) {
            N2();
        }
        this.f37181E = iA;
    }

    private float Y1(float f10, float f11) {
        return F2() ? f10 - f11 : f10 + f11;
    }

    private void Y2() {
        if (!this.f37187v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int iL0 = l0(N(i10));
            int i11 = i10 + 1;
            int iL02 = l0(N(i11));
            if (iL0 > iL02) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iL0 + "] and child at index [" + i11 + "] had adapter position [" + iL02 + "].");
            }
            i10 = i11;
        }
    }

    private float Z1(float f10, float f11) {
        return F2() ? f10 + f11 : f10 - f11;
    }

    private void a2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0 || i10 >= a()) {
            return;
        }
        b bVarK2 = K2(uVar, e2(i10), i10);
        X1(bVarK2.f37193a, i11, bVarK2);
    }

    private void b2(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        float fE2 = e2(i10);
        while (i10 < zVar.b()) {
            b bVarK2 = K2(uVar, fE2, i10);
            if (G2(bVarK2.f37195c, bVarK2.f37196d)) {
                return;
            }
            fE2 = Y1(fE2, this.f37191z.f());
            if (!H2(bVarK2.f37195c, bVarK2.f37196d)) {
                X1(bVarK2.f37193a, -1, bVarK2);
            }
            i10++;
        }
    }

    private void c2(RecyclerView.u uVar, int i10) {
        float fE2 = e2(i10);
        while (i10 >= 0) {
            b bVarK2 = K2(uVar, fE2, i10);
            if (H2(bVarK2.f37195c, bVarK2.f37196d)) {
                return;
            }
            fE2 = Z1(fE2, this.f37191z.f());
            if (!G2(bVarK2.f37195c, bVarK2.f37196d)) {
                X1(bVarK2.f37193a, 0, bVarK2);
            }
            i10--;
        }
    }

    private float d2(View view, float f10, d dVar) {
        f.c cVar = dVar.f37199a;
        float f11 = cVar.f37228b;
        f.c cVar2 = dVar.f37200b;
        float fB = P3.a.b(f11, cVar2.f37228b, cVar.f37227a, cVar2.f37227a, f10);
        if (dVar.f37200b != this.f37191z.c() && dVar.f37199a != this.f37191z.j()) {
            return fB;
        }
        float fD = this.f37179C.d((RecyclerView.p) view.getLayoutParams()) / this.f37191z.f();
        f.c cVar3 = dVar.f37200b;
        return fB + ((f10 - cVar3.f37227a) * ((1.0f - cVar3.f37229c) + fD));
    }

    private float e2(int i10) {
        return Y1(z2() - this.f37184s, this.f37191z.f() * i10);
    }

    private int f2(RecyclerView.z zVar, g gVar) {
        boolean zF2 = F2();
        f fVarL = zF2 ? gVar.l() : gVar.h();
        f.c cVarA = zF2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((zVar.b() - 1) * fVarL.f()) * (zF2 ? -1.0f : 1.0f)) - (cVarA.f37227a - z2())) + (w2() - cVarA.f37227a) + (zF2 ? -cVarA.f37233g : cVarA.f37234h));
        return zF2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int h2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int i2(g gVar) {
        boolean zF2 = F2();
        f fVarH = zF2 ? gVar.h() : gVar.l();
        return (int) (z2() - Z1((zF2 ? fVarH.h() : fVarH.a()).f37227a, fVarH.f() / 2.0f));
    }

    private int j2(int i10) {
        int iU2 = u2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            return iU2 == 0 ? F2() ? 1 : -1 : PduHandle.NONE;
        }
        if (i10 == 33) {
            if (iU2 == 1) {
                return -1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 66) {
            return iU2 == 0 ? F2() ? -1 : 1 : PduHandle.NONE;
        }
        if (i10 == 130) {
            if (iU2 == 1) {
                return 1;
            }
            return PduHandle.NONE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return PduHandle.NONE;
    }

    private void k2(RecyclerView.u uVar, RecyclerView.z zVar) {
        O2(uVar);
        if (O() == 0) {
            c2(uVar, this.f37177A - 1);
            b2(uVar, zVar, this.f37177A);
        } else {
            int iL0 = l0(N(0));
            int iL02 = l0(N(O() - 1));
            c2(uVar, iL0 - 1);
            b2(uVar, zVar, iL02 + 1);
        }
        Y2();
    }

    private View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return j() ? k() : l();
    }

    private float o2(View view) {
        super.U(view, new Rect());
        return j() ? r0.centerX() : r0.centerY();
    }

    private int p2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) N(0).getLayoutParams();
        if (this.f37179C.f37209a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
        return i10 + i11;
    }

    private f q2(int i10) {
        f fVar;
        Map map = this.f37178B;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(AbstractC8707a.b(i10, 0, Math.max(0, a() + (-1)))))) == null) ? this.f37190y.g() : fVar;
    }

    private int r2() {
        if (R() || !this.f37189x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    private float s2(float f10, d dVar) {
        f.c cVar = dVar.f37199a;
        float f11 = cVar.f37230d;
        f.c cVar2 = dVar.f37200b;
        return P3.a.b(f11, cVar2.f37230d, cVar.f37228b, cVar2.f37228b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v2() {
        return this.f37179C.e();
    }

    private int w2() {
        return this.f37179C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.f37179C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.f37179C.h();
    }

    private int z2() {
        return this.f37179C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.f37186u - this.f37185t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (p()) {
            return P2(i10, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i10) {
        this.f37182F = i10;
        if (this.f37190y == null) {
            return;
        }
        this.f37184s = C2(i10, q2(i10));
        this.f37177A = AbstractC8707a.b(i10, 0, Math.max(0, a() - 1));
        W2(this.f37190y);
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (q()) {
            return P2(i10, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void E0(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean F2() {
        return j() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f37189x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.f37180D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.f37180D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        N1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iJ2;
        if (O() == 0 || (iJ2 = j2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iJ2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(uVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == a() - 1) {
            return null;
        }
        a2(uVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void R2(int i10) {
        this.f37183G = i10;
        N2();
    }

    public void T2(com.google.android.material.carousel.d dVar) {
        this.f37189x = dVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (j()) {
            fCenterY = rect.centerX();
        }
        float fS2 = s2(fCenterY, E2(this.f37191z.g(), fCenterY, true));
        float fWidth = j() ? (rect.width() - fS2) / 2.0f : 0.0f;
        float fHeight = j() ? 0.0f : (rect.height() - fS2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        h(null);
        com.google.android.material.carousel.c cVar = this.f37179C;
        if (cVar == null || i10 != cVar.f37209a) {
            this.f37179C = com.google.android.material.carousel.c.b(this, i10);
            N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        super.V0(recyclerView, i10, i11);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        super.Y0(recyclerView, i10, i11);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF b(int i10) {
        if (this.f37190y == null) {
            return null;
        }
        int iT2 = t2(i10, q2(i10));
        return j() ? new PointF(iT2, 0.0f) : new PointF(0.0f, iT2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || n2() <= 0.0f) {
            o1(uVar);
            this.f37177A = 0;
            return;
        }
        boolean zF2 = F2();
        boolean z10 = this.f37190y == null;
        if (z10) {
            M2(uVar);
        }
        int iI2 = i2(this.f37190y);
        int iF2 = f2(zVar, this.f37190y);
        this.f37185t = zF2 ? iF2 : iI2;
        if (zF2) {
            iF2 = iI2;
        }
        this.f37186u = iF2;
        if (z10) {
            this.f37184s = iI2;
            this.f37178B = this.f37190y.i(a(), this.f37185t, this.f37186u, F2());
            int i10 = this.f37182F;
            if (i10 != -1) {
                this.f37184s = C2(i10, q2(i10));
            }
        }
        int i11 = this.f37184s;
        this.f37184s = i11 + h2(0, i11, this.f37185t, this.f37186u);
        this.f37177A = AbstractC8707a.b(this.f37177A, 0, zVar.b());
        W2(this.f37190y);
        B(uVar);
        k2(uVar, zVar);
        this.f37181E = a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        if (O() == 0) {
            this.f37177A = 0;
        } else {
            this.f37177A = l0(N(0));
        }
        Y2();
    }

    int g2(int i10) {
        return (int) (this.f37184s - C2(i10, q2(i10)));
    }

    @Override // com.google.android.material.carousel.b
    public boolean j() {
        return this.f37179C.f37209a == 0;
    }

    @Override // com.google.android.material.carousel.b
    public int k() {
        return s0();
    }

    @Override // com.google.android.material.carousel.b
    public int l() {
        return b0();
    }

    @Override // com.google.android.material.carousel.b
    public int m() {
        return this.f37183G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return !j();
    }

    int t2(int i10, f fVar) {
        return C2(i10, fVar) - this.f37184s;
    }

    public int u2() {
        return this.f37179C.f37209a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        if (O() == 0 || this.f37190y == null || a() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f37190y.g().f() / x(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.f37184s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iD2;
        if (this.f37190y == null || (iD2 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, D2(l0(view), this.f37190y.j(this.f37184s + h2(iD2, this.f37184s, this.f37185t, this.f37186u), this.f37185t, this.f37186u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.f37186u - this.f37185t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        if (O() == 0 || this.f37190y == null || a() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f37190y.g().f() / A(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.f37184s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f37187v = false;
        this.f37188w = new c();
        this.f37177A = 0;
        this.f37180D = new View.OnLayoutChangeListener() { // from class: S3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f20244a.I2(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f37182F = -1;
        this.f37183G = 0;
        T2(dVar);
        U2(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f37187v = false;
        this.f37188w = new c();
        this.f37177A = 0;
        this.f37180D = new View.OnLayoutChangeListener() { // from class: S3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f20244a.I2(view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f37182F = -1;
        this.f37183G = 0;
        T2(new h());
        S2(context, attributeSet);
    }
}
