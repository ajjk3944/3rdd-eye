package O6;

import H6.C0672i;
import K6.C0713c;
import L0.C0776g;
import N7.B8;
import N7.X2;
import N7.Z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2097r;
import java.util.List;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivStateLayout.kt */
/* loaded from: classes.dex */
public final class A extends r7.g implements l<Z.m> {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Z.m> f10363n;

    /* renamed from: o, reason: collision with root package name */
    public C5865d f10364o;

    /* renamed from: p, reason: collision with root package name */
    public final a f10365p;

    /* renamed from: q, reason: collision with root package name */
    public final C0776g f10366q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC5480a<C1992A> f10367r;

    /* renamed from: s, reason: collision with root package name */
    public Z f10368s;

    /* renamed from: t, reason: collision with root package name */
    public p9.l<? super String, C1992A> f10369t;

    /* compiled from: DivStateLayout.kt */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        public static boolean a(View view, float f10, float f11, int i) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (f10 >= childAt.getLeft() && f10 < childAt.getRight() && f11 >= childAt.getTop() && f11 < childAt.getBottom() && a(childAt, f10 - childAt.getLeft(), f11 - childAt.getTop(), i)) {
                        return true;
                    }
                }
            }
            return view.canScrollHorizontally(i);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent e4) {
            kotlin.jvm.internal.l.f(e4, "e");
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if (a(r7, r6.getX(), r6.getY(), r0) != false) goto L16;
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
            /*
                r5 = this;
                java.lang.String r0 = "e2"
                kotlin.jvm.internal.l.f(r7, r0)
                O6.A r7 = O6.A.this
                int r0 = r7.getChildCount()
                r1 = 0
                if (r0 <= 0) goto L13
                android.view.View r7 = r7.getChildAt(r1)
                goto L14
            L13:
                r7 = 0
            L14:
                if (r7 != 0) goto L17
                goto L45
            L17:
                if (r6 != 0) goto L1a
                goto L45
            L1a:
                float r0 = java.lang.Math.signum(r8)
                int r0 = (int) r0
                float r2 = r7.getTranslationX()
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L46
                float r2 = java.lang.Math.abs(r8)
                r4 = 2
                float r4 = (float) r4
                float r9 = java.lang.Math.abs(r9)
                float r9 = r9 * r4
                int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r9 <= 0) goto L46
                float r9 = r6.getX()
                float r6 = r6.getY()
                boolean r6 = a(r7, r9, r6, r0)
                if (r6 == 0) goto L46
            L45:
                return r1
            L46:
                float r6 = r7.getTranslationX()
                float r6 = r6 - r8
                int r8 = r7.getWidth()
                float r8 = (float) r8
                float r8 = -r8
                int r9 = r7.getWidth()
                float r9 = (float) r9
                float r6 = B7.d.g(r6, r8, r9)
                r7.setTranslationX(r6)
                float r6 = r7.getTranslationX()
                int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                r7 = 1
                if (r6 != 0) goto L67
                r1 = r7
            L67:
                r6 = r1 ^ 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: O6.A.a.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    public A(Context context) {
        super(context, null, 0);
        this.f10363n = new m<>();
        a aVar = new a();
        this.f10365p = aVar;
        this.f10366q = new C0776g(context, aVar, new Handler(Looper.getMainLooper()));
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.m> mVar = this.f10363n;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10363n.c();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (super.canScrollHorizontally(i)) {
            return true;
        }
        if (getChildCount() < 1 || this.f10367r == null) {
            return super.canScrollHorizontally(i);
        }
        View childAt = getChildAt(0);
        return i < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10363n.d(bindingContext, x22, view);
    }

    @Override // android.view.View
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

    @Override // android.view.ViewGroup
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
        this.f10363n.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10363n.f10430c.g();
    }

    public final Z getActiveStateDiv$div_release() {
        return this.f10368s;
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10363n.f10432e;
    }

    @Override // O6.l
    public Z.m getDiv() {
        return (Z.m) this.f10363n.f10431d;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10363n.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10363n.f10429b.f10420c;
    }

    public final C5865d getPath() {
        return this.f10364o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getStateId() {
        C5865d c5865d = this.f10364o;
        if (c5865d == null) {
            return null;
        }
        List<b9.l<String, String>> list = c5865d.f48459b;
        if (list.isEmpty()) {
            return null;
        }
        return (String) ((b9.l) C2097r.v0(list)).f18084c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10363n.f10433f;
    }

    public final InterfaceC5480a<C1992A> getSwipeOutCallback() {
        return this.f10367r;
    }

    public final p9.l<String, C1992A> getVariableUpdater() {
        return this.f10369t;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.m> mVar = this.f10363n;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10363n.j(view);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        if (this.f10367r == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.f10366q.f3911a.onTouchEvent(event);
        a aVar = this.f10365p;
        A a10 = A.this;
        View childAt = a10.getChildCount() > 0 ? a10.getChildAt(0) : null;
        requestDisallowInterceptTouchEvent(!((childAt != null ? childAt.getTranslationX() : 0.0f) == 0.0f));
        A a11 = A.this;
        View childAt2 = a11.getChildCount() > 0 ? a11.getChildAt(0) : null;
        if ((childAt2 != null ? childAt2.getTranslationX() : 0.0f) == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10363n.a();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent event) {
        float fAbs;
        z zVar;
        float fSignum;
        kotlin.jvm.internal.l.f(event, "event");
        if (this.f10367r == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            a aVar = this.f10365p;
            A a10 = A.this;
            View childAt = a10.getChildCount() > 0 ? a10.getChildAt(0) : null;
            if (childAt != null) {
                if (Math.abs(childAt.getTranslationX()) > childAt.getWidth() / 2) {
                    fAbs = (Math.abs(childAt.getWidth() - childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    fSignum = Math.signum(childAt.getTranslationX()) * childAt.getWidth();
                    zVar = new z(A.this);
                } else {
                    fAbs = (Math.abs(childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    zVar = null;
                    fSignum = 0.0f;
                }
                childAt.animate().cancel();
                childAt.animate().setDuration((long) B7.d.g(fAbs, 0.0f, 300.0f)).translationX(fSignum).setListener(zVar).start();
            }
        }
        if (this.f10366q.f3911a.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10363n.release();
    }

    public final void setActiveStateDiv$div_release(Z z10) {
        this.f10368s = z10;
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10363n.f10432e = c0672i;
    }

    @Override // O6.l
    public void setDiv(Z.m mVar) {
        this.f10363n.f10431d = mVar;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10363n.setNeedClipping(z10);
    }

    public final void setPath(C5865d c5865d) {
        this.f10364o = c5865d;
    }

    public final void setSwipeOutCallback(InterfaceC5480a<C1992A> interfaceC5480a) {
        this.f10367r = interfaceC5480a;
    }

    public final void setVariableUpdater(p9.l<? super String, C1992A> lVar) {
        this.f10369t = lVar;
    }
}
