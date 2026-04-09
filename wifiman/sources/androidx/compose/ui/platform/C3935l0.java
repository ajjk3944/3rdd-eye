package androidx.compose.ui.platform;

import W0.k;
import Zg.AbstractC3689v;
import android.os.Parcel;
import android.util.Base64;
import l0.AbstractC6532h;
import m0.C6733v0;

/* renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3935l0 {

    /* renamed from: a, reason: collision with root package name */
    private final Parcel f29456a;

    public C3935l0(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f29456a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.f29456a.dataAvail();
    }

    private final float b() {
        return W0.a.c(e());
    }

    private final byte c() {
        return this.f29456a.readByte();
    }

    private final float e() {
        return this.f29456a.readFloat();
    }

    private final int i() {
        return this.f29456a.readInt();
    }

    private final m0.g1 j() {
        return new m0.g1(d(), AbstractC6532h.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.f29456a.readString();
    }

    private final W0.k m() {
        int i10 = i();
        k.a aVar = W0.k.f23532b;
        boolean z10 = (aVar.b().e() & i10) != 0;
        boolean z11 = (i10 & aVar.d().e()) != 0;
        return (z10 && z11) ? aVar.a(AbstractC3689v.o(aVar.b(), aVar.d())) : z10 ? aVar.b() : z11 ? aVar.d() : aVar.c();
    }

    private final W0.o n() {
        return new W0.o(e(), e());
    }

    private final long p() {
        return Yg.E.b(this.f29456a.readLong());
    }

    public final long d() {
        return C6733v0.h(p());
    }

    public final int f() {
        byte bC = c();
        if (bC != 0 && bC == 1) {
            return Q0.v.f19100b.a();
        }
        return Q0.v.f19100b.b();
    }

    public final int g() {
        byte bC = c();
        return bC == 0 ? Q0.w.f19104b.b() : bC == 1 ? Q0.w.f19104b.a() : bC == 3 ? Q0.w.f19104b.c() : bC == 2 ? Q0.w.f19104b.d() : Q0.w.f19104b.b();
    }

    public final Q0.A h() {
        return new Q0.A(i());
    }

    public final L0.D k() {
        I0 i02;
        I0 i03 = i0;
        I0 i04 = new I0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f29456a.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                i02 = i03;
                if (bC == 2) {
                    if (a() < 5) {
                        break;
                    }
                    i02.e(o());
                    i03 = i02;
                } else if (bC == 3) {
                    if (a() < 4) {
                        break;
                    }
                    i02.h(h());
                    i03 = i02;
                } else if (bC == 4) {
                    if (a() < 1) {
                        break;
                    }
                    i02.f(Q0.v.c(f()));
                    i03 = i02;
                } else if (bC != 5) {
                    if (bC != 6) {
                        if (bC != 7) {
                            if (bC != 8) {
                                if (bC != 9) {
                                    if (bC != 10) {
                                        if (bC != 11) {
                                            if (bC == 12) {
                                                if (a() < 20) {
                                                    break;
                                                }
                                                i02.j(j());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            i02.k(m());
                                        }
                                    } else {
                                        if (a() < 8) {
                                            break;
                                        }
                                        i02.a(d());
                                    }
                                } else {
                                    if (a() < 8) {
                                        break;
                                    }
                                    i02.l(n());
                                }
                            } else {
                                if (a() < 4) {
                                    break;
                                }
                                i02.b(W0.a.b(b()));
                            }
                        } else {
                            if (a() < 5) {
                                break;
                            }
                            i02.i(o());
                        }
                    } else {
                        i02.d(l());
                    }
                    i03 = i02;
                } else {
                    if (a() < 1) {
                        break;
                    }
                    i02.g(Q0.w.e(g()));
                    i03 = i02;
                }
            } else {
                if (a() < 8) {
                    break;
                }
                i03.c(d());
            }
        }
        i02 = i03;
        return i02.m();
    }

    public final long o() {
        byte bC = c();
        long jB = bC == 1 ? Y0.x.f24553b.b() : bC == 2 ? Y0.x.f24553b.a() : Y0.x.f24553b.c();
        return Y0.x.g(jB, Y0.x.f24553b.c()) ? Y0.v.f24549b.a() : Y0.w.a(e(), jB);
    }
}
