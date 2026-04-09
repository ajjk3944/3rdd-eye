package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private x0 J;
    private androidx.appcompat.widget.c K;
    private d L;
    private j.a M;
    private e.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b, reason: collision with root package name */
    private ActionMenuView f821b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f822c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f823d;

    /* renamed from: e, reason: collision with root package name */
    private ImageButton f824e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f825f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f826g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f827h;

    /* renamed from: i, reason: collision with root package name */
    ImageButton f828i;

    /* renamed from: j, reason: collision with root package name */
    View f829j;

    /* renamed from: k, reason: collision with root package name */
    private Context f830k;

    /* renamed from: l, reason: collision with root package name */
    private int f831l;

    /* renamed from: m, reason: collision with root package name */
    private int f832m;

    /* renamed from: n, reason: collision with root package name */
    private int f833n;

    /* renamed from: o, reason: collision with root package name */
    int f834o;

    /* renamed from: p, reason: collision with root package name */
    private int f835p;

    /* renamed from: q, reason: collision with root package name */
    private int f836q;

    /* renamed from: r, reason: collision with root package name */
    private int f837r;

    /* renamed from: s, reason: collision with root package name */
    private int f838s;

    /* renamed from: t, reason: collision with root package name */
    private int f839t;

    /* renamed from: u, reason: collision with root package name */
    private o0 f840u;

    /* renamed from: v, reason: collision with root package name */
    private int f841v;

    /* renamed from: w, reason: collision with root package name */
    private int f842w;

    /* renamed from: x, reason: collision with root package name */
    private int f843x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f844y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f845z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.j {

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.e f849b;

        /* renamed from: c, reason: collision with root package name */
        androidx.appcompat.view.menu.g f850c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f828i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f828i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f828i);
            }
            Toolbar.this.f829j = gVar.getActionView();
            this.f850c = gVar;
            ViewParent parent2 = Toolbar.this.f829j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f829j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f365a = 8388611 | (toolbar4.f834o & 112);
                eVarGenerateDefaultLayoutParams.f852b = 2;
                toolbar4.f829j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f829j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f829j;
            if (callback instanceof f.c) {
                ((f.c) callback).a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void h(boolean z2) {
            if (this.f850c != null) {
                androidx.appcompat.view.menu.e eVar = this.f849b;
                boolean z3 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f849b.getItem(i2) == this.f850c) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z3) {
                    return;
                }
                k(this.f849b, this.f850c);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f849b;
            if (eVar2 != null && (gVar = this.f850c) != null) {
                eVar2.f(gVar);
            }
            this.f849b = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f829j;
            if (callback instanceof f.c) {
                ((f.c) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f829j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f828i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f829j = null;
            toolbar3.a();
            this.f850c = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }
    }

    public static class e extends a.C0002a {

        /* renamed from: b, reason: collision with root package name */
        int f852b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f852b = 0;
            this.f365a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f852b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f852b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f852b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0002a c0002a) {
            super(c0002a);
            this.f852b = 0;
        }

        public e(e eVar) {
            super((a.C0002a) eVar);
            this.f852b = 0;
            this.f852b = eVar.f852b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends d0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f853d;

        /* renamed from: e, reason: collision with root package name */
        boolean f854e;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f853d = parcel.readInt();
            this.f854e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f853d);
            parcel.writeInt(this.f854e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.L);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f843x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        w0 w0VarT = w0.t(getContext(), attributeSet, a.j.W2, i2, 0);
        this.f832m = w0VarT.m(a.j.y3, 0);
        this.f833n = w0VarT.m(a.j.p3, 0);
        this.f843x = w0VarT.k(a.j.X2, this.f843x);
        this.f834o = w0VarT.k(a.j.Y2, 48);
        int iD = w0VarT.d(a.j.s3, 0);
        int i3 = a.j.x3;
        iD = w0VarT.q(i3) ? w0VarT.d(i3, iD) : iD;
        this.f839t = iD;
        this.f838s = iD;
        this.f837r = iD;
        this.f836q = iD;
        int iD2 = w0VarT.d(a.j.v3, -1);
        if (iD2 >= 0) {
            this.f836q = iD2;
        }
        int iD3 = w0VarT.d(a.j.u3, -1);
        if (iD3 >= 0) {
            this.f837r = iD3;
        }
        int iD4 = w0VarT.d(a.j.w3, -1);
        if (iD4 >= 0) {
            this.f838s = iD4;
        }
        int iD5 = w0VarT.d(a.j.t3, -1);
        if (iD5 >= 0) {
            this.f839t = iD5;
        }
        this.f835p = w0VarT.e(a.j.j3, -1);
        int iD6 = w0VarT.d(a.j.f3, Integer.MIN_VALUE);
        int iD7 = w0VarT.d(a.j.b3, Integer.MIN_VALUE);
        int iE = w0VarT.e(a.j.d3, 0);
        int iE2 = w0VarT.e(a.j.e3, 0);
        h();
        this.f840u.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f840u.g(iD6, iD7);
        }
        this.f841v = w0VarT.d(a.j.g3, Integer.MIN_VALUE);
        this.f842w = w0VarT.d(a.j.c3, Integer.MIN_VALUE);
        this.f826g = w0VarT.f(a.j.a3);
        this.f827h = w0VarT.o(a.j.Z2);
        CharSequence charSequenceO = w0VarT.o(a.j.r3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = w0VarT.o(a.j.o3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f830k = getContext();
        setPopupTheme(w0VarT.m(a.j.n3, 0));
        Drawable drawableF = w0VarT.f(a.j.m3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = w0VarT.o(a.j.l3);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = w0VarT.f(a.j.h3);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = w0VarT.o(a.j.i3);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i4 = a.j.z3;
        if (w0VarT.q(i4)) {
            setTitleTextColor(w0VarT.c(i4));
        }
        int i5 = a.j.q3;
        if (w0VarT.q(i5)) {
            setSubtitleTextColor(w0VarT.c(i5));
        }
        int i6 = a.j.k3;
        if (w0VarT.q(i6)) {
            x(w0VarT.m(i6, 0));
        }
        w0VarT.u();
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean L() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = a0.s.t(this) == 1;
        int childCount = getChildCount();
        int iB = a0.d.b(i2, a0.s.t(this));
        list.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f852b == 0 && M(childAt) && p(eVar.f365a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f852b == 0 && M(childAt2) && p(eVar2.f365a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f852b = 1;
        if (!z2 || this.f829j == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new f.g(getContext());
    }

    private void h() {
        if (this.f840u == null) {
            this.f840u = new o0();
        }
    }

    private void i() {
        if (this.f825f == null) {
            this.f825f = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f821b.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f821b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f821b.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f830k);
        }
    }

    private void k() {
        if (this.f821b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f821b = actionMenuView;
            actionMenuView.setPopupTheme(this.f831l);
            this.f821b.setOnMenuItemClickListener(this.I);
            this.f821b.M(this.M, this.N);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f365a = 8388613 | (this.f834o & 112);
            this.f821b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f821b, false);
        }
    }

    private void l() {
        if (this.f824e == null) {
            this.f824e = new m(getContext(), null, a.a.K);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f365a = 8388611 | (this.f834o & 112);
            this.f824e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int iT = a0.s.t(this);
        int iB = a0.d.b(i2, iT) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : iT == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(eVar.f365a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.f843x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a0.g.b(marginLayoutParams) + a0.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f821b;
        return actionMenuView != null && actionMenuView.H();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f852b != 2 && childAt != this.f821b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.f840u.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f821b == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f821b.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.O(this.K);
            eVarL.O(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.F(true);
        if (eVar != null) {
            eVar.c(cVar, this.f830k);
            eVar.c(this.L, this.f830k);
        } else {
            cVar.j(this.f830k, null);
            this.L.j(this.f830k, null);
            cVar.h(true);
            this.L.h(true);
        }
        this.f821b.setPopupTheme(this.f831l);
        this.f821b.setPresenter(cVar);
        this.K = cVar;
    }

    public void J(Context context, int i2) {
        this.f833n = i2;
        TextView textView = this.f823d;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void K(Context context, int i2) {
        this.f832m = i2;
        TextView textView = this.f822c;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f821b;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f821b) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.L;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f850c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f821b;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f828i == null) {
            m mVar = new m(getContext(), null, a.a.K);
            this.f828i = mVar;
            mVar.setImageDrawable(this.f826g);
            this.f828i.setContentDescription(this.f827h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f365a = 8388611 | (this.f834o & 112);
            eVarGenerateDefaultLayoutParams.f852b = 2;
            this.f828i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f828i.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f828i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f828i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.f840u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f842w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.f840u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.f840u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.f840u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f841v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f821b;
        return actionMenuView != null && (eVarL = actionMenuView.L()) != null && eVarL.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f842w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return a0.s.t(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return a0.s.t(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f841v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f825f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f825f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f821b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f824e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f824e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f821b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f830k;
    }

    public int getPopupTheme() {
        return this.f831l;
    }

    public CharSequence getSubtitle() {
        return this.f845z;
    }

    final TextView getSubtitleTextView() {
        return this.f823d;
    }

    public CharSequence getTitle() {
        return this.f844y;
    }

    public int getTitleMarginBottom() {
        return this.f839t;
    }

    public int getTitleMarginEnd() {
        return this.f837r;
    }

    public int getTitleMarginStart() {
        return this.f836q;
    }

    public int getTitleMarginTop() {
        return this.f838s;
    }

    final TextView getTitleTextView() {
        return this.f822c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new x0(this, true);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0002a ? new e((a.C0002a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) throws java.lang.NoSuchFieldException {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.G;
        boolean zB = c1.b(this);
        int i4 = !zB ? 1 : 0;
        if (M(this.f824e)) {
            E(this.f824e, i2, 0, i3, 0, this.f835p);
            measuredWidth = this.f824e.getMeasuredWidth() + s(this.f824e);
            iMax = Math.max(0, this.f824e.getMeasuredHeight() + t(this.f824e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f824e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.f828i)) {
            E(this.f828i, i2, 0, i3, 0, this.f835p);
            measuredWidth = this.f828i.getMeasuredWidth() + s(this.f828i);
            iMax = Math.max(iMax, this.f828i.getMeasuredHeight() + t(this.f828i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f828i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (M(this.f821b)) {
            E(this.f821b, i2, iMax3, i3, 0, this.f835p);
            measuredWidth2 = this.f821b.getMeasuredWidth() + s(this.f821b);
            iMax = Math.max(iMax, this.f821b.getMeasuredHeight() + t(this.f821b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f821b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (M(this.f829j)) {
            iMax4 += D(this.f829j, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f829j.getMeasuredHeight() + t(this.f829j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f829j.getMeasuredState());
        }
        if (M(this.f825f)) {
            iMax4 += D(this.f825f, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f825f.getMeasuredHeight() + t(this.f825f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f825f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((e) childAt.getLayoutParams()).f852b == 0 && M(childAt)) {
                iMax4 += D(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f838s + this.f839t;
        int i7 = this.f836q + this.f837r;
        if (M(this.f822c)) {
            D(this.f822c, i2, iMax4 + i7, i3, i6, iArr);
            int measuredWidth3 = this.f822c.getMeasuredWidth() + s(this.f822c);
            measuredHeight = this.f822c.getMeasuredHeight() + t(this.f822c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f822c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (M(this.f823d)) {
            iMax2 = Math.max(iMax2, D(this.f823d, i2, iMax4 + i7, i3, measuredHeight + i6, iArr));
            measuredHeight += this.f823d.getMeasuredHeight() + t(this.f823d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f823d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), L() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f821b;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = gVar.f853d;
        if (i2 != 0 && this.L != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f854e) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        this.f840u.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (gVar = dVar.f850c) != null) {
            gVar2.f853d = gVar.getItemId();
        }
        gVar2.f854e = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f828i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(c.a.d(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f828i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f828i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f826g);
            }
        }
    }

    public void setCollapsible(boolean z2) {
        this.O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f842w) {
            this.f842w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f841v) {
            this.f841v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(c.a.d(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f825f)) {
                c(this.f825f, true);
            }
        } else {
            ImageView imageView = this.f825f;
            if (imageView != null && y(imageView)) {
                removeView(this.f825f);
                this.F.remove(this.f825f);
            }
        }
        ImageView imageView2 = this.f825f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f825f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f824e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(c.a.d(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f824e)) {
                c(this.f824e, true);
            }
        } else {
            ImageButton imageButton = this.f824e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f824e);
                this.F.remove(this.f824e);
            }
        }
        ImageButton imageButton2 = this.f824e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f824e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f821b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f831l != i2) {
            this.f831l = i2;
            if (i2 == 0) {
                this.f830k = getContext();
            } else {
                this.f830k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f823d;
            if (textView != null && y(textView)) {
                removeView(this.f823d);
                this.F.remove(this.f823d);
            }
        } else {
            if (this.f823d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f823d = zVar;
                zVar.setSingleLine();
                this.f823d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f833n;
                if (i2 != 0) {
                    this.f823d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f823d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f823d)) {
                c(this.f823d, true);
            }
        }
        TextView textView2 = this.f823d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f845z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f823d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f822c;
            if (textView != null && y(textView)) {
                removeView(this.f822c);
                this.F.remove(this.f822c);
            }
        } else {
            if (this.f822c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f822c = zVar;
                zVar.setSingleLine();
                this.f822c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f832m;
                if (i2 != 0) {
                    this.f822c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f822c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f822c)) {
                c(this.f822c, true);
            }
        }
        TextView textView2 = this.f822c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f844y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f839t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f837r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f836q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f838s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f822c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f850c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f821b;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f821b;
        return actionMenuView != null && actionMenuView.G();
    }
}
