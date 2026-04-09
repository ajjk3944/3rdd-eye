package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5063x2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C4628g3 f42010a;

    public C5063x2() {
        this(new C4628g3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5113z2 fromModel(C5038w2 c5038w2) {
        C5113z2 c5113z2 = new C5113z2();
        c5113z2.f42159a = new C5088y2[c5038w2.f41887a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c5038w2.f41887a) {
            C5088y2[] c5088y2Arr = c5113z2.f42159a;
            this.f42010a.getClass();
            c5088y2Arr[i] = C4628g3.a(billingInfo);
            i++;
        }
        c5113z2.f42160b = c5038w2.f41888b;
        return c5113z2;
    }

    public C5063x2(C4628g3 c4628g3) {
        this.f42010a = c4628g3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5038w2 toModel(C5113z2 c5113z2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c5113z2.f42159a.length);
        for (C5088y2 c5088y2 : c5113z2.f42159a) {
            this.f42010a.getClass();
            int i = c5088y2.f42100a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c5088y2.f42101b, c5088y2.f42102c, c5088y2.f42103d, c5088y2.f42104e));
        }
        return new C5038w2(arrayList, c5113z2.f42160b);
    }
}
