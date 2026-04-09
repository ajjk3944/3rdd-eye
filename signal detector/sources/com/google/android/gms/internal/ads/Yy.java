package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Yy {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f12738a;

    /* renamed from: b, reason: collision with root package name */
    public final C1948uA f12739b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12740c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f12741d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f12742e;

    public Yy(C1948uA c1948uA) {
        this.f12739b = c1948uA;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.tA) VIRTUAL call: com.google.android.gms.internal.ads.tA.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:23:0x0039 */
    public final void a() {
        C1894tA c1894tAC;
        if (b()) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                C1894tA c1894tAA = this.f12739b.a(202);
                try {
                    c1894tAA.a();
                    this.f12742e = secureRandom;
                    this.f12738a = MessageDigest.getInstance("MD5");
                    this.f12741d = true;
                } catch (NoSuchAlgorithmException e6) {
                    c1894tAA.b(e6);
                } catch (Throwable th) {
                    c1894tAA.b(th);
                    throw th;
                }
                c1894tAA.c();
            } catch (Throwable th2) {
                c1894tAC.c();
                throw th2;
            }
        }
    }

    public final synchronized boolean b() {
        return this.f12741d;
    }

    public final byte[] c(byte[] bArr, String str, boolean z6) {
        int length = bArr.length;
        int i = true != z6 ? 255 : 239;
        AbstractC0582Jp.m(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i3 = i - length;
            byte[] bArr2 = new byte[i3];
            this.f12742e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i3);
            System.arraycopy(bArr2, 0, bArr, length, i3);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z6) {
            bArrArray = ByteBuffer.allocate(256).put(d(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC0910az[] interfaceC0910azArr = (InterfaceC0910az[]) new B6(1).f7158K2;
        int length2 = interfaceC0910azArr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            interfaceC0910azArr[i6].a(bArrArray, bArr3);
        }
        if (!C1476lN.k(str)) {
            Zy zy = new Zy(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), 0);
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte[] bArr4 = zy.f12997a;
                byte b5 = bArr4[i7];
                i8 = (i8 + b5) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b5;
                bArr3[i9] = (byte) (bArr4[(bArr4[i7] + b5) & 255] ^ bArr3[i9]);
            }
        }
        return bArr3;
    }

    public final byte[] d(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.f12740c) {
            this.f12738a.reset();
            this.f12738a.update(bArr);
            bArrDigest = this.f12738a.digest();
        }
        return bArrDigest;
    }

    public final C1621o6 e(String str, byte[] bArr) {
        C1621o6 c1621o6A = C1675p6.A();
        byte[] bArrD = d(bArr);
        OK ok = QK.f10609b;
        OK okR = QK.r(0, bArrD.length, bArrD);
        c1621o6A.b();
        ((C1675p6) c1621o6A.f13551b).C(okR);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i3 = i * 255;
            int i6 = i3 + 255;
            if (length > i6) {
                length = i6;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i3, length));
            i++;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            OK okR2 = QK.r(0, 256, c((byte[]) obj, str, false));
            c1621o6A.b();
            ((C1675p6) c1621o6A.f13551b).B(okR2);
        }
        return c1621o6A;
    }
}
