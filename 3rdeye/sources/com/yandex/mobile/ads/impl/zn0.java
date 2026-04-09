package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zn0 implements fc2<tn0> {

    /* renamed from: a, reason: collision with root package name */
    private final at f36560a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36561b;

    /* renamed from: c, reason: collision with root package name */
    private final gz1 f36562c;

    /* renamed from: d, reason: collision with root package name */
    private final k10 f36563d;

    /* renamed from: e, reason: collision with root package name */
    private final lb2 f36564e;

    /* renamed from: f, reason: collision with root package name */
    private final rl0 f36565f;

    public zn0(C4078b2 adBreak, at adBreakPosition, long j4, gz1 skipInfoParser, k10 disableSkipChecker, lb2 videoAdIdProvider, rl0 instreamAdInfoProvider) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        kotlin.jvm.internal.l.f(skipInfoParser, "skipInfoParser");
        kotlin.jvm.internal.l.f(disableSkipChecker, "disableSkipChecker");
        kotlin.jvm.internal.l.f(videoAdIdProvider, "videoAdIdProvider");
        kotlin.jvm.internal.l.f(instreamAdInfoProvider, "instreamAdInfoProvider");
        this.f36560a = adBreakPosition;
        this.f36561b = j4;
        this.f36562c = skipInfoParser;
        this.f36563d = disableSkipChecker;
        this.f36564e = videoAdIdProvider;
        this.f36565f = instreamAdInfoProvider;
    }

    @Override // com.yandex.mobile.ads.impl.fc2
    public final tn0 a(za2 videoAd, nu creative, sv0 vastMediaFile, mc2 adPodInfo, String str, String str2, JSONObject jSONObject) {
        Object next;
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(creative, "creative");
        kotlin.jvm.internal.l.f(vastMediaFile, "vastMediaFile");
        kotlin.jvm.internal.l.f(adPodInfo, "adPodInfo");
        gz1 gz1Var = this.f36562c;
        if (this.f36563d.a()) {
            gz1Var = null;
        }
        bd2 bd2VarA = gz1Var != null ? gz1Var.a(creative) : null;
        kn0 kn0Var = new kn0(this.f36560a, vastMediaFile.f(), vastMediaFile.h(), vastMediaFile.d(), vastMediaFile.e(), Integer.valueOf(vastMediaFile.b()), vastMediaFile.a());
        List<sv0> listH = creative.h();
        ArrayList arrayList = new ArrayList(C2092m.T(listH, 10));
        for (sv0 sv0Var : listH) {
            arrayList.add(new kn0(this.f36560a, sv0Var.f(), sv0Var.h(), sv0Var.d(), sv0Var.e(), Integer.valueOf(sv0Var.b()), sv0Var.a()));
        }
        long jE = creative.e();
        lb2 lb2Var = this.f36564e;
        long j4 = this.f36561b;
        lb2Var.getClass();
        String strA = lb2.a(j4, adPodInfo, videoAd);
        this.f36565f.getClass();
        Iterator<T> it = videoAd.l().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((p70) next).a(), "bannerId")) {
                break;
            }
        }
        p70 p70Var = (p70) next;
        return new tn0(strA, kn0Var, arrayList, adPodInfo, bd2VarA, new pl0(videoAd.g(), creative.g(), p70Var != null ? p70Var.b() : null, str, str2, creative.b()), jSONObject, jE, videoAd.l().a());
    }
}
