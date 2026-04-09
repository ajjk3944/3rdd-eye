package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4551d3 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4576e3 f40682a;

    public C4551d3(C4576e3 c4576e3) {
        this.f40682a = c4576e3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f40682a.f40781b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f40682a.getClass();
        BatteryInfo batteryInfoA = C4576e3.a(intent);
        this.f40682a.f40781b = batteryInfoA;
        if (chargeType != batteryInfoA.chargeType) {
            this.f40682a.f40780a.execute(new C4525c3(this, batteryInfoA));
        }
    }
}
