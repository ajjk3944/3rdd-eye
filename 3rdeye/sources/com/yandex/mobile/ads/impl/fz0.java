package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ez0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fz0 {
    public static boolean a(ez0 network) {
        kotlin.jvm.internal.l.f(network, "network");
        List<ez0.c> listB = network.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            return true;
        }
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            if (!((ez0.c) it.next()).c()) {
                return false;
            }
        }
        return true;
    }
}
