package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.dr;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public abstract class emc extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    protected TTDislikeDialogAbstract bw;
    protected com.bytedance.sdk.openadsdk.xq.xq dg;
    private com.bytedance.sdk.openadsdk.dg.uym emc;
    protected String gbl;
    protected int msw;
    protected boolean ru;
    protected int uym;
    protected com.bytedance.sdk.openadsdk.core.model.rie xq;
    protected String ycc;
    protected Context ypw;
    protected boolean zz;

    public emc(Context context) {
        super(context);
        this.ycc = "embeded_ad";
        this.zz = true;
        this.ru = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void emc() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.bw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.xq.xq xqVar = this.dg;
        if (xqVar != null) {
            xqVar.emc();
        } else {
            TTDelegateActivity.emc(this.xq, (String) null);
        }
    }

    public abstract void emc(View view, int i, com.bytedance.sdk.openadsdk.core.model.vk vkVar);

    public String getDescription() {
        return !TextUtils.isEmpty(this.xq.xou()) ? this.xq.xou() : !TextUtils.isEmpty(this.xq.vyk()) ? this.xq.vyk() : "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.xq;
        return rieVar == null ? "" : (rieVar.mjd() == null || TextUtils.isEmpty(this.xq.mjd().ypw())) ? !TextUtils.isEmpty(this.xq.hs()) ? this.xq.hs() : "" : this.xq.mjd().ypw();
    }

    public float getRealHeight() {
        return vw.xq(this.ypw, this.msw);
    }

    public float getRealWidth() {
        return vw.xq(this.ypw, this.uym);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        return (this.xq.mjd() == null || TextUtils.isEmpty(this.xq.mjd().ypw())) ? !TextUtils.isEmpty(this.xq.hs()) ? this.xq.hs() : !TextUtils.isEmpty(this.xq.xou()) ? this.xq.xou() : "" : this.xq.mjd().ypw();
    }

    public com.bytedance.sdk.openadsdk.core.sz.ypw.ycc getVideoView() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.xq;
        if (rieVar != null && this.ypw != null) {
            if (com.bytedance.sdk.openadsdk.core.model.rie.bw(rieVar)) {
                try {
                    yccVar = new com.bytedance.sdk.openadsdk.core.sz.ypw.ycc(this.ypw, this.xq, this.ycc, true, false, this.emc);
                    yccVar.setVideoCacheUrl(this.gbl);
                    yccVar.setControllerStatusCallBack(new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.zz.emc.2
                        @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.ypw
                        public void emc(boolean z6, long j6, long j7, long j8, boolean z7) {
                        }
                    });
                    yccVar.setIsAutoPlay(this.zz);
                    yccVar.emc(this.ru, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.rie.bw(this.xq) && yccVar != null && yccVar.emc(0L, true, false)) {
                    return yccVar;
                }
            } else {
                yccVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.rie.bw(this.xq)) {
                }
            }
        }
        return null;
    }

    public void setDislikeInner(dr drVar) {
        if (drVar instanceof com.bytedance.sdk.openadsdk.xq.xq) {
            this.dg = (com.bytedance.sdk.openadsdk.xq.xq) drVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        if (tTDislikeDialogAbstract != null && (rieVar = this.xq) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(rieVar.wdp(), this.xq.pz());
        }
        this.bw = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void emc(View view, boolean z6) {
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar;
        if (view == null) {
            return;
        }
        if (z6) {
            Context context = this.ypw;
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.xq;
            String str = this.ycc;
            ypwVar = new com.bytedance.sdk.openadsdk.core.xq.emc(context, rieVar, str, tp.emc(str));
        } else {
            Context context2 = this.ypw;
            com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.xq;
            String str2 = this.ycc;
            ypwVar = new com.bytedance.sdk.openadsdk.core.xq.ypw(context2, rieVar2, str2, tp.emc(str2));
        }
        view.setOnTouchListener(ypwVar);
        view.setOnClickListener(ypwVar);
        ypwVar.emc(new ypw() { // from class: com.bytedance.sdk.openadsdk.core.zz.emc.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.ypw
            public void emc(View view2, int i, com.bytedance.sdk.openadsdk.core.model.vk vkVar) {
                emc.this.emc(view2, i, vkVar);
            }
        });
    }

    public void emc(View view) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.xq;
        if (rieVar == null || rieVar.iat() == null || view == null) {
            return;
        }
        emc(view, this.xq.jxk() == 1 && this.zz);
    }
}
