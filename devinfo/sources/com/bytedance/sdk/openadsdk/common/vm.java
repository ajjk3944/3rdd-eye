package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.lh.ryl;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm extends com.bytedance.sdk.openadsdk.core.le.lh implements tlj.vt {
    private String fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f7849le;

    /* renamed from: lh, reason: collision with root package name */
    private ouw f7850lh;
    private View ouw;
    private final com.bytedance.sdk.openadsdk.lh.tlj ra;
    private vpp vt;
    private Context yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();

        void ouw(FilterWord filterWord);

        void vt();
    }

    public vm(Context context, vpp vppVar) {
        this(context.getApplicationContext());
        this.vt = vppVar;
        this.yu = context;
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = this.ra;
        tljVar.bly = vppVar.yhj;
        tljVar.ouw(this);
        lh();
    }

    private void lh() {
        com.bytedance.sdk.openadsdk.lh.tlj tljVar;
        vpp vppVar = this.vt;
        if (vppVar == null || (tljVar = this.ra) == null) {
            return;
        }
        tljVar.ouw(vppVar.jae);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = this.ra;
        if (tljVar != null) {
            tljVar.ouw();
        }
    }

    public final void setCallback(ouw ouwVar) {
        this.f7850lh = ouwVar;
    }

    public final void setDislikeSource(String str) {
        this.fkw = str;
        this.ra.tlj = str;
    }

    public final void vt() {
        setVisibility(8);
        this.f7849le = false;
        ouw ouwVar = this.f7850lh;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.DisLD", "showDislike: ");
        if (this.ouw.getParent() == null) {
            addView(this.ouw);
        }
        setVisibility(0);
        this.f7849le = true;
        ouw ouwVar = this.f7850lh;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }

    private vm(Context context) {
        this(context, (AttributeSet) null);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.vt
    public final void ouw(int i4) {
        if (com.bytedance.sdk.openadsdk.lh.tlj.vt == i4) {
            FilterWord filterWord = this.ra.vm;
            if (filterWord == null || com.bytedance.sdk.openadsdk.lh.tlj.ouw.equals(filterWord)) {
                return;
            }
            ouw ouwVar = this.f7850lh;
            if (ouwVar != null) {
                try {
                    ouwVar.ouw(filterWord);
                } catch (Throwable unused) {
                }
            }
            vt();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lh.tlj.f8582lh == i4) {
            vt();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lh.tlj.fkw == i4) {
            Context context = this.yu;
            if (context instanceof Activity) {
                boolean zIsFinishing = ((Activity) context).isFinishing();
                com.bytedance.sdk.openadsdk.lh.ryl rylVar = new com.bytedance.sdk.openadsdk.lh.ryl(this.yu, this.ra);
                rylVar.ouw = new ryl.ouw() { // from class: com.bytedance.sdk.openadsdk.common.vm.2
                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void lh() {
                        vm.this.setVisibility(0);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void ouw() {
                        vm.this.setVisibility(8);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void vt() {
                        vm.this.setVisibility(0);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void ouw(String str) {
                        vm.this.ra.vt(str);
                        vm.this.setVisibility(0);
                    }
                };
                rylVar.ouw("", this.vt);
                if (zIsFinishing || rylVar.isShowing()) {
                    return;
                }
                rylVar.show();
            }
        }
    }

    private vm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private vm(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.f7849le = false;
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = new com.bytedance.sdk.openadsdk.lh.tlj();
        this.ra = tljVar;
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.vm.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (vm.this.ra != null) {
                    vm.this.ra.lh();
                } else {
                    vm.this.vt();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.ouw = new com.bytedance.sdk.openadsdk.lh.bly(context, tljVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = osn.ouw(getContext(), 20.0f);
        layoutParams.rightMargin = osn.ouw(getContext(), 20.0f);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setClickable(true);
        lh();
    }
}
