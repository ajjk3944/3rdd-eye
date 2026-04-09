package Y6;

import L0.I;
import L0.S;
import N7.H7;
import Q9.C1553s;
import X6.d;
import X6.e;
import X6.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2092m;
import com.google.gson.internal.c;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import r7.AbstractC5534e;
import r7.C5533d;
import v9.f;
import w9.i;

/* compiled from: WrapContainerLayout.kt */
/* loaded from: classes.dex */
public class a extends AbstractC5534e implements e {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f13770y;

    /* renamed from: d, reason: collision with root package name */
    public int f13771d;

    /* renamed from: e, reason: collision with root package name */
    public final C1553s f13772e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553s f13773f;

    /* renamed from: g, reason: collision with root package name */
    public final C1553s f13774g;

    /* renamed from: h, reason: collision with root package name */
    public final C1553s f13775h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f13776j;

    /* renamed from: k, reason: collision with root package name */
    public int f13777k;

    /* renamed from: l, reason: collision with root package name */
    public int f13778l;

    /* renamed from: m, reason: collision with root package name */
    public int f13779m;

    /* renamed from: n, reason: collision with root package name */
    public int f13780n;

    /* renamed from: o, reason: collision with root package name */
    public int f13781o;

    /* renamed from: p, reason: collision with root package name */
    public int f13782p;

    /* renamed from: q, reason: collision with root package name */
    public int f13783q;

    /* renamed from: r, reason: collision with root package name */
    public int f13784r;

    /* renamed from: s, reason: collision with root package name */
    public int f13785s;

    /* renamed from: t, reason: collision with root package name */
    public int f13786t;

    /* renamed from: u, reason: collision with root package name */
    public int f13787u;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC5534e.b f13788v;

    /* renamed from: w, reason: collision with root package name */
    public int f13789w;

    /* renamed from: x, reason: collision with root package name */
    public final C1553s f13790x;

    /* compiled from: WrapContainerLayout.kt */
    /* renamed from: Y6.a$a, reason: collision with other inner class name */
    public static final class C0202a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13791a;

        /* renamed from: b, reason: collision with root package name */
        public int f13792b;

        /* renamed from: c, reason: collision with root package name */
        public int f13793c;

        /* renamed from: d, reason: collision with root package name */
        public int f13794d;

        /* renamed from: e, reason: collision with root package name */
        public int f13795e;

        /* renamed from: f, reason: collision with root package name */
        public int f13796f;

        /* renamed from: g, reason: collision with root package name */
        public int f13797g;

        /* renamed from: h, reason: collision with root package name */
        public int f13798h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f13799j;

        /* renamed from: k, reason: collision with root package name */
        public float f13800k;

        public C0202a() {
            this(0, 7);
        }

