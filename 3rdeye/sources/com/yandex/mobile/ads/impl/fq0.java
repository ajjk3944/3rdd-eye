package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.yz0;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class fq0 implements u70 {

    /* renamed from: b, reason: collision with root package name */
    private w70 f27422b;

    /* renamed from: c, reason: collision with root package name */
    private int f27423c;

    /* renamed from: d, reason: collision with root package name */
    private int f27424d;

    /* renamed from: e, reason: collision with root package name */
    private int f27425e;

    /* renamed from: g, reason: collision with root package name */
    private p11 f27427g;

    /* renamed from: h, reason: collision with root package name */
    private v70 f27428h;
    private d22 i;

    /* renamed from: j, reason: collision with root package name */
    private r11 f27429j;

    /* renamed from: a, reason: collision with root package name */
    private final uf1 f27421a = new uf1(6);

    /* renamed from: f, reason: collision with root package name */
    private long f27426f = -1;

    private void a() {
        w70 w70Var = this.f27422b;
        w70Var.getClass();
        w70Var.a(1024, 4).a(new dc0.a().b().a(new yz0(new yz0.b[0])).a());
        w70 w70Var2 = this.f27422b;
        w70Var2.getClass();
        w70Var2.a();
        this.f27422b.a(new tw1.b(-9223372036854775807L, 0L));
        this.f27423c = 6;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f27422b = w70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r27, com.yandex.mobile.ads.impl.jj1 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fq0.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        if (j4 == 0) {
            this.f27423c = 0;
            this.f27429j = null;
        } else if (this.f27423c == 5) {
            r11 r11Var = this.f27429j;
            r11Var.getClass();
            r11Var.a(j4, j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar = (rz) v70Var;
        this.f27421a.c(2);
        rzVar.b(this.f27421a.c(), 0, 2, false);
        if (this.f27421a.z() != 65496) {
            return false;
        }
        this.f27421a.c(2);
        rzVar.b(this.f27421a.c(), 0, 2, false);
        int iZ = this.f27421a.z();
        this.f27424d = iZ;
        if (iZ == 65504) {
            this.f27421a.c(2);
            rzVar.b(this.f27421a.c(), 0, 2, false);
            rzVar.a(false, this.f27421a.z() - 2);
            this.f27421a.c(2);
            rzVar.b(this.f27421a.c(), 0, 2, false);
            this.f27424d = this.f27421a.z();
        }
        if (this.f27424d != 65505) {
            return false;
        }
        rzVar.a(false, 2);
        this.f27421a.c(6);
        rzVar.b(this.f27421a.c(), 0, 6, false);
        return this.f27421a.v() == 1165519206 && this.f27421a.z() == 0;
    }
}
