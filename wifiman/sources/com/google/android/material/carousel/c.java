package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final int f37209a;

    class a extends c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f37210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f37210b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f37210b.b0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.f37210b.i0();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f37210b.s0() - this.f37210b.j0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iG = g();
            this.f37210b.D0(view, iG, i10, iG + m(view), i11);
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f37210b.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }
    }

    class b extends c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f37211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f37211b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f37211b.b0() - this.f37211b.h0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.f37211b.F2() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f37211b.s0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.f37211b.F2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.f37211b.k0();
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iJ = j();
            this.f37211b.D0(view, i10, iJ, i11, iJ + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f37211b.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
    }

    /* synthetic */ c(int i10, a aVar) {
        this(i10);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract float d(RecyclerView.p pVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i10, int i11);

    abstract void l(View view, Rect rect, float f10, float f11);

    private c(int i10) {
        this.f37209a = i10;
    }
}
