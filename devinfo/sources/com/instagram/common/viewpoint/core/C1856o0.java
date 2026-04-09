package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.o0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1856o0 extends Thread implements CG {
    public static String[] A09 = {"WULC9DYlvQgZjojDU2bdZ9xs7wQbeGsA", "0RzPpdpgLbDOZ8gUAj9sr", "fywSSsB8oN823aa6hQ2avodpE9Fj6EUo", "rQ4mhJZFramri", "thNzrz2pgMkLR", "sKcdOZc1ZRugYqEHWVRtFgFPdRxve1CE", "006dlWDsgbMi7GTsUIBgGpVxQZYkiOjN", "1EnGqdZRllbwfzBFLuDlK"};
    public long A00;
    public Exception A01;
    public final int A02;
    public final C6 A03;
    public final DownloadRequest A04;
    public final CH A05;
    public final boolean A06;
    public volatile C2 A07;
    public volatile boolean A08;

    public C1856o0(DownloadRequest downloadRequest, CH ch2, C6 c62, boolean z3, int i4, C2 c22) {
        this.A04 = downloadRequest;
        this.A05 = ch2;
        this.A03 = c62;
        this.A06 = z3;
        this.A02 = i4;
        this.A07 = c22;
        this.A00 = -1L;
    }

    public static int A00(int i4) {
        return Math.min((i4 - 1) * 1000, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
    }

    public final void A05(boolean z3) {
        if (z3) {
            this.A07 = null;
        }
        if (!this.A08) {
            this.A08 = true;
            this.A05.cancel();
            if (A09[5].charAt(29) == 'B') {
                throw new RuntimeException();
            }
            A09[5] = "eeNE7Qy6MuAlBYtV44JqSUiJf46fCooo";
            interrupt();
        }
    }

    @Override // com.instagram.common.viewpoint.core.CG
    public final void AFW(long j, long j8, float f10) {
        this.A03.A01 = j8;
        this.A03.A00 = f10;
        if (j != this.A00) {
            this.A00 = j;
            C2 c22 = this.A07;
            if (c22 != null) {
                c22.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A06) {
                    this.A05.remove();
                } else {
                    int i4 = 0;
                    long j = -1;
                    while (!this.A08) {
                        try {
                            this.A05.A63(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.A08) {
                                long j8 = this.A03.A01;
                                int errorCount = A09[2].charAt(8);
                                if (errorCount != 71) {
                                    String[] strArr = A09;
                                    strArr[0] = "VpOvMV7lY4vr3Fu5UlYiKKcH9ACGqt7g";
                                    strArr[6] = "gAlRMyi1pPzVqBLwURYLCrt7UwpliGsz";
                                    if (j8 != j) {
                                        j = j8;
                                        i4 = 0;
                                    }
                                    i4++;
                                    if (i4 <= this.A02) {
                                        Thread.sleep(A00(i4));
                                    } else {
                                        throw e2;
                                    }
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e10) {
                this.A01 = e10;
            }
            Handler internalHandler = this.A07;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
            if (A09[5].charAt(29) == 'B') {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[0] = "35cAsSHzLcpGFjLAU34RIcGdZnNZcSm1";
            strArr2[6] = "9oN8QLA5AyCkKiMzUX6AKpAi6mTPSF3S";
        }
    }
}
