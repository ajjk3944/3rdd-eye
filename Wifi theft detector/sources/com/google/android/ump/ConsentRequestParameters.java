package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11532a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11533b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f11534c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11535a;

        /* renamed from: b, reason: collision with root package name */
        public String f11536b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f11537c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f11536b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f11537c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f11535a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f11532a = builder.f11535a;
        this.f11533b = builder.f11536b;
        this.f11534c = builder.f11537c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f11534c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f11532a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f11533b;
    }
}
