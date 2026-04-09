package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends FrameLayout {
    private TextView bly;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.pno f8473cf;
    private boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private zih f8474le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8475lh;
    public vpp ouw;
    private rn pno;
    private TextView ra;
    private PAGLogoView tlj;
    public String vt;
    public com.bytedance.sdk.openadsdk.core.lh.ouw yu;

    public bly(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f8734vi);
    }

    public final void setClickListener(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.yu = ouwVar;
        TextView textView = this.bly;
        if (textView != null) {
            textView.setOnClickListener(ouwVar);
            this.bly.setOnTouchListener(this.yu);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i4) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        super.setVisibility(i4);
        if (i4 != 0 || this.fkw) {
            return;
        }
        this.fkw = true;
        Context context = getContext();
        boolean z3 = this.ouw.jqy() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setGravity(1);
        fkwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z3 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(osn.ouw(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iOuw = osn.ouw(context, 24.0f);
        layoutParams.rightMargin = iOuw;
        layoutParams.leftMargin = iOuw;
        addView(fkwVar, layoutParams);
        zih zihVar2 = new zih(context);
        this.f8474le = zihVar2;
        zihVar2.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
        layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(this.f8474le, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.ra = pnoVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pnoVar.setEllipsize(truncateAt);
        this.ra.setGravity(17);
        this.ra.setMaxLines(2);
        this.ra.setMaxWidth(osn.ouw(context, 180.0f));
        this.ra.setTextColor(-1);
        this.ra.setTextSize(2, 24.0f);
        fkwVar.addView(this.ra, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f8473cf = pnoVar2;
        pnoVar2.setEllipsize(truncateAt);
        this.f8473cf.setGravity(17);
        this.f8473cf.setMaxLines(2);
        this.f8473cf.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.f8473cf.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = osn.ouw(context, 8.0f);
        fkwVar.addView(this.f8473cf, layoutParams3);
        this.pno = new rn(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
        layoutParams4.topMargin = osn.ouw(context, 12.0f);
        this.pno.setVisibility(8);
        fkwVar.addView(this.pno, layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.bly = pnoVar3;
        pnoVar3.setId(520093707);
        this.bly.setGravity(17);
        this.bly.setText(com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_video_download_apk"));
        this.bly.setTextColor(-1);
        this.bly.setTextSize(2, 16.0f);
        this.bly.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, osn.ouw(context, 44.0f));
        layoutParams5.topMargin = osn.ouw(context, 54.0f);
        fkwVar.addView(this.bly, layoutParams5);
        if (!this.f8475lh && this.ouw.an() && od.lh(this.ouw)) {
            this.bly.setVisibility(8);
        }
        this.tlj = PAGLogoView.createPAGLogoViewByMaterial(context, this.ouw);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = osn.ouw(context, 18.0f);
        if (z3) {
            layoutParams6.bottomMargin = osn.ouw(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = osn.ouw(context, 24.0f);
        }
        addView(this.tlj, layoutParams6);
        this.bly.setOnClickListener(this.yu);
        this.bly.setOnTouchListener(this.yu);
        String strVpp = this.ouw.vpp();
        if (!TextUtils.isEmpty(strVpp)) {
            this.bly.setText(strVpp);
        }
        if (this.f8474le != null && (zihVar = this.ouw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.f8474le, vppVar);
        }
        rn rnVar = this.pno;
        if (rnVar != null) {
            osn.ouw((TextView) null, rnVar, this.ouw);
            if (this.ouw.wp != null) {
                this.pno.setVisibility(0);
            }
        }
        if (this.ra != null) {
            com.bytedance.sdk.openadsdk.core.model.le leVar = this.ouw.wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                this.ra.setText(this.ouw.wp.vt);
            } else if (TextUtils.isEmpty(this.ouw.f8315vh)) {
                this.ra.setVisibility(8);
            } else {
                this.ra.setText(this.ouw.f8315vh);
            }
        }
        if (this.f8473cf != null) {
            String str = this.ouw.fqk;
            if (TextUtils.isEmpty(str)) {
                this.f8473cf.setVisibility(8);
            } else {
                this.f8473cf.setText(str);
            }
        }
        this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.bly.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    TTWebsiteActivity.ouw(bly.this.getContext(), bly.this.ouw, bly.this.vt);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
