package com.staircase3.opensignal.utils;

import android.content.res.Resources;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f6182a = new DecimalFormat("0");

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f6183b = new DecimalFormat("0.0");

    /* renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f6184c = new DecimalFormat("0.00");

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010 A[PHI: r3
  0x0010: PHI (r3v4 com.staircase3.opensignal.utils.h) = (r3v0 com.staircase3.opensignal.utils.h), (r3v1 com.staircase3.opensignal.utils.h) binds: [B:3:0x000e, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.staircase3.opensignal.utils.g a(long r8) {
        /*
            com.staircase3.opensignal.utils.h r0 = com.staircase3.opensignal.utils.h.KBPS
            long r1 = java.lang.Math.abs(r8)
            com.staircase3.opensignal.utils.h r3 = com.staircase3.opensignal.utils.h.GBPS
            long r4 = r3.getBaseValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L12
        L10:
            r0 = r3
            goto L27
        L12:
            long r1 = java.lang.Math.abs(r8)
            com.staircase3.opensignal.utils.h r3 = com.staircase3.opensignal.utils.h.MBPS
            long r4 = r3.getBaseValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L21
            goto L10
        L21:
            java.lang.Math.abs(r8)
            r0.getBaseValue()
        L27:
            float r1 = (float) r8
            long r2 = r0.getBaseValue()
            float r2 = (float) r2
            float r1 = r1 / r2
            long r2 = (long) r1
            r4 = 100
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.text.DecimalFormat r5 = com.staircase3.opensignal.utils.i.f6182a
            if (r4 < 0) goto L39
            r2 = r5
            goto L44
        L39:
            r6 = 10
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L42
            java.text.DecimalFormat r2 = com.staircase3.opensignal.utils.i.f6183b
            goto L44
        L42:
            java.text.DecimalFormat r2 = com.staircase3.opensignal.utils.i.f6184c
        L44:
            com.staircase3.opensignal.utils.h r3 = com.staircase3.opensignal.utils.h.MBPS
            long r3 = r3.getBaseValue()
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto L4f
            goto L50
        L4f:
            r5 = r2
        L50:
            com.staircase3.opensignal.utils.g r8 = new com.staircase3.opensignal.utils.g
            double r1 = (double) r1
            java.lang.String r9 = r5.format(r1)
            r8.<init>(r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.utils.i.a(long):com.staircase3.opensignal.utils.g");
    }

    public static String b(long j, Resources resources) {
        g gVarA = a(j);
        return gVarA.f6180a + " " + resources.getString(gVarA.f6181b.getResourceId());
    }

    public static g c(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        long jAbs = Math.abs(j);
        h hVar = h.GB;
        if (jAbs > hVar.getBaseValue()) {
            return new g(decimalFormat.format(j / hVar.getBaseValue()), hVar);
        }
        long jAbs2 = Math.abs(j);
        h hVar2 = h.MB;
        if (jAbs2 > hVar2.getBaseValue()) {
            return new g(decimalFormat.format(j / hVar2.getBaseValue()), hVar2);
        }
        long jAbs3 = Math.abs(j);
        h hVar3 = h.KB;
        return jAbs3 > hVar3.getBaseValue() ? new g(decimalFormat.format(j / hVar3.getBaseValue()), hVar3) : new g(c7.a.m(j, ""), h.B);
    }

    public static g d(long j, h hVar) {
        return new g(new DecimalFormat("#.0").format(j / hVar.getBaseValue()), hVar);
    }
}
