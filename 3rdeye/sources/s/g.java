package s;

import A9.I;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f45885a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f45886b;

    /* compiled from: CustomTabsIntent.java */
    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* compiled from: CustomTabsIntent.java */
    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* compiled from: CustomTabsIntent.java */
    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public g(Intent intent, Bundle bundle) {
        this.f45885a = intent;
        this.f45886b = bundle;
    }

    /* compiled from: CustomTabsIntent.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f45887a;

        /* renamed from: b, reason: collision with root package name */
        public final I f45888b;

        /* renamed from: c, reason: collision with root package name */
        public ActivityOptions f45889c;

        /* renamed from: d, reason: collision with root package name */
        public SparseArray<Bundle> f45890d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f45891e;

        /* renamed from: f, reason: collision with root package name */
        public int f45892f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f45893g;

        public d() {
            this.f45887a = new Intent("android.intent.action.VIEW");
            this.f45888b = new I();
            this.f45892f = 0;
            this.f45893g = true;
        }

        public final g a() {
            Intent intent = this.f45887a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f45893g);
            this.f45888b.getClass();
            intent.putExtras(new Bundle());
            Bundle bundle2 = this.f45891e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.f45890d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f45890d);
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f45892f);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                String strA = b.a();
                if (!TextUtils.isEmpty(strA)) {
                    Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                    if (!bundleExtra.containsKey("Accept-Language")) {
                        bundleExtra.putString("Accept-Language", strA);
                        intent.putExtra("com.android.browser.headers", bundleExtra);
                    }
                }
            }
            if (i >= 34) {
                if (this.f45889c == null) {
                    this.f45889c = a.a();
                }
                c.a(this.f45889c, false);
            }
            ActivityOptions activityOptions = this.f45889c;
            return new g(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d(i iVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f45887a = intent;
            this.f45888b = new I();
            this.f45892f = 0;
            this.f45893g = true;
            if (iVar != null) {
                intent.setPackage(iVar.f45897d.getPackageName());
                BinderC5541e binderC5541e = iVar.f45896c;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", binderC5541e);
                intent.putExtras(bundle);
            }
        }
    }
}
