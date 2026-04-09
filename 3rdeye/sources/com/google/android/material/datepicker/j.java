package com.google.android.material.datepicker;

import L0.C0770a;
import L0.I;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.r;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class j<S> extends A<S> {

    /* renamed from: c, reason: collision with root package name */
    public int f22810c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4012d<S> f22811d;

    /* renamed from: e, reason: collision with root package name */
    public C4009a f22812e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC4014f f22813f;

    /* renamed from: g, reason: collision with root package name */
    public v f22814g;

    /* renamed from: h, reason: collision with root package name */
    public d f22815h;
    public C4011c i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f22816j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f22817k;

    /* renamed from: l, reason: collision with root package name */
    public View f22818l;

    /* renamed from: m, reason: collision with root package name */
    public View f22819m;

    /* renamed from: n, reason: collision with root package name */
    public View f22820n;

    /* renamed from: o, reason: collision with root package name */
    public View f22821o;

    /* compiled from: MaterialCalendar.java */
    public class a extends C0770a {
        @Override // L0.C0770a
        public final void d(View view, M0.g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    public class b extends C {

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ int f22822E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i10) {
            super(i);
            this.f22822E = i10;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void Y0(RecyclerView.B b10, int[] iArr) {
            int i = this.f22822E;
            j jVar = j.this;
            if (i == 0) {
                iArr[0] = jVar.f22817k.getWidth();
                iArr[1] = jVar.f22817k.getWidth();
            } else {
                iArr[0] = jVar.f22817k.getHeight();
                iArr[1] = jVar.f22817k.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    public class c {
        public c() {
        }
    }

    /* compiled from: MaterialCalendar.java */
    public enum d {
        DAY,
        YEAR
    }

    @Override // com.google.android.material.datepicker.A
    public final void c(r.c cVar) {
        this.f22769b.add(cVar);
    }

    public final void d(v vVar) {
        y yVar = (y) this.f22817k.getAdapter();
        int iE = yVar.f22891j.f22777b.e(vVar);
        int iE2 = iE - yVar.f22891j.f22777b.e(this.f22814g);
        boolean z10 = Math.abs(iE2) > 3;
        boolean z11 = iE2 > 0;
        this.f22814g = vVar;
        if (z10 && z11) {
            this.f22817k.scrollToPosition(iE - 3);
            this.f22817k.post(new i(this, iE));
        } else if (!z10) {
            this.f22817k.post(new i(this, iE));
        } else {
            this.f22817k.scrollToPosition(iE + 3);
            this.f22817k.post(new i(this, iE));
        }
    }

    public final void e(d dVar) {
        this.f22815h = dVar;
        if (dVar == d.YEAR) {
            this.f22816j.getLayoutManager().L0(this.f22814g.f22877d - ((G) this.f22816j.getAdapter()).f22773j.f22812e.f22777b.f22877d);
            this.f22820n.setVisibility(0);
            this.f22821o.setVisibility(8);
            this.f22818l.setVisibility(8);
            this.f22819m.setVisibility(8);
            return;
        }
        if (dVar == d.DAY) {
            this.f22820n.setVisibility(8);
            this.f22821o.setVisibility(0);
            this.f22818l.setVisibility(0);
            this.f22819m.setVisibility(0);
            d(this.f22814g);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22810c = bundle.getInt("THEME_RES_ID_KEY");
        this.f22811d = (InterfaceC4012d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f22812e = (C4009a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22813f = (AbstractC4014f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f22814g = (v) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f22810c);
        this.i = new C4011c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        v vVar = this.f22812e.f22777b;
        if (r.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = w.f22882h;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.mtrl_calendar_days_of_week);
        I.o(gridView, new a());
        int i12 = this.f22812e.f22781f;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new C4015g(i12) : new C4015g()));
        gridView.setNumColumns(vVar.f22878e);
        gridView.setEnabled(false);
        this.f22817k = (RecyclerView) viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.mtrl_calendar_months);
        getContext();
        this.f22817k.setLayoutManager(new b(i10, i10));
        this.f22817k.setTag("MONTHS_VIEW_GROUP_TAG");
        y yVar = new y(contextThemeWrapper, this.f22811d, this.f22812e, this.f22813f, new c());
        this.f22817k.setAdapter(yVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.mtrl_calendar_year_selector_frame);
        this.f22816j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f22816j.setLayoutManager(new GridLayoutManager(integer));
            this.f22816j.setAdapter(new G(this));
            this.f22816j.addItemDecoration(new l(this));
        }
        if (viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            I.o(materialButton, new m(this, 0));
            View viewFindViewById = viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.month_navigation_previous);
            this.f22818l = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.month_navigation_next);
            this.f22819m = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f22820n = viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.mtrl_calendar_year_selector_frame);
            this.f22821o = viewInflate.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.mtrl_calendar_day_selector_frame);
            e(d.DAY);
            materialButton.setText(this.f22814g.c());
            this.f22817k.addOnScrollListener(new n(this, yVar, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.f22819m.setOnClickListener(new p(this, yVar));
            this.f22818l.setOnClickListener(new h(this, yVar));
        }
        if (!r.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            new androidx.recyclerview.widget.C().a(this.f22817k);
        }
        this.f22817k.scrollToPosition(yVar.f22891j.f22777b.e(this.f22814g));
        I.o(this.f22817k, new k());
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f22810c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f22811d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22812e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f22813f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f22814g);
    }
}
