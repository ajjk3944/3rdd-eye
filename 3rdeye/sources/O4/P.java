package O4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes2.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f10274g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f10275h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final S f10276a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10278c;

    /* renamed from: d, reason: collision with root package name */
    public final h5.c f10279d;

    /* renamed from: e, reason: collision with root package name */
    public final J f10280e;

    /* renamed from: f, reason: collision with root package name */
    public C1457c f10281f;

    public P(Context context, String str, h5.c cVar, J j4) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f10277b = context;
        this.f10278c = str;
        this.f10279d = cVar;
        this.f10280e = j4;
        this.f10276a = new S();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f10274g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final O b(boolean z10) {
        String strA;
        h5.c cVar = this.f10279d;
        String str = null;
        if (z10) {
            try {
                strA = ((h5.g) U.a(cVar.a())).a();
            } catch (Exception e4) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e4);
            }
        } else {
            strA = null;
        }
        try {
            str = (String) U.a(cVar.getId());
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new O(str, strA);
    }

    public final synchronized Q c() {
        String str;
        C1457c c1457c = this.f10281f;
        if (c1457c != null && (c1457c.f10302b != null || !this.f10280e.a())) {
            return this.f10281f;
        }
        L4.e eVar = L4.e.f4061a;
        eVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f10277b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        eVar.c("Cached Firebase Installation ID: " + string);
        if (this.f10280e.a()) {
            O oB = b(false);
            eVar.c("Fetched Firebase Installation ID: " + oB.f10272a);
            if (oB.f10272a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                oB = new O(str, null);
            }
            if (Objects.equals(oB.f10272a, string)) {
                this.f10281f = new C1457c(sharedPreferences.getString("crashlytics.installation.id", null), oB.f10272a, oB.f10273b);
            } else {
                this.f10281f = new C1457c(a(sharedPreferences, oB.f10272a), oB.f10272a, oB.f10273b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f10281f = new C1457c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f10281f = new C1457c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        eVar.c("Install IDs: " + this.f10281f);
        return this.f10281f;
    }

    public final String d() {
        String str;
        S s10 = this.f10276a;
        Context context = this.f10277b;
        synchronized (s10) {
            try {
                if (s10.f10282a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    s10.f10282a = installerPackageName;
                }
                str = "".equals(s10.f10282a) ? null : s10.f10282a;
            } finally {
            }
        }
        return str;
    }
}
