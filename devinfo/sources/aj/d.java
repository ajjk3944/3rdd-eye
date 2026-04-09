package aj;

import de.n;
import de.o;
import java.util.Collections;
import java.util.Map;
import je.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f416c;

    public /* synthetic */ d(int i4, Object obj, Object obj2) {
        this.f414a = i4;
        this.f415b = obj;
        this.f416c = obj2;
    }

    private final void a() {
        cf.a aVar;
        o oVar = (o) this.f415b;
        cf.b bVar = (cf.b) this.f416c;
        if (oVar.f22223b != o.f22221d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (oVar) {
            aVar = oVar.f22222a;
            oVar.f22222a = null;
            oVar.f22223b = bVar;
        }
        aVar.d(bVar);
    }

    private final void b() {
        n nVar = (n) this.f415b;
        cf.b bVar = (cf.b) this.f416c;
        synchronized (nVar) {
            try {
                if (nVar.f22219b == null) {
                    nVar.f22218a.add(bVar);
                } else {
                    nVar.f22219b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.d.run():void");
    }

    public /* synthetic */ d(q qVar, Exception exc) {
        this.f414a = 28;
        Map map = Collections.EMPTY_MAP;
        this.f415b = qVar;
        this.f416c = exc;
    }
}
