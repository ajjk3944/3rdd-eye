package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c2 implements rd0 {

    /* renamed from: a, reason: collision with root package name */
    public long f9923a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.as1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.as1] */
    public long a(ByteBuffer byteBuffer) {
        cb cbVar;
        bb bbVar;
        long j = this.f9923a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            za zaVar = new za(new iy(byteBufferDuplicate), ky.f13288c);
            ArrayList as1Var = zaVar.f18455f;
            if (zaVar.f18451b != null && zaVar.f18452c != xr1.g) {
                as1Var = new as1(as1Var, zaVar);
            }
            Iterator it = as1Var.iterator();
            while (true) {
                cbVar = null;
                if (!it.hasNext()) {
                    bbVar = null;
                    break;
                }
                ab abVar = (ab) it.next();
                if (abVar instanceof bb) {
                    bbVar = (bb) abVar;
                    break;
                }
            }
            ArrayList as1Var2 = bbVar.f18455f;
            if (bbVar.f18451b != null && bbVar.f18452c != xr1.g) {
                as1Var2 = new as1(as1Var2, bbVar);
            }
            Iterator it2 = as1Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ab abVar2 = (ab) it2.next();
                if (abVar2 instanceof cb) {
                    cbVar = (cb) abVar2;
                    break;
                }
            }
            long j8 = (cbVar.f10064m * 1000) / cbVar.f10063l;
            this.f9923a = j8;
            return j8;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public void mo160c(Object obj) {
        kh0 kh0Var;
        g1 g1Var;
        Handler handler;
        gw1 gw1Var = (gw1) obj;
        long j = this.f9923a;
        kw1 kw1Var = gw1Var.f11624b;
        if (!gw1Var.equals(kw1Var.f13268h) || (kh0Var = kw1Var.f13271l) == null || (handler = (g1Var = ((mw1) kh0Var.f13160b).C0).f11341a) == null) {
            return;
        }
        handler.post(new qv1(g1Var, j));
    }
}
