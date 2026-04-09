package com.yandex.mobile.ads.impl;

import c9.C2078B;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4235y {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f35556a;

    /* renamed from: b, reason: collision with root package name */
    private final d82 f35557b;

    /* renamed from: c, reason: collision with root package name */
    private final n62 f35558c;

    /* renamed from: d, reason: collision with root package name */
    private final a10 f35559d;

    /* renamed from: e, reason: collision with root package name */
    private final b30 f35560e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, ? extends InterfaceC4228x<?>> f35561f;

    public /* synthetic */ C4235y(mp1 mp1Var) {
        this(mp1Var, new d82(), new n62(), new a10(), new b30(mp1Var));
    }

    public final InterfaceC4228x<?> a(JSONObject jsonObject, qj base64EncodingParameters) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonObject, "jsonObject");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        String strA = y81.a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        Map<String, ? extends InterfaceC4228x<?>> mapO = this.f35561f;
        if (mapO == null) {
            b9.l lVar = new b9.l("adtune", new eb(this.f35557b, this.f35558c));
            b9.l lVar2 = new b9.l("divkit_adtune", new k20(this.f35559d, this.f35560e, this.f35558c, base64EncodingParameters.a()));
            b9.l lVar3 = new b9.l(com.vungle.ads.internal.presenter.g.CLOSE, new hp());
            d82 d82Var = this.f35557b;
            b9.l lVar4 = new b9.l("deeplink", new ry(d82Var, new wj1(d82Var)));
            b9.l lVar5 = new b9.l("feedback", new la0(this.f35557b));
            mp1 mp1Var = this.f35556a;
            mapO = C2078B.o(lVar, lVar2, lVar3, lVar4, lVar5, new b9.l("social_action", new r02(mp1Var, base64EncodingParameters, new o02(new jr0(mp1Var)))));
            this.f35561f = mapO;
        }
        return mapO.get(strA);
    }

    public C4235y(mp1 reporter, d82 urlJsonParser, n62 trackingUrlsParser, a10 designJsonParser, b30 divKitDesignParser) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(urlJsonParser, "urlJsonParser");
        kotlin.jvm.internal.l.f(trackingUrlsParser, "trackingUrlsParser");
        kotlin.jvm.internal.l.f(designJsonParser, "designJsonParser");
        kotlin.jvm.internal.l.f(divKitDesignParser, "divKitDesignParser");
        this.f35556a = reporter;
        this.f35557b = urlJsonParser;
        this.f35558c = trackingUrlsParser;
        this.f35559d = designJsonParser;
        this.f35560e = divKitDesignParser;
    }
}
