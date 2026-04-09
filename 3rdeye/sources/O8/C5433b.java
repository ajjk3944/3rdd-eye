package o8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import l8.a;

/* compiled from: TestyConfiguration.kt */
/* renamed from: o8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5433b implements l8.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f44884a = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
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
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.f44884a
            if (r3 == 0) goto L15
            java.lang.Object r3 = r0.get(r4)
            goto L5b
        L15:
            boolean r3 = r5 instanceof java.lang.Boolean
            r1 = 0
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L27
            java.lang.Boolean r3 = y9.q.v0(r3)
            goto L5b
        L27:
            r3 = r1
            goto L5b
        L29:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L27
            java.lang.Long r3 = y9.m.R(r3)
            goto L5b
        L3a:
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L27
            java.lang.Double r3 = y9.m.O(r3)
            goto L5b
        L4b:
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L27
            java.lang.Integer r3 = y9.m.Q(r3)
        L5b:
            if (r3 != 0) goto L5e
            return r5
        L5e:
            return r3
        L5f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unsupported type"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.C5433b.a(l8.a, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        return this.f44884a.containsKey(key);
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Testy Configuration";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        return this.f44884a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.zipoapps.premiumhelper.d r7, h9.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o8.C5432a
            if (r0 == 0) goto L13
            r0 = r8
            o8.a r0 = (o8.C5432a) r0
            int r1 = r0.f44883p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44883p = r1
            goto L18
        L13:
            o8.a r0 = new o8.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f44881n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f44883p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o8.b r7 = r0.f44879l
            b9.n.b(r8)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            android.content.Context r7 = r0.f44880m
            o8.b r2 = r0.f44879l
            b9.n.b(r8)
            goto L4f
        L3c:
            b9.n.b(r8)
            o8.f r8 = o8.f.f44891a
            r0.f44879l = r6
            r0.f44880m = r7
            r0.f44883p = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L4e
            goto L75
        L4e:
            r2 = r6
        L4f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            va.a$b r8 = va.a.f47104a
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Found Testy app"
            r8.g(r5, r4)
            r0.f44879l = r2
            r8 = 0
            r0.f44880m = r8
            r0.f44883p = r3
            I9.b r3 = A9.U.f212b
            o8.e r4 = new o8.e
            r4.<init>(r7, r8)
            java.lang.Object r8 = A9.C0575f.h(r3, r4, r0)
            if (r8 != r1) goto L76
        L75:
            return r1
        L76:
            r7 = r2
        L77:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L80
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r7.f44884a
            r7.putAll(r8)
        L80:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.C5433b.f(com.zipoapps.premiumhelper.d, h9.c):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = this.f44884a;
        if (!map.isEmpty()) {
            sb.append("Debug Override\n");
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            l.e(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                l.c(entry);
                Object key = entry.getKey();
                l.e(key, "component1(...)");
                Object value = entry.getValue();
                l.e(value, "component2(...)");
                sb.append(((String) key) + " : " + ((String) value));
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
