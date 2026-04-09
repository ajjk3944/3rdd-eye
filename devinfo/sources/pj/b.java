package pj;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x1;
import cm.g;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.ui.CardRecyclerView;
import ec.z;
import ej.i;
import ej.m;
import jj.d;
import nj.c;
import nj.h;
import nk.k;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: h, reason: collision with root package name */
    public final oj.b f32021h;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, i iVar, m mVar) {
        k.e(context, "context");
        k.e(mVar, "viewModel");
        d dVar = mVar.f23522e;
        super(context, iVar, mVar, dVar, 6, new a(context, dVar));
        oj.b bVar = new oj.b(1);
        this.f32021h = bVar;
        getBinding().f24748h.setClipToPadding(false);
        getBinding().f24748h.setLayoutManager(new LinearLayoutManager(1));
        ((z) jm.a.f27720a.f1138f).getClass();
        getBinding().f24748h.k(bVar);
        getBinding().f24748h.i(new com.google.android.material.datepicker.i(2, this));
        setNextFocusDownId(R.id.analyze_item);
        setNextFocusUpId(R.id.buttons_container);
        if (i0.k()) {
            getBinding().f24742a.setFocusable(true);
            getBinding().f24742a.setForeground(g.o(context));
        }
    }

    @Override // nj.b
    public final void c() {
        CardRecyclerView cardRecyclerView = getBinding().f24748h;
        cardRecyclerView.f1247p.remove(this.f32021h);
        CardRecyclerView cardRecyclerView2 = getBinding().f24748h;
        int childCount = cardRecyclerView2.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            x1 x1VarO = getBinding().f24748h.O(cardRecyclerView2.getChildAt(i4));
            k.c(x1VarO, "null cannot be cast to non-null type com.liuzho.lib.fileanalyzer.view.SimpleSingleItemAdapter.Holder");
            Object obj = ((c) x1VarO).f29950c.g;
            Object obj2 = jm.a.f27720a.f1136d;
        }
    }
}
