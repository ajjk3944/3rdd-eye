package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC0801Wn {

    /* renamed from: a, reason: collision with root package name */
    public long f6910a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.nN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.nN] */
    public long a(ByteBuffer byteBuffer) {
        W4 w42;
        V4 v42;
        long j6 = this.f6910a;
        if (j6 > 0) {
            return j6;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            T4 t42 = new T4(new C1756qg(byteBufferDuplicate), C1863sg.f16772c);
            ArrayList c1584nN = t42.f15140f;
            if (t42.f15136b != null && t42.f15137c != AbstractC1422kN.f15134g) {
                c1584nN = new C1584nN(c1584nN, t42);
            }
            Iterator it = c1584nN.iterator();
            while (true) {
                w42 = null;
                if (!it.hasNext()) {
                    v42 = null;
                    break;
                }
                U4 u42 = (U4) it.next();
                if (u42 instanceof V4) {
                    v42 = (V4) u42;
                    break;
                }
            }
            ArrayList c1584nN2 = v42.f15140f;
            if (v42.f15136b != null && v42.f15137c != AbstractC1422kN.f15134g) {
                c1584nN2 = new C1584nN(c1584nN2, v42);
            }
            Iterator it2 = c1584nN2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                U4 u43 = (U4) it2.next();
                if (u43 instanceof W4) {
                    w42 = (W4) u43;
                    break;
                }
            }
            long j7 = (w42.f12161m * 1000) / w42.f12160l;
            this.f6910a = j7;
            return j7;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        C1014cu c1014cu;
        C1586nP c1586nP = (C1586nP) obj;
        long j6 = this.f6910a;
        C1801rP c1801rP = c1586nP.f15777b;
        if (c1586nP.equals(c1801rP.f16548h) && (c1014cu = c1801rP.f16551l) != null) {
            Vu vu = ((C1909tP) c1014cu.f13695b).f16910Q0;
            Handler handler = (Handler) vu.f12105a;
            if (handler != null) {
                handler.post(new RunnableC0882aP(vu, j6));
            }
        }
    }
}
