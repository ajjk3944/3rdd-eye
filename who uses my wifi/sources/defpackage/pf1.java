package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pf1 {
    public long a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [x94] */
    /* JADX WARN: Type inference failed for: r4v7, types: [x94] */
    public long a(ByteBuffer byteBuffer) {
        ep1 ep1Var;
        dp1 dp1Var;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            bp1 bp1Var = new bp1(new lx(byteBufferDuplicate), ue2.c);
            ArrayList x94Var = bp1Var.k;
            if (bp1Var.g != null && bp1Var.h != u94.l) {
                x94Var = new x94(x94Var, bp1Var);
            }
            Iterator it = x94Var.iterator();
            while (true) {
                ep1Var = null;
                if (!it.hasNext()) {
                    dp1Var = null;
                    break;
                }
                cp1 cp1Var = (cp1) it.next();
                if (cp1Var instanceof dp1) {
                    dp1Var = (dp1) cp1Var;
                    break;
                }
            }
            ArrayList x94Var2 = dp1Var.k;
            if (dp1Var.g != null && dp1Var.h != u94.l) {
                x94Var2 = new x94(x94Var2, dp1Var);
            }
            Iterator it2 = x94Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                cp1 cp1Var2 = (cp1) it2.next();
                if (cp1Var2 instanceof ep1) {
                    ep1Var = (ep1) cp1Var2;
                    break;
                }
            }
            long j2 = (ep1Var.r * 1000) / ep1Var.q;
            this.a = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
