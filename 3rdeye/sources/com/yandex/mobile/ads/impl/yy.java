package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vc;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yy implements vc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36105a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36106b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f36107c;

    /* renamed from: d, reason: collision with root package name */
    private int f36108d;

    /* renamed from: e, reason: collision with root package name */
    private int f36109e;

    /* renamed from: f, reason: collision with root package name */
    private int f36110f;

    /* renamed from: g, reason: collision with root package name */
    private uc[] f36111g;

    public yy() {
        this(0);
    }

    public final synchronized uc a() {
        uc ucVar;
        try {
            int i = this.f36109e + 1;
            this.f36109e = i;
            int i10 = this.f36110f;
            if (i10 > 0) {
                uc[] ucVarArr = this.f36111g;
                int i11 = i10 - 1;
                this.f36110f = i11;
                ucVar = ucVarArr[i11];
                ucVar.getClass();
                this.f36111g[this.f36110f] = null;
            } else {
                uc ucVar2 = new uc(0, new byte[this.f36106b]);
                uc[] ucVarArr2 = this.f36111g;
                if (i > ucVarArr2.length) {
                    this.f36111g = (uc[]) Arrays.copyOf(ucVarArr2, ucVarArr2.length * 2);
                }
                ucVar = ucVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ucVar;
    }

    public final int b() {
        return this.f36106b;
    }

    public final synchronized int c() {
        return this.f36109e * this.f36106b;
    }

    public final synchronized void d() {
        if (this.f36105a) {
            a(0);
        }
    }

    public final synchronized void e() {
        try {
            int i = this.f36108d;
            int i10 = this.f36106b;
            int i11 = s82.f32899a;
            int i12 = (((i + i10) - 1) / i10) - this.f36109e;
            int i13 = 0;
            int iMax = Math.max(0, i12);
            int i14 = this.f36110f;
            if (iMax >= i14) {
                return;
            }
            if (this.f36107c != null) {
                int i15 = i14 - 1;
                while (i13 <= i15) {
                    uc ucVar = this.f36111g[i13];
                    ucVar.getClass();
                    if (ucVar.f34023a == this.f36107c) {
                        i13++;
                    } else {
                        uc ucVar2 = this.f36111g[i15];
                        ucVar2.getClass();
                        if (ucVar2.f34023a != this.f36107c) {
                            i15--;
                        } else {
                            uc[] ucVarArr = this.f36111g;
                            ucVarArr[i13] = ucVar2;
                            ucVarArr[i15] = ucVar;
                            i15--;
                            i13++;
                        }
                    }
                }
                iMax = Math.max(iMax, i13);
                if (iMax >= this.f36110f) {
                    return;
                }
            }
            Arrays.fill(this.f36111g, iMax, this.f36110f, (Object) null);
            this.f36110f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    public yy(int i) {
        this.f36105a = true;
        this.f36106b = 65536;
        this.f36110f = 0;
        this.f36111g = new uc[100];
        this.f36107c = null;
    }

    public final synchronized void a(uc ucVar) {
        uc[] ucVarArr = this.f36111g;
        int i = this.f36110f;
        this.f36110f = i + 1;
        ucVarArr[i] = ucVar;
        this.f36109e--;
        notifyAll();
    }

    public final synchronized void a(vc.a aVar) {
        while (aVar != null) {
            try {
                uc[] ucVarArr = this.f36111g;
                int i = this.f36110f;
                this.f36110f = i + 1;
                ucVarArr[i] = aVar.a();
                this.f36109e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void a(int i) {
        boolean z10 = i < this.f36108d;
        this.f36108d = i;
        if (z10) {
            e();
        }
    }
}
