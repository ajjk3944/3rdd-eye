package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends FrameLayout {
    private com.bytedance.sdk.openadsdk.core.le.pno bly;
    private zih fkw;

    /* renamed from: le, reason: collision with root package name */
    private TextView f8476le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f8477lh;
    public vpp ouw;
    private PAGLogoView pno;
    private rn ra;
    public String vt;
    private boolean yu;

    public cf(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.npr);
    }

    public final void setClickListener(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.f8477lh = ouwVar;
    }

    @Override // android.view.View
    public final void setVisibility(int i4) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        super.setVisibility(i4);
        if (i4 != 0 || this.yu) {
            return;
        }
        this.yu = true;
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
        this.fkw = zihVar2;
        zihVar2.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
        layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(this.fkw, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f8476le = pnoVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pnoVar.setEllipsize(truncateAt);
        this.f8476le.setGravity(17);
        this.f8476le.setMaxLines(2);
        this.f8476le.setMaxWidth(osn.ouw(context, 180.0f));
        this.f8476le.setTextColor(-1);
        this.f8476le.setTextSize(2, 24.0f);
        fkwVar.addView(this.f8476le, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.bly = pnoVar2;
        pnoVar2.setEllipsize(truncateAt);
        this.bly.setGravity(17);
        this.bly.setMaxLines(2);
        this.bly.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.bly.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = osn.ouw(context, 8.0f);
        fkwVar.addView(this.bly, layoutParams3);
        this.ra = new rn(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
        layoutParams4.topMargin = osn.ouw(context, 12.0f);
        this.ra.setVisibility(8);
        fkwVar.addView(this.ra, layoutParams4);
        this.pno = PAGLogoView.createPAGLogoViewByMaterial(context, this.ouw);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = osn.ouw(context, 18.0f);
        if (z3) {
            layoutParams5.bottomMargin = osn.ouw(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = osn.ouw(context, 24.0f);
        }
        addView(this.pno, layoutParams5);
        if (this.fkw != null && (zihVar = this.ouw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.fkw, vppVar);
        }
        rn rnVar = this.ra;
        if (rnVar != null) {
            osn.ouw((TextView) null, rnVar, this.ouw);
            if (this.ouw.wp != null) {
                this.ra.setVisibility(0);
            }
        }
        if (this.f8476le != null) {
            com.bytedance.sdk.openadsdk.core.model.le leVar = this.ouw.wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                this.f8476le.setText(this.ouw.wp.vt);
            } else if (TextUtils.isEmpty(this.ouw.f8315vh)) {
                this.f8476le.setVisibility(8);
            } else {
                this.f8476le.setText(this.ouw.f8315vh);
            }
        }
        if (this.bly != null) {
            String str = this.ouw.fqk;
            if (TextUtils.isEmpty(str)) {
                this.bly.setVisibility(8);
            } else {
                this.bly.setText(str);
            }
        }
        this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.cf.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    TTWebsiteActivity.ouw(cf.this.getContext(), cf.this.ouw, cf.this.vt);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
