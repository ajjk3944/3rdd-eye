package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1215Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1220Sx A01;

    public CallableC1215Ss(C1220Sx c1220Sx, C1216St c1216St) {
        this.A01 = c1220Sx;
        new Handler(Looper.getMainLooper()).post(new C1817gl(this, c1220Sx, c1216St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1216St c1216St) throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1745fb c1745fbA06 = C1745fb.A06(this.A01.A04.A02());
        Uri uriA00 = XB.A00(c1216St.A08);
        long jA0S = c1216St.A00;
        if (jA0S == -1) {
            jA0S = C1264Up.A0S(this.A01.A04);
        }
        c1745fbA06.A0I(uriA00, new C1816gk(this, c1216St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
