package com.monetization.ads.mediation.base;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedAdapterInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f23701a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23702b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23703c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f23704a;

        /* renamed from: b, reason: collision with root package name */
        private String f23705b;

        /* renamed from: c, reason: collision with root package name */
        private String f23706c;

        public final MediatedAdapterInfo build() {
            return new MediatedAdapterInfo(this.f23704a, this.f23705b, this.f23706c, null);
        }

        public final Builder setAdapterVersion(String adapterVersion) {
            l.f(adapterVersion, "adapterVersion");
            this.f23704a = adapterVersion;
            return this;
        }

        public final Builder setNetworkName(String networkName) {
            l.f(networkName, "networkName");
            this.f23705b = networkName;
            return this;
        }

        public final Builder setNetworkSdkVersion(String networkSdkVersion) {
            l.f(networkSdkVersion, "networkSdkVersion");
            this.f23706c = networkSdkVersion;
            return this;
        }
    }

    public /* synthetic */ MediatedAdapterInfo(String str, String str2, String str3, g gVar) {
        this(str, str2, str3);
    }

    public final String getAdapterVersion() {
        return this.f23701a;
    }

    public final String getNetworkName() {
        return this.f23702b;
    }

    public final String getNetworkSdkVersion() {
        return this.f23703c;
    }

    private MediatedAdapterInfo(String str, String str2, String str3) {
        this.f23701a = str;
        this.f23702b = str2;
        this.f23703c = str3;
    }
}
