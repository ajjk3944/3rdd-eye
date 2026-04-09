package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import g0.C4356c;

/* compiled from: AbsActionBarView.java */
/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5383a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final C0504a f44613b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f44614c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f44615d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.a f44616e;

    /* renamed from: f, reason: collision with root package name */
    public int f44617f;

    /* renamed from: g, reason: collision with root package name */
    public L0.S f44618g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44619h;
    public boolean i;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: o.a$a, reason: collision with other inner class name */
    public class C0504a implements L0.T {

        /* renamed from: b, reason: collision with root package name */
        public boolean f44620b = false;

        /* renamed from: c, reason: collision with root package name */
        public int f44621c;

        public C0504a() {
        }

        @Override // L0.T
        public final void a() {
            this.f44620b = true;
        }

        @Override // L0.T
        public final void d() {
            AbstractC5383a.super.setVisibility(0);
            this.f44620b = false;
        }

        @Override // L0.T
        public final void e() {
            if (this.f44620b) {
                return;
            }
            AbstractC5383a abstractC5383a = AbstractC5383a.this;
            abstractC5383a.f44618g = null;
            AbstractC5383a.super.setVisibility(this.f44621c);
        }
    }

    public AbstractC5383a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i10);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(View view, boolean z10, int i, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iC = C4356c.c(i11, measuredHeight, 2, i10);
        if (z10) {
            view.layout(i - measuredWidth, iC, i, measuredHeight + iC);
        } else {
            view.layout(i, iC, i + measuredWidth, measuredHeight + iC);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final L0.S e(int i, long j4) {
        L0.S s10 = this.f44618g;
        if (s10 != null) {
            s10.b();
        }
        C0504a c0504a = this.f44613b;
        if (i != 0) {
            L0.S sA = L0.I.a(this);
            sA.a(0.0f);
            sA.c(j4);
            AbstractC5383a.this.f44618g = sA;
            c0504a.f44621c = i;
            sA.d(c0504a);
            return sA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        L0.S sA2 = L0.I.a(this);
        sA2.a(1.0f);
        sA2.c(j4);
        AbstractC5383a.this.f44618g = sA2;
        c0504a.f44621c = i;
        sA2.d(c0504a);
        return sA2;
    }

    public int getAnimatedVisibility() {
        return this.f44618g != null ? this.f44613b.f44621c : getVisibility();
    }

    public int getContentHeight() {
        return this.f44617f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C4353a.f37876a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f44616e;
        if (aVar != null) {
            Configuration configuration2 = aVar.f14376c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            aVar.f14767q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i10 > 720) || (i > 720 && i10 > 960)) ? 5 : (i >= 500 || (i > 640 && i10 > 480) || (i > 480 && i10 > 640)) ? 4 : i >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.f fVar = aVar.f14377d;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.i = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f44619h = false;
        }
        if (!this.f44619h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f44619h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f44619h = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f44617f = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            L0.S s10 = this.f44618g;
            if (s10 != null) {
                s10.b();
            }
            super.setVisibility(i);
        }
    }

    public AbstractC5383a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44613b = new C0504a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f44614c = context;
        } else {
            this.f44614c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
