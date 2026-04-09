package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20691b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f20693b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20695d;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20692a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f20694c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f20693b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f20692a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z3 = true;
            if (!f0.d()) {
                if (!this.f20692a.contains(f0.a(this.f20693b)) && !this.f20695d) {
                    z3 = false;
                }
            }
            return new ConsentDebugSettings(z3, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i4) {
            this.f20694c = i4;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z3) {
            this.f20695d = z3;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z3, Builder builder) {
        this.f20690a = z3;
        this.f20691b = builder.f20694c;
    }

    public int getDebugGeography() {
        return this.f20691b;
    }

    public boolean isTestDevice() {
        return this.f20690a;
    }
}
