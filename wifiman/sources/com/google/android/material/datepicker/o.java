package com.google.android.material.datepicker;

import F1.W;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;

/* loaded from: classes3.dex */
class o extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f37457c;

    /* renamed from: d, reason: collision with root package name */
    private final i.m f37458d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37459e;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f37460a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f37460a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f37460a.getAdapter().p(i10)) {
                o.this.f37458d.a(this.f37460a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.C {

        /* renamed from: t, reason: collision with root package name */
        final TextView f37462t;

        /* renamed from: u, reason: collision with root package name */
        final MaterialCalendarGridView f37463u;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(O3.e.f17091u);
            this.f37462t = textView;
            W.n0(textView, true);
            this.f37463u = (MaterialCalendarGridView) linearLayout.findViewById(O3.e.f17087q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        m mVarK = aVar.k();
        m mVarG = aVar.g();
        m mVarJ = aVar.j();
        if (mVarK.compareTo(mVarJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVarJ.compareTo(mVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f37459e = (n.f37451e * i.Q1(context)) + (k.b2(context) ? i.Q1(context) : 0);
        this.f37457c = aVar;
        this.f37458d = mVar;
        r(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f37457c.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i10) {
        return this.f37457c.k().p(i10).n();
    }

    m u(int i10) {
        return this.f37457c.k().p(i10);
    }

    CharSequence v(int i10) {
        return u(i10).l();
    }

    int w(m mVar) {
        return this.f37457c.k().r(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, int i10) {
        m mVarP = this.f37457c.k().p(i10);
        bVar.f37462t.setText(mVarP.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f37463u.findViewById(O3.e.f17087q);
        if (materialCalendarGridView.getAdapter() == null || !mVarP.equals(materialCalendarGridView.getAdapter().f37453a)) {
            n nVar = new n(mVarP, null, this.f37457c, null);
            materialCalendarGridView.setNumColumns(mVarP.f37447d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b k(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(O3.g.f17111n, viewGroup, false);
        if (!k.b2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f37459e));
        return new b(linearLayout, true);
    }
}
