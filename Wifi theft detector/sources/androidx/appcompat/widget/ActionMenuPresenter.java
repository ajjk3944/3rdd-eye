package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements b.a {
    public c A;
    public b B;
    public final f C;
    public int D;

    /* renamed from: k, reason: collision with root package name */
    public d f858k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f859l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f861n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f862o;

    /* renamed from: p, reason: collision with root package name */
    public int f863p;

    /* renamed from: q, reason: collision with root package name */
    public int f864q;

    /* renamed from: r, reason: collision with root package name */
    public int f865r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f866s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f867t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f868u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f869v;

    /* renamed from: w, reason: collision with root package name */
    public int f870w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f871x;

    /* renamed from: y, reason: collision with root package name */
    public e f872y;

    /* renamed from: z, reason: collision with root package name */
    public a f873z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f874a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f874a);
        }

        public SavedState(Parcel parcel) {
            this.f874a = parcel.readInt();
        }
    }

    public class a extends androidx.appcompat.view.menu.g {
        public a(Context context, androidx.appcompat.view.menu.k kVar, View view) {
            super(context, kVar, view, false, c.a.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.f) kVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f858k;
                f(view2 == null ? (View) ActionMenuPresenter.this.f692i : view2);
            }
            j(ActionMenuPresenter.this.C);
        }

        @Override // androidx.appcompat.view.menu.g
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f873z = null;
            actionMenuPresenter.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public i.f a() {
            a aVar = ActionMenuPresenter.this.f873z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e f877a;

        public c(e eVar) {
            this.f877a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f686c != null) {
                ActionMenuPresenter.this.f686c.d();
            }
            View view = (View) ActionMenuPresenter.this.f692i;
            if (view != null && view.getWindowToken() != null && this.f877a.m()) {
                ActionMenuPresenter.this.f872y = this.f877a;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends m0 {

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ ActionMenuPresenter f880j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f880j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.m0
            public i.f b() {
                e eVar = ActionMenuPresenter.this.f872y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.m0
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.m0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, c.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
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
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                k0.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.g {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view, boolean z10) {
            super(context, dVar, view, z10, c.a.actionOverflowMenuStyle);
            h(8388613);
            j(ActionMenuPresenter.this.C);
        }

        @Override // androidx.appcompat.view.menu.g
        public void e() {
            if (ActionMenuPresenter.this.f686c != null) {
                ActionMenuPresenter.this.f686c.close();
            }
            ActionMenuPresenter.this.f872y = null;
            super.e();
        }
    }

    public class f implements h.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
            if (dVar instanceof androidx.appcompat.view.menu.k) {
                dVar.F().e(false);
            }
            h.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                aVarO.b(dVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            if (dVar == ActionMenuPresenter.this.f686c) {
                return false;
            }
            ActionMenuPresenter.this.D = ((androidx.appcompat.view.menu.k) dVar).getItem().getItemId();
            h.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                return aVarO.c(dVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, c.g.abc_action_menu_layout, c.g.abc_action_menu_item_layout);
        this.f871x = new SparseBooleanArray();
        this.C = new f();
    }

    public boolean A() {
        return D() | E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f692i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof i.a) && ((i.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        d dVar = this.f858k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f860m) {
            return this.f859l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.A;
        if (cVar != null && (obj = this.f692i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.f872y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f873z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.A != null || G();
    }

    public boolean G() {
        e eVar = this.f872y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f866s) {
            this.f865r = h.a.b(this.f685b).d();
        }
        androidx.appcompat.view.menu.d dVar = this.f686c;
        if (dVar != null) {
            dVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f869v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f692i = actionMenuView;
        actionMenuView.a(this.f686c);
    }

    public void K(Drawable drawable) {
        d dVar = this.f858k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f860m = true;
            this.f859l = drawable;
        }
    }

    public void L(boolean z10) {
        this.f861n = z10;
        this.f862o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f861n || G() || (dVar = this.f686c) == null || this.f692i == null || this.A != null || dVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f685b, this.f686c, this.f858k, true));
        this.A = cVar;
        ((View) this.f692i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.h
    public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
        A();
        super.b(dVar, z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void e(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f874a) > 0 && (menuItemFindItem = this.f686c.findItem(i10)) != null) {
            f((androidx.appcompat.view.menu.k) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.h
    public boolean f(androidx.appcompat.view.menu.k kVar) {
        boolean z10 = false;
        if (!kVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.k kVar2 = kVar;
        while (kVar2.j0() != this.f686c) {
            kVar2 = (androidx.appcompat.view.menu.k) kVar2.j0();
        }
        View viewB = B(kVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.D = kVar.getItem().getItemId();
        int size = kVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = kVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f685b, kVar, viewB);
        this.f873z = aVar;
        aVar.g(z10);
        this.f873z.k();
        super.f(kVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public Parcelable g() {
        SavedState savedState = new SavedState();
        savedState.f874a = this.D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        super.h(z10);
        ((View) this.f692i).requestLayout();
        androidx.appcompat.view.menu.d dVar = this.f686c;
        boolean z11 = false;
        if (dVar != null) {
            ArrayList arrayListU = dVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarA = ((androidx.appcompat.view.menu.f) arrayListU.get(i10)).a();
                if (bVarA != null) {
                    bVarA.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.d dVar2 = this.f686c;
        ArrayList arrayListB = dVar2 != null ? dVar2.B() : null;
        if (this.f861n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.f) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f858k == null) {
                this.f858k = new d(this.f684a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f858k.getParent();
            if (viewGroup != this.f692i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f858k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f692i;
                actionMenuView.addView(this.f858k, actionMenuView.D());
            }
        } else {
            d dVar3 = this.f858k;
            if (dVar3 != null) {
                Object parent = dVar3.getParent();
                Object obj = this.f692i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f858k);
                }
            }
        }
        ((ActionMenuView) this.f692i).setOverflowReserved(this.f861n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.h
    public boolean i() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iJ;
        boolean z10;
        int i11;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.d dVar = actionMenuPresenter.f686c;
        View view = null;
        ?? r32 = 0;
        if (dVar != null) {
            arrayListG = dVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = actionMenuPresenter.f865r;
        int i13 = actionMenuPresenter.f864q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f692i;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) arrayListG.get(i16);
            if (fVar.o()) {
                i14++;
            } else if (fVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.f869v && fVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (actionMenuPresenter.f861n && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f871x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f867t) {
            int i18 = actionMenuPresenter.f870w;
            iJ = i13 / i18;
            i10 = i18 + ((i13 % i18) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            androidx.appcompat.view.menu.f fVar2 = (androidx.appcompat.view.menu.f) arrayListG.get(i19);
            if (fVar2.o()) {
                View viewP = actionMenuPresenter.p(fVar2, view, viewGroup);
                if (actionMenuPresenter.f867t) {
                    iJ -= ActionMenuView.J(viewP, i10, iJ, iMakeMeasureSpec, r32);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = fVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                fVar2.u(true);
                z10 = r32;
                i11 = size;
            } else if (fVar2.n()) {
                int groupId2 = fVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!actionMenuPresenter.f867t || iJ > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewP2 = actionMenuPresenter.p(fVar2, null, viewGroup);
                    if (actionMenuPresenter.f867t) {
                        int iJ2 = ActionMenuView.J(viewP2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!actionMenuPresenter.f867t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.f fVar3 = (androidx.appcompat.view.menu.f) arrayListG.get(i21);
                        if (fVar3.getGroupId() == groupId2) {
                            if (fVar3.l()) {
                                i17++;
                            }
                            fVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                fVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                fVar2.u(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.h
    public void k(Context context, androidx.appcompat.view.menu.d dVar) {
        super.k(context, dVar);
        Resources resources = context.getResources();
        h.a aVarB = h.a.b(context);
        if (!this.f862o) {
            this.f861n = aVarB.h();
        }
        if (!this.f868u) {
            this.f863p = aVarB.c();
        }
        if (!this.f866s) {
            this.f865r = aVarB.d();
        }
        int measuredWidth = this.f863p;
        if (this.f861n) {
            if (this.f858k == null) {
                d dVar2 = new d(this.f684a);
                this.f858k = dVar2;
                if (this.f860m) {
                    dVar2.setImageDrawable(this.f859l);
                    this.f859l = null;
                    this.f860m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f858k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f858k.getMeasuredWidth();
        } else {
            this.f858k = null;
        }
        this.f864q = measuredWidth;
        this.f870w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void l(androidx.appcompat.view.menu.f fVar, i.a aVar) {
        aVar.c(fVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f692i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f858k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.f fVar, View view, ViewGroup viewGroup) {
        View actionView = fVar.getActionView();
        if (actionView == null || fVar.j()) {
            actionView = super.p(fVar, view, viewGroup);
        }
        actionView.setVisibility(fVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.i q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.i iVar = this.f692i;
        androidx.appcompat.view.menu.i iVarQ = super.q(viewGroup);
        if (iVar != iVarQ) {
            ((ActionMenuView) iVarQ).setPresenter(this);
        }
        return iVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.f fVar) {
        return fVar.l();
    }
}
