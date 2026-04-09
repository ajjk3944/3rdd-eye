package n8;

import N7.C1154e9;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import l8.a;
import r5.k;
import w9.i;

/* compiled from: RemoteConfig.kt */
/* loaded from: classes3.dex */
public final class f implements l8.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f44419e;

    /* renamed from: a, reason: collision with root package name */
    public r5.e f44420a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.d f44421b = new r8.d("PremiumHelper");

    /* renamed from: c, reason: collision with root package name */
    public boolean f44422c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44423d;

    static {
        q qVar = new q(f.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        f44419e = new i[]{qVar};
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    @Override // l8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T a(l8.a r4, final java.lang.String r5, final T r6) {
        /*
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r4, r0)
            java.lang.String r4 = "key"
            kotlin.jvm.internal.l.f(r5, r4)
            n8.a r4 = new n8.a
            r4.<init>()
            boolean r0 = r3.f44423d
            r1 = 0
            if (r0 != 0) goto L44
            boolean r4 = r3.f44422c
            java.lang.String r0 = " queried before initialization !!!!!!"
            java.lang.String r2 = "!!!!!! RemoteConfig key "
            if (r4 != 0) goto L2b
            r8.c r4 = r3.g()
            java.lang.String r5 = N7.C1154e9.i(r2, r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r4.c(r5, r0)
        L29:
            r4 = r6
            goto L6e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L44:
            r5.e r0 = r3.f44420a
            if (r0 != 0) goto L5e
            boolean r2 = r3.f44422c
            if (r2 != 0) goto L5e
            r8.c r4 = r3.g()
            java.lang.String r0 = "RemoteConfig key "
            java.lang.String r2 = " queried before initialization"
            java.lang.String r5 = N7.C1154e9.i(r0, r5, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r4.c(r5, r0)
            goto L29
        L5e:
            if (r0 == 0) goto L72
            s5.c r0 = r0.f45695f
            s5.e r0 = r0.e(r5)
            int r0 = r0.f46084b
            if (r0 == 0) goto L29
            java.lang.Object r4 = r4.invoke(r5)
        L6e:
            if (r4 != 0) goto L71
            return r6
        L71:
            return r4
        L72:
            java.lang.String r4 = "firebaseRemoteConfig"
            kotlin.jvm.internal.l.l(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.f.a(l8.a, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        if (!this.f44423d) {
            g().c(C1154e9.i("!!!!!! RemoteConfig key ", key, " queried (contains) before initialization !!!!!!"), new Object[0]);
            return false;
        }
        r5.e eVar = this.f44420a;
        if (eVar == null && !this.f44422c) {
            g().c(C1154e9.i("RemoteConfig key ", key, " queried before initialization"), new Object[0]);
            return false;
        }
        if (eVar != null) {
            return eVar.f45695f.e(key).f46084b != 0;
        }
        l.l("firebaseRemoteConfig");
        throw null;
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Remote Config";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        HashMap map = new HashMap();
        r5.e eVar = this.f44420a;
        if (eVar == null) {
            l.l("firebaseRemoteConfig");
            throw null;
        }
        for (Map.Entry entry : eVar.a().entrySet()) {
            Object key = entry.getKey();
            String strB = ((k) entry.getValue()).b();
            l.e(strB, "asString(...)");
            String lowerCase = strB.toLowerCase(Locale.ROOT);
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
            boolean r0 = r5 instanceof n8.b
            if (r0 == 0) goto L13
            r0 = r5
            n8.b r0 = (n8.b) r0
            int r1 = r0.f44409n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44409n = r1
            goto L18
        L13:
            n8.b r0 = new n8.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f44407l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f44409n
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
            n8.c r5 = new n8.c
            r2 = 0
            r5.<init>(r4, r2)
            r0.f44409n = r3
            java.lang.Object r5 = A9.F.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.l.e(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.f.f(h9.c):java.lang.Object");
    }

    public final r8.c g() {
        return this.f44421b.a(this, f44419e[0]);
    }
}
