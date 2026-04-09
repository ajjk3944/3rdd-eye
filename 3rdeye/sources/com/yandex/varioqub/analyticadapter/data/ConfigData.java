package com.yandex.varioqub.analyticadapter.data;

/* loaded from: classes3.dex */
public final class ConfigData {

    /* renamed from: a, reason: collision with root package name */
    private final String f36944a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36945b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36946c;

    public ConfigData(String str, String str2, long j4) {
        this.f36944a = str;
        this.f36945b = str2;
        this.f36946c = j4;
    }

    public final long getConfigLoadTimestamp() {
        return this.f36946c;
    }

    public final String getNewConfigVersion() {
        return this.f36945b;
    }

    public final String getOldConfigVersion() {
        return this.f36944a;
    }
}
