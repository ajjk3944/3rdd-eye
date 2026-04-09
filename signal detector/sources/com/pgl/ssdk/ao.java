package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f19604a;

    /* renamed from: b, reason: collision with root package name */
    private int f19605b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f19606c;

    public ao(Context context, int i, Object[] objArr) {
        this.f19604a = context;
        this.f19605b = i;
        this.f19606c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f19605b == 222) {
                ak.a(this.f19604a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f19605b, this.f19604a, this.f19606c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f19604a, this.f19605b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
