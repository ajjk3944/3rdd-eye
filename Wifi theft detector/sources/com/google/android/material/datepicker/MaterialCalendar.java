package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import s0.x;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MaterialCalendar<S> extends s {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f10319q = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: r, reason: collision with root package name */
    public static final Object f10320r = "NAVIGATION_PREV_TAG";

    /* renamed from: s, reason: collision with root package name */
    public static final Object f10321s = "NAVIGATION_NEXT_TAG";

    /* renamed from: t, reason: collision with root package name */
    public static final Object f10322t = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b, reason: collision with root package name */
    public int f10323b;

    /* renamed from: c, reason: collision with root package name */
    public DateSelector f10324c;

    /* renamed from: d, reason: collision with root package name */
    public CalendarConstraints f10325d;

    /* renamed from: e, reason: collision with root package name */
    public DayViewDecorator f10326e;

    /* renamed from: f, reason: collision with root package name */
    public Month f10327f;

    /* renamed from: g, reason: collision with root package name */
    public CalendarSelector f10328g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.datepicker.b f10329h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f10330i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f10331j;

    /* renamed from: k, reason: collision with root package name */
    public View f10332k;

    /* renamed from: l, reason: collision with root package name */
    public View f10333l;

    /* renamed from: m, reason: collision with root package name */
    public View f10334m;

    /* renamed from: n, reason: collision with root package name */
    public View f10335n;

    /* renamed from: o, reason: collision with root package name */
    public MaterialButton f10336o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f10337p;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f10341a;

        public a(q qVar) {
            this.f10341a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.C(this.f10341a.b(MaterialCalendar.this.y().findLastVisibleItemPosition() - 1));
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10343a;

        public b(int i10) {
            this.f10343a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f10331j.F1(this.f10343a);
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.o0(null);
        }
    }

    public class d extends t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f10346a = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            if (this.f10346a == 0) {
                iArr[0] = MaterialCalendar.this.f10331j.getWidth();
                iArr[1] = MaterialCalendar.this.f10331j.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.f10331j.getHeight();
                iArr[1] = MaterialCalendar.this.f10331j.getHeight();
            }
        }
    }

    public class e implements l {
        public e() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.l
        public void a(long j10) {
            if (MaterialCalendar.this.f10325d.q().f(j10)) {
                MaterialCalendar.this.f10324c.p(j10);
                Iterator it = MaterialCalendar.this.f10485a.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).b(MaterialCalendar.this.f10324c.o());
                }
                MaterialCalendar.this.f10331j.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f10330i != null) {
                    MaterialCalendar.this.f10330i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public class f extends androidx.core.view.a {
        public f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.H0(false);
        }
    }

    public class g extends RecyclerView.m {

        /* renamed from: a, reason: collision with root package name */
        public final Calendar f10350a = a0.r();

        /* renamed from: b, reason: collision with root package name */
        public final Calendar f10351b = a0.r();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            if ((recyclerView.getAdapter() instanceof b0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                b0 b0Var = (b0) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (r0.e eVar : MaterialCalendar.this.f10324c.k()) {
                    Object obj = eVar.f24134a;
                    if (obj != null && eVar.f24135b != null) {
                        this.f10350a.setTimeInMillis(((Long) obj).longValue());
                        this.f10351b.setTimeInMillis(((Long) eVar.f24135b).longValue());
                        int iC = b0Var.c(this.f10350a.get(1));
                        int iC2 = b0Var.c(this.f10351b.get(1));
                        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iC);
                        View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iC2);
                        int iG0 = iC / gridLayoutManager.g0();
                        int iG02 = iC2 / gridLayoutManager.g0();
                        int i10 = iG0;
                        while (i10 <= iG02) {
                            if (gridLayoutManager.findViewByPosition(gridLayoutManager.g0() * i10) != null) {
                                canvas.drawRect((i10 != iG0 || viewFindViewByPosition == null) ? 0 : viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2), r9.getTop() + MaterialCalendar.this.f10329h.f10434d.c(), (i10 != iG02 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.f10329h.f10434d.b(), MaterialCalendar.this.f10329h.f10438h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class h extends androidx.core.view.a {
        public h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.b(new x.a(16, MaterialCalendar.this.f10335n.getVisibility() == 0 ? MaterialCalendar.this.getString(j4.j.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(j4.j.mtrl_picker_toggle_to_day_selection)));
        }
    }

    public class i extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f10354a;

        public i(q qVar) {
            this.f10354a = qVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int iFindFirstVisibleItemPosition = i10 < 0 ? MaterialCalendar.this.y().findFirstVisibleItemPosition() : MaterialCalendar.this.y().findLastVisibleItemPosition();
            Month monthB = this.f10354a.b(iFindFirstVisibleItemPosition);
            MaterialCalendar.this.f10327f = monthB;
            MaterialCalendar.this.f10336o.setText(this.f10354a.c(iFindFirstVisibleItemPosition));
            MaterialCalendar.this.G(this.f10354a.d(monthB));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.F();
        }
    }

    public class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f10357a;

        public k(q qVar) {
            this.f10357a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.C(this.f10357a.b(MaterialCalendar.this.y().findFirstVisibleItemPosition() + 1));
        }
    }

    public interface l {
        void a(long j10);
    }

    public static int w(Context context) {
        return context.getResources().getDimensionPixelSize(j4.d.mtrl_calendar_day_height);
    }

    public static int x(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(j4.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(j4.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(j4.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(j4.d.mtrl_calendar_days_of_week_height);
        int i10 = p.f10468g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(j4.d.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(j4.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(j4.d.mtrl_calendar_bottom_padding);
    }

    public static MaterialCalendar z(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.u());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    public final void A(int i10) {
        this.f10331j.post(new b(i10));
    }

    public void B() {
        MaterialButton materialButton = this.f10336o;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public void C(Month month) {
        q qVar = (q) this.f10331j.getAdapter();
        int iD = qVar.d(month);
        AccessibilityManager accessibilityManager = this.f10337p;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - qVar.d(this.f10327f);
            boolean z10 = Math.abs(iD2) > 3;
            boolean z11 = iD2 > 0;
            this.f10327f = month;
            if (z10 && z11) {
                this.f10331j.w1(iD - 3);
                A(iD);
            } else if (z10) {
                this.f10331j.w1(iD + 3);
                A(iD);
            } else {
                A(iD);
            }
        } else {
            this.f10327f = month;
            this.f10331j.w1(iD);
        }
        G(iD);
    }

    public void D(CalendarSelector calendarSelector) {
        this.f10328g = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f10330i.getLayoutManager().scrollToPosition(((b0) this.f10330i.getAdapter()).c(this.f10327f.f10397c));
            this.f10334m.setVisibility(0);
            this.f10335n.setVisibility(8);
            this.f10332k.setVisibility(8);
            this.f10333l.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f10334m.setVisibility(8);
            this.f10335n.setVisibility(0);
            this.f10332k.setVisibility(0);
            this.f10333l.setVisibility(0);
            C(this.f10327f);
        }
    }

    public final void E() {
        ViewCompat.j0(this.f10331j, new f());
    }

    public void F() {
        CalendarSelector calendarSelector = this.f10328g;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            D(CalendarSelector.DAY);
            this.f10331j.announceForAccessibility(getString(j4.j.mtrl_picker_toggled_to_day_selection));
        } else if (calendarSelector == CalendarSelector.DAY) {
            D(calendarSelector2);
            this.f10330i.announceForAccessibility(getString(j4.j.mtrl_picker_toggled_to_year_selection));
        }
    }

    public final void G(int i10) {
        this.f10333l.setEnabled(i10 + 1 < this.f10331j.getAdapter().getItemCount());
        this.f10332k.setEnabled(i10 - 1 >= 0);
    }

    @Override // com.google.android.material.datepicker.s
    public boolean f(r rVar) {
        return super.f(rVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10323b = bundle.getInt("THEME_RES_ID_KEY");
        this.f10324c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10325d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10326e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10327f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f10323b);
        this.f10329h = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f10337p = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month monthV = this.f10325d.v();
        if (MaterialDatePicker.u(contextThemeWrapper)) {
            i10 = j4.h.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = j4.h.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(x(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(j4.f.mtrl_calendar_days_of_week);
        ViewCompat.j0(gridView, new c());
        int iS = this.f10325d.s();
        gridView.setAdapter((ListAdapter) (iS > 0 ? new com.google.android.material.datepicker.k(iS) : new com.google.android.material.datepicker.k()));
        gridView.setNumColumns(monthV.f10398d);
        gridView.setEnabled(false);
        this.f10331j = (RecyclerView) viewInflate.findViewById(j4.f.mtrl_calendar_months);
        this.f10331j.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f10331j.setTag(f10319q);
        q qVar = new q(contextThemeWrapper, this.f10324c, this.f10325d, this.f10326e, new e());
        this.f10331j.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(j4.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(j4.f.mtrl_calendar_year_selector_frame);
        this.f10330i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10330i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f10330i.setAdapter(new b0(this));
            this.f10330i.j(r());
        }
        if (viewInflate.findViewById(j4.f.month_navigation_fragment_toggle) != null) {
            q(viewInflate, qVar);
        }
        if (!MaterialDatePicker.u(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().attachToRecyclerView(this.f10331j);
        }
        this.f10331j.w1(qVar.d(this.f10327f));
        E();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10323b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10324c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10325d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10326e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10327f);
    }

    public final void q(View view, q qVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(j4.f.month_navigation_fragment_toggle);
        this.f10336o = materialButton;
        materialButton.setTag(f10322t);
        ViewCompat.j0(this.f10336o, new h());
        View viewFindViewById = view.findViewById(j4.f.month_navigation_previous);
        this.f10332k = viewFindViewById;
        viewFindViewById.setTag(f10320r);
        View viewFindViewById2 = view.findViewById(j4.f.month_navigation_next);
        this.f10333l = viewFindViewById2;
        viewFindViewById2.setTag(f10321s);
        this.f10334m = view.findViewById(j4.f.mtrl_calendar_year_selector_frame);
        this.f10335n = view.findViewById(j4.f.mtrl_calendar_day_selector_frame);
        D(CalendarSelector.DAY);
        this.f10336o.setText(this.f10327f.s());
        this.f10331j.n(new i(qVar));
        this.f10336o.setOnClickListener(new j());
        this.f10333l.setOnClickListener(new k(qVar));
        this.f10332k.setOnClickListener(new a(qVar));
        G(qVar.d(this.f10327f));
    }

    public final RecyclerView.m r() {
        return new g();
    }

    public CalendarConstraints s() {
        return this.f10325d;
    }

    public com.google.android.material.datepicker.b t() {
        return this.f10329h;
    }

    public Month u() {
        return this.f10327f;
    }

    public DateSelector v() {
        return this.f10324c;
    }

    public LinearLayoutManager y() {
        return (LinearLayoutManager) this.f10331j.getLayoutManager();
    }
}
