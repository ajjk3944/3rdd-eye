package androidx.appcompat.widget;

import F1.AbstractC2771s;
import F1.C2781x;
import F1.InterfaceC2779w;
import F1.InterfaceC2784z;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import h.AbstractC5927a;
import h.AbstractC5936j;
import i.AbstractC6050a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.SnmpConstants;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC2779w {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f27226A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f27227B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f27228C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList f27229D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList f27230E;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f27231F;

    /* renamed from: G, reason: collision with root package name */
    final C2781x f27232G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList f27233H;

    /* renamed from: I, reason: collision with root package name */
    private final ActionMenuView.e f27234I;

    /* renamed from: J, reason: collision with root package name */
    private f0 f27235J;

    /* renamed from: N, reason: collision with root package name */
    private C3878c f27236N;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f27237a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f27238b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f27239c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f27240d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f27241e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f27242f;

    /* renamed from: f1, reason: collision with root package name */
    private f f27243f1;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f27244g;

    /* renamed from: g1, reason: collision with root package name */
    private j.a f27245g1;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f27246h;

    /* renamed from: h1, reason: collision with root package name */
    e.a f27247h1;

    /* renamed from: i, reason: collision with root package name */
    View f27248i;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f27249i1;

    /* renamed from: j, reason: collision with root package name */
    private Context f27250j;

    /* renamed from: j1, reason: collision with root package name */
    private OnBackInvokedCallback f27251j1;

    /* renamed from: k, reason: collision with root package name */
    private int f27252k;

    /* renamed from: k1, reason: collision with root package name */
    private OnBackInvokedDispatcher f27253k1;

    /* renamed from: l, reason: collision with root package name */
    private int f27254l;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f27255l1;

    /* renamed from: m, reason: collision with root package name */
    private int f27256m;

    /* renamed from: m1, reason: collision with root package name */
    private final Runnable f27257m1;

    /* renamed from: n, reason: collision with root package name */
    int f27258n;

    /* renamed from: o, reason: collision with root package name */
    private int f27259o;

    /* renamed from: p, reason: collision with root package name */
    private int f27260p;

    /* renamed from: q, reason: collision with root package name */
    private int f27261q;

    /* renamed from: r, reason: collision with root package name */
    private int f27262r;

    /* renamed from: s, reason: collision with root package name */
    private int f27263s;

    /* renamed from: t, reason: collision with root package name */
    private V f27264t;

    /* renamed from: u, reason: collision with root package name */
    private int f27265u;

    /* renamed from: v, reason: collision with root package name */
    private int f27266v;

    /* renamed from: w, reason: collision with root package name */
    private int f27267w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f27268x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f27269y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f27270z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f27232G.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f27247h1;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f27237a.J()) {
                Toolbar.this.f27232G.e(eVar);
            }
            e.a aVar = Toolbar.this.f27247h1;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.e0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(SnmpConstants.MILLISECOND_TO_NANOSECOND, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f27275a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f27276b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z10) {
            if (this.f27276b != null) {
                androidx.appcompat.view.menu.e eVar = this.f27275a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f27275a.getItem(i10) == this.f27276b) {
                            return;
                        }
                    }
                }
                f(this.f27275a, this.f27276b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f27248i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f27248i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f27246h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f27248i = null;
            toolbar3.a();
            this.f27276b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f27246h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f27246h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f27246h);
            }
            Toolbar.this.f27248i = gVar.getActionView();
            this.f27276b = gVar;
            ViewParent parent2 = Toolbar.this.f27248i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f27248i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f26484a = (toolbar4.f27258n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f27278b = 2;
                toolbar4.f27248i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f27248i);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f27248i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f27275a;
            if (eVar2 != null && (gVar = this.f27276b) != null) {
                eVar2.f(gVar);
            }
            this.f27275a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47937I);
    }

    private boolean A(View view) {
        return view.getParent() == this || this.f27230E.contains(view);
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int F(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void G(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f27232G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f27233H = currentMenuItems2;
    }

    private void I() {
        removeCallbacks(this.f27257m1);
        post(this.f27257m1);
    }

    private boolean P() {
        if (!this.f27249i1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC2771s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f27278b == 0 && Q(childAt) && p(gVar.f26484a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f27278b == 0 && Q(childAt2) && p(gVar2.f26484a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f27278b = 1;
        if (!z10 || this.f27248i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f27230E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f27264t == null) {
            this.f27264t = new V();
        }
    }

    private void i() {
        if (this.f27241e == null) {
            this.f27241e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f27237a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f27237a.getMenu();
            if (this.f27243f1 == null) {
                this.f27243f1 = new f();
            }
            this.f27237a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f27243f1, this.f27250j);
            S();
        }
    }

    private void k() {
        if (this.f27237a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f27237a = actionMenuView;
            actionMenuView.setPopupTheme(this.f27252k);
            this.f27237a.setOnMenuItemClickListener(this.f27234I);
            this.f27237a.O(this.f27245g1, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f26484a = (this.f27258n & 112) | 8388613;
            this.f27237a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f27237a, false);
        }
    }

    private void l() {
        if (this.f27240d == null) {
            this.f27240d = new C3891p(getContext(), null, AbstractC5927a.f47936H);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f26484a = (this.f27258n & 112) | 8388611;
            this.f27240d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC2771s.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iS = s(gVar.f26484a);
        if (iS == 48) {
            return getPaddingTop() - i11;
        }
        if (iS == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f27267w & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f27237a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f27237a;
        return actionMenuView != null && actionMenuView.J();
    }

    void J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f27278b != 2 && childAt != this.f27237a) {
                removeViewAt(childCount);
                this.f27230E.add(childAt);
            }
        }
    }

    public void K(int i10, int i11) {
        h();
        this.f27264t.g(i10, i11);
    }

    public void L(androidx.appcompat.view.menu.e eVar, C3878c c3878c) {
        if (eVar == null && this.f27237a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarN = this.f27237a.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.P(this.f27236N);
            eVarN.P(this.f27243f1);
        }
        if (this.f27243f1 == null) {
            this.f27243f1 = new f();
        }
        c3878c.G(true);
        if (eVar != null) {
            eVar.c(c3878c, this.f27250j);
            eVar.c(this.f27243f1, this.f27250j);
        } else {
            c3878c.i(this.f27250j, null);
            this.f27243f1.i(this.f27250j, null);
            c3878c.d(true);
            this.f27243f1.d(true);
        }
        this.f27237a.setPopupTheme(this.f27252k);
        this.f27237a.setPresenter(c3878c);
        this.f27236N = c3878c;
        S();
    }

    public void M(Context context, int i10) {
        this.f27256m = i10;
        TextView textView = this.f27239c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    @Override // F1.InterfaceC2779w
    public void N(InterfaceC2784z interfaceC2784z) {
        this.f27232G.f(interfaceC2784z);
    }

    public void O(Context context, int i10) {
        this.f27254l = i10;
        TextView textView = this.f27238b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f27237a;
        return actionMenuView != null && actionMenuView.P();
    }

    void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = w() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f27255l1;
            if (z10 && this.f27253k1 == null) {
                if (this.f27251j1 == null) {
                    this.f27251j1 = e.b(new Runnable() { // from class: androidx.appcompat.widget.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f27357a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f27251j1);
                this.f27253k1 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f27253k1) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f27251j1);
            this.f27253k1 = null;
        }
    }

    void a() {
        for (int size = this.f27230E.size() - 1; size >= 0; size--) {
            addView((View) this.f27230E.get(size));
        }
        this.f27230E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f27237a) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f27243f1;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f27276b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f27237a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f27246h == null) {
            C3891p c3891p = new C3891p(getContext(), null, AbstractC5927a.f47936H);
            this.f27246h = c3891p;
            c3891p.setImageDrawable(this.f27242f);
            this.f27246h.setContentDescription(this.f27244g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f26484a = (this.f27258n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f27278b = 2;
            this.f27246h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f27246h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f27246h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f27246h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        V v10 = this.f27264t;
        if (v10 != null) {
            return v10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f27266v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        V v10 = this.f27264t;
        if (v10 != null) {
            return v10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        V v10 = this.f27264t;
        if (v10 != null) {
            return v10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        V v10 = this.f27264t;
        if (v10 != null) {
            return v10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f27265u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.f27237a;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f27266v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f27265u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f27241e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f27241e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f27237a.getMenu();
    }

    View getNavButtonView() {
        return this.f27240d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f27240d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f27240d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C3878c getOuterActionMenuPresenter() {
        return this.f27236N;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f27237a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f27250j;
    }

    public int getPopupTheme() {
        return this.f27252k;
    }

    public CharSequence getSubtitle() {
        return this.f27269y;
    }

    final TextView getSubtitleTextView() {
        return this.f27239c;
    }

    public CharSequence getTitle() {
        return this.f27268x;
    }

    public int getTitleMarginBottom() {
        return this.f27263s;
    }

    public int getTitleMarginEnd() {
        return this.f27261q;
    }

    public int getTitleMarginStart() {
        return this.f27260p;
    }

    public int getTitleMarginTop() {
        return this.f27262r;
    }

    final TextView getTitleTextView() {
        return this.f27238b;
    }

    public J getWrapper() {
        if (this.f27235J == null) {
            this.f27235J = new f0(this, true);
        }
        return this.f27235J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C1019a ? new g((a.C1019a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f27257m1);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f27228C = false;
        }
        if (!this.f27228C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f27228C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f27228C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f27231F;
        boolean zB = i0.b(this);
        int i12 = !zB ? 1 : 0;
        if (Q(this.f27240d)) {
            G(this.f27240d, i10, 0, i11, 0, this.f27259o);
            measuredWidth = this.f27240d.getMeasuredWidth() + t(this.f27240d);
            iMax = Math.max(0, this.f27240d.getMeasuredHeight() + u(this.f27240d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f27240d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f27246h)) {
            G(this.f27246h, i10, 0, i11, 0, this.f27259o);
            measuredWidth = this.f27246h.getMeasuredWidth() + t(this.f27246h);
            iMax = Math.max(iMax, this.f27246h.getMeasuredHeight() + u(this.f27246h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f27246h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f27237a)) {
            G(this.f27237a, i10, iMax3, i11, 0, this.f27259o);
            measuredWidth2 = this.f27237a.getMeasuredWidth() + t(this.f27237a);
            iMax = Math.max(iMax, this.f27237a.getMeasuredHeight() + u(this.f27237a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f27237a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f27248i)) {
            iMax4 += F(this.f27248i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f27248i.getMeasuredHeight() + u(this.f27248i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f27248i.getMeasuredState());
        }
        if (Q(this.f27241e)) {
            iMax4 += F(this.f27241e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f27241e.getMeasuredHeight() + u(this.f27241e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f27241e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f27278b == 0 && Q(childAt)) {
                iMax4 += F(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + u(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f27262r + this.f27263s;
        int i15 = this.f27260p + this.f27261q;
        if (Q(this.f27238b)) {
            F(this.f27238b, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f27238b.getMeasuredWidth() + t(this.f27238b);
            measuredHeight = this.f27238b.getMeasuredHeight() + u(this.f27238b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f27238b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (Q(this.f27239c)) {
            iMax2 = Math.max(iMax2, F(this.f27239c, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f27239c.getMeasuredHeight() + u(this.f27239c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f27239c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f27237a;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f27279c;
        if (i10 != 0 && this.f27243f1 != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f27280d) {
            I();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f27264t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f27243f1;
        if (fVar != null && (gVar = fVar.f27276b) != null) {
            iVar.f27279c = gVar.getItemId();
        }
        iVar.f27280d = C();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27227B = false;
        }
        if (!this.f27227B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f27227B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f27227B = false;
        }
        return true;
    }

    @Override // F1.InterfaceC2779w
    public void r(InterfaceC2784z interfaceC2784z) {
        this.f27232G.a(interfaceC2784z);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f27255l1 != z10) {
            this.f27255l1 = z10;
            S();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC6050a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f27249i1 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = PduHandle.NONE;
        }
        if (i10 != this.f27266v) {
            this.f27266v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = PduHandle.NONE;
        }
        if (i10 != this.f27265u) {
            this.f27265u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC6050a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC6050a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f27240d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f27237a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f27252k != i10) {
            this.f27252k = i10;
            if (i10 == 0) {
                this.f27250j = getContext();
            } else {
                this.f27250j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f27263s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f27261q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f27260p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f27262r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean w() {
        f fVar = this.f27243f1;
        return (fVar == null || fVar.f27276b == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f27237a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        Iterator it = this.f27233H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        H();
    }

    public static class g extends a.C1019a {

        /* renamed from: b, reason: collision with root package name */
        int f27278b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27278b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f27278b = 0;
            this.f26484a = 8388627;
        }

        public g(g gVar) {
            super((a.C1019a) gVar);
            this.f27278b = 0;
            this.f27278b = gVar.f27278b;
        }

        public g(a.C1019a c1019a) {
            super(c1019a);
            this.f27278b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f27278b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27278b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27267w = 8388627;
        this.f27229D = new ArrayList();
        this.f27230E = new ArrayList();
        this.f27231F = new int[2];
        this.f27232G = new C2781x(new Runnable() { // from class: androidx.appcompat.widget.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27362a.z();
            }
        });
        this.f27233H = new ArrayList();
        this.f27234I = new a();
        this.f27257m1 = new b();
        Context context2 = getContext();
        int[] iArr = AbstractC5936j.f48296x2;
        b0 b0VarV = b0.v(context2, attributeSet, iArr, i10, 0);
        F1.W.k0(this, context, iArr, attributeSet, b0VarV.r(), i10, 0);
        this.f27254l = b0VarV.n(AbstractC5936j.f48188Z2, 0);
        this.f27256m = b0VarV.n(AbstractC5936j.f48152Q2, 0);
        this.f27267w = b0VarV.l(AbstractC5936j.f48300y2, this.f27267w);
        this.f27258n = b0VarV.l(AbstractC5936j.f48304z2, 48);
        int iE = b0VarV.e(AbstractC5936j.f48164T2, 0);
        int i11 = AbstractC5936j.f48184Y2;
        iE = b0VarV.s(i11) ? b0VarV.e(i11, iE) : iE;
        this.f27263s = iE;
        this.f27262r = iE;
        this.f27261q = iE;
        this.f27260p = iE;
        int iE2 = b0VarV.e(AbstractC5936j.f48176W2, -1);
        if (iE2 >= 0) {
            this.f27260p = iE2;
        }
        int iE3 = b0VarV.e(AbstractC5936j.f48172V2, -1);
        if (iE3 >= 0) {
            this.f27261q = iE3;
        }
        int iE4 = b0VarV.e(AbstractC5936j.f48180X2, -1);
        if (iE4 >= 0) {
            this.f27262r = iE4;
        }
        int iE5 = b0VarV.e(AbstractC5936j.f48168U2, -1);
        if (iE5 >= 0) {
            this.f27263s = iE5;
        }
        this.f27259o = b0VarV.f(AbstractC5936j.f48128K2, -1);
        int iE6 = b0VarV.e(AbstractC5936j.f48112G2, PduHandle.NONE);
        int iE7 = b0VarV.e(AbstractC5936j.f48096C2, PduHandle.NONE);
        int iF = b0VarV.f(AbstractC5936j.f48104E2, 0);
        int iF2 = b0VarV.f(AbstractC5936j.f48108F2, 0);
        h();
        this.f27264t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f27264t.g(iE6, iE7);
        }
        this.f27265u = b0VarV.e(AbstractC5936j.f48116H2, PduHandle.NONE);
        this.f27266v = b0VarV.e(AbstractC5936j.f48100D2, PduHandle.NONE);
        this.f27242f = b0VarV.g(AbstractC5936j.f48092B2);
        this.f27244g = b0VarV.p(AbstractC5936j.f48088A2);
        CharSequence charSequenceP = b0VarV.p(AbstractC5936j.f48160S2);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = b0VarV.p(AbstractC5936j.f48148P2);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f27250j = getContext();
        setPopupTheme(b0VarV.n(AbstractC5936j.f48144O2, 0));
        Drawable drawableG = b0VarV.g(AbstractC5936j.f48140N2);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = b0VarV.p(AbstractC5936j.f48136M2);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = b0VarV.g(AbstractC5936j.f48120I2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = b0VarV.p(AbstractC5936j.f48124J2);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = AbstractC5936j.f48193a3;
        if (b0VarV.s(i12)) {
            setTitleTextColor(b0VarV.c(i12));
        }
        int i13 = AbstractC5936j.f48156R2;
        if (b0VarV.s(i13)) {
            setSubtitleTextColor(b0VarV.c(i13));
        }
        int i14 = AbstractC5936j.f48132L2;
        if (b0VarV.s(i14)) {
            y(b0VarV.n(i14, 0));
        }
        b0VarV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f27246h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f27246h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f27246h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f27242f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f27241e)) {
                c(this.f27241e, true);
            }
        } else {
            ImageView imageView = this.f27241e;
            if (imageView != null && A(imageView)) {
                removeView(this.f27241e);
                this.f27230E.remove(this.f27241e);
            }
        }
        ImageView imageView2 = this.f27241e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f27241e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f27240d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            g0.a(this.f27240d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.f27240d)) {
                c(this.f27240d, true);
            }
        } else {
            ImageButton imageButton = this.f27240d;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f27240d);
                this.f27230E.remove(this.f27240d);
            }
        }
        ImageButton imageButton2 = this.f27240d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f27239c;
            if (textView != null && A(textView)) {
                removeView(this.f27239c);
                this.f27230E.remove(this.f27239c);
            }
        } else {
            if (this.f27239c == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f27239c = d10;
                d10.setSingleLine();
                this.f27239c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f27256m;
                if (i10 != 0) {
                    this.f27239c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f27226A;
                if (colorStateList != null) {
                    this.f27239c.setTextColor(colorStateList);
                }
            }
            if (!A(this.f27239c)) {
                c(this.f27239c, true);
            }
        }
        TextView textView2 = this.f27239c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f27269y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f27226A = colorStateList;
        TextView textView = this.f27239c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f27238b;
            if (textView != null && A(textView)) {
                removeView(this.f27238b);
                this.f27230E.remove(this.f27238b);
            }
        } else {
            if (this.f27238b == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f27238b = d10;
                d10.setSingleLine();
                this.f27238b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f27254l;
                if (i10 != 0) {
                    this.f27238b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f27270z;
                if (colorStateList != null) {
                    this.f27238b.setTextColor(colorStateList);
                }
            }
            if (!A(this.f27238b)) {
                c(this.f27238b, true);
            }
        }
        TextView textView2 = this.f27238b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f27268x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f27270z = colorStateList;
        TextView textView = this.f27238b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends L1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f27279c;

        /* renamed from: d, reason: collision with root package name */
        boolean f27280d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27279c = parcel.readInt();
            this.f27280d = parcel.readInt() != 0;
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27279c);
            parcel.writeInt(this.f27280d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
