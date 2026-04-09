package kj;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import nj.C7000f;

/* loaded from: classes3.dex */
public class d implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    private static final String f51580l = "kj.d";

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51581a = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f51580l);

    /* renamed from: b, reason: collision with root package name */
    private a f51582b;

    /* renamed from: c, reason: collision with root package name */
    private a f51583c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f51584d;

    /* renamed from: e, reason: collision with root package name */
    private String f51585e;

    /* renamed from: f, reason: collision with root package name */
    private Future f51586f;

    /* renamed from: g, reason: collision with root package name */
    private C6474b f51587g;

    /* renamed from: h, reason: collision with root package name */
    private C6473a f51588h;

    /* renamed from: i, reason: collision with root package name */
    private C7000f f51589i;

    /* renamed from: j, reason: collision with root package name */
    private f f51590j;

    /* renamed from: k, reason: collision with root package name */
    private Thread f51591k;

    private enum a {
        STOPPED,
        RUNNING,
        STARTING,
        RECEIVING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public d(C6473a c6473a, C6474b c6474b, f fVar, InputStream inputStream) {
        a aVar = a.STOPPED;
        this.f51582b = aVar;
        this.f51583c = aVar;
        this.f51584d = new Object();
        this.f51587g = null;
        this.f51588h = null;
        this.f51590j = null;
        this.f51591k = null;
        this.f51589i = new C7000f(c6474b, inputStream);
        this.f51588h = c6473a;
        this.f51587g = c6474b;
        this.f51590j = fVar;
        this.f51581a.setResourceName(c6473a.B().getClientId());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f51584d
            monitor-enter(r0)
            kj.d$a r1 = r4.f51582b     // Catch: java.lang.Throwable -> Le
            kj.d$a r2 = kj.d.a.RUNNING     // Catch: java.lang.Throwable -> Le
            if (r1 == r2) goto L10
            kj.d$a r3 = kj.d.a.RECEIVING     // Catch: java.lang.Throwable -> Le
            if (r1 != r3) goto L16
            goto L10
        Le:
            r1 = move-exception
            goto L19
        L10:
            kj.d$a r1 = r4.f51583c     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.d.a():boolean");
    }

    public void b(String str, ExecutorService executorService) {
        this.f51585e = str;
        this.f51581a.fine(f51580l, "start", "855");
        synchronized (this.f51584d) {
            try {
                a aVar = this.f51582b;
                a aVar2 = a.STOPPED;
                if (aVar == aVar2 && this.f51583c == aVar2) {
                    this.f51583c = a.RUNNING;
                    if (executorService == null) {
                        new Thread(this).start();
                    } else {
                        this.f51586f = executorService.submit(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (!a()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    public void c() {
        synchronized (this.f51584d) {
            try {
                Future future = this.f51586f;
                if (future != null) {
                    future.cancel(true);
                }
                this.f51581a.fine(f51580l, "stop", "850");
                if (a()) {
                    this.f51583c = a.STOPPED;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (a()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
        this.f51581a.fine(f51580l, "stop", "851");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0140, code lost:
    
        r1 = r9.f51584d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0142, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0143, code lost:
    
        r9.f51582b = kj.d.a.STOPPED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0147, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0148, code lost:
    
        r9.f51591k = null;
        r9.f51581a.fine(kj.d.f51580l, "run", "854");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0156, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.d.run():void");
    }
}
