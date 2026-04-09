package A3;

import L0.C0156a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import e3.AbstractC2303a;
import g3.C2332a;
import j3.C2561a;
import j3.C2562b;
import java.util.HashSet;
import n.MenuC2677k;

/* loaded from: classes.dex */
public abstract class p extends ViewGroup implements n.y {

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f444n0 = {R.attr.state_checked};

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f445o0 = {-16842910};

    /* renamed from: C, reason: collision with root package name */
    public int f446C;

    /* renamed from: D, reason: collision with root package name */
    public int f447D;

    /* renamed from: E, reason: collision with root package name */
    public int f448E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f449F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f450G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f451H;

    /* renamed from: I, reason: collision with root package name */
    public int f452I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseArray f453J;

    /* renamed from: K, reason: collision with root package name */
    public int f454K;

    /* renamed from: L, reason: collision with root package name */
    public int f455L;
    public int M;

    /* renamed from: N, reason: collision with root package name */
    public int f456N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f457O;

    /* renamed from: P, reason: collision with root package name */
    public int f458P;

    /* renamed from: Q, reason: collision with root package name */
    public int f459Q;

    /* renamed from: R, reason: collision with root package name */
    public int f460R;

    /* renamed from: S, reason: collision with root package name */
    public int f461S;

    /* renamed from: T, reason: collision with root package name */
    public int f462T;

    /* renamed from: U, reason: collision with root package name */
    public int f463U;

    /* renamed from: V, reason: collision with root package name */
    public int f464V;

    /* renamed from: W, reason: collision with root package name */
    public G3.o f465W;

    /* renamed from: a, reason: collision with root package name */
    public final C0156a f466a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f467a0;

    /* renamed from: b, reason: collision with root package name */
    public final o f468b;
    public ColorStateList b0;

    /* renamed from: c, reason: collision with root package name */
    public Q.d f469c;

    /* renamed from: c0, reason: collision with root package name */
    public s f470c0;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f471d;

    /* renamed from: d0, reason: collision with root package name */
    public m f472d0;

    /* renamed from: e, reason: collision with root package name */
    public int f473e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f474e0;

    /* renamed from: f, reason: collision with root package name */
    public int f475f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f476f0;

    /* renamed from: g, reason: collision with root package name */
    public n[] f477g;

    /* renamed from: g0, reason: collision with root package name */
    public int f478g0;

    /* renamed from: h, reason: collision with root package name */
    public int f479h;

    /* renamed from: h0, reason: collision with root package name */
    public int f480h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f481i0;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f482j;

    /* renamed from: j0, reason: collision with root package name */
    public MenuItem f483j0;

    /* renamed from: k, reason: collision with root package name */
    public int f484k;

    /* renamed from: k0, reason: collision with root package name */
    public int f485k0;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f486l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f487l0;

    /* renamed from: m, reason: collision with root package name */
    public final ColorStateList f488m;

    /* renamed from: m0, reason: collision with root package name */
    public final Rect f489m0;

    /* renamed from: n, reason: collision with root package name */
    public int f490n;

    public p(Context context) {
        super(context);
        this.f471d = new SparseArray();
        this.f479h = -1;
        this.i = -1;
        this.f453J = new SparseArray();
        this.f454K = -1;
        this.f455L = -1;
        this.M = -1;
        this.f456N = -1;
        this.f464V = 49;
        this.f467a0 = false;
        this.f478g0 = 1;
        this.f480h0 = 0;
        this.f483j0 = null;
        this.f485k0 = 7;
        this.f487l0 = false;
        this.f489m0 = new Rect();
        this.f488m = c();
        if (isInEditMode()) {
            this.f466a = null;
        } else {
            C0156a c0156a = new C0156a();
            this.f466a = c0156a;
            c0156a.M(0);
            c0156a.n();
            c0156a.B(com.bumptech.glide.d.O(getContext(), com.apm.insight.R.attr.motionDurationMedium4, getResources().getInteger(com.apm.insight.R.integer.material_motion_duration_long_1)));
            c0156a.D(com.bumptech.glide.d.P(getContext(), com.apm.insight.R.attr.motionEasingStandard, AbstractC2303a.f19928b));
            c0156a.J(new x3.z());
        }
        this.f468b = new o(0, (C2562b) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f485k0, this.f472d0.f441e);
    }

    private k getNewItem() {
        Q.d dVar = this.f469c;
        k kVar = dVar != null ? (k) dVar.h() : null;
        return kVar == null ? new C2561a(getContext()) : kVar;
    }

