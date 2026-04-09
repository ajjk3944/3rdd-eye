package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OO {

    /* renamed from: c, reason: collision with root package name */
    public static final OO f10188c = new OO(LB.i(NO.f9998d));

    /* renamed from: d, reason: collision with root package name */
    public static final C1197gC f10189d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1465lC f10190e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f10191a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f10192b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC1984ut.k(3, objArr);
        f10189d = LB.o(3, objArr);
        J4 j42 = new J4(4);
        j42.k(5, 6);
        j42.k(17, 6);
        j42.k(7, 6);
        j42.k(30, 10);
        j42.k(18, 6);
        j42.k(6, 8);
        j42.k(8, 8);
        j42.k(14, 8);
        f10190e = j42.w(true);
    }

    public OO(C1197gC c1197gC) {
        for (int i = 0; i < c1197gC.f14229d; i++) {
            NO no = (NO) c1197gC.get(i);
            this.f10191a.put(no.f9999a, no);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.f10191a.size(); i3++) {
            iMax = Math.max(iMax, ((NO) this.f10191a.valueAt(i3)).f10000b);
        }
        this.f10192b = iMax;
    }

    public static OO a(Context context, C0729Sj c0729Sj, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0729Sj, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.OO b(android.content.Context r16, android.content.Intent r17, com.google.android.gms.internal.ads.C0729Sj r18, android.media.AudioDeviceInfo r19) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OO.b(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.Sj, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.OO");
    }

    public static C1197gC d(int[] iArr, int i) {
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i6 = 0;
        while (i3 < iArr.length) {
            NO no = new NO(iArr[i3], i);
            int length = objArrCopyOf.length;
            int i7 = i6 + 1;
            int iD = GB.d(length, i7);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i6] = no;
            i3++;
            i6 = i7;
        }
        return LB.o(i6, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r2
  0x003f: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:11:0x0033, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(com.google.android.gms.internal.ads.TP r17, com.google.android.gms.internal.ads.C0729Sj r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OO.c(com.google.android.gms.internal.ads.TP, com.google.android.gms.internal.ads.Sj):android.util.Pair");
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
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.OO
            r1 = 0
            if (r0 != 0) goto L9
            goto L48
        L9:
            com.google.android.gms.internal.ads.OO r8 = (com.google.android.gms.internal.ads.OO) r8
            android.util.SparseArray r0 = r8.f10191a
            java.lang.String r2 = com.google.android.gms.internal.ads.Vt.f12096a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            android.util.SparseArray r4 = r7.f10191a
            if (r2 < r3) goto L1e
            boolean r0 = com.google.android.gms.internal.ads.KO.x(r4, r0)
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
            boolean r5 = j$.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L48
            int r3 = r3 + 1
            goto L29
        L40:
            int r0 = r7.f10192b
            int r8 = r8.f10192b
            if (r0 != r8) goto L48
        L46:
            r8 = 1
            return r8
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OO.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = Vt.f12096a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f10191a;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f10192b;
    }

    public final String toString() {
        String string = this.f10191a.toString();
        int i = this.f10192b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
