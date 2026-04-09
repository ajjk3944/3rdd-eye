package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4148l2 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f29864a;

    public C4148l2(List<zs> adBreaks) {
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        this.f29864a = a(adBreaks);
    }

    private static LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put((zs) it.next(), EnumC4141k2.f29470b);
        }
        return linkedHashMap;
    }

    public final EnumC4141k2 a(zs adBreak) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        EnumC4141k2 enumC4141k2 = (EnumC4141k2) this.f29864a.get(adBreak);
        return enumC4141k2 == null ? EnumC4141k2.f29474f : enumC4141k2;
    }

    public final boolean a() {
        List listW = C2092m.W(EnumC4141k2.i, EnumC4141k2.f29476h);
        Collection collectionValues = this.f29864a.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (listW.contains((EnumC4141k2) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(zs adBreak, EnumC4141k2 status) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(status, "status");
        this.f29864a.put(adBreak, status);
    }
}
