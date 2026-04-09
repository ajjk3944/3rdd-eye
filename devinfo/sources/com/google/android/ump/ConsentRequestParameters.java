package com.google.android.ump;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20698b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f20699c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20700d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20701a;

        /* renamed from: b, reason: collision with root package name */
        public String f20702b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f20703c;

        /* renamed from: d, reason: collision with root package name */
        public String f20704d;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        public Builder setAdMobAppId(String str) {
            this.f20702b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f20703c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentSyncId(@RecentlyNonNull String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.f20704d = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z3) {
            this.f20701a = z3;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f20697a = builder.f20701a;
        this.f20698b = builder.f20702b;
        this.f20699c = builder.f20703c;
        this.f20700d = builder.f20704d;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f20699c;
    }

    @RecentlyNullable
    public String getConsentSyncId() {
        return this.f20700d;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f20697a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f20698b;
    }
}
