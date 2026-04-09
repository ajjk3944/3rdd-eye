package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC0837Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C0842Sx A01;

    public CallableC0837Ss(C0842Sx c0842Sx, C0838St c0838St) {
        this.A01 = c0842Sx;
        new Handler(Looper.getMainLooper()).post(new C1439gl(this, c0842Sx, c0838St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0838St c0838St) throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1367fb c1367fbA06 = C1367fb.A06(this.A01.A04.A02());
        Uri uriA00 = XB.A00(c0838St.A08);
        long jA0S = c0838St.A00;
        if (jA0S == -1) {
            jA0S = C0886Up.A0S(this.A01.A04);
        }
        c1367fbA06.A0I(uriA00, new C1438gk(this, c0838St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
