package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c5.a;
import com.google.android.material.datepicker.w;
import ed.d;
import ed.l;
import h7.f1;
import h7.i1;
import h7.j1;
import h7.y0;
import h7.z0;
import i4.e;
import od.b;
import od.c;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends y0 implements i1 {

    /* renamed from: p, reason: collision with root package name */
    public final e f5562p;

    /* renamed from: q, reason: collision with root package name */
    public a f5563q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f5564r;

    public CarouselLayoutManager() {
        e eVar = new e();
        new b();
        this.f5564r = new od.a(0, this);
        this.f5562p = eVar;
        o0();
        G0(0);
    }

    @Override // h7.y0
    public final void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(this, recyclerView.getContext());
        wVar.f10038a = i10;
        B0(wVar);
    }

    public final float D0(float f10, float f11) {
        return F0() ? f10 - f11 : f10 + f11;
    }

    public final boolean E0() {
        return this.f5563q.f3295d == 0;
    }

    public final boolean F0() {
        return E0() && C() == 1;
    }

    public final void G0(int i10) {
        c cVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(h0.b.h(i10, "invalid orientation:"));
        }
        c(null);
        a aVar = this.f5563q;
        if (aVar == null || i10 != aVar.f3295d) {
            if (i10 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f5563q = cVar;
            o0();
        }
    }

    @Override // h7.y0
    public final boolean L() {
        return true;
    }

    @Override // h7.y0
    public final void R(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        e eVar = this.f5562p;
        float dimension = eVar.f11208a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(d.m3_carousel_small_item_size_min);
        }
        eVar.f11208a = dimension;
        float dimension2 = eVar.f11209b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(d.m3_carousel_small_item_size_max);
        }
        eVar.f11209b = dimension2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.f5564r);
    }

    @Override // h7.y0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f5564r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @Override // h7.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r4, int r5, h7.f1 r6, h7.j1 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L83
        L8:
            c5.a r6 = r3.f5563q
            int r6 = r6.f3295d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L33
            r2 = 2
            if (r5 == r2) goto L29
            r2 = 17
            if (r5 == r2) goto L38
            r2 = 33
            if (r5 == r2) goto L35
            r2 = 66
            if (r5 == r2) goto L2b
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L27
        L25:
            r5 = r7
            goto L41
        L27:
            if (r6 != r1) goto L25
        L29:
            r5 = r1
            goto L41
        L2b:
            if (r6 != 0) goto L25
            boolean r5 = r3.F0()
            if (r5 == 0) goto L29
        L33:
            r5 = r0
            goto L41
        L35:
            if (r6 != r1) goto L25
            goto L33
        L38:
            if (r6 != 0) goto L25
            boolean r5 = r3.F0()
            if (r5 == 0) goto L33
            goto L29
        L41:
            if (r5 != r7) goto L44
            goto L83
        L44:
            r6 = 0
            if (r5 != r0) goto L78
            int r4 = h7.y0.H(r4)
            if (r4 != 0) goto L4e
            goto L83
        L4e:
            android.view.View r4 = r3.u(r6)
            int r4 = h7.y0.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L67
            int r5 = r3.B()
            if (r4 < r5) goto L60
            goto L67
        L60:
            c5.a r4 = r3.f5563q
            r4.l()
            r4 = 0
            throw r4
        L67:
            boolean r4 = r3.F0()
            if (r4 == 0) goto L73
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L73:
            android.view.View r4 = r3.u(r6)
            return r4
        L78:
            int r4 = h7.y0.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L85
        L83:
            r4 = 0
            return r4
        L85:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = h7.y0.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto La3
            int r5 = r3.B()
            if (r4 < r5) goto L9c
            goto La3
        L9c:
            c5.a r4 = r3.f5563q
            r4.l()
            r4 = 0
            throw r4
        La3:
            boolean r4 = r3.F0()
            if (r4 == 0) goto Laa
            goto Lb0
        Laa:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lb0:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, h7.f1, h7.j1):android.view.View");
    }

    @Override // h7.y0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(y0.H(u(0)));
            accessibilityEvent.setToIndex(y0.H(u(v() - 1)));
        }
    }

    @Override // h7.y0
    public final void Y(int i10, int i11) {
        B();
    }

    @Override // h7.y0
    public final void Z() {
        B();
    }

    @Override // h7.i1
    public final PointF a(int i10) {
        return null;
    }

    @Override // h7.y0
    public final void b0(int i10, int i11) {
        B();
    }

    @Override // h7.y0
    public final boolean d() {
        return E0();
    }

    @Override // h7.y0
    public final void d0(f1 f1Var, j1 j1Var) {
        if (j1Var.b() > 0) {
            if ((E0() ? this.f10284n : this.f10285o) > 0.0f) {
                F0();
                f1Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        j0(f1Var);
    }

    @Override // h7.y0
    public final boolean e() {
        return !E0();
    }

    @Override // h7.y0
    public final void e0(j1 j1Var) {
        if (v() == 0) {
            return;
        }
        y0.H(u(0));
    }

    @Override // h7.y0
    public final int j(j1 j1Var) {
        v();
        return 0;
    }

    @Override // h7.y0
    public final int k(j1 j1Var) {
        return 0;
    }

    @Override // h7.y0
    public final int l(j1 j1Var) {
        return 0;
    }

    @Override // h7.y0
    public final int m(j1 j1Var) {
        v();
        return 0;
    }

    @Override // h7.y0
    public final int n(j1 j1Var) {
        return 0;
    }

    @Override // h7.y0
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }

    @Override // h7.y0
    public final int o(j1 j1Var) {
        return 0;
    }

    @Override // h7.y0
    public final int p0(int i10, f1 f1Var, j1 j1Var) {
        if (!E0() || v() == 0 || i10 == 0) {
            return 0;
        }
        f1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // h7.y0
    public final void q0(int i10) {
    }

    @Override // h7.y0
    public final z0 r() {
        return new z0(-2, -2);
    }

    @Override // h7.y0
    public final int r0(int i10, f1 f1Var, j1 j1Var) {
        if (!e() || v() == 0 || i10 == 0) {
            return 0;
        }
        f1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // h7.y0
    public final void y(Rect rect, View view) {
        RecyclerView.N(rect, view);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new b();
        this.f5564r = new od.a(0, this);
        this.f5562p = new e();
        o0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.Carousel);
            typedArrayObtainStyledAttributes.getInt(l.Carousel_carousel_alignment, 0);
            o0();
            G0(typedArrayObtainStyledAttributes.getInt(g7.c.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
