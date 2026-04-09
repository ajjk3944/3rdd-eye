package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vk {

    /* renamed from: a, reason: collision with root package name */
    private final yz1 f34610a = new yz1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final xz1 a(RectF viewRect, jj0 imageValue) {
        List<xz1> listC;
        kotlin.jvm.internal.l.f(viewRect, "viewRect");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        RectF rectF = new RectF(0.0f, 0.0f, imageValue.g(), imageValue.a());
        f02 f02VarE = imageValue.e();
        Object first = 0;
        if (f02VarE == null || (listC = f02VarE.c()) == null) {
            return null;
        }
        Iterator<T> it = listC.iterator();
        if (it.hasNext()) {
            first = it.next();
            while (it.hasNext()) {
                xz1 second = (xz1) it.next();
                first = (xz1) first;
                this.f34610a.getClass();
                kotlin.jvm.internal.l.f(first, "first");
                kotlin.jvm.internal.l.f(second, "second");
                float fA = b02.a(first, viewRect, rectF);
                float fA2 = b02.a(second, viewRect, rectF);
                if (fA != Float.MAX_VALUE) {
                    if (fA == fA2) {
                        if (first.a() > second.a()) {
                        }
                    } else if (fA > fA2) {
                    }
                }
                first = second;
            }
        }
        return (xz1) first;
    }
}
