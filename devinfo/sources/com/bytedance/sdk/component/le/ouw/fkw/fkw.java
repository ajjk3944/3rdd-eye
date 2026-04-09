package com.bytedance.sdk.component.le.ouw.fkw;

import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class fkw implements Comparable<fkw>, Runnable {
    private String vt;
    public int pno = 5;
    private String ouw = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public fkw(String str) {
        this.vt = str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(fkw fkwVar) {
        int i4 = this.pno;
        int i10 = fkwVar.pno;
        if (i4 < i10) {
            return 1;
        }
        return i4 >= i10 ? -1 : 0;
    }
}
