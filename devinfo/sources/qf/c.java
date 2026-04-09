package qf;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32296a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f32297b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f32297b;
        k.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x0094, B:25:0x00a9, B:26:0x00c1), top: B:31:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ek.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof qf.b
            if (r0 == 0) goto L13
            r0 = r10
            qf.b r0 = (qf.b) r0
            int r1 = r0.f32295i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32295i = r1
            goto L18
        L13:
            qf.b r0 = new qf.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.g
            int r1 = r0.f32295i
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.f32293f
            java.util.Map r3 = r0.f32292e
            gl.c r4 = r0.f32291d
            qf.d r5 = r0.f32290c
            java.util.Iterator r6 = r0.f32289b
            java.util.Map r7 = r0.f32288a
            ci.b.D(r10)
            goto L93
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            ci.b.D(r10)
            java.lang.String r10 = "dependencies"
            java.util.Map r1 = qf.c.f32297b
            nk.k.d(r1, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r3 = r1.size()
            int r3 = zj.w.H(r3)
            r10.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r10
            r6 = r1
        L5c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lc7
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            r5 = r4
            qf.d r5 = (qf.d) r5
            java.lang.Object r10 = r10.getValue()
            qf.a r10 = (qf.a) r10
            gl.c r4 = r10.f32286a
            r0.f32288a = r3
            r0.f32289b = r6
            r0.f32290c = r5
            r0.f32291d = r4
            r0.f32292e = r3
            r0.f32293f = r1
            r0.f32295i = r2
            java.lang.Object r10 = r4.c(r0)
            dk.a r7 = dk.a.f22275a
            if (r10 != r7) goto L92
            return r7
        L92:
            r7 = r3
        L93:
            r10 = 0
            java.lang.String r8 = "subscriberName"
            nk.k.e(r5, r8)     // Catch: java.lang.Throwable -> Lc2
            qf.a r8 = a(r5)     // Catch: java.lang.Throwable -> Lc2
            je.j r8 = r8.f32287b     // Catch: java.lang.Throwable -> Lc2
            if (r8 == 0) goto La9
            r4.e(r10)
            r3.put(r1, r8)
            r3 = r7
            goto L5c
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            r4.e(r10)
            throw r0
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.c.b(ek.c):java.lang.Object");
    }
}
