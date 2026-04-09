package hf;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.android.core.e0;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f10724g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f10725h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final y f10726a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10727b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10728c;

    /* renamed from: d, reason: collision with root package name */
    public final fg.e f10729d;

    /* renamed from: e, reason: collision with root package name */
    public final cj.a f10730e;

    /* renamed from: f, reason: collision with root package name */
    public b f10731f;

    public x(Context context, String str, fg.e eVar, cj.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f10727b = context;
        this.f10728c = str;
        this.f10729d = eVar;
        this.f10730e = aVar;
        this.f10726a = new y();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f10724g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z10) {
        String str;
        if (Looper.getMainLooper().isCurrentThread()) {
            Thread.currentThread().getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        fg.e eVar = this.f10729d;
        String str2 = null;
        if (z10) {
            try {
                str = ((fg.a) e5.h(((fg.d) eVar).d(), 10000L, TimeUnit.MILLISECONDS)).f8838a;
            } catch (Exception e4) {
                e0.q("FirebaseCrashlytics", "Error getting Firebase authentication token.", e4);
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) e5.h(((fg.d) eVar).c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e0.q("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new w(str2, str);
    }

    public final synchronized b c() {
        String str;
        b bVar = this.f10731f;
        if (bVar != null && (bVar.f10641b != null || !this.f10730e.z())) {
            return this.f10731f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.f10727b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f10730e.z()) {
            w wVarB = b(false);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (wVarB.f10722a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f10722a, string)) {
                this.f10731f = new b(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f10722a, wVarB.f10723b);
            } else {
                this.f10731f = new b(a(sharedPreferences, wVarB.f10722a), wVarB.f10722a, wVarB.f10723b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f10731f = new b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f10731f = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f10731f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f10731f;
    }

    public final String d() {
        String str;
        y yVar = this.f10726a;
        Context context = this.f10727b;
        synchronized (yVar) {
            try {
                if (yVar.f10732a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yVar.f10732a = installerPackageName;
                }
                str = "".equals(yVar.f10732a) ? null : yVar.f10732a;
            } finally {
            }
        }
        return str;
    }
}
