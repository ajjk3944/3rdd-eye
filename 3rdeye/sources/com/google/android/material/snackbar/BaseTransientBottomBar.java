package com.google.android.material.snackbar;

import B7.d;
import D0.a;
import L0.I;
import L0.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import d4.n;
import h4.C4415c;
import java.util.WeakHashMap;
import l4.C5287f;
import l4.C5290i;
import n4.C5357b;
import r4.C5522a;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23031a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final b i;

        public Behavior() {
            b bVar = new b();
            this.f22503f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.f22504g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f22501d = 0;
            this.i = bVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (C5357b.a().f44279a) {
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C5357b.a().b();
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.i.getClass();
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    public static class b {
    }

    public static class c extends FrameLayout {

        /* renamed from: k, reason: collision with root package name */
        public static final a f23032k = new a();

        /* renamed from: b, reason: collision with root package name */
        public BaseTransientBottomBar<?> f23033b;

        /* renamed from: c, reason: collision with root package name */
        public final C5290i f23034c;

        /* renamed from: d, reason: collision with root package name */
        public int f23035d;

        /* renamed from: e, reason: collision with root package name */
        public final float f23036e;

        /* renamed from: f, reason: collision with root package name */
        public final float f23037f;

        /* renamed from: g, reason: collision with root package name */
        public final int f23038g;

        /* renamed from: h, reason: collision with root package name */
        public final int f23039h;
        public ColorStateList i;

        /* renamed from: j, reason: collision with root package name */
        public PorterDuff.Mode f23040j;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
            GradientDrawable gradientDrawable;
            super(C5522a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, K3.a.f3138z);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.d.s(this, dimensionPixelSize);
            }
            this.f23035d = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f23034c = C5290i.b(context2, attributeSet, 0, 0).a();
            }
            this.f23036e = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C4415c.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(n.b(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f23037f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f23038g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f23039h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f23032k);
            setFocusable(true);
            if (getBackground() == null) {
                int iS = d.s(getBackgroundOverlayColorAlpha(), d.m(R.attr.colorSurface, this), d.m(R.attr.colorOnSurface, this));
                C5290i c5290i = this.f23034c;
                if (c5290i != null) {
                    int i = BaseTransientBottomBar.f23031a;
                    C5287f c5287f = new C5287f(c5290i);
                    c5287f.k(ColorStateList.valueOf(iS));
                    gradientDrawable = c5287f;
                } else {
                    Resources resources = getResources();
                    int i10 = BaseTransientBottomBar.f23031a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(iS);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.i;
                if (colorStateList != null) {
                    a.C0009a.h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                setBackground(gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f23033b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f23037f;
        }

        public int getAnimationMode() {
            return this.f23035d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f23036e;
        }

        public int getMaxInlineActionWidth() {
            return this.f23039h;
        }

        public int getMaxWidth() {
            return this.f23038g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f23033b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.c.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f23033b != null) {
                synchronized (C5357b.a().f44279a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
            super.onLayout(z10, i, i10, i11, i12);
            if (this.f23033b != null) {
                throw null;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i10) {
            super.onMeasure(i, i10);
            int i11 = this.f23038g;
            if (i11 <= 0 || getMeasuredWidth() <= i11) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }

        public void setAnimationMode(int i) {
            this.f23035d = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.i != null) {
                drawable = drawable.mutate();
                a.C0009a.h(drawable, this.i);
                a.C0009a.i(drawable, this.f23040j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                a.C0009a.h(drawableMutate, colorStateList);
                a.C0009a.i(drawableMutate, this.f23040j);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f23040j = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                a.C0009a.i(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f23033b == null) {
                    return;
                }
                int i = BaseTransientBottomBar.f23031a;
                throw null;
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f23032k);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = L3.a.f4034a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
