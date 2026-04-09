package k0;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.e0;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o.I;
import o.U;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f51005a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f51006b;

    /* renamed from: c, reason: collision with root package name */
    private final I f51007c = U.a();

    /* renamed from: d, reason: collision with root package name */
    private final I f51008d = U.a();

    /* renamed from: e, reason: collision with root package name */
    private final I f51009e = U.a();

    /* renamed from: f, reason: collision with root package name */
    private final I f51010f = U.a();

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, d.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void a() {
            ((d) this.receiver).c();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public d(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        this.f51005a = interfaceC6835l;
        this.f51006b = interfaceC6824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        int i10;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        l lVarK2;
        V.b bVar;
        int i11;
        int i12;
        int i13;
        long[] jArr3;
        Object[] objArr3;
        boolean z10;
        Object[] objArr4;
        boolean z11;
        int i14;
        V.b bVar2;
        long[] jArr4;
        long[] jArr5;
        int i15;
        long[] jArr6;
        long[] jArr7;
        I i16 = this.f51009e;
        Object[] objArr5 = i16.f54929b;
        long[] jArr8 = i16.f54928a;
        int length = jArr8.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i17 = 8;
        int i18 = 1;
        if (length >= 0) {
            int i19 = 0;
            while (true) {
                long j11 = jArr8[i19];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j11 & 255) < 128) {
                            h hVar = (h) objArr5[(i19 << 3) + i21];
                            if (hVar.h1().k2()) {
                                int iA = e0.a(1024);
                                e.c cVarH1 = hVar.h1();
                                V.b bVar3 = null;
                                while (cVarH1 != null) {
                                    if (cVarH1 instanceof FocusTargetNode) {
                                        this.f51007c.h((FocusTargetNode) cVarH1);
                                    } else {
                                        if ((cVarH1.f2() & iA) != 0 && (cVarH1 instanceof AbstractC2635m)) {
                                            e.c cVarE2 = ((AbstractC2635m) cVarH1).E2();
                                            int i22 = 0;
                                            while (cVarE2 != null) {
                                                if ((cVarE2.f2() & iA) != 0) {
                                                    i22++;
                                                    if (i22 == i18) {
                                                        jArr7 = jArr8;
                                                        cVarH1 = cVarE2;
                                                    } else {
                                                        if (bVar3 == null) {
                                                            jArr7 = jArr8;
                                                            bVar3 = new V.b(new e.c[16], 0);
                                                        } else {
                                                            jArr7 = jArr8;
                                                        }
                                                        if (cVarH1 != null) {
                                                            bVar3.b(cVarH1);
                                                            cVarH1 = null;
                                                        }
                                                        bVar3.b(cVarE2);
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                cVarE2 = cVarE2.b2();
                                                jArr8 = jArr7;
                                                i18 = 1;
                                            }
                                            jArr6 = jArr8;
                                            int i23 = i18;
                                            if (i22 == i23) {
                                                i18 = i23;
                                                jArr8 = jArr6;
                                            }
                                        }
                                        cVarH1 = AbstractC2633k.g(bVar3);
                                        jArr8 = jArr6;
                                        i18 = 1;
                                    }
                                    jArr6 = jArr8;
                                    cVarH1 = AbstractC2633k.g(bVar3);
                                    jArr8 = jArr6;
                                    i18 = 1;
                                }
                                jArr5 = jArr8;
                                if (!hVar.h1().k2()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                V.b bVar4 = new V.b(new e.c[16], 0);
                                e.c cVarB2 = hVar.h1().b2();
                                if (cVarB2 == null) {
                                    AbstractC2633k.c(bVar4, hVar.h1());
                                } else {
                                    bVar4.b(cVarB2);
                                }
                                while (bVar4.u()) {
                                    e.c cVarG = (e.c) bVar4.z(bVar4.o() - 1);
                                    if ((cVarG.a2() & iA) == 0) {
                                        AbstractC2633k.c(bVar4, cVarG);
                                    } else {
                                        while (true) {
                                            if (cVarG == null) {
                                                break;
                                            }
                                            if ((cVarG.f2() & iA) != 0) {
                                                V.b bVar5 = null;
                                                while (cVarG != null) {
                                                    if (cVarG instanceof FocusTargetNode) {
                                                        this.f51007c.h((FocusTargetNode) cVarG);
                                                    } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                                        int i24 = 0;
                                                        for (e.c cVarE22 = ((AbstractC2635m) cVarG).E2(); cVarE22 != null; cVarE22 = cVarE22.b2()) {
                                                            if ((cVarE22.f2() & iA) != 0) {
                                                                i24++;
                                                                if (i24 == 1) {
                                                                    cVarG = cVarE22;
                                                                } else {
                                                                    if (bVar5 == null) {
                                                                        bVar5 = new V.b(new e.c[16], 0);
                                                                    }
                                                                    if (cVarG != null) {
                                                                        bVar5.b(cVarG);
                                                                        cVarG = null;
                                                                    }
                                                                    bVar5.b(cVarE22);
                                                                }
                                                            }
                                                        }
                                                        if (i24 == 1) {
                                                        }
                                                    }
                                                    cVarG = AbstractC2633k.g(bVar5);
                                                }
                                            } else {
                                                cVarG = cVarG.b2();
                                            }
                                        }
                                    }
                                }
                            } else {
                                jArr5 = jArr8;
                            }
                            i15 = 8;
                        } else {
                            jArr5 = jArr8;
                            i15 = i17;
                        }
                        j11 >>= i15;
                        i21++;
                        i17 = i15;
                        jArr8 = jArr5;
                        i18 = 1;
                    }
                    jArr4 = jArr8;
                    if (i20 != i17) {
                        break;
                    }
                } else {
                    jArr4 = jArr8;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                jArr8 = jArr4;
                c10 = 7;
                j10 = -9187201950435737472L;
                i18 = 1;
                i17 = 8;
            }
        }
        this.f51009e.m();
        I i25 = this.f51008d;
        Object[] objArr6 = i25.f54929b;
        long[] jArr9 = i25.f54928a;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i26 = 0;
            while (true) {
                long j12 = jArr9[i26];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                    int i28 = 0;
                    while (i28 < i27) {
                        if ((j12 & 255) < 128) {
                            InterfaceC6354b interfaceC6354b = (InterfaceC6354b) objArr6[(i26 << 3) + i28];
                            if (interfaceC6354b.h1().k2()) {
                                int iA2 = e0.a(1024);
                                e.c cVarH12 = interfaceC6354b.h1();
                                boolean z12 = false;
                                boolean z13 = true;
                                FocusTargetNode focusTargetNode = null;
                                V.b bVar6 = null;
                                while (cVarH12 != null) {
                                    if (cVarH12 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH12;
                                        if (focusTargetNode != null) {
                                            z12 = true;
                                        }
                                        if (this.f51007c.a(focusTargetNode2)) {
                                            this.f51010f.h(focusTargetNode2);
                                            z13 = false;
                                        }
                                        jArr3 = jArr9;
                                        objArr3 = objArr6;
                                        focusTargetNode = focusTargetNode2;
                                    } else {
                                        if ((cVarH12.f2() & iA2) == 0 || !(cVarH12 instanceof AbstractC2635m)) {
                                            jArr3 = jArr9;
                                            objArr3 = objArr6;
                                            z10 = z12;
                                        } else {
                                            e.c cVarE23 = ((AbstractC2635m) cVarH12).E2();
                                            jArr3 = jArr9;
                                            int i29 = 0;
                                            while (cVarE23 != null) {
                                                if ((cVarE23.f2() & iA2) != 0) {
                                                    i29++;
                                                    objArr4 = objArr6;
                                                    if (i29 == 1) {
                                                        cVarH12 = cVarE23;
                                                    } else {
                                                        if (bVar6 == null) {
                                                            i14 = i29;
                                                            z11 = z12;
                                                            bVar2 = new V.b(new e.c[16], 0);
                                                        } else {
                                                            i14 = i29;
                                                            z11 = z12;
                                                            bVar2 = bVar6;
                                                        }
                                                        if (cVarH12 != null) {
                                                            bVar2.b(cVarH12);
                                                            cVarH12 = null;
                                                        }
                                                        bVar2.b(cVarE23);
                                                        bVar6 = bVar2;
                                                        i29 = i14;
                                                        cVarE23 = cVarE23.b2();
                                                        objArr6 = objArr4;
                                                        z12 = z11;
                                                    }
                                                } else {
                                                    objArr4 = objArr6;
                                                }
                                                z11 = z12;
                                                cVarE23 = cVarE23.b2();
                                                objArr6 = objArr4;
                                                z12 = z11;
                                            }
                                            objArr3 = objArr6;
                                            z10 = z12;
                                            if (i29 == 1) {
                                                jArr9 = jArr3;
                                                objArr6 = objArr3;
                                                z12 = z10;
                                            }
                                        }
                                        z12 = z10;
                                    }
                                    cVarH12 = AbstractC2633k.g(bVar6);
                                    jArr9 = jArr3;
                                    objArr6 = objArr3;
                                }
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                                boolean z14 = z12;
                                if (!interfaceC6354b.h1().k2()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                V.b bVar7 = new V.b(new e.c[16], 0);
                                e.c cVarB22 = interfaceC6354b.h1().b2();
                                if (cVarB22 == null) {
                                    AbstractC2633k.c(bVar7, interfaceC6354b.h1());
                                } else {
                                    bVar7.b(cVarB22);
                                }
                                boolean z15 = z14;
                                while (bVar7.u()) {
                                    e.c cVarG2 = (e.c) bVar7.z(bVar7.o() - 1);
                                    if ((cVarG2.a2() & iA2) == 0) {
                                        AbstractC2633k.c(bVar7, cVarG2);
                                    } else {
                                        while (cVarG2 != null) {
                                            if ((cVarG2.f2() & iA2) != 0) {
                                                V.b bVar8 = null;
                                                while (cVarG2 != null) {
                                                    if (cVarG2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarG2;
                                                        if (focusTargetNode != null) {
                                                            z15 = true;
                                                        }
                                                        if (this.f51007c.a(focusTargetNode3)) {
                                                            this.f51010f.h(focusTargetNode3);
                                                            z13 = false;
                                                        }
                                                        bVar = bVar7;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((cVarG2.f2() & iA2) == 0 || !(cVarG2 instanceof AbstractC2635m)) {
                                                        bVar = bVar7;
                                                    } else {
                                                        e.c cVarE24 = ((AbstractC2635m) cVarG2).E2();
                                                        bVar = bVar7;
                                                        int i30 = 0;
                                                        while (cVarE24 != null) {
                                                            if ((cVarE24.f2() & iA2) != 0) {
                                                                i30++;
                                                                i12 = iA2;
                                                                if (i30 == 1) {
                                                                    cVarG2 = cVarE24;
                                                                } else {
                                                                    if (bVar8 == null) {
                                                                        i13 = i30;
                                                                        bVar8 = new V.b(new e.c[16], 0);
                                                                    } else {
                                                                        i13 = i30;
                                                                    }
                                                                    if (cVarG2 != null) {
                                                                        bVar8.b(cVarG2);
                                                                        cVarG2 = null;
                                                                    }
                                                                    bVar8.b(cVarE24);
                                                                    i30 = i13;
                                                                    cVarE24 = cVarE24.b2();
                                                                    iA2 = i12;
                                                                }
                                                            } else {
                                                                i12 = iA2;
                                                            }
                                                            cVarE24 = cVarE24.b2();
                                                            iA2 = i12;
                                                        }
                                                        i11 = iA2;
                                                        if (i30 != 1) {
                                                            cVarG2 = AbstractC2633k.g(bVar8);
                                                        }
                                                        bVar7 = bVar;
                                                        iA2 = i11;
                                                    }
                                                    i11 = iA2;
                                                    cVarG2 = AbstractC2633k.g(bVar8);
                                                    bVar7 = bVar;
                                                    iA2 = i11;
                                                }
                                            } else {
                                                cVarG2 = cVarG2.b2();
                                                iA2 = iA2;
                                            }
                                        }
                                    }
                                    bVar7 = bVar7;
                                    iA2 = iA2;
                                }
                                if (z13) {
                                    if (z15) {
                                        lVarK2 = c.a(interfaceC6354b);
                                    } else if (focusTargetNode == null || (lVarK2 = focusTargetNode.K2()) == null) {
                                        lVarK2 = m.Inactive;
                                    }
                                    interfaceC6354b.J1(lVarK2);
                                }
                            } else {
                                interfaceC6354b.J1(m.Inactive);
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                            }
                        } else {
                            jArr2 = jArr9;
                            objArr2 = objArr6;
                        }
                        j12 >>= 8;
                        i28++;
                        jArr9 = jArr2;
                        objArr6 = objArr2;
                    }
                    jArr = jArr9;
                    objArr = objArr6;
                    i10 = 0;
                    if (i27 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr9;
                    objArr = objArr6;
                    i10 = 0;
                }
                if (i26 == length2) {
                    break;
                }
                i26++;
                jArr9 = jArr;
                objArr6 = objArr;
            }
        } else {
            i10 = 0;
        }
        this.f51008d.m();
        I i31 = this.f51007c;
        Object[] objArr7 = i31.f54929b;
        long[] jArr10 = i31.f54928a;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i32 = i10;
            while (true) {
                long j13 = jArr10[i32];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    for (int i34 = i10; i34 < i33; i34++) {
                        if ((j13 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr7[(i32 << 3) + i34];
                            if (focusTargetNode4.k2()) {
                                m mVarK2 = focusTargetNode4.K2();
                                focusTargetNode4.P2();
                                if (mVarK2 != focusTargetNode4.K2() || this.f51010f.a(focusTargetNode4)) {
                                    c.c(focusTargetNode4);
                                }
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i33 != 8) {
                        break;
                    }
                }
                if (i32 == length3) {
                    break;
                } else {
                    i32++;
                }
            }
        }
        this.f51007c.m();
        this.f51010f.m();
        this.f51006b.invoke();
        if (!this.f51009e.d()) {
            B0.a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.f51008d.d()) {
            B0.a.b("Unprocessed FocusEvent nodes");
        }
        if (this.f51007c.d()) {
            return;
        }
        B0.a.b("Unprocessed FocusTarget nodes");
    }

    private final void g(I i10, Object obj) {
        if (i10.h(obj) && this.f51007c.c() + this.f51008d.c() + this.f51009e.c() == 1) {
            this.f51005a.invoke(new a(this));
        }
    }

    public final boolean b() {
        return this.f51007c.e() || this.f51009e.e() || this.f51008d.e();
    }

    public final void d(FocusTargetNode focusTargetNode) {
        g(this.f51007c, focusTargetNode);
    }

    public final void e(InterfaceC6354b interfaceC6354b) {
        g(this.f51008d, interfaceC6354b);
    }

    public final void f(h hVar) {
        g(this.f51009e, hVar);
    }
}
