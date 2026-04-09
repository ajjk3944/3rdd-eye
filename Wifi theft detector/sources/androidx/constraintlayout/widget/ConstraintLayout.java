package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import y.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: x, reason: collision with root package name */
    public static b0.e f2094x;

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2095a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2096b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f2097c;

    /* renamed from: d, reason: collision with root package name */
    public int f2098d;

    /* renamed from: e, reason: collision with root package name */
    public int f2099e;

    /* renamed from: f, reason: collision with root package name */
    public int f2100f;

    /* renamed from: g, reason: collision with root package name */
    public int f2101g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2102h;

    /* renamed from: i, reason: collision with root package name */
    public int f2103i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f2104j;

    /* renamed from: k, reason: collision with root package name */
    public b0.a f2105k;

    /* renamed from: l, reason: collision with root package name */
    public int f2106l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f2107m;

    /* renamed from: n, reason: collision with root package name */
    public int f2108n;

    /* renamed from: o, reason: collision with root package name */
    public int f2109o;

    /* renamed from: p, reason: collision with root package name */
    public int f2110p;

    /* renamed from: q, reason: collision with root package name */
    public int f2111q;

    /* renamed from: r, reason: collision with root package name */
    public int f2112r;

    /* renamed from: s, reason: collision with root package name */
    public int f2113s;

    /* renamed from: t, reason: collision with root package name */
    public SparseArray f2114t;

    /* renamed from: u, reason: collision with root package name */
    public c f2115u;

    /* renamed from: v, reason: collision with root package name */
    public int f2116v;

    /* renamed from: w, reason: collision with root package name */
    public int f2117w;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2118a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f2118a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2118a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2118a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2118a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.InterfaceC0500b {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintLayout f2168a;

        /* renamed from: b, reason: collision with root package name */
        public int f2169b;

        /* renamed from: c, reason: collision with root package name */
        public int f2170c;

        /* renamed from: d, reason: collision with root package name */
        public int f2171d;

        /* renamed from: e, reason: collision with root package name */
        public int f2172e;

        /* renamed from: f, reason: collision with root package name */
        public int f2173f;

        /* renamed from: g, reason: collision with root package name */
        public int f2174g;

        public c(ConstraintLayout constraintLayout) {
            this.f2168a = constraintLayout;
        }

        @Override // y.b.InterfaceC0500b
        public final void a() {
            int childCount = this.f2168a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2168a.getChildAt(i10);
                if (childAt instanceof f) {
                    ((f) childAt).b(this.f2168a);
                }
            }
            int size = this.f2168a.f2096b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f2168a.f2096b.get(i11)).r(this.f2168a);
                }
            }
        }

        @Override // y.b.InterfaceC0500b
        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.T() == 8 && !constraintWidget.h0()) {
                aVar.f24994e = 0;
                aVar.f24995f = 0;
                aVar.f24996g = 0;
                return;
            }
            if (constraintWidget.L() == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f24990a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f24991b;
            int i11 = aVar.f24992c;
            int i12 = aVar.f24993d;
            int i13 = this.f2169b + this.f2170c;
            int i14 = this.f2171d;
            View view = (View) constraintWidget.t();
            int[] iArr = a.f2118a;
            int i15 = iArr[dimensionBehaviour.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2173f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2173f, i14 + constraintWidget.C(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2173f, i14, -2);
                boolean z10 = constraintWidget.f1717v == 1;
                int i16 = aVar.f24999j;
                if (i16 == b.a.f24988l || i16 == b.a.f24989m) {
                    boolean z11 = view.getMeasuredHeight() == constraintWidget.y();
                    if (aVar.f24999j == b.a.f24989m || !z10 || ((z10 && z11) || (view instanceof f) || constraintWidget.l0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.U(), 1073741824);
                    }
                }
            }
            int i17 = iArr[dimensionBehaviour2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2174g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2174g, i13 + constraintWidget.S(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2174g, i13, -2);
                boolean z12 = constraintWidget.f1719w == 1;
                int i18 = aVar.f24999j;
                if (i18 == b.a.f24988l || i18 == b.a.f24989m) {
                    boolean z13 = view.getMeasuredWidth() == constraintWidget.U();
                    if (aVar.f24999j == b.a.f24989m || !z12 || ((z12 && z13) || (view instanceof f) || constraintWidget.m0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.y(), 1073741824);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.L();
            if (dVar != null && g.b(ConstraintLayout.this.f2103i, 256) && view.getMeasuredWidth() == constraintWidget.U() && view.getMeasuredWidth() < dVar.U() && view.getMeasuredHeight() == constraintWidget.y() && view.getMeasuredHeight() < dVar.y() && view.getBaseline() == constraintWidget.q() && !constraintWidget.k0() && d(constraintWidget.D(), iMakeMeasureSpec, constraintWidget.U()) && d(constraintWidget.E(), iMakeMeasureSpec2, constraintWidget.y())) {
                aVar.f24994e = constraintWidget.U();
                aVar.f24995f = constraintWidget.y();
                aVar.f24996g = constraintWidget.q();
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z14 = dimensionBehaviour == dimensionBehaviour3;
            boolean z15 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z16 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z17 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z18 = z14 && constraintWidget.f1684e0 > 0.0f;
            boolean z19 = z15 && constraintWidget.f1684e0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar = (b) view.getLayoutParams();
            int i19 = aVar.f24999j;
            if (i19 != b.a.f24988l && i19 != b.a.f24989m && z14 && constraintWidget.f1717v == 0 && z15 && constraintWidget.f1719w == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof b0.g) && (constraintWidget instanceof h)) {
                    ((b0.g) view).w((h) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.Q0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = constraintWidget.f1723y;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = constraintWidget.f1725z;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = constraintWidget.B;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = constraintWidget.C;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                if (!g.b(ConstraintLayout.this.f2103i, 1)) {
                    if (z18 && z16) {
                        iMax = (int) ((iMax2 * constraintWidget.f1684e0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / constraintWidget.f1684e0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    constraintWidget.Q0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z21 = baseline != i10;
            aVar.f24998i = (iMax == aVar.f24992c && iMax2 == aVar.f24993d) ? false : true;
            if (bVar.f2130f0) {
                z21 = true;
            }
            if (z21 && baseline != -1 && constraintWidget.q() != baseline) {
                aVar.f24998i = true;
            }
            aVar.f24994e = iMax;
            aVar.f24995f = iMax2;
            aVar.f24997h = z21;
            aVar.f24996g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2169b = i12;
            this.f2170c = i13;
            this.f2171d = i14;
            this.f2172e = i15;
            this.f2173f = i10;
            this.f2174g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@NonNull Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.f2095a = new SparseArray();
        this.f2096b = new ArrayList(4);
        this.f2097c = new androidx.constraintlayout.core.widgets.d();
        this.f2098d = 0;
        this.f2099e = 0;
        this.f2100f = Integer.MAX_VALUE;
        this.f2101g = Integer.MAX_VALUE;
        this.f2102h = true;
        this.f2103i = 257;
        this.f2104j = null;
        this.f2105k = null;
        this.f2106l = -1;
        this.f2107m = new HashMap();
        this.f2108n = -1;
        this.f2109o = -1;
        this.f2110p = -1;
        this.f2111q = -1;
        this.f2112r = 0;
        this.f2113s = 0;
        this.f2114t = new SparseArray();
        this.f2115u = new c(this);
        this.f2116v = 0;
        this.f2117w = 0;
        q(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static b0.e getSharedValues() {
        if (f2094x == null) {
            f2094x = new b0.e();
        }
        return f2094x;
    }

    public final boolean A() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            w();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r15, android.view.View r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f2096b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f2096b.get(i10)).s(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f2107m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f2107m.get(str);
    }

    public int getMaxHeight() {
        return this.f2101g;
    }

    public int getMaxWidth() {
        return this.f2100f;
    }

    public int getMinHeight() {
        return this.f2099e;
    }

    public int getMinWidth() {
        return this.f2098d;
    }

    public int getOptimizationLevel() {
        return this.f2097c.E1();
    }

    public final ConstraintWidget h(int i10) {
        if (i10 == 0) {
            return this.f2097c;
        }
        View viewFindViewById = (View) this.f2095a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f2097c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f2160u0;
    }

    public View l(int i10) {
        return (View) this.f2095a.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f2160u0;
            if ((childAt.getVisibility() != 8 || bVar.f2132g0 || bVar.f2134h0 || bVar.f2138j0 || zIsInEditMode) && !bVar.f2136i0) {
                int iV = constraintWidget.V();
                int iW = constraintWidget.W();
                int iU = constraintWidget.U() + iV;
                int iY = constraintWidget.y() + iW;
                childAt.layout(iV, iW, iU, iY);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV, iW, iU, iY);
                }
            }
        }
        int size = this.f2096b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.b) this.f2096b.get(i15)).q(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2116v == i10) {
            int i12 = this.f2117w;
        }
        if (!this.f2102h) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f2102h = true;
                    break;
                }
                i13++;
            }
        }
        this.f2116v = i10;
        this.f2117w = i11;
        this.f2097c.T1(r());
        if (this.f2102h) {
            this.f2102h = false;
            if (A()) {
                this.f2097c.V1();
            }
        }
        v(this.f2097c, this.f2103i, i10, i11);
        u(i10, i11, this.f2097c.U(), this.f2097c.y(), this.f2097c.L1(), this.f2097c.J1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetP = p(view);
        if ((view instanceof e) && !(constraintWidgetP instanceof androidx.constraintlayout.core.widgets.f)) {
            b bVar = (b) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.f fVar = new androidx.constraintlayout.core.widgets.f();
            bVar.f2160u0 = fVar;
            bVar.f2132g0 = true;
            fVar.v1(bVar.Y);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.v();
            ((b) view.getLayoutParams()).f2134h0 = true;
            if (!this.f2096b.contains(bVar2)) {
                this.f2096b.add(bVar2);
            }
        }
        this.f2095a.put(view.getId(), view);
        this.f2102h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2095a.remove(view.getId());
        this.f2097c.o1(p(view));
        this.f2096b.remove(view);
        this.f2102h = true;
    }

    public final ConstraintWidget p(View view) {
        if (view == this) {
            return this.f2097c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2160u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f2160u0;
        }
        return null;
    }

    public final void q(AttributeSet attributeSet, int i10, int i11) throws XmlPullParserException, IOException, NumberFormatException {
        this.f2097c.w0(this);
        this.f2097c.Q1(this.f2115u);
        this.f2095a.put(getId(), this);
        this.f2104j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.ConstraintLayout_Layout, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == b0.d.ConstraintLayout_Layout_android_minWidth) {
                    this.f2098d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2098d);
                } else if (index == b0.d.ConstraintLayout_Layout_android_minHeight) {
                    this.f2099e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2099e);
                } else if (index == b0.d.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2100f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2100f);
                } else if (index == b0.d.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2101g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2101g);
                } else if (index == b0.d.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2103i = typedArrayObtainStyledAttributes.getInt(index, this.f2103i);
                } else if (index == b0.d.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2105k = null;
                        }
                    }
                } else if (index == b0.d.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f2104j = cVar;
                        cVar.C(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2104j = null;
                    }
                    this.f2106l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2097c.R1(this.f2103i);
    }

    public boolean r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public final void s() {
        this.f2102h = true;
        this.f2108n = -1;
        this.f2109o = -1;
        this.f2110p = -1;
        this.f2111q = -1;
        this.f2112r = 0;
        this.f2113s = 0;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f2104j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2095a.remove(getId());
        super.setId(i10);
        this.f2095a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2101g) {
            return;
        }
        this.f2101g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2100f) {
            return;
        }
        this.f2100f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2099e) {
            return;
        }
        this.f2099e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2098d) {
            return;
        }
        this.f2098d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(b0.b bVar) {
        b0.a aVar = this.f2105k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2103i = i10;
        this.f2097c.R1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i10) {
        this.f2105k = new b0.a(getContext(), this, i10);
    }

    public void u(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f2115u;
        int i14 = cVar.f2172e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f2171d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f2100f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f2101g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f2108n = iMin;
        this.f2109o = iMin2;
    }

    public void v(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f2115u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (r()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            y(dVar, mode, i15, mode2, i16);
            dVar.M1(i10, mode, i15, mode2, i16, this.f2108n, this.f2109o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        y(dVar, mode, i152, mode2, i162);
        dVar.M1(i10, mode, i152, mode2, i162, this.f2108n, this.f2109o, i13, iMax);
    }

    public final void w() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ConstraintWidget constraintWidgetP = p(getChildAt(i10));
            if (constraintWidgetP != null) {
                constraintWidgetP.r0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    h(childAt.getId()).x0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2106l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2106l && (childAt2 instanceof d)) {
                    this.f2104j = ((d) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f2104j;
        if (cVar != null) {
            cVar.k(this, true);
        }
        this.f2097c.p1();
        int size = this.f2096b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.b) this.f2096b.get(i13)).u(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof f) {
                ((f) childAt3).c(this);
            }
        }
        this.f2114t.clear();
        this.f2114t.put(0, this.f2097c);
        this.f2114t.put(getId(), this.f2097c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2114t.put(childAt4.getId(), p(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            ConstraintWidget constraintWidgetP2 = p(childAt5);
            if (constraintWidgetP2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f2097c.a(constraintWidgetP2);
                d(zIsInEditMode, childAt5, constraintWidgetP2, bVar, this.f2114t);
            }
        }
    }

    public void x(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2107m == null) {
                this.f2107m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f2107m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
  (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
  (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
 binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(androidx.constraintlayout.core.widgets.d r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f2115u
            int r1 = r0.f2172e
            int r0 = r0.f2171d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.f2100f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f2098d
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f2098d
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.f2101g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f2099e
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f2099e
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.U()
            if (r10 != r11) goto L69
            int r11 = r8.y()
            if (r12 == r11) goto L6c
        L69:
            r8.I1()
        L6c:
            r8.h1(r5)
            r8.i1(r5)
            int r11 = r7.f2100f
            int r11 = r11 - r0
            r8.S0(r11)
            int r11 = r7.f2101g
            int r11 = r11 - r1
            r8.R0(r11)
            r8.V0(r5)
            r8.U0(r5)
            r8.K0(r9)
            r8.f1(r10)
            r8.b1(r2)
            r8.G0(r12)
            int r9 = r7.f2098d
            int r9 = r9 - r0
            r8.V0(r9)
            int r9 = r7.f2099e
            int r9 = r9 - r1
            r8.U0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(androidx.constraintlayout.core.widgets.d, int, int, int, int):void");
    }

    public final void z(ConstraintWidget constraintWidget, b bVar, SparseArray sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = (View) this.f2095a.get(i10);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i10);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f2130f0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f2130f0 = true;
            bVar2.f2160u0.F0(true);
        }
        constraintWidget.p(type2).b(constraintWidget2.p(type), bVar.C, bVar.B, true);
        constraintWidget.F0(true);
        constraintWidget.p(ConstraintAnchor.Type.TOP).q();
        constraintWidget.p(ConstraintAnchor.Type.BOTTOM).q();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f2095a = new SparseArray();
        this.f2096b = new ArrayList(4);
        this.f2097c = new androidx.constraintlayout.core.widgets.d();
        this.f2098d = 0;
        this.f2099e = 0;
        this.f2100f = Integer.MAX_VALUE;
        this.f2101g = Integer.MAX_VALUE;
        this.f2102h = true;
        this.f2103i = 257;
        this.f2104j = null;
        this.f2105k = null;
        this.f2106l = -1;
        this.f2107m = new HashMap();
        this.f2108n = -1;
        this.f2109o = -1;
        this.f2110p = -1;
        this.f2111q = -1;
        this.f2112r = 0;
        this.f2113s = 0;
        this.f2114t = new SparseArray();
        this.f2115u = new c(this);
        this.f2116v = 0;
        this.f2117w = 0;
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i10);
        this.f2095a = new SparseArray();
        this.f2096b = new ArrayList(4);
        this.f2097c = new androidx.constraintlayout.core.widgets.d();
        this.f2098d = 0;
        this.f2099e = 0;
        this.f2100f = Integer.MAX_VALUE;
        this.f2101g = Integer.MAX_VALUE;
        this.f2102h = true;
        this.f2103i = 257;
        this.f2104j = null;
        this.f2105k = null;
        this.f2106l = -1;
        this.f2107m = new HashMap();
        this.f2108n = -1;
        this.f2109o = -1;
        this.f2110p = -1;
        this.f2111q = -1;
        this.f2112r = 0;
        this.f2113s = 0;
        this.f2114t = new SparseArray();
        this.f2115u = new c(this);
        this.f2116v = 0;
        this.f2117w = 0;
        q(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public boolean D;
        public boolean E;
        public float F;
        public float G;
        public String H;
        public float I;
        public int J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f2119a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f2120a0;

        /* renamed from: b, reason: collision with root package name */
        public int f2121b;

        /* renamed from: b0, reason: collision with root package name */
        public String f2122b0;

        /* renamed from: c, reason: collision with root package name */
        public float f2123c;

        /* renamed from: c0, reason: collision with root package name */
        public int f2124c0;

        /* renamed from: d, reason: collision with root package name */
        public int f2125d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f2126d0;

        /* renamed from: e, reason: collision with root package name */
        public int f2127e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f2128e0;

        /* renamed from: f, reason: collision with root package name */
        public int f2129f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f2130f0;

        /* renamed from: g, reason: collision with root package name */
        public int f2131g;

        /* renamed from: g0, reason: collision with root package name */
        public boolean f2132g0;

        /* renamed from: h, reason: collision with root package name */
        public int f2133h;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f2134h0;

        /* renamed from: i, reason: collision with root package name */
        public int f2135i;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f2136i0;

        /* renamed from: j, reason: collision with root package name */
        public int f2137j;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f2138j0;

        /* renamed from: k, reason: collision with root package name */
        public int f2139k;

        /* renamed from: k0, reason: collision with root package name */
        public int f2140k0;

        /* renamed from: l, reason: collision with root package name */
        public int f2141l;

        /* renamed from: l0, reason: collision with root package name */
        public int f2142l0;

        /* renamed from: m, reason: collision with root package name */
        public int f2143m;

        /* renamed from: m0, reason: collision with root package name */
        public int f2144m0;

        /* renamed from: n, reason: collision with root package name */
        public int f2145n;

        /* renamed from: n0, reason: collision with root package name */
        public int f2146n0;

        /* renamed from: o, reason: collision with root package name */
        public int f2147o;

        /* renamed from: o0, reason: collision with root package name */
        public int f2148o0;

        /* renamed from: p, reason: collision with root package name */
        public int f2149p;

        /* renamed from: p0, reason: collision with root package name */
        public int f2150p0;

        /* renamed from: q, reason: collision with root package name */
        public float f2151q;

        /* renamed from: q0, reason: collision with root package name */
        public float f2152q0;

        /* renamed from: r, reason: collision with root package name */
        public int f2153r;

        /* renamed from: r0, reason: collision with root package name */
        public int f2154r0;

        /* renamed from: s, reason: collision with root package name */
        public int f2155s;

        /* renamed from: s0, reason: collision with root package name */
        public int f2156s0;

        /* renamed from: t, reason: collision with root package name */
        public int f2157t;

        /* renamed from: t0, reason: collision with root package name */
        public float f2158t0;

        /* renamed from: u, reason: collision with root package name */
        public int f2159u;

        /* renamed from: u0, reason: collision with root package name */
        public ConstraintWidget f2160u0;

        /* renamed from: v, reason: collision with root package name */
        public int f2161v;

        /* renamed from: v0, reason: collision with root package name */
        public boolean f2162v0;

        /* renamed from: w, reason: collision with root package name */
        public int f2163w;

        /* renamed from: x, reason: collision with root package name */
        public int f2164x;

        /* renamed from: y, reason: collision with root package name */
        public int f2165y;

        /* renamed from: z, reason: collision with root package name */
        public int f2166z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f2167a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2167a = sparseIntArray;
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(b0.d.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            super(context, attributeSet);
            this.f2119a = -1;
            this.f2121b = -1;
            this.f2123c = -1.0f;
            this.f2125d = -1;
            this.f2127e = -1;
            this.f2129f = -1;
            this.f2131g = -1;
            this.f2133h = -1;
            this.f2135i = -1;
            this.f2137j = -1;
            this.f2139k = -1;
            this.f2141l = -1;
            this.f2143m = -1;
            this.f2145n = -1;
            this.f2147o = -1;
            this.f2149p = 0;
            this.f2151q = 0.0f;
            this.f2153r = -1;
            this.f2155s = -1;
            this.f2157t = -1;
            this.f2159u = -1;
            this.f2161v = Integer.MIN_VALUE;
            this.f2163w = Integer.MIN_VALUE;
            this.f2164x = Integer.MIN_VALUE;
            this.f2165y = Integer.MIN_VALUE;
            this.f2166z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f2120a0 = false;
            this.f2122b0 = null;
            this.f2124c0 = 0;
            this.f2126d0 = true;
            this.f2128e0 = true;
            this.f2130f0 = false;
            this.f2132g0 = false;
            this.f2134h0 = false;
            this.f2136i0 = false;
            this.f2138j0 = false;
            this.f2140k0 = -1;
            this.f2142l0 = -1;
            this.f2144m0 = -1;
            this.f2146n0 = -1;
            this.f2148o0 = Integer.MIN_VALUE;
            this.f2150p0 = Integer.MIN_VALUE;
            this.f2152q0 = 0.5f;
            this.f2160u0 = new ConstraintWidget();
            this.f2162v0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f2167a.get(index);
                switch (i11) {
                    case 1:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2147o);
                        this.f2147o = resourceId;
                        if (resourceId == -1) {
                            this.f2147o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2149p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2149p);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f2151q) % 360.0f;
                        this.f2151q = f10;
                        if (f10 < 0.0f) {
                            this.f2151q = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2119a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2119a);
                        break;
                    case 6:
                        this.f2121b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2121b);
                        break;
                    case 7:
                        this.f2123c = typedArrayObtainStyledAttributes.getFloat(index, this.f2123c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2125d);
                        this.f2125d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2125d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2127e);
                        this.f2127e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2127e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2129f);
                        this.f2129f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2129f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2131g);
                        this.f2131g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2131g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2133h);
                        this.f2133h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2133h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2135i);
                        this.f2135i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2135i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2137j);
                        this.f2137j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2137j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2139k);
                        this.f2139k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2139k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2141l);
                        this.f2141l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2141l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2153r);
                        this.f2153r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2153r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2155s);
                        this.f2155s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2155s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2157t);
                        this.f2157t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2157t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2159u);
                        this.f2159u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2159u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2161v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2161v);
                        break;
                    case 22:
                        this.f2163w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2163w);
                        break;
                    case 23:
                        this.f2164x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2164x);
                        break;
                    case 24:
                        this.f2165y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2165y);
                        break;
                    case 25:
                        this.f2166z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2166z);
                        break;
                    case 26:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.Z = typedArrayObtainStyledAttributes.getBoolean(index, this.Z);
                        break;
                    case 28:
                        this.f2120a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2120a0);
                        break;
                    case 29:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 30:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.O = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.U = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.U));
                        this.O = 2;
                        break;
                    case 36:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.c.H(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.K = typedArrayObtainStyledAttributes.getFloat(index, this.K);
                                break;
                            case 46:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 47:
                                this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                                break;
                            case 50:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 51:
                                this.f2122b0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2143m);
                                this.f2143m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f2143m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2145n);
                                this.f2145n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f2145n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 55:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        androidx.constraintlayout.widget.c.F(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.D = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.c.F(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.E = true;
                                        break;
                                    case 66:
                                        this.f2124c0 = typedArrayObtainStyledAttributes.getInt(index, this.f2124c0);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public String a() {
            return this.f2122b0;
        }

        public void b() {
            this.f2132g0 = false;
            this.f2126d0 = true;
            this.f2128e0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.Z) {
                this.f2126d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f2120a0) {
                this.f2128e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2126d0 = false;
                if (i10 == 0 && this.O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.Z = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2128e0 = false;
                if (i11 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2120a0 = true;
                }
            }
            if (this.f2123c == -1.0f && this.f2119a == -1 && this.f2121b == -1) {
                return;
            }
            this.f2132g0 = true;
            this.f2126d0 = true;
            this.f2128e0 = true;
            if (!(this.f2160u0 instanceof androidx.constraintlayout.core.widgets.f)) {
                this.f2160u0 = new androidx.constraintlayout.core.widgets.f();
            }
            ((androidx.constraintlayout.core.widgets.f) this.f2160u0).v1(this.Y);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f2119a = -1;
            this.f2121b = -1;
            this.f2123c = -1.0f;
            this.f2125d = -1;
            this.f2127e = -1;
            this.f2129f = -1;
            this.f2131g = -1;
            this.f2133h = -1;
            this.f2135i = -1;
            this.f2137j = -1;
            this.f2139k = -1;
            this.f2141l = -1;
            this.f2143m = -1;
            this.f2145n = -1;
            this.f2147o = -1;
            this.f2149p = 0;
            this.f2151q = 0.0f;
            this.f2153r = -1;
            this.f2155s = -1;
            this.f2157t = -1;
            this.f2159u = -1;
            this.f2161v = Integer.MIN_VALUE;
            this.f2163w = Integer.MIN_VALUE;
            this.f2164x = Integer.MIN_VALUE;
            this.f2165y = Integer.MIN_VALUE;
            this.f2166z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f2120a0 = false;
            this.f2122b0 = null;
            this.f2124c0 = 0;
            this.f2126d0 = true;
            this.f2128e0 = true;
            this.f2130f0 = false;
            this.f2132g0 = false;
            this.f2134h0 = false;
            this.f2136i0 = false;
            this.f2138j0 = false;
            this.f2140k0 = -1;
            this.f2142l0 = -1;
            this.f2144m0 = -1;
            this.f2146n0 = -1;
            this.f2148o0 = Integer.MIN_VALUE;
            this.f2150p0 = Integer.MIN_VALUE;
            this.f2152q0 = 0.5f;
            this.f2160u0 = new ConstraintWidget();
            this.f2162v0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2119a = -1;
            this.f2121b = -1;
            this.f2123c = -1.0f;
            this.f2125d = -1;
            this.f2127e = -1;
            this.f2129f = -1;
            this.f2131g = -1;
            this.f2133h = -1;
            this.f2135i = -1;
            this.f2137j = -1;
            this.f2139k = -1;
            this.f2141l = -1;
            this.f2143m = -1;
            this.f2145n = -1;
            this.f2147o = -1;
            this.f2149p = 0;
            this.f2151q = 0.0f;
            this.f2153r = -1;
            this.f2155s = -1;
            this.f2157t = -1;
            this.f2159u = -1;
            this.f2161v = Integer.MIN_VALUE;
            this.f2163w = Integer.MIN_VALUE;
            this.f2164x = Integer.MIN_VALUE;
            this.f2165y = Integer.MIN_VALUE;
            this.f2166z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.f2120a0 = false;
            this.f2122b0 = null;
            this.f2124c0 = 0;
            this.f2126d0 = true;
            this.f2128e0 = true;
            this.f2130f0 = false;
            this.f2132g0 = false;
            this.f2134h0 = false;
            this.f2136i0 = false;
            this.f2138j0 = false;
            this.f2140k0 = -1;
            this.f2142l0 = -1;
            this.f2144m0 = -1;
            this.f2146n0 = -1;
            this.f2148o0 = Integer.MIN_VALUE;
            this.f2150p0 = Integer.MIN_VALUE;
            this.f2152q0 = 0.5f;
            this.f2160u0 = new ConstraintWidget();
            this.f2162v0 = false;
        }
    }
}
