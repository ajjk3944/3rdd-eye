package com.ui.wifiman.model.support;

import ce.ApiNetworkWifimanDeviceInfo;
import com.ui.wifiman.model.support.a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c extends a.AbstractC1437a {

    /* renamed from: a, reason: collision with root package name */
    private final ApiNetworkWifimanDeviceInfo f43184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApiNetworkWifimanDeviceInfo info) {
        super(null);
        AbstractC6492s.i(info, "info");
        this.f43184a = info;
    }

    public final ApiNetworkWifimanDeviceInfo b() {
        return this.f43184a;
    }
}
