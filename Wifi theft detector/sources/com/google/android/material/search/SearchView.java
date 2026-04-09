package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, b5.b {
    public static final int E = j4.k.Widget_Material3_SearchView;
    public boolean A;
    public boolean B;
    public TransitionState C;
    public Map D;

    /* renamed from: a, reason: collision with root package name */
    public final View f10831a;

    /* renamed from: b, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f10832b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10833c;

    /* renamed from: d, reason: collision with root package name */
    public final View f10834d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f10835e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f10836f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialToolbar f10837g;

    /* renamed from: h, reason: collision with root package name */
    public final Toolbar f10838h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10839i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f10840j;

    /* renamed from: k, reason: collision with root package name */
    public final EditText f10841k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageButton f10842l;

    /* renamed from: m, reason: collision with root package name */
    public final View f10843m;

    /* renamed from: n, reason: collision with root package name */
    public final TouchObserverFrameLayout f10844n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10845o;

    /* renamed from: p, reason: collision with root package name */
    public final c0 f10846p;

    /* renamed from: q, reason: collision with root package name */
    public final b5.c f10847q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10848r;

    /* renamed from: s, reason: collision with root package name */
    public final x4.a f10849s;

    /* renamed from: t, reason: collision with root package name */
    public final Set f10850t;

    /* renamed from: u, reason: collision with root package name */
    public SearchBar f10851u;

    /* renamed from: v, reason: collision with root package name */
    public int f10852v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10853w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10854x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10855y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10856z;

    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.x() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public String f10857c;

        /* renamed from: d, reason: collision with root package name */
        public int f10858d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10857c);
            parcel.writeInt(this.f10858d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10857c = parcel.readString();
            this.f10858d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.f10842l.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ WindowInsetsCompat f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, View view, WindowInsetsCompat windowInsetsCompat) {
        j0.b bVarF = windowInsetsCompat.f(WindowInsetsCompat.Type.e() | WindowInsetsCompat.Type.a());
        marginLayoutParams.leftMargin = i10 + bVarF.f21686a;
        marginLayoutParams.rightMargin = i11 + bVarF.f21688c;
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean g(SearchView searchView, View view, MotionEvent motionEvent) {
        if (!searchView.s()) {
            return false;
        }
        searchView.p();
        return false;
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f10851u;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(j4.d.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ void h(SearchView searchView) {
        searchView.f10841k.clearFocus();
        d0.k(searchView.f10841k, searchView.A);
    }

    public static /* synthetic */ void i(SearchView searchView) {
        if (searchView.f10841k.requestFocus()) {
            searchView.f10841k.sendAccessibilityEvent(8);
        }
        d0.p(searchView.f10841k, searchView.A);
    }

    public static /* synthetic */ void j(SearchView searchView, View view) {
        searchView.q();
        searchView.z();
    }

    public static /* synthetic */ WindowInsetsCompat k(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
        boolean zL = d0.l(searchView.f10837g);
        int i10 = zL ? eVar.f10696c : eVar.f10694a;
        int i11 = zL ? eVar.f10694a : eVar.f10696c;
        j0.b bVarF = windowInsetsCompat.f(WindowInsetsCompat.Type.e() | WindowInsetsCompat.Type.a());
        searchView.f10837g.setPadding(i10 + bVarF.f21686a, eVar.f10695b, i11 + bVarF.f21688c, eVar.f10697d);
        return windowInsetsCompat;
    }

    public static /* synthetic */ WindowInsetsCompat l(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int i10 = windowInsetsCompat.f(WindowInsetsCompat.Type.e() | WindowInsetsCompat.Type.a()).f21687b;
        searchView.setUpStatusBarSpacer(i10);
        if (!searchView.B) {
            searchView.setStatusBarSpacerEnabledInternal(i10 > 0);
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean m(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f10834d.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        x4.a aVar = this.f10849s;
        if (aVar == null || this.f10833c == null) {
            return;
        }
        this.f10833c.setBackgroundColor(aVar.c(this.f10856z, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            o(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f10835e, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int i10) {
        if (this.f10834d.getLayoutParams().height != i10) {
            this.f10834d.getLayoutParams().height = i10;
            this.f10834d.requestLayout();
        }
    }

    public final void A(TransitionState transitionState, boolean z10) {
        if (this.C.equals(transitionState)) {
            return;
        }
        if (z10) {
            O(transitionState);
        }
        this.C = transitionState;
        Iterator it = new LinkedHashSet(this.f10850t).iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.z.a(it.next());
            throw null;
        }
        N(transitionState);
        SearchBar searchBar = this.f10851u;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public final void B(boolean z10, boolean z11) {
        if (z11) {
            this.f10837g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f10837g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10908a.r();
            }
        });
        if (z10) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.c(u4.a.d(this, j4.b.colorOnSurface));
            this.f10837g.setNavigationIcon(drawerArrowDrawable);
        }
    }

    public final void C() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public final void D() {
        this.f10842l.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.j(this.f10896a, view);
            }
        });
        this.f10841k.addTextChangedListener(new a());
    }

    public final void E() {
        this.f10844n.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.g(this.f10907a, view, motionEvent);
            }
        });
    }

    public final void F() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10843m.getLayoutParams();
        final int i10 = marginLayoutParams.leftMargin;
        final int i11 = marginLayoutParams.rightMargin;
        ViewCompat.t0(this.f10843m, new g0() { // from class: com.google.android.material.search.i
            @Override // androidx.core.view.g0
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.f(marginLayoutParams, i10, i11, view, windowInsetsCompat);
            }
        });
    }

    public final void G(int i10, String str, String str2) {
        if (i10 != -1) {
            TextViewCompat.m(this.f10841k, i10);
        }
        this.f10841k.setText(str);
        this.f10841k.setHint(str2);
    }

    public final void H() {
        K();
        F();
        J();
    }

    public final void I() {
        this.f10832b.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m(view, motionEvent);
            }
        });
    }

    public final void J() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.t0(this.f10834d, new g0() { // from class: com.google.android.material.search.k
            @Override // androidx.core.view.g0
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.l(this.f10904a, view, windowInsetsCompat);
            }
        });
    }

    public final void K() {
        d0.f(this.f10837g, new d0.d() { // from class: com.google.android.material.search.j
            @Override // com.google.android.material.internal.d0.d
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
                return SearchView.k(this.f10903a, view, windowInsetsCompat, eVar);
            }
        });
    }

    public void L() {
        if (this.C.equals(TransitionState.SHOWN) || this.C.equals(TransitionState.SHOWING)) {
            return;
        }
        this.f10846p.i0();
    }

    public final void M(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f10832b.getId()) != null) {
                    M((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.D.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map map = this.D;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.D.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void N(TransitionState transitionState) {
        if (this.f10851u == null || !this.f10848r) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.f10847q.c();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.f10847q.f();
        }
    }

    public final void O(TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    public final void P() {
        MaterialToolbar materialToolbar = this.f10837g;
        if (materialToolbar == null || w(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f10851u == null) {
            this.f10837g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableR = k0.a.r(d.a.b(getContext(), defaultNavigationIconResource).mutate());
        if (this.f10837g.getNavigationIconTint() != null) {
            drawableR.setTint(this.f10837g.getNavigationIconTint().intValue());
        }
        k0.a.m(drawableR, getLayoutDirection());
        this.f10837g.setNavigationIcon(new com.google.android.material.internal.f(this.f10851u.getNavigationIcon(), drawableR));
        Q();
    }

    public final void Q() {
        ImageButton imageButtonD = com.google.android.material.internal.b0.d(this.f10837g);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f10832b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = k0.a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawableQ).e(i10);
        }
        if (drawableQ instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawableQ).a(i10);
        }
    }

    public void R() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f10852v = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // b5.b
    public void a() {
        if (u() || this.f10851u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f10846p.w();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10845o) {
            this.f10844n.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // b5.b
    public void b(BackEventCompat backEventCompat) {
        SearchBar searchBar;
        if (u() || (searchBar = this.f10851u) == null) {
            return;
        }
        if (searchBar != null) {
            searchBar.setPlaceholderText(this.f10841k.getText().toString());
        }
        this.f10846p.j0(backEventCompat);
    }

    @Override // b5.b
    public void c(BackEventCompat backEventCompat) {
        if (u() || this.f10851u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f10846p.o0(backEventCompat);
    }

    @Override // b5.b
    public void d() {
        if (u()) {
            return;
        }
        BackEventCompat backEventCompatB0 = this.f10846p.b0();
        if (Build.VERSION.SDK_INT < 34 || this.f10851u == null || backEventCompatB0 == null) {
            r();
        } else {
            this.f10846p.x();
        }
    }

    @VisibleForTesting
    public b5.i getBackHelper() {
        return this.f10846p.z();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.C;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return j4.e.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.f10841k;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f10841k.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f10839i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f10839i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f10852v;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f10841k.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f10837g;
    }

    public void o(View view) {
        this.f10835e.addView(view);
        this.f10835e.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5.h.e(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        O(currentTransitionState);
        N(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.f10847q.f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        R();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setText(savedState.f10857c);
        setVisible(savedState.f10858d == 0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f10857c = text == null ? null : text.toString();
        savedState.f10858d = this.f10832b.getVisibility();
        return savedState;
    }

    public void p() {
        this.f10841k.post(new Runnable() { // from class: com.google.android.material.search.g
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.h(this.f10898a);
            }
        });
    }

    public void q() {
        this.f10841k.setText("");
    }

    public void r() {
        if (this.C.equals(TransitionState.HIDDEN) || this.C.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.f10851u;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.f10846p.Y();
            return;
        }
        this.f10851u.setPlaceholderText(this.f10841k.getText().toString());
        SearchBar searchBar2 = this.f10851u;
        final c0 c0Var = this.f10846p;
        Objects.requireNonNull(c0Var);
        searchBar2.post(new Runnable() { // from class: com.google.android.material.search.h
            @Override // java.lang.Runnable
            public final void run() {
                c0Var.Y();
            }
        });
    }

    public boolean s() {
        return this.f10852v == 48;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f10853w = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f10855y = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f10841k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f10854x = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.D = new HashMap(viewGroup.getChildCount());
        }
        M(viewGroup, z10);
        if (z10) {
            return;
        }
        this.D = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.h hVar) {
        this.f10837g.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        this.f10839i.setText(charSequence);
        this.f10839i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.B = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f10841k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f10837g.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        A(transitionState, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.A = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f10832b.getVisibility() == 0;
        this.f10832b.setVisibility(z10 ? 0 : 8);
        Q();
        A(z10 ? TransitionState.SHOWN : TransitionState.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f10851u = searchBar;
        this.f10846p.g0(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10905a.L();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10906a.L();
                        }
                    });
                    this.f10841k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        P();
        C();
        N(getCurrentTransitionState());
    }

    public boolean t() {
        return this.f10853w;
    }

    public final boolean u() {
        return this.C.equals(TransitionState.HIDDEN) || this.C.equals(TransitionState.HIDING);
    }

    public boolean v() {
        return this.f10854x;
    }

    public final boolean w(Toolbar toolbar) {
        return k0.a.q(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    public boolean x() {
        return this.f10851u != null;
    }

    public void y() {
        this.f10841k.postDelayed(new Runnable() { // from class: com.google.android.material.search.f
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.i(this.f10897a);
            }
        }, 100L);
    }

    public void z() {
        if (this.f10855y) {
            y();
        }
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i10) {
        this.f10841k.setHint(i10);
    }

    public void setText(@StringRes int i10) {
        this.f10841k.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = E;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10847q = new b5.c(this);
        this.f10850t = new LinkedHashSet();
        this.f10852v = 16;
        this.C = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, j4.l.SearchView, i10, i11, new int[0]);
        this.f10856z = typedArrayI.getColor(j4.l.SearchView_backgroundTint, 0);
        int resourceId = typedArrayI.getResourceId(j4.l.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayI.getResourceId(j4.l.SearchView_android_textAppearance, -1);
        String string = typedArrayI.getString(j4.l.SearchView_android_text);
        String string2 = typedArrayI.getString(j4.l.SearchView_android_hint);
        String string3 = typedArrayI.getString(j4.l.SearchView_searchPrefixText);
        boolean z10 = typedArrayI.getBoolean(j4.l.SearchView_useDrawerArrowDrawable, false);
        this.f10853w = typedArrayI.getBoolean(j4.l.SearchView_animateNavigationIcon, true);
        this.f10854x = typedArrayI.getBoolean(j4.l.SearchView_animateMenuItems, true);
        boolean z11 = typedArrayI.getBoolean(j4.l.SearchView_hideNavigationIcon, false);
        this.f10855y = typedArrayI.getBoolean(j4.l.SearchView_autoShowKeyboard, true);
        this.f10848r = typedArrayI.getBoolean(j4.l.SearchView_backHandlingEnabled, true);
        typedArrayI.recycle();
        LayoutInflater.from(context2).inflate(j4.h.mtrl_search_view, this);
        this.f10845o = true;
        this.f10831a = findViewById(j4.f.open_search_view_scrim);
        this.f10832b = (ClippableRoundedCornerLayout) findViewById(j4.f.open_search_view_root);
        this.f10833c = findViewById(j4.f.open_search_view_background);
        this.f10834d = findViewById(j4.f.open_search_view_status_bar_spacer);
        this.f10835e = (FrameLayout) findViewById(j4.f.open_search_view_header_container);
        this.f10836f = (FrameLayout) findViewById(j4.f.open_search_view_toolbar_container);
        this.f10837g = (MaterialToolbar) findViewById(j4.f.open_search_view_toolbar);
        this.f10838h = (Toolbar) findViewById(j4.f.open_search_view_dummy_toolbar);
        this.f10839i = (TextView) findViewById(j4.f.open_search_view_search_prefix);
        this.f10840j = (LinearLayout) findViewById(j4.f.open_search_view_text_container);
        this.f10841k = (EditText) findViewById(j4.f.open_search_view_edit_text);
        this.f10842l = (ImageButton) findViewById(j4.f.open_search_view_clear_button);
        this.f10843m = findViewById(j4.f.open_search_view_divider);
        this.f10844n = (TouchObserverFrameLayout) findViewById(j4.f.open_search_view_content_container);
        this.f10846p = new c0(this);
        this.f10849s = new x4.a(context2);
        I();
        C();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        G(resourceId2, string, string2);
        B(z10, z11);
        D();
        E();
        H();
    }
}
