package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg {
    public th fkw;

    /* renamed from: le, reason: collision with root package name */
    private final vpp f7832le;

    /* renamed from: lh, reason: collision with root package name */
    public ImageView f7833lh;
    public RelativeLayout ouw;
    private final String pno;
    private final Context ra;
    public com.bytedance.sdk.component.bly.le vt;
    public zin yu;

    public jg(Context context, vpp vppVar, String str) {
        this.ra = context;
        this.f7832le = vppVar;
        this.pno = str;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new tlj(context));
        com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(context, le.lh.LANDING_PAGE);
        int i4 = com.bytedance.sdk.openadsdk.utils.rn.ux;
        leVar.setId(i4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.myk;
        layoutParams.addRule(3, i10);
        relativeLayout.addView(leVar, layoutParams);
        bly blyVar = new bly(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(blyVar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(blyVar, layoutParams2);
        this.ouw = relativeLayout;
        this.vt = (com.bytedance.sdk.component.bly.le) relativeLayout.findViewById(i4);
        zin zinVar = new zin(context, (RelativeLayout) this.ouw.findViewById(i10), vppVar);
        this.yu = zinVar;
        this.f7833lh = zinVar.yu;
        this.fkw = new th(context, (LinearLayout) this.ouw.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8728sd), this.vt, vppVar, str);
    }
}
