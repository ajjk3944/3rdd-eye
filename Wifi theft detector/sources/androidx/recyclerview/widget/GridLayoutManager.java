package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import s0.x;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: m, reason: collision with root package name */
    public static final Set f3627m = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: a, reason: collision with root package name */
    public boolean f3628a;

    /* renamed from: b, reason: collision with root package name */
    public int f3629b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3630c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f3631d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f3632e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f3633f;

    /* renamed from: g, reason: collision with root package name */
    public d f3634g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f3635h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3636i;

    /* renamed from: j, reason: collision with root package name */
    public int f3637j;

    /* renamed from: k, reason: collision with root package name */
    public int f3638k;

    /* renamed from: l, reason: collision with root package name */
    public int f3639l;

    public static class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f3642a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f3643b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f3644c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3645d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f3645d) {
                return d(i10, i11);
            }
            int i12 = this.f3643b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f3643b.put(i10, iD);
            return iD;
        }

        public int c(int i10, int i11) {
            if (!this.f3644c) {
                return e(i10, i11);
            }
            int i12 = this.f3642a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f3642a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f3645d || (iA = a(this.f3643b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f3643b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3643b.clear();
        }

        public void h() {
            this.f3642a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3628a = false;
        this.f3629b = -1;
        this.f3632e = new SparseIntArray();
        this.f3633f = new SparseIntArray();
        this.f3634g = new b();
        this.f3635h = new Rect();
        this.f3637j = -1;
        this.f3638k = -1;
        this.f3639l = -1;
        o0(RecyclerView.n.getProperties(context, attributeSet, i10, i11).f3756b);
    }

    public static int[] N(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    public final void K(RecyclerView.u uVar, RecyclerView.y yVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f3631d[i11];
            c cVar = (c) view.getLayoutParams();
            int iJ0 = j0(uVar, yVar, getPosition(view));
            cVar.f3641f = iJ0;
            cVar.f3640e = i14;
            i14 += iJ0;
            i11 += i13;
        }
    }

    public final void L() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            int iA = cVar.a();
            this.f3632e.put(iA, cVar.f());
            this.f3633f.put(iA, cVar.e());
        }
    }

    public final void M(int i10) {
        this.f3630c = N(this.f3630c, this.f3629b, i10);
    }

    public final void O() {
        this.f3632e.clear();
        this.f3633f.clear();
    }

    public final int P(RecyclerView.y yVar) {
        if (getChildCount() != 0 && yVar.b() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iB = this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3629b);
                int iB2 = this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3629b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f3634g.b(yVar.b() - 1, this.f3629b) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)) / ((this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3629b) - this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3629b)) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public final int Q(RecyclerView.y yVar) {
        if (getChildCount() != 0 && yVar.b() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f3634g.b(yVar.b() - 1, this.f3629b) + 1;
                }
                int iD = this.mOrientationHelper.d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(viewFindFirstVisibleChildClosestToStart);
                int iB = this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f3629b);
                return (int) ((iD / ((this.f3634g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f3629b) - iB) + 1)) * (this.f3634g.b(yVar.b() - 1, this.f3629b) + 1));
            }
        }
        return 0;
    }

    public final void R(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iI0 = i0(uVar, yVar, aVar.f3650b);
        if (z10) {
            while (iI0 > 0) {
                int i11 = aVar.f3650b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f3650b = i12;
                iI0 = i0(uVar, yVar, i12);
            }
            return;
        }
        int iB = yVar.b() - 1;
        int i13 = aVar.f3650b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iI02 = i0(uVar, yVar, i14);
            if (iI02 <= iI0) {
                break;
            }
            i13 = i14;
            iI0 = iI02;
        }
        aVar.f3650b = i13;
    }

    public final void S() {
        View[] viewArr = this.f3631d;
        if (viewArr == null || viewArr.length != this.f3629b) {
            this.f3631d = new View[this.f3629b];
        }
    }

    public final View T() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Objects.requireNonNull(childAt);
            if (a.a(childAt)) {
                return getChildAt(i10);
            }
        }
        return null;
    }

    public int U(int i10) {
        if (i10 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < getItemCount(); i11++) {
            for (Integer num : d0(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f3638k = iIntValue;
                this.f3639l = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    public int V(int i10) {
        if (i10 < 0 || this.mOrientation == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < getItemCount(); i11++) {
            for (Integer num : d0(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f3638k = iIntValue;
                this.f3639l = a0(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    public final int W(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (iC0 < i10 && b0(i13).contains(Integer.valueOf(i11))) {
                    this.f3638k = iC0;
                    return i13;
                }
            } else if (iC0 < i10 && iA0 == i11) {
                this.f3638k = ((Integer) Collections.max(d0(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    public final int X(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < getItemCount(); i13++) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if (iC0 > i10 && (iA0 == i11 || b0(i13).contains(Integer.valueOf(i11)))) {
                    this.f3638k = iC0;
                    return i13;
                }
            } else if (iC0 > i10 && iA0 == i11) {
                this.f3638k = c0(i13);
                return i13;
            }
        }
        return -1;
    }

    public final int Y(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((iC0 == i10 && iA0 < i11) || iC0 < i10) {
                    this.f3638k = iC0;
                    this.f3639l = iA0;
                    return i13;
                }
            } else if (d0(i13).contains(Integer.valueOf(i10)) && iA0 < i11) {
                this.f3639l = iA0;
                return i13;
            }
        }
        return -1;
    }

    public final int Z(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < getItemCount(); i13++) {
            int iC0 = c0(i13);
            int iA0 = a0(i13);
            if (iC0 < 0 || iA0 < 0) {
                break;
            }
            if (this.mOrientation == 1) {
                if ((iC0 == i10 && iA0 > i11) || iC0 > i10) {
                    this.f3638k = iC0;
                    this.f3639l = iA0;
                    return i13;
                }
            } else if (iA0 > i11 && d0(i13).contains(Integer.valueOf(i10))) {
                this.f3639l = iA0;
                return i13;
            }
        }
        return -1;
    }

    public final int a0(int i10) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return h0(recyclerView.f3675c, recyclerView.f3688i0, i10);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return i0(recyclerView2.f3675c, recyclerView2.f3688i0, i10);
    }

    public final Set b0(int i10) {
        return e0(a0(i10), i10);
    }

    public final int c0(int i10) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return h0(recyclerView.f3675c, recyclerView.f3688i0, i10);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return i0(recyclerView2.f3675c, recyclerView2.f3688i0, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.n.c cVar2) {
        int iF = this.f3629b;
        for (int i10 = 0; i10 < this.f3629b && cVar.c(yVar) && iF > 0; i10++) {
            int i11 = cVar.f3661d;
            cVar2.a(i11, Math.max(0, cVar.f3664g));
            iF -= this.f3634g.f(i11);
            cVar.f3661d += cVar.f3662e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return this.f3636i ? P(yVar) : super.computeHorizontalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return this.f3636i ? Q(yVar) : super.computeHorizontalScrollRange(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return this.f3636i ? P(yVar) : super.computeVerticalScrollOffset(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return this.f3636i ? Q(yVar) : super.computeVerticalScrollRange(yVar);
    }

    public final Set d0(int i10) {
        return e0(c0(i10), i10);
    }

    public final Set e0(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iJ0 = j0(recyclerView.f3675c, recyclerView.f3688i0, i11);
        for (int i12 = i10; i12 < i10 + iJ0; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    public int f0(int i10, int i11) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f3630c;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f3630c;
        int i12 = this.f3629b;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int childCount2 = getChildCount();
        int i11 = 1;
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
        }
        int iB = yVar.b();
        ensureLayoutState();
        int iN = this.mOrientationHelper.n();
        int i12 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && i0(uVar, yVar, position) == 0) {
                if (((RecyclerView.o) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i12 && this.mOrientationHelper.d(childAt) >= iN) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i11;
        }
        return view != null ? view : view2;
    }

    public int g0() {
        return this.f3629b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int getColumnCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return Math.min(this.f3629b, getItemCount());
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return h0(uVar, yVar, yVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int getRowCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return Math.min(this.f3629b, getItemCount());
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return h0(uVar, yVar, yVar.b() - 1) + 1;
    }

    public final int h0(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        if (!yVar.e()) {
            return this.f3634g.b(i10, this.f3629b);
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f3634g.b(iF, this.f3629b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int i0(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        if (!yVar.e()) {
            return this.f3634g.c(i10, this.f3629b);
        }
        int i11 = this.f3633f.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f3634g.c(iF, this.f3629b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int j0(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        if (!yVar.e()) {
            return this.f3634g.f(i10);
        }
        int i11 = this.f3632e.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = uVar.f(i10);
        if (iF != -1) {
            return this.f3634g.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void k0(float f10, int i10) {
        M(Math.max(Math.round(f10 * this.f3629b), i10));
    }

    public final boolean l0(int i10) {
        return (d0(i10).contains(Integer.valueOf(this.f3638k)) && b0(i10).contains(Integer.valueOf(this.f3639l))) ? false : true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int paddingLeft;
        int paddingTop;
        int iF;
        int iF2;
        int i12;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewD;
        int iM = this.mOrientationHelper.m();
        boolean z10 = iM != 1073741824;
        int i13 = getChildCount() > 0 ? this.f3630c[this.f3629b] : 0;
        if (z10) {
            p0();
        }
        boolean z11 = cVar.f3662e == 1;
        int iI0 = this.f3629b;
        if (!z11) {
            iI0 = i0(uVar, yVar, cVar.f3661d) + j0(uVar, yVar, cVar.f3661d);
        }
        int i14 = 0;
        while (i14 < this.f3629b && cVar.c(yVar) && iI0 > 0) {
            int i15 = cVar.f3661d;
            int iJ0 = j0(uVar, yVar, i15);
            if (iJ0 > this.f3629b) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iJ0 + " spans but GridLayoutManager has only " + this.f3629b + " spans.");
            }
            iI0 -= iJ0;
            if (iI0 < 0 || (viewD = cVar.d(uVar)) == null) {
                break;
            }
            this.f3631d[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f3655b = true;
            return;
        }
        K(uVar, yVar, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f3631d[i17];
            if (cVar.f3669l == null) {
                if (z11) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z11) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f3635h);
            m0(view, iM, false);
            int iE = this.mOrientationHelper.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.mOrientationHelper.f(view) * 1.0f) / ((c) view.getLayoutParams()).f3641f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            k0(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f3631d[i18];
                m0(view2, 1073741824, true);
                int iE2 = this.mOrientationHelper.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f3631d[i19];
            if (this.mOrientationHelper.e(view3) != i16) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f3760b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iF0 = f0(cVar2.f3640e, cVar2.f3641f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.n.getChildMeasureSpec(iF0, 1073741824, i21, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    childMeasureSpec = RecyclerView.n.getChildMeasureSpec(iF0, 1073741824, i20, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                n0(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        bVar.f3654a = i16;
        if (this.mOrientation == 1) {
            if (cVar.f3663f == -1) {
                iF2 = cVar.f3659b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f3659b;
                iF2 = i12 + i16;
            }
            paddingTop = i12;
            iF = 0;
            paddingLeft = 0;
        } else {
            if (cVar.f3663f == -1) {
                i11 = cVar.f3659b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f3659b;
                i11 = i10 + i16;
            }
            paddingLeft = i10;
            paddingTop = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f3631d[i22];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = this.f3630c[cVar3.f3640e] + getPaddingTop();
                iF2 = this.mOrientationHelper.f(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                iF = getPaddingLeft() + this.f3630c[this.f3629b - cVar3.f3640e];
                paddingLeft = iF - this.mOrientationHelper.f(view4);
            } else {
                paddingLeft = this.f3630c[cVar3.f3640e] + getPaddingLeft();
                iF = this.mOrientationHelper.f(view4) + paddingLeft;
            }
            int i23 = iF2;
            int i24 = paddingTop;
            int i25 = iF;
            int i26 = paddingLeft;
            layoutDecoratedWithMargins(view4, i26, i24, i25, i23);
            iF2 = i23;
            paddingLeft = i26;
            iF = i25;
            paddingTop = i24;
            if (cVar3.c() || cVar3.b()) {
                bVar.f3656c = true;
            }
            bVar.f3657d = view4.hasFocusable() | bVar.f3657d;
        }
        Arrays.fill(this.f3631d, (Object) null);
    }

    public final void m0(View view, int i10, boolean z10) {
        int childMeasureSpec;
        int childMeasureSpec2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f3760b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iF0 = f0(cVar.f3640e, cVar.f3641f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.n.getChildMeasureSpec(iF0, i10, i12, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            childMeasureSpec = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.n.getChildMeasureSpec(iF0, i10, i11, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int childMeasureSpec4 = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        n0(view, childMeasureSpec2, childMeasureSpec, z10);
    }

    public final void n0(View view, int i10, int i11, boolean z10) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z10 ? shouldReMeasureChild(view, i10, i11, oVar) : shouldMeasureChild(view, i10, i11, oVar)) {
            view.measure(i10, i11);
        }
    }

    public void o0(int i10) {
        if (i10 == this.f3629b) {
            return;
        }
        this.f3628a = true;
        if (i10 >= 1) {
            this.f3629b = i10;
            this.f3634g.h();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i10) {
        super.onAnchorReady(uVar, yVar, aVar, i10);
        p0();
        if (yVar.b() > 0 && !yVar.e()) {
            R(uVar, yVar, aVar, i10);
        }
        S();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.y r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.y yVar, x xVar) {
        super.onInitializeAccessibilityNodeInfo(uVar, yVar, xVar);
        xVar.m0(GridView.class.getName());
        RecyclerView.Adapter adapter = this.mRecyclerView.f3695m;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        xVar.b(x.a.V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.y yVar, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, xVar);
            return;
        }
        c cVar = (c) layoutParams;
        int iH0 = h0(uVar, yVar, cVar.a());
        if (this.mOrientation == 0) {
            xVar.p0(x.f.a(cVar.e(), cVar.f(), iH0, 1, false, false));
        } else {
            xVar.p0(x.f.a(iH0, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.f3634g.h();
        this.f3634g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f3634g.h();
        this.f3634g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f3634g.h();
        this.f3634g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.f3634g.h();
        this.f3634g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f3634g.h();
        this.f3634g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.e()) {
            L();
        }
        super.onLayoutChildren(uVar, yVar);
        O();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutCompleted(RecyclerView.y yVar) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(yVar);
        this.f3628a = false;
        int i10 = this.f3637j;
        if (i10 == -1 || (viewFindViewByPosition = findViewByPosition(i10)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f3637j = -1;
    }

    public final void p0() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        M(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        RecyclerView.c0 c0VarO0;
        int iY;
        if (i10 != x.a.V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int itemCount = this.mRecyclerView.f3695m.getItemCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= itemCount) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int iI0 = i0(recyclerView.f3675c, recyclerView.f3688i0, i13);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int iH0 = h0(recyclerView2.f3675c, recyclerView2.f3688i0, i13);
                    if (this.mOrientation != 1) {
                        if (iI0 == i11 && iH0 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iI0 == i12 && iH0 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    scrollToPositionWithOffset(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewT = T();
        if (viewT == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!f3627m.contains(Integer.valueOf(i14)) || (c0VarO0 = this.mRecyclerView.o0(viewT)) == null) {
            return false;
        }
        int absoluteAdapterPosition = c0VarO0.getAbsoluteAdapterPosition();
        int iC0 = c0(absoluteAdapterPosition);
        int iA0 = a0(absoluteAdapterPosition);
        if (iC0 >= 0 && iA0 >= 0) {
            if (l0(absoluteAdapterPosition)) {
                this.f3638k = iC0;
                this.f3639l = iA0;
            }
            int i15 = this.f3638k;
            if (i15 == -1) {
                i15 = iC0;
            }
            int i16 = this.f3639l;
            if (i16 != -1) {
                iA0 = i16;
            }
            if (i14 == 17) {
                iY = Y(i15, iA0, absoluteAdapterPosition);
            } else if (i14 == 33) {
                iY = W(i15, iA0, absoluteAdapterPosition);
            } else if (i14 == 66) {
                iY = Z(i15, iA0, absoluteAdapterPosition);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iY = X(i15, iA0, absoluteAdapterPosition);
            }
            if (iY == -1 && this.mOrientation == 0) {
                if (i14 == 17) {
                    iY = V(iC0);
                } else if (i14 == 66) {
                    iY = U(iC0);
                }
            }
            if (iY != -1) {
                scrollToPosition(iY);
                this.f3637j = iY;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        p0();
        S();
        return super.scrollHorizontallyBy(i10, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        p0();
        S();
        return super.scrollVerticallyBy(i10, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f3630c == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.n.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f3630c;
            iChooseSize = RecyclerView.n.chooseSize(i10, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.n.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f3630c;
            iChooseSize2 = RecyclerView.n.chooseSize(i11, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f3628a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e, reason: collision with root package name */
        public int f3640e;

        /* renamed from: f, reason: collision with root package name */
        public int f3641f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3640e = -1;
            this.f3641f = 0;
        }

        public int e() {
            return this.f3640e;
        }

        public int f() {
            return this.f3641f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f3640e = -1;
            this.f3641f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3640e = -1;
            this.f3641f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3640e = -1;
            this.f3641f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f3628a = false;
        this.f3629b = -1;
        this.f3632e = new SparseIntArray();
        this.f3633f = new SparseIntArray();
        this.f3634g = new b();
        this.f3635h = new Rect();
        this.f3637j = -1;
        this.f3638k = -1;
        this.f3639l = -1;
        o0(i10);
    }
}
