package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wb implements hf1, jb0 {

    /* renamed from: a, reason: collision with root package name */
    public int f17957a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17958b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17959c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17960d;

    public wb(rb rbVar, int i4, kb kbVar) {
        this.f17958b = rbVar;
        this.f17957a = i4;
        this.f17959c = kbVar;
    }

    public static final void k(long j) throws ub {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        if (j % (((((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new ub();
        }
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f17958b) {
            try {
                if (((Looper) this.f17959c) == null) {
                    boolean z3 = false;
                    if (this.f17957a == 0 && ((HandlerThread) this.f17960d) == null) {
                        z3 = true;
                    }
                    mq0.c0(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f17960d = handlerThread;
                    handlerThread.start();
                    this.f17959c = ((HandlerThread) this.f17960d).getLooper();
                }
                this.f17957a++;
                looper = (Looper) this.f17959c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b(long j) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        k(j);
        long j16 = j / (((((((~j8) & j9) | j10) + ((j8 & j11) | j12)) - j13) + j14) ^ (j15 % 899334107));
        if (j16 < 0 || j16 > ((rb) this.f17958b).f15610a.length) {
            throw new vb();
        }
        this.f17957a = (int) j16;
    }

    @Override // com.google.android.gms.internal.ads.jb0, com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public /* synthetic */ void mo160c(Object obj) {
        ((oy1) obj).g(0, (jy1) ((l90) this.f17958b).f13426b, (cy1) this.f17959c, (a0.c0) this.f17960d, this.f17957a);
    }

    public long d() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        return this.f17957a * (((((((~j) & j8) | j9) + ((j & j10) | j11)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.f17958b) {
            try {
                mq0.c0(this.f17957a > 0);
                int i4 = this.f17957a - 1;
                this.f17957a = i4;
                if (i4 == 0 && (handlerThread = (HandlerThread) this.f17960d) != null) {
                    handlerThread.quit();
                    this.f17960d = null;
                    this.f17959c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long f() throws vb {
        try {
            kb kbVar = (kb) this.f17959c;
            rb rbVar = (rb) this.f17958b;
            this.f17957a = this.f17957a + 1;
            return kbVar.f(rbVar, r2);
        } catch (IndexOutOfBoundsException e2) {
            throw new vb(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public byte[] g(int i4, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i4 > this.f17957a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        pl1 pl1Var = (pl1) this.f17958b;
        ((Mac) pl1Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) pl1Var.get()).doFinal(), i4);
    }

    public int h() {
        try {
            kb kbVar = (kb) this.f17959c;
            rb rbVar = (rb) this.f17958b;
            int i4 = this.f17957a;
            this.f17957a = i4 + 1;
            int iF = kbVar.f(rbVar, i4) & 255;
            kb kbVar2 = (kb) this.f17959c;
            rb rbVar2 = (rb) this.f17958b;
            int i10 = this.f17957a;
            this.f17957a = i10 + 1;
            int iF2 = iF | ((kbVar2.f(rbVar2, i10) & 255) << 8);
            kb kbVar3 = (kb) this.f17959c;
            rb rbVar3 = (rb) this.f17958b;
            int i11 = this.f17957a;
            this.f17957a = i11 + 1;
            int iF3 = iF2 | ((kbVar3.f(rbVar3, i11) & 255) << 16);
            kb kbVar4 = (kb) this.f17959c;
            rb rbVar4 = (rb) this.f17958b;
            int i12 = this.f17957a;
            this.f17957a = i12 + 1;
            return iF3 | (kbVar4.f(rbVar4, i12) << 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new vb(e2);
        }
    }

    public long i() throws tb, vb {
        int i4 = 0;
        long j = 0;
        while (i4 < 64) {
            try {
                kb kbVar = (kb) this.f17959c;
                rb rbVar = (rb) this.f17958b;
                int i10 = this.f17957a;
                this.f17957a = i10 + 1;
                byte bF = kbVar.f(rbVar, i10);
                j |= (bF & 127) << i4;
                if (i4 == 63) {
                    if (bF > 1) {
                        throw new tb();
                    }
                    i4 = 63;
                }
                if ((bF & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i4 += 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new vb(e2);
            }
        }
        throw new tb();
    }

    public rb j(long j) throws ub, vb {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        k(d() + j);
        int i17 = this.f17957a;
        long j8 = i17;
        rb rbVar = (rb) this.f17958b;
        long j9 = (j >> ((i16 % 774318984) ^ iM)) + j8;
        if (j9 > rbVar.f15610a.length || j9 < j8) {
            throw new vb();
        }
        try {
            int i18 = (int) j9;
            rb rbVarK = ((kb) this.f17959c).k(rbVar, i17, i18);
            this.f17957a = i18;
            return rbVarK;
        } catch (IndexOutOfBoundsException e2) {
            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e2);
        }
    }

    public /* synthetic */ wb(l90 l90Var, cy1 cy1Var, a0.c0 c0Var, int i4) {
        this.f17958b = l90Var;
        this.f17959c = cy1Var;
        this.f17960d = c0Var;
        this.f17957a = i4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public wb(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i4;
        pl1 pl1Var = new pl1(0, this);
        this.f17958b = pl1Var;
        if (al0.q(2)) {
            this.f17959c = str;
            this.f17960d = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i4 = 20;
                            this.f17957a = i4;
                            pl1Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i4 = 28;
                            this.f17957a = i4;
                            pl1Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i4 = 32;
                            this.f17957a = i4;
                            pl1Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i4 = 48;
                            this.f17957a = i4;
                            pl1Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i4 = 64;
                            this.f17957a = i4;
                            pl1Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
