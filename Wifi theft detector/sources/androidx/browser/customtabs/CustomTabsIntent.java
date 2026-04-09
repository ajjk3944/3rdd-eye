package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.a;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import n.e;

/* loaded from: classes.dex */
public final class CustomTabsIntent {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f1427a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1428b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ShareState {
    }

    public static class a {
        @DoNotInline
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        @Nullable
        @DoNotInline
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        @DoNotInline
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.f1427a = intent;
        this.f1428b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1427a.setData(uri);
        ContextCompat.startActivity(context, this.f1427a, this.f1428b);
    }

    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f1431c;

        /* renamed from: d, reason: collision with root package name */
        public ActivityOptions f1432d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f1433e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f1434f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f1435g;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1438j;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f1429a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        public final a.C0008a f1430b = new a.C0008a();

        /* renamed from: h, reason: collision with root package name */
        public int f1436h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1437i = true;

        public d() {
        }

        public CustomTabsIntent a() {
            if (!this.f1429a.hasExtra("android.support.customtabs.extra.SESSION")) {
                k(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f1431c;
            if (arrayList != null) {
                this.f1429a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f1433e;
            if (arrayList2 != null) {
                this.f1429a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1429a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1437i);
            this.f1429a.putExtras(this.f1430b.a().a());
            Bundle bundle = this.f1435g;
            if (bundle != null) {
                this.f1429a.putExtras(bundle);
            }
            if (this.f1434f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1434f);
                this.f1429a.putExtras(bundle2);
            }
            this.f1429a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1436h);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                d();
            }
            if (i10 >= 34) {
                l();
            }
            ActivityOptions activityOptions = this.f1432d;
            return new CustomTabsIntent(this.f1429a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d b(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f1429a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
            return this;
        }

        public d c(int i10, androidx.browser.customtabs.a aVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i10);
            }
            if (this.f1434f == null) {
                this.f1434f = new SparseArray();
            }
            this.f1434f.put(i10, aVar.a());
            return this;
        }

        public final void d() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f1429a.hasExtra("com.android.browser.headers") ? this.f1429a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f1429a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public d e(androidx.browser.customtabs.a aVar) {
            this.f1435g = aVar.a();
            return this;
        }

        public d f(Context context, int i10, int i11) {
            this.f1429a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", f0.c.a(context, i10, i11).b());
            return this;
        }

        public d g(int i10) {
            return h(i10, 0);
        }

        public d h(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f1429a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f1429a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public d i(boolean z10) {
            this.f1437i = z10;
            return this;
        }

        public d j(e eVar) {
            this.f1429a.setPackage(eVar.e().getPackageName());
            k(eVar.d(), eVar.f());
            return this;
        }

        public final void k(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1429a.putExtras(bundle);
        }

        public final void l() {
            if (this.f1432d == null) {
                this.f1432d = a.a();
            }
            c.a(this.f1432d, this.f1438j);
        }

        public d m(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1436h = i10;
            if (i10 == 1) {
                this.f1429a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i10 == 2) {
                this.f1429a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f1429a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public d n(boolean z10) {
            this.f1429a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public d o(Context context, int i10, int i11) {
            this.f1432d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public d p(boolean z10) {
            this.f1429a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }

        public d(e eVar) {
            if (eVar != null) {
                j(eVar);
            }
        }
    }
}
