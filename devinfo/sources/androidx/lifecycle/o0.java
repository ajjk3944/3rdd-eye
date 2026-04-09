package androidx.lifecycle;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1170b;

    public /* synthetic */ o0(int i4, Object obj) {
        this.f1169a = i4;
        this.f1170b = obj;
    }

    private final void a() {
        com.liuzh.deviceinfo.utilities.r rVar = (com.liuzh.deviceinfo.utilities.r) this.f1170b;
        synchronized (rVar.f21298b) {
            try {
                ArrayList arrayList = rVar.f21298b;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    com.liuzh.deviceinfo.utilities.q qVar = rVar.f21300d;
                    ((wg.e) obj).b(qVar.f21293d, qVar.f21294e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226 A[LOOP:2: B:79:0x0224->B:80:0x0226, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o0.run():void");
    }
}