    private void setBadgeIfNeeded(k kVar) {
        C2332a c2332a;
        int id = kVar.getId();
        if (id == -1 || (c2332a = (C2332a) this.f453J.get(id)) == null) {
            return;
        }
        kVar.setBadge(c2332a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        k kVarE;
        removeAllViews();
        n[] nVarArr = this.f477g;
        if (nVarArr != null && this.f469c != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    k kVar = (k) nVar;
                    this.f469c.d(kVar);
                    ImageView imageView = kVar.f386H;
                    if (kVar.f427o0 != null) {
                        if (imageView != null) {
                            kVar.setClipChildren(true);
                            kVar.setClipToPadding(true);
                            C2332a c2332a = kVar.f427o0;
                            if (c2332a != null) {
                                if (c2332a.e() != null) {
                                    c2332a.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c2332a);
                                }
                            }
                        }
                        kVar.f427o0 = null;
                    }
                    kVar.f400W = null;
                    kVar.f411f0 = 0.0f;
                    kVar.f401a = false;
                }
            }
        }
        this.f470c0.f495b = true;
        this.f472d0.b();
        this.f470c0.f495b = false;
        int i = this.f472d0.f439c;
        if (i == 0) {
            this.f479h = 0;
            this.i = 0;
            this.f477g = null;
            this.f469c = null;
            return;
        }
        if (this.f469c == null || this.f480h0 != i) {
            this.f480h0 = i;
            this.f469c = new Q.d(i);
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < this.f472d0.f438b.size(); i3++) {
            hashSet.add(Integer.valueOf(this.f472d0.a(i3).getItemId()));
        }
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f453J;
            if (i6 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i6);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i6++;
        }
        int size = this.f472d0.f438b.size();
        this.f477g = new n[size];
        int i7 = this.f473e;
        boolean z6 = i7 != -1 ? i7 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem menuItemA = this.f472d0.a(i9);
            boolean z7 = menuItemA instanceof MenuItemC0132a;
            if (z7) {
                Context context = getContext();
                C0136e c0136e = new C0136e(context);
                LayoutInflater.from(context).inflate(com.apm.insight.R.layout.m3_navigation_menu_divider, (ViewGroup) c0136e, true);
                c0136e.b();
                c0136e.setOnlyShowWhenExpanded(true);
                c0136e.setDividersEnabled(this.f487l0);
                kVarE = c0136e;
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                t tVar = new t(getContext());
                int i10 = this.f448E;
                if (i10 == 0) {
                    i10 = this.f446C;
                }
                tVar.setTextAppearance(i10);
                tVar.setTextColor(this.f486l);
                tVar.setOnlyShowWhenExpanded(true);
                tVar.a((n.m) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                kVarE = tVar;
            } else if (size2 > 0) {
                size2--;
                kVarE = e(i9, (n.m) menuItemA, z6, true);
            } else {
                n.m mVar = (n.m) menuItemA;
                boolean z8 = i8 >= this.f485k0;
                i8++;
                kVarE = e(i9, mVar, z6, z8);
            }
            if (!z7 && menuItemA.isCheckable() && this.i == -1) {
                this.i = i9;
            }
            this.f477g[i9] = kVarE;
            addView(kVarE);
        }
        int iMin = Math.min(size - 1, this.i);
        this.i = iMin;
        setCheckedItem(this.f477g[iMin].getItemData());
    }

    @Override // n.y
    public final void b(MenuC2677k menuC2677k) {
        this.f472d0 = new m(menuC2677k);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = G.c.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.apm.insight.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f445o0;
        return new ColorStateList(new int[][]{iArr, f444n0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListB.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final G3.j d() {
        if (this.f465W == null || this.b0 == null) {
            return null;
        }
        G3.j jVar = new G3.j(this.f465W);
        jVar.q(this.b0);
        return jVar;
    }

    public final k e(int i, n.m mVar, boolean z6, boolean z7) throws Resources.NotFoundException {
        this.f470c0.f495b = true;
        mVar.setCheckable(true);
        this.f470c0.f495b = false;
        k newItem = getNewItem();
        newItem.setShifting(z6);
        newItem.setLabelMaxLines(this.f478g0);
        newItem.setIconTintList(this.f482j);
        newItem.setIconSize(this.f484k);
        newItem.setTextColor(this.f488m);
        newItem.setTextAppearanceInactive(this.f490n);
        newItem.setTextAppearanceActive(this.f446C);
        newItem.setHorizontalTextAppearanceInactive(this.f447D);
        newItem.setHorizontalTextAppearanceActive(this.f448E);
        newItem.setTextAppearanceActiveBoldEnabled(this.f449F);
        newItem.setTextColor(this.f486l);
        int i3 = this.f454K;
        if (i3 != -1) {
            newItem.setItemPaddingTop(i3);
        }
        int i6 = this.f455L;
        if (i6 != -1) {
            newItem.setItemPaddingBottom(i6);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f474e0);
        newItem.setLabelFontScalingEnabled(this.f476f0);
        int i7 = this.M;
        if (i7 != -1) {
            newItem.setActiveIndicatorLabelPadding(i7);
        }
        int i8 = this.f456N;
        if (i8 != -1) {
            newItem.setIconLabelHorizontalSpacing(i8);
        }
        newItem.setActiveIndicatorWidth(this.f458P);
        newItem.setActiveIndicatorHeight(this.f459Q);
        newItem.setActiveIndicatorExpandedWidth(this.f460R);
        newItem.setActiveIndicatorExpandedHeight(this.f461S);
        newItem.setActiveIndicatorMarginHorizontal(this.f462T);
        newItem.setItemGravity(this.f464V);
        newItem.setActiveIndicatorExpandedPadding(this.f489m0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f463U);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.f467a0);
        newItem.setActiveIndicatorEnabled(this.f457O);
        Drawable drawable = this.f450G;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f452I);
        }
        newItem.setItemRippleColor(this.f451H);
        newItem.setLabelVisibilityMode(this.f473e);
        newItem.setItemIconGravity(this.f475f);
        newItem.setOnlyShowWhenExpanded(z7);
        newItem.setExpanded(this.f481i0);
        newItem.a(mVar);
        newItem.setItemPosition(i);
        int i9 = mVar.f22106a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f471d.get(i9));
        newItem.setOnClickListener(this.f468b);
        int i10 = this.f479h;
        if (i10 != 0 && i9 == i10) {
            this.i = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.M;
    }

    public SparseArray<C2332a> getBadgeDrawables() {
        return this.f453J;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f481i0 ? this.f472d0.f440d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f448E;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f447D;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f456N;
    }

    public ColorStateList getIconTintList() {
        return this.f482j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.b0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f457O;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f461S;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f463U;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f460R;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f459Q;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f462T;
    }

    public G3.o getItemActiveIndicatorShapeAppearance() {
        return this.f465W;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f458P;
    }

    public Drawable getItemBackground() {
        n[] nVarArr = this.f477g;
        if (nVarArr != null && nVarArr.length > 0) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    return ((k) nVar).getBackground();
                }
            }
        }
        return this.f450G;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f452I;
    }

    public int getItemGravity() {
        return this.f464V;
    }

    public int getItemIconGravity() {
        return this.f475f;
    }

    public int getItemIconSize() {
        return this.f484k;
    }

    public int getItemPaddingBottom() {
        return this.f455L;
    }

    public int getItemPaddingTop() {
        return this.f454K;
    }

    public ColorStateList getItemRippleColor() {
        return this.f451H;
    }

    public int getItemTextAppearanceActive() {
        return this.f446C;
    }

    public int getItemTextAppearanceInactive() {
        return this.f490n;
    }

    public ColorStateList getItemTextColor() {
        return this.f486l;
    }

    public int getLabelMaxLines() {
        return this.f478g0;
    }

    public int getLabelVisibilityMode() {
        return this.f473e;
    }

    public m getMenu() {
        return this.f472d0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f476f0;
    }

    public int getSelectedItemId() {
        return this.f479h;
    }

    public int getSelectedItemPosition() {
        return this.i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) U0.j.q(1, getCurrentVisibleContentItemCount(), 1, false).f3677b);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.M = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f483j0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f483j0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f483j0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f483j0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.f485k0 = i;
    }

    public void setExpanded(boolean z6) {
        this.f481i0 = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.setExpanded(z6);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f448E = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f447D = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f456N = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f482j = colorStateList;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.b0 = colorStateList;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z6) {
        this.f457O = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorEnabled(z6);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f461S = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f463U = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f460R = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f459Q = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f462T = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z6) {
        this.f467a0 = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorResizeable(z6);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(G3.o oVar) {
        this.f465W = oVar;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f458P = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f450G = drawable;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f452I = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.f464V = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f475f = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f484k = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f455L = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemPaddingBottom(this.f455L);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f454K = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f451H = colorStateList;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f446C = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) throws Resources.NotFoundException {
        this.f449F = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setTextAppearanceActiveBoldEnabled(z6);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f490n = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f486l = colorStateList;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z6) throws Resources.NotFoundException {
        this.f476f0 = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setLabelFontScalingEnabled(z6);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.f478g0 = i;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f473e = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z6) {
        this.f474e0 = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof k) {
                    ((k) nVar).setMeasureBottomPaddingFromLabelBaseline(z6);
                }
            }
        }
    }

    public void setPresenter(s sVar) {
        this.f470c0 = sVar;
    }

    public void setSubmenuDividersEnabled(boolean z6) {
        if (this.f487l0 == z6) {
            return;
        }
        this.f487l0 = z6;
        n[] nVarArr = this.f477g;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                if (nVar instanceof C0136e) {
                    ((C0136e) nVar).setDividersEnabled(z6);
                }
            }
        }
    }
}
