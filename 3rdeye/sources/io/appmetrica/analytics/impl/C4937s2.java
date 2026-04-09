package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4937s2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4750km fromModel(C4911r2 c4911r2) {
        C4698im c4698im;
        C4750km c4750km = new C4750km();
        c4750km.f41157a = new C4724jm[c4911r2.f41527a.size()];
        for (int i = 0; i < c4911r2.f41527a.size(); i++) {
            C4724jm c4724jm = new C4724jm();
            Pair pair = (Pair) c4911r2.f41527a.get(i);
            c4724jm.f41123a = (String) pair.first;
            if (pair.second != null) {
                c4724jm.f41124b = new C4698im();
                C4886q2 c4886q2 = (C4886q2) pair.second;
                if (c4886q2 == null) {
                    c4698im = null;
                } else {
                    C4698im c4698im2 = new C4698im();
                    c4698im2.f41092a = c4886q2.f41449a;
                    c4698im = c4698im2;
                }
                c4724jm.f41124b = c4698im;
            }
            c4750km.f41157a[i] = c4724jm;
        }
        return c4750km;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4911r2 toModel(C4750km c4750km) {
        ArrayList arrayList = new ArrayList();
        for (C4724jm c4724jm : c4750km.f41157a) {
            String str = c4724jm.f41123a;
            C4698im c4698im = c4724jm.f41124b;
            arrayList.add(new Pair(str, c4698im == null ? null : new C4886q2(c4698im.f41092a)));
        }
        return new C4911r2(arrayList);
    }
}
