package com.applovin.impl;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f20554a = new StringBuilder();

    public n2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public n2 b(String str) {
        this.f20554a.append(str);
        return this;
    }

    public String toString() {
        return this.f20554a.toString();
    }

    public n2 a(String str, Object obj, String str2) {
        StringBuilder sb = this.f20554a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public n2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.g0()).a("close_style", bVar.q()).a("close_delay_graphic", Long.valueOf(bVar.s()), "s");
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.o1().substring(0, Math.min(aVar.o1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.o0()), "s").a("skip_style", bVar.e0()).a("Streaming", Boolean.valueOf(bVar.Q0())).a("Video Location", bVar.S()).a("video_button_properties", bVar.m0());
        }
        return this;
    }

    public n2 a(String str) {
        StringBuilder sb = this.f20554a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public n2 a() {
        this.f20554a.append("\n========================================");
        return this;
    }

    public n2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z10 = bVar instanceof b7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((b7) bVar).v1());
        }
        return this;
    }

    public n2 a(q2 q2Var) {
        return a("Network", q2Var.c()).a("Adapter Version", q2Var.z()).a("Format", q2Var.getFormat().getLabel()).a("Ad Unit ID", q2Var.getAdUnitId()).a("Placement", q2Var.getPlacement()).a("Network Placement", q2Var.P()).a("Serve ID", q2Var.O()).a("Creative ID", StringUtils.isValidString(q2Var.getCreativeId()) ? q2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(q2Var.v()) ? q2Var.v() : "None").a("DSP Name", StringUtils.isValidString(q2Var.getDspName()) ? q2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(q2Var.getDspId()) ? q2Var.getDspId() : "None").a("Server Parameters", q2Var.l());
    }

    public n2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", r7.a(appLovinAdView.getVisibility()));
    }

    public n2 a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.n0().isMuted()));
    }

    public n2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
