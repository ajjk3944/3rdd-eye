package com.yandex.mobile.ads.impl;

import H6.C0675l;
import N7.C1418x4;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uz1 {

    /* renamed from: a, reason: collision with root package name */
    private final pz1 f34259a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f34260b;

    /* renamed from: c, reason: collision with root package name */
    private final d20 f34261c;

    /* renamed from: d, reason: collision with root package name */
    private final r70 f34262d;

    /* renamed from: e, reason: collision with root package name */
    private final xg f34263e;

    public uz1(pz1 sliderAdPrivate, mp1 reporter, d20 divExtensionProvider, r70 extensionPositionParser, i61 assetNamesProvider, xg assetsNativeAdViewProviderCreator) {
        kotlin.jvm.internal.l.f(sliderAdPrivate, "sliderAdPrivate");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divExtensionProvider, "divExtensionProvider");
        kotlin.jvm.internal.l.f(extensionPositionParser, "extensionPositionParser");
        kotlin.jvm.internal.l.f(assetNamesProvider, "assetNamesProvider");
        kotlin.jvm.internal.l.f(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f34259a = sliderAdPrivate;
        this.f34260b = reporter;
        this.f34261c = divExtensionProvider;
        this.f34262d = extensionPositionParser;
        this.f34263e = assetsNativeAdViewProviderCreator;
    }

    public final void a(C0675l div2View, View view, N7.S2 divBase) {
        Integer numValueOf;
        kotlin.jvm.internal.l.f(div2View, "div2View");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(divBase, "divBase");
        view.setVisibility(8);
        this.f34261c.getClass();
        C1418x4 c1418x4A = d20.a(divBase, "view");
        if (c1418x4A != null) {
            this.f34262d.getClass();
            JSONObject jSONObject = c1418x4A.f9756b;
            if (jSONObject != null) {
                try {
                    numValueOf = Integer.valueOf(jSONObject.getInt("position"));
                } catch (JSONException unused) {
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                ArrayList arrayListD = this.f34259a.d();
                if (numValueOf.intValue() < 0 || numValueOf.intValue() >= arrayListD.size()) {
                    return;
                }
                try {
                    ((h61) arrayListD.get(numValueOf.intValue())).b(this.f34263e.a(view, new od1(numValueOf.intValue())), p10.a(div2View).a(numValueOf.intValue()));
                    view.setVisibility(0);
                } catch (v51 e4) {
                    this.f34260b.reportError("Failed to bind DivKit Slider Inner Ad", e4);
                }
            }
        }
    }
}
