package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends f1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final g2[] f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f1272d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1273e;

    /* renamed from: f, reason: collision with root package name */
    public int f1274f;
    public final e0 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1275h;
    public final BitSet j;

    /* renamed from: m, reason: collision with root package name */
    public final yb.i f1279m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1280n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1281o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1282p;

    /* renamed from: q, reason: collision with root package name */
    public f2 f1283q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1284r;

    /* renamed from: s, reason: collision with root package name */
    public final c2 f1285s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1286t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f1287u;

    /* renamed from: v, reason: collision with root package name */
    public final t f1288v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1276i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f1277k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f1278l = LinearLayoutManager.INVALID_OFFSET;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i10) {
        this.f1269a = -1;
        this.f1275h = false;
        yb.i iVar = new yb.i(5);
        this.f1279m = iVar;
        this.f1280n = 2;
        this.f1284r = new Rect();
        this.f1285s = new c2(this);
        this.f1286t = true;
        this.f1288v = new t(1, this);
        e1 properties = f1.getProperties(context, attributeSet, i4, i10);
        int i11 = properties.f1341a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f1273e) {
            this.f1273e = i11;
            m0 m0Var = this.f1271c;
            this.f1271c = this.f1272d;
            this.f1272d = m0Var;
            requestLayout();
        }
        int i12 = properties.f1342b;
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f1269a) {
            iVar.k();
            requestLayout();
            this.f1269a = i12;
            this.j = new BitSet(this.f1269a);
            this.f1270b = new g2[this.f1269a];
            for (int i13 = 0; i13 < this.f1269a; i13++) {
                this.f1270b[i13] = new g2(this, i13);
            }
            requestLayout();
        }
        boolean z3 = properties.f1343c;
        assertNotInLayoutOrScroll(null);
        f2 f2Var = this.f1283q;
        if (f2Var != null && f2Var.f1363h != z3) {
            f2Var.f1363h = z3;
        }
        this.f1275h = z3;
        requestLayout();
        e0 e0Var = new e0();
        e0Var.f1333a = true;
        e0Var.f1338f = 0;
        e0Var.g = 0;
        this.g = e0Var;
        this.f1271c = m0.a(this, this.f1273e);
        this.f1272d = m0.a(this, 1 - this.f1273e);
    }

    public static int B(int i4, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i4)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i10) - i11), mode) : i4;
    }

    public final void A(g2 g2Var, int i4, int i10) {
        int i11 = g2Var.f1382e;
        int i12 = g2Var.f1383f;
        if (i4 != -1) {
            int i13 = g2Var.f1381d;
            if (i13 == Integer.MIN_VALUE) {
                g2Var.a();
                i13 = g2Var.f1381d;
            }
            if (i13 - i11 >= i10) {
                this.j.set(i12, false);
                return;
            }
            return;
        }
        int i14 = g2Var.f1380c;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) g2Var.f1379b).get(0);
            d2 d2Var = (d2) view.getLayoutParams();
            g2Var.f1380c = ((StaggeredGridLayoutManager) g2Var.g).f1271c.e(view);
            d2Var.getClass();
            i14 = g2Var.f1380c;
        }
        if (i14 + i11 <= i10) {
            this.j.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f1283q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean canScrollHorizontally() {
        return this.f1273e == 0;
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean canScrollVertically() {
        return this.f1273e == 1;
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean checkLayoutParams(g1 g1Var) {
        return g1Var instanceof d2;
    }

    @Override // androidx.recyclerview.widget.f1
    public final void collectAdjacentPrefetchPositions(int i4, int i10, t1 t1Var, d1 d1Var) {
        e0 e0Var;
        int iH;
        int iJ;
        if (this.f1273e != 0) {
            i4 = i10;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        t(i4, t1Var);
        int[] iArr = this.f1287u;
        if (iArr == null || iArr.length < this.f1269a) {
            this.f1287u = new int[this.f1269a];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f1269a;
            e0Var = this.g;
            if (i11 >= i13) {
                break;
            }
            if (e0Var.f1336d == -1) {
                iH = e0Var.f1338f;
                iJ = this.f1270b[i11].j(iH);
            } else {
                iH = this.f1270b[i11].h(e0Var.g);
                iJ = e0Var.g;
            }
            int i14 = iH - iJ;
            if (i14 >= 0) {
                this.f1287u[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.f1287u, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = e0Var.f1335c;
            if (i16 < 0 || i16 >= t1Var.b()) {
                return;
            }
            ((y) d1Var).a(e0Var.f1335c, this.f1287u[i15]);
            e0Var.f1335c += e0Var.f1336d;
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollExtent(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z3 = !this.f1286t;
        return s.a(t1Var, this.f1271c, h(z3), g(z3), this, this.f1286t);
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollOffset(t1 t1Var) {
        return e(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeHorizontalScrollRange(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z3 = !this.f1286t;
        return s.c(t1Var, this.f1271c, h(z3), g(z3), this, this.f1286t);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.r1
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
            boolean r4 = r3.f1276i
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
            boolean r0 = r3.f1276i
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f1273e
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

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollExtent(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z3 = !this.f1286t;
        return s.a(t1Var, this.f1271c, h(z3), g(z3), this, this.f1286t);
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollOffset(t1 t1Var) {
        return e(t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final int computeVerticalScrollRange(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z3 = !this.f1286t;
        return s.c(t1Var, this.f1271c, h(z3), g(z3), this, this.f1286t);
    }

    public final boolean d() {
        int iK;
        if (getChildCount() != 0 && this.f1280n != 0 && isAttachedToWindow()) {
            if (this.f1276i) {
                iK = l();
                k();
            } else {
                iK = k();
                l();
            }
            if (iK == 0 && p() != null) {
                this.f1279m.k();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(t1 t1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z3 = !this.f1286t;
        return s.b(t1Var, this.f1271c, h(z3), g(z3), this, this.f1286t, this.f1276i);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int f(m1 m1Var, e0 e0Var, t1 t1Var) {
        g2 g2Var;
        ?? r32;
        int iJ;
        int iC;
        int iK;
        int iC2;
        int i4;
        int i10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i11 = 0;
        int i12 = 1;
        staggeredGridLayoutManager.j.set(0, staggeredGridLayoutManager.f1269a, true);
        e0 e0Var2 = staggeredGridLayoutManager.g;
        int i13 = e0Var2.f1340i ? e0Var.f1337e == 1 ? Integer.MAX_VALUE : LinearLayoutManager.INVALID_OFFSET : e0Var.f1337e == 1 ? e0Var.g + e0Var.f1334b : e0Var.f1338f - e0Var.f1334b;
        int i14 = e0Var.f1337e;
        for (int i15 = 0; i15 < staggeredGridLayoutManager.f1269a; i15++) {
            if (!((ArrayList) staggeredGridLayoutManager.f1270b[i15].f1379b).isEmpty()) {
                staggeredGridLayoutManager.A(staggeredGridLayoutManager.f1270b[i15], i14, i13);
            }
        }
        int iG = staggeredGridLayoutManager.f1276i ? staggeredGridLayoutManager.f1271c.g() : staggeredGridLayoutManager.f1271c.k();
        boolean z3 = false;
        while (true) {
            int i16 = e0Var.f1335c;
            int i17 = -1;
            if (i16 < 0 || i16 >= t1Var.b() || (!e0Var2.f1340i && staggeredGridLayoutManager.j.isEmpty())) {
                break;
            }
            View viewD = m1Var.d(e0Var.f1335c);
            e0Var.f1335c += e0Var.f1336d;
            d2 d2Var = (d2) viewD.getLayoutParams();
            int layoutPosition = d2Var.f1374a.getLayoutPosition();
            yb.i iVar = staggeredGridLayoutManager.f1279m;
            int[] iArr = (int[]) iVar.f37516b;
            int i18 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i18 == -1) {
                if (staggeredGridLayoutManager.s(e0Var.f1337e)) {
                    i4 = staggeredGridLayoutManager.f1269a - i12;
                    i10 = -1;
                } else {
                    i17 = staggeredGridLayoutManager.f1269a;
                    i4 = i11;
                    i10 = i12;
                }
                g2 g2Var2 = null;
                if (e0Var.f1337e == i12) {
                    int iK2 = staggeredGridLayoutManager.f1271c.k();
                    int i19 = Integer.MAX_VALUE;
                    while (i4 != i17) {
                        g2 g2Var3 = staggeredGridLayoutManager.f1270b[i4];
                        int i20 = i10;
                        int iH = g2Var3.h(iK2);
                        if (iH < i19) {
                            g2Var2 = g2Var3;
                            i19 = iH;
                        }
                        i4 += i20;
                        i10 = i20;
                    }
                } else {
                    int i21 = i10;
                    int iG2 = staggeredGridLayoutManager.f1271c.g();
                    int i22 = LinearLayoutManager.INVALID_OFFSET;
                    while (i4 != i17) {
                        g2 g2Var4 = staggeredGridLayoutManager.f1270b[i4];
                        int iJ2 = g2Var4.j(iG2);
                        if (iJ2 > i22) {
                            g2Var2 = g2Var4;
                            i22 = iJ2;
                        }
                        i4 += i21;
                    }
                }
                g2Var = g2Var2;
                iVar.C(layoutPosition);
                ((int[]) iVar.f37516b)[layoutPosition] = g2Var.f1383f;
            } else {
                g2Var = staggeredGridLayoutManager.f1270b[i18];
            }
            g2 g2Var5 = g2Var;
            d2Var.f1327e = g2Var5;
            if (e0Var.f1337e == 1) {
                staggeredGridLayoutManager.addView(viewD);
                r32 = 0;
            } else {
                r32 = 0;
                staggeredGridLayoutManager.addView(viewD, 0);
            }
            if (staggeredGridLayoutManager.f1273e == 1) {
                staggeredGridLayoutManager.q(viewD, f1.getChildMeasureSpec(staggeredGridLayoutManager.f1274f, staggeredGridLayoutManager.getWidthMode(), r32, ((ViewGroup.MarginLayoutParams) d2Var).width, r32), f1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) d2Var).height, true));
            } else {
                staggeredGridLayoutManager.q(viewD, f1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) d2Var).width, true), f1.getChildMeasureSpec(staggeredGridLayoutManager.f1274f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) d2Var).height, false));
            }
            if (e0Var.f1337e == 1) {
                iC = g2Var5.h(iG);
                iJ = staggeredGridLayoutManager.f1271c.c(viewD) + iC;
            } else {
                iJ = g2Var5.j(iG);
                iC = iJ - staggeredGridLayoutManager.f1271c.c(viewD);
            }
            if (e0Var.f1337e == 1) {
                g2 g2Var6 = d2Var.f1327e;
                g2Var6.getClass();
                d2 d2Var2 = (d2) viewD.getLayoutParams();
                d2Var2.f1327e = g2Var6;
                ArrayList arrayList = (ArrayList) g2Var6.f1379b;
                arrayList.add(viewD);
                g2Var6.f1381d = LinearLayoutManager.INVALID_OFFSET;
                if (arrayList.size() == 1) {
                    g2Var6.f1380c = LinearLayoutManager.INVALID_OFFSET;
                }
                if (d2Var2.f1374a.isRemoved() || d2Var2.f1374a.isUpdated()) {
                    g2Var6.f1382e = ((StaggeredGridLayoutManager) g2Var6.g).f1271c.c(viewD) + g2Var6.f1382e;
                }
            } else {
                g2 g2Var7 = d2Var.f1327e;
                g2Var7.getClass();
                d2 d2Var3 = (d2) viewD.getLayoutParams();
                d2Var3.f1327e = g2Var7;
                ArrayList arrayList2 = (ArrayList) g2Var7.f1379b;
                arrayList2.add(0, viewD);
                g2Var7.f1380c = LinearLayoutManager.INVALID_OFFSET;
                if (arrayList2.size() == 1) {
                    g2Var7.f1381d = LinearLayoutManager.INVALID_OFFSET;
                }
                if (d2Var3.f1374a.isRemoved() || d2Var3.f1374a.isUpdated()) {
                    g2Var7.f1382e = ((StaggeredGridLayoutManager) g2Var7.g).f1271c.c(viewD) + g2Var7.f1382e;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f1273e == 1) {
                iC2 = staggeredGridLayoutManager.f1272d.g() - (((staggeredGridLayoutManager.f1269a - 1) - g2Var5.f1383f) * staggeredGridLayoutManager.f1274f);
                iK = iC2 - staggeredGridLayoutManager.f1272d.c(viewD);
            } else {
                iK = staggeredGridLayoutManager.f1272d.k() + (g2Var5.f1383f * staggeredGridLayoutManager.f1274f);
                iC2 = staggeredGridLayoutManager.f1272d.c(viewD) + iK;
            }
            int i23 = iK;
            int i24 = iC2;
            if (staggeredGridLayoutManager.f1273e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, i23, iC, i24, iJ);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, iC, i23, iJ, i24);
            }
            staggeredGridLayoutManager.A(g2Var5, e0Var2.f1337e, i13);
            staggeredGridLayoutManager.u(m1Var, e0Var2);
            if (e0Var2.f1339h && viewD.hasFocusable()) {
                staggeredGridLayoutManager.j.set(g2Var5.f1383f, false);
            }
            z3 = true;
            i12 = 1;
            i11 = 0;
        }
        if (!z3) {
            staggeredGridLayoutManager.u(m1Var, e0Var2);
        }
        int iK3 = e0Var2.f1337e == -1 ? staggeredGridLayoutManager.f1271c.k() - staggeredGridLayoutManager.n(staggeredGridLayoutManager.f1271c.k()) : staggeredGridLayoutManager.m(staggeredGridLayoutManager.f1271c.g()) - staggeredGridLayoutManager.f1271c.g();
        if (iK3 > 0) {
            return Math.min(e0Var.f1334b, iK3);
        }
        return 0;
    }

    public final View g(boolean z3) {
        int iK = this.f1271c.k();
        int iG = this.f1271c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f1271c.e(childAt);
            int iB = this.f1271c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z3) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateDefaultLayoutParams() {
        return this.f1273e == 0 ? new d2(-2, -1) : new d2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new d2(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.f1
    public final int getColumnCountForAccessibility(m1 m1Var, t1 t1Var) {
        if (this.f1273e == 1) {
            return Math.min(this.f1269a, t1Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int getRowCountForAccessibility(m1 m1Var, t1 t1Var) {
        if (this.f1273e == 0) {
            return Math.min(this.f1269a, t1Var.b());
        }
        return -1;
    }

    public final View h(boolean z3) {
        int iK = this.f1271c.k();
        int iG = this.f1271c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int iE = this.f1271c.e(childAt);
            if (this.f1271c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z3) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(m1 m1Var, t1 t1Var, boolean z3) {
        int iG;
        int iM = m(LinearLayoutManager.INVALID_OFFSET);
        if (iM != Integer.MIN_VALUE && (iG = this.f1271c.g() - iM) > 0) {
            int i4 = iG - (-scrollBy(-iG, m1Var, t1Var));
            if (!z3 || i4 <= 0) {
                return;
            }
            this.f1271c.o(i4);
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean isAutoMeasureEnabled() {
        return this.f1280n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean isLayoutReversed() {
        return this.f1275h;
    }

    public final void j(m1 m1Var, t1 t1Var, boolean z3) {
        int iK;
        int iN = n(Integer.MAX_VALUE);
        if (iN != Integer.MAX_VALUE && (iK = iN - this.f1271c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, m1Var, t1Var);
            if (!z3 || iScrollBy <= 0) {
                return;
            }
            this.f1271c.o(-iScrollBy);
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

    public final int m(int i4) {
        int iH = this.f1270b[0].h(i4);
        for (int i10 = 1; i10 < this.f1269a; i10++) {
            int iH2 = this.f1270b[i10].h(i4);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    public final int n(int i4) {
        int iJ = this.f1270b[0].j(i4);
        for (int i10 = 1; i10 < this.f1269a; i10++) {
            int iJ2 = this.f1270b[i10].j(i4);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.f1
    public final void offsetChildrenHorizontal(int i4) {
        super.offsetChildrenHorizontal(i4);
        for (int i10 = 0; i10 < this.f1269a; i10++) {
            g2 g2Var = this.f1270b[i10];
            int i11 = g2Var.f1380c;
            if (i11 != Integer.MIN_VALUE) {
                g2Var.f1380c = i11 + i4;
            }
            int i12 = g2Var.f1381d;
            if (i12 != Integer.MIN_VALUE) {
                g2Var.f1381d = i12 + i4;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void offsetChildrenVertical(int i4) {
        super.offsetChildrenVertical(i4);
        for (int i10 = 0; i10 < this.f1269a; i10++) {
            g2 g2Var = this.f1270b[i10];
            int i11 = g2Var.f1380c;
            if (i11 != Integer.MIN_VALUE) {
                g2Var.f1380c = i11 + i4;
            }
            int i12 = g2Var.f1381d;
            if (i12 != Integer.MIN_VALUE) {
                g2Var.f1381d = i12 + i4;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onAdapterChanged(t0 t0Var, t0 t0Var2) {
        this.f1279m.k();
        for (int i4 = 0; i4 < this.f1269a; i4++) {
            this.f1270b[i4].b();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onDetachedFromWindow(RecyclerView recyclerView, m1 m1Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f1288v);
        for (int i4 = 0; i4 < this.f1269a; i4++) {
            this.f1270b[i4].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    @Override // androidx.recyclerview.widget.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r8, int r9, androidx.recyclerview.widget.m1 r10, androidx.recyclerview.widget.t1 r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.f1
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

    @Override // androidx.recyclerview.widget.f1
    public final void onInitializeAccessibilityNodeInfo(m1 m1Var, t1 t1Var, f4.f fVar) {
        super.onInitializeAccessibilityNodeInfo(m1Var, t1Var, fVar);
        fVar.k("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onInitializeAccessibilityNodeInfoForItem(m1 m1Var, t1 t1Var, View view, f4.f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d2)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, fVar);
            return;
        }
        d2 d2Var = (d2) layoutParams;
        if (this.f1273e == 0) {
            g2 g2Var = d2Var.f1327e;
            fVar.m(f4.e.a(g2Var == null ? -1 : g2Var.f1383f, 1, -1, -1, false));
        } else {
            g2 g2Var2 = d2Var.f1327e;
            fVar.m(f4.e.a(-1, -1, g2Var2 == null ? -1 : g2Var2.f1383f, 1, false));
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsAdded(RecyclerView recyclerView, int i4, int i10) {
        o(i4, i10, 1);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f1279m.k();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsMoved(RecyclerView recyclerView, int i4, int i10, int i11) {
        o(i4, i10, 8);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsRemoved(RecyclerView recyclerView, int i4, int i10) {
        o(i4, i10, 2);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onItemsUpdated(RecyclerView recyclerView, int i4, int i10, Object obj) {
        o(i4, i10, 4);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onLayoutChildren(m1 m1Var, t1 t1Var) {
        r(m1Var, t1Var, true);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onLayoutCompleted(t1 t1Var) {
        this.f1277k = -1;
        this.f1278l = LinearLayoutManager.INVALID_OFFSET;
        this.f1283q = null;
        this.f1285s.a();
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof f2) {
            f2 f2Var = (f2) parcelable;
            this.f1283q = f2Var;
            if (this.f1277k != -1) {
                f2Var.f1357a = -1;
                f2Var.f1358b = -1;
                f2Var.f1360d = null;
                f2Var.f1359c = 0;
                f2Var.f1361e = 0;
                f2Var.f1362f = null;
                f2Var.g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.f1
    public final Parcelable onSaveInstanceState() {
        int iJ;
        int iK;
        int[] iArr;
        f2 f2Var = this.f1283q;
        if (f2Var != null) {
            f2 f2Var2 = new f2();
            f2Var2.f1359c = f2Var.f1359c;
            f2Var2.f1357a = f2Var.f1357a;
            f2Var2.f1358b = f2Var.f1358b;
            f2Var2.f1360d = f2Var.f1360d;
            f2Var2.f1361e = f2Var.f1361e;
            f2Var2.f1362f = f2Var.f1362f;
            f2Var2.f1363h = f2Var.f1363h;
            f2Var2.f1364i = f2Var.f1364i;
            f2Var2.j = f2Var.j;
            f2Var2.g = f2Var.g;
            return f2Var2;
        }
        f2 f2Var3 = new f2();
        f2Var3.f1363h = this.f1275h;
        f2Var3.f1364i = this.f1281o;
        f2Var3.j = this.f1282p;
        yb.i iVar = this.f1279m;
        if (iVar == null || (iArr = (int[]) iVar.f37516b) == null) {
            f2Var3.f1361e = 0;
        } else {
            f2Var3.f1362f = iArr;
            f2Var3.f1361e = iArr.length;
            f2Var3.g = (ArrayList) iVar.f37517c;
        }
        if (getChildCount() <= 0) {
            f2Var3.f1357a = -1;
            f2Var3.f1358b = -1;
            f2Var3.f1359c = 0;
            return f2Var3;
        }
        f2Var3.f1357a = this.f1281o ? l() : k();
        View viewG = this.f1276i ? g(true) : h(true);
        f2Var3.f1358b = viewG != null ? getPosition(viewG) : -1;
        int i4 = this.f1269a;
        f2Var3.f1359c = i4;
        f2Var3.f1360d = new int[i4];
        for (int i10 = 0; i10 < this.f1269a; i10++) {
            if (this.f1281o) {
                iJ = this.f1270b[i10].h(LinearLayoutManager.INVALID_OFFSET);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f1271c.g();
                    iJ -= iK;
                }
            } else {
                iJ = this.f1270b[i10].j(LinearLayoutManager.INVALID_OFFSET);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f1271c.k();
                    iJ -= iK;
                }
            }
            f2Var3.f1360d[i10] = iJ;
        }
        return f2Var3;
    }

    @Override // androidx.recyclerview.widget.f1
    public final void onScrollStateChanged(int i4) {
        if (i4 == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View p() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p():android.view.View");
    }

    public final void q(View view, int i4, int i10) {
        Rect rect = this.f1284r;
        calculateItemDecorationsForChild(view, rect);
        d2 d2Var = (d2) view.getLayoutParams();
        int iB = B(i4, ((ViewGroup.MarginLayoutParams) d2Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d2Var).rightMargin + rect.right);
        int iB2 = B(i10, ((ViewGroup.MarginLayoutParams) d2Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iB, iB2, d2Var)) {
            view.measure(iB, iB2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.m1 r17, androidx.recyclerview.widget.t1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.m1, androidx.recyclerview.widget.t1, boolean):void");
    }

    public final boolean s(int i4) {
        if (this.f1273e == 0) {
            return (i4 == -1) != this.f1276i;
        }
        return ((i4 == -1) == this.f1276i) == isLayoutRTL();
    }

    public final int scrollBy(int i4, m1 m1Var, t1 t1Var) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        t(i4, t1Var);
        e0 e0Var = this.g;
        int iF = f(m1Var, e0Var, t1Var);
        if (e0Var.f1334b >= iF) {
            i4 = i4 < 0 ? -iF : iF;
        }
        this.f1271c.o(-i4);
        this.f1281o = this.f1276i;
        e0Var.f1334b = 0;
        u(m1Var, e0Var);
        return i4;
    }

    @Override // androidx.recyclerview.widget.f1
    public final int scrollHorizontallyBy(int i4, m1 m1Var, t1 t1Var) {
        return scrollBy(i4, m1Var, t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void scrollToPosition(int i4) {
        f2 f2Var = this.f1283q;
        if (f2Var != null && f2Var.f1357a != i4) {
            f2Var.f1360d = null;
            f2Var.f1359c = 0;
            f2Var.f1357a = -1;
            f2Var.f1358b = -1;
        }
        this.f1277k = i4;
        this.f1278l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.f1
    public final int scrollVerticallyBy(int i4, m1 m1Var, t1 t1Var) {
        return scrollBy(i4, m1Var, t1Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void setMeasuredDimension(Rect rect, int i4, int i10) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f1273e == 1) {
            iChooseSize2 = f1.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = f1.chooseSize(i4, (this.f1274f * this.f1269a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = f1.chooseSize(i4, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = f1.chooseSize(i10, (this.f1274f * this.f1269a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.f1
    public final void smoothScrollToPosition(RecyclerView recyclerView, t1 t1Var, int i4) {
        k0 k0Var = new k0(recyclerView.getContext());
        k0Var.setTargetPosition(i4);
        startSmoothScroll(k0Var);
    }

    @Override // androidx.recyclerview.widget.f1
    public final boolean supportsPredictiveItemAnimations() {
        return this.f1283q == null;
    }

    public final void t(int i4, t1 t1Var) {
        int iK;
        int i10;
        if (i4 > 0) {
            iK = l();
            i10 = 1;
        } else {
            iK = k();
            i10 = -1;
        }
        e0 e0Var = this.g;
        e0Var.f1333a = true;
        z(iK, t1Var);
        y(i10);
        e0Var.f1335c = iK + e0Var.f1336d;
        e0Var.f1334b = Math.abs(i4);
    }

    public final void u(m1 m1Var, e0 e0Var) {
        if (!e0Var.f1333a || e0Var.f1340i) {
            return;
        }
        if (e0Var.f1334b == 0) {
            if (e0Var.f1337e == -1) {
                v(e0Var.g, m1Var);
                return;
            } else {
                w(e0Var.f1338f, m1Var);
                return;
            }
        }
        int i4 = 1;
        if (e0Var.f1337e == -1) {
            int i10 = e0Var.f1338f;
            int iJ = this.f1270b[0].j(i10);
            while (i4 < this.f1269a) {
                int iJ2 = this.f1270b[i4].j(i10);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i4++;
            }
            int i11 = i10 - iJ;
            v(i11 < 0 ? e0Var.g : e0Var.g - Math.min(i11, e0Var.f1334b), m1Var);
            return;
        }
        int i12 = e0Var.g;
        int iH = this.f1270b[0].h(i12);
        while (i4 < this.f1269a) {
            int iH2 = this.f1270b[i4].h(i12);
            if (iH2 < iH) {
                iH = iH2;
            }
            i4++;
        }
        int i13 = iH - e0Var.g;
        w(i13 < 0 ? e0Var.f1338f : Math.min(i13, e0Var.f1334b) + e0Var.f1338f, m1Var);
    }

    public final void v(int i4, m1 m1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f1271c.e(childAt) < i4 || this.f1271c.n(childAt) < i4) {
                return;
            }
            d2 d2Var = (d2) childAt.getLayoutParams();
            d2Var.getClass();
            if (((ArrayList) d2Var.f1327e.f1379b).size() == 1) {
                return;
            }
            g2 g2Var = d2Var.f1327e;
            ArrayList arrayList = (ArrayList) g2Var.f1379b;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            d2 d2Var2 = (d2) view.getLayoutParams();
            d2Var2.f1327e = null;
            if (d2Var2.f1374a.isRemoved() || d2Var2.f1374a.isUpdated()) {
                g2Var.f1382e -= ((StaggeredGridLayoutManager) g2Var.g).f1271c.c(view);
            }
            if (size == 1) {
                g2Var.f1380c = LinearLayoutManager.INVALID_OFFSET;
            }
            g2Var.f1381d = LinearLayoutManager.INVALID_OFFSET;
            removeAndRecycleView(childAt, m1Var);
        }
    }

    public final void w(int i4, m1 m1Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f1271c.b(childAt) > i4 || this.f1271c.m(childAt) > i4) {
                return;
            }
            d2 d2Var = (d2) childAt.getLayoutParams();
            d2Var.getClass();
            if (((ArrayList) d2Var.f1327e.f1379b).size() == 1) {
                return;
            }
            g2 g2Var = d2Var.f1327e;
            ArrayList arrayList = (ArrayList) g2Var.f1379b;
            View view = (View) arrayList.remove(0);
            d2 d2Var2 = (d2) view.getLayoutParams();
            d2Var2.f1327e = null;
            if (arrayList.size() == 0) {
                g2Var.f1381d = LinearLayoutManager.INVALID_OFFSET;
            }
            if (d2Var2.f1374a.isRemoved() || d2Var2.f1374a.isUpdated()) {
                g2Var.f1382e -= ((StaggeredGridLayoutManager) g2Var.g).f1271c.c(view);
            }
            g2Var.f1380c = LinearLayoutManager.INVALID_OFFSET;
            removeAndRecycleView(childAt, m1Var);
        }
    }

    public final void x() {
        if (this.f1273e == 1 || !isLayoutRTL()) {
            this.f1276i = this.f1275h;
        } else {
            this.f1276i = !this.f1275h;
        }
    }

    public final void y(int i4) {
        e0 e0Var = this.g;
        e0Var.f1337e = i4;
        e0Var.f1336d = this.f1276i != (i4 == -1) ? -1 : 1;
    }

    public final void z(int i4, t1 t1Var) {
        int iL;
        int iL2;
        int i10;
        e0 e0Var = this.g;
        boolean z3 = false;
        e0Var.f1334b = 0;
        e0Var.f1335c = i4;
        if (!isSmoothScrolling() || (i10 = t1Var.f1503a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f1276i == (i10 < i4)) {
                iL = this.f1271c.l();
                iL2 = 0;
            } else {
                iL2 = this.f1271c.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            e0Var.f1338f = this.f1271c.k() - iL2;
            e0Var.g = this.f1271c.g() + iL;
        } else {
            e0Var.g = this.f1271c.f() + iL;
            e0Var.f1338f = -iL2;
        }
        e0Var.f1339h = false;
        e0Var.f1333a = true;
        if (this.f1271c.i() == 0 && this.f1271c.f() == 0) {
            z3 = true;
        }
        e0Var.f1340i = z3;
    }

    @Override // androidx.recyclerview.widget.f1
    public final g1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d2(layoutParams);
    }
}
