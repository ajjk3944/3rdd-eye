package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fm1 implements gm1 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public fm1() {
        this.a = 1;
        this.f = new kz2(10);
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.gm1
    public final void a() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.gm1
    public final void b(kz2 kz2Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (kz2Var.B() == 0) {
                            z2 = false;
                        } else {
                            if (kz2Var.K() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (kz2Var.B() == 0) {
                            z = false;
                        } else {
                            if (kz2Var.K() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = kz2Var.b;
                    int iB = kz2Var.B();
                    for (jg1 jg1Var : (jg1[]) this.g) {
                        kz2Var.E(i);
                        jg1Var.a(kz2Var, iB, 0);
                    }
                    this.e += iB;
                    break;
                }
                break;
            default:
                ((jg1) this.g).getClass();
                if (this.b) {
                    int iB2 = kz2Var.B();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iB2, 10 - i2);
                        byte[] bArr = kz2Var.a;
                        int i3 = kz2Var.b;
                        kz2 kz2Var2 = (kz2) this.f;
                        System.arraycopy(bArr, i3, kz2Var2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            kz2Var2.E(0);
                            if (kz2Var2.K() != 73 || kz2Var2.K() != 68 || kz2Var2.K() != 51) {
                                a30.x("Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                kz2Var2.G(3);
                                this.d = kz2Var2.g() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.d - this.e);
                    ((jg1) this.g).a(kz2Var, iMin2, 0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    zt0.b0(this.c != -9223372036854775807L);
                    for (jg1 jg1Var : (jg1[]) this.g) {
                        jg1Var.c(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((jg1) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    zt0.b0(this.c != -9223372036854775807L);
                    ((jg1) this.g).c(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    jg1[] jg1VarArr = (jg1[]) this.g;
                    if (i >= jg1VarArr.length) {
                        break;
                    } else {
                        hn1 hn1Var = (hn1) ((List) this.f).get(i);
                        in1Var.a();
                        in1Var.b();
                        jg1 jg1VarZ = nf1Var.z(in1Var.d, 3);
                        gg4 gg4Var = new gg4();
                        in1Var.b();
                        gg4Var.a = in1Var.e;
                        gg4Var.d("video/mp2t");
                        gg4Var.e("application/dvbsubs");
                        gg4Var.o = Collections.singletonList(hn1Var.b);
                        gg4Var.d = hn1Var.a;
                        jg1VarZ.d(new ph4(gg4Var));
                        jg1VarArr[i] = jg1VarZ;
                        i++;
                    }
                }
            default:
                in1Var.a();
                in1Var.b();
                jg1 jg1VarZ2 = nf1Var.z(in1Var.d, 5);
                this.g = jg1VarZ2;
                gg4 gg4Var2 = new gg4();
                in1Var.b();
                gg4Var2.a = in1Var.e;
                gg4Var2.d("video/mp2t");
                gg4Var2.e("application/id3");
                jg1VarZ2.d(new ph4(gg4Var2));
                break;
        }
    }

    public fm1(List list) {
        this.a = 0;
        this.f = list;
        this.g = new jg1[list.size()];
        this.c = -9223372036854775807L;
    }
}
