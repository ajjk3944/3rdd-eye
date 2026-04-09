package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class yq implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0.a f35949a;

    /* renamed from: b, reason: collision with root package name */
    private final gu0[] f35950b;

    public yq(gu0... measureSpecProviders) {
        kotlin.jvm.internal.l.f(measureSpecProviders, "measureSpecProviders");
        this.f35949a = new gu0.a();
        this.f35950b = measureSpecProviders;
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        gu0[] gu0VarArr = this.f35950b;
        int length = gu0VarArr.length;
        int i11 = 0;
        while (i11 < length) {
            gu0.a aVarA = gu0VarArr[i11].a(i, i10);
            int i12 = aVarA.f27985a;
            i11++;
            i10 = aVarA.f27986b;
            i = i12;
        }
        gu0.a aVar = this.f35949a;
        aVar.f27985a = i;
        aVar.f27986b = i10;
        return aVar;
    }
}
