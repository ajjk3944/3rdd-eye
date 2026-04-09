package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.ex0;
import defpackage.gn0;
import defpackage.ho0;
import defpackage.io0;
import defpackage.no0;
import defpackage.qd;
import defpackage.rd;
import defpackage.sd;
import defpackage.so0;
import defpackage.td;
import defpackage.to0;
import defpackage.vq;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends ho0 implements so0 {
    public final vq p;
    public td q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        vq vqVar = new vq();
        new rd();
        this.r = new View.OnLayoutChangeListener() { // from class: pd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new e2(2, this.a));
            }
        };
        this.p = vqVar;
        m0();
        E0(0);
    }

    public final float B0(float f, float f2) {
        return D0() ? f - f2 : f + f2;
    }

    public final boolean C0() {
        return this.q.b == 0;
    }

    public final boolean D0() {
        return C0() && C() == 1;
    }

    public final void E0(int i) {
        sd sdVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ex0.f("invalid orientation:", i));
        }
        c(null);
        td tdVar = this.q;
        if (tdVar == null || i != tdVar.b) {
            if (i == 0) {
                sdVar = new sd(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                sdVar = new sd(this, 0);
            }
            this.q = sdVar;
            m0();
        }
    }

    @Override // defpackage.ho0
    public final boolean L() {
        return true;
    }

    @Override // defpackage.ho0
    public final void R(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        vq vqVar = this.p;
        float dimension = vqVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        vqVar.a = dimension;
        float dimension2 = vqVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        vqVar.b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.ho0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @Override // defpackage.ho0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r4, int r5, defpackage.no0 r6, defpackage.to0 r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L83
        L8:
            td r6 = r3.q
            int r6 = r6.b
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
            boolean r5 = r3.D0()
            if (r5 == 0) goto L29
        L33:
            r5 = r0
            goto L41
        L35:
            if (r6 != r1) goto L25
            goto L33
        L38:
            if (r6 != 0) goto L25
            boolean r5 = r3.D0()
            if (r5 == 0) goto L33
            goto L29
        L41:
            if (r5 != r7) goto L44
            goto L83
        L44:
            r6 = 0
            if (r5 != r0) goto L78
            int r4 = defpackage.ho0.H(r4)
            if (r4 != 0) goto L4e
            goto L83
        L4e:
            android.view.View r4 = r3.u(r6)
            int r4 = defpackage.ho0.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L67
            int r5 = r3.B()
            if (r4 < r5) goto L60
            goto L67
        L60:
            td r4 = r3.q
            r4.d()
            r4 = 0
            throw r4
        L67:
            boolean r4 = r3.D0()
            if (r4 == 0) goto L73
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L73:
            android.view.View r4 = r3.u(r6)
            return r4
        L78:
            int r4 = defpackage.ho0.H(r4)
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
            int r4 = defpackage.ho0.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto La3
            int r5 = r3.B()
            if (r4 < r5) goto L9c
            goto La3
        L9c:
            td r4 = r3.q
            r4.d()
            r4 = 0
            throw r4
        La3:
            boolean r4 = r3.D0()
            if (r4 == 0) goto Laa
            goto Lb0
        Laa:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lb0:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, no0, to0):android.view.View");
    }

    @Override // defpackage.ho0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(ho0.H(u(0)));
            accessibilityEvent.setToIndex(ho0.H(u(v() - 1)));
        }
    }

    @Override // defpackage.ho0
    public final void X(int i, int i2) {
        B();
    }

    @Override // defpackage.ho0
    public final void Y() {
        B();
    }

    @Override // defpackage.so0
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.ho0
    public final void a0(int i, int i2) {
        B();
    }

    @Override // defpackage.ho0
    public final void c0(no0 no0Var, to0 to0Var) {
        if (to0Var.b() > 0) {
            if ((C0() ? this.n : this.o) > 0.0f) {
                D0();
                no0Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        h0(no0Var);
    }

    @Override // defpackage.ho0
    public final boolean d() {
        return C0();
    }

    @Override // defpackage.ho0
    public final void d0(to0 to0Var) {
        if (v() == 0) {
            return;
        }
        ho0.H(u(0));
    }

    @Override // defpackage.ho0
    public final boolean e() {
        return !C0();
    }

    @Override // defpackage.ho0
    public final int j(to0 to0Var) {
        v();
        return 0;
    }

    @Override // defpackage.ho0
    public final int k(to0 to0Var) {
        return 0;
    }

    @Override // defpackage.ho0
    public final int l(to0 to0Var) {
        return 0;
    }

    @Override // defpackage.ho0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.ho0
    public final int m(to0 to0Var) {
        v();
        return 0;
    }

    @Override // defpackage.ho0
    public final int n(to0 to0Var) {
        return 0;
    }

    @Override // defpackage.ho0
    public final int n0(int i, no0 no0Var, to0 to0Var) {
        if (!C0() || v() == 0 || i == 0) {
            return 0;
        }
        no0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.ho0
    public final int o(to0 to0Var) {
        return 0;
    }

    @Override // defpackage.ho0
    public final int p0(int i, no0 no0Var, to0 to0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        no0Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.ho0
    public final io0 r() {
        return new io0(-2, -2);
    }

    @Override // defpackage.ho0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (C0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.ho0
    public final void y0(RecyclerView recyclerView, int i) {
        qd qdVar = new qd(this, recyclerView.getContext());
        qdVar.a = i;
        z0(qdVar);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new rd();
        this.r = new View.OnLayoutChangeListener() { // from class: pd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new e2(2, this.a));
            }
        };
        this.p = new vq();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.f);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            E0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.ho0
    public final void o0(int i) {
    }
}
