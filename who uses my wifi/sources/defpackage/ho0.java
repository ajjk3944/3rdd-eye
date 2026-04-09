package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ho0 {
    public t83 a;
    public RecyclerView b;
    public final vq2 c;
    public final vq2 d;
    public w60 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public ho0() {
        kf3 kf3Var = new kf3(7, this);
        of3 of3Var = new of3(6, this);
        this.c = new vq2(kf3Var);
        this.d = new vq2(of3Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((io0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((io0) view.getLayoutParams()).a.b();
    }

    public static go0 I(Context context, AttributeSet attributeSet, int i, int i2) {
        go0 go0Var = new go0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, en0.a, i, i2);
        go0Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        go0Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        go0Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        go0Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return go0Var;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        io0 io0Var = (io0) view.getLayoutParams();
        Rect rect = io0Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) io0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) io0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) io0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) io0Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((io0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        ao0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e61.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(no0 no0Var, to0 to0Var) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((io0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iC = recyclerView.j.C();
            for (int i2 = 0; i2 < iC; i2++) {
                recyclerView.j.B(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iC = recyclerView.j.C();
            for (int i2 = 0; i2 < iC; i2++) {
                recyclerView.j.B(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, no0 no0Var, to0 to0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        no0 no0Var = recyclerView.g;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        ao0 ao0Var = this.b.q;
        if (ao0Var != null) {
            accessibilityEvent.setItemCount(ao0Var.a());
        }
    }

    public final void W(View view, a1 a1Var) {
        wo0 wo0VarI = RecyclerView.I(view);
        if (wo0VarI == null || wo0VarI.h()) {
            return;
        }
        t83 t83Var = this.a;
        if (((ArrayList) t83Var.i).contains(wo0VarI.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.g, recyclerView.k0, view, a1Var);
    }

    public final void b(View view, int i, boolean z) {
        wo0 wo0VarI = RecyclerView.I(view);
        if (z || wo0VarI.h()) {
            bw0 bw0Var = (bw0) this.b.k.g;
            l61 l61VarA = (l61) bw0Var.get(wo0VarI);
            if (l61VarA == null) {
                l61VarA = l61.a();
                bw0Var.put(wo0VarI, l61VarA);
            }
            l61VarA.a |= 1;
        } else {
            this.b.k.A(wo0VarI);
        }
        io0 io0Var = (io0) view.getLayoutParams();
        if (wo0VarI.p() || wo0VarI.i()) {
            if (wo0VarI.i()) {
                wo0VarI.n.k(wo0VarI);
            } else {
                wo0VarI.j &= -33;
            }
            this.a.x(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.b) {
                t83 t83Var = this.a;
                ue ueVar = (ue) t83Var.h;
                int iIndexOfChild = ((RecyclerView) ((z71) t83Var.g).g).indexOfChild(view);
                int iF = (iIndexOfChild == -1 || ueVar.q(iIndexOfChild)) ? -1 : iIndexOfChild - ueVar.f(iIndexOfChild);
                if (i == -1) {
                    i = this.a.C();
                }
                if (iF == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
                if (iF != i) {
                    ho0 ho0Var = this.b.r;
                    View viewU = ho0Var.u(iF);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iF + ho0Var.b.toString());
                    }
                    ho0Var.u(iF);
                    ho0Var.a.y(iF);
                    io0 io0Var2 = (io0) viewU.getLayoutParams();
                    wo0 wo0VarI2 = RecyclerView.I(viewU);
                    if (wo0VarI2.h()) {
                        bw0 bw0Var2 = (bw0) ho0Var.b.k.g;
                        l61 l61VarA2 = (l61) bw0Var2.get(wo0VarI2);
                        if (l61VarA2 == null) {
                            l61VarA2 = l61.a();
                            bw0Var2.put(wo0VarI2, l61VarA2);
                        }
                        l61VarA2.a = 1 | l61VarA2.a;
                    } else {
                        ho0Var.b.k.A(wo0VarI2);
                    }
                    ho0Var.a.x(viewU, i, io0Var2, wo0VarI2.h());
                }
            } else {
                this.a.w(view, i, false);
                io0Var.c = true;
                w60 w60Var = this.e;
                if (w60Var != null && w60Var.e) {
                    w60Var.b.getClass();
                    wo0 wo0VarI3 = RecyclerView.I(view);
                    if ((wo0VarI3 != null ? wo0VarI3.b() : -1) == w60Var.a) {
                        w60Var.f = view;
                    }
                }
            }
        }
        if (io0Var.d) {
            wo0VarI.a.invalidate();
            io0Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(no0 no0Var, to0 to0Var);

    public abstract boolean d();

    public abstract void d0(to0 to0Var);

    public abstract boolean e();

    public boolean f(io0 io0Var) {
        return io0Var != null;
    }

    public Parcelable f0() {
        return null;
    }

    public final void h0(no0 no0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).o()) {
                View viewU = u(iV);
                k0(iV);
                no0Var.g(viewU);
            }
        }
    }

    public final void i0(no0 no0Var) {
        ArrayList arrayList = no0Var.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((wo0) arrayList.get(i)).a;
            wo0 wo0VarI = RecyclerView.I(view);
            if (!wo0VarI.o()) {
                wo0VarI.n(false);
                if (wo0VarI.j()) {
                    this.b.removeDetachedView(view, false);
                }
                eo0 eo0Var = this.b.P;
                if (eo0Var != null) {
                    eo0Var.d(wo0VarI);
                }
                wo0VarI.n(true);
                wo0 wo0VarI2 = RecyclerView.I(view);
                wo0VarI2.n = null;
                wo0VarI2.o = false;
                wo0VarI2.j &= -33;
                no0Var.h(wo0VarI2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = no0Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(to0 to0Var);

    public final void j0(View view, no0 no0Var) {
        t83 t83Var = this.a;
        z71 z71Var = (z71) t83Var.g;
        int iIndexOfChild = ((RecyclerView) z71Var.g).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((ue) t83Var.h).C(iIndexOfChild)) {
                t83Var.Q(view);
            }
            z71Var.i(iIndexOfChild);
        }
        no0Var.g(view);
    }

    public abstract int k(to0 to0Var);

    public final void k0(int i) {
        if (u(i) != null) {
            t83 t83Var = this.a;
            int iE = t83Var.E(i);
            z71 z71Var = (z71) t83Var.g;
            View childAt = ((RecyclerView) z71Var.g).getChildAt(iE);
            if (childAt == null) {
                return;
            }
            if (((ue) t83Var.h).C(iE)) {
                t83Var.Q(childAt);
            }
            z71Var.i(iE);
        }
    }

    public abstract int l(to0 to0Var);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.n
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.b0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho0.l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int m(to0 to0Var);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(to0 to0Var);

    public abstract int n0(int i, no0 no0Var, to0 to0Var);

    public abstract int o(to0 to0Var);

    public abstract void o0(int i);

    public final void p(no0 no0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            wo0 wo0VarI = RecyclerView.I(viewU);
            if (!wo0VarI.o()) {
                if (!wo0VarI.f() || wo0VarI.h() || this.b.q.g) {
                    u(iV);
                    this.a.y(iV);
                    no0Var.i(viewU);
                    this.b.k.A(wo0VarI);
                } else {
                    k0(iV);
                    no0Var.h(wo0VarI);
                }
            }
        }
    }

    public abstract int p0(int i, no0 no0Var, to0 to0Var);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            wo0 wo0VarI = RecyclerView.I(viewU);
            if (wo0VarI != null && wo0VarI.b() == i && !wo0VarI.o() && (this.b.k0.g || !wo0VarI.h())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract io0 r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.D0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.D0;
        }
    }

    public io0 s(Context context, AttributeSet attributeSet) {
        return new io0(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = e61.a;
        this.b.setMeasuredDimension(g(i, iF, recyclerView.getMinimumWidth()), g(i2, iD, this.b.getMinimumHeight()));
    }

    public io0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof io0 ? new io0((io0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new io0((ViewGroup.MarginLayoutParams) layoutParams) : new io0(layoutParams);
    }

    public final void t0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.n;
            y(viewU, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.n.set(i6, i4, i3, i5);
        s0(this.b.n, i, i2);
    }

    public final View u(int i) {
        t83 t83Var = this.a;
        if (t83Var != null) {
            return t83Var.B(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.j;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        t83 t83Var = this.a;
        if (t83Var != null) {
            return t83Var.C();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, io0 io0Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) io0Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) io0Var).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(no0 no0Var, to0 to0Var) {
        return -1;
    }

    public final boolean x0(View view, int i, int i2, io0 io0Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) io0Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) io0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        io0 io0Var = (io0) view.getLayoutParams();
        Rect rect2 = io0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) io0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) io0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) io0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) io0Var).bottomMargin);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(w60 w60Var) {
        w60 w60Var2 = this.e;
        if (w60Var2 != null && w60Var != w60Var2 && w60Var2.e) {
            w60Var2.i();
        }
        this.e = w60Var;
        RecyclerView recyclerView = this.b;
        vo0 vo0Var = recyclerView.h0;
        vo0Var.l.removeCallbacks(vo0Var);
        vo0Var.h.abortAnimation();
        w60Var.b = recyclerView;
        w60Var.c = this;
        int i = w60Var.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.k0.a = i;
        w60Var.e = true;
        w60Var.d = true;
        w60Var.f = recyclerView.r.q(i);
        w60Var.b.h0.a();
    }

    public void Q() {
    }

    public void Y() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, ef efVar) {
    }

    public void V(no0 no0Var, to0 to0Var, View view, a1 a1Var) {
    }

    public void h(int i, int i2, to0 to0Var, ef efVar) {
    }
}
