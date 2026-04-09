package s5;

import J4.f;
import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.impl.Oo;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import r5.m;

/* compiled from: ConfigGetParameterHandler.java */
/* renamed from: s5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5577c {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f46074e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f46075f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f46076a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f46077b;

    /* renamed from: c, reason: collision with root package name */
    public final C5576b f46078c;

    /* renamed from: d, reason: collision with root package name */
    public final C5576b f46079d;

    static {
        Charset.forName(Constants.ENCODING);
        f46074e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f46075f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C5577c(Executor executor, C5576b c5576b, C5576b c5576b2) {
        this.f46077b = executor;
        this.f46078c = c5576b;
        this.f46079d = c5576b2;
    }

    public static HashSet c(C5576b c5576b) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b bVarC = c5576b.c();
        if (bVarC != null) {
            Iterator<String> itKeys = bVarC.f23299b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public static String d(C5576b c5576b, String str) {
        com.google.firebase.remoteconfig.internal.b bVarC = c5576b.c();
        if (bVarC == null) {
            return null;
        }
        try {
            return bVarC.f23299b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void f(String str, String str2) {
        Log.w("FirebaseRemoteConfig", Oo.h("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(m mVar) {
        synchronized (this.f46076a) {
            this.f46076a.add(mVar);
        }
    }

    public final void b(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f46076a) {
            try {
                Iterator it = this.f46076a.iterator();
                while (it.hasNext()) {
                    this.f46077b.execute(new f((BiConsumer) it.next(), str, bVar, 11));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5579e e(String str) {
        C5576b c5576b = this.f46078c;
        String strD = d(c5576b, str);
        if (strD != null) {
            b(str, c5576b.c());
            return new C5579e(strD, 2);
        }
        String strD2 = d(this.f46079d, str);
        if (strD2 != null) {
            return new C5579e(strD2, 1);
        }
        f(str, "FirebaseRemoteConfigValue");
        return new C5579e("", 0);
    }
}
