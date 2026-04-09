package aj;

import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f420a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f421b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f422c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public int f423d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f424e = new Object();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[PHI: r4
  0x0065: PHI (r4v2 int) = (r4v1 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int), (r4v0 int) binds: [B:32:0x008c, B:30:0x0089, B:20:0x0075, B:22:0x0079, B:12:0x005c, B:14:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g() {
        /*
            r13 = this;
            r13.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.f422c = r0
            r0 = 0
            r13.f423d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r13.f424e = r0
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Exception -> L42
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L42
            r0.<init>(r1)     // Catch: java.lang.Exception -> L42
            long r1 = r0.getBlockSizeLong()     // Catch: java.lang.Exception -> L42
            double r1 = (double) r1     // Catch: java.lang.Exception -> L42
            long r3 = r0.getAvailableBlocksLong()     // Catch: java.lang.Exception -> L42
            double r3 = (double) r3     // Catch: java.lang.Exception -> L42
            double r1 = r1 * r3
            r3 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r1 = r1 / r3
            double r1 = r1 / r3
            double r1 = r1 / r3
            long r5 = r0.getBlockSizeLong()     // Catch: java.lang.Exception -> L42
            double r5 = (double) r5     // Catch: java.lang.Exception -> L42
            long r7 = r0.getBlockCountLong()     // Catch: java.lang.Exception -> L42
            double r7 = (double) r7
            double r5 = r5 * r7
            double r5 = r5 / r3
            double r5 = r5 / r3
            double r5 = r5 / r3
            double r5 = r5 - r1
            long r0 = (long) r5
            goto L44
        L42:
            r0 = -1
        L44:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 6
            r5 = 0
            r7 = 4
            if (r2 >= r3) goto L67
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            if (r2 != r7) goto L5a
        L58:
            r6 = r7
            goto L8f
        L5a:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L65
            r2 = 26
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L65
            goto L58
        L65:
            r6 = r4
            goto L8f
        L67:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            r8 = 32
            if (r2 != r7) goto L7c
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L65
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L65
            goto L58
        L7c:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L8c
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 > 0) goto L85
            goto L58
        L85:
            r2 = 64
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8c
            goto L65
        L8c:
            r4 = 8
            goto L65
        L8f:
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque
            r11.<init>()
            aj.c r12 = new aj.c
            r12.<init>()
            r8 = 0
            r7 = r6
            r5.<init>(r6, r7, r8, r10, r11, r12)
            r13.f420a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.<init>():void");
    }

    public final b a(String str) throws InterruptedException {
        Log.d("MultiThreadAnalyzerCore", "MultiThreadAnalyzerTask2#analyze:  start ".concat(g.class.getName()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        yi.d dVarI = yi.g.f37630a.i(str);
        b bVar = new b(dVarI.isDirectory(), dVarI.getName(), null);
        bVar.f411f = str;
        c(b(bVar, dVarI));
        while (!this.f421b) {
            synchronized (this.f424e) {
                if (this.f423d == 0) {
                    Log.d("MultiThreadAnalyzerCore", "MultiThreadAnalyzerTask2#analyze: tasks done");
                    this.f420a.shutdown();
                    bVar.d();
                    Log.d("MultiThreadAnalyzerCore", "MultiThreadAnalyzerTask2#analyze: size = " + wi.c.e(bVar.f406a));
                    Log.d("MultiThreadAnalyzerCore", "MultiThreadAnalyzerTask2#analyze: finish " + g.class.getName() + " - " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                    return bVar;
                }
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        Log.d("MultiThreadAnalyzerCore", "MultiThreadAnalyzerTask2#analyze: canceled, shutdown");
        this.f420a.shutdown();
        return null;
    }

    public final e b(b bVar, yi.d dVar) {
        synchronized (this.f422c) {
            try {
                e eVar = this.f422c.isEmpty() ? null : (e) this.f422c.pop();
                if (eVar == null) {
                    return new e(this, bVar, dVar);
                }
                eVar.f417a = bVar;
                eVar.f418b = dVar;
                return eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void c(e eVar) {
        if (!this.f420a.isShutdown() && !this.f421b) {
            synchronized (this.f424e) {
                this.f423d++;
            }
            this.f420a.execute(new d(0, this, eVar));
        }
    }

    public final void d(b bVar, f fVar) {
        if (this.f421b) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(bVar);
        while (!linkedList.isEmpty() && !this.f421b) {
            b bVar2 = (b) linkedList.pollLast();
            if (bVar2 != null) {
                fVar.a(bVar2);
                if (bVar2.f409d) {
                    HashMap map = bVar2.f412h;
                    Collection collectionValues = map == null ? null : map.values();
                    if (collectionValues != null) {
                        linkedList.addAll(collectionValues);
                    }
                }
            }
        }
    }
}
