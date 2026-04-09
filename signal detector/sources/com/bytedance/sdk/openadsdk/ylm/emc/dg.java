package com.bytedance.sdk.openadsdk.ylm.emc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.sz.ycc;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.ylm.emc.emc;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class dg {
    private static volatile dg ypw;
    private final Handler emc;
    private int xq = 0;
    private int dg = 2;
    private int bw = 3600000;
    private final ArrayList<ypw> ycc = new ArrayList<>();

    private dg() {
        iyl.ypw(new msw("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.ylm.emc.dg.1
            @Override // java.lang.Runnable
            public void run() {
                dg.this.xq = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_pre_render_enable", 0);
                dg.this.dg = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_pre_render_max_count", 2);
                if (dg.this.dg <= 0 || dg.this.dg > 4) {
                    dg.this.dg = 2;
                }
                dg.this.bw = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_pre_render_alive_time", 3600000);
                if (dg.this.bw <= 0 || dg.this.bw > 3600000) {
                    dg.this.bw = 3600000;
                }
            }
        });
        this.emc = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.dg.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof ypw)) {
                    return false;
                }
                dg.this.ycc.remove(message.obj);
                ((ypw) message.obj).dg();
                return true;
            }
        });
    }

    public static dg emc() {
        if (ypw == null) {
            synchronized (dg.class) {
                try {
                    if (ypw == null) {
                        ypw = new dg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public boolean ypw() {
        return this.xq == 1;
    }

    public void emc(final rie rieVar) {
        if (ypw() && rieVar != null && dr.ycc(rieVar)) {
            final String strLvs = rieVar.lvs();
            if (TextUtils.isEmpty(strLvs)) {
                return;
            }
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.dg.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (dg.this.ycc.size() >= dg.this.dg) {
                            dg.this.ycc.size();
                            ypw ypwVar = (ypw) dg.this.ycc.remove(0);
                            if (ypwVar != null) {
                                dg.this.emc.removeMessages(ypwVar.zz().hashCode());
                                ypwVar.dg();
                            }
                        }
                        rieVar.qh(true);
                        Context contextEmc = aa.emc();
                        rie rieVar2 = rieVar;
                        final ypw ypwVar2 = new ypw(contextEmc, rieVar2, rieVar2.ono(), true, new FrameLayout(aa.emc()), strLvs);
                        dg.this.ycc.add(ypwVar2);
                        ypwVar2.msw();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strLvs.hashCode();
                        messageObtain.obj = ypwVar2;
                        dg.this.emc.sendMessageDelayed(messageObtain, dg.this.bw);
                        ypwVar2.emc(new emc.ypw() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.dg.3.1
                            @Override // com.bytedance.sdk.openadsdk.ylm.emc.emc.ypw
                            public void emc() {
                                dg.this.emc.removeMessages(strLvs.hashCode());
                                dg.this.ycc.remove(ypwVar2);
                                ypwVar2.dg();
                            }
                        });
                        rie rieVar3 = rieVar;
                        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar3, tp.xq(rieVar3.vaf().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    public ypw emc(rie rieVar, FrameLayout frameLayout, ycc yccVar) {
        ypw ypwVar;
        if (ypw() && rieVar.vaf() != null && !TextUtils.isEmpty(rieVar.vaf().getBidAdm()) && dr.ycc(rieVar) && frameLayout != null) {
            String strLvs = rieVar.lvs();
            if (TextUtils.isEmpty(strLvs)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.ycc.size()) {
                    i = -1;
                    ypwVar = null;
                    break;
                }
                ypwVar = this.ycc.get(i);
                if (strLvs.equals(ypwVar.zz())) {
                    break;
                }
                i++;
            }
            if (ypwVar != null) {
                this.emc.removeMessages(strLvs.hashCode());
                this.ycc.remove(i);
                this.ycc.size();
                rieVar.qh(true);
                ypwVar.emc(frameLayout, yccVar);
                com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, tp.xq(rieVar.vaf().getDurationSlotType()), "PL_use_pre_render", 1);
                return ypwVar;
            }
        }
        return null;
    }
}
