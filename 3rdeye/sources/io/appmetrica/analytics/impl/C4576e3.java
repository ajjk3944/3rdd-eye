package io.appmetrica.analytics.impl;

import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4576e3 implements ChargeTypeProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final ChargeType f40779d = ChargeType.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f40780a;

    /* renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f40781b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40782c = new ArrayList();

    public C4576e3(ICommonExecutor iCommonExecutor, C4499b3 c4499b3) {
        C4551d3 c4551d3 = new C4551d3(this);
        this.f40780a = iCommonExecutor;
        this.f40781b = a(c4499b3.a(c4551d3));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f40779d;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(numValueOf, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f40781b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f40781b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f40782c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
