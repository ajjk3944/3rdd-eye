package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.e0;
import com.google.android.material.button.MaterialButton;
import h7.l0;
import u3.i0;

/* loaded from: classes.dex */
public final class m<S> extends v {
    public a A0;
    public d B0;
    public RecyclerView C0;
    public RecyclerView D0;
    public View E0;
    public View F0;
    public View G0;
    public View H0;
    public MaterialButton I0;
    public AccessibilityManager J0;

    /* renamed from: x0, reason: collision with root package name */
    public int f5604x0;

    /* renamed from: y0, reason: collision with root package name */
    public CalendarConstraints f5605y0;

    /* renamed from: z0, reason: collision with root package name */
    public Month f5606z0;

    public enum a {
        DAY,
        YEAR
    }

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.f5604x0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5605y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5606z0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.f5604x0);
        this.B0 = new d(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.J0 = (AccessibilityManager) X().getSystemService("accessibility");
        Month month = this.f5605y0.f5572a;
        if (o.m0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = ed.h.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = ed.h.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = X().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ed.d.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ed.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ed.d.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ed.d.mtrl_calendar_days_of_week_height);
        int i12 = r.f5626d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ed.d.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(ed.d.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(ed.d.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(ed.f.mtrl_calendar_days_of_week);
        i0.n(gridView, new g(0));
        int i13 = this.f5605y0.f5576x;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new e(i13) : new e()));
        gridView.setNumColumns(month.f5583r);
        gridView.setEnabled(false);
        this.D0 = (RecyclerView) viewInflate.findViewById(ed.f.mtrl_calendar_months);
        this.D0.setLayoutManager(new h(this, i11, i11));
        this.D0.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f5605y0, new i(this));
        this.D0.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(ed.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(ed.f.mtrl_calendar_year_selector_frame);
        this.C0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.C0.setLayoutManager(new GridLayoutManager(integer));
            this.C0.setAdapter(new a0(this));
            RecyclerView recyclerView2 = this.C0;
            j jVar = new j();
            y.c(null);
            y.c(null);
            recyclerView2.i(jVar);
        }
        View viewFindViewById = viewInflate.findViewById(ed.f.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = uVar.f5635d;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(ed.f.month_navigation_fragment_toggle);
            this.I0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            i0.n(this.I0, new k(0, this));
            View viewFindViewById2 = viewInflate.findViewById(ed.f.month_navigation_previous);
            this.E0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(ed.f.month_navigation_next);
            this.F0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.G0 = viewInflate.findViewById(ed.f.mtrl_calendar_year_selector_frame);
            this.H0 = viewInflate.findViewById(ed.f.mtrl_calendar_day_selector_frame);
            h0(a.DAY);
            this.I0.setText(this.f5606z0.f());
            this.D0.j(new l(this, uVar));
            int i14 = 1;
            this.I0.setOnClickListener(new e0(i14, this));
            this.F0.setOnClickListener(new f(this, uVar, i14));
            this.E0.setOnClickListener(new f(this, uVar, 0));
            i0(calendarConstraints.f5572a.g(this.f5606z0));
        }
        if (!o.m0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new l0().a(this.D0);
        }
        this.D0.i0(calendarConstraints.f5572a.g(this.f5606z0));
        i0.n(this.D0, new g(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5604x0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5605y0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5606z0);
    }

    public final void g0(Month month) {
        u uVar = (u) this.D0.getAdapter();
        int iG = uVar.f5635d.f5572a.g(month);
        AccessibilityManager accessibilityManager = this.J0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iG2 = iG - uVar.f5635d.f5572a.g(this.f5606z0);
            boolean z10 = Math.abs(iG2) > 3;
            boolean z11 = iG2 > 0;
            this.f5606z0 = month;
            if (z10 && z11) {
                this.D0.i0(iG - 3);
                this.D0.post(new bc.m(iG, 1, this));
            } else if (z10) {
                this.D0.i0(iG + 3);
                this.D0.post(new bc.m(iG, 1, this));
            } else {
                this.D0.post(new bc.m(iG, 1, this));
            }
        } else {
            this.f5606z0 = month;
            this.D0.i0(iG);
        }
        i0(iG);
    }

    public final void h0(a aVar) {
        this.A0 = aVar;
        if (aVar == a.YEAR) {
            this.C0.getLayoutManager().q0(this.f5606z0.f5582g - ((a0) this.C0.getAdapter()).f5586d.f5605y0.f5572a.f5582g);
            this.G0.setVisibility(0);
            this.H0.setVisibility(8);
            this.E0.setVisibility(8);
            this.F0.setVisibility(8);
            return;
        }
        if (aVar == a.DAY) {
            this.G0.setVisibility(8);
            this.H0.setVisibility(0);
            this.E0.setVisibility(0);
            this.F0.setVisibility(0);
            g0(this.f5606z0);
        }
    }

    public final void i0(int i10) {
        this.F0.setEnabled(i10 + 1 < this.D0.getAdapter().b());
        this.E0.setEnabled(i10 - 1 >= 0);
    }
}
