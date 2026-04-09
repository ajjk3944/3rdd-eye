package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4068a;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.s32;
import java.util.Collections;

/* loaded from: classes3.dex */
final class qh extends s32 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f32212e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f32213b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32214c;

    /* renamed from: d, reason: collision with root package name */
    private int f32215d;

    public qh(n52 n52Var) {
        super(n52Var);
    }

    public final boolean a(uf1 uf1Var) throws s32.a {
        if (this.f32213b) {
            uf1Var.f(1);
        } else {
            int iT = uf1Var.t();
            int i = (iT >> 4) & 15;
            this.f32215d = i;
            if (i == 2) {
                this.f32858a.a(new dc0.a().e("audio/mpeg").c(1).l(f32212e[(iT >> 2) & 3]).a());
                this.f32214c = true;
            } else if (i == 7 || i == 8) {
                this.f32858a.a(new dc0.a().e(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).l(8000).a());
                this.f32214c = true;
            } else if (i != 10) {
                throw new s32.a("Audio format not supported: " + this.f32215d);
            }
            this.f32213b = true;
        }
        return true;
    }

    public final boolean a(long j4, uf1 uf1Var) throws yf1 {
        if (this.f32215d == 2) {
            int iA = uf1Var.a();
            this.f32858a.a(iA, uf1Var);
            this.f32858a.a(j4, 1, iA, 0, null);
            return true;
        }
        int iT = uf1Var.t();
        if (iT == 0 && !this.f32214c) {
            int iA2 = uf1Var.a();
            byte[] bArr = new byte[iA2];
            uf1Var.a(bArr, 0, iA2);
            C4068a.C0399a c0399aA = C4068a.a(new tf1(iA2, bArr), false);
            this.f32858a.a(new dc0.a().e("audio/mp4a-latm").a(c0399aA.f24351c).c(c0399aA.f24350b).l(c0399aA.f24349a).a(Collections.singletonList(bArr)).a());
            this.f32214c = true;
            return false;
        }
        if (this.f32215d == 10 && iT != 1) {
            return false;
        }
        int iA3 = uf1Var.a();
        this.f32858a.a(iA3, uf1Var);
        this.f32858a.a(j4, 1, iA3, 0, null);
        return true;
    }
}
