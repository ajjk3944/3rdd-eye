package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11526b;

    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f11528b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11530d;

        /* renamed from: a, reason: collision with root package name */
        public final List f11527a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f11529c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f11528b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f11527a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzcu.zza(true) && !this.f11527a.contains(zzcm.zza(this.f11528b)) && !this.f11530d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f11529c = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f11530d = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.f11525a = z10;
        this.f11526b = builder.f11529c;
    }

    public int getDebugGeography() {
        return this.f11526b;
    }

    public boolean isTestDevice() {
        return this.f11525a;
    }
}
