package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.singular.sdk.internal.Constants;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2147u {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f21488a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f21489b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f21490c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f21491d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f21492e = null;

    /* renamed from: com.applovin.impl.u$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f21493a;

        /* renamed from: b, reason: collision with root package name */
        private String f21494b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0321a f21495c = EnumC0321a.NOT_SET;

        /* renamed from: com.applovin.impl.u$a$a, reason: collision with other inner class name */
        public enum EnumC0321a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: a, reason: collision with root package name */
            private final String f21500a;

            EnumC0321a(String str) {
                this.f21500a = str;
            }

            public String b() {
                return this.f21500a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0321a b() {
            return this.f21495c;
        }

        public boolean c() {
            return this.f21493a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0321a enumC0321aB = b();
            EnumC0321a enumC0321aB2 = aVar.b();
            return enumC0321aB != null ? enumC0321aB.equals(enumC0321aB2) : enumC0321aB2 == null;
        }

        public int hashCode() {
            int i = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0321a enumC0321aB = b();
            return (iHashCode * 59) + (enumC0321aB != null ? enumC0321aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f21493a = z10;
        }

        public void a(String str) {
            this.f21494b = str;
        }

        public void a(EnumC0321a enumC0321a) {
            this.f21495c = enumC0321a;
        }

        public String a() {
            return this.f21494b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        a7.a();
        Object obj = f21489b;
        synchronized (obj) {
            try {
                if (f21491d) {
                    return f21492e;
                }
                Collection collection = f21490c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f21491d = true;
                        f21492e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e4) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e4);
                }
                synchronized (f21489b) {
                    aVar = f21492e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f21488a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, Constants.AMAZON_ADVERTISING_ID)));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0321a.ON : a.EnumC0321a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e4) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e4);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f21488a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        a7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0321a.ON : a.EnumC0321a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return a7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
