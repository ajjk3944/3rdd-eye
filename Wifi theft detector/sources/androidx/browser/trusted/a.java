package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.browser.trusted.a$a, reason: collision with other inner class name */
    public static class C0009a {

        /* renamed from: a, reason: collision with root package name */
        public final Parcelable[] f1456a;

        public C0009a(Parcelable[] parcelableArr) {
            this.f1456a = parcelableArr;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f1456a);
            return bundle;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1457a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1458b;

        public b(String str, int i10) {
            this.f1457a = str;
            this.f1458b = i10;
        }

        public static b a(Bundle bundle) {
            a.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            a.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f1459a;

        public c(String str) {
            this.f1459a = str;
        }

        public static c a(Bundle bundle) {
            a.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f1460a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1461b;

        /* renamed from: c, reason: collision with root package name */
        public final Notification f1462c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1463d;

        public d(String str, int i10, Notification notification, String str2) {
            this.f1460a = str;
            this.f1461b = i10;
            this.f1462c = notification;
            this.f1463d = str2;
        }

        public static d a(Bundle bundle) {
            a.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            a.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            a.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            a.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1464a;

        public e(boolean z10) {
            this.f1464a = z10;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f1464a);
            return bundle;
        }
    }

    public static void a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
