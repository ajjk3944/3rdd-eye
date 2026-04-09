package ej;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.j0;
import b5.z;
import com.liuzh.deviceinfo.R;
import e4.c2;
import e4.m0;
import e4.v0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import je.u;
import nk.v;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i extends z {
    public final f1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public o f23505a0;

    /* renamed from: b0, reason: collision with root package name */
    public nj.b f23506b0;

    /* renamed from: c0, reason: collision with root package name */
    public e f23507c0;

    /* renamed from: d0, reason: collision with root package name */
    public kj.f f23508d0;

    /* renamed from: e0, reason: collision with root package name */
    public n.a f23509e0;

    /* renamed from: f0, reason: collision with root package name */
    public String f23510f0;

    /* renamed from: g0, reason: collision with root package name */
    public c2 f23511g0;

    /* renamed from: h0, reason: collision with root package name */
    public final j0 f23512h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f23513i0;

    /* renamed from: j0, reason: collision with root package name */
    public final HashMap f23514j0;

    public i() {
        a6.e eVar = new a6.e(7, this);
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(3, new b2.b(2, this)));
        this.Z = new f1(v.a(m.class), new h(fVarT, 0), eVar, new h(fVarT, 1));
        this.f23512h0 = new j0(1, this);
        this.f23514j0 = new HashMap();
    }

    @Override // b5.z
    public void F(Bundle bundle) {
        super.F(bundle);
        String string = V().getString("analyze_path");
        nk.k.b(string);
        this.f23510f0 = string;
        if (TextUtils.isEmpty(string)) {
            U().finish();
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fa_fragment_storage_analyze, viewGroup, false);
        int i4 = R.id.analyzing_path;
        TextView textView = (TextView) wb.e.s(R.id.analyzing_path, viewInflate);
        if (textView != null) {
            i4 = R.id.analyzing_tips;
            TextView textView2 = (TextView) wb.e.s(R.id.analyzing_tips, viewInflate);
            if (textView2 != null) {
                i4 = R.id.anim_container;
                FrameLayout frameLayout = (FrameLayout) wb.e.s(R.id.anim_container, viewInflate);
                if (frameLayout != null) {
                    i4 = R.id.floating_container;
                    FrameLayout frameLayout2 = (FrameLayout) wb.e.s(R.id.floating_container, viewInflate);
                    if (frameLayout2 != null) {
                        i4 = R.id.recyclerview;
                        RecyclerView recyclerView = (RecyclerView) wb.e.s(R.id.recyclerview, viewInflate);
                        if (recyclerView != null) {
                            this.f23505a0 = new o((ConstraintLayout) viewInflate, textView, textView2, frameLayout, frameLayout2, recyclerView, 5);
                            ConstraintLayout constraintLayout = (ConstraintLayout) d0().f36146b;
                            nk.k.d(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        n.a aVar = this.f23509e0;
        if (aVar != null) {
            aVar.b();
        }
        Iterator it = this.f23514j0.values().iterator();
        while (it.hasNext()) {
            ((nj.b) it.next()).c();
        }
    }

    @Override // b5.z
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(new n.c(W(), jm.a.y()));
        nk.k.d(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    @Override // b5.z
    public void R(View view, Bundle bundle) {
        nk.k.e(view, "view");
        U().l(this.f23512h0, v());
        ((ec.z) jm.a.f27720a.f1138f).getClass();
        com.applovin.impl.sdk.ad.f fVar = new com.applovin.impl.sdk.ad.f(5, this, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, fVar);
        o oVarD0 = d0();
        RecyclerView recyclerView = (RecyclerView) oVarD0.g;
        ((TextView) oVarD0.f36148d).setTextColor(jm.a.z().b(W()));
        W();
        final int i4 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        final int i10 = 0;
        e eVar = new e(i10, this);
        this.f23507c0 = eVar;
        recyclerView.setAdapter(eVar);
        z2.k kVarZ = jm.a.z();
        nk.k.d(kVarZ, "themeHandler(...)");
        dj.b.l(recyclerView, kVarZ);
        TextView textView = (TextView) oVarD0.f36147c;
        String str = this.f23510f0;
        if (str == null) {
            nk.k.k("analyzePath");
            throw null;
        }
        textView.setText(str);
        f0((FrameLayout) oVarD0.f36149e);
        final int i11 = 2;
        e0().g.e(v(), new bh.i(new mk.c(this) { // from class: ej.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f23494b;

            {
                this.f23494b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
            @Override // mk.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 642
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.c.invoke(java.lang.Object):java.lang.Object");
            }
        }, i11));
        e0().f23525i.e(v(), new bh.i(new mk.c(this) { // from class: ej.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f23494b;

            {
                this.f23494b = this;
            }

            @Override // mk.c
            public final Object invoke(Object v10) {
                /*
                    Method dump skipped, instructions count: 642
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.c.invoke(java.lang.Object):java.lang.Object");
            }
        }, i11));
        e0().f23526k.e(v(), new bh.i(new mk.c(this) { // from class: ej.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f23494b;

            {
                this.f23494b = this;
            }

            @Override // mk.c
            public final Object invoke(Object v10) {
                /*
                    Method dump skipped, instructions count: 642
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.c.invoke(java.lang.Object):java.lang.Object");
            }
        }, i11));
        final int i12 = 3;
        e0().f23528m.e(v(), new bh.i(new mk.c(this) { // from class: ej.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f23494b;

            {
                this.f23494b = this;
            }

            @Override // mk.c
            public final Object invoke(Object v10) {
                /*
                    Method dump skipped, instructions count: 642
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ej.c.invoke(java.lang.Object):java.lang.Object");
            }
        }, i11));
        if (((p6.i) jm.a.f27720a.f1137e).B()) {
            ((p6.i) jm.a.f27720a.f1137e).getClass();
            pi.a aVarC = ag.a.c(R.layout.ad_native_common);
            if (aVarC == null) {
                return;
            }
            u.k(W(), new f(i10, (z) this), aVarC);
        }
    }

    public final kj.f c0() {
        kj.f fVar = this.f23508d0;
        if (fVar != null) {
            return fVar;
        }
        nk.k.k("analyzeResult");
        throw null;
    }

    public final o d0() {
        o oVar = this.f23505a0;
        if (oVar != null) {
            return oVar;
        }
        nk.k.k("binding");
        throw null;
    }

    public final m e0() {
        return (m) this.Z.getValue();
    }

    public abstract void f0(FrameLayout frameLayout);

    public void g0(kj.f fVar) {
        nk.k.e(fVar, "result");
        this.f23508d0 = fVar;
        e eVar = this.f23507c0;
        if (eVar == null) {
            nk.k.k("mAdapter");
            throw null;
        }
        eVar.notifyItemRangeInserted(0, c0().f28363c.size());
        o oVarD0 = d0();
        FrameLayout frameLayout = (FrameLayout) oVarD0.f36149e;
        ((RecyclerView) oVarD0.g).setVisibility(0);
        frameLayout.setVisibility(8);
        h0(frameLayout);
        ((TextView) oVarD0.f36148d).setVisibility(8);
        ((TextView) oVarD0.f36147c).setVisibility(8);
        ((p6.i) jm.a.f27720a.f1137e).getClass();
        cg.a.f2848b.f(null, "analyze_comp");
    }

    public abstract void h0(FrameLayout frameLayout);

    public final boolean i0() {
        nj.b bVar = this.f23506b0;
        if (bVar == null) {
            return false;
        }
        nj.a aVar = bVar.f29949a;
        if (aVar != null) {
            ((d) aVar).a();
        }
        e0().f23527l.j(-1);
        return true;
    }
}
