package androidx.appcompat.widget;

import F1.C2745e0;
import F1.InterfaceC2747f0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import h.AbstractC5927a;
import h.AbstractC5936j;
import org.snmp4j.mp.PduHandle;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3876a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C1022a f27312a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f27313b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f27314c;

    /* renamed from: d, reason: collision with root package name */
    protected C3878c f27315d;

    /* renamed from: e, reason: collision with root package name */
    protected int f27316e;

    /* renamed from: f, reason: collision with root package name */
    protected C2745e0 f27317f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27318g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27319h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C1022a implements InterfaceC2747f0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27320a = false;

        /* renamed from: b, reason: collision with root package name */
        int f27321b;

        protected C1022a() {
        }

        @Override // F1.InterfaceC2747f0
        public void a(View view) {
            this.f27320a = true;
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            if (this.f27320a) {
                return;
            }
            AbstractC3876a abstractC3876a = AbstractC3876a.this;
            abstractC3876a.f27317f = null;
            AbstractC3876a.super.setVisibility(this.f27321b);
        }

        @Override // F1.InterfaceC2747f0
        public void c(View view) {
            AbstractC3876a.super.setVisibility(0);
            this.f27320a = false;
        }

        public C1022a d(C2745e0 c2745e0, int i10) {
            AbstractC3876a.this.f27317f = c2745e0;
            this.f27321b = i10;
            return this;
        }
    }

    AbstractC3876a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27312a = new C1022a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC5927a.f47938a, typedValue, true) || typedValue.resourceId == 0) {
            this.f27313b = context;
        } else {
            this.f27313b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, PduHandle.NONE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
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

    public C2745e0 f(int i10, long j10) {
        C2745e0 c2745e0 = this.f27317f;
        if (c2745e0 != null) {
            c2745e0.c();
        }
        if (i10 != 0) {
            C2745e0 c2745e0B = F1.W.e(this).b(0.0f);
            c2745e0B.f(j10);
            c2745e0B.h(this.f27312a.d(c2745e0B, i10));
            return c2745e0B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2745e0 c2745e0B2 = F1.W.e(this).b(1.0f);
        c2745e0B2.f(j10);
        c2745e0B2.h(this.f27312a.d(c2745e0B2, i10));
        return c2745e0B2;
    }

    public int getAnimatedVisibility() {
        return this.f27317f != null ? this.f27312a.f27321b : getVisibility();
    }

    public int getContentHeight() {
        return this.f27316e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC5936j.f48189a, AbstractC5927a.f47940c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC5936j.f48234j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C3878c c3878c = this.f27315d;
        if (c3878c != null) {
            c3878c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f27319h = false;
        }
        if (!this.f27319h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f27319h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f27319h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27318g = false;
        }
        if (!this.f27318g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f27318g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f27318g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C2745e0 c2745e0 = this.f27317f;
            if (c2745e0 != null) {
                c2745e0.c();
            }
            super.setVisibility(i10);
        }
    }
}
