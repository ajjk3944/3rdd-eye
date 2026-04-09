package com.bytedance.sdk.openadsdk.core.gbl.ypw.bw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.yoga.ypw.xq;
import com.bytedance.adsdk.ugeno.ypw.xq;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class emc extends FrameLayout {
    private dg dg;
    private final RecyclerView emc;
    private final C0147emc xq;
    private final List<xq> ypw;

    public static class ypw extends RecyclerView.c0 {
        private final ViewGroup emc;

        public ypw(@NonNull View view) {
            super(view);
            this.emc = (ViewGroup) view;
        }

        public void emc(xq xqVar) {
            View viewGbl = xqVar.gbl();
            ViewParent parent = viewGbl.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewGbl);
            }
            this.emc.removeAllViews();
            this.emc.addView(viewGbl, new xq.emc(xqVar.iyl(), xqVar.mxo()));
        }
    }

    public emc(@NonNull Context context) {
        super(context);
        this.ypw = new CopyOnWriteArrayList();
        C0147emc c0147emc = new C0147emc();
        this.xq = c0147emc;
        RecyclerView recyclerView = new RecyclerView(context);
        this.emc = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0147emc);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ycc();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.emc(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        dg dgVar = this.dg;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i10, i11);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            this.emc.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.emc.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
        if (xqVar == null) {
            return;
        }
        this.ypw.add(xqVar);
        C0147emc c0147emc = this.xq;
        if (c0147emc != null) {
            c0147emc.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.ypw.bw.emc$emc, reason: collision with other inner class name */
    public class C0147emc extends RecyclerView.Adapter {
        private C0147emc() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public ypw onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            com.bytedance.adsdk.ugeno.yoga.ypw.xq xqVar = new com.bytedance.adsdk.ugeno.yoga.ypw.xq(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.ypw.xq xqVar2 = (com.bytedance.adsdk.ugeno.ypw.xq) emc.this.ypw.get(i10);
            xqVar.setLayoutParams(new ViewGroup.LayoutParams(xqVar2.iyl(), xqVar2.mxo()));
            return new ypw(xqVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return emc.this.ypw.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull ypw ypwVar, int i10) {
            ypwVar.emc((com.bytedance.adsdk.ugeno.ypw.xq) emc.this.ypw.get(i10));
        }
    }

    public void emc(dg dgVar) {
        this.dg = dgVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.ypw.bw.ypw ypwVar) {
        ViewGroup.LayoutParams layoutParams = this.emc.getLayoutParams();
        layoutParams.width = ypwVar.iyl();
        layoutParams.height = ypwVar.mxo();
        this.emc.setLayoutParams(layoutParams);
    }
}
