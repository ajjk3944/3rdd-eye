package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes3.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f19862a;

    /* renamed from: b, reason: collision with root package name */
    private int f19863b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f19864c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f19862a = context;
        this.f19863b = i10;
        this.f19864c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f19863b == 222) {
                ak.a(this.f19862a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f19863b, this.f19862a, this.f19864c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f19862a, this.f19863b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
