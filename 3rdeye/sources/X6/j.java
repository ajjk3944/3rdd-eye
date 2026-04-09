package X6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import c9.C2097r;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import g0.C4356c;
import h7.C4421b;
import i6.C4459b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import r7.AbstractC5534e;
import r7.C5533d;

/* compiled from: GridContainer.kt */
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes.dex */
public class j extends AbstractC5534e {

    /* renamed from: d, reason: collision with root package name */
    public final c f13587d;

    /* renamed from: e, reason: collision with root package name */
    public int f13588e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13589f;

    /* compiled from: GridContainer.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13590a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13591b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13592c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13593d;

        /* renamed from: e, reason: collision with root package name */
        public int f13594e;

        public a(int i, int i10, int i11, int i12, int i13) {
            this.f13590a = i;
            this.f13591b = i10;
            this.f13592c = i11;
            this.f13593d = i12;
            this.f13594e = i13;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13595a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13596b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13597c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13598d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13599e;

        public b(int i, int i10, int i11, int i12, float f10, int i13) {
            this.f13595a = i;
            this.f13596b = i10;
            this.f13597c = i11;
            this.f13598d = i12;
            this.f13599e = i13;
        }
    }

    /* compiled from: GridContainer.kt */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public int f13600a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final K4.b f13601b = new K4.b(new k(this));

        /* renamed from: c, reason: collision with root package name */
        public final K4.b f13602c = new K4.b(new l(this));

        /* renamed from: d, reason: collision with root package name */
        public final K4.b f13603d = new K4.b(new m(this));

        /* renamed from: e, reason: collision with root package name */
        public final e f13604e = new e(0);

        /* renamed from: f, reason: collision with root package name */
        public final e f13605f = new e(0);

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ O6.k f13606g;

        public c(O6.k kVar) {
            this.f13606g = kVar;
        }

