package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728q5 implements TG, InterfaceC0664Om {

    /* renamed from: a, reason: collision with root package name */
    public int f16317a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16318b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16319c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16320d;

    public C1728q5(C1458l5 c1458l5, int i, InterfaceC1080e5 interfaceC1080e5) {
        this.f16318b = c1458l5;
        this.f16317a = i;
        this.f16319c = interfaceC1080e5;
    }

    public static final void k(long j6) throws C1620o5 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        if (j6 % (((((((~j7) & j8) | j9) + ((j7 & j10) | j11)) - j12) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new C1620o5();
        }
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f16318b) {
            try {
                if (((Looper) this.f16319c) == null) {
                    boolean z6 = false;
                    if (this.f16317a == 0 && ((HandlerThread) this.f16320d) == null) {
                        z6 = true;
                    }
                    AbstractC0582Jp.h0(z6);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f16320d = handlerThread;
                    handlerThread.start();
                    this.f16319c = ((HandlerThread) this.f16320d).getLooper();
                }
                this.f16317a++;
                looper = (Looper) this.f16319c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0664Om, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC1964uQ) obj).s(0, ((C2233zP) this.f16318b).f17874a, (C1319iQ) this.f16319c, (C1587nQ) this.f16320d, this.f16317a);
    }

    public void c(long j6) throws C1674p5, C1620o5 {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        long j13 = jArr[6];
        long j14 = jArr[7];
        k(j6);
        long j15 = j6 / (((((((~j7) & j8) | j9) + ((j7 & j10) | j11)) - j12) + j13) ^ (j14 % 899334107));
        if (j15 < 0 || j15 > ((C1458l5) this.f16318b).f15350a.length) {
            throw new C1674p5();
        }
        this.f16317a = (int) j15;
    }

    public long d() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j6 = jArr[0];
        long j7 = jArr[1];
        long j8 = jArr[2];
        long j9 = jArr[3];
        long j10 = jArr[4];
        return this.f16317a * (((((((~j6) & j7) | j8) + ((j6 & j9) | j10)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.f16318b) {
            try {
                AbstractC0582Jp.h0(this.f16317a > 0);
                int i = this.f16317a - 1;
                this.f16317a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f16320d) != null) {
                    handlerThread.quit();
                    this.f16320d = null;
                    this.f16319c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long f() throws C1674p5 {
        try {
            InterfaceC1080e5 interfaceC1080e5 = (InterfaceC1080e5) this.f16319c;
            C1458l5 c1458l5 = (C1458l5) this.f16318b;
            this.f16317a = this.f16317a + 1;
            return interfaceC1080e5.d(c1458l5, r2);
        } catch (IndexOutOfBoundsException e6) {
            throw new C1674p5(e6);
        }
    }

    public int g() throws C1674p5 {
        try {
            InterfaceC1080e5 interfaceC1080e5 = (InterfaceC1080e5) this.f16319c;
            C1458l5 c1458l5 = (C1458l5) this.f16318b;
            int i = this.f16317a;
            this.f16317a = i + 1;
            int iD = interfaceC1080e5.d(c1458l5, i) & 255;
            InterfaceC1080e5 interfaceC1080e52 = (InterfaceC1080e5) this.f16319c;
            C1458l5 c1458l52 = (C1458l5) this.f16318b;
            int i3 = this.f16317a;
            this.f16317a = i3 + 1;
            int iD2 = iD | ((interfaceC1080e52.d(c1458l52, i3) & 255) << 8);
            InterfaceC1080e5 interfaceC1080e53 = (InterfaceC1080e5) this.f16319c;
            C1458l5 c1458l53 = (C1458l5) this.f16318b;
            int i6 = this.f16317a;
            this.f16317a = i6 + 1;
            int iD3 = iD2 | ((interfaceC1080e53.d(c1458l53, i6) & 255) << 16);
            InterfaceC1080e5 interfaceC1080e54 = (InterfaceC1080e5) this.f16319c;
            C1458l5 c1458l54 = (C1458l5) this.f16318b;
            int i7 = this.f16317a;
            this.f16317a = i7 + 1;
            return iD3 | (interfaceC1080e54.d(c1458l54, i7) << 24);
        } catch (IndexOutOfBoundsException e6) {
            throw new C1674p5(e6);
        }
    }

    public long h() throws C1566n5, C1674p5 {
        int i = 0;
        long j6 = 0;
        while (i < 64) {
            try {
                InterfaceC1080e5 interfaceC1080e5 = (InterfaceC1080e5) this.f16319c;
                C1458l5 c1458l5 = (C1458l5) this.f16318b;
                int i3 = this.f16317a;
                this.f16317a = i3 + 1;
                byte bD = interfaceC1080e5.d(c1458l5, i3);
                j6 |= (bD & 127) << i;
                if (i == 63) {
                    if (bD > 1) {
                        throw new C1566n5();
                    }
                    i = 63;
                }
                if ((bD & 128) == 0) {
                    return (-(j6 & 1)) ^ (j6 >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e6) {
                throw new C1674p5(e6);
            }
        }
        throw new C1566n5();
    }

    public C1458l5 i(long j6) throws C1674p5, C1620o5 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        k(d() + j6);
        int i12 = this.f16317a;
        long j7 = i12;
        C1458l5 c1458l5 = (C1458l5) this.f16318b;
        long j8 = (j6 >> ((i11 % 774318984) ^ iD)) + j7;
        if (j8 > c1458l5.f15350a.length || j8 < j7) {
            throw new C1674p5();
        }
        try {
            int i13 = (int) j8;
            C1458l5 c1458l5I = ((InterfaceC1080e5) this.f16319c).i(c1458l5, i12, i13);
            this.f16317a = i13;
            return c1458l5I;
        } catch (IndexOutOfBoundsException e6) {
            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.TG
    public byte[] j(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.f16317a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C0986cK c0986cK = (C0986cK) this.f16318b;
        ((Mac) c0986cK.get()).update(bArr);
        return Arrays.copyOf(((Mac) c0986cK.get()).doFinal(), i);
    }

    public /* synthetic */ C1728q5(C2233zP c2233zP, C1319iQ c1319iQ, C1587nQ c1587nQ, int i) {
        this.f16318b = c2233zP;
        this.f16319c = c1319iQ;
        this.f16320d = c1587nQ;
        this.f16317a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1728q5(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.cK r0 = new com.google.android.gms.internal.ads.cK
            r0.<init>(r5)
            r5.f16318b = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.Cr.m(r1)
            if (r2 == 0) goto L8e
            r5.f16319c = r6
            r5.f16320d = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L86
            int r7 = r6.hashCode()
            r2 = 1
            r3 = 3
            r4 = 4
            switch(r7) {
                case -1823053428: goto L51;
                case 392315023: goto L47;
                case 392315118: goto L3d;
                case 392316170: goto L33;
                case 392317873: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r4
            goto L5c
        L33:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r3
            goto L5c
        L3d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r1
            goto L5c
        L47:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = r2
            goto L5c
        L51:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            r7 = -1
        L5c:
            if (r7 == 0) goto L7e
            if (r7 == r2) goto L7b
            if (r7 == r1) goto L78
            if (r7 == r3) goto L75
            if (r7 != r4) goto L69
            r6 = 64
            goto L80
        L69:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L75:
            r6 = 48
            goto L80
        L78:
            r6 = 32
            goto L80
        L7b:
            r6 = 28
            goto L80
        L7e:
            r6 = 20
        L80:
            r5.f16317a = r6
            r0.get()
            return
        L86:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L8e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1728q5.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}
