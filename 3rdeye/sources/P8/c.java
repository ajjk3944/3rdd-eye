package p8;

import N7.G8;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import l8.a;
import y9.n;

/* compiled from: TotoConfigRepository.kt */
/* loaded from: classes3.dex */
public final class c implements l8.a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f45300a;

    public c(Application application) {
        this.f45300a = application.getSharedPreferences("toto_configuration", 0);
    }

    public static String g(String str) {
        return G8.s(str, "_hash");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // l8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T a(l8.a r3, java.lang.String r4, T r5) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r3 = "key"
            kotlin.jvm.internal.l.f(r4, r3)
            boolean r3 = r5 instanceof java.lang.String
            android.content.SharedPreferences r0 = r2.f45300a
            if (r3 == 0) goto L18
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r0.getString(r4, r3)
            goto L56
        L18:
            boolean r3 = r5 instanceof java.lang.Boolean
            r1 = 0
            if (r3 == 0) goto L2a
            java.lang.String r3 = r0.getString(r4, r1)
            if (r3 == 0) goto L28
            java.lang.Boolean r3 = y9.q.v0(r3)
            goto L56
        L28:
            r3 = r1
            goto L56
        L2a:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L39
            java.lang.String r3 = r0.getString(r4, r1)
            if (r3 == 0) goto L28
            java.lang.Long r3 = y9.m.R(r3)
            goto L56
        L39:
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 == 0) goto L48
            java.lang.String r3 = r0.getString(r4, r1)
            if (r3 == 0) goto L28
            java.lang.Double r3 = y9.m.O(r3)
            goto L56
        L48:
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L5a
            java.lang.String r3 = r0.getString(r4, r1)
            if (r3 == 0) goto L28
            java.lang.Integer r3 = y9.m.Q(r3)
        L56:
            if (r3 != 0) goto L59
            return r5
        L59:
            return r3
        L5a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unsupported type"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.c.a(l8.a, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        return this.f45300a.contains(key);
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Toto Service";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        HashMap map = new HashMap();
        Map<String, ?> all = this.f45300a.getAll();
        l.e(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            l.e(key, "<get-key>(...)");
            if (!n.T(key, "_hash")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((String) entry2.getKey()).equals("x-country")) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key2 = entry3.getKey();
            String lowerCase = String.valueOf(entry3.getValue()).toLowerCase(Locale.ROOT);
            l.e(lowerCase, "toLowerCase(...)");
            map.put(key2, lowerCase);
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
            boolean r0 = r5 instanceof p8.C5478a
            if (r0 == 0) goto L13
            r0 = r5
            p8.a r0 = (p8.C5478a) r0
            int r1 = r0.f45298n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45298n = r1
            goto L18
        L13:
            p8.a r0 = new p8.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f45296l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f45298n
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
            p8.b r5 = new p8.b
            r2 = 0
            r5.<init>(r4, r2)
            r0.f45298n = r3
            java.lang.Object r5 = A9.F.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.l.e(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.c.f(h9.c):java.lang.Object");
    }
}
