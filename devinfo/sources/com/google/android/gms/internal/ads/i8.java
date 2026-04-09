package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i8 implements j8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12165a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12166b;

    /* renamed from: c, reason: collision with root package name */
    public long f12167c;

    /* renamed from: d, reason: collision with root package name */
    public int f12168d;

    /* renamed from: e, reason: collision with root package name */
    public int f12169e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12170f;
    public Object g;

    public i8() {
        this.f12165a = 1;
        this.f12170f = new sk0(10);
        this.f12167c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void a(boolean z3) {
        int i4;
        switch (this.f12165a) {
            case 0:
                if (this.f12166b) {
                    mq0.c0(this.f12167c != -9223372036854775807L);
                    for (u2 u2Var : (u2[]) this.g) {
                        u2Var.d(this.f12167c, 1, this.f12169e, 0, null);
                    }
                    this.f12166b = false;
                    break;
                }
                break;
            default:
                ((u2) this.g).getClass();
                if (this.f12166b && (i4 = this.f12168d) != 0 && this.f12169e == i4) {
                    mq0.c0(this.f12167c != -9223372036854775807L);
                    ((u2) this.g).d(this.f12167c, 1, this.f12168d, 0, null);
                    this.f12166b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void b() {
        switch (this.f12165a) {
            case 0:
                this.f12166b = false;
                this.f12167c = -9223372036854775807L;
                break;
            default:
                this.f12166b = false;
                this.f12167c = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void c(int i4, long j) {
        switch (this.f12165a) {
            case 0:
                if ((i4 & 4) != 0) {
                    this.f12166b = true;
                    this.f12167c = j;
                    this.f12169e = 0;
                    this.f12168d = 2;
                    break;
                }
                break;
            default:
                if ((i4 & 4) != 0) {
                    this.f12166b = true;
                    this.f12167c = j;
                    this.f12168d = 0;
                    this.f12169e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void d(sk0 sk0Var) {
        boolean z3;
        boolean z10;
        switch (this.f12165a) {
            case 0:
                if (this.f12166b) {
                    if (this.f12168d == 2) {
                        if (sk0Var.B() == 0) {
                            z10 = false;
                        } else {
                            if (sk0Var.K() != 32) {
                                this.f12166b = false;
                            }
                            this.f12168d--;
                            z10 = this.f12166b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f12168d == 1) {
                        if (sk0Var.B() == 0) {
                            z3 = false;
                        } else {
                            if (sk0Var.K() != 0) {
                                this.f12166b = false;
                            }
                            this.f12168d--;
                            z3 = this.f12166b;
                        }
                        if (!z3) {
                        }
                    }
                    int i4 = sk0Var.f16447b;
                    int iB = sk0Var.B();
                    for (u2 u2Var : (u2[]) this.g) {
                        sk0Var.E(i4);
                        u2Var.b(iB, sk0Var);
                    }
                    this.f12169e += iB;
                    break;
                }
                break;
            default:
                ((u2) this.g).getClass();
                if (this.f12166b) {
                    int iB2 = sk0Var.B();
                    int i10 = this.f12169e;
                    if (i10 < 10) {
                        int iMin = Math.min(iB2, 10 - i10);
                        byte[] bArr = sk0Var.f16446a;
                        int i11 = sk0Var.f16447b;
                        sk0 sk0Var2 = (sk0) this.f12170f;
                        System.arraycopy(bArr, i11, sk0Var2.f16446a, this.f12169e, iMin);
                        if (this.f12169e + iMin == 10) {
                            sk0Var2.E(0);
                            if (sk0Var2.K() != 73 || sk0Var2.K() != 68 || sk0Var2.K() != 51) {
                                ls.t("Id3Reader", "Discarding invalid ID3 tag");
                                this.f12166b = false;
                                break;
                            } else {
                                sk0Var2.G(3);
                                this.f12168d = sk0Var2.g() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.f12168d - this.f12169e);
                    ((u2) this.g).b(iMin2, sk0Var);
                    this.f12169e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j8
    public final void e(z1 z1Var, h9 h9Var) {
        switch (this.f12165a) {
            case 0:
                int i4 = 0;
                while (true) {
                    u2[] u2VarArr = (u2[]) this.g;
                    if (i4 >= u2VarArr.length) {
                        break;
                    } else {
                        g9 g9Var = (g9) ((List) this.f12170f).get(i4);
                        h9Var.a();
                        h9Var.b();
                        u2 u2VarM = z1Var.m(h9Var.f11776d, 3);
                        lw1 lw1Var = new lw1();
                        h9Var.b();
                        lw1Var.f13652a = h9Var.f11777e;
                        lw1Var.d("video/mp2t");
                        lw1Var.e("application/dvbsubs");
                        lw1Var.f13664o = Collections.singletonList(g9Var.f11403b);
                        lw1Var.f13655d = g9Var.f11402a;
                        u2VarM.f(new mx1(lw1Var));
                        u2VarArr[i4] = u2VarM;
                        i4++;
                    }
                }
            default:
                h9Var.a();
                h9Var.b();
                u2 u2VarM2 = z1Var.m(h9Var.f11776d, 5);
                this.g = u2VarM2;
                lw1 lw1Var2 = new lw1();
                h9Var.b();
                lw1Var2.f13652a = h9Var.f11777e;
                lw1Var2.d("video/mp2t");
                lw1Var2.e("application/id3");
                u2VarM2.f(new mx1(lw1Var2));
                break;
        }
    }

    public i8(List list) {
        this.f12165a = 0;
        this.f12170f = list;
        this.g = new u2[list.size()];
        this.f12167c = -9223372036854775807L;
    }
}
