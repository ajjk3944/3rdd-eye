package ma;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16449b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16450c;

    public /* synthetic */ f(int i10, int i11, List list) {
        this.f16448a = i11;
        this.f16449b = i10;
        this.f16450c = list;
    }

    public h0 a(int i10, f0 f0Var) {
        String str = f0Var.f16451a;
        if (i10 == 2) {
            return new w(new k(new c0(1, c(f0Var))));
        }
        if (i10 == 3 || i10 == 4) {
            return new w(new u(str, 0));
        }
        if (i10 == 21) {
            return new w(new h(1));
        }
        if (i10 == 27) {
            if (e(4)) {
                return null;
            }
            return new w(new q(new c0(0, c(f0Var)), e(1), e(8)));
        }
        if (i10 == 36) {
            return new w(new s(new c0(0, c(f0Var))));
        }
        if (i10 == 89) {
            return new w(new h(0, f0Var.f16452b));
        }
        if (i10 != 138) {
            if (i10 == 172) {
                return new w(new b(str, 1));
            }
            if (i10 == 257) {
                return new b0(new io.sentry.k("application/vnd.dvb.ait", 14));
            }
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        if (e(16)) {
                            return null;
                        }
                        return new b0(new io.sentry.k("application/x-scte35", 14));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                if (e(2)) {
                                    return null;
                                }
                                return new w(new e(false, str));
                            case 16:
                                return new w(new n(new c0(1, c(f0Var))));
                            case 17:
                                if (e(2)) {
                                    return null;
                                }
                                return new w(new t(str, 0));
                            default:
                                return null;
                        }
                    }
                } else if (!e(64)) {
                    return null;
                }
            }
            return new w(new b(str, 0));
        }
        return new w(new g(str, 0));
    }

    public w6.w b(int i10, f0 f0Var) {
        String str = f0Var.f16451a;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w6.k(new u(str, 1));
            }
            if (i10 == 21) {
                return new w6.k(new h(3));
            }
            if (i10 == 27) {
                if (e(4)) {
                    return null;
                }
                return new w6.k(new q(new w6.s(0, d(f0Var)), e(1), e(8)));
            }
            if (i10 == 36) {
                return new w6.k(new s(new w6.s(0, d(f0Var))));
            }
            if (i10 == 89) {
                return new w6.k(new h(2, f0Var.f16452b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w6.k(new w6.b(str, 1));
                }
                if (i10 == 257) {
                    return new w6.r(new qm.c("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (e(16)) {
                        return null;
                    }
                    return new w6.r(new qm.c("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (e(2)) {
                                return null;
                            }
                            return new w6.k(new w6.e(false, str));
                        case 16:
                            return new w6.k(new w6.j(new w6.s(1, d(f0Var))));
                        case 17:
                            if (e(2)) {
                                return null;
                            }
                            return new w6.k(new t(str, 1));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!e(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new w6.k(new w6.b(str, 0));
            }
            return new w6.k(new g(str, 1));
        }
        return new w6.k(new w6.h(new w6.s(1, d(f0Var))));
    }

    public List c(f0 f0Var) {
        String str;
        int i10;
        boolean zE = e(32);
        List list = this.f16450c;
        if (zE) {
            return list;
        }
        fb.f fVar = new fb.f(f0Var.f16453c);
        while (fVar.a() > 0) {
            int iO = fVar.o();
            int iO2 = fVar.f8801b + fVar.o();
            if (iO == 134) {
                ArrayList arrayList = new ArrayList();
                int iO3 = fVar.o() & 31;
                for (int i11 = 0; i11 < iO3; i11++) {
                    String strM = fVar.m(3, ne.g.f17524c);
                    int iO4 = fVar.o();
                    boolean z10 = (iO4 & 128) != 0;
                    if (z10) {
                        i10 = iO4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bO = (byte) fVar.o();
                    fVar.z(1);
                    List listSingletonList = z10 ? Collections.singletonList((bO & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
                    g0Var.k = str;
                    g0Var.f4144c = strM;
                    g0Var.C = i10;
                    g0Var.f4152m = listSingletonList;
                    arrayList.add(new Format(g0Var));
                }
                list = arrayList;
            }
            fVar.y(iO2);
        }
        return list;
    }

    public List d(f0 f0Var) {
        String str;
        int i10;
        boolean zE = e(32);
        List list = this.f16450c;
        if (zE) {
            return list;
        }
        a5.v vVar = new a5.v(f0Var.f16453c);
        while (vVar.a() > 0) {
            int iT = vVar.t();
            int iT2 = vVar.f166b + vVar.t();
            if (iT == 134) {
                ArrayList arrayList = new ArrayList();
                int iT3 = vVar.t() & 31;
                for (int i11 = 0; i11 < iT3; i11++) {
                    String strR = vVar.r(3, ne.g.f17524c);
                    int iT4 = vVar.t();
                    boolean z10 = (iT4 & 128) != 0;
                    if (z10) {
                        i10 = iT4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bT = (byte) vVar.t();
                    vVar.F(1);
                    List listSingletonList = z10 ? Collections.singletonList((bT & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    qVar.k = str;
                    qVar.f1736c = strR;
                    qVar.C = i10;
                    qVar.f1744m = listSingletonList;
                    arrayList.add(new androidx.media3.common.r(qVar));
                }
                list = arrayList;
            }
            vVar.E(iT2);
        }
        return list;
    }

    public boolean e(int i10) {
        switch (this.f16448a) {
            case 0:
                if ((i10 & this.f16449b) != 0) {
                }
                break;
            default:
                if ((i10 & this.f16449b) != 0) {
                }
                break;
        }
        return false;
    }

    public f() {
        this.f16448a = 1;
        this.f16449b = 1;
        this.f16450c = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f16448a = 1;
        this.f16449b = 0;
        this.f16450c = arrayList;
    }
}
