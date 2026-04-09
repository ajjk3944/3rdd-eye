package com.wifihacker.detector.mvp.view.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class RecyclerViewHeader extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f20508a;

    /* renamed from: b, reason: collision with root package name */
    public int f20509b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20511d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20512e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20513f;

    /* renamed from: g, reason: collision with root package name */
    public e f20514g;

    /* renamed from: h, reason: collision with root package name */
    public d f20515h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            RecyclerViewHeader.this.h();
        }
    }

    public class b implements RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f20517a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RecyclerViewHeader.this.f20514g.h();
                RecyclerViewHeader.this.h();
            }
        }

        public b(RecyclerView recyclerView) {
            this.f20517a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(View view) {
            this.f20517a.post(new a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(View view) {
        }
    }

    public class c extends RecyclerView.m {

        /* renamed from: a, reason: collision with root package name */
        public int f20520a;

        /* renamed from: b, reason: collision with root package name */
        public int f20521b;

        /* renamed from: c, reason: collision with root package name */
        public int f20522c;

        public c() {
            this.f20522c = RecyclerViewHeader.this.f20515h.a();
        }

        public void d(int i10) {
            this.f20520a = i10;
        }

        public void e(int i10) {
            this.f20521b = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            super.getItemOffsets(rect, view, recyclerView, yVar);
            int i10 = 0;
            boolean z10 = recyclerView.n0(view) < this.f20522c;
            int i11 = (z10 && RecyclerViewHeader.this.f20512e) ? this.f20520a : 0;
            if (z10 && !RecyclerViewHeader.this.f20512e) {
                i10 = this.f20521b;
            }
            if (RecyclerViewHeader.this.f20515h.c()) {
                rect.bottom = i11;
                rect.right = i10;
            } else {
                rect.top = i11;
                rect.left = i10;
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final LinearLayoutManager f20524a;

        /* renamed from: b, reason: collision with root package name */
        public final GridLayoutManager f20525b;

        /* renamed from: c, reason: collision with root package name */
        public final StaggeredGridLayoutManager f20526c;

        public d(RecyclerView.n nVar) {
            Class<?> cls = nVar.getClass();
            if (cls == LinearLayoutManager.class) {
                this.f20524a = (LinearLayoutManager) nVar;
                this.f20525b = null;
                this.f20526c = null;
            } else {
                if (cls != GridLayoutManager.class) {
                    throw new IllegalArgumentException("Currently RecyclerViewHeader supports only LinearLayoutManager and GridLayoutManager.");
                }
                this.f20524a = null;
                this.f20525b = (GridLayoutManager) nVar;
                this.f20526c = null;
            }
        }

        public static d e(RecyclerView.n nVar) {
            return new d(nVar);
        }

        public final int a() {
            if (this.f20524a != null) {
                return 1;
            }
            GridLayoutManager gridLayoutManager = this.f20525b;
            if (gridLayoutManager != null) {
                return gridLayoutManager.g0();
            }
            return 0;
        }

        public final boolean b() {
            LinearLayoutManager linearLayoutManager = this.f20524a;
            if (linearLayoutManager != null) {
                return linearLayoutManager.findFirstVisibleItemPosition() == 0;
            }
            GridLayoutManager gridLayoutManager = this.f20525b;
            return gridLayoutManager != null && gridLayoutManager.findFirstVisibleItemPosition() == 0;
        }

        public final boolean c() {
            LinearLayoutManager linearLayoutManager = this.f20524a;
            if (linearLayoutManager != null) {
                return linearLayoutManager.getReverseLayout();
            }
            GridLayoutManager gridLayoutManager = this.f20525b;
            if (gridLayoutManager != null) {
                return gridLayoutManager.getReverseLayout();
            }
            return false;
        }

        public final boolean d() {
            LinearLayoutManager linearLayoutManager = this.f20524a;
            if (linearLayoutManager != null) {
                return linearLayoutManager.getOrientation() == 1;
            }
            GridLayoutManager gridLayoutManager = this.f20525b;
            return gridLayoutManager != null && gridLayoutManager.getOrientation() == 1;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final RecyclerView f20527a;

        /* renamed from: b, reason: collision with root package name */
        public c f20528b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.s f20529c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView.p f20530d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.h();
            }
        }

        public e(RecyclerView recyclerView) {
            this.f20527a = recyclerView;
        }

        public static e o(RecyclerView recyclerView) {
            return new e(recyclerView);
        }

        public final void b() {
            c cVar = this.f20528b;
            if (cVar != null) {
                this.f20527a.k1(cVar);
                this.f20528b = null;
            }
        }

        public final void c() {
            RecyclerView.p pVar = this.f20530d;
            if (pVar != null) {
                this.f20527a.l1(pVar);
                this.f20530d = null;
            }
        }

        public final void d() {
            RecyclerView.s sVar = this.f20529c;
            if (sVar != null) {
                this.f20527a.n1(sVar);
                this.f20529c = null;
            }
        }

        public final int e(boolean z10) {
            return z10 ? this.f20527a.computeVerticalScrollOffset() : this.f20527a.computeHorizontalScrollOffset();
        }

        public final int f(boolean z10) {
            int iComputeHorizontalScrollRange;
            int width;
            if (z10) {
                iComputeHorizontalScrollRange = this.f20527a.computeVerticalScrollRange();
                width = this.f20527a.getHeight();
            } else {
                iComputeHorizontalScrollRange = this.f20527a.computeHorizontalScrollRange();
                width = this.f20527a.getWidth();
            }
            return iComputeHorizontalScrollRange - width;
        }

        public final boolean g() {
            return (this.f20527a.getAdapter() == null || this.f20527a.getAdapter().getItemCount() == 0) ? false : true;
        }

        public final void h() {
            if (this.f20527a.F0()) {
                return;
            }
            this.f20527a.D0();
        }

        public final void i(int i10, int i11) {
            c cVar = this.f20528b;
            if (cVar != null) {
                cVar.d(i10);
                this.f20528b.e(i11);
                this.f20527a.post(new a());
            }
        }

        public boolean j(MotionEvent motionEvent) {
            return this.f20527a.onInterceptTouchEvent(motionEvent);
        }

        public boolean k(MotionEvent motionEvent) {
            try {
                return this.f20527a.onTouchEvent(motionEvent);
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public final void l(c cVar) {
            b();
            this.f20528b = cVar;
            this.f20527a.k(cVar, 0);
        }

        public final void m(RecyclerView.p pVar) {
            c();
            this.f20530d = pVar;
            this.f20527a.l(pVar);
        }

        public final void n(RecyclerView.s sVar) {
            d();
            this.f20529c = sVar;
            this.f20527a.n(sVar);
        }
    }

    public RecyclerViewHeader(Context context) {
        super(context);
        this.f20508a = 0;
        this.f20510c = false;
    }

    public final void f(RecyclerView recyclerView) {
        i(recyclerView);
        this.f20514g = e.o(recyclerView);
        d dVarE = d.e(recyclerView.getLayoutManager());
        this.f20515h = dVarE;
        this.f20512e = dVarE.d();
        this.f20513f = true;
        this.f20514g.l(new c());
        this.f20514g.n(new a());
        this.f20514g.m(new b(recyclerView));
    }

    public final int g() {
        return (this.f20515h.c() ? this.f20514g.f(this.f20512e) : 0) - this.f20514g.e(this.f20512e);
    }

    @Override // android.view.View
    public final int getVisibility() {
        return this.f20508a;
    }

    public final void h() {
        boolean z10 = this.f20514g.g() && !this.f20515h.b();
        this.f20510c = z10;
        super.setVisibility(z10 ? 4 : this.f20508a);
        if (this.f20510c) {
            return;
        }
        int iG = g();
        if (this.f20512e) {
            setTranslationY(iG);
        } else {
            setTranslationX(iG);
        }
    }

    public final void i(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() == null) {
            throw new IllegalStateException("Be sure to attach RecyclerViewHeader after ic_setting your RecyclerView's LayoutManager.");
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f20513f && this.f20514g.j(motionEvent);
        this.f20511d = z10;
        if (z10 && motionEvent.getAction() == 2) {
            this.f20509b = g();
        }
        return this.f20511d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.f20513f) {
            if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                i14 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                i15 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            } else {
                i14 = 0;
                i15 = 0;
            }
            this.f20514g.i(getHeight() + i14, getWidth() + i15);
            h();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20511d) {
            return super.onTouchEvent(motionEvent);
        }
        int iG = this.f20509b - g();
        boolean z10 = this.f20512e;
        int i10 = z10 ? iG : 0;
        if (z10) {
            iG = 0;
        }
        this.f20514g.k(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX() - iG, motionEvent.getY() - i10, motionEvent.getMetaState()));
        return false;
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        this.f20508a = i10;
        if (this.f20510c) {
            return;
        }
        super.setVisibility(i10);
    }

    public RecyclerViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20508a = 0;
        this.f20510c = false;
    }

    public RecyclerViewHeader(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20508a = 0;
        this.f20510c = false;
    }
}
