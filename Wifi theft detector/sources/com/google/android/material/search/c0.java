package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.d0;
import com.google.android.material.search.SearchView;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SearchView f10874a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10875b;

    /* renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f10876c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f10877d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f10878e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f10879f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f10880g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f10881h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10882i;

    /* renamed from: j, reason: collision with root package name */
    public final EditText f10883j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageButton f10884k;

    /* renamed from: l, reason: collision with root package name */
    public final View f10885l;

    /* renamed from: m, reason: collision with root package name */
    public final TouchObserverFrameLayout f10886m;

    /* renamed from: n, reason: collision with root package name */
    public final b5.i f10887n;

    /* renamed from: o, reason: collision with root package name */
    public AnimatorSet f10888o;

    /* renamed from: p, reason: collision with root package name */
    public SearchBar f10889p;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!c0.this.f10874a.s()) {
                c0.this.f10874a.z();
            }
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c0.this.f10876c.setVisibility(0);
            c0.this.f10889p.l0();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.this.f10876c.setVisibility(8);
            if (!c0.this.f10874a.s()) {
                c0.this.f10874a.p();
            }
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!c0.this.f10874a.s()) {
                c0.this.f10874a.z();
            }
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c0.this.f10876c.setVisibility(0);
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.this.f10876c.setVisibility(8);
            if (!c0.this.f10874a.s()) {
                c0.this.f10874a.p();
            }
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c0.this.f10874a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10894a;

        public e(boolean z10) {
            this.f10894a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.this.d0(this.f10894a ? 1.0f : 0.0f);
            c0.this.f10883j.setAlpha(1.0f);
            if (c0.this.f10889p != null) {
                c0.this.f10889p.getTextView().setAlpha(1.0f);
            }
            c0.this.f10883j.setClipBounds(null);
            c0.this.f10876c.a();
            if (this.f10894a) {
                return;
            }
            c0.this.f10887n.j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c0.this.d0(this.f10894a ? 0.0f : 1.0f);
        }
    }

    public c0(SearchView searchView) {
        this.f10874a = searchView;
        this.f10875b = searchView.f10831a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f10832b;
        this.f10876c = clippableRoundedCornerLayout;
        this.f10877d = searchView.f10835e;
        this.f10878e = searchView.f10836f;
        this.f10879f = searchView.f10837g;
        this.f10880g = searchView.f10838h;
        this.f10882i = searchView.f10839i;
        this.f10883j = searchView.f10841k;
        this.f10884k = searchView.f10842l;
        this.f10885l = searchView.f10843m;
        this.f10886m = searchView.f10844n;
        this.f10881h = searchView.f10840j;
        this.f10887n = new b5.i(clippableRoundedCornerLayout);
    }

    public static float[] Z(float f10, float[] fArr, float f11) {
        return new float[]{k4.a.a(f10, fArr[0], f11), k4.a.a(f10, fArr[1], f11), k4.a.a(f10, fArr[2], f11), k4.a.a(f10, fArr[3], f11), k4.a.a(f10, fArr[4], f11), k4.a.a(f10, fArr[5], f11), k4.a.a(f10, fArr[6], f11), k4.a.a(f10, fArr[7], f11)};
    }

    public static /* synthetic */ void a(c0 c0Var) {
        c0Var.f10876c.setTranslationY(r0.getHeight());
        AnimatorSet animatorSetR = c0Var.R(true);
        animatorSetR.addListener(c0Var.new c());
        animatorSetR.start();
    }

    public static float[] a0(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    public static /* synthetic */ void b(c0 c0Var, ValueAnimator valueAnimator) {
        c0Var.f10883j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        c0Var.f10889p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void c(c0 c0Var, Rect rect, ValueAnimator valueAnimator) {
        c0Var.getClass();
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c0Var.f10883j.setClipBounds(rect);
    }

    public static /* synthetic */ void d(c0 c0Var) {
        AnimatorSet animatorSetJ = c0Var.J(true);
        animatorSetJ.addListener(c0Var.new a());
        animatorSetJ.start();
    }

    public static /* synthetic */ void g(c0 c0Var, float f10, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        c0Var.getClass();
        c0Var.f10876c.c(rect, Z(f10, fArr, valueAnimator.getAnimatedFraction()));
    }

    public final AnimatorSet A(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        q(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        return animatorSet;
    }

    public final AnimatorSet B(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        r(animatorSet);
        o(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        return animatorSet;
    }

    public final Animator C(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21834a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f10884k));
        return valueAnimatorOfFloat;
    }

    public final Animator D(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21834a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f10885l, this.f10886m));
        return valueAnimatorOfFloat;
    }

    public final Animator E(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(D(z10), G(z10), F(z10));
        return animatorSet;
    }

    public final Animator F(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.f(this.f10886m));
        return valueAnimatorOfFloat;
    }

    public final Animator G(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f10886m.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.l(this.f10885l));
        return valueAnimatorOfFloat;
    }

    public final Animator H(boolean z10) {
        Toolbar toolbar = this.f10880g;
        return S(z10, toolbar, K(toolbar), L());
    }

    public final Animator I(boolean z10) {
        return T(z10, this.f10883j);
    }

    public final AnimatorSet J(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f10888o == null) {
            animatorSet.playTogether(A(z10), B(z10));
        }
        animatorSet.playTogether(O(z10), N(z10), C(z10), E(z10), M(z10), H(z10), y(z10), I(z10), P(z10), Q(z10));
        animatorSet.addListener(new e(z10));
        return animatorSet;
    }

    public final int K(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iW = W(this.f10889p);
        return d0.l(this.f10889p) ? iW - marginEnd : ((iW + this.f10889p.getWidth()) + marginEnd) - this.f10874a.getWidth();
    }

    public final int L() {
        return (X(this.f10889p) + (this.f10889p.getHeight() / 2)) - (this.f10878e.getTop() + (this.f10878e.getHeight() / 2));
    }

    public final Animator M(boolean z10) {
        FrameLayout frameLayout = this.f10877d;
        return S(z10, frameLayout, K(frameLayout), L());
    }

    public final Animator N(boolean z10) {
        Rect rectP = this.f10887n.p();
        Rect rectO = this.f10887n.o();
        if (rectP == null) {
            rectP = d0.c(this.f10874a);
        }
        if (rectO == null) {
            rectO = d0.b(this.f10876c, this.f10889p);
        }
        final Rect rect = new Rect(rectO);
        final float cornerSize = this.f10889p.getCornerSize();
        final float[] fArrA0 = a0(this.f10876c.getCornerRadii(), this.f10887n.n());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.u(rect), rectO, rectP);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c0.g(this.f10916a, cornerSize, fArrA0, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        return valueAnimatorOfObject;
    }

    public final Animator O(boolean z10) {
        TimeInterpolator timeInterpolator = z10 ? k4.a.f21834a : k4.a.f21835b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 100L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f10875b));
        return valueAnimatorOfFloat;
    }

    public final Animator P(boolean z10) {
        return T(z10, this.f10882i);
    }

    public final AnimatorSet Q(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        v(animatorSet);
        t(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21834a));
        return animatorSet;
    }

    public final AnimatorSet R(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(V());
        q(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    public final Animator S(boolean z10, View view, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i10, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i11, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        return animatorSet;
    }

    public final Animator T(boolean z10, View view) {
        TextView placeholderTextView = this.f10889p.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
            placeholderTextView = this.f10889p.getTextView();
        }
        return S(z10, view, W(placeholderTextView) - (view.getLeft() + this.f10881h.getLeft()), L());
    }

    public final int U(View view, View view2) {
        if (view != null) {
            return W(view) - W(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f10889p.getPaddingStart();
        int iW = W(this.f10889p);
        return d0.l(this.f10889p) ? (((iW + this.f10889p.getWidth()) + marginStart) - paddingStart) - this.f10874a.getRight() : (iW - marginStart) + paddingStart;
    }

    public final Animator V() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f10876c.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.l(this.f10876c));
        return valueAnimatorOfFloat;
    }

    public final int W(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f10874a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final int X(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f10874a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public AnimatorSet Y() {
        return this.f10889p != null ? k0() : l0();
    }

    public BackEventCompat b0() {
        return this.f10887n.c();
    }

    public final void c0(float f10) {
        ActionMenuView actionMenuViewA;
        if (!this.f10874a.v() || (actionMenuViewA = com.google.android.material.internal.b0.a(this.f10879f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f10);
    }

    public final void d0(float f10) {
        this.f10884k.setAlpha(f10);
        this.f10885l.setAlpha(f10);
        this.f10886m.setAlpha(f10);
        c0(f10);
    }

    public final void e0(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).e(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawable).a(1.0f);
        }
    }

    public final void f0(Toolbar toolbar) {
        ActionMenuView actionMenuViewA = com.google.android.material.internal.b0.a(toolbar);
        if (actionMenuViewA != null) {
            for (int i10 = 0; i10 < actionMenuViewA.getChildCount(); i10++) {
                View childAt = actionMenuViewA.getChildAt(i10);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public void g0(SearchBar searchBar) {
        this.f10889p = searchBar;
    }

    public final void h0() {
        Menu menu = this.f10880g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f10889p.getMenuResId() == -1 || !this.f10874a.v()) {
            this.f10880g.setVisibility(8);
            return;
        }
        this.f10880g.x(this.f10889p.getMenuResId());
        f0(this.f10880g);
        this.f10880g.setVisibility(0);
    }

    public void i0() {
        if (this.f10889p != null) {
            m0();
        } else {
            n0();
        }
    }

    public void j0(BackEventCompat backEventCompat) {
        this.f10887n.v(backEventCompat, this.f10889p);
    }

    public final AnimatorSet k0() {
        if (this.f10874a.s()) {
            this.f10874a.p();
        }
        AnimatorSet animatorSetJ = J(false);
        animatorSetJ.addListener(new b());
        animatorSetJ.start();
        return animatorSetJ;
    }

    public final AnimatorSet l0() {
        if (this.f10874a.s()) {
            this.f10874a.p();
        }
        AnimatorSet animatorSetR = R(false);
        animatorSetR.addListener(new d());
        animatorSetR.start();
        return animatorSetR;
    }

    public final void m0() {
        if (this.f10874a.s()) {
            this.f10874a.z();
        }
        this.f10874a.setTransitionState(SearchView.TransitionState.SHOWING);
        h0();
        this.f10883j.setText(this.f10889p.getText());
        EditText editText = this.f10883j;
        editText.setSelection(editText.getText().length());
        this.f10876c.setVisibility(4);
        this.f10876c.post(new Runnable() { // from class: com.google.android.material.search.v
            @Override // java.lang.Runnable
            public final void run() {
                c0.d(this.f10911a);
            }
        });
    }

    public final void n0() {
        if (this.f10874a.s()) {
            final SearchView searchView = this.f10874a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.w
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.z();
                }
            }, 150L);
        }
        this.f10876c.setVisibility(4);
        this.f10876c.post(new Runnable() { // from class: com.google.android.material.search.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.a(this.f10913a);
            }
        });
    }

    public final void o(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewA = com.google.android.material.internal.b0.a(this.f10879f);
        if (actionMenuViewA == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(U(com.google.android.material.internal.b0.a(this.f10889p), actionMenuViewA), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(actionMenuViewA));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(L(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(actionMenuViewA));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    public void o0(BackEventCompat backEventCompat) {
        if (backEventCompat.a() <= 0.0f) {
            return;
        }
        b5.i iVar = this.f10887n;
        SearchBar searchBar = this.f10889p;
        iVar.x(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f10888o;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (backEventCompat.a() * this.f10888o.getDuration()));
            return;
        }
        if (this.f10874a.s()) {
            this.f10874a.p();
        }
        if (this.f10874a.t()) {
            AnimatorSet animatorSetA = A(false);
            this.f10888o = animatorSetA;
            animatorSetA.start();
            this.f10888o.pause();
        }
    }

    public final void p(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.f10889p;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public final void q(AnimatorSet animatorSet) {
        ImageButton imageButtonD = com.google.android.material.internal.b0.d(this.f10879f);
        if (imageButtonD == null) {
            return;
        }
        Drawable drawableQ = k0.a.q(imageButtonD.getDrawable());
        if (!this.f10874a.t()) {
            e0(drawableQ);
            return;
        }
        s(animatorSet, drawableQ);
        u(animatorSet, drawableQ);
        p(animatorSet, imageButtonD);
    }

    public final void r(AnimatorSet animatorSet) {
        ImageButton imageButtonD = com.google.android.material.internal.b0.d(this.f10879f);
        if (imageButtonD == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(U(com.google.android.material.internal.b0.d(this.f10889p), imageButtonD), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(imageButtonD));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(L(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(imageButtonD));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    public final void s(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    drawerArrowDrawable.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    public final void t(AnimatorSet animatorSet) {
        if (this.f10889p == null || !TextUtils.equals(this.f10883j.getText(), this.f10889p.getText())) {
            return;
        }
        final Rect rect = new Rect(0, 0, this.f10883j.getWidth(), this.f10883j.getHeight());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f10889p.getTextView().getWidth(), this.f10883j.getWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c0.c(this.f10914a, rect, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfInt);
    }

    public final void u(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.f) {
            final com.google.android.material.internal.f fVar = (com.google.android.material.internal.f) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.b0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    public final void v(AnimatorSet animatorSet) {
        if (this.f10889p == null || TextUtils.equals(this.f10883j.getText(), this.f10889p.getText())) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c0.b(this.f10909a, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public void w() {
        this.f10887n.i(this.f10889p);
        AnimatorSet animatorSet = this.f10888o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f10888o = null;
    }

    public void x() {
        this.f10887n.m(Y().getTotalDuration(), this.f10889p);
        if (this.f10888o != null) {
            B(false).start();
            this.f10888o.resume();
        }
        this.f10888o = null;
    }

    public final Animator y(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.v.a(z10, k4.a.f21835b));
        if (this.f10874a.v()) {
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.g(com.google.android.material.internal.b0.a(this.f10880g), com.google.android.material.internal.b0.a(this.f10879f)));
        }
        return valueAnimatorOfFloat;
    }

    public b5.i z() {
        return this.f10887n;
    }
}
