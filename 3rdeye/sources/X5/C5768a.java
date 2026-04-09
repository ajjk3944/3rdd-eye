package x5;

import K9.d;
import O4.C1465k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import x5.c;

/* compiled from: FirebaseSessionsDependencies.kt */
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5768a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5768a f47773a = new C5768a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<c.a, C0550a> f47774b = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    /* renamed from: x5.a$a, reason: collision with other inner class name */
    public static final class C0550a {

        /* renamed from: a, reason: collision with root package name */
        public final d f47775a;

        /* renamed from: b, reason: collision with root package name */
        public C1465k f47776b = null;

        public C0550a(d dVar) {
            this.f47775a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0550a)) {
                return false;
            }
            C0550a c0550a = (C0550a) obj;
            return this.f47775a.equals(c0550a.f47775a) && l.b(this.f47776b, c0550a.f47776b);
        }

        public final int hashCode() {
            int iHashCode = this.f47775a.hashCode() * 31;
            C1465k c1465k = this.f47776b;
            return iHashCode + (c1465k == null ? 0 : c1465k.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.f47775a + ", subscriber=" + this.f47776b + ')';
        }
    }

    public static C0550a a(c.a aVar) {
        Map<c.a, C0550a> dependencies = f47774b;
        l.e(dependencies, "dependencies");
        C0550a c0550a = dependencies.get(aVar);
        if (c0550a != null) {
            return c0550a;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x009b, B:25:0x00b0, B:26:0x00c8), top: B:31:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(h9.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof x5.b
            if (r0 == 0) goto L13
            r0 = r11
            x5.b r0 = (x5.b) r0
            int r1 = r0.f47785t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47785t = r1
            goto L18
        L13:
            x5.b r0 = new x5.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f47783r
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f47785t
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f47782q
            java.util.Map r4 = r0.f47781p
            java.util.Map r4 = (java.util.Map) r4
            K9.a r5 = r0.f47780o
            x5.c$a r6 = r0.f47779n
            java.util.Iterator r7 = r0.f47778m
            java.util.Map r8 = r0.f47777l
            java.util.Map r8 = (java.util.Map) r8
            b9.n.b(r11)
            goto L9a
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            b9.n.b(r11)
            java.util.Map<x5.c$a, x5.a$a> r11 = x5.C5768a.f47774b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.l.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = c9.C2077A.l(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L62:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lce
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            x5.c$a r6 = (x5.c.a) r6
            java.lang.Object r11 = r11.getValue()
            x5.a$a r11 = (x5.C5768a.C0550a) r11
            K9.d r5 = r11.f47775a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f47777l = r11
            r0.f47778m = r7
            r0.f47779n = r6
            r0.f47780o = r5
            r0.f47781p = r11
            r0.f47782q = r2
            r0.f47785t = r3
            java.lang.Object r11 = r5.a(r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            r8 = r4
        L9a:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.l.f(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            x5.a$a r9 = a(r6)     // Catch: java.lang.Throwable -> Lc9
            O4.k r9 = r9.f47776b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            r5.c(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L62
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            r5.c(r11)
            throw r0
        Lce:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.C5768a.b(h9.c):java.lang.Object");
    }
}
