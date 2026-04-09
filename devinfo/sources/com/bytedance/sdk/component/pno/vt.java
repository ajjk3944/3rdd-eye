package com.bytedance.sdk.component.pno;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ko;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class vt implements Comparable, Runnable {

    /* renamed from: lh, reason: collision with root package name */
    private long f7618lh;
    private pno ouw;
    private ouw vt;
    private Thread yu = null;

    public vt(pno pnoVar, ouw ouwVar) {
        this.f7618lh = 0L;
        this.ouw = pnoVar;
        this.vt = ouwVar;
        this.f7618lh = SystemClock.uptimeMillis();
    }

    private static void ouw(String str, String str2, long j) {
        StringBuilder sbO = c.o("pool is ", str, "  name is ", str2, "is timeout,cost ");
        sbO.append(j);
        ko.fkw("DelegateRunnable", sbO.toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof vt) {
            return this.ouw.compareTo(((vt) obj).ouw);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        pno pnoVar;
        return (obj instanceof vt) && (pnoVar = this.ouw) != null && pnoVar.equals(((vt) obj).ouw);
    }

    public final int hashCode() {
        return this.ouw.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.pno.vt.run():void");
    }
}
