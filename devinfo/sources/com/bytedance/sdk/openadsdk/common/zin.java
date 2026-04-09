package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin {

    /* renamed from: cf, reason: collision with root package name */
    public boolean f7858cf;
    public com.bytedance.sdk.openadsdk.core.le.le fkw;

    /* renamed from: le, reason: collision with root package name */
    vm f7859le;

    /* renamed from: lh, reason: collision with root package name */
    final Context f7860lh;
    public final RelativeLayout ouw;
    TTAdDislikeToast ra;
    private TextView ryl;
    final vpp vt;
    ImageView yu;
    final AtomicBoolean pno = new AtomicBoolean(false);
    final AtomicBoolean bly = new AtomicBoolean(false);
    public final int tlj = osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 44.0f);

    public zin(Context context, RelativeLayout relativeLayout, vpp vppVar) {
        this.f7860lh = context;
        this.ouw = relativeLayout;
        this.vt = vppVar;
        this.yu = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8722ng);
        this.ryl = (TextView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.fwd);
        ImageView imageView = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.coz);
        this.fkw = (com.bytedance.sdk.openadsdk.core.le.le) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.lvd);
        if (vppVar != null) {
            this.ryl.setText(TextUtils.isEmpty(vppVar.fqk) ? com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_web_title_default") : vppVar.fqk);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final zin zinVar = zin.this;
                if (zinVar.bly.get()) {
                    zinVar.ra.show(TTAdDislikeToast.getDislikeTip());
                    return;
                }
                vm vmVar = zinVar.f7859le;
                if (vmVar == null) {
                    if (vmVar == null) {
                        try {
                            vm vmVar2 = new vm(zinVar.f7860lh, zinVar.vt);
                            zinVar.f7859le = vmVar2;
                            vmVar2.setDislikeSource("landing_page");
                            zinVar.f7859le.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.common.zin.6
                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw() {
                                    zin.this.pno.set(true);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void vt() {
                                    zin.this.pno.set(false);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw(FilterWord filterWord) {
                                    if (zin.this.bly.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                        return;
                                    }
                                    zin.this.bly.set(true);
                                }
                            });
                        } catch (Throwable th2) {
                            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) zinVar.ouw.getRootView().findViewById(R.id.content);
                    frameLayout.addView(zinVar.f7859le);
                    if (zinVar.ra == null) {
                        TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(zinVar.f7860lh);
                        zinVar.ra = tTAdDislikeToast;
                        frameLayout.addView(tTAdDislikeToast);
                    }
                }
                vm vmVar3 = zinVar.f7859le;
                if (vmVar3 != null) {
                    vmVar3.ouw();
                }
            }
        });
    }
}
