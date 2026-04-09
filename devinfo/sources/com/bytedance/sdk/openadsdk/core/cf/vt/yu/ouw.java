package com.bytedance.sdk.openadsdk.core.cf.vt.yu;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yoga.vt.lh;
import com.bytedance.adsdk.ugeno.yu;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends FrameLayout {

    /* renamed from: lh, reason: collision with root package name */
    private final List<lh> f8171lh;
    final RecyclerView ouw;
    yu vt;
    private final C0083ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cf.vt.yu.ouw$ouw, reason: collision with other inner class name */
    public class C0083ouw extends t0 {
        private C0083ouw() {
        }

        @Override // androidx.recyclerview.widget.t0
        public final int getItemCount() {
            return ouw.this.f8171lh.size();
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ void onBindViewHolder(x1 x1Var, int i4) {
            vt vtVar = (vt) x1Var;
            lh lhVar = (lh) ouw.this.f8171lh.get(i4);
            View view = lhVar.fkw;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            vtVar.ouw.removeAllViews();
            vtVar.ouw.addView(view, new lh.ouw(lhVar.od(), lhVar.cd()));
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            com.bytedance.adsdk.ugeno.yoga.vt.lh lhVar = new com.bytedance.adsdk.ugeno.yoga.vt.lh(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.vt.lh lhVar2 = (com.bytedance.adsdk.ugeno.vt.lh) ouw.this.f8171lh.get(i4);
            lhVar.setLayoutParams(new ViewGroup.LayoutParams(lhVar2.od(), lhVar2.cd()));
            return new vt(lhVar);
        }

        public /* synthetic */ C0083ouw(ouw ouwVar, byte b10) {
            this();
        }

        @Override // androidx.recyclerview.widget.t0
        public final int getItemViewType(int i4) {
            return i4;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends x1 {
        final ViewGroup ouw;

        public vt(View view) {
            super(view);
            this.ouw = (ViewGroup) view;
        }
    }

    public ouw(Context context) {
        super(context);
        this.f8171lh = new CopyOnWriteArrayList();
        C0083ouw c0083ouw = new C0083ouw(this, (byte) 0);
        this.yu = c0083ouw;
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.ouw = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0083ouw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.yu();
        }
        super.onLayout(z3, i4, i10, i11, i12);
        yu yuVar2 = this.vt;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i4, i10);
        }
        yu yuVar2 = this.vt;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    public final void setOrientation(int i4) {
        if (i4 == 1) {
            RecyclerView recyclerView = this.ouw;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        } else {
            RecyclerView recyclerView2 = this.ouw;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
        if (lhVar == null) {
            return;
        }
        this.f8171lh.add(lhVar);
        C0083ouw c0083ouw = this.yu;
        if (c0083ouw != null) {
            c0083ouw.notifyDataSetChanged();
        }
    }
}
