package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f5874a = new StringBuilder();

    public v2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public v2 b(String str) {
        this.f5874a.append(str);
        return this;
    }

    public String toString() {
        return this.f5874a.toString();
    }

    public v2 a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f5874a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }

    public v2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.W()).a("close_style", bVar.p()).a("close_delay_graphic", Long.valueOf(bVar.r()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.g1().substring(0, Math.min(aVar.g1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.d0()), "s").a("skip_style", bVar.U()).a("Streaming", Boolean.valueOf(bVar.C0())).a("Video Location", bVar.I()).a("video_button_properties", bVar.b0());
        }
        return this;
    }

    public v2 a(String str) {
        StringBuilder sb2 = this.f5874a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public v2 a() {
        this.f5874a.append("\n========================================");
        return this;
    }

    public v2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z3 = bVar instanceof o7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z3 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z3) {
            a("VAST DSP", ((o7) bVar).n1());
        }
        return this;
    }

    public v2 a(y2 y2Var) {
        return a("Network", y2Var.c()).a("Adapter Version", y2Var.z()).a("Format", y2Var.getFormat().getLabel()).a("Ad Unit ID", y2Var.getAdUnitId()).a("Placement", y2Var.getPlacement()).a("Network Placement", y2Var.R()).a("Serve ID", y2Var.Q()).a("Creative ID", StringUtils.isValidString(y2Var.getCreativeId()) ? y2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(y2Var.v()) ? y2Var.v() : "None").a("DSP Name", StringUtils.isValidString(y2Var.getDspName()) ? y2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(y2Var.getDspId()) ? y2Var.getDspId() : "None").a("Server Parameters", y2Var.l());
    }

    public v2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", e8.a(appLovinAdView.getVisibility()));
    }

    public v2 a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.n0().isMuted()));
    }

    public v2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
