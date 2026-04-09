package ug;

import br.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23558a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f23559b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f23559b;
        l.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x0094, B:25:0x00a9, B:26:0x00c1), top: B:31:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(rq.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ug.b
            if (r0 == 0) goto L13
            r0 = r11
            ug.b r0 = (ug.b) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ug.b r0 = new ug.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.F
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.E
            java.util.Map r4 = r0.D
            eu.d r5 = r0.B
            ug.d r6 = r0.f23557y
            java.util.Iterator r7 = r0.f23556x
            java.util.Map r8 = r0.f23555r
            lf.t1.G(r11)
            goto L93
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            lf.t1.G(r11)
            java.lang.String r11 = "dependencies"
            java.util.Map r2 = ug.c.f23559b
            br.l.d(r2, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = mq.b0.P(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L5e:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lc7
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            ug.d r6 = (ug.d) r6
            java.lang.Object r11 = r11.getValue()
            ug.a r11 = (ug.a) r11
            eu.d r5 = r11.f23553a
            r0.f23555r = r4
            r0.f23556x = r7
            r0.f23557y = r6
            r0.B = r5
            r0.D = r4
            r0.E = r2
            r0.H = r3
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L92
            return r1
        L92:
            r8 = r4
        L93:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            br.l.e(r6, r9)     // Catch: java.lang.Throwable -> Lc2
            ug.a r9 = a(r6)     // Catch: java.lang.Throwable -> Lc2
            hf.i r9 = r9.f23554b     // Catch: java.lang.Throwable -> Lc2
            if (r9 == 0) goto La9
            r5.f(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L5e
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            r5.f(r11)
            throw r0
        Lc7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.b(rq.c):java.lang.Object");
    }
}
