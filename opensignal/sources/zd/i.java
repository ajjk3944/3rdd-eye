package zd;

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
import com.google.android.exoplayer2.ui.e0;
import ir.f0;
import java.util.HashSet;
import o.a0;
import o.m;
import o.o;

/* loaded from: classes.dex */
public abstract class i extends ViewGroup implements a0 {

    /* renamed from: v0, reason: collision with root package name */
    public static final int[] f27331v0 = {R.attr.state_checked};

    /* renamed from: w0, reason: collision with root package name */
    public static final int[] f27332w0 = {-16842910};
    public h[] B;
    public int D;
    public int E;
    public ColorStateList F;
    public int G;
    public ColorStateList H;
    public final ColorStateList I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public Drawable O;
    public ColorStateList P;
    public int Q;
    public final SparseArray R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: a, reason: collision with root package name */
    public final t7.a f27333a;

    /* renamed from: a0, reason: collision with root package name */
    public int f27334a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f27335b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f27336c0;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f27337d;

    /* renamed from: d0, reason: collision with root package name */
    public int f27338d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f27339e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f27340f0;

    /* renamed from: g, reason: collision with root package name */
    public t3.d f27341g;

    /* renamed from: g0, reason: collision with root package name */
    public int f27342g0;

    /* renamed from: h0, reason: collision with root package name */
    public ee.l f27343h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f27344i0;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f27345j0;

    /* renamed from: k0, reason: collision with root package name */
    public com.google.android.material.navigation.b f27346k0;

    /* renamed from: l0, reason: collision with root package name */
    public g f27347l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f27348m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f27349n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f27350o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f27351p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f27352q0;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f27353r;

    /* renamed from: r0, reason: collision with root package name */
    public MenuItem f27354r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f27355s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f27356t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Rect f27357u0;

    /* renamed from: x, reason: collision with root package name */
    public int f27358x;

    /* renamed from: y, reason: collision with root package name */
    public int f27359y;

    public i(Context context) {
        super(context);
        this.f27353r = new SparseArray();
        this.D = -1;
        this.E = -1;
        this.R = new SparseArray();
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.f27342g0 = 49;
        this.f27344i0 = false;
        this.f27350o0 = 1;
        this.f27351p0 = 0;
        this.f27354r0 = null;
        this.f27355s0 = 7;
        this.f27356t0 = false;
        this.f27357u0 = new Rect();
        this.I = c();
        if (isInEditMode()) {
            this.f27333a = null;
        } else {
            t7.a aVar = new t7.a();
            this.f27333a = aVar;
            aVar.P(0);
            aVar.n();
            aVar.E(f0.U(getContext(), ed.b.motionDurationMedium4, getResources().getInteger(ed.g.material_motion_duration_long_1)));
            aVar.G(f0.V(getContext(), ed.b.motionEasingStandard, fd.a.f8823b));
            aVar.M(new xd.i());
        }
        this.f27337d = new e0(7, (kd.b) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f27355s0, this.f27347l0.f27330e);
    }

    private e getNewItem() {
        t3.d dVar = this.f27341g;
        e eVar = dVar != null ? (e) dVar.a() : null;
        return eVar == null ? new kd.a(getContext()) : eVar;
    }

