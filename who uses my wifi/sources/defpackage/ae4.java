package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ae4 {
    public static final ae4 c = new ae4(xm3.i(yd4.d));
    public static final sn3 d;
    public static final xn3 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        wl2.G(objArr, 3);
        d = xm3.o(objArr, 3);
        so1 so1Var = new so1(4);
        so1Var.p(5, 6);
        so1Var.p(17, 6);
        so1Var.p(7, 6);
        so1Var.p(30, 10);
        so1Var.p(18, 6);
        so1Var.p(6, 8);
        so1Var.p(8, 8);
        so1Var.p(14, 8);
        e = so1Var.u();
    }

    public ae4(sn3 sn3Var) {
        for (int i = 0; i < sn3Var.i; i++) {
            yd4 yd4Var = (yd4) sn3Var.get(i);
            this.a.put(yd4Var.a, yd4Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((yd4) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static ae4 a(Context context, in2 in2Var, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), in2Var, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ae4 b(android.content.Context r16, android.content.Intent r17, defpackage.in2 r18, android.media.AudioDeviceInfo r19) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae4.b(android.content.Context, android.content.Intent, in2, android.media.AudioDeviceInfo):ae4");
    }

    public static sn3 d(int[] iArr, int i) {
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            yd4 yd4Var = new yd4(iArr[i2], i);
            int length = objArrCopyOf.length;
            int i4 = i3 + 1;
            int iD = rm3.d(length, i4);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = yd4Var;
            i2++;
            i3 = i4;
        }
        return xm3.o(objArrCopyOf, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r2
  0x003f: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:11:0x0033, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(defpackage.ph4 r17, defpackage.in2 r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae4.c(ph4, in2):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L3
            goto L46
        L3:
            boolean r0 = r8 instanceof defpackage.ae4
            r1 = 0
            if (r0 != 0) goto L9
            goto L48
        L9:
            ae4 r8 = (defpackage.ae4) r8
            android.util.SparseArray r0 = r8.a
            java.lang.String r2 = defpackage.v23.a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            android.util.SparseArray r4 = r7.a
            if (r2 < r3) goto L1e
            boolean r0 = defpackage.qd4.z(r4, r0)
            if (r0 == 0) goto L48
            goto L40
        L1e:
            int r2 = r4.size()
            int r3 = r0.size()
            if (r2 != r3) goto L48
            r3 = r1
        L29:
            if (r3 >= r2) goto L40
            int r5 = r4.keyAt(r3)
            java.lang.Object r6 = r4.valueAt(r3)
            java.lang.Object r5 = r0.get(r5)
            boolean r5 = java.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L48
            int r3 = r3 + 1
            goto L29
        L40:
            int r0 = r7.b
            int r8 = r8.b
            if (r0 != r8) goto L48
        L46:
            r8 = 1
            return r8
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = v23.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.b;
    }

    public final String toString() {
        String string = this.a.toString();
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
