package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23231b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f23232c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23233a;

        /* renamed from: b, reason: collision with root package name */
        public String f23234b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f23235c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(String str) {
            this.f23234b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f23235c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f23233a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f23230a = builder.f23233a;
        this.f23231b = builder.f23234b;
        this.f23232c = builder.f23235c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f23232c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f23230a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f23231b;
    }
}