    private void setBadgeIfNeeded(e eVar) {
        hd.a aVar;
        int id2 = eVar.getId();
        if (id2 == -1 || (aVar = (hd.a) this.R.get(id2)) == null) {
            return;
        }
        eVar.setBadge(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        e eVarE;
        removeAllViews();
        h[] hVarArr = this.B;
        if (hVarArr != null && this.f27341g != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    this.f27341g.c(eVar);
                    ImageView imageView = eVar.P;
                    if (eVar.f27319w0 != null) {
                        if (imageView != null) {
                            eVar.setClipChildren(true);
                            eVar.setClipToPadding(true);
                            hd.a aVar = eVar.f27319w0;
                            if (aVar != null) {
                                if (aVar.e() != null) {
                                    aVar.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        eVar.f27319w0 = null;
                    }
                    eVar.f27303h0 = null;
                    eVar.f27309n0 = 0.0f;
                    eVar.f27293a = false;
                }
            }
        }
        this.f27346k0.f5673d = true;
        this.f27347l0.b();
        this.f27346k0.f5673d = false;
        int i10 = this.f27347l0.f27328c;
        if (i10 == 0) {
            this.D = 0;
            this.E = 0;
            this.B = null;
            this.f27341g = null;
            return;
        }
        if (this.f27341g == null || this.f27351p0 != i10) {
            this.f27351p0 = i10;
            this.f27341g = new t3.d(i10);
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.f27347l0.f27327b.size(); i11++) {
            hashSet.add(Integer.valueOf(this.f27347l0.a(i11).getItemId()));
        }
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.R;
            if (i12 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i12++;
        }
        int size = this.f27347l0.f27327b.size();
        this.B = new h[size];
        int i13 = this.f27358x;
        boolean z10 = i13 != -1 ? i13 == 0 : getCurrentVisibleContentItemCount() > 3;
        int size2 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem menuItemA = this.f27347l0.a(i15);
            boolean z11 = menuItemA instanceof a;
            if (z11) {
                Context context = getContext();
                b bVar = new b(context);
                LayoutInflater.from(context).inflate(ed.h.m3_navigation_menu_divider, (ViewGroup) bVar, true);
                bVar.b();
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f27356t0);
                eVarE = bVar;
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                j jVar = new j(getContext());
                int i16 = this.M;
                if (i16 == 0) {
                    i16 = this.K;
                }
                jVar.setTextAppearance(i16);
                jVar.setTextColor(this.H);
                jVar.setOnlyShowWhenExpanded(true);
                jVar.a((o) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                eVarE = jVar;
            } else if (size2 > 0) {
                size2--;
                eVarE = e(i15, (o) menuItemA, z10, true);
            } else {
                o oVar = (o) menuItemA;
                boolean z12 = i14 >= this.f27355s0;
                i14++;
                eVarE = e(i15, oVar, z10, z12);
            }
            if (!z11 && menuItemA.isCheckable() && this.E == -1) {
                this.E = i15;
            }
            this.B[i15] = eVarE;
            addView(eVarE);
        }
        int iMin = Math.min(size - 1, this.E);
        this.E = iMin;
        setCheckedItem(this.B[iMin].getItemData());
    }

    @Override // o.a0
    public final void b(m mVar) {
        this.f27347l0 = new g(mVar);
    }

    public final ColorStateList c() throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = h3.c.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(h.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = f27331v0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f27332w0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListC.getColorForState(iArr3, defaultColor), i10, defaultColor});
    }

    public final ee.i d() {
        if (this.f27343h0 == null || this.f27345j0 == null) {
            return null;
        }
        ee.i iVar = new ee.i(this.f27343h0);
        iVar.q(this.f27345j0);
        return iVar;
    }

    public final e e(int i10, o oVar, boolean z10, boolean z11) throws Resources.NotFoundException {
        this.f27346k0.f5673d = true;
        oVar.setCheckable(true);
        this.f27346k0.f5673d = false;
        e newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.f27350o0);
        newItem.setIconTintList(this.F);
        newItem.setIconSize(this.G);
        newItem.setTextColor(this.I);
        newItem.setTextAppearanceInactive(this.J);
        newItem.setTextAppearanceActive(this.K);
        newItem.setHorizontalTextAppearanceInactive(this.L);
        newItem.setHorizontalTextAppearanceActive(this.M);
        newItem.setTextAppearanceActiveBoldEnabled(this.N);
        newItem.setTextColor(this.H);
        int i11 = this.S;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.T;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f27348m0);
        newItem.setLabelFontScalingEnabled(this.f27349n0);
        int i13 = this.U;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.V;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.f27334a0);
        newItem.setActiveIndicatorHeight(this.f27335b0);
        newItem.setActiveIndicatorExpandedWidth(this.f27336c0);
        newItem.setActiveIndicatorExpandedHeight(this.f27338d0);
        newItem.setActiveIndicatorMarginHorizontal(this.f27339e0);
        newItem.setItemGravity(this.f27342g0);
        newItem.setActiveIndicatorExpandedPadding(this.f27357u0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f27340f0);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.f27344i0);
        newItem.setActiveIndicatorEnabled(this.W);
        Drawable drawable = this.O;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.Q);
        }
        newItem.setItemRippleColor(this.P);
        newItem.setLabelVisibilityMode(this.f27358x);
        newItem.setItemIconGravity(this.f27359y);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.f27352q0);
        newItem.a(oVar);
        newItem.setItemPosition(i10);
        int i15 = oVar.f18638a;
        newItem.setOnTouchListener((View.OnTouchListener) this.f27353r.get(i15));
        newItem.setOnClickListener(this.f27337d);
        int i16 = this.D;
        if (i16 != 0 && i15 == i16) {
            this.E = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.U;
    }

    public SparseArray<hd.a> getBadgeDrawables() {
        return this.R;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f27352q0 ? this.f27347l0.f27329d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.M;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.L;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.V;
    }

    public ColorStateList getIconTintList() {
        return this.F;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f27345j0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.W;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f27338d0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f27340f0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f27336c0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f27335b0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f27339e0;
    }

    public ee.l getItemActiveIndicatorShapeAppearance() {
        return this.f27343h0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f27334a0;
    }

    public Drawable getItemBackground() {
        h[] hVarArr = this.B;
        if (hVarArr != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    return ((e) hVar).getBackground();
                }
            }
        }
        return this.O;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.Q;
    }

    public int getItemGravity() {
        return this.f27342g0;
    }

    public int getItemIconGravity() {
        return this.f27359y;
    }

    public int getItemIconSize() {
        return this.G;
    }

    public int getItemPaddingBottom() {
        return this.T;
    }

    public int getItemPaddingTop() {
        return this.S;
    }

    public ColorStateList getItemRippleColor() {
        return this.P;
    }

    public int getItemTextAppearanceActive() {
        return this.K;
    }

    public int getItemTextAppearanceInactive() {
        return this.J;
    }

    public ColorStateList getItemTextColor() {
        return this.H;
    }

    public int getLabelMaxLines() {
        return this.f27350o0;
    }

    public int getLabelVisibilityMode() {
        return this.f27358x;
    }

    public g getMenu() {
        return this.f27347l0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f27349n0;
    }

    public int getSelectedItemId() {
        return this.D;
    }

    public int getSelectedItemPosition() {
        return this.E;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a2.a.a(1, getCurrentVisibleContentItemCount(), 1).f28a);
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.U = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f27354r0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f27354r0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f27354r0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f27354r0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.f27355s0 = i10;
    }

    public void setExpanded(boolean z10) {
        this.f27352q0 = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.M = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.L = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.V = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f27345j0 = colorStateList;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.W = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f27338d0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f27340f0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f27336c0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f27335b0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f27339e0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f27344i0 = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ee.l lVar) {
        this.f27343h0 = lVar;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f27334a0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.O = drawable;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.Q = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.f27342g0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f27359y = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.G = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.T = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingBottom(this.T);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.S = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.K = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        this.N = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.J = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) throws Resources.NotFoundException {
        this.f27349n0 = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.f27350o0 = i10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f27358x = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.f27348m0 = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(com.google.android.material.navigation.b bVar) {
        this.f27346k0 = bVar;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f27356t0 == z10) {
            return;
        }
        this.f27356t0 = z10;
        h[] hVarArr = this.B;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof b) {
                    ((b) hVar).setDividersEnabled(z10);
                }
            }
        }
    }
}
