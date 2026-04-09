package cc;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final u.i0 f3655a = new u.i0(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f3656b;

    public static String a(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(xb.b.common_google_play_services_install_title);
            case 2:
                return resources.getString(xb.b.common_google_play_services_update_title);
            case 3:
                return resources.getString(xb.b.common_google_play_services_enable_title);
            case 4:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                io.sentry.android.core.e0.d("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                io.sentry.android.core.e0.d("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String strD = d(context);
        if (i10 == 1) {
            return resources.getString(xb.b.common_google_play_services_install_text, strD);
        }
        if (i10 == 2) {
            return gc.b.g(context) ? resources.getString(xb.b.common_google_play_services_wear_update_text) : resources.getString(xb.b.common_google_play_services_update_text, strD);
        }
        if (i10 == 3) {
            return resources.getString(xb.b.common_google_play_services_enable_text, strD);
        }
        if (i10 == 5) {
            return e(context, "common_google_play_services_invalid_account_text", strD);
        }
        if (i10 == 7) {
            return e(context, "common_google_play_services_network_error_text", strD);
        }
        if (i10 == 9) {
            return resources.getString(xb.b.common_google_play_services_unsupported_text, strD);
        }
        if (i10 == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", strD);
        }
        switch (i10) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", strD);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", strD);
            case 18:
                return resources.getString(xb.b.common_google_play_services_updating_text, strD);
            default:
                return resources.getString(zb.h.common_google_play_services_unknown_issue, strD);
        }
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(xb.b.common_google_play_services_enable_button) : resources.getString(xb.b.common_google_play_services_update_button) : resources.getString(xb.b.common_google_play_services_install_button);
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = ic.c.a(context).f11323a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String e(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(zb.h.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        u.i0 i0Var = f3655a;
        synchronized (i0Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f3656b)) {
                    i0Var.clear();
                    f3656b = locale;
                }
                String str2 = (String) i0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = zb.f.f26819a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 18);
                        sb2.append("Missing resource: ");
                        sb2.append(str);
                        io.sentry.android.core.e0.p("GoogleApiAvailability", sb2.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            i0Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb3 = new StringBuilder(str.length() + 20);
                        sb3.append("Got empty resource: ");
                        sb3.append(str);
                        io.sentry.android.core.e0.p("GoogleApiAvailability", sb3.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
