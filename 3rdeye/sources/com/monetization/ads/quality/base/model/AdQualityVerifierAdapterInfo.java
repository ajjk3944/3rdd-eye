package com.monetization.ads.quality.base.model;

import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class AdQualityVerifierAdapterInfo {
    private final String adapterVersion;
    private final String verifierName;
    private final String verifierSdkVersion;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f23781a;

        /* renamed from: b, reason: collision with root package name */
        private String f23782b;

        /* renamed from: c, reason: collision with root package name */
        private String f23783c;

        public final AdQualityVerifierAdapterInfo build() {
            return new AdQualityVerifierAdapterInfo(this.f23781a, this.f23782b, this.f23783c, null);
        }

        public final Builder setAdapterVersion(String str) {
            this.f23781a = str;
            return this;
        }

        public final Builder setVerifierName(String str) {
            this.f23782b = str;
            return this;
        }

        public final Builder setVerifierSdkVersion(String str) {
            this.f23783c = str;
            return this;
        }
    }

    public /* synthetic */ AdQualityVerifierAdapterInfo(String str, String str2, String str3, g gVar) {
        this(str, str2, str3);
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getVerifierName() {
        return this.verifierName;
    }

    public final String getVerifierSdkVersion() {
        return this.verifierSdkVersion;
    }

    private AdQualityVerifierAdapterInfo(String str, String str2, String str3) {
        this.adapterVersion = str;
        this.verifierName = str2;
        this.verifierSdkVersion = str3;
    }
}
