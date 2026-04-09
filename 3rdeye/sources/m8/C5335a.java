package m8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import l8.a;

/* compiled from: DebugOverrideRepository.kt */
/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5335a implements l8.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f44086a = new HashMap<>();

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
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.f44086a
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
        throw new UnsupportedOperationException("Method not decompiled: m8.C5335a.a(l8.a, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        return this.f44086a.containsKey(key);
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Debug Override";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        return this.f44086a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = this.f44086a;
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
