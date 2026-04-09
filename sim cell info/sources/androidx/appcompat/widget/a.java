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

/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    protected final C0005a f860b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f861c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuView f862d;

    /* renamed from: e, reason: collision with root package name */
    protected c f863e;

    /* renamed from: f, reason: collision with root package name */
    protected int f864f;

    /* renamed from: g, reason: collision with root package name */
    protected a0.w f865g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f866h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f867i;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0005a implements a0.x {

        /* renamed from: a, reason: collision with root package name */
        private boolean f868a = false;

        /* renamed from: b, reason: collision with root package name */
        int f869b;

        protected C0005a() {
        }

        @Override // a0.x
        public void a(View view) {
            if (this.f868a) {
                return;
            }
            a aVar = a.this;
            aVar.f865g = null;
            a.super.setVisibility(this.f869b);
        }

        @Override // a0.x
        public void b(View view) {
            a.super.setVisibility(0);
            this.f868a = false;
        }

        @Override // a0.x
        public void c(View view) {
            this.f868a = true;
        }

        public C0005a d(a0.w wVar, int i2) {
            a.this.f865g = wVar;
            this.f869b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f860b = new C0005a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.f0a, typedValue, true) || typedValue.resourceId == 0) {
            this.f861c = context;
        } else {
            this.f861c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    protected int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int e(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public a0.w f(int i2, long j2) {
        a0.w wVarA;
        a0.w wVar = this.f865g;
        if (wVar != null) {
            wVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            wVarA = a0.s.b(this).a(1.0f);
        } else {
            wVarA = a0.s.b(this).a(0.0f);
        }
        wVarA.d(j2);
        wVarA.f(this.f860b.d(wVarA, i2));
        return wVarA;
    }

    public int getAnimatedVisibility() {
        return this.f865g != null ? this.f860b.f869b : getVisibility();
    }

    public int getContentHeight() {
        return this.f864f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.j.f133a, a.a.f2c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a.j.f151j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f863e;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f867i = false;
        }
        if (!this.f867i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f867i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f867i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f866h = false;
        }
        if (!this.f866h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f866h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f866h = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f864f = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            a0.w wVar = this.f865g;
            if (wVar != null) {
                wVar.b();
            }
            super.setVisibility(i2);
        }
    }
}
