package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class kd2 {
    public static jd2 a(List videoAds) {
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : videoAds) {
            if (((za2) obj).o()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new jd2(arrayList2, arrayList);
    }
}
