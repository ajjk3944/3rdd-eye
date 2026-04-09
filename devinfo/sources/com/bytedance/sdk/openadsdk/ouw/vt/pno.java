package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.rn;
import com.bytedance.sdk.openadsdk.utils.od;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pno extends PAGNativeAd {
    private boolean bly;
    public ouw fkw;

    /* renamed from: le, reason: collision with root package name */
    protected int f8615le;

    /* renamed from: lh, reason: collision with root package name */
    public final vpp f8616lh;
    private boolean ouw;
    protected String pno;
    protected int ra;
    public rn vt;
    protected final Context yu;

    public pno(Context context, vpp vppVar, boolean z3) {
        if (vppVar == null) {
            ko.yu("materialMeta can't been null");
        }
        this.f8616lh = vppVar;
        this.yu = context;
        this.f8615le = 5;
        this.ra = vppVar.fqk();
        String strLh = uoy.lh(5);
        this.pno = strLh;
        if (z3) {
            ouw ouwVar = new ouw(context, vppVar, strLh);
            this.fkw = ouwVar;
            this.vt = new rn(context, this, vppVar, "embeded_ad", ouwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Map<String, Object> map;
        vpp vppVar = this.f8616lh;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return null;
        }
        try {
            return map.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        vpp vppVar = this.f8616lh;
        if (vppVar != null) {
            return vppVar.npr;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new yu(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.f8616lh, d10, str, str2);
        this.bly = true;
    }

    public void ouw(String str) {
        this.pno = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerViewForInteraction(final android.view.ViewGroup r10, java.util.List<android.view.View> r11, java.util.List<android.view.View> r12, android.view.View r13, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.pno.registerViewForInteraction(android.view.ViewGroup, java.util.List, java.util.List, android.view.View, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener):void");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.ouw) {
            return;
        }
        od.ouw(this.f8616lh, d10);
        this.ouw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }
}
