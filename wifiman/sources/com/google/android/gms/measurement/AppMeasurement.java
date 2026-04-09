package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C4326d1;
import com.google.android.gms.measurement.internal.AbstractC4848f4;
import com.google.android.gms.measurement.internal.C4976v3;
import com.google.android.gms.measurement.internal.InterfaceC4883j5;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s3.AbstractC7901p;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f35760b;

    /* renamed from: a, reason: collision with root package name */
    private final a f35761a;

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

        ConditionalUserProperty(Bundle bundle) {
            AbstractC7901p.l(bundle);
            this.mAppId = (String) AbstractC4848f4.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC4848f4.a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC4848f4.a(bundle, "name", String.class, null);
            this.mValue = AbstractC4848f4.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC4848f4.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC4848f4.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC4848f4.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC4848f4.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC4848f4.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC4848f4.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC4848f4.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC4848f4.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC4848f4.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC4848f4.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC4848f4.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC4848f4.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements InterfaceC4883j5 {
        private a() {
        }
    }

    private AppMeasurement(C4976v3 c4976v3) {
        this.f35761a = new b(c4976v3);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f35760b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f35760b == null) {
                        InterfaceC4883j5 interfaceC4883j5B = b(context, null);
                        if (interfaceC4883j5B != null) {
                            f35760b = new AppMeasurement(interfaceC4883j5B);
                        } else {
                            f35760b = new AppMeasurement(C4976v3.a(context, new C4326d1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f35760b;
    }

    private static InterfaceC4883j5 b(Context context, Bundle bundle) {
        return (InterfaceC4883j5) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f35761a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f35761a.c(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f35761a.b(str);
    }

    @Keep
    public long generateEventId() {
        return this.f35761a.zzf();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f35761a.zzg();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listD = this.f35761a.d(str, str2);
        ArrayList arrayList = new ArrayList(listD == null ? 0 : listD.size());
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f35761a.zzh();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f35761a.zzi();
    }

    @Keep
    public String getGmpAppId() {
        return this.f35761a.zzj();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f35761a.zza(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f35761a.e(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f35761a.f(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC7901p.l(conditionalUserProperty);
        a aVar = this.f35761a;
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
            AbstractC4848f4.b(bundle, obj);
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
        aVar.a(bundle);
    }

    private AppMeasurement(InterfaceC4883j5 interfaceC4883j5) {
        this.f35761a = new com.google.android.gms.measurement.a(interfaceC4883j5);
    }
}
