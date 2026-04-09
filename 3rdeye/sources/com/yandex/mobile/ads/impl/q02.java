package com.yandex.mobile.ads.impl;

import com.github.appintro.AppIntroBaseFragmentKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q02 implements mg<p02> {

    /* renamed from: a, reason: collision with root package name */
    private final bj0 f31966a;

    public /* synthetic */ q02() {
        this(new bj0());
    }

    @Override // com.yandex.mobile.ads.impl.mg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p02 a(JSONObject jsonAsset) throws k61, JSONException {
        kotlin.jvm.internal.l.f(jsonAsset, "jsonAsset");
        String strA = y81.a(jsonAsset, "jsonAsset", AppIntroBaseFragmentKt.ARG_TITLE, "jsonAttribute", AppIntroBaseFragmentKt.ARG_TITLE);
        if (strA == null || strA.length() == 0 || strA.equals("null")) {
            throw new k61("Native Ad json has not required attributes");
        }
        JSONObject jSONObject = jsonAsset.getJSONObject("image");
        bj0 bj0Var = this.f31966a;
        kotlin.jvm.internal.l.c(jSONObject);
        return new p02(bj0Var.b(jSONObject), strA);
    }

    public q02(bj0 imageParser) {
        kotlin.jvm.internal.l.f(imageParser, "imageParser");
        this.f31966a = imageParser;
    }
}
