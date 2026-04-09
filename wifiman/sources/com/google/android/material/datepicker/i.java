package com.google.android.material.datepicker;

import F1.C2736a;
import F1.W;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import f.AbstractC5487d;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class i<S> extends q {

    /* renamed from: F1, reason: collision with root package name */
    static final Object f37370F1 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: G1, reason: collision with root package name */
    static final Object f37371G1 = "NAVIGATION_PREV_TAG";

    /* renamed from: H1, reason: collision with root package name */
    static final Object f37372H1 = "NAVIGATION_NEXT_TAG";

    /* renamed from: I1, reason: collision with root package name */
    static final Object f37373I1 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A1, reason: collision with root package name */
    private RecyclerView f37374A1;

    /* renamed from: B1, reason: collision with root package name */
    private View f37375B1;

    /* renamed from: C1, reason: collision with root package name */
    private View f37376C1;

    /* renamed from: D1, reason: collision with root package name */
    private View f37377D1;

    /* renamed from: E1, reason: collision with root package name */
    private View f37378E1;

    /* renamed from: u1, reason: collision with root package name */
    private int f37379u1;

    /* renamed from: v1, reason: collision with root package name */
    private com.google.android.material.datepicker.a f37380v1;

    /* renamed from: w1, reason: collision with root package name */
    private com.google.android.material.datepicker.m f37381w1;

    /* renamed from: x1, reason: collision with root package name */
    private l f37382x1;

    /* renamed from: y1, reason: collision with root package name */
    private com.google.android.material.datepicker.c f37383y1;

    /* renamed from: z1, reason: collision with root package name */
    private RecyclerView f37384z1;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f37385a;

        a(o oVar) {
            this.f37385a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iG2 = i.this.S1().g2() - 1;
            if (iG2 >= 0) {
                i.this.V1(this.f37385a.u(iG2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37387a;

        b(int i10) {
            this.f37387a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f37374A1.o1(this.f37387a);
        }
    }

    class c extends C2736a {
        c() {
        }

        @Override // F1.C2736a
        public void g(View view, G1.t tVar) {
            super.g(view, tVar);
            tVar.i0(null);
        }
    }

    class d extends r {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f37390I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f37390I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.z zVar, int[] iArr) {
            if (this.f37390I == 0) {
                iArr[0] = i.this.f37374A1.getWidth();
                iArr[1] = i.this.f37374A1.getWidth();
            } else {
                iArr[0] = i.this.f37374A1.getHeight();
                iArr[1] = i.this.f37374A1.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.i.m
        public void a(long j10) {
            if (i.this.f37380v1.f().s(j10)) {
                i.H1(i.this);
                throw null;
            }
        }
    }

    class f extends C2736a {
        f() {
        }

        @Override // F1.C2736a
        public void g(View view, G1.t tVar) {
            super.g(view, tVar);
            tVar.H0(false);
        }
    }

    class g extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f37394a = t.i();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f37395b = t.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.H1(i.this);
                throw null;
            }
        }
    }

    class h extends C2736a {
        h() {
        }

        @Override // F1.C2736a
        public void g(View view, G1.t tVar) {
            super.g(view, tVar);
            tVar.s0(i.this.f37378E1.getVisibility() == 0 ? i.this.T(O3.h.f17136u) : i.this.T(O3.h.f17134s));
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    class C1206i extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f37398a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f37399b;

        C1206i(o oVar, MaterialButton materialButton) {
            this.f37398a = oVar;
            this.f37399b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f37399b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iD2 = i10 < 0 ? i.this.S1().d2() : i.this.S1().g2();
            i.this.f37381w1 = this.f37398a.u(iD2);
            this.f37399b.setText(this.f37398a.v(iD2));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.Y1();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f37402a;

        k(o oVar) {
            this.f37402a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iD2 = i.this.S1().d2() + 1;
            if (iD2 < i.this.f37374A1.getAdapter().c()) {
                i.this.V1(this.f37402a.u(iD2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    static /* synthetic */ com.google.android.material.datepicker.d H1(i iVar) {
        iVar.getClass();
        return null;
    }

    private void K1(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(O3.e.f17088r);
        materialButton.setTag(f37373I1);
        W.m0(materialButton, new h());
        View viewFindViewById = view.findViewById(O3.e.f17090t);
        this.f37375B1 = viewFindViewById;
        viewFindViewById.setTag(f37371G1);
        View viewFindViewById2 = view.findViewById(O3.e.f17089s);
        this.f37376C1 = viewFindViewById2;
        viewFindViewById2.setTag(f37372H1);
        this.f37377D1 = view.findViewById(O3.e.f17055A);
        this.f37378E1 = view.findViewById(O3.e.f17092v);
        W1(l.DAY);
        materialButton.setText(this.f37381w1.l());
        this.f37374A1.k(new C1206i(oVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f37376C1.setOnClickListener(new k(oVar));
        this.f37375B1.setOnClickListener(new a(oVar));
    }

    private RecyclerView.n L1() {
        return new g();
    }

    static int Q1(Context context) {
        return context.getResources().getDimensionPixelSize(O3.c.f17001H);
    }

    private static int R1(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(O3.c.f17008O) + resources.getDimensionPixelOffset(O3.c.f17009P) + resources.getDimensionPixelOffset(O3.c.f17007N);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(O3.c.f17003J);
        int i10 = n.f37451e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(O3.c.f17001H) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(O3.c.f17006M)) + resources.getDimensionPixelOffset(O3.c.f16999F);
    }

    public static i T1(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.j());
        iVar.v1(bundle);
        return iVar;
    }

    private void U1(int i10) {
        this.f37374A1.post(new b(i10));
    }

    private void X1() {
        W.m0(this.f37374A1, new f());
    }

    @Override // com.google.android.material.datepicker.q
    public boolean D1(p pVar) {
        return super.D1(pVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f37379u1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f37380v1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f37381w1);
    }

    com.google.android.material.datepicker.a M1() {
        return this.f37380v1;
    }

    com.google.android.material.datepicker.c N1() {
        return this.f37383y1;
    }

    com.google.android.material.datepicker.m O1() {
        return this.f37381w1;
    }

    public com.google.android.material.datepicker.d P1() {
        return null;
    }

    LinearLayoutManager S1() {
        return (LinearLayoutManager) this.f37374A1.getLayoutManager();
    }

    void V1(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.f37374A1.getAdapter();
        int iW = oVar.w(mVar);
        int iW2 = iW - oVar.w(this.f37381w1);
        boolean z10 = Math.abs(iW2) > 3;
        boolean z11 = iW2 > 0;
        this.f37381w1 = mVar;
        if (z10 && z11) {
            this.f37374A1.g1(iW - 3);
            U1(iW);
        } else if (!z10) {
            U1(iW);
        } else {
            this.f37374A1.g1(iW + 3);
            U1(iW);
        }
    }

    void W1(l lVar) {
        this.f37382x1 = lVar;
        if (lVar == l.YEAR) {
            this.f37384z1.getLayoutManager().B1(((u) this.f37384z1.getAdapter()).t(this.f37381w1.f37446c));
            this.f37377D1.setVisibility(0);
            this.f37378E1.setVisibility(8);
            this.f37375B1.setVisibility(8);
            this.f37376C1.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f37377D1.setVisibility(8);
            this.f37378E1.setVisibility(0);
            this.f37375B1.setVisibility(0);
            this.f37376C1.setVisibility(0);
            V1(this.f37381w1);
        }
    }

    void Y1() {
        l lVar = this.f37382x1;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            W1(l.DAY);
        } else if (lVar == l.DAY) {
            W1(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        if (bundle == null) {
            bundle = q();
        }
        this.f37379u1 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC5487d.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f37380v1 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC5487d.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f37381w1 = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(s(), this.f37379u1);
        this.f37383y1 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.m mVarK = this.f37380v1.k();
        if (com.google.android.material.datepicker.k.b2(contextThemeWrapper)) {
            i10 = O3.g.f17112o;
            i11 = 1;
        } else {
            i10 = O3.g.f17110m;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(R1(p1()));
        GridView gridView = (GridView) viewInflate.findViewById(O3.e.f17093w);
        W.m0(gridView, new c());
        int iH = this.f37380v1.h();
        gridView.setAdapter((ListAdapter) (iH > 0 ? new com.google.android.material.datepicker.h(iH) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(mVarK.f37447d);
        gridView.setEnabled(false);
        this.f37374A1 = (RecyclerView) viewInflate.findViewById(O3.e.f17096z);
        this.f37374A1.setLayoutManager(new d(s(), i11, false, i11));
        this.f37374A1.setTag(f37370F1);
        o oVar = new o(contextThemeWrapper, null, this.f37380v1, null, new e());
        this.f37374A1.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(O3.f.f17097a);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(O3.e.f17055A);
        this.f37384z1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f37384z1.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f37384z1.setAdapter(new u(this));
            this.f37384z1.h(L1());
        }
        if (viewInflate.findViewById(O3.e.f17088r) != null) {
            K1(viewInflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.b2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f37374A1);
        }
        this.f37374A1.g1(oVar.w(this.f37381w1));
        X1();
        return viewInflate;
    }
}
