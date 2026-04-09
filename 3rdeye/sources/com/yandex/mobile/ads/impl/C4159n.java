package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4159n implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private final C4166o f30630a = new C4166o();

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f30631b = new uf1(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f30632c;

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f30630a.a(w70Var, new c72.d(RecyclerView.UNDEFINED_DURATION, 0, 1));
        w70Var.a();
        w70Var.a(new tw1.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        int i = ((rz) v70Var).read(this.f30631b.c(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f30631b.e(0);
        this.f30631b.d(i);
        if (!this.f30632c) {
            this.f30630a.a(4, 0L);
            this.f30632c = true;
        }
        this.f30630a.a(this.f30631b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f30632c = false;
        this.f30630a.a();
    }

    private static /* synthetic */ u70[] a() {
        return new u70[]{new C4159n()};
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar;
        uf1 uf1Var = new uf1(10);
        int i = 0;
        while (true) {
            rzVar = (rz) v70Var;
            rzVar.b(uf1Var.c(), 0, 10, false);
            uf1Var.e(0);
            if (uf1Var.w() != 4801587) {
                break;
            }
            uf1Var.f(3);
            int iS = uf1Var.s();
            i += iS + 10;
            rzVar.a(false, iS);
        }
        rzVar.c();
        rzVar.a(false, i);
        int i10 = 0;
        int i11 = i;
        while (true) {
            rzVar.b(uf1Var.c(), 0, 6, false);
            uf1Var.e(0);
            if (uf1Var.z() != 2935) {
                rzVar.c();
                i11++;
                if (i11 - i >= 8192) {
                    return false;
                }
                rzVar.a(false, i11);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int iA = C4173p.a(uf1Var.c());
                if (iA == -1) {
                    return false;
                }
                rzVar.a(false, iA - 6);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }
}
