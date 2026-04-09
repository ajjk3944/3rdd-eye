package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class rk implements ic1 {

    /* renamed from: a, reason: collision with root package name */
    private final hk f32674a;

    /* renamed from: b, reason: collision with root package name */
    protected final jm f32675b;

    public rk(qh0 qh0Var, jm jmVar) {
        this.f32674a = qh0Var;
        this.f32675b = jmVar;
    }

    @Override // com.yandex.mobile.ads.impl.ic1
    public final nc1 a(op1<?> op1Var) throws fi2, IOException {
        IOException iOException;
        mh0 mh0Var;
        byte[] bArr;
        op1<?> op1Var2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                mh0 mh0VarA = this.f32674a.a(op1Var, hh0.a(op1Var.c()));
                try {
                    int iE = mh0VarA.e();
                    List<ef0> listD = mh0VarA.d();
                    if (iE == 304) {
                        return vc1.a(op1Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                    }
                    InputStream inputStreamA = mh0VarA.a();
                    byte[] bArrA = inputStreamA != null ? vc1.a(inputStreamA, mh0VarA.c(), this.f32675b) : new byte[0];
                    try {
                        vc1.a(SystemClock.elapsedRealtime() - jElapsedRealtime, op1Var, bArrA, iE);
                        if (iE < 200 || iE > 299) {
                            throw new IOException();
                        }
                        return new nc1(iE, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listD);
                    } catch (IOException e4) {
                        e = e4;
                        op1Var2 = op1Var;
                        mh0Var = mh0VarA;
                        bArr = bArrA;
                        iOException = e;
                        vc1.a(op1Var2, vc1.a(op1Var2, iOException, jElapsedRealtime, mh0Var, bArr));
                        op1Var = op1Var2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    bArr = null;
                    mh0Var = mh0VarA;
                    op1Var2 = op1Var;
                }
            } catch (IOException e11) {
                iOException = e11;
                mh0Var = null;
                bArr = null;
                op1Var2 = op1Var;
            }
            vc1.a(op1Var2, vc1.a(op1Var2, iOException, jElapsedRealtime, mh0Var, bArr));
            op1Var = op1Var2;
        }
    }
}
