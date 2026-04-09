package je;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f27626h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final cl.u f27627a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f27628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27629c;

    /* renamed from: d, reason: collision with root package name */
    public final df.d f27630d;

    /* renamed from: e, reason: collision with root package name */
    public final t f27631e;

    /* renamed from: f, reason: collision with root package name */
    public c f27632f;

    public x(Context context, String str, df.d dVar, t tVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f27628b = context;
        this.f27629c = str;
        this.f27630d = dVar;
        this.f27631e = tVar;
        this.f27627a = new cl.u(1);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z3) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        df.d dVar = this.f27630d;
        if (z3) {
            try {
                str = ((df.a) Tasks.await(((df.c) dVar).f(), 10000L, TimeUnit.MILLISECONDS)).f22226a;
            } catch (Exception e2) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e2);
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((df.c) dVar).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new w(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f27632f;
        if (cVar != null && (cVar.f27539b != null || !this.f27631e.f())) {
            return this.f27632f;
        }
        ge.e eVar = ge.e.f24699a;
        eVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f27628b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        eVar.c("Cached Firebase Installation ID: " + string);
        if (this.f27631e.f()) {
            w wVarB = b(false);
            eVar.c("Fetched Firebase Installation ID: " + wVarB.f27624a);
            if (wVarB.f27624a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f27624a, string)) {
                this.f27632f = new c(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f27624a, wVarB.f27625b);
            } else {
                this.f27632f = new c(a(sharedPreferences, wVarB.f27624a), wVarB.f27624a, wVarB.f27625b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f27632f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f27632f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        eVar.c("Install IDs: " + this.f27632f);
        return this.f27632f;
    }

    public final String d() {
        String str;
        cl.u uVar = this.f27627a;
        Context context = this.f27628b;
        synchronized (uVar) {
            try {
                if (uVar.f2942b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    uVar.f2942b = installerPackageName;
                }
                str = "".equals(uVar.f2942b) ? null : uVar.f2942b;
            } finally {
            }
        }
        return str;
    }
}
