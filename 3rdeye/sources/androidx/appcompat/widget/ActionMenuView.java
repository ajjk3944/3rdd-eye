package androidx.appcompat.widget;

import L0.InterfaceC0783n;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import h.q;
import java.util.Iterator;
import o.f0;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, k {

    /* renamed from: A, reason: collision with root package name */
    public final int f14574A;

    /* renamed from: B, reason: collision with root package name */
    public e f14575B;

    /* renamed from: q, reason: collision with root package name */
    public f f14576q;

    /* renamed from: r, reason: collision with root package name */
    public Context f14577r;

    /* renamed from: s, reason: collision with root package name */
    public int f14578s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14579t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.appcompat.widget.a f14580u;

    /* renamed from: v, reason: collision with root package name */
    public q.c f14581v;

    /* renamed from: w, reason: collision with root package name */
    public f.a f14582w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14583x;

    /* renamed from: y, reason: collision with root package name */
    public int f14584y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14585z;

    public interface a {
        boolean a();

        boolean f();
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f14586a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f14587b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f14588c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f14589d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f14590e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f14591f;
    }

    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z10;
            boolean zOnMenuItemSelected;
            e eVar = ActionMenuView.this.f14575B;
            if (eVar != null) {
                Toolbar toolbar = Toolbar.this;
                Iterator<InterfaceC0783n> it = toolbar.f14708H.f3922b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (it.next().a(menuItem)) {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    zOnMenuItemSelected = true;
                } else {
                    Toolbar.h hVar = toolbar.f14710J;
                    zOnMenuItemSelected = hVar != null ? q.this.f38097b.onMenuItemSelected(0, menuItem) : false;
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.f14582w;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f14585z = (int) (56.0f * f10);
        this.f14574A = (int) (f10 * 4.0f);
        this.f14577r = context;
        this.f14578s = 0;
    }

    public static c l() {
        c cVar = new c(-2, -2);
        cVar.f14586a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c m(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f14586a = cVar2.f14586a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.f14576q.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f(f fVar) {
        this.f14576q = fVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f14576q == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f14576q = fVar;
            fVar.f14435e = new d();
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f14580u = aVar;
            aVar.f14763m = true;
            aVar.f14764n = true;
            j.a bVar = this.f14581v;
            if (bVar == null) {
                bVar = new b();
            }
            aVar.f14379f = bVar;
            this.f14576q.b(aVar, this.f14577r);
            androidx.appcompat.widget.a aVar2 = this.f14580u;
            aVar2.i = this;
            this.f14576q = aVar2.f14377d;
        }
        return this.f14576q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f14580u;
        a.d dVar = aVar.f14760j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.f14762l) {
            return aVar.f14761k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f14578s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).f() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f14580u;
        if (aVar != null) {
            aVar.g();
            if (this.f14580u.k()) {
                this.f14580u.h();
                this.f14580u.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f14580u;
        if (aVar != null) {
            aVar.h();
            a.C0228a c0228a = aVar.f14771u;
            if (c0228a == null || !c0228a.b()) {
                return;
            }
            c0228a.i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f14583x) {
            super.onLayout(z10, i, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = f0.f44665a;
        boolean z12 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f14586a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    n(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f14586a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f14586a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        f fVar;
        boolean z10 = this.f14583x;
        boolean z11 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f14583x = z11;
        if (z10 != z11) {
            this.f14584y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f14583x && (fVar = this.f14576q) != null && size != this.f14584y) {
            this.f14584y = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f14583x || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                c cVar = (c) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f14585z;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z12 = false;
        int i23 = 0;
        long j4 = 0;
        while (true) {
            i11 = this.f14574A;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z13) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f14591f = false;
                cVar2.f14588c = 0;
                cVar2.f14587b = 0;
                cVar2.f14589d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f14590e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = cVar2.f14586a ? 1 : i18;
                c cVar3 = (c) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i26 <= 0 || (z14 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, RecyclerView.UNDEFINED_DURATION), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z15 && i14 < 2) {
                        i14 = 2;
                    }
                }
                cVar3.f14589d = !cVar3.f14586a && z15;
                cVar3.f14587b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (cVar2.f14589d) {
                    i23++;
                }
                if (cVar2.f14586a) {
                    z12 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j4 |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z16 = z12 && i21 == 2;
        int i31 = i29;
        boolean z17 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                boolean z18 = z16;
                c cVar4 = (c) getChildAt(i34).getLayoutParams();
                int i35 = iMax;
                if (cVar4.f14589d) {
                    int i36 = cVar4.f14587b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                iMax = i35;
                z16 = z18;
            }
            boolean z19 = z16;
            i12 = iMax;
            j4 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                c cVar5 = (c) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z19 && cVar5.f14590e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    cVar5.f14587b += r11;
                    cVar5.f14591f = r11;
                    i31--;
                } else if (cVar5.f14587b == i37) {
                    j4 |= j11;
                }
                i38++;
                z12 = z20;
            }
            iMax = i12;
            z16 = z19;
            z17 = true;
        }
        i12 = iMax;
        boolean z21 = !z12 && i21 == 1;
        if (i31 > 0 && j4 != 0 && (i31 < i21 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j4);
            if (!z21) {
                if ((j4 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f14590e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j4 & (1 << i39)) != 0 && !((c) getChildAt(i39).getLayoutParams()).f14590e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j4 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f14588c = i40;
                        cVar6.f14591f = true;
                        if (i41 == 0 && !cVar6.f14590e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i40) / 2;
                        }
                        z22 = true;
                    } else if (cVar6.f14586a) {
                        cVar6.f14588c = i40;
                        cVar6.f14591f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i40) / 2;
                        z22 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f14591f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f14587b * i30) + cVar7.f14588c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f14580u.f14768r = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f14575B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f14580u;
        a.d dVar = aVar.f14760j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            aVar.f14762l = true;
            aVar.f14761k = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f14579t = z10;
    }

    public void setPopupTheme(int i) {
        if (this.f14578s != i) {
            this.f14578s = i;
            if (i == 0) {
                this.f14577r = getContext();
            } else {
                this.f14577r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f14580u = aVar;
        aVar.i = this;
        this.f14576q = aVar.f14377d;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(f fVar, boolean z10) {
        }
    }
}
