package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4136j4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f28948a = "yandex_ad_info";

    public static String a(hb2 videoAdExtensions) {
        Object next;
        kotlin.jvm.internal.l.f(videoAdExtensions, "videoAdExtensions");
        Iterator<T> it = videoAdExtensions.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((p70) next).a(), f28948a)) {
                break;
            }
        }
        p70 p70Var = (p70) next;
        if (p70Var != null) {
            return p70Var.b();
        }
        return null;
    }
}
