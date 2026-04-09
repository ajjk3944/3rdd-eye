package com.bytedance.sdk.openadsdk.core.gbl.ypw.bw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.yoga.ypw.xq;
import com.bytedance.adsdk.ugeno.ypw.xq;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class emc extends FrameLayout {
    private dg dg;
    private final RecyclerView emc;
    private final C0062emc xq;
    private final List<xq> ypw;

    public static class ypw extends g0 {
        private final ViewGroup emc;

        public ypw(View view) {
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

    public emc(Context context) {
        super(context);
        this.ypw = new CopyOnWriteArrayList();
        C0062emc c0062emc = new C0062emc();
        this.xq = c0062emc;
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.emc = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0062emc);
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
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ycc();
        }
        super.onLayout(z6, i, i3, i6, i7);
        dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.emc(i, i3, i6, i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        dg dgVar = this.dg;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i, i3);
        }
        dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            RecyclerView recyclerView = this.emc;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        } else {
            RecyclerView recyclerView2 = this.emc;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
        if (xqVar == null) {
            return;
        }
        this.ypw.add(xqVar);
        C0062emc c0062emc = this.xq;
        if (c0062emc != null) {
            c0062emc.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.ypw.bw.emc$emc, reason: collision with other inner class name */
    public class C0062emc extends G {
        private C0062emc() {
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public ypw onCreateViewHolder(ViewGroup viewGroup, int i) {
            com.bytedance.adsdk.ugeno.yoga.ypw.xq xqVar = new com.bytedance.adsdk.ugeno.yoga.ypw.xq(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.ypw.xq xqVar2 = (com.bytedance.adsdk.ugeno.ypw.xq) emc.this.ypw.get(i);
            xqVar.setLayoutParams(new ViewGroup.LayoutParams(xqVar2.iyl(), xqVar2.mxo()));
            return new ypw(xqVar);
        }

        @Override // androidx.recyclerview.widget.G
        public int getItemCount() {
            return emc.this.ypw.size();
        }

        @Override // androidx.recyclerview.widget.G
        public int getItemViewType(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(ypw ypwVar, int i) {
            ypwVar.emc((com.bytedance.adsdk.ugeno.ypw.xq) emc.this.ypw.get(i));
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
