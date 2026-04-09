package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.di0;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class fi0 {

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f27342a = new uf1(10);

    public final yz0 a(rz rzVar, di0.a aVar) throws IOException {
        yz0 yz0VarA = null;
        int i = 0;
        while (true) {
            try {
                rzVar.b(this.f27342a.c(), 0, 10, false);
                this.f27342a.e(0);
                if (this.f27342a.w() != 4801587) {
                    break;
                }
                this.f27342a.f(3);
                int iS = this.f27342a.s();
                int i10 = iS + 10;
                if (yz0VarA == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f27342a.c(), 0, bArr, 0, 10);
                    rzVar.b(bArr, 10, iS, false);
                    yz0VarA = new di0(aVar).a(i10, bArr);
                } else {
                    rzVar.a(false, iS);
                }
                i += i10;
            } catch (EOFException unused) {
            }
        }
        rzVar.c();
        rzVar.a(false, i);
        return yz0VarA;
    }
}
