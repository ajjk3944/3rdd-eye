package s0;

import java.util.HashSet;
import java.util.Iterator;
import r0.C5507d;
import r0.C5508e;
import r0.C5509f;
import r0.C5511h;
import s0.C5543b;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C5543b.a f45932a = new C5543b.a();

    public static boolean a(C5508e c5508e) {
        C5508e.b bVar;
        C5508e.b bVar2;
        C5508e.b[] bVarArr = c5508e.f45535U;
        C5508e.b bVar3 = bVarArr[0];
        C5508e.b bVar4 = bVarArr[1];
        C5508e c5508e2 = c5508e.f45536V;
        C5509f c5509f = c5508e2 != null ? (C5509f) c5508e2 : null;
        if (c5509f != null) {
            C5508e.b bVar5 = c5509f.f45535U[0];
            C5508e.b bVar6 = C5508e.b.FIXED;
        }
        if (c5509f != null) {
            C5508e.b bVar7 = c5509f.f45535U[1];
            C5508e.b bVar8 = C5508e.b.FIXED;
        }
        C5508e.b bVar9 = C5508e.b.FIXED;
        boolean z10 = bVar3 == bVar9 || c5508e.A() || bVar3 == C5508e.b.WRAP_CONTENT || (bVar3 == (bVar2 = C5508e.b.MATCH_CONSTRAINT) && c5508e.f45574r == 0 && c5508e.f45539Y == 0.0f && c5508e.t(0)) || (bVar3 == bVar2 && c5508e.f45574r == 1 && c5508e.u(0, c5508e.q()));
        boolean z11 = bVar4 == bVar9 || c5508e.B() || bVar4 == C5508e.b.WRAP_CONTENT || (bVar4 == (bVar = C5508e.b.MATCH_CONSTRAINT) && c5508e.f45575s == 0 && c5508e.f45539Y == 0.0f && c5508e.t(1)) || (bVar4 == bVar && c5508e.f45575s == 1 && c5508e.u(1, c5508e.k()));
        return (c5508e.f45539Y > 0.0f && (z10 || z11)) || (z10 && z11);
    }

    public static void b(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b, boolean z10) {
        C5507d c5507d;
        C5507d c5507d2;
        C5507d c5507d3;
        C5507d c5507d4;
        if (c5508e.f45564m) {
            return;
        }
        if (!(c5508e instanceof C5509f) && c5508e.z() && a(c5508e)) {
            C5509f.V(c5508e, interfaceC0526b, new C5543b.a());
        }
        C5507d c5507dI = c5508e.i(C5507d.b.LEFT);
        C5507d c5507dI2 = c5508e.i(C5507d.b.RIGHT);
        int iD = c5507dI.d();
        int iD2 = c5507dI2.d();
        HashSet<C5507d> hashSet = c5507dI.f45506a;
        if (hashSet != null && c5507dI.f45508c) {
            Iterator<C5507d> it = hashSet.iterator();
            while (it.hasNext()) {
                C5507d next = it.next();
                C5508e c5508e2 = next.f45509d;
                int i10 = i + 1;
                boolean zA = a(c5508e2);
                if (c5508e2.z() && zA) {
                    C5509f.V(c5508e2, interfaceC0526b, new C5543b.a());
                }
                C5507d c5507d5 = c5508e2.f45524J;
                C5507d c5507d6 = c5508e2.f45526L;
                boolean z11 = (next == c5507d5 && (c5507d4 = c5507d6.f45511f) != null && c5507d4.f45508c) || (next == c5507d6 && (c5507d3 = c5507d5.f45511f) != null && c5507d3.f45508c);
                C5508e.b bVar = c5508e2.f45535U[0];
                C5508e.b bVar2 = C5508e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || zA) {
                    if (!c5508e2.z()) {
                        if (next == c5507d5 && c5507d6.f45511f == null) {
                            int iE = c5507d5.e() + iD;
                            c5508e2.J(iE, c5508e2.q() + iE);
                            b(i10, c5508e2, interfaceC0526b, z10);
                        } else if (next == c5507d6 && c5507d5.f45511f == null) {
                            int iE2 = iD - c5507d6.e();
                            c5508e2.J(iE2 - c5508e2.q(), iE2);
                            b(i10, c5508e2, interfaceC0526b, z10);
                        } else if (z11 && !c5508e2.x()) {
                            c(i10, c5508e2, interfaceC0526b, z10);
                        }
                    }
                } else if (bVar == bVar2 && c5508e2.f45578v >= 0 && c5508e2.f45577u >= 0 && (c5508e2.f45557i0 == 8 || (c5508e2.f45574r == 0 && c5508e2.f45539Y == 0.0f))) {
                    if (!c5508e2.x() && !c5508e2.f45521G && z11 && !c5508e2.x()) {
                        d(i10, c5508e, interfaceC0526b, c5508e2, z10);
                    }
                }
            }
        }
        if (c5508e instanceof C5511h) {
            return;
        }
        HashSet<C5507d> hashSet2 = c5507dI2.f45506a;
        if (hashSet2 != null && c5507dI2.f45508c) {
            Iterator<C5507d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5507d next2 = it2.next();
                C5508e c5508e3 = next2.f45509d;
                int i11 = i + 1;
                boolean zA2 = a(c5508e3);
                if (c5508e3.z() && zA2) {
                    C5509f.V(c5508e3, interfaceC0526b, new C5543b.a());
                }
                C5507d c5507d7 = c5508e3.f45524J;
                C5507d c5507d8 = c5508e3.f45526L;
                boolean z12 = (next2 == c5507d7 && (c5507d2 = c5507d8.f45511f) != null && c5507d2.f45508c) || (next2 == c5507d8 && (c5507d = c5507d7.f45511f) != null && c5507d.f45508c);
                C5508e.b bVar3 = c5508e3.f45535U[0];
                C5508e.b bVar4 = C5508e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || zA2) {
                    if (!c5508e3.z()) {
                        if (next2 == c5507d7 && c5507d8.f45511f == null) {
                            int iE3 = c5507d7.e() + iD2;
                            c5508e3.J(iE3, c5508e3.q() + iE3);
                            b(i11, c5508e3, interfaceC0526b, z10);
                        } else if (next2 == c5507d8 && c5507d7.f45511f == null) {
                            int iE4 = iD2 - c5507d8.e();
                            c5508e3.J(iE4 - c5508e3.q(), iE4);
                            b(i11, c5508e3, interfaceC0526b, z10);
                        } else if (z12 && !c5508e3.x()) {
                            c(i11, c5508e3, interfaceC0526b, z10);
                        }
                    }
                } else if (bVar3 == bVar4 && c5508e3.f45578v >= 0 && c5508e3.f45577u >= 0) {
                    if (c5508e3.f45557i0 == 8 || (c5508e3.f45574r == 0 && c5508e3.f45539Y == 0.0f)) {
                        if (!c5508e3.x() && !c5508e3.f45521G && z12 && !c5508e3.x()) {
                            d(i11, c5508e, interfaceC0526b, c5508e3, z10);
                        }
                    }
                }
            }
        }
        c5508e.f45564m = true;
    }

    public static void c(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b, boolean z10) {
        float f10 = c5508e.f45552f0;
        C5507d c5507d = c5508e.f45524J;
        int iD = c5507d.f45511f.d();
        C5507d c5507d2 = c5508e.f45526L;
        int iD2 = c5507d2.f45511f.d();
        int iE = c5507d.e() + iD;
        int iE2 = iD2 - c5507d2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = c5508e.q();
        int i10 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i10 = (iD - iD2) - iQ;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iQ;
        if (iD > iD2) {
            i12 = i11 - iQ;
        }
        c5508e.J(i11, i12);
        b(i + 1, c5508e, interfaceC0526b, z10);
    }

    public static void d(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b, C5508e c5508e2, boolean z10) {
        float f10 = c5508e2.f45552f0;
        C5507d c5507d = c5508e2.f45524J;
        int iE = c5507d.e() + c5507d.f45511f.d();
        C5507d c5507d2 = c5508e2.f45526L;
        int iD = c5507d2.f45511f.d() - c5507d2.e();
        if (iD >= iE) {
            int iQ = c5508e2.q();
            if (c5508e2.f45557i0 != 8) {
                int i10 = c5508e2.f45574r;
                if (i10 == 2) {
                    iQ = (int) (c5508e2.f45552f0 * 0.5f * (c5508e instanceof C5509f ? c5508e.q() : c5508e.f45536V.q()));
                } else if (i10 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(c5508e2.f45577u, iQ);
                int i11 = c5508e2.f45578v;
                if (i11 > 0) {
                    iQ = Math.min(i11, iQ);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            c5508e2.J(i12, iQ + i12);
            b(i + 1, c5508e2, interfaceC0526b, z10);
        }
    }

    public static void e(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b) {
        float f10 = c5508e.f45554g0;
        C5507d c5507d = c5508e.f45525K;
        int iD = c5507d.f45511f.d();
        C5507d c5507d2 = c5508e.f45527M;
        int iD2 = c5507d2.f45511f.d();
        int iE = c5507d.e() + iD;
        int iE2 = iD2 - c5507d2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c5508e.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        c5508e.K(i12, i13);
        g(i + 1, c5508e, interfaceC0526b);
    }

    public static void f(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b, C5508e c5508e2) {
        float f10 = c5508e2.f45554g0;
        C5507d c5507d = c5508e2.f45525K;
        int iE = c5507d.e() + c5507d.f45511f.d();
        C5507d c5507d2 = c5508e2.f45527M;
        int iD = c5507d2.f45511f.d() - c5507d2.e();
        if (iD >= iE) {
            int iK = c5508e2.k();
            if (c5508e2.f45557i0 != 8) {
                int i10 = c5508e2.f45575s;
                if (i10 == 2) {
                    iK = (int) (f10 * 0.5f * (c5508e instanceof C5509f ? c5508e.k() : c5508e.f45536V.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c5508e2.f45580x, iK);
                int i11 = c5508e2.f45581y;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            c5508e2.K(i12, iK + i12);
            g(i + 1, c5508e2, interfaceC0526b);
        }
    }

    public static void g(int i, C5508e c5508e, C5543b.InterfaceC0526b interfaceC0526b) {
        C5507d c5507d;
        C5507d c5507d2;
        C5507d c5507d3;
        C5507d c5507d4;
        if (c5508e.f45566n) {
            return;
        }
        if (!(c5508e instanceof C5509f) && c5508e.z() && a(c5508e)) {
            C5509f.V(c5508e, interfaceC0526b, new C5543b.a());
        }
        C5507d c5507dI = c5508e.i(C5507d.b.TOP);
        C5507d c5507dI2 = c5508e.i(C5507d.b.BOTTOM);
        int iD = c5507dI.d();
        int iD2 = c5507dI2.d();
        HashSet<C5507d> hashSet = c5507dI.f45506a;
        char c10 = 1;
        if (hashSet != null && c5507dI.f45508c) {
            Iterator<C5507d> it = hashSet.iterator();
            while (it.hasNext()) {
                C5507d next = it.next();
                C5508e c5508e2 = next.f45509d;
                int i10 = i + 1;
                boolean zA = a(c5508e2);
                if (c5508e2.z() && zA) {
                    C5509f.V(c5508e2, interfaceC0526b, new C5543b.a());
                }
                C5507d c5507d5 = c5508e2.f45525K;
                C5507d c5507d6 = c5508e2.f45527M;
                char c11 = ((next == c5507d5 && (c5507d4 = c5507d6.f45511f) != null && c5507d4.f45508c) || (next == c5507d6 && (c5507d3 = c5507d5.f45511f) != null && c5507d3.f45508c)) ? c10 : (char) 0;
                C5508e.b bVar = c5508e2.f45535U[c10];
                char c12 = c10;
                C5508e.b bVar2 = C5508e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || zA) {
                    if (!c5508e2.z()) {
                        if (next == c5507d5 && c5507d6.f45511f == null) {
                            int iE = c5507d5.e() + iD;
                            c5508e2.K(iE, c5508e2.k() + iE);
                            g(i10, c5508e2, interfaceC0526b);
                        } else if (next == c5507d6 && c5507d5.f45511f == null) {
                            int iE2 = iD - c5507d6.e();
                            c5508e2.K(iE2 - c5508e2.k(), iE2);
                            g(i10, c5508e2, interfaceC0526b);
                        } else if (c11 != 0 && !c5508e2.y()) {
                            e(i10, c5508e2, interfaceC0526b);
                        }
                    }
                } else if (bVar == bVar2 && c5508e2.f45581y >= 0 && c5508e2.f45580x >= 0 && ((c5508e2.f45557i0 == 8 || (c5508e2.f45575s == 0 && c5508e2.f45539Y == 0.0f)) && !c5508e2.y() && !c5508e2.f45521G && c11 != 0 && !c5508e2.y())) {
                    f(i10, c5508e, interfaceC0526b, c5508e2);
                }
                c10 = c12;
            }
        }
        char c13 = c10;
        if (c5508e instanceof C5511h) {
            return;
        }
        HashSet<C5507d> hashSet2 = c5507dI2.f45506a;
        if (hashSet2 != null && c5507dI2.f45508c) {
            Iterator<C5507d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5507d next2 = it2.next();
                C5508e c5508e3 = next2.f45509d;
                int i11 = i + 1;
                boolean zA2 = a(c5508e3);
                if (c5508e3.z() && zA2) {
                    C5509f.V(c5508e3, interfaceC0526b, new C5543b.a());
                }
                C5507d c5507d7 = c5508e3.f45525K;
                C5507d c5507d8 = c5508e3.f45527M;
                boolean z10 = ((next2 == c5507d7 && (c5507d2 = c5507d8.f45511f) != null && c5507d2.f45508c) || (next2 == c5507d8 && (c5507d = c5507d7.f45511f) != null && c5507d.f45508c)) ? c13 == true ? 1 : 0 : false;
                C5508e.b bVar3 = c5508e3.f45535U[c13 == true ? 1 : 0];
                C5508e.b bVar4 = C5508e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || zA2) {
                    if (!c5508e3.z()) {
                        if (next2 == c5507d7 && c5507d8.f45511f == null) {
                            int iE3 = c5507d7.e() + iD2;
                            c5508e3.K(iE3, c5508e3.k() + iE3);
                            g(i11, c5508e3, interfaceC0526b);
                        } else if (next2 == c5507d8 && c5507d7.f45511f == null) {
                            int iE4 = iD2 - c5507d8.e();
                            c5508e3.K(iE4 - c5508e3.k(), iE4);
                            g(i11, c5508e3, interfaceC0526b);
                        } else if (z10 && !c5508e3.y()) {
                            e(i11, c5508e3, interfaceC0526b);
                        }
                    }
                } else if (bVar3 == bVar4 && c5508e3.f45581y >= 0 && c5508e3.f45580x >= 0 && (c5508e3.f45557i0 == 8 || (c5508e3.f45575s == 0 && c5508e3.f45539Y == 0.0f))) {
                    if (!c5508e3.y() && !c5508e3.f45521G && z10 && !c5508e3.y()) {
                        f(i11, c5508e, interfaceC0526b, c5508e3);
                    }
                }
            }
        }
        C5507d c5507dI3 = c5508e.i(C5507d.b.BASELINE);
        if (c5507dI3.f45506a != null && c5507dI3.f45508c) {
            int iD3 = c5507dI3.d();
            Iterator<C5507d> it3 = c5507dI3.f45506a.iterator();
            while (it3.hasNext()) {
                C5507d next3 = it3.next();
                C5508e c5508e4 = next3.f45509d;
                int i12 = i + 1;
                boolean zA3 = a(c5508e4);
                if (c5508e4.z() && zA3) {
                    C5509f.V(c5508e4, interfaceC0526b, new C5543b.a());
                }
                if (c5508e4.f45535U[c13 == true ? 1 : 0] != C5508e.b.MATCH_CONSTRAINT || zA3) {
                    if (c5508e4.z()) {
                        continue;
                    } else {
                        C5507d c5507d9 = c5508e4.f45528N;
                        if (next3 == c5507d9) {
                            int iE5 = next3.e() + iD3;
                            if (c5508e4.f45519E) {
                                int i13 = iE5 - c5508e4.f45546c0;
                                int i14 = c5508e4.f45538X + i13;
                                c5508e4.f45544b0 = i13;
                                c5508e4.f45525K.l(i13);
                                c5508e4.f45527M.l(i14);
                                c5507d9.l(iE5);
                                c5508e4.f45562l = c13 == true ? 1 : 0;
                            }
                            g(i12, c5508e4, interfaceC0526b);
                        }
                    }
                }
                c13 = 1;
            }
        }
        c5508e.f45566n = true;
    }
}
