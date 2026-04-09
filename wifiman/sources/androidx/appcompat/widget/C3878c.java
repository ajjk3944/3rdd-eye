package androidx.appcompat.widget;

import F1.AbstractC2738b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import h.AbstractC5927a;
import h.AbstractC5933g;
import java.util.ArrayList;
import l.InterfaceC6524e;
import x1.AbstractC8416a;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3878c extends androidx.appcompat.view.menu.a implements AbstractC2738b.a {

    /* renamed from: A, reason: collision with root package name */
    RunnableC1023c f27328A;

    /* renamed from: B, reason: collision with root package name */
    private b f27329B;

    /* renamed from: C, reason: collision with root package name */
    final f f27330C;

    /* renamed from: D, reason: collision with root package name */
    int f27331D;

    /* renamed from: k, reason: collision with root package name */
    d f27332k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f27333l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27334m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27335n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27336o;

    /* renamed from: p, reason: collision with root package name */
    private int f27337p;

    /* renamed from: q, reason: collision with root package name */
    private int f27338q;

    /* renamed from: r, reason: collision with root package name */
    private int f27339r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27340s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27341t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f27342u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27343v;

    /* renamed from: w, reason: collision with root package name */
    private int f27344w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f27345x;

    /* renamed from: y, reason: collision with root package name */
    e f27346y;

    /* renamed from: z, reason: collision with root package name */
    a f27347z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC5927a.f47946i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C3878c.this.f27332k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C3878c.this).f26785i : view2);
            }
            j(C3878c.this.f27330C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C3878c c3878c = C3878c.this;
            c3878c.f27347z = null;
            c3878c.f27331D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC6524e a() {
            a aVar = C3878c.this.f27347z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC1023c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f27350a;

        public RunnableC1023c(e eVar) {
            this.f27350a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C3878c.this).f26779c != null) {
                ((androidx.appcompat.view.menu.a) C3878c.this).f26779c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C3878c.this).f26785i;
            if (view != null && view.getWindowToken() != null && this.f27350a.m()) {
                C3878c.this.f27346y = this.f27350a;
            }
            C3878c.this.f27328A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends N {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C3878c f27353j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C3878c c3878c) {
                super(view);
                this.f27353j = c3878c;
            }

            @Override // androidx.appcompat.widget.N
            public InterfaceC6524e b() {
                e eVar = C3878c.this.f27346y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.N
            public boolean c() {
                C3878c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.N
            public boolean d() {
                C3878c c3878c = C3878c.this;
                if (c3878c.f27328A != null) {
                    return false;
                }
                c3878c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC5927a.f47945h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C3878c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C3878c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC8416a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC5927a.f47946i);
            h(8388613);
            j(C3878c.this.f27330C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C3878c.this).f26779c != null) {
                ((androidx.appcompat.view.menu.a) C3878c.this).f26779c.close();
            }
            C3878c.this.f27346y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a aVarM = C3878c.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C3878c.this).f26779c) {
                return false;
            }
            C3878c.this.f27331D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarM = C3878c.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public C3878c(Context context) {
        super(context, AbstractC5933g.f48056c, AbstractC5933g.f48055b);
        this.f27345x = new SparseBooleanArray();
        this.f27330C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f26785i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f27332k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f27334m) {
            return this.f27333l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC1023c runnableC1023c = this.f27328A;
        if (runnableC1023c != null && (obj = this.f26785i) != null) {
            ((View) obj).removeCallbacks(runnableC1023c);
            this.f27328A = null;
            return true;
        }
        e eVar = this.f27346y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f27347z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f27328A != null || E();
    }

    public boolean E() {
        e eVar = this.f27346y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f27340s) {
            this.f27339r = androidx.appcompat.view.a.b(this.f26778b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f26779c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z10) {
        this.f27343v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f26785i = actionMenuView;
        actionMenuView.b(this.f26779c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f27332k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f27334m = true;
            this.f27333l = drawable;
        }
    }

    public void J(boolean z10) {
        this.f27335n = z10;
        this.f27336o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f27335n || E() || (eVar = this.f26779c) == null || this.f26785i == null || this.f27328A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC1023c runnableC1023c = new RunnableC1023c(new e(this.f26778b, this.f26779c, this.f27332k, true));
        this.f27328A = runnableC1023c;
        ((View) this.f26785i).post(runnableC1023c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f26785i);
        if (this.f27329B == null) {
            this.f27329B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f27329B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.c(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        super.d(z10);
        ((View) this.f26785i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f26779c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2738b abstractC2738bB = ((androidx.appcompat.view.menu.g) arrayListS.get(i10)).b();
                if (abstractC2738bB != null) {
                    abstractC2738bB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f26779c;
        ArrayList arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f27335n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f27332k == null) {
                this.f27332k = new d(this.f26777a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f27332k.getParent();
            if (viewGroup != this.f26785i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f27332k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f26785i;
                actionMenuView.addView(this.f27332k, actionMenuView.F());
            }
        } else {
            d dVar = this.f27332k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f26785i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f27332k);
                }
            }
        }
        ((ActionMenuView) this.f26785i).setOverflowReserved(this.f27335n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList arrayListE;
        int size;
        int i10;
        int iL;
        boolean z10;
        int i11;
        C3878c c3878c = this;
        androidx.appcompat.view.menu.e eVar = c3878c.f26779c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i12 = c3878c.f27339r;
        int i13 = c3878c.f27338q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c3878c.f26785i;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListE.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (c3878c.f27343v && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (c3878c.f27335n && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = c3878c.f27345x;
        sparseBooleanArray.clear();
        if (c3878c.f27341t) {
            int i18 = c3878c.f27344w;
            iL = i13 / i18;
            i10 = i18 + ((i13 % i18) / iL);
        } else {
            i10 = 0;
            iL = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListE.get(i19);
            if (gVar2.o()) {
                View viewN = c3878c.n(gVar2, view, viewGroup);
                if (c3878c.f27341t) {
                    iL -= ActionMenuView.L(viewN, i10, iL, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i11 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!c3878c.f27341t || iL > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewN2 = c3878c.n(gVar2, null, viewGroup);
                    if (c3878c.f27341t) {
                        int iL2 = ActionMenuView.L(viewN2, i10, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!c3878c.f27341t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayListE.get(i21);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                gVar2.u(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            c3878c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f27336o) {
            this.f27335n = aVarB.f();
        }
        if (!this.f27342u) {
            this.f27337p = aVarB.c();
        }
        if (!this.f27340s) {
            this.f27339r = aVarB.d();
        }
        int measuredWidth = this.f27337p;
        if (this.f27335n) {
            if (this.f27332k == null) {
                d dVar = new d(this.f26777a);
                this.f27332k = dVar;
                if (this.f27334m) {
                    dVar.setImageDrawable(this.f27333l);
                    this.f27333l = null;
                    this.f27334m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f27332k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f27332k.getMeasuredWidth();
        } else {
            this.f27332k = null;
        }
        this.f27338q = measuredWidth;
        this.f27344w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f26779c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View viewZ = z(mVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f27331D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f26778b, mVar, viewZ);
        this.f27347z = aVar;
        aVar.g(z10);
        this.f27347z.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f27332k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f26785i;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
