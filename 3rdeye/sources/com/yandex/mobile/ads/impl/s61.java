package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s61 {

    /* renamed from: a, reason: collision with root package name */
    private final c51 f32883a;

    public /* synthetic */ s61() {
        this(new c51());
    }

    public final List<String> a(p61 responseBody) {
        kotlin.jvm.internal.l.f(responseBody, "responseBody");
        List<w31> listE = responseBody.e();
        ArrayList arrayList = new ArrayList(C2092m.T(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f32883a.a((w31) it.next()));
        }
        return C2092m.U(arrayList);
    }

    public s61(c51 nativeAdDataExtractor) {
        kotlin.jvm.internal.l.f(nativeAdDataExtractor, "nativeAdDataExtractor");
        this.f32883a = nativeAdDataExtractor;
    }
}
