package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ki0 extends tn0 {
    public ArrayList k;

    public ki0() {
        super(gg0.l, 41, 1280);
        tn0.c("payloadSize", 1280);
        tn0.c("flags", 0);
        long j = 0;
        this.i = (j << 24) + (j << 16) + j;
    }

    @Override // defpackage.tn0
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.i == ((ki0) obj).i;
    }

    @Override // defpackage.tn0
    public final int hashCode() {
        int i = 0;
        for (byte b : p(false)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[LOOP:0: B:5:0x0013->B:37:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v6, types: [cr] */
    /* JADX WARN: Type inference failed for: r2v7, types: [cr] */
    /* JADX WARN: Type inference failed for: r2v8, types: [cr] */
    /* JADX WARN: Type inference failed for: r2v9, types: [cr, p01] */
    @Override // defpackage.tn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.cm r9) throws defpackage.t91 {
        /*
            r8 = this;
            int r0 = r9.g
            java.lang.Object r1 = r9.j
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r1.remaining()
            if (r2 <= 0) goto L13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.k = r2
        L13:
            int r2 = r1.remaining()
            if (r2 <= 0) goto Lb1
            int r2 = r9.f()
            int r3 = r9.f
            int r4 = r9.f()
            int r5 = r1.remaining()
            if (r5 < r4) goto La9
            int r5 = r1.limit()
            int r5 = r5 - r3
            int r6 = r1.position()
            int r6 = r0 - r6
            java.lang.String r7 = "cannot set active region past end of input"
            if (r4 > r6) goto La3
            int r6 = r1.position()
            int r6 = r6 + r4
            r1.limit(r6)
            r4 = 3
            if (r2 == r4) goto L87
            r4 = 15
            if (r2 == r4) goto L81
            r4 = 5
            if (r2 == r4) goto L78
            r4 = 6
            if (r2 == r4) goto L78
            r4 = 7
            if (r2 == r4) goto L78
            r4 = 8
            if (r2 == r4) goto L72
            r4 = 10
            if (r2 == r4) goto L6c
            r4 = 11
            if (r2 == r4) goto L62
            op r4 = new op
            r4.<init>(r2)
            goto L8d
        L62:
            p01 r2 = new p01
            r2.<init>(r4)
            r4 = 0
            r2.g = r4
        L6a:
            r4 = r2
            goto L8d
        L6c:
            tj r2 = new tj
            r2.<init>(r4)
            goto L6a
        L72:
            rf r2 = new rf
            r2.<init>(r4)
            goto L6a
        L78:
            op r4 = new op
            r6 = 0
            int[] r6 = new int[r6]
            r4.<init>(r6, r2)
            goto L8d
        L81:
            pt r2 = new pt
            r2.<init>(r4)
            goto L6a
        L87:
            cg0 r2 = new cg0
            r2.<init>(r4)
            goto L6a
        L8d:
            r4.a(r9)
            int r5 = r5 + r3
            if (r5 > r0) goto L9d
            r1.limit(r5)
            java.util.ArrayList r2 = r8.k
            r2.add(r4)
            goto L13
        L9d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r7)
            throw r9
        La3:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r7)
            throw r9
        La9:
            t91 r9 = new t91
            java.lang.String r0 = "truncated option"
            r9.<init>(r0)
            throw r9
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki0.k(cm):void");
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            sb.append(arrayList);
            sb.append(" ");
        }
        sb.append(" ; payload ");
        sb.append(this.h);
        sb.append(", xrcode ");
        sb.append((int) (this.i >>> 24));
        sb.append(", version ");
        sb.append((int) ((this.i >>> 16) & 255));
        sb.append(", flags ");
        sb.append((int) (this.i & 65535));
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cr crVar = (cr) obj;
            t3Var.m(crVar.f);
            int i2 = t3Var.g;
            t3Var.m(0);
            crVar.c(t3Var);
            t3Var.n((t3Var.g - i2) - 2, i2);
        }
    }

    @Override // defpackage.tn0
    public final String toString() {
        return gg0.l + "\t\t\t\t" + k31.a.e(this.g) + "\t" + l();
    }
}
