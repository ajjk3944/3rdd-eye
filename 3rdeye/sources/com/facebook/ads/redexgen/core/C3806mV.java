package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.mV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3806mV implements InterfaceC2434Bf {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public InterfaceC2433Be A00;
    public final AnonymousClass31 A01;
    public final AnonymousClass56 A02;
    public final C7S A03;
    public final M2 A04;
    public final Executor A05;
    public volatile C4M<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 68);
            i12++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2434Bf
    public final void A5v(InterfaceC2433Be interfaceC2433Be) throws InterruptedException, IOException {
        this.A00 = interfaceC2433Be;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 122));
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C3807mW(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z10 = true;
                } catch (ExecutionException e4) {
                    Throwable th = (Throwable) C3M.A01(e4.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        AbstractC22614a.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((C4M) C3M.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((C4M) C3M.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C3806mV(C3940oi c3940oi, C3602ix c3602ix, Executor executor) {
        this.A05 = (Executor) C3M.A01(executor);
        C3M.A01(c3940oi.A03);
        this.A02 = new AnonymousClass53().A06(c3940oi.A03.A00).A08(c3940oi.A03.A04).A02(4).A09();
        this.A03 = c3602ix.A07();
        this.A04 = new M2(this.A03, this.A02, null, new M1() { // from class: com.facebook.ads.redexgen.X.mX
            @Override // com.facebook.ads.redexgen.core.M1
            public final void AEp(long j4, long j10, long j11) {
                this.A00.A03(j4, j10, j11);
            }
        });
        this.A01 = c3602ix.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j4, long j10, long j11) {
        float f10;
        if (this.A00 == null) {
            return;
        }
        if (j4 == -1 || j4 == 0) {
            f10 = -1.0f;
        } else {
            f10 = (j10 * 100.0f) / j4;
        }
        this.A00.AEo(j4, j10, f10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4M != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2434Bf
    public final void cancel() {
        this.A07 = true;
        C4M<Void, IOException> c4m = this.A06;
        if (c4m != null) {
            c4m.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2434Bf
    public final void remove() {
        this.A03.A0E().AHk(this.A03.A0F().A4d(this.A02));
    }
}
