package O6;

import H6.C0672i;
import H6.O;
import K6.C0713c;
import N7.B8;
import N7.C1322q5;
import N7.X2;
import N7.Z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import m.C5306c;

/* compiled from: DivRecyclerView.kt */
/* loaded from: classes.dex */
public final class v extends J6.a implements l<Z.c> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Z.c> f10464c;

    /* renamed from: d, reason: collision with root package name */
    public int f10465d;

    /* renamed from: e, reason: collision with root package name */
    public int f10466e;

    /* renamed from: f, reason: collision with root package name */
    public int f10467f;

    /* renamed from: g, reason: collision with root package name */
    public float f10468g;

    /* renamed from: h, reason: collision with root package name */
    public r7.h f10469h;
    public C1322q5.c i;

    /* renamed from: j, reason: collision with root package name */
    public L6.k f10470j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10471k;

    /* renamed from: l, reason: collision with root package name */
    public int f10472l;

    public v(Context context) {
        super(new C5306c(context, 2132017472));
        this.f10464c = new m<>();
        this.f10465d = -1;
        this.i = C1322q5.c.DEFAULT;
        this.f10472l = -1;
    }

    public static int a(float f10) {
        return (int) Math.ceil(f10);
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.c> mVar = this.f10464c;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10464c.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10464c.d(bindingContext, x22, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10464c.e(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i10) {
        boolean zFling = super.fling(i, i10);
        if (getScrollMode() == C1322q5.c.PAGING) {
            this.f10471k = !zFling;
        }
        return zFling;
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10464c.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10464c.f10432e;
    }

    @Override // O6.l
    public Z.c getDiv() {
        return (Z.c) this.f10464c.f10431d;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10464c.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10464c.f10429b.f10420c;
    }

    public r7.h getOnInterceptTouchEventListener() {
        return this.f10469h;
    }

    public L6.k getPagerSnapStartHelper() {
        return this.f10470j;
    }

    public float getScrollInterceptionAngle() {
        return this.f10468g;
    }

    public C1322q5.c getScrollMode() {
        return this.i;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10464c.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.c> mVar = this.f10464c;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10464c.j(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        int iFindPointerIndex;
        kotlin.jvm.internal.l.f(event, "event");
        r7.h onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            onInterceptTouchEventListener.a(this, event);
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            this.f10465d = event.getPointerId(0);
            this.f10466e = a(event.getX());
            this.f10467f = a(event.getY());
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(event);
            }
            this.f10465d = event.getPointerId(actionIndex);
            this.f10466e = a(event.getX(actionIndex));
            this.f10467f = a(event.getY(actionIndex));
            return super.onInterceptTouchEvent(event);
        }
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager != null && (iFindPointerIndex = event.findPointerIndex(this.f10465d)) >= 0) {
            int iA = a(event.getX(iFindPointerIndex));
            int iA2 = a(event.getY(iFindPointerIndex));
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(event);
            }
            int iAbs = Math.abs(iA - this.f10466e);
            int iAbs2 = Math.abs(iA2 - this.f10467f);
            if (iAbs != 0 || iAbs2 != 0) {
                double dAtan = iAbs != 0 ? (Math.atan(iAbs2 / iAbs) * 180) / 3.141592653589793d : 90.0d;
                if ((layoutManager.v() && dAtan <= getScrollInterceptionAngle()) || (layoutManager.w() && dAtan > getScrollInterceptionAngle())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        if (i == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.f10472l = -1;
                return;
            }
            this.f10472l = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onScrolled(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f10472l
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$p r0 = r3.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L13
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.f16414p
            goto L1d
        L13:
            boolean r1 = r0 instanceof com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager
            if (r1 == 0) goto L1c
            com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager r0 = (com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager) r0
            int r0 = r0.f16554t
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r1 = 1
            if (r0 != r1) goto L26
            if (r5 <= 0) goto L26
            int r0 = r3.f10472l
        L24:
            int r0 = r0 + r1
            goto L36
        L26:
            if (r0 != r1) goto L2e
            if (r5 > 0) goto L2e
            int r0 = r3.f10472l
        L2c:
            int r0 = r0 - r1
            goto L36
        L2e:
            if (r4 <= 0) goto L33
            int r0 = r3.f10472l
            goto L24
        L33:
            int r0 = r3.f10472l
            goto L2c
        L36:
            androidx.recyclerview.widget.RecyclerView$F r0 = r3.findViewHolderForAdapterPosition(r0)
            r1 = 0
            if (r0 == 0) goto L40
            android.view.View r0 = r0.itemView
            goto L41
        L40:
            r0 = r1
        L41:
            boolean r2 = r0 instanceof X6.g
            if (r2 == 0) goto L48
            r1 = r0
            X6.g r1 = (X6.g) r1
        L48:
            if (r1 == 0) goto L53
            android.view.View r0 = r1.getChild()
            if (r0 == 0) goto L53
            r0.requestFocus()
        L53:
            super.onScrolled(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.v.onScrolled(int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10464c.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView.p layoutManager;
        L6.k pagerSnapStartHelper;
        View viewC;
        int[] iArrB;
        int i;
        C1322q5.c scrollMode = getScrollMode();
        C1322q5.c cVar = C1322q5.c.PAGING;
        if (scrollMode == cVar) {
            this.f10471k = true;
        }
        boolean z10 = super.onTouchEvent(motionEvent) && (canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1));
        if (motionEvent != null && motionEvent.getActionMasked() == 1 && getScrollMode() == cVar && this.f10471k && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (viewC = pagerSnapStartHelper.c(layoutManager)) != null && ((i = (iArrB = pagerSnapStartHelper.b(layoutManager, viewC))[0]) != 0 || iArrB[1] != 0)) {
            smoothScrollBy(i, iArrB[1]);
        }
        return z10;
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
        C1476b divBorderDrawer = this.f10464c.f10429b.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.h();
        }
        Object adapter = getAdapter();
        if (adapter instanceof O) {
            ((O) adapter).release();
        }
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10464c.f10432e = c0672i;
    }

    @Override // O6.l
    public void setDiv(Z.c cVar) {
        this.f10464c.f10431d = cVar;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10464c.setNeedClipping(z10);
    }

    public void setOnInterceptTouchEventListener(r7.h hVar) {
        this.f10469h = hVar;
    }

    public void setPagerSnapStartHelper(L6.k kVar) {
        this.f10470j = kVar;
    }

    public void setScrollInterceptionAngle(float f10) {
        this.f10468g = f10 != 0.0f ? Math.abs(f10) % 90 : 0.0f;
    }

    public void setScrollMode(C1322q5.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "<set-?>");
        this.i = cVar;
    }
}
