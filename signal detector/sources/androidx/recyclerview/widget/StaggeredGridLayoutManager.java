package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.C2351a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends Q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final p0[] f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final A f5383c;

    /* renamed from: d, reason: collision with root package name */
    public final A f5384d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5385e;

    /* renamed from: f, reason: collision with root package name */
    public int f5386f;

    /* renamed from: g, reason: collision with root package name */
    public final C0322t f5387g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5388h;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f5389j;

    /* renamed from: m, reason: collision with root package name */
    public final C2351a f5392m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5393n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5394o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5395p;

    /* renamed from: q, reason: collision with root package name */
    public o0 f5396q;

    /* renamed from: r, reason: collision with root package name */
    public int f5397r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f5398s;

    /* renamed from: t, reason: collision with root package name */
    public final l0 f5399t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5400u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5401v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f5402w;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC0315l f5403x;
    public boolean i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f5390k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f5391l = LinearLayoutManager.INVALID_OFFSET;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i3) {
        this.f5381a = -1;
        this.f5388h = false;
        C2351a c2351a = new C2351a(19, false);
        this.f5392m = c2351a;
        this.f5393n = 2;
        this.f5398s = new Rect();
        this.f5399t = new l0(this);
        this.f5400u = false;
        this.f5401v = true;
        this.f5403x = new RunnableC0315l(1, this);
        P properties = Q.getProperties(context, attributeSet, i, i3);
        int i6 = properties.f5300a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i6 != this.f5385e) {
            this.f5385e = i6;
            A a6 = this.f5383c;
            this.f5383c = this.f5384d;
            this.f5384d = a6;
            requestLayout();
        }
        int i7 = properties.f5301b;
        assertNotInLayoutOrScroll(null);
        if (i7 != this.f5381a) {
            c2351a.g();
            requestLayout();
            this.f5381a = i7;
            this.f5389j = new BitSet(this.f5381a);
            this.f5382b = new p0[this.f5381a];
            for (int i8 = 0; i8 < this.f5381a; i8++) {
                this.f5382b[i8] = new p0(this, i8);
            }
            requestLayout();
        }
        boolean z6 = properties.f5302c;
        assertNotInLayoutOrScroll(null);
        o0 o0Var = this.f5396q;
        if (o0Var != null && o0Var.f5569h != z6) {
            o0Var.f5569h = z6;
        }
        this.f5388h = z6;
        requestLayout();
        C0322t c0322t = new C0322t();
        c0322t.f5598a = true;
        c0322t.f5603f = 0;
        c0322t.f5604g = 0;
        this.f5387g = c0322t;
        this.f5383c = A.a(this, this.f5385e);
        this.f5384d = A.a(this, 1 - this.f5385e);
    }

    public static int C(int i, int i3, int i6) {
        int mode;
        return (!(i3 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i3) - i6), mode) : i;
    }

    public final void A(int i, d0 d0Var) {
        int iL;
        int iL2;
        int i3;
        C0322t c0322t = this.f5387g;
        boolean z6 = false;
        c0322t.f5599b = 0;
        c0322t.f5600c = i;
        if (!isSmoothScrolling() || (i3 = d0Var.f5442a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.i == (i3 < i)) {
                iL = this.f5383c.l();
                iL2 = 0;
            } else {
                iL2 = this.f5383c.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            c0322t.f5603f = this.f5383c.k() - iL2;
            c0322t.f5604g = this.f5383c.g() + iL;
        } else {
            c0322t.f5604g = this.f5383c.f() + iL;
            c0322t.f5603f = -iL2;
        }
        c0322t.f5605h = false;
        c0322t.f5598a = true;
        if (this.f5383c.i() == 0 && this.f5383c.f() == 0) {
            z6 = true;
        }
        c0322t.i = z6;
    }

    public final void B(p0 p0Var, int i, int i3) {
        int i6 = p0Var.f5580e;
        int i7 = p0Var.f5581f;
        if (i == -1) {
            int i8 = p0Var.f5578c;
            if (i8 == Integer.MIN_VALUE) {
                p0Var.c();
                i8 = p0Var.f5578c;
            }
            if (i8 + i6 <= i3) {
                this.f5389j.set(i7, false);
                return;
            }
            return;
        }
        int i9 = p0Var.f5579d;
        if (i9 == Integer.MIN_VALUE) {
            p0Var.b();
            i9 = p0Var.f5579d;
        }
        if (i9 - i6 >= i3) {
            this.f5389j.set(i7, false);
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f5396q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean canScrollHorizontally() {
        return this.f5385e == 0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean canScrollVertically() {
        return this.f5385e == 1;
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean checkLayoutParams(S s5) {
        return s5 instanceof m0;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void collectAdjacentPrefetchPositions(int i, int i3, d0 d0Var, O o5) {
        C0322t c0322t;
        int i6;
        int iK;
        if (this.f5385e != 0) {
            i = i3;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        t(i, d0Var);
        int[] iArr = this.f5402w;
        if (iArr == null || iArr.length < this.f5381a) {
            this.f5402w = new int[this.f5381a];
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f5381a;
            c0322t = this.f5387g;
            if (i7 >= i9) {
                break;
            }
            if (c0322t.f5601d == -1) {
                i6 = c0322t.f5603f;
                iK = this.f5382b[i7].k(i6);
            } else {
                i6 = this.f5382b[i7].i(c0322t.f5604g);
                iK = c0322t.f5604g;
            }
            int i10 = i6 - iK;
            if (i10 >= 0) {
                this.f5402w[i8] = i10;
                i8++;
            }
            i7++;
        }
        Arrays.sort(this.f5402w, 0, i8);
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = c0322t.f5600c;
            if (i12 < 0 || i12 >= d0Var.b()) {
                return;
            }
            ((C0318o) o5).a(c0322t.f5600c, this.f5402w[i11]);
            c0322t.f5600c += c0322t.f5601d;
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollExtent(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z6 = !this.f5401v;
        return com.bumptech.glide.c.g(d0Var, this.f5383c, h(z6), g(z6), this, this.f5401v);
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollOffset(d0 d0Var) {
        return e(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeHorizontalScrollRange(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z6 = !this.f5401v;
        return com.bumptech.glide.c.i(d0Var, this.f5383c, h(z6), g(z6), this, this.f5401v);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.i
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.k()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.i
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f5385e
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollExtent(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z6 = !this.f5401v;
        return com.bumptech.glide.c.g(d0Var, this.f5383c, h(z6), g(z6), this, this.f5401v);
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollOffset(d0 d0Var) {
        return e(d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public final int computeVerticalScrollRange(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z6 = !this.f5401v;
        return com.bumptech.glide.c.i(d0Var, this.f5383c, h(z6), g(z6), this, this.f5401v);
    }

    public final boolean d() {
        int iK;
        int iL;
        if (getChildCount() != 0 && this.f5393n != 0 && isAttachedToWindow()) {
            if (this.i) {
                iK = l();
                iL = k();
            } else {
                iK = k();
                iL = l();
            }
            C2351a c2351a = this.f5392m;
            if (iK == 0 && p() != null) {
                c2351a.g();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.f5400u) {
                int i = this.i ? -1 : 1;
                int i3 = iL + 1;
                n0 n0VarD = c2351a.D(iK, i3, i);
                if (n0VarD == null) {
                    this.f5400u = false;
                    c2351a.A(i3);
                    return false;
                }
                n0 n0VarD2 = c2351a.D(iK, n0VarD.f5554a, i * (-1));
                if (n0VarD2 == null) {
                    c2351a.A(n0VarD.f5554a);
                } else {
                    c2351a.A(n0VarD2.f5554a + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(d0 d0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z6 = !this.f5401v;
        return com.bumptech.glide.c.h(d0Var, this.f5383c, h(z6), g(z6), this, this.f5401v, this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.recyclerview.widget.X r23, androidx.recyclerview.widget.C0322t r24, androidx.recyclerview.widget.d0 r25) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.f(androidx.recyclerview.widget.X, androidx.recyclerview.widget.t, androidx.recyclerview.widget.d0):int");
    }

    public final View g(boolean z6) {
        int iK = this.f5383c.k();
        int iG = this.f5383c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f5383c.e(childAt);
            int iB = this.f5383c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z6) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateDefaultLayoutParams() {
        return this.f5385e == 0 ? new m0(-2, -1) : new m0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new m0(context, attributeSet);
    }

    public final View h(boolean z6) {
        int iK = this.f5383c.k();
        int iG = this.f5383c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iE = this.f5383c.e(childAt);
            if (this.f5383c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z6) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(X x6, d0 d0Var, boolean z6) {
        int iG;
        int iM = m(LinearLayoutManager.INVALID_OFFSET);
        if (iM != Integer.MIN_VALUE && (iG = this.f5383c.g() - iM) > 0) {
            int i = iG - (-scrollBy(-iG, x6, d0Var));
            if (!z6 || i <= 0) {
                return;
            }
            this.f5383c.o(i);
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean isAutoMeasureEnabled() {
        return this.f5393n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final void j(X x6, d0 d0Var, boolean z6) {
        int iK;
        int iN = n(Integer.MAX_VALUE);
        if (iN != Integer.MAX_VALUE && (iK = iN - this.f5383c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, x6, d0Var);
            if (!z6 || iScrollBy <= 0) {
                return;
            }
            this.f5383c.o(-iScrollBy);
        }
    }

    public final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int m(int i) {
        int i3 = this.f5382b[0].i(i);
        for (int i6 = 1; i6 < this.f5381a; i6++) {
            int i7 = this.f5382b[i6].i(i);
            if (i7 > i3) {
                i3 = i7;
            }
        }
        return i3;
    }

    public final int n(int i) {
        int iK = this.f5382b[0].k(i);
        for (int i3 = 1; i3 < this.f5381a; i3++) {
            int iK2 = this.f5382b[i3].k(i);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.i
            if (r0 == 0) goto L9
            int r0 = r7.l()
            goto Ld
        L9:
            int r0 = r7.k()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            h0.a r4 = r7.f5392m
            r4.I(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.K(r8, r5)
            r4.J(r9, r5)
            goto L3a
        L33:
            r4.K(r8, r9)
            goto L3a
        L37:
            r4.J(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            goto L4f
        L3d:
            boolean r8 = r7.i
            if (r8 == 0) goto L46
            int r8 = r7.k()
            goto L4a
        L46:
            int r8 = r7.l()
        L4a:
            if (r3 > r8) goto L4f
            r7.requestLayout()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.Q
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i3 = 0; i3 < this.f5381a; i3++) {
            p0 p0Var = this.f5382b[i3];
            int i6 = p0Var.f5578c;
            if (i6 != Integer.MIN_VALUE) {
                p0Var.f5578c = i6 + i;
            }
            int i7 = p0Var.f5579d;
            if (i7 != Integer.MIN_VALUE) {
                p0Var.f5579d = i7 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i3 = 0; i3 < this.f5381a; i3++) {
            p0 p0Var = this.f5382b[i3];
            int i6 = p0Var.f5578c;
            if (i6 != Integer.MIN_VALUE) {
                p0Var.f5578c = i6 + i;
            }
            int i7 = p0Var.f5579d;
            if (i7 != Integer.MIN_VALUE) {
                p0Var.f5579d = i7 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onAdapterChanged(G g2, G g6) {
        this.f5392m.g();
        for (int i = 0; i < this.f5381a; i++) {
            this.f5382b[i].d();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDetachedFromWindow(RecyclerView recyclerView, X x6) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f5403x);
        for (int i = 0; i < this.f5381a; i++) {
            this.f5382b[i].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    @Override // androidx.recyclerview.widget.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.X r11, androidx.recyclerview.widget.d0 r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewH = h(false);
            View viewG = g(false);
            if (viewH == null || viewG == null) {
                return;
            }
            int position = getPosition(viewH);
            int position2 = getPosition(viewG);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i3) {
        o(i, i3, 1);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f5392m.g();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i3, int i6) {
        o(i, i3, 8);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i3) {
        o(i, i3, 2);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i3, Object obj) {
        o(i, i3, 4);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onLayoutChildren(X x6, d0 d0Var) {
        r(x6, d0Var, true);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onLayoutCompleted(d0 d0Var) {
        this.f5390k = -1;
        this.f5391l = LinearLayoutManager.INVALID_OFFSET;
        this.f5396q = null;
        this.f5399t.a();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof o0) {
            o0 o0Var = (o0) parcelable;
            this.f5396q = o0Var;
            if (this.f5390k != -1) {
                o0Var.f5565d = null;
                o0Var.f5564c = 0;
                o0Var.f5562a = -1;
                o0Var.f5563b = -1;
                o0Var.f5565d = null;
                o0Var.f5564c = 0;
                o0Var.f5566e = 0;
                o0Var.f5567f = null;
                o0Var.f5568g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final Parcelable onSaveInstanceState() {
        int iK;
        int iK2;
        int[] iArr;
        o0 o0Var = this.f5396q;
        if (o0Var != null) {
            o0 o0Var2 = new o0();
            o0Var2.f5564c = o0Var.f5564c;
            o0Var2.f5562a = o0Var.f5562a;
            o0Var2.f5563b = o0Var.f5563b;
            o0Var2.f5565d = o0Var.f5565d;
            o0Var2.f5566e = o0Var.f5566e;
            o0Var2.f5567f = o0Var.f5567f;
            o0Var2.f5569h = o0Var.f5569h;
            o0Var2.i = o0Var.i;
            o0Var2.f5570j = o0Var.f5570j;
            o0Var2.f5568g = o0Var.f5568g;
            return o0Var2;
        }
        o0 o0Var3 = new o0();
        o0Var3.f5569h = this.f5388h;
        o0Var3.i = this.f5394o;
        o0Var3.f5570j = this.f5395p;
        C2351a c2351a = this.f5392m;
        if (c2351a == null || (iArr = (int[]) c2351a.f20441b) == null) {
            o0Var3.f5566e = 0;
        } else {
            o0Var3.f5567f = iArr;
            o0Var3.f5566e = iArr.length;
            o0Var3.f5568g = (ArrayList) c2351a.f20442c;
        }
        if (getChildCount() <= 0) {
            o0Var3.f5562a = -1;
            o0Var3.f5563b = -1;
            o0Var3.f5564c = 0;
            return o0Var3;
        }
        o0Var3.f5562a = this.f5394o ? l() : k();
        View viewG = this.i ? g(true) : h(true);
        o0Var3.f5563b = viewG != null ? getPosition(viewG) : -1;
        int i = this.f5381a;
        o0Var3.f5564c = i;
        o0Var3.f5565d = new int[i];
        for (int i3 = 0; i3 < this.f5381a; i3++) {
            if (this.f5394o) {
                iK = this.f5382b[i3].i(LinearLayoutManager.INVALID_OFFSET);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f5383c.g();
                    iK -= iK2;
                }
            } else {
                iK = this.f5382b[i3].k(LinearLayoutManager.INVALID_OFFSET);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f5383c.k();
                    iK -= iK2;
                }
            }
            o0Var3.f5565d[i3] = iK;
        }
        return o0Var3;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View p() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p():android.view.View");
    }

    public final void q(View view, int i, int i3) {
        Rect rect = this.f5398s;
        calculateItemDecorationsForChild(view, rect);
        m0 m0Var = (m0) view.getLayoutParams();
        int iC = C(i, ((ViewGroup.MarginLayoutParams) m0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) m0Var).rightMargin + rect.right);
        int iC2 = C(i3, ((ViewGroup.MarginLayoutParams) m0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iC, iC2, m0Var)) {
            view.measure(iC, iC2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.X r17, androidx.recyclerview.widget.d0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.X, androidx.recyclerview.widget.d0, boolean):void");
    }

    public final boolean s(int i) {
        if (this.f5385e == 0) {
            return (i == -1) != this.i;
        }
        return ((i == -1) == this.i) == isLayoutRTL();
    }

    public final int scrollBy(int i, X x6, d0 d0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        t(i, d0Var);
        C0322t c0322t = this.f5387g;
        int iF = f(x6, c0322t, d0Var);
        if (c0322t.f5599b >= iF) {
            i = i < 0 ? -iF : iF;
        }
        this.f5383c.o(-i);
        this.f5394o = this.i;
        c0322t.f5599b = 0;
        u(x6, c0322t);
        return i;
    }

    @Override // androidx.recyclerview.widget.Q
    public final int scrollHorizontallyBy(int i, X x6, d0 d0Var) {
        return scrollBy(i, x6, d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void scrollToPosition(int i) {
        o0 o0Var = this.f5396q;
        if (o0Var != null && o0Var.f5562a != i) {
            o0Var.f5565d = null;
            o0Var.f5564c = 0;
            o0Var.f5562a = -1;
            o0Var.f5563b = -1;
        }
        this.f5390k = i;
        this.f5391l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.Q
    public final int scrollVerticallyBy(int i, X x6, d0 d0Var) {
        return scrollBy(i, x6, d0Var);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void setMeasuredDimension(Rect rect, int i, int i3) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f5385e == 1) {
            iChooseSize2 = Q.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = Q.chooseSize(i, (this.f5386f * this.f5381a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = Q.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = Q.chooseSize(i3, (this.f5386f * this.f5381a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void smoothScrollToPosition(RecyclerView recyclerView, d0 d0Var, int i) {
        C0327y c0327y = new C0327y(recyclerView.getContext());
        c0327y.setTargetPosition(i);
        startSmoothScroll(c0327y);
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean supportsPredictiveItemAnimations() {
        return this.f5396q == null;
    }

    public final void t(int i, d0 d0Var) {
        int iK;
        int i3;
        if (i > 0) {
            iK = l();
            i3 = 1;
        } else {
            iK = k();
            i3 = -1;
        }
        C0322t c0322t = this.f5387g;
        c0322t.f5598a = true;
        A(iK, d0Var);
        y(i3);
        c0322t.f5600c = iK + c0322t.f5601d;
        c0322t.f5599b = Math.abs(i);
    }

    public final void u(X x6, C0322t c0322t) {
        if (!c0322t.f5598a || c0322t.i) {
            return;
        }
        if (c0322t.f5599b == 0) {
            if (c0322t.f5602e == -1) {
                v(c0322t.f5604g, x6);
                return;
            } else {
                w(c0322t.f5603f, x6);
                return;
            }
        }
        int i = 1;
        if (c0322t.f5602e == -1) {
            int i3 = c0322t.f5603f;
            int iK = this.f5382b[0].k(i3);
            while (i < this.f5381a) {
                int iK2 = this.f5382b[i].k(i3);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i++;
            }
            int i6 = i3 - iK;
            v(i6 < 0 ? c0322t.f5604g : c0322t.f5604g - Math.min(i6, c0322t.f5599b), x6);
            return;
        }
        int i7 = c0322t.f5604g;
        int i8 = this.f5382b[0].i(i7);
        while (i < this.f5381a) {
            int i9 = this.f5382b[i].i(i7);
            if (i9 < i8) {
                i8 = i9;
            }
            i++;
        }
        int i10 = i8 - c0322t.f5604g;
        w(i10 < 0 ? c0322t.f5603f : Math.min(i10, c0322t.f5599b) + c0322t.f5603f, x6);
    }

    public final void v(int i, X x6) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f5383c.e(childAt) < i || this.f5383c.n(childAt) < i) {
                return;
            }
            m0 m0Var = (m0) childAt.getLayoutParams();
            if (m0Var.f5524f) {
                for (int i3 = 0; i3 < this.f5381a; i3++) {
                    if (((ArrayList) this.f5382b[i3].f5577b).size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f5381a; i6++) {
                    this.f5382b[i6].l();
                }
            } else if (((ArrayList) m0Var.f5523e.f5577b).size() == 1) {
                return;
            } else {
                m0Var.f5523e.l();
            }
            removeAndRecycleView(childAt, x6);
        }
    }

    public final void w(int i, X x6) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f5383c.b(childAt) > i || this.f5383c.m(childAt) > i) {
                return;
            }
            m0 m0Var = (m0) childAt.getLayoutParams();
            if (m0Var.f5524f) {
                for (int i3 = 0; i3 < this.f5381a; i3++) {
                    if (((ArrayList) this.f5382b[i3].f5577b).size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f5381a; i6++) {
                    this.f5382b[i6].m();
                }
            } else if (((ArrayList) m0Var.f5523e.f5577b).size() == 1) {
                return;
            } else {
                m0Var.f5523e.m();
            }
            removeAndRecycleView(childAt, x6);
        }
    }

    public final void x() {
        if (this.f5385e == 1 || !isLayoutRTL()) {
            this.i = this.f5388h;
        } else {
            this.i = !this.f5388h;
        }
    }

    public final void y(int i) {
        C0322t c0322t = this.f5387g;
        c0322t.f5602e = i;
        c0322t.f5601d = this.i != (i == -1) ? -1 : 1;
    }

    public final void z(int i, int i3) {
        for (int i6 = 0; i6 < this.f5381a; i6++) {
            if (!((ArrayList) this.f5382b[i6].f5577b).isEmpty()) {
                B(this.f5382b[i6], i, i3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final S generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new m0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new m0(layoutParams);
    }
}
