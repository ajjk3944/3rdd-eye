package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oj0 {

    /* renamed from: a, reason: collision with root package name */
    private final lj0 f31393a = new lj0();

    public final void a(List<? extends ag<?>> assets, Map<String, Bitmap> images) {
        List<jj0> listA;
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(images, "images");
        for (ag<?> agVar : assets) {
            Object objD = agVar.d();
            if (kotlin.jvm.internal.l.b(agVar.c(), "media") && (objD instanceof sw0) && (listA = ((sw0) objD).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    this.f31393a.getClass();
                    if (lj0.a((jj0) obj, images)) {
                        arrayList.add(obj);
                    }
                }
                listA.retainAll(arrayList);
            }
        }
    }
}
