package X6;

import Q9.C1553s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import c9.C2092m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.x;
import r7.AbstractC5534e;
import r7.C5533d;

/* compiled from: LinearContainerLayout.kt */
/* loaded from: classes.dex */
public class n extends AbstractC5534e implements e {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f13617B;

    /* renamed from: A, reason: collision with root package name */
    public float f13618A;

    /* renamed from: d, reason: collision with root package name */
    public int f13619d;

    /* renamed from: e, reason: collision with root package name */
    public int f13620e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553s f13621f;

    /* renamed from: g, reason: collision with root package name */
    public int f13622g;

    /* renamed from: h, reason: collision with root package name */
    public int f13623h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f13624j;

    /* renamed from: k, reason: collision with root package name */
    public final C1553s f13625k;

    /* renamed from: l, reason: collision with root package name */
    public int f13626l;

    /* renamed from: m, reason: collision with root package name */
    public int f13627m;

    /* renamed from: n, reason: collision with root package name */
    public int f13628n;

    /* renamed from: o, reason: collision with root package name */
    public int f13629o;

    /* renamed from: p, reason: collision with root package name */
    public int f13630p;

    /* renamed from: q, reason: collision with root package name */
    public int f13631q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC5534e.b f13632r;

    /* renamed from: s, reason: collision with root package name */
    public int f13633s;

    /* renamed from: t, reason: collision with root package name */
    public int f13634t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f13635u;

    /* renamed from: v, reason: collision with root package name */
    public final C1553s f13636v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f13637w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f13638x;

