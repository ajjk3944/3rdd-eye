package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;

/* loaded from: classes2.dex */
public class w extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f10759a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f10760b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f10761c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10763e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10764f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10765g;

    public class a implements g0 {
        public a() {
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            w wVar = w.this;
            if (wVar.f10760b == null) {
                wVar.f10760b = new Rect();
            }
            w.this.f10760b.set(windowInsetsCompat.j(), windowInsetsCompat.l(), windowInsetsCompat.k(), windowInsetsCompat.i());
            w.this.e(windowInsetsCompat);
            w.this.setWillNotDraw(!windowInsetsCompat.m() || w.this.f10759a == null);
            w.this.postInvalidateOnAnimation();
            return windowInsetsCompat.c();
        }
    }

    public w(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f10760b == null || this.f10759a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f10762d) {
            this.f10761c.set(0, 0, width, this.f10760b.top);
            this.f10759a.setBounds(this.f10761c);
            this.f10759a.draw(canvas);
        }
        if (this.f10763e) {
            this.f10761c.set(0, height - this.f10760b.bottom, width, height);
            this.f10759a.setBounds(this.f10761c);
            this.f10759a.draw(canvas);
        }
        if (this.f10764f) {
            Rect rect = this.f10761c;
            Rect rect2 = this.f10760b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f10759a.setBounds(this.f10761c);
            this.f10759a.draw(canvas);
        }
        if (this.f10765g) {
            Rect rect3 = this.f10761c;
            Rect rect4 = this.f10760b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f10759a.setBounds(this.f10761c);
            this.f10759a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void e(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f10759a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f10759a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f10763e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f10764f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f10765g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f10762d = z10;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f10759a = drawable;
    }

    public w(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public w(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10761c = new Rect();
        this.f10762d = true;
        this.f10763e = true;
        this.f10764f = true;
        this.f10765g = true;
        TypedArray typedArrayI = a0.i(context, attributeSet, j4.l.ScrimInsetsFrameLayout, i10, j4.k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f10759a = typedArrayI.getDrawable(j4.l.ScrimInsetsFrameLayout_insetForeground);
        typedArrayI.recycle();
        setWillNotDraw(true);
        ViewCompat.t0(this, new a());
    }
}
