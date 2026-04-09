package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import cc.a;
import cc.b;
import cc.c;
import com.google.android.gms.internal.measurement.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
import ec.b2;
import ec.o1;
import ec.r2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f20278b;

    /* renamed from: a, reason: collision with root package name */
    public final c f20279a;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(o1 o1Var) {
        this.f20279a = new a(o1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f20278b == null) {
            synchronized (AppMeasurement.class) {
                if (f20278b == null) {
                    r2 r2Var = (r2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (r2Var != null) {
                        f20278b = new AppMeasurement(r2Var);
                    } else {
                        f20278b = new AppMeasurement(o1.s(context, new t0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f20278b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f20279a.O(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f20279a.N(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f20279a.L(str);
    }

    @Keep
    public long generateEventId() {
        return this.f20279a.B1();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f20279a.A1();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listQ = this.f20279a.Q(str, str2);
        ArrayList arrayList = new ArrayList(listQ == null ? 0 : listQ.size());
        for (Bundle bundle : listQ) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            y.h(bundle);
            conditionalUserProperty.mAppId = (String) b2.e(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) b2.e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) b2.e(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = b2.e(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) b2.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) b2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) b2.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) b2.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) b2.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) b2.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) b2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) b2.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) b2.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) b2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) b2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) b2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f20279a.C1();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f20279a.z1();
    }

    @Keep
    public String getGmpAppId() {
        return this.f20279a.D1();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f20279a.P(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z3) {
        return this.f20279a.R(str, str2, z3);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f20279a.M(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            b2.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f20279a.D(bundle);
    }

    public AppMeasurement(r2 r2Var) {
        this.f20279a = new b(r2Var);
    }
}
