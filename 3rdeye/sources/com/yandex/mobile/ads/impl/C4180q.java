package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4180q implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private final r f31960a = new r();

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f31961b = new uf1(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f31962c;

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f31960a.a(w70Var, new c72.d(RecyclerView.UNDEFINED_DURATION, 0, 1));
        w70Var.a();
        w70Var.a(new tw1.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        int i = ((rz) v70Var).read(this.f31961b.c(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f31961b.e(0);
        this.f31961b.d(i);
        if (!this.f31962c) {
            this.f31960a.a(4, 0L);
            this.f31962c = true;
        }
        this.f31960a.a(this.f31961b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f31962c = false;
        this.f31960a.a();
    }

    private static /* synthetic */ u70[] a() {
        return new u70[]{new C4180q()};
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar;
        int i;
        uf1 uf1Var = new uf1(10);
        int i10 = 0;
        while (true) {
            rzVar = (rz) v70Var;
            rzVar.b(uf1Var.c(), 0, 10, false);
            uf1Var.e(0);
            if (uf1Var.w() != 4801587) {
                break;
            }
            uf1Var.f(3);
            int iS = uf1Var.s();
            i10 += iS + 10;
            rzVar.a(false, iS);
        }
        rzVar.c();
        rzVar.a(false, i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            rzVar.b(uf1Var.c(), 0, 7, false);
            uf1Var.e(0);
            int iZ = uf1Var.z();
            if (iZ == 44096 || iZ == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArrC = uf1Var.c();
                if (bArrC.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArrC[2] & 255) << 8) | (bArrC[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArrC[4] & 255) << 16) | ((bArrC[5] & 255) << 8) | (bArrC[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iZ == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    return false;
                }
                rzVar.a(false, i - 7);
            } else {
                rzVar.c();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                rzVar.a(false, i12);
                i11 = 0;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }
}
