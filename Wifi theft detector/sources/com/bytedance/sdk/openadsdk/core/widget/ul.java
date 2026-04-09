package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.o;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class ul {
    private ypw bw;
    private com.bytedance.sdk.openadsdk.core.sz.ypw.emc dg;
    private View emc;
    private ViewGroup msw;
    private b uym;
    private Context xq;
    private boolean ycc = false;
    private TextView ypw;

    public enum emc {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public interface ypw {
        void gbl();

        boolean ru();
    }

    private void dg() {
        View view = this.emc;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        if (this.xq == null) {
            return;
        }
        dg();
    }

    private void ypw() {
        this.uym = null;
    }

    public void emc(Context context, ViewGroup viewGroup) {
        if (context == null || !o.a(viewGroup)) {
            return;
        }
        this.msw = viewGroup;
        this.xq = com.bytedance.sdk.openadsdk.core.aa.emc().getApplicationContext();
    }

    private void emc(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams layoutParamsEmc;
        if (context == null || view == null || this.emc != null || (layoutParamsEmc = emc(this.msw)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cf.bw bwVar = new com.bytedance.sdk.openadsdk.cf.bw(context);
        this.emc = bwVar;
        bwVar.setLayoutParams(layoutParamsEmc);
        this.msw.addView(this.emc);
        this.ypw = (TextView) this.emc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.xxo);
        View viewFindViewById = this.emc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ng);
        if (z10) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ul.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ul.this.xq();
                    if (ul.this.dg != null) {
                        ul.this.dg.emc(emc.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams emc(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.ypw.emc emcVar, ypw ypwVar) {
        this.bw = ypwVar;
        this.dg = emcVar;
    }

    public boolean emc(int i10, b bVar, boolean z10) {
        Context context = this.xq;
        if (context == null || bVar == null) {
            return true;
        }
        emc(context, this.msw, z10);
        this.uym = bVar;
        if (i10 == 1 || i10 == 2) {
            return emc(i10);
        }
        return true;
    }

    private boolean emc(int i10) {
        ypw ypwVar;
        if (emc() || this.ycc) {
            return true;
        }
        if (this.dg != null && (ypwVar = this.bw) != null) {
            if (ypwVar.ru()) {
                this.dg.bw(null, null);
            }
            this.dg.emc(emc.PAUSE_VIDEO, (String) null);
        }
        emc(this.uym, true);
        return false;
    }

    public void emc(boolean z10) {
        if (z10) {
            ypw();
        }
        dg();
    }

    public boolean emc() {
        View view = this.emc;
        return view != null && view.getVisibility() == 0;
    }

    private void emc(b bVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (bVar == null || (view = this.emc) == null || this.xq == null || view.getVisibility() == 0) {
            return;
        }
        ypw ypwVar = this.bw;
        if (ypwVar != null) {
            ypwVar.gbl();
        }
        double dCeil = Math.ceil((bVar.b() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(rie.emc(this.xq, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = rie.emc(this.xq, "tt_video_without_wifi_tips") + rie.emc(this.xq, "tt_video_bytesize");
        }
        vw.emc(this.emc, 0);
        vw.emc(this.ypw, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!vw.dg(this.emc) || (view2 = this.emc) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
