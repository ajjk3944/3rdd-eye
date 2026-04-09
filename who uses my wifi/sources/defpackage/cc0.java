package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cc0<S> extends rk0 {
    public int a0;
    public vc b0;
    public we0 c0;
    public int d0;
    public vq2 e0;
    public RecyclerView f0;
    public RecyclerView g0;
    public View h0;
    public View i0;
    public View j0;
    public View k0;
    public MaterialButton l0;
    public AccessibilityManager m0;

    public final void N(we0 we0Var) {
        c cVar = (c) this.g0.getAdapter();
        int iD = cVar.i.f.d(we0Var);
        AccessibilityManager accessibilityManager = this.m0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - cVar.i.f.d(this.c0);
            boolean z = Math.abs(iD2) > 3;
            boolean z2 = iD2 > 0;
            this.c0 = we0Var;
            if (z && z2) {
                this.g0.a0(iD - 3);
                this.g0.post(new cd(this, iD, 2));
            } else if (z) {
                this.g0.a0(iD + 3);
                this.g0.post(new cd(this, iD, 2));
            } else {
                this.g0.post(new cd(this, iD, 2));
            }
        } else {
            this.c0 = we0Var;
            this.g0.a0(iD);
        }
        P(iD);
    }

    public final void O(int i) {
        this.d0 = i;
        if (i == 2) {
            this.f0.getLayoutManager().o0(this.c0.h - ((hb1) this.f0.getAdapter()).i.b0.f.h);
            this.j0.setVisibility(0);
            this.k0.setVisibility(8);
            this.h0.setVisibility(8);
            this.i0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.j0.setVisibility(8);
            this.k0.setVisibility(0);
            this.h0.setVisibility(0);
            this.i0.setVisibility(0);
            N(this.c0);
        }
    }

    public final void P(int i) {
        this.i0.setEnabled(i + 1 < this.g0.getAdapter().a());
        this.h0.setEnabled(i - 1 >= 0);
    }

    @Override // defpackage.iw
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.b0 = (vc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.c0 = (we0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.iw
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i;
        int i2;
        ck0 ck0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(i(), this.a0);
        this.e0 = new vq2(contextThemeWrapper, 4);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.m0 = (AccessibilityManager) G().getSystemService("accessibility");
        we0 we0Var = this.b0.f;
        if (jc0.T(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.phuongpn.whousemywifi.networkscanner.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.phuongpn.whousemywifi.networkscanner.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = G().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = xe0.i;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.mtrl_calendar_days_of_week);
        e61.l(gridView, new yb0(0));
        int i4 = this.b0.j;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new sm(i4) : new sm()));
        gridView.setNumColumns(we0Var.i);
        gridView.setEnabled(false);
        this.g0 = (RecyclerView) viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.mtrl_calendar_months);
        this.g0.setLayoutManager(new zb0(this, i2, i2));
        this.g0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.b0, new of3(4, this));
        this.g0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.phuongpn.whousemywifi.networkscanner.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.mtrl_calendar_year_selector_frame);
        this.f0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f0.setLayoutManager(new GridLayoutManager(integer));
            this.f0.setAdapter(new hb1(this));
            RecyclerView recyclerView4 = this.f0;
            ac0 ac0Var = new ac0();
            g41.c(null);
            g41.c(null);
            recyclerView4.g(ac0Var);
        }
        View viewFindViewById = viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.month_navigation_fragment_toggle);
        vc vcVar = cVar.i;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.month_navigation_fragment_toggle);
            this.l0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            e61.l(this.l0, new sb(3, this));
            View viewFindViewById2 = viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.month_navigation_previous);
            this.h0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.month_navigation_next);
            this.i0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.j0 = viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.mtrl_calendar_year_selector_frame);
            this.k0 = viewInflate.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.mtrl_calendar_day_selector_frame);
            O(1);
            this.l0.setText(this.c0.c());
            this.g0.h(new bc0(this, cVar));
            this.l0.setOnClickListener(new m1(3, this));
            this.i0.setOnClickListener(new xb0(this, cVar, 1));
            this.h0.setOnClickListener(new xb0(this, cVar, 0));
            P(vcVar.f.d(this.c0));
        }
        if (!jc0.T(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (ck0Var = new ck0()).a) != (recyclerView = this.g0)) {
            bx0 bx0Var = ck0Var.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.m0;
                if (arrayList != null) {
                    arrayList.remove(bx0Var);
                }
                ck0Var.a.setOnFlingListener(null);
            }
            ck0Var.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                ck0Var.a.h(bx0Var);
                ck0Var.a.setOnFlingListener(ck0Var);
                new Scroller(ck0Var.a.getContext(), new DecelerateInterpolator());
                ck0Var.f();
            }
        }
        this.g0.a0(vcVar.f.d(this.c0));
        e61.l(this.g0, new yb0(1));
        return viewInflate;
    }

    @Override // defpackage.iw
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c0);
    }
}
