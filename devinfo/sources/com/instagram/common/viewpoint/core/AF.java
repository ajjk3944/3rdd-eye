package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AF implements InterfaceC1932pF {
    public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
    public long A00;
    public boolean A01;
    public final C5W A02;
    public final InterfaceC1932pF A03;

    public AF(InterfaceC1932pF interfaceC1932pF, C5W c5w) {
        this.A03 = (InterfaceC1932pF) AbstractC02203y.A01(interfaceC1932pF);
        this.A02 = (C5W) AbstractC02203y.A01(c5w);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void A43(InterfaceC02675t interfaceC02675t) {
        AbstractC02203y.A01(interfaceC02675t);
        this.A03.A43(interfaceC02675t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final long AGi(C02565i c02565i) throws IOException {
        this.A00 = this.A03.AGi(c02565i);
        if (this.A00 == 0) {
            return 0L;
        }
        long j = c02565i.A03;
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
        strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
        if (j == -1 && this.A00 != -1) {
            c02565i = c02565i.A05(0L, this.A00);
        }
        this.A01 = true;
        this.A02.AGk(c02565i);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01762c
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        if (this.A00 != 0) {
            int i11 = this.A03.read(bArr, i4, i10);
            if (i11 > 0) {
                this.A02.write(bArr, i4, i11);
                if (this.A00 != -1) {
                    this.A00 -= i11;
                }
            }
            return i11;
        }
        String[] strArr = A04;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
        strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
        return -1;
    }
}