        public final int a() {
            return this.f13793c - this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202a)) {
                return false;
            }
            C0202a c0202a = (C0202a) obj;
            return this.f13791a == c0202a.f13791a && this.f13792b == c0202a.f13792b && this.f13793c == c0202a.f13793c;
        }

        public final int hashCode() {
            return (((this.f13791a * 31) + this.f13792b) * 31) + this.f13793c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WrapLine(firstIndex=");
            sb.append(this.f13791a);
            sb.append(", mainSize=");
            sb.append(this.f13792b);
            sb.append(", itemCount=");
            return H7.p(sb, this.f13793c, ')');
        }

        public /* synthetic */ C0202a(int i, int i10) {
            this(0, (i10 & 2) != 0 ? 0 : i, 0);
        }

        public C0202a(int i, int i10, int i11) {
            this.f13791a = i;
            this.f13792b = i10;
            this.f13793c = i11;
            this.f13795e = -1;
        }
    }

    static {
        n nVar = new n(a.class, "showSeparators", "getShowSeparators()I");
        x.f43661a.getClass();
        f13770y = new i[]{nVar, new n(a.class, "showLineSeparators", "getShowLineSeparators()I"), new n(a.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;"), new n(a.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;"), new n(a.class, "aspectRatio", "getAspectRatio()F")};
    }

    public a(Context context) {
        super(context, null, 0);
        this.f13772e = r.a(0);
        this.f13773f = r.a(0);
        this.f13774g = r.a(null);
        this.f13775h = r.a(null);
        this.i = true;
        this.f13776j = new ArrayList();
        this.f13788v = new AbstractC5534e.b(0);
        this.f13790x = new C1553s(Float.valueOf(0.0f), d.f13581g);
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (t(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (t(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final C0202a getFirstVisibleLine() {
        boolean z10 = this.i;
        ArrayList arrayList = this.f13776j;
        Object obj = null;
        if (z10 || !C6.r.d(this)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C0202a) next).a() > 0) {
                    obj = next;
                    break;
                }
            }
            return (C0202a) obj;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (((C0202a) objPrevious).a() > 0) {
                obj = objPrevious;
                break;
            }
        }
        return (C0202a) obj;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator it = this.f13776j.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((C0202a) it.next()).f13792b);
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((C0202a) it.next()).f13792b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i;
        if (this.i) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.f13782p;
            i = this.f13783q;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.f13784r;
            i = this.f13785s;
        }
        return intrinsicWidth + i;
    }

    private final int getMiddleLineSeparatorLength() {
        if (v(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (v(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i;
        if (this.i) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.f13780n;
            i = this.f13781o;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.f13778l;
            i = this.f13779m;
        }
        return intrinsicHeight + i;
    }

    private final int getStartLineSeparatorLength() {
        if (u(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (u(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator it = this.f13776j.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C0202a) it.next()).f13794d;
        }
        return ((getVisibleLinesCount() - 1) * getMiddleLineSeparatorLength()) + i + getEdgeLineSeparatorsLength();
    }

    private final int getVisibleLinesCount() {
        ArrayList arrayList = this.f13776j;
        int i = 0;
        if ((arrayList != null) && arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C0202a) it.next()).a() > 0 && (i = i + 1) < 0) {
                C2092m.Z();
                throw null;
            }
        }
        return i;
    }

    public static void n(Drawable drawable, Canvas canvas, int i, int i10, int i11, int i12) {
        if (drawable != null) {
            float f10 = (i + i11) / 2.0f;
            float f11 = (i10 + i12) / 2.0f;
            float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
            float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
            drawable.setBounds((int) (f10 - intrinsicWidth), (int) (f11 - intrinsicHeight), (int) (f10 + intrinsicWidth), (int) (f11 + intrinsicHeight));
            drawable.draw(canvas);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public static final void o(a aVar, Canvas canvas, int i) {
        n(aVar.getLineSeparatorDrawable(), canvas, aVar.getPaddingLeft() + aVar.f13784r, (i - aVar.getLineSeparatorLength()) - aVar.f13782p, (aVar.getWidth() - aVar.getPaddingRight()) - aVar.f13785s, i + aVar.f13783q);
    }

    public static final void p(a aVar, Canvas canvas, int i) {
        n(aVar.getLineSeparatorDrawable(), canvas, (i - aVar.getLineSeparatorLength()) + aVar.f13784r, aVar.getPaddingTop() - aVar.f13782p, i - aVar.f13785s, (aVar.getHeight() - aVar.getPaddingBottom()) + aVar.f13783q);
    }

    public static boolean t(int i) {
        return (i & 4) != 0;
    }

    public static boolean u(int i) {
        return (i & 1) != 0;
    }

    public static boolean v(int i) {
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.a.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getAspectRatio() {
        return ((Number) this.f13790x.a(this, f13770y[4])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        C0202a firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + firstVisibleLine.f13795e;
    }

    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.f13775h.a(this, f13770y[3]);
    }

    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.f13774g.a(this, f13770y[2]);
    }

    public final int getShowLineSeparators() {
        return ((Number) this.f13773f.a(this, f13770y[1])).intValue();
    }

    public final int getShowSeparators() {
        return ((Number) this.f13772e.a(this, f13770y[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.f13771d;
    }

    public final void k(C0202a c0202a) {
        this.f13776j.add(c0202a);
        int i = c0202a.f13795e;
        if (i > 0) {
            c0202a.f13794d = Math.max(c0202a.f13794d, i + c0202a.f13796f);
        }
        this.f13789w += c0202a.f13794d;
    }

    public final void l(int i, int i10, int i11) {
        int i12 = 0;
        this.f13786t = 0;
        this.f13787u = 0;
        ArrayList arrayList = this.f13776j;
        if (arrayList.size() != 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            int i13 = 1;
            if (arrayList.size() == 1) {
                ((C0202a) arrayList.get(0)).f13794d = size - i11;
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + i11;
            int i14 = 7;
            if (i10 != 1) {
                if (i10 != 5) {
                    if (i10 != 16) {
                        if (i10 != 80) {
                            if (i10 != 16777216) {
                                if (i10 != 33554432) {
                                    if (i10 != 67108864) {
                                        if (i10 != 268435456) {
                                            if (i10 != 536870912) {
                                                if (i10 != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    C0202a c0202a = new C0202a(i12, i14);
                                    int iY = c.y(sumOfCrossSize / (arrayList.size() + 1));
                                    c0202a.f13794d = iY;
                                    int i15 = iY / 2;
                                    this.f13786t = i15;
                                    this.f13787u = i15;
                                    while (i13 < arrayList.size()) {
                                        arrayList.add(i13, c0202a);
                                        i13 += 2;
                                    }
                                    arrayList.add(0, c0202a);
                                    arrayList.add(c0202a);
                                    return;
                                }
                                C0202a c0202a2 = new C0202a(i12, i14);
                                float f10 = sumOfCrossSize;
                                int iY2 = c.y(arrayList.size() == 1 ? 0.0f : f10 / (r8 - 1));
                                c0202a2.f13794d = iY2;
                                this.f13786t = iY2 / 2;
                                while (i13 < arrayList.size()) {
                                    arrayList.add(i13, c0202a2);
                                    i13 += 2;
                                }
                                return;
                            }
                            C0202a c0202a3 = new C0202a(i12, i14);
                            int iY3 = c.y(sumOfCrossSize / (arrayList.size() * 2));
                            c0202a3.f13794d = iY3;
                            this.f13786t = iY3;
                            this.f13787u = iY3 / 2;
                            while (i12 < arrayList.size()) {
                                arrayList.add(i12, c0202a3);
                                arrayList.add(i12 + 2, c0202a3);
                                i12 += 3;
                            }
                            return;
                        }
                    }
                }
                C0202a c0202a4 = new C0202a(i12, i14);
                c0202a4.f13794d = sumOfCrossSize;
                arrayList.add(0, c0202a4);
                return;
            }
            C0202a c0202a5 = new C0202a(i12, i14);
            c0202a5.f13794d = sumOfCrossSize / 2;
            arrayList.add(0, c0202a5);
            arrayList.add(c0202a5);
        }
    }

    public final void m(Canvas canvas, int i, int i10, int i11, int i12) {
        n(getSeparatorDrawable(), canvas, i + this.f13780n, i10 - this.f13778l, i11 - this.f13781o, i12 + this.f13779m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        f fVar;
        ArrayList arrayList;
        int i13;
        Iterator it;
        int i14;
        boolean z11 = this.i;
        ArrayList arrayList2 = this.f13776j;
        AbstractC5534e.b bVar = this.f13788v;
        if (!z11) {
            int paddingLeft = getPaddingLeft() + (C6.r.d(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
            f it2 = C6.r.b(this, 0, arrayList2.size()).iterator();
            int middleLineSeparatorLength = paddingLeft;
            boolean z12 = false;
            while (it2.f47101d) {
                C0202a c0202a = (C0202a) arrayList2.get(it2.a());
                bVar.a((i12 - i10) - c0202a.f13792b, getVerticalGravity$div_release(), c0202a.a());
                float paddingTop = getPaddingTop() + getStartSeparatorLength() + bVar.f45768a;
                c0202a.f13800k = bVar.f45769b;
                c0202a.f13799j = bVar.f45770c;
                if (c0202a.a() > 0) {
                    if (z12) {
                        middleLineSeparatorLength += getMiddleLineSeparatorLength();
                    }
                    z12 = true;
                }
                int i15 = c0202a.f13793c;
                float measuredHeight = paddingTop;
                int i16 = 0;
                boolean z13 = false;
                while (i16 < i15) {
                    View child = getChildAt(c0202a.f13791a + i16);
                    if (child == null || s(child)) {
                        fVar = it2;
                        arrayList = arrayList2;
                        l.e(child, "child");
                        if (q(child)) {
                            child.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                        l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        C5533d c5533d = (C5533d) layoutParams;
                        float middleSeparatorLength = measuredHeight + ((ViewGroup.MarginLayoutParams) c5533d).topMargin;
                        if (z13) {
                            middleSeparatorLength += getMiddleSeparatorLength();
                        }
                        int i17 = c0202a.f13794d;
                        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
                        l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        C5533d c5533d2 = (C5533d) layoutParams2;
                        WeakHashMap<View, S> weakHashMap = I.f3792a;
                        fVar = it2;
                        arrayList = arrayList2;
                        int absoluteGravity = Gravity.getAbsoluteGravity(c5533d2.f45758a & 125829127, getLayoutDirection());
                        int measuredWidth = (absoluteGravity != 1 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) c5533d2).leftMargin : (i17 - child.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) c5533d2).rightMargin : (((i17 - child.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) c5533d2).leftMargin) - ((ViewGroup.MarginLayoutParams) c5533d2).rightMargin) / 2) + middleLineSeparatorLength;
                        child.layout(measuredWidth, c.y(middleSeparatorLength), child.getMeasuredWidth() + measuredWidth, child.getMeasuredHeight() + c.y(middleSeparatorLength));
                        measuredHeight = child.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin + c0202a.f13800k + middleSeparatorLength;
                        z13 = true;
                    }
                    i16++;
                    it2 = fVar;
                    arrayList2 = arrayList;
                }
                middleLineSeparatorLength += c0202a.f13794d;
                c0202a.f13797g = middleLineSeparatorLength;
                c0202a.f13798h = c.y(measuredHeight);
                it2 = it2;
                arrayList2 = arrayList2;
            }
            return;
        }
        int paddingTop2 = getPaddingTop() + getStartLineSeparatorLength();
        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), getLayoutDirection());
        Iterator it3 = arrayList2.iterator();
        boolean z14 = false;
        while (it3.hasNext()) {
            C0202a c0202a2 = (C0202a) it3.next();
            bVar.a((i11 - i) - c0202a2.f13792b, absoluteGravity2, c0202a2.a());
            float paddingLeft2 = getPaddingLeft() + (C6.r.d(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + bVar.f45768a;
            c0202a2.f13800k = bVar.f45769b;
            c0202a2.f13799j = bVar.f45770c;
            if (c0202a2.a() > 0) {
                if (z14) {
                    paddingTop2 += getMiddleLineSeparatorLength();
                }
                z14 = true;
            }
            v9.e eVarB = C6.r.b(this, c0202a2.f13791a, c0202a2.f13793c);
            int i18 = eVarB.f47096b;
            int i19 = eVarB.f47097c;
            int i20 = eVarB.f47098d;
            if ((i20 <= 0 || i18 > i19) && (i20 >= 0 || i19 > i18)) {
                i13 = paddingTop2;
                it = it3;
                i14 = absoluteGravity2;
            } else {
                boolean z15 = false;
                while (true) {
                    View child2 = getChildAt(i18);
                    if (child2 == null || s(child2)) {
                        i13 = paddingTop2;
                        it = it3;
                        i14 = absoluteGravity2;
                        l.e(child2, "child");
                        if (q(child2)) {
                            child2.layout(0, 0, 0, 0);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = child2.getLayoutParams();
                        l.d(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        C5533d c5533d3 = (C5533d) layoutParams3;
                        i13 = paddingTop2;
                        float middleSeparatorLength2 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c5533d3).leftMargin;
                        if (z15) {
                            middleSeparatorLength2 += getMiddleSeparatorLength();
                        }
                        ViewGroup.LayoutParams layoutParams4 = child2.getLayoutParams();
                        l.d(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        C5533d c5533d4 = (C5533d) layoutParams4;
                        int i21 = c5533d4.f45758a & 1879048304;
                        it = it3;
                        int iMax = i13 + (i21 != 16 ? i21 != 80 ? c5533d4.f45759b ? Math.max(c0202a2.f13795e - child2.getBaseline(), ((ViewGroup.MarginLayoutParams) c5533d4).topMargin) : ((ViewGroup.MarginLayoutParams) c5533d4).topMargin : (c0202a2.f13794d - child2.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) c5533d4).bottomMargin : (((c0202a2.f13794d - child2.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) c5533d4).topMargin) - ((ViewGroup.MarginLayoutParams) c5533d4).bottomMargin) / 2);
                        i14 = absoluteGravity2;
                        child2.layout(c.y(middleSeparatorLength2), iMax, child2.getMeasuredWidth() + c.y(middleSeparatorLength2), child2.getMeasuredHeight() + iMax);
                        paddingLeft2 = child2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c5533d3).rightMargin + c0202a2.f13800k + middleSeparatorLength2;
                        z15 = true;
                    }
                    if (i18 != i19) {
                        i18 += i20;
                        paddingTop2 = i13;
                        it3 = it;
                        absoluteGravity2 = i14;
                    }
                }
            }
            paddingTop2 = i13 + c0202a2.f13794d;
            c0202a2.f13797g = c.y(paddingLeft2);
            c0202a2.f13798h = paddingTop2;
            it3 = it;
            absoluteGravity2 = i14;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int mode;
        int size;
        int iMakeMeasureSpec;
        int i11;
        int iY;
        int edgeSeparatorsLength;
        int edgeSeparatorsLength2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f13776j.clear();
        int i17 = 0;
        this.f13777k = 0;
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int iY2 = c.y(size2 / getAspectRatio());
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iY2, 1073741824);
            size = iY2;
            mode = 1073741824;
        } else {
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            iMakeMeasureSpec = i10;
        }
        this.f13789w = getEdgeLineSeparatorsLength();
        int i18 = this.i ? i : iMakeMeasureSpec;
        int mode3 = View.MeasureSpec.getMode(i18);
        int size3 = View.MeasureSpec.getSize(i18);
        int edgeSeparatorsLength3 = getEdgeSeparatorsLength() + (this.i ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        C0202a c0202a = new C0202a(edgeSeparatorsLength3, 5);
        int i19 = 0;
        int i20 = RecyclerView.UNDEFINED_DURATION;
        while (i17 < getChildCount()) {
            int i21 = i17 + 1;
            View childAt = getChildAt(i17);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i22 = i19 + 1;
            if (i19 < 0) {
                C2092m.a0();
                throw null;
            }
            if (s(childAt)) {
                c0202a.i++;
                c0202a.f13793c++;
                if (i19 == getChildCount() - 1 && c0202a.a() != 0) {
                    k(c0202a);
                }
                i12 = mode;
                i13 = i21;
                i14 = size;
                i15 = mode3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d = (C5533d) layoutParams;
                int iB = c5533d.b() + getHorizontalPaddings$div_release();
                int iD = c5533d.d() + getVerticalPaddings$div_release();
                if (this.i) {
                    edgeSeparatorsLength = iB + getEdgeSeparatorsLength();
                    edgeSeparatorsLength2 = this.f13789w;
                } else {
                    edgeSeparatorsLength = iB + this.f13789w;
                    edgeSeparatorsLength2 = getEdgeSeparatorsLength();
                }
                int i23 = iD + edgeSeparatorsLength2;
                int i24 = edgeSeparatorsLength;
                i12 = mode;
                i13 = i21;
                i14 = size;
                i15 = mode3;
                childAt.measure(AbstractC5534e.a.a(i, i24, ((ViewGroup.MarginLayoutParams) c5533d).width, childAt.getMinimumWidth(), c5533d.f45765h), AbstractC5534e.a.a(iMakeMeasureSpec, i23, ((ViewGroup.MarginLayoutParams) c5533d).height, childAt.getMinimumHeight(), c5533d.f45764g));
                this.f13777k = View.combineMeasuredStates(this.f13777k, childAt.getMeasuredState());
                int iB2 = c5533d.b() + childAt.getMeasuredWidth();
                int iD2 = c5533d.d() + childAt.getMeasuredHeight();
                if (!this.i) {
                    iD2 = iB2;
                    iB2 = iD2;
                }
                int middleSeparatorLength = c0202a.f13792b + iB2 + (c0202a.f13793c != 0 ? getMiddleSeparatorLength() : 0);
                if (i15 == 0 || size3 >= middleSeparatorLength) {
                    if (c0202a.f13793c > 0) {
                        c0202a.f13792b += getMiddleSeparatorLength();
                    }
                    c0202a.f13793c++;
                    i16 = i20;
                } else {
                    if (c0202a.a() > 0) {
                        k(c0202a);
                    }
                    c0202a = new C0202a(i19, edgeSeparatorsLength3, 1);
                    i16 = RecyclerView.UNDEFINED_DURATION;
                }
                if (this.i && c5533d.f45759b) {
                    c0202a.f13795e = Math.max(c0202a.f13795e, childAt.getBaseline() + ((ViewGroup.MarginLayoutParams) c5533d).topMargin);
                    c0202a.f13796f = Math.max(c0202a.f13796f, (childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin) - childAt.getBaseline());
                }
                c0202a.f13792b += iB2;
                int iMax = Math.max(i16, iD2);
                c0202a.f13794d = Math.max(c0202a.f13794d, iMax);
                if (i19 == getChildCount() - 1 && c0202a.a() != 0) {
                    k(c0202a);
                }
                i20 = iMax;
            }
            i19 = i22;
            mode = i12;
            i17 = i13;
            size = i14;
            mode3 = i15;
        }
        int i25 = mode;
        int i26 = size;
        if (this.i) {
            l(iMakeMeasureSpec, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            l(i, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.i ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int verticalPaddings$div_release = this.i ? getVerticalPaddings$div_release() + getSumOfCrossSize() : getLargestMainSize();
        int iCombineMeasuredStates = this.f13777k;
        if (mode2 != 0 && size2 < largestMainSize) {
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, 16777216);
        }
        this.f13777k = iCombineMeasuredStates;
        int iResolveSizeAndState = View.resolveSizeAndState(r(!this.i, mode2, size2, largestMainSize), i, this.f13777k);
        if (!this.i || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i11 = i25;
            iY = i26;
        } else {
            iY = c.y((16777215 & iResolveSizeAndState) / getAspectRatio());
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iY, 1073741824);
            i11 = 1073741824;
        }
        int iCombineMeasuredStates2 = this.f13777k;
        if (i11 != 0 && iY < verticalPaddings$div_release) {
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, 256);
        }
        this.f13777k = iCombineMeasuredStates2;
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(r(this.i, i11, iY, verticalPaddings$div_release), iMakeMeasureSpec, this.f13777k));
    }

    public final boolean q(View view) {
        Integer numValueOf;
        if (this.i) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
            return numValueOf != null && numValueOf.intValue() == -1;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        numValueOf = layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null;
        return numValueOf != null && numValueOf.intValue() == -1;
    }

    public final int r(boolean z10, int i, int i10, int i11) {
        if (i == Integer.MIN_VALUE) {
            return z10 ? Math.min(i10, i11) : (i11 <= i10 && getVisibleLinesCount() <= 1) ? i11 : i10;
        }
        if (i != 0) {
            if (i != 1073741824) {
                throw new IllegalStateException(C4356c.h(i, "Unknown size mode is set: "));
            }
        }
    }

    public final boolean s(View view) {
        return view.getVisibility() == 8 || q(view);
    }

    @Override // X6.e
    public void setAspectRatio(float f10) {
        this.f13790x.e(this, f13770y[4], Float.valueOf(f10));
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        this.f13775h.e(this, f13770y[3], drawable);
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.f13774g.e(this, f13770y[2], drawable);
    }

    public final void setShowLineSeparators(int i) {
        this.f13773f.e(this, f13770y[1], Integer.valueOf(i));
    }

    public final void setShowSeparators(int i) {
        this.f13772e.e(this, f13770y[0], Integer.valueOf(i));
    }

    public final void setWrapDirection(int i) {
        if (this.f13771d != i) {
            this.f13771d = i;
            boolean z10 = true;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.f13771d);
                }
                z10 = false;
            }
            this.i = z10;
            requestLayout();
        }
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }
}
