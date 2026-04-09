package ql;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroupOverlay;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.datepicker.i;
import com.liuzh.deviceinfo.R;
import km.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f32451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32452b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f32453c;

    /* renamed from: d, reason: collision with root package name */
    public final n f32454d;

    /* renamed from: e, reason: collision with root package name */
    public final a f32455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32456f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32457h;

    /* renamed from: i, reason: collision with root package name */
    public final View f32458i;
    public final View j;

    /* renamed from: k, reason: collision with root package name */
    public final AppCompatTextView f32459k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f32460l;

    /* renamed from: m, reason: collision with root package name */
    public int f32461m;

    /* renamed from: n, reason: collision with root package name */
    public float f32462n;

    /* renamed from: o, reason: collision with root package name */
    public float f32463o;

    /* renamed from: p, reason: collision with root package name */
    public float f32464p;

    /* renamed from: q, reason: collision with root package name */
    public float f32465q;

    /* renamed from: r, reason: collision with root package name */
    public int f32466r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32467s;

    /* renamed from: t, reason: collision with root package name */
    public final b f32468t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f32469u;

    public c(RecyclerView recyclerView, n nVar, Drawable drawable, Drawable drawable2, a aVar) {
        RecyclerView recyclerView2 = (RecyclerView) nVar.f28442b;
        this.f32468t = new b(this, 0);
        this.f32469u = new Rect();
        this.f32451a = recyclerView.getResources().getDimensionPixelSize(R.dimen.afs_min_touch_target_size);
        Context context = recyclerView.getContext();
        this.f32452b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f32453c = recyclerView;
        this.f32454d = nVar;
        this.f32455e = aVar;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth < 0) {
            throw new IllegalArgumentException("trackDrawable.getIntrinsicWidth() < 0");
        }
        this.f32456f = intrinsicWidth;
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        if (intrinsicWidth2 < 0) {
            throw new IllegalArgumentException("thumbDrawable.getIntrinsicWidth() < 0");
        }
        this.g = intrinsicWidth2;
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight < 0) {
            throw new IllegalArgumentException("thumbDrawable.getIntrinsicHeight() < 0");
        }
        this.f32457h = intrinsicHeight;
        View view = new View(context);
        this.f32458i = view;
        view.setBackground(drawable);
        View view2 = new View(context);
        this.j = view2;
        view2.setBackground(drawable2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        this.f32459k = appCompatTextView;
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        zh.e.f38292a.accept(appCompatTextView);
        ViewGroupOverlay overlay = recyclerView.getOverlay();
        overlay.add(view);
        overlay.add(view2);
        overlay.add(appCompatTextView);
        f();
        appCompatTextView.setAlpha(0.0f);
        recyclerView2.i(new i(3, new b(this, 1)));
        recyclerView2.j(new u(1, new b(this, 2)));
        recyclerView2.f1251r.add(new e(new lf.e(9, this)));
    }

    public final Rect a() {
        RecyclerView recyclerView = this.f32453c;
        int paddingLeft = recyclerView.getPaddingLeft();
        int paddingTop = recyclerView.getPaddingTop();
        int paddingRight = recyclerView.getPaddingRight();
        int paddingBottom = recyclerView.getPaddingBottom();
        Rect rect = this.f32469u;
        rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return rect;
    }

    public final int b() {
        int itemCount;
        int iL;
        n nVar = this.f32454d;
        RecyclerView recyclerView = (RecyclerView) nVar.f28442b;
        LinearLayoutManager linearLayoutManagerN = nVar.n();
        int paddingBottom = 0;
        if (linearLayoutManagerN == null || (itemCount = linearLayoutManagerN.getItemCount()) == 0) {
            itemCount = 0;
        } else if (linearLayoutManagerN instanceof GridLayoutManager) {
            itemCount = ((itemCount - 1) / ((GridLayoutManager) linearLayoutManagerN).f1211b) + 1;
        }
        if (itemCount != 0 && (iL = nVar.l()) != 0) {
            paddingBottom = recyclerView.getPaddingBottom() + (itemCount * iL) + recyclerView.getPaddingTop();
        }
        return paddingBottom - this.f32453c.getHeight();
    }

    public final boolean c(int i4, float f10, int i10, int i11) {
        int i12 = i10 - i4;
        int i13 = this.f32451a;
        if (i12 < i13) {
            int i14 = i4 - ((i13 - i12) / 2);
            if (i14 < 0) {
                i14 = 0;
            }
            int i15 = i14 + i13;
            if (i15 > i11) {
                i14 = i11 - i13;
                if (i14 < 0) {
                    i14 = 0;
                }
            } else {
                i11 = i15;
            }
            if (f10 >= i14 && f10 < i11) {
                return true;
            }
        } else if (f10 >= i4 && f10 < i10) {
            return true;
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        RecyclerView recyclerView = this.f32453c;
        int scrollX = recyclerView.getScrollX();
        int scrollY = recyclerView.getScrollY();
        return c(view.getLeft() - scrollX, f10, view.getRight() - scrollX, recyclerView.getWidth()) && c(view.getTop() - scrollY, f11, view.getBottom() - scrollY, recyclerView.getHeight());
    }

    public final void e(View view, int i4, int i10, int i11, int i12) {
        RecyclerView recyclerView = this.f32453c;
        int scrollX = recyclerView.getScrollX();
        int scrollY = recyclerView.getScrollY();
        view.layout(i4 + scrollX, i10 + scrollY, scrollX + i11, scrollY + i12);
    }

    public final void f() {
        RecyclerView recyclerView = this.f32453c;
        b bVar = this.f32468t;
        recyclerView.removeCallbacks(bVar);
        this.f32455e.getClass();
        recyclerView.postDelayed(bVar, TTAdConstant.STYLE_SIZE_RADIO_3_2);
    }

    public final void g(int i4) {
        Rect rectA = a();
        int iB = (int) ((b() * com.bumptech.glide.d.i(i4, 0, r1)) / (((this.f32453c.getHeight() - rectA.top) - rectA.bottom) - this.f32457h));
        n nVar = this.f32454d;
        RecyclerView recyclerView = (RecyclerView) nVar.f28442b;
        recyclerView.s0();
        int paddingTop = iB - recyclerView.getPaddingTop();
        int iL = nVar.l();
        int iMax = Math.max(0, paddingTop / iL);
        int i10 = (iL * iMax) - paddingTop;
        LinearLayoutManager linearLayoutManagerN = nVar.n();
        if (linearLayoutManagerN == null) {
            return;
        }
        if (linearLayoutManagerN instanceof GridLayoutManager) {
            iMax *= ((GridLayoutManager) linearLayoutManagerN).f1211b;
        }
        linearLayoutManagerN.scrollToPositionWithOffset(iMax, i10 - recyclerView.getPaddingTop());
    }

    public final void h(boolean z3) {
        if (this.f32467s == z3) {
            return;
        }
        this.f32467s = z3;
        RecyclerView recyclerView = this.f32453c;
        if (z3) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z10 = this.f32467s;
        View view = this.f32458i;
        view.setPressed(z10);
        boolean z11 = this.f32467s;
        View view2 = this.j;
        view2.setPressed(z11);
        boolean z12 = this.f32467s;
        AppCompatTextView appCompatTextView = this.f32459k;
        a aVar = this.f32455e;
        if (!z12) {
            f();
            if (aVar.f32448c) {
                aVar.f32448c = false;
                appCompatTextView.animate().alpha(0.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        recyclerView.removeCallbacks(this.f32468t);
        aVar.a(view, view2);
        if (aVar.f32448c) {
            return;
        }
        aVar.f32448c = true;
        appCompatTextView.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            if (r0 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = r1
        La:
            r10.f32460l = r2
            if (r2 == 0) goto L79
            android.graphics.Rect r2 = r10.a()
            androidx.recyclerview.widget.RecyclerView r3 = r10.f32453c
            int r3 = r3.getHeight()
            int r4 = r2.top
            int r3 = r3 - r4
            int r2 = r2.bottom
            int r3 = r3 - r2
            int r2 = r10.f32457h
            int r3 = r3 - r2
            long r2 = (long) r3
            km.n r4 = r10.f32454d
            java.lang.Object r5 = r4.f28442b
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            int r6 = r5.getChildCount()
            r7 = -1
            if (r6 != 0) goto L31
        L2f:
            r6 = r7
            goto L40
        L31:
            android.view.View r6 = r5.getChildAt(r1)
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.n()
            if (r8 != 0) goto L3c
            goto L2f
        L3c:
            int r6 = r8.getPosition(r6)
        L40:
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.n()
            if (r8 != 0) goto L48
            r6 = r7
            goto L51
        L48:
            boolean r9 = r8 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r9 == 0) goto L51
            androidx.recyclerview.widget.GridLayoutManager r8 = (androidx.recyclerview.widget.GridLayoutManager) r8
            int r8 = r8.f1211b
            int r6 = r6 / r8
        L51:
            if (r6 != r7) goto L54
            goto L74
        L54:
            int r8 = r4.l()
            java.lang.Object r4 = r4.f28443c
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r9 = r5.getChildCount()
            if (r9 != 0) goto L63
            goto L6c
        L63:
            android.view.View r1 = r5.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView.Q(r4, r1)
            int r7 = r4.top
        L6c:
            int r1 = r5.getPaddingTop()
            int r6 = r6 * r8
            int r6 = r6 + r1
            int r1 = r6 - r7
        L74:
            long r4 = (long) r1
            long r2 = r2 * r4
            long r0 = (long) r0
            long r2 = r2 / r0
            int r1 = (int) r2
        L79:
            r10.f32461m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.c.i():void");
    }
}
