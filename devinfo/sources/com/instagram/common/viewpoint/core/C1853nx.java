package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1853nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC02013d A01;
    public final C02565i A02;
    public final C8B A03;
    public final C0673Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC02464y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
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
    @Override // com.instagram.common.viewpoint.core.CH
    public final void A63(CG cg2) throws InterruptedException, IOException {
        this.A00 = cg2;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 122));
        }
        boolean z3 = false;
        while (!z3) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C1854ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z3 = true;
                } catch (ExecutionException e2) {
                    Throwable th2 = (Throwable) AbstractC02203y.A01(e2.getCause());
                    if (0 == 0) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        C5C.A11(th2);
                        throw null;
                    }
                }
            } catch (Throwable th3) {
                ((AbstractRunnableFutureC02464y) AbstractC02203y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th3;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC02464y) AbstractC02203y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C1853nx(C1985q7 c1985q7, C1652kT c1652kT, Executor executor) {
        this.A05 = (Executor) AbstractC02203y.A01(executor);
        AbstractC02203y.A01(c1985q7.A03);
        this.A02 = new C02535f().A06(c1985q7.A03.A00).A08(c1985q7.A03.A04).A02(4).A09();
        this.A03 = c1652kT.A07();
        this.A04 = new C0673Me(this.A03, this.A02, null, new InterfaceC0672Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.instagram.common.viewpoint.core.InterfaceC0672Md
            public final void AFX(long j, long j8, long j9) {
                this.A00.A03(j, j8, j9);
            }
        });
        this.A01 = c1652kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j8, long j9) {
        float f10;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f10 = -1.0f;
        } else {
            f10 = (j8 * 100.0f) / j;
        }
        this.A00.AFW(j, j8, f10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC02464y<Void, IOException> abstractRunnableFutureC02464y = this.A06;
        if (abstractRunnableFutureC02464y != null) {
            abstractRunnableFutureC02464y.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
