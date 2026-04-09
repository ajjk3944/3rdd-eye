package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.tw1;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ab implements u70 {

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f24592d;

    /* renamed from: e, reason: collision with root package name */
    private final tf1 f24593e;

    /* renamed from: f, reason: collision with root package name */
    private w70 f24594f;

    /* renamed from: g, reason: collision with root package name */
    private long f24595g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24597j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24598k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24599l;

    /* renamed from: a, reason: collision with root package name */
    private final int f24589a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final bb f24590b = new bb();

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f24591c = new uf1(2048);
    private int i = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f24596h = -1;

    public ab() {
        uf1 uf1Var = new uf1(10);
        this.f24592d = uf1Var;
        this.f24593e = new tf1(uf1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f24594f = w70Var;
        this.f24590b.a(w70Var, new c72.d(RecyclerView.UNDEFINED_DURATION, 0, 1));
        w70Var.a();
    }

    private int a(rz rzVar) throws IOException {
        int i = 0;
        while (true) {
            rzVar.b(this.f24592d.c(), 0, 10, false);
            this.f24592d.e(0);
            if (this.f24592d.w() != 4801587) {
                break;
            }
            this.f24592d.f(3);
            int iS = this.f24592d.s();
            i += iS + 10;
            rzVar.a(false, iS);
        }
        rzVar.c();
        rzVar.a(false, i);
        if (this.f24596h == -1) {
            this.f24596h = i;
        }
        return i;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        long j4;
        int i;
        if (this.f24594f != null) {
            rz rzVar = (rz) v70Var;
            long jB = rzVar.b();
            int i10 = this.f24589a;
            int i11 = 2;
            if (((i10 & 2) == 0 && ((i10 & 1) == 0 || jB == -1)) || this.f24597j) {
                j4 = jB;
                i = 2;
            } else {
                this.i = -1;
                rzVar.c();
                if (rzVar.a() == 0) {
                    a(rzVar);
                }
                long j10 = 0;
                int i12 = 0;
                while (rzVar.b(this.f24592d.c(), 0, i11, true)) {
                    try {
                        this.f24592d.e(0);
                        if ((this.f24592d.z() & 65526) != 65520) {
                            j4 = jB;
                            i = i11;
                            i12 = 0;
                            break;
                        }
                        if (!rzVar.b(this.f24592d.c(), 0, 4, true)) {
                            break;
                        }
                        this.f24593e.c(14);
                        int iB = this.f24593e.b(13);
                        if (iB <= 6) {
                            j4 = jB;
                            i = i11;
                            this.f24597j = true;
                            throw yf1.a("Malformed ADTS stream", (Exception) null);
                        }
                        j4 = jB;
                        i = i11;
                        j10 += iB;
                        i12++;
                        if (i12 == 1000) {
                            break;
                        }
                        try {
                            if (!rzVar.a(true, iB - 6)) {
                                break;
                            }
                            i11 = i;
                            jB = j4;
                        } catch (EOFException unused) {
                        }
                    } catch (EOFException unused2) {
                    }
                }
                j4 = jB;
                i = i11;
                rzVar.c();
                if (i12 > 0) {
                    this.i = (int) (j10 / i12);
                } else {
                    this.i = -1;
                }
                this.f24597j = true;
            }
            int i13 = rzVar.read(this.f24591c.c(), 0, 2048);
            boolean z10 = i13 == -1;
            if (!this.f24599l) {
                boolean z11 = (this.f24589a & 1) != 0 && this.i > 0;
                if (!z11 || this.f24590b.c() != -9223372036854775807L || z10) {
                    if (z11 && this.f24590b.c() != -9223372036854775807L) {
                        this.f24594f.a(new qr((int) ((this.i * 8000000) / this.f24590b.c()), this.i, j4, this.f24596h, (this.f24589a & i) != 0));
                    } else {
                        this.f24594f.a(new tw1.b(-9223372036854775807L, 0L));
                    }
                    this.f24599l = true;
                }
            }
            if (z10) {
                return -1;
            }
            this.f24591c.e(0);
            this.f24591c.d(i13);
            if (!this.f24598k) {
                this.f24590b.a(4, this.f24595g);
                this.f24598k = true;
            }
            this.f24590b.a(this.f24591c);
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f24598k = false;
        this.f24590b.a();
        this.f24595g = j10;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        rz rzVar = (rz) v70Var;
        int iA = a(rzVar);
        int i = iA;
        int i10 = 0;
        int i11 = 0;
        do {
            rzVar.b(this.f24592d.c(), 0, 2, false);
            this.f24592d.e(0);
            if ((this.f24592d.z() & 65526) == 65520) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                rzVar.b(this.f24592d.c(), 0, 4, false);
                this.f24593e.c(14);
                int iB = this.f24593e.b(13);
                if (iB <= 6) {
                    i++;
                    rzVar.c();
                    rzVar.a(false, i);
                } else {
                    rzVar.a(false, iB - 6);
                    i11 += iB;
                }
            } else {
                i++;
                rzVar.c();
                rzVar.a(false, i);
            }
            i10 = 0;
            i11 = 0;
        } while (i - iA < 8192);
        return false;
    }

    private static u70[] a() {
        return new u70[]{new ab()};
    }
}
