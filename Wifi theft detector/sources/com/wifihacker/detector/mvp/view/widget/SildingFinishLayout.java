package com.wifihacker.detector.mvp.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Scroller;

/* loaded from: classes3.dex */
public class SildingFinishLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f20532a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f20533b;

    /* renamed from: c, reason: collision with root package name */
    public int f20534c;

    /* renamed from: d, reason: collision with root package name */
    public int f20535d;

    /* renamed from: e, reason: collision with root package name */
    public int f20536e;

    /* renamed from: f, reason: collision with root package name */
    public int f20537f;

    /* renamed from: g, reason: collision with root package name */
    public Scroller f20538g;

    /* renamed from: h, reason: collision with root package name */
    public int f20539h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20540i;

    /* renamed from: j, reason: collision with root package name */
    public a f20541j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20542k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20543l;

    /* renamed from: m, reason: collision with root package name */
    public int f20544m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20545n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20546o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20547p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20548q;

    public interface a {
        void a();

        void b();
    }

    public SildingFinishLayout(Context context) {
        super(context);
        this.f20532a = SildingFinishLayout.class.getName();
        this.f20542k = true;
        this.f20543l = true;
        this.f20545n = false;
        this.f20547p = false;
        this.f20548q = false;
        a(context);
    }

    public final void a(Context context) {
        this.f20534c = ViewConfiguration.get(context).getScaledTouchSlop();
        Log.i(this.f20532a, "设备的最小滑动距离:" + this.f20534c);
        this.f20538g = new Scroller(context);
    }

    public final void b() {
        int scrollX = this.f20533b.getScrollX();
        this.f20538g.startScroll(this.f20533b.getScrollX(), 0, -scrollX, 0, Math.abs(scrollX));
        postInvalidate();
    }

    public final void c() {
        int scrollX = this.f20539h - this.f20533b.getScrollX();
        this.f20538g.startScroll(this.f20533b.getScrollX(), 0, scrollX - 1, 0, Math.abs(scrollX));
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f20538g.computeScrollOffset()) {
            this.f20533b.scrollTo(this.f20538g.getCurrX(), this.f20538g.getCurrY());
            postInvalidate();
            if (this.f20538g.isFinished() && this.f20541j != null && this.f20546o) {
                Log.i(this.f20532a, "mScroller finish");
                if (this.f20547p) {
                    this.f20541j.a();
                }
                if (this.f20548q) {
                    this.f20541j.b();
                }
            }
        }
    }

    public final void d() {
        int scrollX = this.f20539h + this.f20533b.getScrollX();
        this.f20538g.startScroll(this.f20533b.getScrollX(), 0, (-scrollX) + 1, 0, Math.abs(scrollX));
        postInvalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        Log.i(this.f20532a, "downX =" + rawX + ",viewWidth=" + this.f20539h);
        if (this.f20542k && rawX < this.f20544m) {
            Log.e(this.f20532a, "downX 在左侧范围内 ,拦截事件");
            this.f20545n = true;
            this.f20547p = true;
            this.f20548q = false;
            return false;
        }
        if (!this.f20543l || rawX <= this.f20539h - this.f20544m) {
            this.f20545n = false;
            this.f20547p = false;
            this.f20548q = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f20545n = true;
        this.f20548q = true;
        this.f20547p = false;
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f20533b = (ViewGroup) getParent();
            int width = getWidth();
            this.f20539h = width;
            this.f20544m = width;
        }
        Log.i(this.f20532a, "viewWidth=" + this.f20539h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20545n) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            int rawX = (int) motionEvent.getRawX();
            this.f20537f = rawX;
            this.f20535d = rawX;
            this.f20536e = (int) motionEvent.getRawY();
        } else if (action == 1) {
            this.f20540i = false;
            if (this.f20533b.getScrollX() <= (-this.f20539h) / 2 || this.f20533b.getScrollX() >= this.f20539h / 2) {
                this.f20546o = true;
                if (this.f20547p) {
                    d();
                }
                if (this.f20548q) {
                    c();
                }
            } else {
                b();
                this.f20546o = false;
            }
        } else if (action == 2) {
            int rawX2 = (int) motionEvent.getRawX();
            int i10 = this.f20537f - rawX2;
            this.f20537f = rawX2;
            if (Math.abs(rawX2 - this.f20535d) > this.f20534c && Math.abs(((int) motionEvent.getRawY()) - this.f20536e) < this.f20534c) {
                this.f20540i = true;
            }
            Log.e(this.f20532a, "scroll deltaX=" + i10);
            if (this.f20542k && rawX2 - this.f20535d >= 0 && this.f20540i) {
                this.f20533b.scrollBy(i10, 0);
            }
            if (this.f20543l && rawX2 - this.f20535d <= 0 && this.f20540i) {
                this.f20533b.scrollBy(i10, 0);
            }
            Log.i(this.f20532a + "/onTouchEvent", "mParentView.getScrollX()=" + this.f20533b.getScrollX());
        }
        return true;
    }

    public void setEnableLeftSildeEvent(boolean z10) {
        this.f20542k = z10;
    }

    public void setEnableRightSildeEvent(boolean z10) {
        this.f20543l = z10;
    }

    public void setOnSildingFinishListener(a aVar) {
        this.f20541j = aVar;
    }

    public SildingFinishLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20532a = SildingFinishLayout.class.getName();
        this.f20542k = true;
        this.f20543l = true;
        this.f20545n = false;
        this.f20547p = false;
        this.f20548q = false;
        a(context);
    }

    public SildingFinishLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20532a = SildingFinishLayout.class.getName();
        this.f20542k = true;
        this.f20543l = true;
        this.f20545n = false;
        this.f20547p = false;
        this.f20548q = false;
        a(context);
    }
}
