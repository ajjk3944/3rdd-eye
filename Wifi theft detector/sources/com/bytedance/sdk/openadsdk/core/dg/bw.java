package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.dg.ycc;
import com.bytedance.sdk.openadsdk.core.model.sra;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bw {
    private sra emc;
    private final ycc.emc msw;
    private final View.OnAttachStateChangeListener uym;
    private final ycc.ypw ycc;
    private ycc ypw;
    private List<emc> xq = new ArrayList();
    private final String dg = "BannerSwiperManager";
    private int bw = -1;

    public bw(sra sraVar, Context context, int i10, int i11) {
        ycc.ypw ypwVar = new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.1
            @Override // com.bytedance.sdk.openadsdk.core.dg.ycc.ypw
            public void emc(boolean z10) {
                try {
                    if (z10) {
                        bw.this.dg();
                    } else {
                        bw.this.xq();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.ycc = ypwVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) throws Resources.NotFoundException {
                bw.this.bw();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) throws Resources.NotFoundException {
                if (bw.this.xq != null && !bw.this.xq.isEmpty()) {
                    for (int i12 = 0; i12 < bw.this.xq.size(); i12++) {
                        ((emc) bw.this.xq.get(i12)).ycc();
                    }
                }
                bw.this.bw = -1;
                if (bw.this.ypw != null) {
                    bw.this.ypw.dg();
                }
            }
        };
        this.uym = onAttachStateChangeListener;
        ycc.emc emcVar = new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.3
            @Override // com.bytedance.sdk.openadsdk.core.dg.ycc.emc
            public void emc(boolean z10) {
                if (z10) {
                    bw.this.dg();
                } else {
                    bw.this.xq();
                }
            }
        };
        this.msw = emcVar;
        this.emc = sraVar;
        ycc yccVar = new ycc(context);
        this.ypw = yccVar;
        yccVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.ypw.setSwiperWindowFocusChangedListener(ypwVar);
        this.ypw.setSwiperVisibleChangeListener(emcVar);
        emc(context, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() throws Resources.NotFoundException {
        if (this.emc == null) {
            this.emc = new sra();
        }
        this.ypw.emc(TextUtils.equals(this.emc.emc(), "vertical") ? 1 : 0).emc("dot").xq(false).dg(this.emc.dg() == 1).emc(this.emc.ypw() == 1).xq(this.emc.zz()).bw(this.emc.ru() == 1).dg(this.emc.msw()).ypw(this.emc.xq() == 1).msw(this.emc.bw()).zz(this.emc.ycc()).uym(this.emc.uym());
        this.ypw.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.ycc.xq() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.4
            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z10, int i10, float f10, int i11) {
            }

            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                bw.this.xq(i10);
                bw.this.bw = i10;
                bw.this.emc(i10);
                bw.this.ypw(i10);
            }

            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z10, int i10) {
                if (i10 == 1 || i10 == 2) {
                    bw.this.ypw(-1);
                } else if (i10 == 0) {
                    bw bwVar = bw.this;
                    bwVar.emc(bwVar.bw);
                }
            }
        });
        ypw(this.xq);
        this.ypw.xq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        ycc yccVar;
        sra sraVar = this.emc;
        if (sraVar != null && sraVar.ypw() == 1 && (yccVar = this.ypw) != null) {
            yccVar.bw();
        }
        int i10 = this.bw;
        if (i10 >= 0) {
            emc(i10);
            ypw(this.bw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        ycc yccVar;
        sra sraVar = this.emc;
        if (sraVar != null && sraVar.ypw() == 1 && (yccVar = this.ypw) != null) {
            yccVar.ycc();
        }
        if (this.bw >= 0) {
            ypw(-1);
        }
    }

    public void emc(Context context, float f10, float f11) {
        int iYpw = vw.ypw(context, f10);
        int iYpw2 = vw.ypw(context, f11);
        ViewGroup.LayoutParams layoutParams = this.ypw.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iYpw, iYpw2);
        }
        layoutParams.width = iYpw;
        layoutParams.height = iYpw2;
        this.ypw.setLayoutParams(layoutParams);
    }

    public void ypw(int i10) {
        emc emcVar;
        for (int i11 = 0; i11 < this.xq.size(); i11++) {
            try {
                if (i11 != i10 && (emcVar = this.xq.get(i11)) != null) {
                    emcVar.zz();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(int i10) {
        emc emcVar;
        try {
            int i11 = this.bw;
            if (i11 != -1 && i11 != i10 && (emcVar = this.xq.get(i11)) != null) {
                emcVar.dg();
                emcVar.msw();
            }
            emc emcVar2 = this.xq.get(i10);
            if (emcVar2 != null) {
                emcVar2.bw();
            }
        } catch (Throwable unused) {
        }
    }

    private void ypw(List<emc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.ypw.emc((ycc) list.get(i10).emc());
        }
    }

    public void emc(List<emc> list) {
        this.xq = list;
    }

    public View ypw() {
        return this.ypw;
    }

    public void emc(final int i10) {
        emc emcVar;
        try {
            final int size = this.xq.size();
            if (i10 < size && (emcVar = this.xq.get(i10)) != null) {
                emcVar.emc(new com.bytedance.sdk.openadsdk.emc.emc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.5
                    @Override // com.bytedance.sdk.openadsdk.emc.emc.ypw
                    public void emc() {
                        int i11 = i10 + 1;
                        if (i11 >= size) {
                            return;
                        }
                        bw.this.emc(i11);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void emc() {
        if (this.ypw != null) {
            try {
                List<emc> list = this.xq;
                if (list != null && !list.isEmpty()) {
                    for (int i10 = 0; i10 < this.xq.size(); i10++) {
                        this.xq.get(i10).uym();
                    }
                }
                this.bw = -1;
                this.ypw.dg();
                this.ypw.setSwiperWindowFocusChangedListener(null);
                this.ypw.setSwiperVisibleChangeListener(null);
                this.ypw.removeOnAttachStateChangeListener(this.uym);
                this.ypw = null;
            } catch (Throwable unused) {
            }
        }
    }
}
