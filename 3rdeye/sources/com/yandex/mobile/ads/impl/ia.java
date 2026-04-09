package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ia {
    public static String a(List list) {
        Object next;
        Object obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C4185q4) next).a() == EnumC4191r4.f32454c) {
                    break;
                }
            }
            C4185q4 c4185q4 = (C4185q4) next;
            if (c4185q4 != null && (obj = c4185q4.b().get(EnumC4191r4.f32454c.a())) != null) {
                return obj.toString();
            }
        }
        return null;
    }
}
