package com.pgl.ssdk;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f21476a;

    /* renamed from: b, reason: collision with root package name */
    private int f21477b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f21478c;

    public ao(Context context, int i4, Object[] objArr) {
        this.f21476a = context;
        this.f21477b = i4;
        this.f21478c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f21477b == 222) {
                ak.a(this.f21476a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f21477b, this.f21476a, this.f21478c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f21476a, this.f21477b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
