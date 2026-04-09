package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0007a f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1086b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1087c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuPresenter f1088d;

    /* renamed from: e, reason: collision with root package name */
    public int f1089e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.core.view.g1 f1090f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1091g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1092h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0007a implements androidx.core.view.h1 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1093a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1094b;

        public C0007a() {
        }

        @Override // androidx.core.view.h1
        public void a(View view) {
            this.f1093a = true;
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            if (this.f1093a) {
                return;
            }
            a aVar = a.this;
            aVar.f1090f = null;
            a.super.setVisibility(this.f1094b);
        }

        @Override // androidx.core.view.h1
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1093a = false;
        }

        public C0007a d(androidx.core.view.g1 g1Var, int i10) {
            a.this.f1090f = g1Var;
            this.f1094b = i10;
            return this;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1085a = new C0007a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(c.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1086b = context;
        } else {
            this.f1086b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.g1 f(int i10, long j10) {
        androidx.core.view.g1 g1Var = this.f1090f;
        if (g1Var != null) {
            g1Var.c();
        }
        if (i10 != 0) {
            androidx.core.view.g1 g1VarB = ViewCompat.e(this).b(0.0f);
            g1VarB.e(j10);
            g1VarB.g(this.f1085a.d(g1VarB, i10));
            return g1VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.g1 g1VarB2 = ViewCompat.e(this).b(1.0f);
        g1VarB2.e(j10);
        g1VarB2.g(this.f1085a.d(g1VarB2, i10));
        return g1VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f1090f != null ? this.f1085a.f1094b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1089e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, c.j.ActionBar, c.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(c.j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1088d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1092h = false;
        }
        if (!this.f1092h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1092h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1092h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1091g = false;
        }
        if (!this.f1091g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1091g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1091g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.g1 g1Var = this.f1090f;
            if (g1Var != null) {
                g1Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
