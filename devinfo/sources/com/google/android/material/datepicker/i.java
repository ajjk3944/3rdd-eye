package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.t1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20459b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f20458a = i4;
        this.f20459b = obj;
    }

    @Override // androidx.recyclerview.widget.b1
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, t1 t1Var) {
        switch (this.f20458a) {
            case 1:
                nk.k.e(rect, "outRect");
                nk.k.e(view, "view");
                nk.k.e(t1Var, "state");
                int iN = RecyclerView.N(view) + 1;
                oj.c cVar = (oj.c) this.f20459b;
                if (iN == cVar.getAdapter().f29954i.size()) {
                    Context context = cVar.getContext();
                    nk.k.d(context, "getContext(...)");
                    rect.bottom = cm.g.n(R.attr.analyzer_content_padding, context);
                    break;
                }
                break;
            case 2:
                nk.k.e(rect, "outRect");
                nk.k.e(view, "view");
                nk.k.e(t1Var, "state");
                int iN2 = RecyclerView.N(view) + 1;
                pj.b bVar = (pj.b) this.f20459b;
                if (iN2 == bVar.getAdapter().f29954i.size()) {
                    Context context2 = bVar.getContext();
                    nk.k.d(context2, "getContext(...)");
                    rect.bottom = cm.g.n(R.attr.analyzer_content_padding, context2);
                    break;
                }
                break;
            default:
                super.getItemOffsets(rect, view, recyclerView, t1Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public void onDraw(Canvas canvas, RecyclerView recyclerView, t1 t1Var) {
        switch (this.f20458a) {
            case 0:
                if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    ((l) this.f20459b).getClass();
                    throw null;
                }
                return;
            case 3:
                ((ql.b) this.f20459b).run();
                return;
            default:
                super.onDraw(canvas, recyclerView, t1Var);
                return;
        }
    }

    public i(l lVar) {
        this.f20458a = 0;
        this.f20459b = lVar;
        w.c(null);
        w.c(null);
    }
}
