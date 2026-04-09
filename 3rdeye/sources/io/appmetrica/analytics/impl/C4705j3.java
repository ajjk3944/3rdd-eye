package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4705j3 implements BillingInfoStorage {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f41106a;

    /* renamed from: b, reason: collision with root package name */
    public C5038w2 f41107b;

    public C4705j3(Context context) {
        this(Nm.a(C5038w2.class).a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f41107b.f41887a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f41107b.f41888b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<BillingInfo> list, boolean z10) {
        for (BillingInfo billingInfo : list) {
        }
        C5038w2 c5038w2 = new C5038w2(list, z10);
        this.f41107b = c5038w2;
        this.f41106a.save(c5038w2);
    }

    public C4705j3(ProtobufStateStorage protobufStateStorage) {
        this.f41106a = protobufStateStorage;
        this.f41107b = (C5038w2) protobufStateStorage.read();
    }
}
