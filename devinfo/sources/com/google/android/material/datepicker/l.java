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
import androidx.recyclerview.widget.o0;
import com.google.android.material.button.MaterialButton;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l<S> extends t {

    /* renamed from: a0, reason: collision with root package name */
    public int f20464a0;

    /* renamed from: b0, reason: collision with root package name */
    public b f20465b0;

    /* renamed from: c0, reason: collision with root package name */
    public o f20466c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f20467d0;

    /* renamed from: e0, reason: collision with root package name */
    public c f20468e0;

    /* renamed from: f0, reason: collision with root package name */
    public RecyclerView f20469f0;

    /* renamed from: g0, reason: collision with root package name */
    public RecyclerView f20470g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f20471h0;

    /* renamed from: i0, reason: collision with root package name */
    public View f20472i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f20473j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f20474k0;

    /* renamed from: l0, reason: collision with root package name */
    public MaterialButton f20475l0;

    /* renamed from: m0, reason: collision with root package name */
    public AccessibilityManager f20476m0;

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.f20464a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20465b0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20466c0 = (o) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i4;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(p(), this.f20464a0);
        this.f20468e0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f20476m0 = (AccessibilityManager) W().getSystemService("accessibility");
        o oVar = this.f20465b0.f20439a;
        if (m.l0(R.attr.windowFullscreen, contextThemeWrapper)) {
            i4 = com.liuzh.deviceinfo.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i4 = com.liuzh.deviceinfo.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i4, viewGroup, false);
        Resources resources = W().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = p.f20496d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.liuzh.deviceinfo.R.id.mtrl_calendar_days_of_week);
        v0.o(gridView, new g(0));
        int i12 = this.f20465b0.f20443e;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new e(i12) : new e()));
        gridView.setNumColumns(oVar.f20493d);
        gridView.setEnabled(false);
        this.f20470g0 = (RecyclerView) viewInflate.findViewById(com.liuzh.deviceinfo.R.id.mtrl_calendar_months);
        this.f20470g0.setLayoutManager(new h(this, i10, i10));
        this.f20470g0.setTag("MONTHS_VIEW_GROUP_TAG");
        s sVar = new s(contextThemeWrapper, this.f20465b0, new p6.i(this));
        this.f20470g0.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.liuzh.deviceinfo.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.liuzh.deviceinfo.R.id.mtrl_calendar_year_selector_frame);
        this.f20469f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f20469f0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f20469f0.setAdapter(new y(this));
            this.f20469f0.i(new i(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.liuzh.deviceinfo.R.id.month_navigation_fragment_toggle);
        b bVar = sVar.f20505i;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.liuzh.deviceinfo.R.id.month_navigation_fragment_toggle);
            this.f20475l0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            v0.o(this.f20475l0, new j(0, this));
            View viewFindViewById2 = viewInflate.findViewById(com.liuzh.deviceinfo.R.id.month_navigation_previous);
            this.f20471h0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.liuzh.deviceinfo.R.id.month_navigation_next);
            this.f20472i0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f20473j0 = viewInflate.findViewById(com.liuzh.deviceinfo.R.id.mtrl_calendar_year_selector_frame);
            this.f20474k0 = viewInflate.findViewById(com.liuzh.deviceinfo.R.id.mtrl_calendar_day_selector_frame);
            d0(1);
            this.f20475l0.setText(this.f20466c0.c());
            this.f20470g0.j(new k(this, sVar));
            int i13 = 1;
            this.f20475l0.setOnClickListener(new aa.j(i13, this));
            this.f20472i0.setOnClickListener(new f(this, sVar, i13));
            this.f20471h0.setOnClickListener(new f(this, sVar, 0));
            e0(bVar.f20439a.d(this.f20466c0));
        }
        if (!m.l0(R.attr.windowFullscreen, contextThemeWrapper)) {
            new o0().attachToRecyclerView(this.f20470g0);
        }
        this.f20470g0.k0(bVar.f20439a.d(this.f20466c0));
        v0.o(this.f20470g0, new g(1));
        return viewInflate;
    }

    @Override // b5.z
    public final void O(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f20464a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20465b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f20466c0);
    }

    public final void c0(o oVar) {
        s sVar = (s) this.f20470g0.getAdapter();
        int iD = sVar.f20505i.f20439a.d(oVar);
        AccessibilityManager accessibilityManager = this.f20476m0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - sVar.f20505i.f20439a.d(this.f20466c0);
            boolean z3 = Math.abs(iD2) > 3;
            boolean z10 = iD2 > 0;
            this.f20466c0 = oVar;
            if (z3 && z10) {
                this.f20470g0.k0(iD - 3);
                this.f20470g0.post(new b4.a(this, iD, 10));
            } else if (z3) {
                this.f20470g0.k0(iD + 3);
                this.f20470g0.post(new b4.a(this, iD, 10));
            } else {
                this.f20470g0.post(new b4.a(this, iD, 10));
            }
        } else {
            this.f20466c0 = oVar;
            this.f20470g0.k0(iD);
        }
        e0(iD);
    }

    public final void d0(int i4) {
        this.f20467d0 = i4;
        if (i4 == 2) {
            this.f20469f0.getLayoutManager().scrollToPosition(this.f20466c0.f20492c - ((y) this.f20469f0.getAdapter()).f20510i.f20465b0.f20439a.f20492c);
            this.f20473j0.setVisibility(0);
            this.f20474k0.setVisibility(8);
            this.f20471h0.setVisibility(8);
            this.f20472i0.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f20473j0.setVisibility(8);
            this.f20474k0.setVisibility(0);
            this.f20471h0.setVisibility(0);
            this.f20472i0.setVisibility(0);
            c0(this.f20466c0);
        }
    }

    public final void e0(int i4) {
        this.f20472i0.setEnabled(i4 + 1 < this.f20470g0.getAdapter().getItemCount());
        this.f20471h0.setEnabled(i4 - 1 >= 0);
    }
}
