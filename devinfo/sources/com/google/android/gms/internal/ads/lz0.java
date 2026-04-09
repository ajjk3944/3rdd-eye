package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lz0 {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f13684a;

    /* renamed from: b, reason: collision with root package name */
    public final g21 f13685b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13686c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f13687d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f13688e;

    public lz0(g21 g21Var) {
        this.f13685b = g21Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.f21) VIRTUAL call: com.google.android.gms.internal.ads.f21.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:23:0x0039 */
    public final void a() {
        f21 f21VarC;
        if (b()) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                f21 f21VarA = this.f13685b.a(202);
                try {
                    f21VarA.a();
                    this.f13688e = secureRandom;
                    this.f13684a = MessageDigest.getInstance("MD5");
                    this.f13687d = true;
                } catch (NoSuchAlgorithmException e2) {
                    f21VarA.b(e2);
                } catch (Throwable th2) {
                    f21VarA.b(th2);
                    throw th2;
                }
                f21VarA.c();
            } catch (Throwable th3) {
                f21VarC.c();
                throw th3;
            }
        }
    }

    public final synchronized boolean b() {
        return this.f13687d;
    }

    public final byte[] c(byte[] bArr, String str, boolean z3) {
        int length = bArr.length;
        int i4 = true != z3 ? 255 : 239;
        mq0.m(length <= i4);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i4 + 1).put((byte) length);
        if (length < i4) {
            int i10 = i4 - length;
            byte[] bArr2 = new byte[i10];
            this.f13688e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i10);
            System.arraycopy(bArr2, 0, bArr, length, i10);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z3) {
            bArrArray = ByteBuffer.allocate(256).put(d(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        mz0[] mz0VarArr = (mz0[]) new ie(1).K2;
        int length2 = mz0VarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            mz0VarArr[i11].a(bArrArray, bArr3);
        }
        if (!yr1.k(str)) {
            xd xdVar = new xd(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), 2);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < 256; i14++) {
                i12 = (i12 + 1) & 255;
                byte[] bArr4 = xdVar.f18374a;
                byte b10 = bArr4[i12];
                i13 = (i13 + b10) & 255;
                bArr4[i12] = bArr4[i13];
                bArr4[i13] = b10;
                bArr3[i14] = (byte) (bArr4[(bArr4[i12] + b10) & 255] ^ bArr3[i14]);
            }
        }
        return bArr3;
    }

    public final byte[] d(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f13686c) {
            this.f13684a.reset();
            this.f13684a.update(bArr);
            bArrDigest = this.f13684a.digest();
        }
        return bArrDigest;
    }

    public final vd e(String str, byte[] bArr) {
        vd vdVarA = wd.A();
        byte[] bArrD = d(bArr);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV = bn1.v(0, bArrD.length, bArrD);
        vdVarA.b();
        ((wd) vdVarA.f14755b).C(zm1VarV);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i4 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i10 = i4 * 255;
            int i11 = i10 + 255;
            if (length > i11) {
                length = i11;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i10, length));
            i4++;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            zm1 zm1VarV2 = bn1.v(0, 256, c((byte[]) obj, str, false));
            vdVarA.b();
            ((wd) vdVarA.f14755b).B(zm1VarV2);
        }
        return vdVarA;
    }
}
