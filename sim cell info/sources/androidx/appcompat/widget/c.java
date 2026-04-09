package androidx.appcompat.widget;

import a0.b;
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
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements b.a {
    a A;
    RunnableC0006c B;
    private b C;
    final f D;
    int E;

    /* renamed from: l, reason: collision with root package name */
    d f895l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f896m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f897n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f898o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f899p;

    /* renamed from: q, reason: collision with root package name */
    private int f900q;

    /* renamed from: r, reason: collision with root package name */
    private int f901r;

    /* renamed from: s, reason: collision with root package name */
    private int f902s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f903t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f904u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f905v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f906w;

    /* renamed from: x, reason: collision with root package name */
    private int f907x;

    /* renamed from: y, reason: collision with root package name */
    private final SparseBooleanArray f908y;

    /* renamed from: z, reason: collision with root package name */
    e f909z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, a.a.f11l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f895l;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f540j : view2);
            }
            j(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.A = null;
            cVar.E = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public g.e a() {
            a aVar = c.this.A;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0006c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private e f912b;

        public RunnableC0006c(e eVar) {
            this.f912b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f534d != null) {
                ((androidx.appcompat.view.menu.a) c.this).f534d.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f540j;
            if (view != null && view.getWindowToken() != null && this.f912b.m()) {
                c.this.f909z = this.f912b;
            }
            c.this.B = null;
        }
    }

    private class d extends o implements ActionMenuView.a {

        /* renamed from: d, reason: collision with root package name */
        private final float[] f914d;

        class a extends h0 {

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ c f916k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f916k = cVar;
            }

            @Override // androidx.appcompat.widget.h0
            public g.e b() {
                e eVar = c.this.f909z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean c() {
                c.this.J();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean d() {
                c cVar = c.this;
                if (cVar.B != null) {
                    return false;
                }
                cVar.A();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.a.f10k);
            this.f914d = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
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
            c.this.J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                u.a.k(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z2) {
            super(context, eVar, view, z2, a.a.f11l);
            h(8388613);
            j(c.this.D);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f534d != null) {
                ((androidx.appcompat.view.menu.a) c.this).f534d.close();
            }
            c.this.f909z = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                aVarM.b(eVar, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            c.this.E = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarM = c.this.m();
            if (aVarM != null) {
                return aVarM.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, a.g.f100c, a.g.f99b);
        this.f908y = new SparseBooleanArray();
        this.D = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f540j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        Object obj;
        RunnableC0006c runnableC0006c = this.B;
        if (runnableC0006c != null && (obj = this.f540j) != null) {
            ((View) obj).removeCallbacks(runnableC0006c);
            this.B = null;
            return true;
        }
        e eVar = this.f909z;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean B() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean C() {
        return this.B != null || D();
    }

    public boolean D() {
        e eVar = this.f909z;
        return eVar != null && eVar.d();
    }

    public void E(Configuration configuration) {
        if (!this.f903t) {
            this.f902s = f.a.b(this.f533c).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f534d;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void F(boolean z2) {
        this.f906w = z2;
    }

    public void G(ActionMenuView actionMenuView) {
        this.f540j = actionMenuView;
        actionMenuView.c(this.f534d);
    }

    public void H(Drawable drawable) {
        d dVar = this.f895l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f897n = true;
            this.f896m = drawable;
        }
    }

    public void I(boolean z2) {
        this.f898o = z2;
        this.f899p = true;
    }

    public boolean J() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f898o || D() || (eVar = this.f534d) == null || this.f540j == null || this.B != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0006c runnableC0006c = new RunnableC0006c(new e(this.f533c, this.f534d, this.f895l, true));
        this.B = runnableC0006c;
        ((View) this.f540j).post(runnableC0006c);
        super.f(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        x();
        super.b(eVar, z2);
    }

    @Override // androidx.appcompat.view.menu.a
    public void e(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f540j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        boolean z2 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f534d) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View viewY = y(mVar2.getItem());
        if (viewY == null) {
            return false;
        }
        this.E = mVar.getItem().getItemId();
        int size = mVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f533c, mVar, viewY);
        this.A = aVar;
        aVar.g(z2);
        this.A.k();
        super.f(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListE;
        int size;
        int i2;
        int iJ;
        int i3;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f534d;
        View view = null;
        int i4 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i5 = cVar.f902s;
        int i6 = cVar.f901r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f540j;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.appcompat.view.menu.g gVar = arrayListE.get(i9);
            if (gVar.o()) {
                i7++;
            } else if (gVar.n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (cVar.f906w && gVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.f898o && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.f908y;
        sparseBooleanArray.clear();
        if (cVar.f904u) {
            int i11 = cVar.f907x;
            iJ = i6 / i11;
            i2 = i11 + ((i6 % i11) / iJ);
        } else {
            i2 = 0;
            iJ = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListE.get(i12);
            if (gVar2.o()) {
                View viewN = cVar.n(gVar2, view, viewGroup);
                if (cVar.f904u) {
                    iJ -= ActionMenuView.J(viewN, i2, iJ, iMakeMeasureSpec, i4);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i3 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!cVar.f904u || iJ > 0);
                boolean z5 = z4;
                i3 = size;
                if (z4) {
                    View viewN2 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f904u) {
                        int iJ2 = ActionMenuView.J(viewN2, i2, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!cVar.f904u ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListE.get(i14);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i10++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                gVar2.u(z4);
            } else {
                i3 = size;
                gVar2.u(false);
                i12++;
                view = null;
                cVar = this;
                size = i3;
                i4 = 0;
            }
            i12++;
            view = null;
            cVar = this;
            size = i3;
            i4 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void h(boolean z2) {
        super.h(z2);
        ((View) this.f540j).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f534d;
        boolean z3 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i2 = 0; i2 < size; i2++) {
                a0.b bVarA = arrayListS.get(i2).a();
                if (bVarA != null) {
                    bVarA.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f534d;
        ArrayList<androidx.appcompat.view.menu.g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f898o && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z3 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f895l;
        if (z3) {
            if (dVar == null) {
                this.f895l = new d(this.f532b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f895l.getParent();
            if (viewGroup != this.f540j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f895l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f540j;
                actionMenuView.addView(this.f895l, actionMenuView.D());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f540j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f895l);
            }
        }
        ((ActionMenuView) this.f540j).setOverflowReserved(this.f898o);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        f.a aVarB = f.a.b(context);
        if (!this.f899p) {
            this.f898o = aVarB.h();
        }
        if (!this.f905v) {
            this.f900q = aVarB.c();
        }
        if (!this.f903t) {
            this.f902s = aVarB.d();
        }
        int measuredWidth = this.f900q;
        if (this.f898o) {
            if (this.f895l == null) {
                d dVar = new d(this.f532b);
                this.f895l = dVar;
                if (this.f897n) {
                    dVar.setImageDrawable(this.f896m);
                    this.f896m = null;
                    this.f897n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f895l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f895l.getMeasuredWidth();
        } else {
            this.f895l = null;
        }
        this.f901r = measuredWidth;
        this.f907x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f895l) {
            return false;
        }
        return super.l(viewGroup, i2);
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
        androidx.appcompat.view.menu.k kVar = this.f540j;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i2, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean x() {
        return A() | B();
    }

    public Drawable z() {
        d dVar = this.f895l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f897n) {
            return this.f896m;
        }
        return null;
    }
}
