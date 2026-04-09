package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class fm {
    private fm() {
    }

    public static xj0 a(em.a aVar, ArrayList arrayList) {
        int i = xj0.f35328d;
        xj0.a aVar2 = new xj0.a();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            aVar2.b(aVar.fromBundle(bundle));
        }
        return aVar2.a();
    }
}
