package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23224a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23225b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f23227b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f23229d;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23226a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f23228c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f23227b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f23226a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzcu.zza(true) && !this.f23226a.contains(zzcm.zza(this.f23227b)) && !this.f23229d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.f23228c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f23229d = z10;
            return this;
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder) {
        this.f23224a = z10;
        this.f23225b = builder.f23228c;
    }

    public int getDebugGeography() {
        return this.f23225b;
    }

    public boolean isTestDevice() {
        return this.f23224a;
    }
}
