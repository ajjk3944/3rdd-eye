package oj;

import android.content.Context;
import android.content.res.Resources;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x1;
import cm.g;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.CardRecyclerView;
import ec.z;
import ej.i;
import ej.m;
import jj.d;
import nj.h;
import nk.k;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends h {

    /* renamed from: h, reason: collision with root package name */
    public final b f30576h;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, i iVar, m mVar) {
        k.e(context, "context");
        k.e(mVar, "viewModel");
        d dVar = mVar.f23521d;
        k.e(dVar, "operator");
        super(context, iVar, mVar, dVar, 3, new a(context, dVar));
        b bVar = new b(0);
        this.f30576h = bVar;
        getBinding().f24748h.setClipToPadding(false);
        getBinding().f24748h.setLayoutManager(new LinearLayoutManager(1));
        getBinding().f24748h.k(bVar);
        ((z) jm.a.f27720a.f1138f).getClass();
        getBinding().f24748h.i(new com.google.android.material.datepicker.i(1, this));
        Resources resources = getResources();
        k.d(resources, "getResources(...)");
        setPadding(0, a4.a.c(resources, 2.0f), 0, 0);
        setNextFocusDownId(R.id.analyze_item);
        setNextFocusUpId(R.id.buttons_container);
        if (i0.k()) {
            getBinding().f24742a.setFocusable(true);
            CardView cardView = getBinding().f24742a;
            Context context2 = getContext();
            k.d(context2, "getContext(...)");
            cardView.setForeground(g.o(context2));
        }
    }

    @Override // nj.b
    public final void c() {
        CardRecyclerView cardRecyclerView = getBinding().f24748h;
        cardRecyclerView.f1247p.remove(this.f30576h);
        CardRecyclerView cardRecyclerView2 = getBinding().f24748h;
        int childCount = cardRecyclerView2.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            x1 x1VarO = getBinding().f24748h.O(cardRecyclerView2.getChildAt(i4));
            k.c(x1VarO, "null cannot be cast to non-null type com.liuzho.lib.fileanalyzer.view.SimpleSingleItemAdapter.Holder");
            Object obj = ((nj.c) x1VarO).f29950c.g;
            Object obj2 = jm.a.f27720a.f1136d;
        }
    }
}