        public static void a(ArrayList arrayList, e eVar) {
            int size = arrayList.size();
            int i = 0;
            float f10 = 0.0f;
            float fMax = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                if (dVar.c()) {
                    float f11 = dVar.f13610d;
                    f10 += f11;
                    fMax = Math.max(fMax, dVar.f13609c / f11);
                } else {
                    i += dVar.f13609c;
                }
            }
            int size2 = arrayList.size();
            int iCeil = 0;
            for (int i11 = 0; i11 < size2; i11++) {
                d dVar2 = (d) arrayList.get(i11);
                iCeil += dVar2.c() ? (int) Math.ceil(dVar2.f13610d * fMax) : dVar2.f13609c;
            }
            float fMax2 = Math.max(0, Math.max(eVar.f13611a, iCeil) - i) / f10;
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                d dVar3 = (d) arrayList.get(i12);
                if (dVar3.c()) {
                    int iCeil2 = (int) Math.ceil(dVar3.f13610d * fMax2);
                    d.b(dVar3, iCeil2 - (dVar3.f13609c - dVar3.f13608b), iCeil2, 0.0f, 4);
                }
            }
        }

        public static int b(List list) {
            if (list.isEmpty()) {
                return 0;
            }
            d dVar = (d) C2097r.v0(list);
            return dVar.f13607a + dVar.f13609c;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public int f13607a;

        /* renamed from: b, reason: collision with root package name */
        public int f13608b;

        /* renamed from: c, reason: collision with root package name */
        public int f13609c;

        /* renamed from: d, reason: collision with root package name */
        public float f13610d;

        public static /* synthetic */ void b(d dVar, int i, int i10, float f10, int i11) {
            if ((i11 & 1) != 0) {
                i = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            if ((i11 & 4) != 0) {
                f10 = 0.0f;
            }
            dVar.a(f10, i, i10);
        }

        public final void a(float f10, int i, int i10) {
            this.f13608b = Math.max(this.f13608b, i);
            this.f13609c = Math.max(this.f13609c, i10);
            this.f13610d = Math.max(this.f13610d, f10);
        }

        public final boolean c() {
            return this.f13610d > 0.0f;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f13611a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f13612b = Constants.QUEUE_ELEMENT_MAX_SIZE;

        public e(int i) {
        }

        public final void a(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.f13611a = 0;
                this.f13612b = size;
            } else if (mode == 0) {
                this.f13611a = 0;
                this.f13612b = Constants.QUEUE_ELEMENT_MAX_SIZE;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.f13611a = size;
                this.f13612b = size;
            }
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class f implements Comparator<b> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f13613b = new f();

        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            b lhs = bVar;
            b rhs = bVar2;
            kotlin.jvm.internal.l.f(lhs, "lhs");
            kotlin.jvm.internal.l.f(rhs, "rhs");
            int i = lhs.f13596b;
            int i10 = lhs.f13597c;
            int i11 = lhs.f13598d;
            int i12 = lhs.f13599e;
            int i13 = ((i + i10) + i11) / i12;
            int i14 = rhs.f13596b;
            int i15 = rhs.f13597c;
            int i16 = rhs.f13598d;
            int i17 = rhs.f13599e;
            if (i13 < ((i14 + i15) + i16) / i17) {
                return 1;
            }
            return ((i + i10) + i11) / i12 > ((i14 + i15) + i16) / i17 ? -1 : 0;
        }
    }

    public j(Context context) {
        super(context, null, 0);
        this.f13587d = new c((O6.k) this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4459b.f38458c, 0, 0);
            kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ntainer, defStyleAttr, 0)");
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(1, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 8388659));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f13589f = true;
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    public static void m(View view, int i, int i10, int i11, int i12, int i13, int i14) {
        int iA;
        int iA2;
        if (i11 == -1) {
            iA = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            iA = AbstractC5534e.a.a(i, 0, i11, minimumWidth, ((C5533d) layoutParams).f45765h);
        }
        if (i12 == -1) {
            iA2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            iA2 = AbstractC5534e.a.a(i10, 0, i12, minimumHeight, ((C5533d) layoutParams2).f45764g);
        }
        view.measure(iA, iA2);
    }

    public final int getColumnCount() {
        return this.f13587d.f13600a;
    }

    public final int getRowCount() {
        List list = (List) this.f13587d.f13601b.f();
        if (list.isEmpty()) {
            return 0;
        }
        a aVar = (a) C2097r.v0(list);
        return aVar.f13592c + aVar.f13594e;
    }

    public final void k() {
        int i = this.f13588e;
        if (i != 0) {
            if (i != l()) {
                this.f13588e = 0;
                c cVar = this.f13587d;
                cVar.f13601b.f3144d = null;
                cVar.f13602c.f3144d = null;
                cVar.f13603d.f3144d = null;
                k();
                return;
            }
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = getChildAt(i10);
            kotlin.jvm.internal.l.e(child, "child");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            C5533d c5533d = (C5533d) layoutParams;
            if (c5533d.a() < 0 || c5533d.c() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (c5533d.f45761d < 0.0f || c5533d.f45760c < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
        }
        this.f13588e = l();
    }

    public final int l() {
        int childCount = getChildCount();
        int iHashCode = Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                iHashCode = ((C5533d) layoutParams).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        char c10;
        char c11;
        char c12;
        char c13;
        j jVar = this;
        int i15 = 1;
        SystemClock.elapsedRealtime();
        jVar.k();
        c cVar = jVar.f13587d;
        List list = (List) cVar.f13602c.f();
        K4.b bVar = cVar.f13603d;
        List list2 = (List) bVar.f();
        List list3 = (List) cVar.f13601b.f();
        int gravity = jVar.getGravity() & 7;
        K4.b bVar2 = cVar.f13602c;
        int i16 = 0;
        int iB = bVar2.f3144d != null ? c.b((List) bVar2.f()) : 0;
        int measuredWidth = (jVar.getMeasuredWidth() - jVar.getPaddingLeft()) - jVar.getPaddingRight();
        char c14 = 5;
        char c15 = 2;
        int paddingLeft = gravity != 1 ? gravity != 5 ? jVar.getPaddingLeft() : (jVar.getPaddingLeft() + measuredWidth) - iB : C4356c.c(measuredWidth, iB, 2, jVar.getPaddingLeft());
        int gravity2 = jVar.getGravity() & 112;
        int iB2 = bVar.f3144d != null ? c.b((List) bVar.f()) : 0;
        int measuredHeight = (jVar.getMeasuredHeight() - jVar.getPaddingTop()) - jVar.getPaddingBottom();
        char c16 = 16;
        int paddingTop = gravity2 != 16 ? gravity2 != 80 ? jVar.getPaddingTop() : (jVar.getPaddingTop() + measuredHeight) - iB2 : C4356c.c(measuredHeight, iB2, 2, jVar.getPaddingTop());
        int childCount = jVar.getChildCount();
        int i17 = 0;
        while (i16 < childCount) {
            View childAt = jVar.getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d = (C5533d) layoutParams;
                a aVar = (a) list3.get(i17);
                int iC = ((d) list.get(aVar.f13591b)).f13607a + ((ViewGroup.MarginLayoutParams) c5533d).leftMargin;
                int i18 = i15;
                int iC2 = ((d) list2.get(aVar.f13592c)).f13607a + ((ViewGroup.MarginLayoutParams) c5533d).topMargin;
                d dVar = (d) list.get((aVar.f13591b + aVar.f13593d) - 1);
                int i19 = ((dVar.f13607a + dVar.f13609c) - iC) - ((ViewGroup.MarginLayoutParams) c5533d).rightMargin;
                d dVar2 = (d) list2.get((r11 + aVar.f13594e) - 1);
                int i20 = ((dVar2.f13607a + dVar2.f13609c) - iC2) - ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int i21 = c5533d.f45758a & 7;
                i14 = paddingLeft;
                if (i21 != i18) {
                    c10 = 5;
                    if (i21 == 5) {
                        iC = (iC + i19) - measuredWidth2;
                    }
                } else {
                    c10 = 5;
                    iC = C4356c.c(i19, measuredWidth2, 2, iC);
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = c5533d.f45758a & 112;
                c12 = 16;
                if (i22 != 16) {
                    c13 = 'P';
                    if (i22 == 80) {
                        iC2 = (iC2 + i20) - measuredHeight2;
                    }
                    c11 = 2;
                } else {
                    c11 = 2;
                    c13 = 'P';
                    iC2 = C4356c.c(i20, measuredHeight2, 2, iC2);
                }
                int i23 = iC + i14;
                int i24 = iC2 + paddingTop;
                childAt.layout(i23, i24, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + i24);
                i13 = 1;
                i17++;
            } else {
                i13 = i15;
                i14 = paddingLeft;
                c10 = c14;
                c11 = c15;
                c12 = c16;
                c13 = 'P';
            }
            i16 += i13;
            c15 = c11;
            c14 = c10;
            c16 = c12;
            paddingLeft = i14;
            i15 = i13;
            jVar = this;
        }
        SystemClock.elapsedRealtime();
        int i25 = C4421b.f38269a;
        C4421b.a(C7.a.INFO);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        String str;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        K4.b bVar;
        List list;
        String str3;
        int i16;
        List list2;
        int i17;
        int i18;
        SystemClock.elapsedRealtime();
        k();
        c cVar = this.f13587d;
        cVar.f13602c.f3144d = null;
        cVar.f13603d.f3144d = null;
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - paddingHorizontal), View.MeasureSpec.getMode(i));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - paddingVertical), View.MeasureSpec.getMode(i10));
        int childCount = getChildCount();
        int i19 = 0;
        while (true) {
            str = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams";
            i11 = 8;
            if (i19 >= childCount) {
                break;
            }
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d = (C5533d) layoutParams;
                int i20 = ((ViewGroup.MarginLayoutParams) c5533d).width;
                if (i20 == -1) {
                    i20 = 0;
                }
                int i21 = ((ViewGroup.MarginLayoutParams) c5533d).height;
                if (i21 == -1) {
                    i21 = 0;
                }
                int minimumWidth = childAt.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i18 = paddingHorizontal;
                int iA = AbstractC5534e.a.a(iMakeMeasureSpec, 0, i20, minimumWidth, ((C5533d) layoutParams2).f45765h);
                int minimumHeight = childAt.getMinimumHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                childAt.measure(iA, AbstractC5534e.a.a(iMakeMeasureSpec2, 0, i21, minimumHeight, ((C5533d) layoutParams3).f45764g));
            } else {
                i18 = paddingHorizontal;
            }
            i19++;
            paddingHorizontal = i18;
        }
        int i22 = paddingHorizontal;
        e eVar = cVar.f13604e;
        eVar.a(iMakeMeasureSpec);
        int i23 = eVar.f13611a;
        K4.b bVar2 = cVar.f13602c;
        int iMax = Math.max(i23, Math.min(c.b((List) bVar2.f()), eVar.f13612b));
        K4.b bVar3 = cVar.f13601b;
        List list3 = (List) bVar3.f();
        List list4 = (List) bVar2.f();
        int childCount2 = getChildCount();
        int i24 = 0;
        int i25 = 0;
        while (i24 < childCount2) {
            View childAt2 = getChildAt(i24);
            int i26 = iMax;
            if (childAt2.getVisibility() != i11) {
                ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams4, str);
                C5533d c5533d2 = (C5533d) layoutParams4;
                i15 = paddingVertical;
                if (((ViewGroup.MarginLayoutParams) c5533d2).width != -1) {
                    i25++;
                    bVar = bVar3;
                    list = list3;
                    str3 = str;
                    list2 = list4;
                    i17 = childCount2;
                    i16 = 8;
                } else {
                    a aVar = (a) list3.get(i25);
                    d dVar = (d) list4.get((aVar.f13591b + aVar.f13593d) - 1);
                    bVar = bVar3;
                    int iB = ((dVar.f13607a + dVar.f13609c) - ((d) list4.get(aVar.f13591b)).f13607a) - c5533d2.b();
                    str3 = str;
                    int i27 = ((ViewGroup.MarginLayoutParams) c5533d2).width;
                    int i28 = ((ViewGroup.MarginLayoutParams) c5533d2).height;
                    list = list3;
                    list2 = list4;
                    i17 = childCount2;
                    i16 = 8;
                    m(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2, i27, i28, iB, 0);
                    i25++;
                }
            } else {
                i15 = paddingVertical;
                bVar = bVar3;
                list = list3;
                str3 = str;
                i16 = i11;
                list2 = list4;
                i17 = childCount2;
            }
            i24++;
            i11 = i16;
            str = str3;
            list3 = list;
            list4 = list2;
            iMax = i26;
            childCount2 = i17;
            paddingVertical = i15;
            bVar3 = bVar;
        }
        int i29 = iMax;
        int i30 = paddingVertical;
        K4.b bVar4 = bVar3;
        String str4 = str;
        int i31 = i11;
        e eVar2 = cVar.f13605f;
        eVar2.a(iMakeMeasureSpec2);
        int i32 = eVar2.f13611a;
        K4.b bVar5 = cVar.f13603d;
        int iMax2 = Math.max(i32, Math.min(c.b((List) bVar5.f()), eVar2.f13612b));
        List list5 = (List) bVar4.f();
        List list6 = (List) bVar2.f();
        List list7 = (List) bVar5.f();
        int childCount3 = getChildCount();
        int i33 = 0;
        int i34 = 0;
        while (i33 < childCount3) {
            int i35 = childCount3;
            View childAt3 = getChildAt(i33);
            if (childAt3.getVisibility() != i31) {
                ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams5, str4);
                C5533d c5533d3 = (C5533d) layoutParams5;
                str2 = str4;
                if (((ViewGroup.MarginLayoutParams) c5533d3).height != -1) {
                    i34++;
                    i12 = iMax2;
                    i13 = i33;
                } else {
                    a aVar2 = (a) list5.get(i34);
                    d dVar2 = (d) list6.get((aVar2.f13591b + aVar2.f13593d) - 1);
                    i12 = iMax2;
                    int iB2 = ((dVar2.f13607a + dVar2.f13609c) - ((d) list6.get(aVar2.f13591b)).f13607a) - c5533d3.b();
                    int i36 = aVar2.f13594e;
                    int i37 = aVar2.f13592c;
                    d dVar3 = (d) list7.get((i36 + i37) - 1);
                    int iD = ((dVar3.f13607a + dVar3.f13609c) - ((d) list7.get(i37)).f13607a) - c5533d3.d();
                    i13 = i33;
                    i14 = i35;
                    m(childAt3, iMakeMeasureSpec, iMakeMeasureSpec2, ((ViewGroup.MarginLayoutParams) c5533d3).width, ((ViewGroup.MarginLayoutParams) c5533d3).height, iB2, iD);
                    i34++;
                    i33 = i13 + 1;
                    childCount3 = i14;
                    str4 = str2;
                    iMax2 = i12;
                    i31 = 8;
                }
            } else {
                str2 = str4;
                i12 = iMax2;
                i13 = i33;
            }
            i14 = i35;
            i33 = i13 + 1;
            childCount3 = i14;
            str4 = str2;
            iMax2 = i12;
            i31 = 8;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i29 + i22, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(iMax2 + i30, getSuggestedMinimumHeight()), i10, 0));
        SystemClock.elapsedRealtime();
        int i38 = C4421b.f38269a;
        C4421b.a(C7.a.INFO);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View child) {
        kotlin.jvm.internal.l.f(child, "child");
        super.onViewAdded(child);
        this.f13588e = 0;
        c cVar = this.f13587d;
        cVar.f13601b.f3144d = null;
        cVar.f13602c.f3144d = null;
        cVar.f13603d.f3144d = null;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        kotlin.jvm.internal.l.f(child, "child");
        super.onViewRemoved(child);
        this.f13588e = 0;
        c cVar = this.f13587d;
        cVar.f13601b.f3144d = null;
        cVar.f13602c.f3144d = null;
        cVar.f13603d.f3144d = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (this.f13589f) {
            c cVar = this.f13587d;
            cVar.f13602c.f3144d = null;
            cVar.f13603d.f3144d = null;
        }
    }

    public final void setColumnCount(int i) {
        c cVar = this.f13587d;
        if (i <= 0) {
            cVar.getClass();
        } else if (cVar.f13600a != i) {
            cVar.f13600a = i;
            cVar.f13601b.f3144d = null;
            cVar.f13602c.f3144d = null;
            cVar.f13603d.f3144d = null;
        }
        this.f13588e = 0;
        cVar.f13601b.f3144d = null;
        cVar.f13602c.f3144d = null;
        cVar.f13603d.f3144d = null;
        requestLayout();
    }
}
