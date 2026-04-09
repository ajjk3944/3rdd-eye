package com.google.android.material.datepicker;

import M3.A;
import R.O;
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
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class j<S> extends r {

    /* renamed from: l0, reason: collision with root package name */
    public int f18281l0;

    /* renamed from: m0, reason: collision with root package name */
    public b f18282m0;

    /* renamed from: n0, reason: collision with root package name */
    public m f18283n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f18284o0;

    /* renamed from: p0, reason: collision with root package name */
    public c f18285p0;

    /* renamed from: q0, reason: collision with root package name */
    public RecyclerView f18286q0;

    /* renamed from: r0, reason: collision with root package name */
    public RecyclerView f18287r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f18288s0;

    /* renamed from: t0, reason: collision with root package name */
    public View f18289t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f18290u0;
    public View v0;

    /* renamed from: w0, reason: collision with root package name */
    public MaterialButton f18291w0;

    /* renamed from: x0, reason: collision with root package name */
    public AccessibilityManager f18292x0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f21712f;
        }
        this.f18281l0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18282m0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18283n0 = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f18281l0);
        this.f18285p0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f18292x0 = (AccessibilityManager) R().getSystemService("accessibility");
        m mVar = this.f18282m0.f18259a;
        if (k.i0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.apm.insight.R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i = com.apm.insight.R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = R().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.apm.insight.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.apm.insight.R.dimen.mtrl_calendar_days_of_week_height);
        int i6 = n.f18326d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_calendar_month_vertical_padding) * (i6 - 1)) + (resources.getDimensionPixelSize(com.apm.insight.R.dimen.mtrl_calendar_day_height) * i6) + resources.getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.apm.insight.R.id.mtrl_calendar_days_of_week);
        O.m(gridView, new A(2));
        int i7 = this.f18282m0.f18263e;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new e(i7) : new e()));
        gridView.setNumColumns(mVar.f18322d);
        gridView.setEnabled(false);
        this.f18287r0 = (RecyclerView) viewInflate.findViewById(com.apm.insight.R.id.mtrl_calendar_months);
        this.f18287r0.setLayoutManager(new g(this, i3, i3));
        this.f18287r0.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.f18282m0, new A0.e(23, this));
        this.f18287r0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.apm.insight.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.apm.insight.R.id.mtrl_calendar_year_selector_frame);
        this.f18286q0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f18286q0.setLayoutManager(new GridLayoutManager(integer));
            this.f18286q0.setAdapter(new w(this));
            this.f18286q0.g(new h(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.apm.insight.R.id.month_navigation_fragment_toggle);
        b bVar = qVar.f18335a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.apm.insight.R.id.month_navigation_fragment_toggle);
            this.f18291w0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            O.m(this.f18291w0, new J3.e(1, this));
            View viewFindViewById2 = viewInflate.findViewById(com.apm.insight.R.id.month_navigation_previous);
            this.f18288s0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.apm.insight.R.id.month_navigation_next);
            this.f18289t0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f18290u0 = viewInflate.findViewById(com.apm.insight.R.id.mtrl_calendar_year_selector_frame);
            this.v0 = viewInflate.findViewById(com.apm.insight.R.id.mtrl_calendar_day_selector_frame);
            Y(1);
            this.f18291w0.setText(this.f18283n0.c());
            this.f18287r0.h(new i(this, qVar));
            int i8 = 1;
            this.f18291w0.setOnClickListener(new A3.o(i8, this));
            this.f18289t0.setOnClickListener(new f(this, qVar, i8));
            this.f18288s0.setOnClickListener(new f(this, qVar, 0));
            Z(bVar.f18259a.d(this.f18283n0));
        }
        if (!k.i0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C().attachToRecyclerView(this.f18287r0);
        }
        this.f18287r0.c0(bVar.f18259a.d(this.f18283n0));
        O.m(this.f18287r0, new A(3));
        return viewInflate;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f18281l0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f18282m0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f18283n0);
    }

    public final void X(m mVar) {
        q qVar = (q) this.f18287r0.getAdapter();
        int iD = qVar.f18335a.f18259a.d(mVar);
        AccessibilityManager accessibilityManager = this.f18292x0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - qVar.f18335a.f18259a.d(this.f18283n0);
            boolean z6 = Math.abs(iD2) > 3;
            boolean z7 = iD2 > 0;
            this.f18283n0 = mVar;
            if (z6 && z7) {
                this.f18287r0.c0(iD - 3);
                this.f18287r0.post(new A3.h(iD, 13, this));
            } else if (z6) {
                this.f18287r0.c0(iD + 3);
                this.f18287r0.post(new A3.h(iD, 13, this));
            } else {
                this.f18287r0.post(new A3.h(iD, 13, this));
            }
        } else {
            this.f18283n0 = mVar;
            this.f18287r0.c0(iD);
        }
        Z(iD);
    }

    public final void Y(int i) {
        this.f18284o0 = i;
        if (i == 2) {
            this.f18286q0.getLayoutManager().scrollToPosition(this.f18283n0.f18321c - ((w) this.f18286q0.getAdapter()).f18342a.f18282m0.f18259a.f18321c);
            this.f18290u0.setVisibility(0);
            this.v0.setVisibility(8);
            this.f18288s0.setVisibility(8);
            this.f18289t0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f18290u0.setVisibility(8);
            this.v0.setVisibility(0);
            this.f18288s0.setVisibility(0);
            this.f18289t0.setVisibility(0);
            X(this.f18283n0);
        }
    }

    public final void Z(int i) {
        this.f18289t0.setEnabled(i + 1 < this.f18287r0.getAdapter().getItemCount());
        this.f18288s0.setEnabled(i - 1 >= 0);
    }
}
