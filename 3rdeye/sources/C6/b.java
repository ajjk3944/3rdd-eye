package C6;

import A7.b;
import N7.A5;
import N7.AbstractC1138d8;
import N7.AbstractC1293o4;
import N7.AbstractC1339r9;
import N7.AbstractC1408w8;
import N7.C1085a0;
import N7.C1134d4;
import N7.C1137d7;
import N7.C1153e8;
import N7.C1185ga;
import N7.C1250l3;
import N7.C1353s9;
import N7.C1362t4;
import N7.C1394v8;
import N7.C1412wc;
import N7.C9;
import N7.D8;
import N7.F4;
import N7.H9;
import N7.I8;
import N7.N2;
import N7.R6;
import N7.W4;
import N7.W8;
import c9.C2097r;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import k7.C5248a;

/* compiled from: DivDataExtensions.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A7.d f928b;

        public a(A7.d dVar) {
            this.f928b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            A7.b<Double> bVar = ((R6.a) t10).f6156b;
            A7.d dVar = this.f928b;
            return com.google.gson.internal.c.g(bVar.a(dVar), ((R6.a) t11).f6156b.a(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(N7.N2 r8, N7.N2 r9) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.b.a(N7.N2, N7.N2):boolean");
    }

    public static final boolean b(C1134d4 c1134d4, C1134d4 c1134d42) {
        if (c1134d4 == null && c1134d42 == null) {
            return true;
        }
        if (A2.l.s(c1134d4 != null ? c1134d4.f8066a : null, c1134d42 != null ? c1134d42.f8066a : null)) {
            return A2.l.s(c1134d4 != null ? c1134d4.f8067b : null, c1134d42 != null ? c1134d42.f8067b : null);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(N7.AbstractC1293o4 r6, N7.AbstractC1293o4 r7) {
        /*
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L8
            if (r7 != 0) goto L7
            return r1
        L7:
            return r0
        L8:
            boolean r2 = r6 instanceof N7.AbstractC1293o4.a
            if (r2 == 0) goto Lb7
            boolean r2 = r7 instanceof N7.AbstractC1293o4.a
            if (r2 == 0) goto Lb6
            N7.o4$a r6 = (N7.AbstractC1293o4.a) r6
            N7.s9 r6 = r6.f8855b
            A7.b<java.lang.Integer> r2 = r6.f9187a
            N7.o4$a r7 = (N7.AbstractC1293o4.a) r7
            N7.s9 r3 = r7.f8855b
            A7.b<java.lang.Integer> r3 = r3.f9187a
            boolean r2 = A2.l.s(r2, r3)
            if (r2 == 0) goto Lb6
            N7.r9 r2 = r6.f9188b
            N7.s9 r3 = r7.f8855b
            N7.r9 r3 = r3.f9188b
            if (r2 != 0) goto L2e
            if (r3 != 0) goto Lb6
            goto La3
        L2e:
            boolean r4 = r2 instanceof N7.AbstractC1339r9.b
            if (r4 == 0) goto L73
            boolean r4 = r3 instanceof N7.AbstractC1339r9.b
            if (r4 == 0) goto Lb6
            N7.r9$b r2 = (N7.AbstractC1339r9.b) r2
            N7.W8 r2 = r2.f9080b
            A7.b<java.lang.Integer> r4 = r2.f7619a
            N7.r9$b r3 = (N7.AbstractC1339r9.b) r3
            N7.W8 r5 = r3.f9080b
            A7.b<java.lang.Integer> r5 = r5.f7619a
            boolean r4 = A2.l.s(r4, r5)
            if (r4 == 0) goto Lb6
            N7.W8 r3 = r3.f9080b
            N7.ga r4 = r3.f7623e
            N7.ga r5 = r2.f7623e
            boolean r4 = k(r5, r4)
            if (r4 == 0) goto Lb6
            N7.W4 r4 = r3.f7622d
            N7.W4 r5 = r2.f7622d
            boolean r4 = f(r5, r4)
            if (r4 == 0) goto Lb6
            N7.W4 r4 = r3.f7621c
            N7.W4 r5 = r2.f7621c
            boolean r4 = f(r5, r4)
            if (r4 == 0) goto Lb6
            N7.W4 r3 = r3.f7620b
            N7.W4 r2 = r2.f7620b
            boolean r2 = f(r2, r3)
            if (r2 == 0) goto Lb6
            goto La3
        L73:
            boolean r4 = r2 instanceof N7.AbstractC1339r9.a
            if (r4 == 0) goto Lb0
            boolean r4 = r3 instanceof N7.AbstractC1339r9.a
            if (r4 == 0) goto Lb6
            N7.r9$a r2 = (N7.AbstractC1339r9.a) r2
            N7.l3 r2 = r2.f9079b
            A7.b<java.lang.Integer> r4 = r2.f8727a
            N7.r9$a r3 = (N7.AbstractC1339r9.a) r3
            N7.l3 r5 = r3.f9079b
            A7.b<java.lang.Integer> r5 = r5.f8727a
            boolean r4 = A2.l.s(r4, r5)
            if (r4 == 0) goto Lb6
            N7.l3 r3 = r3.f9079b
            N7.ga r4 = r3.f8729c
            N7.ga r5 = r2.f8729c
            boolean r4 = k(r5, r4)
            if (r4 == 0) goto Lb6
            N7.W4 r3 = r3.f8728b
            N7.W4 r2 = r2.f8728b
            boolean r2 = f(r2, r3)
            if (r2 == 0) goto Lb6
        La3:
            N7.ga r6 = r6.f9189c
            N7.s9 r7 = r7.f8855b
            N7.ga r7 = r7.f9189c
            boolean r6 = k(r6, r7)
            if (r6 == 0) goto Lb6
            return r1
        Lb0:
            b9.j r6 = new b9.j
            r6.<init>()
            throw r6
        Lb6:
            return r0
        Lb7:
            b9.j r6 = new b9.j
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.b.c(N7.o4, N7.o4):boolean");
    }

    public static final boolean d(C1362t4 c1362t4, C1362t4 c1362t42) {
        if (c1362t4 == null && c1362t42 == null) {
            return true;
        }
        if (!A2.l.s(c1362t4 != null ? c1362t4.f9218c : null, c1362t42 != null ? c1362t42.f9218c : null)) {
            return false;
        }
        if (!A2.l.s(c1362t4 != null ? c1362t4.f9221f : null, c1362t42 != null ? c1362t42.f9221f : null)) {
            return false;
        }
        if (!A2.l.s(c1362t4 != null ? c1362t4.f9219d : null, c1362t42 != null ? c1362t42.f9219d : null)) {
            return false;
        }
        if (!A2.l.s(c1362t4 != null ? c1362t4.f9216a : null, c1362t42 != null ? c1362t42.f9216a : null)) {
            return false;
        }
        if (A2.l.s(c1362t4 != null ? c1362t4.f9220e : null, c1362t42 != null ? c1362t42.f9220e : null)) {
            return A2.l.s(c1362t4 != null ? c1362t4.f9217b : null, c1362t42 != null ? c1362t42.f9217b : null);
        }
        return false;
    }

    public static final boolean e(F4 f42, F4 f43) {
        if (f42 == null) {
            return f43 == null;
        }
        if (f42 instanceof F4.b) {
            return f43 instanceof F4.b;
        }
        if (f42 instanceof F4.a) {
            return (f43 instanceof F4.a) && A2.l.s(((F4.a) f42).f5171b.f6372a, ((F4.a) f43).f5171b.f6372a);
        }
        throw new b9.j();
    }

    public static final boolean f(W4 w42, W4 w43) {
        if (w42 == null && w43 == null) {
            return true;
        }
        if (A2.l.s(w42 != null ? w42.f7613b : null, w43 != null ? w43.f7613b : null)) {
            return A2.l.s(w42 != null ? w42.f7612a : null, w43 != null ? w43.f7612a : null);
        }
        return false;
    }

    public static final boolean g(R6.a aVar, R6.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (A2.l.s(aVar != null ? aVar.f6155a : null, aVar2 != null ? aVar2.f6155a : null)) {
            return A2.l.s(aVar != null ? aVar.f6156b : null, aVar2 != null ? aVar2.f6156b : null);
        }
        return false;
    }

    public static final boolean h(AbstractC1138d8 abstractC1138d8, AbstractC1138d8 abstractC1138d82) {
        if (abstractC1138d8 == null) {
            return abstractC1138d82 == null;
        }
        if (!(abstractC1138d8 instanceof AbstractC1138d8.a)) {
            if (abstractC1138d8 instanceof AbstractC1138d8.b) {
                return (abstractC1138d82 instanceof AbstractC1138d8.b) && A2.l.s(((AbstractC1138d8.b) abstractC1138d8).f8076b.f8645a, ((AbstractC1138d8.b) abstractC1138d82).f8076b.f8645a);
            }
            throw new b9.j();
        }
        if (abstractC1138d82 instanceof AbstractC1138d8.a) {
            C1153e8 c1153e8 = ((AbstractC1138d8.a) abstractC1138d8).f8075b;
            AbstractC1138d8.a aVar = (AbstractC1138d8.a) abstractC1138d82;
            if (A2.l.s(c1153e8.f8164b, aVar.f8075b.f8164b) && A2.l.s(c1153e8.f8163a, aVar.f8075b.f8163a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(AbstractC1408w8 abstractC1408w8, AbstractC1408w8 abstractC1408w82) {
        if (abstractC1408w8 == null) {
            return abstractC1408w82 == null;
        }
        if (!(abstractC1408w8 instanceof AbstractC1408w8.a)) {
            if (abstractC1408w8 instanceof AbstractC1408w8.b) {
                return (abstractC1408w82 instanceof AbstractC1408w8.b) && A2.l.s(((AbstractC1408w8.b) abstractC1408w8).f9725b.f5938a, ((AbstractC1408w8.b) abstractC1408w82).f9725b.f5938a);
            }
            throw new b9.j();
        }
        if (abstractC1408w82 instanceof AbstractC1408w8.a) {
            D8 d82 = ((AbstractC1408w8.a) abstractC1408w8).f9724b;
            AbstractC1408w8.a aVar = (AbstractC1408w8.a) abstractC1408w82;
            if (A2.l.s(d82.f5115a, aVar.f9724b.f5115a) && A2.l.s(d82.f5116b, aVar.f9724b.f5116b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(C9 c92, C9 c93) {
        if (c92 == null) {
            return c93 == null;
        }
        if (c92 instanceof C9.a) {
            if (c93 instanceof C9.a) {
                W4 w42 = ((C9.a) c92).f5043b;
                C9.a aVar = (C9.a) c93;
                if (A2.l.s(w42.f7613b, aVar.f5043b.f7613b) && A2.l.s(w42.f7612a, aVar.f5043b.f7612a)) {
                    return true;
                }
            }
            return false;
        }
        if (c92 instanceof C9.b) {
            return (c93 instanceof C9.b) && A2.l.s(((C9.b) c92).f5044b.f7573a, ((C9.b) c93).f5044b.f7573a);
        }
        if (!(c92 instanceof C9.c)) {
            throw new b9.j();
        }
        if (c93 instanceof C9.c) {
            C1412wc c1412wc = ((C9.c) c92).f5045b;
            C9.c cVar = (C9.c) c93;
            if (A2.l.s(c1412wc.f9737a, cVar.f5045b.f9737a)) {
                C1412wc.a aVar2 = c1412wc.f9739c;
                A7.b<Long> bVar = aVar2 != null ? aVar2.f9742b : null;
                C1412wc.a aVar3 = cVar.f5045b.f9739c;
                if (A2.l.s(bVar, aVar3 != null ? aVar3.f9742b : null)) {
                    C1412wc.a aVar4 = c1412wc.f9739c;
                    A7.b<H9> bVar2 = aVar4 != null ? aVar4.f9741a : null;
                    C1412wc.a aVar5 = cVar.f5045b.f9739c;
                    if (A2.l.s(bVar2, aVar5 != null ? aVar5.f9741a : null)) {
                        C1412wc.a aVar6 = c1412wc.f9738b;
                        A7.b<Long> bVar3 = aVar6 != null ? aVar6.f9742b : null;
                        C1412wc.a aVar7 = cVar.f5045b.f9738b;
                        if (A2.l.s(bVar3, aVar7 != null ? aVar7.f9742b : null)) {
                            C1412wc.a aVar8 = c1412wc.f9738b;
                            A7.b<H9> bVar4 = aVar8 != null ? aVar8.f9741a : null;
                            C1412wc.a aVar9 = cVar.f5045b.f9738b;
                            if (A2.l.s(bVar4, aVar9 != null ? aVar9.f9741a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean k(C1185ga c1185ga, C1185ga c1185ga2) {
        if (c1185ga == null && c1185ga2 == null) {
            return true;
        }
        if (!A2.l.s(c1185ga != null ? c1185ga.f8299a : null, c1185ga2 != null ? c1185ga2.f8299a : null)) {
            return false;
        }
        if (A2.l.s(c1185ga != null ? c1185ga.f8302d : null, c1185ga2 != null ? c1185ga2.f8302d : null)) {
            return A2.l.s(c1185ga != null ? c1185ga.f8301c : null, c1185ga2 != null ? c1185ga2.f8301c : null);
        }
        return false;
    }

    public static final boolean l(N2 n22) {
        boolean z10;
        boolean z11;
        if (n22 != null) {
            if (n22 instanceof N2.e) {
                return ((N2.e) n22).f5891b.f6211a instanceof b.C0000b;
            }
            if (n22 instanceof N2.a) {
                A5 a52 = ((N2.a) n22).f5887b;
                if (A2.l.z(a52.f4764a) && A2.l.z(a52.f4765b) && A2.l.z(a52.f4766c)) {
                    List<F4> list = a52.f4767d;
                    if (list != null) {
                        List<F4> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (F4 f42 : list2) {
                                if (f42 == null || (f42 instanceof F4.b)) {
                                    z11 = true;
                                } else {
                                    if (!(f42 instanceof F4.a)) {
                                        throw new b9.j();
                                    }
                                    z11 = A2.l.z(((F4.a) f42).f5171b.f6372a);
                                }
                                if (!z11) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!(a52.f4768e instanceof b.C0000b) || !A2.l.z(a52.f4769f) || !A2.l.z(a52.f4770g)) {
                        break;
                    }
                }
                return false;
            }
            if (n22 instanceof N2.b) {
                R6 r62 = ((N2.b) n22).f5888b;
                if (A2.l.z(r62.f6151a)) {
                    A7.c<Integer> cVar = r62.f6153c;
                    if (cVar == null || (cVar instanceof A7.a)) {
                    }
                }
                return false;
            }
            if (!(n22 instanceof N2.d)) {
                if (!(n22 instanceof N2.c)) {
                    throw new b9.j();
                }
                C1137d7 c1137d7 = ((N2.c) n22).f5889b;
                if (c1137d7.f8071a instanceof b.C0000b) {
                    C1085a0 c1085a0 = c1137d7.f8072b;
                    if (A2.l.z(c1085a0.f7881b) && A2.l.z(c1085a0.f7883d) && A2.l.z(c1085a0.f7882c) && A2.l.z(c1085a0.f7880a)) {
                    }
                }
                return false;
            }
            C1394v8 c1394v8 = ((N2.d) n22).f5890b;
            if (q(c1394v8.f9629a) && q(c1394v8.f9630b)) {
                A7.c<Integer> cVar2 = c1394v8.f9632d;
                if (cVar2 == null || (cVar2 instanceof A7.a)) {
                    I8 i82 = c1394v8.f9633e;
                    if (i82 != null) {
                        if (i82 instanceof I8.a) {
                            W4 w42 = ((I8.a) i82).f5476b;
                            if (!A2.l.z(w42.f7612a) || !A2.l.z(w42.f7613b)) {
                                z10 = false;
                            }
                        } else {
                            if (!(i82 instanceof I8.b)) {
                                throw new b9.j();
                            }
                            z10 = ((I8.b) i82).f5477b.f6207a instanceof b.C0000b;
                        }
                        if (!z10) {
                        }
                    }
                    z10 = true;
                    if (!z10) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean m(AbstractC1293o4 abstractC1293o4) {
        if (abstractC1293o4 == null) {
            return true;
        }
        if (!(abstractC1293o4 instanceof AbstractC1293o4.a)) {
            throw new b9.j();
        }
        C1353s9 c1353s9 = ((AbstractC1293o4.a) abstractC1293o4).f8855b;
        if (!A2.l.z(c1353s9.f9187a)) {
            return false;
        }
        AbstractC1339r9 abstractC1339r9 = c1353s9.f9188b;
        if (abstractC1339r9 != null) {
            if (abstractC1339r9 instanceof AbstractC1339r9.b) {
                W8 w82 = ((AbstractC1339r9.b) abstractC1339r9).f9080b;
                if (!A2.l.A(w82.f7619a) || !s(w82.f7623e) || !o(w82.f7622d) || !o(w82.f7621c) || !o(w82.f7620b)) {
                    return false;
                }
            } else {
                if (!(abstractC1339r9 instanceof AbstractC1339r9.a)) {
                    throw new b9.j();
                }
                C1250l3 c1250l3 = ((AbstractC1339r9.a) abstractC1339r9).f9079b;
                if (!A2.l.A(c1250l3.f8727a)) {
                    return false;
                }
                C1185ga c1185ga = c1250l3.f8729c;
                if ((c1185ga != null && !s(c1185ga)) || !o(c1250l3.f8728b)) {
                    return false;
                }
            }
        }
        return s(c1353s9.f9189c);
    }

    public static final boolean n(C1362t4 c1362t4) {
        if (c1362t4 == null) {
            return true;
        }
        return A2.l.z(c1362t4.f9218c) && A2.l.z(c1362t4.f9221f) && A2.l.z(c1362t4.f9219d) && A2.l.z(c1362t4.f9216a) && A2.l.A(c1362t4.f9220e) && A2.l.A(c1362t4.f9217b);
    }

    public static final boolean o(W4 w42) {
        if (w42 == null) {
            return true;
        }
        return A2.l.z(w42.f7613b) && A2.l.z(w42.f7612a);
    }

    public static final boolean p(AbstractC1138d8 abstractC1138d8) {
        if (abstractC1138d8 == null) {
            return true;
        }
        if (abstractC1138d8 instanceof AbstractC1138d8.a) {
            C1153e8 c1153e8 = ((AbstractC1138d8.a) abstractC1138d8).f8075b;
            return A2.l.A(c1153e8.f8164b) && A2.l.A(c1153e8.f8164b);
        }
        if (abstractC1138d8 instanceof AbstractC1138d8.b) {
            return A2.l.z(((AbstractC1138d8.b) abstractC1138d8).f8076b.f8645a);
        }
        throw new b9.j();
    }

    public static final boolean q(AbstractC1408w8 abstractC1408w8) {
        if (abstractC1408w8 == null) {
            return true;
        }
        if (abstractC1408w8 instanceof AbstractC1408w8.a) {
            D8 d82 = ((AbstractC1408w8.a) abstractC1408w8).f9724b;
            return A2.l.z(d82.f5115a) && A2.l.z(d82.f5116b);
        }
        if (abstractC1408w8 instanceof AbstractC1408w8.b) {
            return A2.l.z(((AbstractC1408w8.b) abstractC1408w8).f9725b.f5938a);
        }
        throw new b9.j();
    }

    public static final boolean r(C9 c92) {
        if (c92 == null) {
            return true;
        }
        if (c92 instanceof C9.a) {
            W4 w42 = ((C9.a) c92).f5043b;
            return A2.l.z(w42.f7613b) && A2.l.z(w42.f7612a);
        }
        if (c92 instanceof C9.b) {
            return A2.l.A(((C9.b) c92).f5044b.f7573a);
        }
        if (!(c92 instanceof C9.c)) {
            throw new b9.j();
        }
        C1412wc c1412wc = ((C9.c) c92).f5045b;
        if (A2.l.A(c1412wc.f9737a)) {
            C1412wc.a aVar = c1412wc.f9739c;
            if (A2.l.A(aVar != null ? aVar.f9742b : null)) {
                C1412wc.a aVar2 = c1412wc.f9739c;
                if (A2.l.A(aVar2 != null ? aVar2.f9741a : null)) {
                    C1412wc.a aVar3 = c1412wc.f9738b;
                    if (A2.l.A(aVar3 != null ? aVar3.f9742b : null)) {
                        C1412wc.a aVar4 = c1412wc.f9738b;
                        if (A2.l.A(aVar4 != null ? aVar4.f9741a : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean s(C1185ga c1185ga) {
        if (c1185ga == null) {
            return true;
        }
        return A2.l.z(c1185ga.f8299a) && A2.l.z(c1185ga.f8302d) && A2.l.z(c1185ga.f8301c);
    }

    public static final C5248a t(R6 r62, A7.d resolver) {
        kotlin.jvm.internal.l.f(r62, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        List<R6.a> list = r62.f6152b;
        List listC0 = list != null ? C2097r.C0(new a(resolver), list) : null;
        if (listC0 == null) {
            A7.c<Integer> cVar = r62.f6153c;
            return cVar != null ? new C5248a(null, C2097r.F0(cVar.b(resolver))) : C5248a.f43427c;
        }
        int[] iArr = new int[listC0.size()];
        float[] fArr = new float[listC0.size()];
        int size = listC0.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((R6.a) listC0.get(i)).f6155a.a(resolver).intValue();
            fArr[i] = (float) ((R6.a) listC0.get(i)).f6156b.a(resolver).doubleValue();
        }
        return new C5248a(fArr, iArr);
    }
}
