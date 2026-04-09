package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw extends com.bytedance.sdk.openadsdk.core.le.lh {
    protected int bly;

    /* renamed from: cf, reason: collision with root package name */
    protected boolean f8069cf;
    protected TTDislikeDialogAbstract fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f8070le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f8071lh;
    private com.bytedance.sdk.openadsdk.yu.ra ouw;
    protected int pno;
    protected int ra;
    protected String ryl;
    protected boolean tlj;
    public Context vt;
    protected com.bytedance.sdk.openadsdk.lh.lh yu;

    public ouw(Context context) {
        super(context);
        this.f8070le = "embeded_ad";
        this.tlj = true;
        this.f8069cf = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public String getDescription() {
        return !TextUtils.isEmpty(this.f8071lh.fqk) ? this.f8071lh.fqk : !TextUtils.isEmpty(this.f8071lh.hun) ? this.f8071lh.hun : "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f8071lh;
        if (vppVar == null) {
            return "";
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(this.f8071lh.f8315vh) ? this.f8071lh.f8315vh : "" : this.f8071lh.wp.vt;
    }

    public float getRealHeight() {
        return osn.vt(this.vt, this.pno);
    }

    public float getRealWidth() {
        return osn.vt(this.vt, this.ra);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        com.bytedance.sdk.openadsdk.core.model.le leVar = this.f8071lh.wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(this.f8071lh.f8315vh) ? this.f8071lh.f8315vh : !TextUtils.isEmpty(this.f8071lh.fqk) ? this.f8071lh.fqk : "" : this.f8071lh.wp.vt;
    }

    public com.bytedance.sdk.openadsdk.core.mwh.vt.le getVideoView() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f8071lh;
        if (vppVar != null && this.vt != null) {
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                try {
                    leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.vt, this.f8071lh, this.f8070le, this.ouw);
                    leVar.setVideoCacheUrl(this.ryl);
                    leVar.setControllerStatusCallBack(new le.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.2
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                        public final void ouw(boolean z3, long j, long j8, long j9, boolean z10) {
                        }
                    });
                    leVar.setIsAutoPlay(this.tlj);
                    leVar.ouw(this.f8069cf, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f8071lh) && leVar != null && leVar.ouw(0L, true, false)) {
                    return leVar;
                }
            } else {
                leVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f8071lh)) {
                }
            }
        }
        return null;
    }

    public void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f8071lh, null);
        }
    }

    public abstract void ouw(View view, int i4, com.bytedance.sdk.openadsdk.core.model.ko koVar);

    public void setDislikeInner(cd cdVar) {
        if (cdVar instanceof com.bytedance.sdk.openadsdk.lh.lh) {
            this.yu = (com.bytedance.sdk.openadsdk.lh.lh) cdVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        if (tTDislikeDialogAbstract != null && (vppVar = this.f8071lh) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
        }
        this.fkw = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public ouw(Context context, String str) {
        super(context);
        this.f8070le = "embeded_ad";
        this.tlj = true;
        this.f8069cf = true;
        this.ryl = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public final void ouw(View view, boolean z3) {
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar;
        if (view == null) {
            return;
        }
        if (z3) {
            Context context = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f8071lh;
            String str = this.f8070le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
        } else {
            Context context2 = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f8071lh;
            String str2 = this.f8070le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.vt(context2, vppVar2, str2, uoy.ouw(str2));
        }
        view.setOnTouchListener(vtVar);
        view.setOnClickListener(vtVar);
        vtVar.ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.vt
            public final void ouw(View view2, int i4, com.bytedance.sdk.openadsdk.core.model.ko koVar) {
                ouw.this.ouw(view2, i4, koVar);
            }
        });
    }

    public final void ouw(int i4) {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f8069cf = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(this.bly));
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(i4);
        if (3 == iVt) {
            this.tlj = false;
            return;
        }
        int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (1 != iVt || !uoy.yu(iOuw)) {
            if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.tlj = true;
                    return;
                }
                return;
            }
            if (5 != iVt) {
                return;
            }
            if (!uoy.yu(iOuw) && !uoy.le(iOuw)) {
                return;
            }
        }
        this.tlj = true;
    }

    public final void ouw(View view) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f8071lh;
        if (vppVar == null || vppVar.f8309sd == null || view == null) {
            return;
        }
        ouw(view, vppVar.ln == 1 && this.tlj);
    }
}
