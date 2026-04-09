package com.google.android.material.snackbar;

import F1.W;
import O3.j;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.n;
import f.AbstractC5487d;
import f4.C5527g;
import f4.C5531k;
import i4.AbstractC6074a;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f37650a = P3.a.f18022b;

    /* renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f37651b = P3.a.f18021a;

    /* renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f37652c = P3.a.f18024d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f37654e = false;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f37655f = {O3.a.f16955I};

    /* renamed from: g, reason: collision with root package name */
    private static final String f37656g = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    static final Handler f37653d = new Handler(Looper.getMainLooper(), new a());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        private final b f37657k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f37657k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f37657k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                AbstractC5487d.a(message.obj);
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            AbstractC5487d.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    protected static class c extends FrameLayout {

        /* renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f37658k = new a();

        /* renamed from: a, reason: collision with root package name */
        C5531k f37659a;

        /* renamed from: b, reason: collision with root package name */
        private int f37660b;

        /* renamed from: c, reason: collision with root package name */
        private final float f37661c;

        /* renamed from: d, reason: collision with root package name */
        private final float f37662d;

        /* renamed from: e, reason: collision with root package name */
        private final int f37663e;

        /* renamed from: f, reason: collision with root package name */
        private final int f37664f;

        /* renamed from: g, reason: collision with root package name */
        private ColorStateList f37665g;

        /* renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f37666h;

        /* renamed from: i, reason: collision with root package name */
        private Rect f37667i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f37668j;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(AbstractC6074a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.f17175C4);
            if (typedArrayObtainStyledAttributes.hasValue(j.f17231J4)) {
                W.t0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f37660b = typedArrayObtainStyledAttributes.getInt(j.f17199F4, 0);
            if (typedArrayObtainStyledAttributes.hasValue(j.f17247L4) || typedArrayObtainStyledAttributes.hasValue(j.f17255M4)) {
                this.f37659a = C5531k.e(context2, attributeSet, 0, 0).m();
            }
            this.f37661c = typedArrayObtainStyledAttributes.getFloat(j.f17207G4, 1.0f);
            setBackgroundTintList(c4.c.a(context2, typedArrayObtainStyledAttributes, j.f17215H4));
            setBackgroundTintMode(n.i(typedArrayObtainStyledAttributes.getInt(j.f17223I4, -1), PorterDuff.Mode.SRC_IN));
            this.f37662d = typedArrayObtainStyledAttributes.getFloat(j.f17191E4, 1.0f);
            this.f37663e = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17183D4, -1);
            this.f37664f = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17239K4, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f37658k);
            setFocusable(true);
            if (getBackground() == null) {
                W.q0(this, a());
            }
        }

        private Drawable a() {
            int iK = V3.a.k(this, O3.a.f16972k, O3.a.f16969h, getBackgroundOverlayColorAlpha());
            C5531k c5531k = this.f37659a;
            Drawable drawableD = c5531k != null ? BaseTransientBottomBar.d(iK, c5531k) : BaseTransientBottomBar.c(iK, getResources());
            if (this.f37665g == null) {
                return AbstractC8416a.r(drawableD);
            }
            Drawable drawableR = AbstractC8416a.r(drawableD);
            AbstractC8416a.o(drawableR, this.f37665g);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f37667i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f37662d;
        }

        int getAnimationMode() {
            return this.f37660b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f37661c;
        }

        int getMaxInlineActionWidth() {
            return this.f37664f;
        }

        int getMaxWidth() {
            return this.f37663e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            W.j0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f37663e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f37663e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f37660b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f37665g != null) {
                drawable = AbstractC8416a.r(drawable.mutate());
                AbstractC8416a.o(drawable, this.f37665g);
                AbstractC8416a.p(drawable, this.f37666h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f37665g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = AbstractC8416a.r(getBackground().mutate());
                AbstractC8416a.o(drawableR, colorStateList);
                AbstractC8416a.p(drawableR, this.f37666h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f37666h = mode;
            if (getBackground() != null) {
                Drawable drawableR = AbstractC8416a.r(getBackground().mutate());
                AbstractC8416a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f37668j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f37658k);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(O3.c.f17014U);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5527g d(int i10, C5531k c5531k) {
        C5527g c5527g = new C5527g(c5531k);
        c5527g.T(ColorStateList.valueOf(i10));
        return c5527g;
    }
}
