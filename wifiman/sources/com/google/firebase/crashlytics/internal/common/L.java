package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.M;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class L implements M {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f38741g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f38742h = Pattern.quote(MqttTopic.TOPIC_LEVEL_SEPARATOR);

    /* renamed from: a, reason: collision with root package name */
    private final N f38743a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38744b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38745c;

    /* renamed from: d, reason: collision with root package name */
    private final g5.e f38746d;

    /* renamed from: e, reason: collision with root package name */
    private final G f38747e;

    /* renamed from: f, reason: collision with root package name */
    private M.a f38748f;

    public L(Context context, String str, g5.e eVar, G g10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f38744b = context;
        this.f38745c = str;
        this.f38746d = eVar;
        this.f38747e = g10;
        this.f38743a = new N();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        I4.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f38741g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f38742h, "");
    }

    private boolean n() {
        M.a aVar = this.f38748f;
        return aVar == null || (aVar.e() == null && this.f38747e.d());
    }

    @Override // com.google.firebase.crashlytics.internal.common.M
    public synchronized M.a a() {
        if (!n()) {
            return this.f38748f;
        }
        I4.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = AbstractC5107i.q(this.f38744b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        I4.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f38747e.d()) {
            K kD = d(false);
            I4.g.f().i("Fetched Firebase Installation ID: " + kD.b());
            if (kD.b() == null) {
                kD = new K(string == null ? c() : string, null);
            }
            if (Objects.equals(kD.b(), string)) {
                this.f38748f = M.a.a(l(sharedPreferencesQ), kD);
            } else {
                this.f38748f = M.a.a(b(kD.b(), sharedPreferencesQ), kD);
            }
        } else if (k(string)) {
            this.f38748f = M.a.b(l(sharedPreferencesQ));
        } else {
            this.f38748f = M.a.b(b(c(), sharedPreferencesQ));
        }
        I4.g.f().i("Install IDs: " + this.f38748f);
        return this.f38748f;
    }

    public K d(boolean z10) {
        String strB;
        L4.f.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) Tasks.await(this.f38746d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                I4.g.f().l("Error getting Firebase authentication token.", e10);
            }
        } else {
            strB = null;
        }
        try {
            str = (String) Tasks.await(this.f38746d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            I4.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new K(str, strB);
    }

    public String f() {
        return this.f38745c;
    }

    public String g() {
        return this.f38743a.a(this.f38744b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