    /* renamed from: y, reason: collision with root package name */
    public int f13639y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f13640z;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(n.class, "orientation", "getOrientation()I");
        x.f43661a.getClass();
        f13617B = new w9.i[]{nVar, new kotlin.jvm.internal.n(n.class, "aspectRatio", "getAspectRatio()F"), new kotlin.jvm.internal.n(n.class, "showDividers", "getShowDividers()I")};
    }

    public n(Context context) {
        super(context, null, 0);
        this.f13619d = -1;
        this.f13620e = -1;
        this.f13621f = r.a(0);
        this.f13625k = new C1553s(Float.valueOf(0.0f), d.f13581g);
        this.f13632r = new AbstractC5534e.b(0);
        this.f13633s = -1;
        this.f13634t = -1;
        this.f13636v = r.a(0);
        this.f13637w = new ArrayList();
        this.f13638x = new LinkedHashSet();
        this.f13640z = new LinkedHashSet();
    }

    private final int getDividerHeightWithMargins() {
        return this.f13627m + this.f13628n + this.f13629o;
    }

    private final int getDividerWidthWithMargins() {
        return this.f13626l + this.f13631q + this.f13630p;
    }

    private final int getVisibleChildCount() {
        C6.o oVar = new C6.o(this, 1);
        int i = 0;
        while (oVar.hasNext()) {
            if (!(((View) oVar.next()).getVisibility() == 8) && (i = i + 1) < 0) {
                C2092m.Z();
                throw null;
            }
        }
        return i;
    }

    public static float l(float f10, int i) {
        return f10 > 0.0f ? f10 : i == -1 ? 1.0f : 0.0f;
    }

    @Override // r7.AbstractC5534e, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return getOrientation() == 1 ? new C5533d(-1, -2) : new C5533d(-2, -2);
    }

    public float getAspectRatio() {
        return ((Number) this.f13625k.a(this, f13617B[1])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (getOrientation() != 1) {
            int i = this.f13619d;
            return i != -1 ? getPaddingTop() + i : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return getPaddingTop() + baseline + ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams)).topMargin;
    }

    public final Drawable getDividerDrawable() {
        return this.f13635u;
    }

    public final int getOrientation() {
        return ((Number) this.f13621f.a(this, f13617B[0])).intValue();
    }

    public final int getShowDividers() {
        return ((Number) this.f13636v.a(this, f13617B[2])).intValue();
    }

    public final C1992A k(Canvas canvas, int i, int i10, int i11, int i12) {
        Drawable drawable = this.f13635u;
        if (drawable == null) {
            return null;
        }
        float f10 = (i + i11) / 2.0f;
        float f11 = (i10 + i12) / 2.0f;
        float f12 = this.f13626l / 2.0f;
        float f13 = this.f13627m / 2.0f;
        drawable.setBounds(Math.max((int) (f10 - f12), i), Math.max((int) (f11 - f13), i10), Math.min((int) (f10 + f12), i11), Math.min((int) (f11 + f13), i12));
        drawable.draw(canvas);
        return C1992A.f18074a;
    }

    public final int m(int i, int i10) {
        int i11;
        if (i >= 0 || (i11 = this.i) <= 0) {
            return (i < 0 || !r.b(i10)) ? i : i + this.i;
        }
        int i12 = i + i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    public final boolean n(int i) {
        if (i == this.f13633s) {
            return (getShowDividers() & 1) != 0;
        }
        if (i > this.f13634t) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i10 = i - 1; -1 < i10; i10--) {
                View childAt = getChildAt(i);
                kotlin.jvm.internal.l.e(childAt, "getChildAt(childIndex)");
                if (childAt.getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(View view, int i, int i10, boolean z10, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        int i11 = ((ViewGroup.MarginLayoutParams) c5533d).height;
        if (i11 == -3) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            C5533d c5533d2 = (C5533d) layoutParams2;
            int i12 = c5533d2.f45764g;
            ((ViewGroup.MarginLayoutParams) c5533d2).height = -2;
            c5533d2.f45764g = Integer.MAX_VALUE;
            measureChildWithMargins(view, i, 0, i10, 0);
            ((ViewGroup.MarginLayoutParams) c5533d2).height = -3;
            c5533d2.f45764g = i12;
            if (z11) {
                int i13 = this.f13623h;
                this.f13623h = Math.max(i13, c5533d2.d() + view.getMeasuredHeight() + i13);
                ArrayList arrayList = this.f13637w;
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            }
        } else if (i11 != -1) {
            measureChildWithMargins(view, i, 0, i10, 0);
        } else if (r.b(i10)) {
            measureChildWithMargins(view, i, 0, View.MeasureSpec.makeMeasureSpec(0, 1073741824), 0);
        } else {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            C5533d c5533d3 = (C5533d) layoutParams3;
            ((ViewGroup.MarginLayoutParams) c5533d3).height = -2;
            measureChildWithMargins(view, i, 0, i10, 0);
            ((ViewGroup.MarginLayoutParams) c5533d3).height = -1;
            if (z11) {
                int i14 = this.i;
                this.i = Math.max(i14, view.getMeasuredHeight() + i14);
            }
        }
        this.f13624j = View.combineMeasuredStates(this.f13624j, view.getMeasuredState());
        if (z10) {
            u(i, c5533d.b() + view.getMeasuredWidth());
        }
        if (z11) {
            int i15 = this.f13622g;
            this.f13622g = Math.max(i15, c5533d.d() + view.getMeasuredHeight() + i15);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        int height;
        Canvas canvas2 = canvas;
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (this.f13635u == null) {
            return;
        }
        boolean z10 = getOrientation() == 1;
        AbstractC5534e.b bVar = this.f13632r;
        if (z10) {
            int childCount = getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && n(i10)) {
                    int top = childAt.getTop();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    int i11 = (((top - ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams)).topMargin) - this.f13627m) - this.f13629o) - (i10 == this.f13633s ? bVar.f45770c : (int) (bVar.f45769b / 2));
                    k(canvas2, getPaddingLeft() + this.f13630p, i11, (getWidth() - getPaddingRight()) - this.f13631q, this.f13627m + i11);
                }
                i10++;
                canvas2 = canvas;
            }
            if (n(getChildCount())) {
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 != null) {
                    int bottom = childAt2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    height = bottom + ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams2)).bottomMargin + this.f13628n + bVar.f45770c;
                } else {
                    height = (((getHeight() - getPaddingBottom()) - this.f13627m) - this.f13629o) - bVar.f45770c;
                }
                int i12 = height;
                k(canvas, this.f13630p + getPaddingLeft(), i12, (getWidth() - getPaddingRight()) - this.f13631q, i12 + this.f13627m);
                return;
            }
            return;
        }
        boolean zD = C6.r.d(this);
        int childCount2 = getChildCount();
        int i13 = 0;
        while (i13 < childCount2) {
            View childAt3 = getChildAt(i13);
            if (childAt3.getVisibility() != 8 && n(i13)) {
                int i14 = i13 == this.f13633s ? bVar.f45770c : (int) (bVar.f45769b / 2);
                if (zD) {
                    int right = childAt3.getRight();
                    ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                    kotlin.jvm.internal.l.d(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i = right + ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams3)).rightMargin + this.f13630p + i14;
                } else {
                    int left = childAt3.getLeft();
                    ViewGroup.LayoutParams layoutParams4 = childAt3.getLayoutParams();
                    kotlin.jvm.internal.l.d(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i = (((left - ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams4)).leftMargin) - this.f13626l) - this.f13631q) - i14;
                }
                int i15 = i;
                k(canvas, i15, this.f13628n + getPaddingTop(), i15 + this.f13626l, (getHeight() - getPaddingBottom()) - this.f13629o);
            }
            i13++;
        }
        if (n(getChildCount())) {
            View childAt4 = getChildAt(getChildCount() - 1);
            if (childAt4 == null && zD) {
                width = getPaddingLeft() + this.f13630p + bVar.f45770c;
            } else if (childAt4 == null) {
                width = (((getWidth() - getPaddingRight()) - this.f13626l) - this.f13631q) - bVar.f45770c;
            } else if (zD) {
                int left2 = childAt4.getLeft();
                ViewGroup.LayoutParams layoutParams5 = childAt4.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams5, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                width = (((left2 - ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams5)).leftMargin) - this.f13626l) - this.f13631q) - bVar.f45770c;
            } else {
                int right2 = childAt4.getRight();
                ViewGroup.LayoutParams layoutParams6 = childAt4.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams6, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                width = bVar.f45770c + right2 + ((ViewGroup.MarginLayoutParams) ((C5533d) layoutParams6)).rightMargin + this.f13630p;
            }
            int i16 = width;
            k(canvas, i16, this.f13628n + getPaddingTop(), i16 + this.f13626l, (getHeight() - getPaddingBottom()) - this.f13629o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        int baseline;
        boolean z11 = getOrientation() == 1;
        AbstractC5534e.b bVar = this.f13632r;
        if (z11) {
            int horizontalPaddings$div_release = (i11 - i) - getHorizontalPaddings$div_release();
            float f10 = (i12 - i10) - this.f13622g;
            float paddingTop = getPaddingTop();
            bVar.a(f10, getVerticalGravity$div_release(), getVisibleChildCount());
            float dividerHeightWithMargins = paddingTop + bVar.f45768a;
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    C5533d c5533d = (C5533d) layoutParams;
                    int horizontalGravity$div_release = c5533d.f45758a & 125829127;
                    if (horizontalGravity$div_release < 0) {
                        horizontalGravity$div_release = getHorizontalGravity$div_release();
                    }
                    int layoutDirection = getLayoutDirection();
                    int paddingLeft = getPaddingLeft();
                    int absoluteGravity = Gravity.getAbsoluteGravity(horizontalGravity$div_release, layoutDirection);
                    int i16 = absoluteGravity != 1 ? (absoluteGravity == 3 || absoluteGravity != 5) ? ((ViewGroup.MarginLayoutParams) c5533d).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) c5533d).rightMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) c5533d).leftMargin) - ((ViewGroup.MarginLayoutParams) c5533d).rightMargin) / 2;
                    int i17 = paddingLeft + i16;
                    if (n(i15)) {
                        dividerHeightWithMargins += getDividerHeightWithMargins();
                    }
                    float f11 = dividerHeightWithMargins + ((ViewGroup.MarginLayoutParams) c5533d).topMargin;
                    int iY = com.google.gson.internal.c.y(f11);
                    childAt.layout(i17, iY, measuredWidth + i17, iY + measuredHeight);
                    dividerHeightWithMargins = measuredHeight + ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin + bVar.f45769b + f11;
                }
            }
            return;
        }
        int verticalPaddings$div_release = (i12 - i10) - getVerticalPaddings$div_release();
        int layoutDirection2 = getLayoutDirection();
        float f12 = (i11 - i) - this.f13622g;
        float paddingLeft2 = getPaddingLeft();
        bVar.a(f12, Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection2), getVisibleChildCount());
        float dividerWidthWithMargins = paddingLeft2 + bVar.f45768a;
        v9.e eVarB = C6.r.b(this, 0, getChildCount());
        int i18 = eVarB.f47096b;
        int i19 = eVarB.f47097c;
        int i20 = eVarB.f47098d;
        if ((i20 <= 0 || i18 > i19) && (i20 >= 0 || i19 > i18)) {
            return;
        }
        while (true) {
            View childAt2 = getChildAt(i18);
            if (childAt2 != null && childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d2 = (C5533d) layoutParams2;
                int verticalGravity$div_release = c5533d2.f45758a & 1879048304;
                if (verticalGravity$div_release < 0) {
                    verticalGravity$div_release = getVerticalGravity$div_release();
                }
                int paddingTop2 = getPaddingTop();
                if (verticalGravity$div_release == 16) {
                    i13 = (((verticalPaddings$div_release - measuredHeight2) + ((ViewGroup.MarginLayoutParams) c5533d2).topMargin) - ((ViewGroup.MarginLayoutParams) c5533d2).bottomMargin) / 2;
                } else if (verticalGravity$div_release != 48) {
                    if (verticalGravity$div_release != 80) {
                        i13 = 0;
                    } else {
                        i14 = verticalPaddings$div_release - measuredHeight2;
                        baseline = ((ViewGroup.MarginLayoutParams) c5533d2).bottomMargin;
                        i13 = i14 - baseline;
                    }
                } else if (!c5533d2.f45759b || ((ViewGroup.MarginLayoutParams) c5533d2).height == -1 || childAt2.getBaseline() == -1) {
                    i13 = ((ViewGroup.MarginLayoutParams) c5533d2).topMargin;
                } else {
                    i14 = this.f13619d;
                    baseline = childAt2.getBaseline();
                    i13 = i14 - baseline;
                }
                int i21 = paddingTop2 + i13;
                if (n(C6.r.d(this) ? i18 + 1 : i18)) {
                    dividerWidthWithMargins += getDividerWidthWithMargins();
                }
                float f13 = dividerWidthWithMargins + ((ViewGroup.MarginLayoutParams) c5533d2).leftMargin;
                int iY2 = com.google.gson.internal.c.y(f13);
                childAt2.layout(iY2, i21, iY2 + measuredWidth2, measuredHeight2 + i21);
                dividerWidthWithMargins = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c5533d2).rightMargin + bVar.f45769b + f13;
            }
            if (i18 == i19) {
                return;
            } else {
                i18 += i20;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x050c A[EDGE_INSN: B:341:0x050c->B:215:0x050c BREAK  A[LOOP:13: B:211:0x04f0->B:342:?]] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.n.onMeasure(int, int):void");
    }

    public final boolean p(int i, int i10) {
        if (this.f13638x.isEmpty()) {
            if ((View.MeasureSpec.getMode(i10) == 0) || (i >= 0 ? !(r.b(i10) && i > 0 && this.f13618A > 0.0f) : !(this.f13623h > 0 || this.f13618A > 0.0f))) {
                return false;
            }
        }
        return true;
    }

    public final void q(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), AbstractC5534e.a.a(i, c5533d.d() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) c5533d).height, view.getMinimumHeight(), c5533d.f45764g));
        View.combineMeasuredStates(this.f13624j, view.getMeasuredState() & (-16777216));
    }

    public final void r(View view, int i, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        int i12 = ((ViewGroup.MarginLayoutParams) c5533d).width;
        if (i12 == -1) {
            if (i10 == 0) {
                ((ViewGroup.MarginLayoutParams) c5533d).width = -3;
            } else {
                i = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            }
        }
        int iA = AbstractC5534e.a.a(i, c5533d.b() + getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) c5533d).width, view.getMinimumWidth(), c5533d.f45765h);
        ((ViewGroup.MarginLayoutParams) c5533d).width = i12;
        view.measure(iA, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        this.f13624j = View.combineMeasuredStates(this.f13624j, view.getMeasuredState() & (-256));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.n.s(int, int, int, int):void");
    }

    @Override // X6.e
    public void setAspectRatio(float f10) {
        this.f13625k.e(this, f13617B[1], Float.valueOf(f10));
    }

    public final void setDividerDrawable(Drawable drawable) {
        if (kotlin.jvm.internal.l.b(this.f13635u, drawable)) {
            return;
        }
        this.f13635u = drawable;
        this.f13626l = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.f13627m = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setOrientation(int i) {
        this.f13621f.e(this, f13617B[0], Integer.valueOf(i));
    }

    public final void setShowDividers(int i) {
        this.f13636v.e(this, f13617B[2], Integer.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(View view) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        if (c5533d.f45759b && (baseline = view.getBaseline()) != -1) {
            this.f13619d = Math.max(this.f13619d, ((ViewGroup.MarginLayoutParams) c5533d).topMargin + baseline);
            this.f13620e = Math.max(this.f13620e, (view.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) c5533d).topMargin);
        }
    }

    public final void u(int i, int i10) {
        if (r.b(i)) {
            return;
        }
        this.f13639y = Math.max(this.f13639y, i10);
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }
}
