package com.zipoapps.premiumhelper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.s;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.billing.ActivePurchaseInfo;
import com.zipoapps.premiumhelper.e;
import io.appmetrica.analytics.impl.Oo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import l8.a;
import va.a;

/* compiled from: Preferences.kt */
/* loaded from: classes3.dex */
public final class c implements l8.a {

    /* renamed from: b, reason: collision with root package name */
    public static long f37003b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f37004a;

    public c(Context context) {
        this.f37004a = context.getSharedPreferences("premium_helper_data", 0);
    }

    public static void o(long j4) {
        if (j4 != 0) {
            e.f37006D.getClass();
            e eVarA = e.a.a();
            l8.d<Integer> PH_IGNORE_RELAUNCH_CAPPING_SECONDS = i8.d.f38582x;
            l.e(PH_IGNORE_RELAUNCH_CAPPING_SECONDS, "PH_IGNORE_RELAUNCH_CAPPING_SECONDS");
            if (((Number) eVarA.f37020j.h(PH_IGNORE_RELAUNCH_CAPPING_SECONDS)).intValue() != 0) {
                va.a.f47104a.k(Oo.d(j4, "IgnoreNextCapping: App going in background time="), new Object[0]);
            }
        }
        f37003b = j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l8.a
    public final <T> T a(l8.a aVar, String key, T t10) {
        T t11;
        l.f(aVar, "<this>");
        l.f(key, "key");
        boolean z10 = t10 instanceof String;
        SharedPreferences sharedPreferences = this.f37004a;
        if (z10) {
            t11 = (T) sharedPreferences.getString(key, (String) t10);
        } else if (t10 instanceof Boolean) {
            t11 = (T) Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) t10).booleanValue()));
        } else if (t10 instanceof Long) {
            t11 = (T) Long.valueOf(sharedPreferences.getLong(key, ((Number) t10).longValue()));
        } else if (t10 instanceof Double) {
            double dDoubleValue = ((Number) t10).doubleValue();
            if (sharedPreferences.contains(key)) {
                dDoubleValue = sharedPreferences.getFloat(key, 0.0f);
            }
            t11 = (T) Double.valueOf(dDoubleValue);
        } else {
            if (!(t10 instanceof Integer)) {
                throw new IllegalStateException("Unsupported type");
            }
            t11 = (T) Integer.valueOf(sharedPreferences.getInt(key, ((Number) t10).intValue()));
        }
        return t11 == null ? t10 : t11;
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        return this.f37004a.contains(key);
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Premium Helper Preferences";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        HashMap map = new HashMap();
        Iterator<T> it = this.f37004a.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String lowerCase = String.valueOf(entry.getValue()).toLowerCase(Locale.ROOT);
            l.e(lowerCase, "toLowerCase(...)");
            map.put(key, lowerCase);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof i8.e
            if (r0 == 0) goto L13
            r0 = r5
            i8.e r0 = (i8.e) r0
            int r1 = r0.f38587n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38587n = r1
            goto L18
        L13:
            i8.e r0 = new i8.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f38585l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f38587n
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            b9.n.b(r5)
            i8.f r5 = new i8.f
            r2 = 0
            r5.<init>(r4, r2)
            r0.f38587n = r3
            java.lang.Object r5 = A9.F.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.l.e(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.c.f(h9.c):java.lang.Object");
    }

    public final long g(String str) {
        return ((Number) a(this, str, 0L)).longValue();
    }

    public final ActivePurchaseInfo h() {
        String string = this.f37004a.getString("active_purchase_info", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return (ActivePurchaseInfo) new Gson().b(ActivePurchaseInfo.class, string);
    }

    public final int i() {
        return this.f37004a.getInt("app_start_counter", 0);
    }

    public final boolean j() {
        return this.f37004a.getBoolean("has_active_purchase", false);
    }

    public final boolean k() {
        if (this.f37004a.getBoolean("is_next_app_start_ignored", false)) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = f37003b;
        e.f37006D.getClass();
        e eVarA = e.a.a();
        l8.d<Integer> PH_IGNORE_RELAUNCH_CAPPING_SECONDS = i8.d.f38582x;
        l.e(PH_IGNORE_RELAUNCH_CAPPING_SECONDS, "PH_IGNORE_RELAUNCH_CAPPING_SECONDS");
        long jIntValue = ((Number) eVarA.f37020j.h(PH_IGNORE_RELAUNCH_CAPPING_SECONDS)).intValue();
        if (jIntValue == 0 || j4 == 0) {
            return false;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j4);
        a.b bVar = va.a.f47104a;
        StringBuilder sbJ = s.j("IgnoreNextCapping: App in foreground. SecondsInBackground=", "; CappingSeconds=", seconds);
        sbJ.append(jIntValue);
        bVar.k(sbJ.toString(), new Object[0]);
        if (seconds <= jIntValue) {
            bVar.k("IgnoreNextCapping: Relaunch is ignored due to capping.", new Object[0]);
            return true;
        }
        o(0L);
        bVar.k("IgnoreNextCapping: Relaunch is NOT ignored due to capping. Showing relaunch unless `ignoreNextAppStart` is called.", new Object[0]);
        return false;
    }

    public final void l(String str, int i) {
        SharedPreferences.Editor editorEdit = this.f37004a.edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public final void m(String str) {
        SharedPreferences.Editor editorEdit = this.f37004a.edit();
        editorEdit.putString("rate_intent", str);
        editorEdit.apply();
    }

    public final void n(Object obj, String str) {
        SharedPreferences.Editor editorEdit = this.f37004a.edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            editorEdit.putLong(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Number) obj).longValue());
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalStateException("Unsupported type");
            }
            editorEdit.putFloat(str, (float) ((Number) obj).doubleValue());
        }
        editorEdit.apply();
    }
}
