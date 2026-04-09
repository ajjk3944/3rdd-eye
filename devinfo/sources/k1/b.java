package k1;

import b7.l;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27786c;

    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        this.f27784a = i4;
        this.f27785b = obj;
        this.f27786c = obj2;
    }

    private final void a() {
        u6.c cVar = (u6.c) this.f27785b;
        l lVar = (l) this.f27786c;
        synchronized (cVar.f35131k) {
            try {
                ArrayList arrayList = cVar.j;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((u6.a) obj).e(lVar, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Type inference failed for: r3v2, types: [lj.b] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.b.run():void");
    }
}
