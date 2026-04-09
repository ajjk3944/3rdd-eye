package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
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

    public bw(sra sraVar, Context context, int i, int i3) {
        ycc.ypw ypwVar = new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.1
            @Override // com.bytedance.sdk.openadsdk.core.dg.ycc.ypw
            public void emc(boolean z6) {
                try {
                    if (z6) {
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
            public void onViewAttachedToWindow(View view) {
                bw.this.bw();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (bw.this.xq != null && !bw.this.xq.isEmpty()) {
                    for (int i6 = 0; i6 < bw.this.xq.size(); i6++) {
                        ((emc) bw.this.xq.get(i6)).ycc();
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
            public void emc(boolean z6) {
                if (z6) {
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
        emc(context, i, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        if (this.emc == null) {
            this.emc = new sra();
        }
        this.ypw.emc(TextUtils.equals(this.emc.emc(), "vertical") ? 1 : 0).emc("dot").xq(false).dg(this.emc.dg() == 1).emc(this.emc.ypw() == 1).xq(this.emc.zz()).bw(this.emc.ru() == 1).dg(this.emc.msw()).ypw(this.emc.xq() == 1).msw(this.emc.bw()).zz(this.emc.ycc()).uym(this.emc.uym());
        this.ypw.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.ycc.xq() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.4
            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z6, int i, float f2, int i3) {
            }

            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z6, int i, int i3, boolean z7, boolean z8) {
                bw.this.xq(i);
                bw.this.bw = i;
                bw.this.emc(i);
                bw.this.ypw(i);
            }

            @Override // com.bytedance.adsdk.ugeno.ycc.xq
            public void emc(boolean z6, int i) {
                if (i == 1 || i == 2) {
                    bw.this.ypw(-1);
                } else if (i == 0) {
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
        int i = this.bw;
        if (i >= 0) {
            emc(i);
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

    public void emc(Context context, float f2, float f5) {
        int iYpw = vw.ypw(context, f2);
        int iYpw2 = vw.ypw(context, f5);
        ViewGroup.LayoutParams layoutParams = this.ypw.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iYpw, iYpw2);
        }
        layoutParams.width = iYpw;
        layoutParams.height = iYpw2;
        this.ypw.setLayoutParams(layoutParams);
    }

    public void ypw(int i) {
        emc emcVar;
        for (int i3 = 0; i3 < this.xq.size(); i3++) {
            try {
                if (i3 != i && (emcVar = this.xq.get(i3)) != null) {
                    emcVar.zz();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(int i) {
        emc emcVar;
        try {
            int i3 = this.bw;
            if (i3 != -1 && i3 != i && (emcVar = this.xq.get(i3)) != null) {
                emcVar.dg();
                emcVar.msw();
            }
            emc emcVar2 = this.xq.get(i);
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
        for (int i = 0; i < list.size(); i++) {
            this.ypw.emc((ycc) list.get(i).emc());
        }
    }

    public void emc(List<emc> list) {
        this.xq = list;
    }

    public View ypw() {
        return this.ypw;
    }

    public void emc(final int i) {
        emc emcVar;
        try {
            final int size = this.xq.size();
            if (i < size && (emcVar = this.xq.get(i)) != null) {
                emcVar.emc(new com.bytedance.sdk.openadsdk.emc.emc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.dg.bw.5
                    @Override // com.bytedance.sdk.openadsdk.emc.emc.ypw
                    public void emc() {
                        int i3 = i + 1;
                        if (i3 >= size) {
                            return;
                        }
                        bw.this.emc(i3);
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
                    for (int i = 0; i < this.xq.size(); i++) {
                        this.xq.get(i).uym();
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
