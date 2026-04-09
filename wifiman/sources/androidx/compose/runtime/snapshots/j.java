package androidx.compose.runtime.snapshots;

import T.C3529g;
import T.G1;
import T.u1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.i;
import d0.C5273e;
import d0.C5278j;
import d0.InterfaceC5279k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import o.I;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f28652a = b.f28665a;

    /* renamed from: b, reason: collision with root package name */
    private static final u1 f28653b = new u1();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f28654c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static i f28655d;

    /* renamed from: e, reason: collision with root package name */
    private static int f28656e;

    /* renamed from: f, reason: collision with root package name */
    private static final C5273e f28657f;

    /* renamed from: g, reason: collision with root package name */
    private static final C5278j f28658g;

    /* renamed from: h, reason: collision with root package name */
    private static List f28659h;

    /* renamed from: i, reason: collision with root package name */
    private static List f28660i;

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReference f28661j;

    /* renamed from: k, reason: collision with root package name */
    private static final g f28662k;

    /* renamed from: l, reason: collision with root package name */
    private static C3529g f28663l;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28664a = new a();

        a() {
            super(1);
        }

        public final void a(i iVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28665a = new b();

        b() {
            super(1);
        }

        public final void a(i iVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            super(1);
            this.f28666a = interfaceC6835l;
            this.f28667b = interfaceC6835l2;
        }

        public final void a(Object obj) {
            this.f28666a.invoke(obj);
            this.f28667b.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            super(1);
            this.f28668a = interfaceC6835l;
            this.f28669b = interfaceC6835l2;
        }

        public final void a(Object obj) {
            this.f28668a.invoke(obj);
            this.f28669b.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28670a = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(i iVar) {
            g gVar = (g) this.f28670a.invoke(iVar);
            synchronized (j.I()) {
                j.f28655d = j.f28655d.v(gVar.f());
                J j10 = J.f24997a;
            }
            return gVar;
        }
    }

    static {
        i.a aVar = i.f28640e;
        f28655d = aVar.a();
        f28656e = 2;
        f28657f = new C5273e();
        f28658g = new C5278j();
        f28659h = AbstractC3689v.l();
        f28660i = AbstractC3689v.l();
        int i10 = f28656e;
        f28656e = i10 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i10, aVar.a());
        f28655d = f28655d.v(aVar2.f());
        AtomicReference atomicReference = new AtomicReference(aVar2);
        f28661j = atomicReference;
        f28662k = (g) atomicReference.get();
        f28663l = new C3529g(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(mh.InterfaceC6835l r17) {
        /*
            r0 = 1
            androidx.compose.runtime.snapshots.g r1 = androidx.compose.runtime.snapshots.j.f28662k
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"
            kotlin.jvm.internal.AbstractC6492s.g(r1, r2)
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            java.lang.Object r1 = I()
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.j.f28661j     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L24
            r3 = r2
            androidx.compose.runtime.snapshots.a r3 = (androidx.compose.runtime.snapshots.a) r3     // Catch: java.lang.Throwable -> L24
            o.I r3 = r3.E()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L27
            T.g r4 = androidx.compose.runtime.snapshots.j.f28663l     // Catch: java.lang.Throwable -> L24
            r4.a(r0)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto Lb0
        L27:
            r4 = r2
            androidx.compose.runtime.snapshots.g r4 = (androidx.compose.runtime.snapshots.g) r4     // Catch: java.lang.Throwable -> L24
            r5 = r17
            java.lang.Object r4 = a0(r4, r5)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            r1 = 0
            if (r3 == 0) goto L5b
            r5 = -1
            java.util.List r6 = androidx.compose.runtime.snapshots.j.f28659h     // Catch: java.lang.Throwable -> L4d
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L4d
            r8 = r1
        L3c:
            if (r8 >= r7) goto L4f
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L4d
            mh.p r9 = (mh.InterfaceC6839p) r9     // Catch: java.lang.Throwable -> L4d
            java.util.Set r10 = V.e.a(r3)     // Catch: java.lang.Throwable -> L4d
            r9.invoke(r10, r2)     // Catch: java.lang.Throwable -> L4d
            int r8 = r8 + r0
            goto L3c
        L4d:
            r0 = move-exception
            goto L55
        L4f:
            T.g r2 = androidx.compose.runtime.snapshots.j.f28663l
            r2.a(r5)
            goto L5b
        L55:
            T.g r1 = androidx.compose.runtime.snapshots.j.f28663l
            r1.a(r5)
            throw r0
        L5b:
            java.lang.Object r2 = I()
            monitor-enter(r2)
            C()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto Lac
            java.lang.Object[] r5 = r3.f54929b     // Catch: java.lang.Throwable -> L9f
            long[] r3 = r3.f54928a     // Catch: java.lang.Throwable -> L9f
            int r6 = r3.length     // Catch: java.lang.Throwable -> L9f
            int r6 = r6 + (-2)
            if (r6 < 0) goto Laa
            r7 = r1
        L6f:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L9f
            long r10 = ~r8     // Catch: java.lang.Throwable -> L9f
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto La6
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L9f
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r1
        L89:
            if (r12 >= r10) goto La4
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto La1
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L9f
            d0.k r13 = (d0.InterfaceC5279k) r13     // Catch: java.lang.Throwable -> L9f
            U(r13)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r0 = move-exception
            goto Lae
        La1:
            long r8 = r8 >> r11
            int r12 = r12 + r0
            goto L89
        La4:
            if (r10 != r11) goto Laa
        La6:
            if (r7 == r6) goto Laa
            int r7 = r7 + r0
            goto L6f
        Laa:
            Yg.J r0 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L9f
        Lac:
            monitor-exit(r2)
            return r4
        Lae:
            monitor-exit(r2)
            throw r0
        Lb0:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.j.A(mh.l):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(a.f28664a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        C5278j c5278j = f28658g;
        int iE = c5278j.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            G1 g12 = c5278j.f()[i10];
            Object obj = g12 != null ? g12.get() : null;
            if (obj != null && T((InterfaceC5279k) obj)) {
                if (i11 != i10) {
                    c5278j.f()[i11] = g12;
                    c5278j.d()[i11] = c5278j.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            c5278j.f()[i12] = null;
            c5278j.d()[i12] = 0;
        }
        if (i11 != iE) {
            c5278j.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g D(g gVar, InterfaceC6835l interfaceC6835l, boolean z10) {
        boolean z11 = gVar instanceof androidx.compose.runtime.snapshots.b;
        if (z11 || gVar == null) {
            return new p(z11 ? (androidx.compose.runtime.snapshots.b) gVar : null, interfaceC6835l, null, false, z10);
        }
        return new q(gVar, interfaceC6835l, false, z10);
    }

    static /* synthetic */ g E(g gVar, InterfaceC6835l interfaceC6835l, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC6835l = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(gVar, interfaceC6835l, z10);
    }

    public static final n F(n nVar) {
        n nVarW;
        g.a aVar = g.f28632e;
        g gVarC = aVar.c();
        n nVarW2 = W(nVar, gVarC.f(), gVarC.g());
        if (nVarW2 != null) {
            return nVarW2;
        }
        synchronized (I()) {
            g gVarC2 = aVar.c();
            nVarW = W(nVar, gVarC2.f(), gVarC2.g());
        }
        if (nVarW != null) {
            return nVarW;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final n G(n nVar, g gVar) {
        n nVarW = W(nVar, gVar.f(), gVar.g());
        if (nVarW != null) {
            return nVarW;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final g H() {
        g gVar = (g) f28653b.a();
        return gVar == null ? (g) f28661j.get() : gVar;
    }

    public static final Object I() {
        return f28654c;
    }

    public static final g J() {
        return f28662k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6835l K(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, boolean z10) {
        if (!z10) {
            interfaceC6835l2 = null;
        }
        return (interfaceC6835l == null || interfaceC6835l2 == null || interfaceC6835l == interfaceC6835l2) ? interfaceC6835l == null ? interfaceC6835l2 : interfaceC6835l : new c(interfaceC6835l, interfaceC6835l2);
    }

    static /* synthetic */ InterfaceC6835l L(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(interfaceC6835l, interfaceC6835l2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6835l M(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        return (interfaceC6835l == null || interfaceC6835l2 == null || interfaceC6835l == interfaceC6835l2) ? interfaceC6835l == null ? interfaceC6835l2 : interfaceC6835l : new d(interfaceC6835l, interfaceC6835l2);
    }

    public static final n N(n nVar, InterfaceC5279k interfaceC5279k) {
        n nVarD0 = d0(interfaceC5279k);
        if (nVarD0 != null) {
            nVarD0.h(MPv3.MAX_MESSAGE_ID);
            return nVarD0;
        }
        n nVarD = nVar.d();
        nVarD.h(MPv3.MAX_MESSAGE_ID);
        nVarD.g(interfaceC5279k.i());
        AbstractC6492s.g(nVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        interfaceC5279k.g(nVarD);
        AbstractC6492s.g(nVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return nVarD;
    }

    public static final n O(n nVar, InterfaceC5279k interfaceC5279k, g gVar) {
        n nVarP;
        synchronized (I()) {
            nVarP = P(nVar, interfaceC5279k, gVar);
        }
        return nVarP;
    }

    private static final n P(n nVar, InterfaceC5279k interfaceC5279k, g gVar) {
        n nVarN = N(nVar, interfaceC5279k);
        nVarN.c(nVar);
        nVarN.h(gVar.f());
        return nVarN;
    }

    public static final void Q(g gVar, InterfaceC5279k interfaceC5279k) {
        gVar.w(gVar.j() + 1);
        InterfaceC6835l interfaceC6835lK = gVar.k();
        if (interfaceC6835lK != null) {
            interfaceC6835lK.invoke(interfaceC5279k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map R(androidx.compose.runtime.snapshots.b bVar, androidx.compose.runtime.snapshots.b bVar2, i iVar) {
        long[] jArr;
        int i10;
        HashMap map;
        long[] jArr2;
        int i11;
        HashMap map2;
        int i12;
        n nVarW;
        I iE = bVar2.E();
        int iF = bVar.f();
        HashMap map3 = null;
        if (iE == null) {
            return null;
        }
        i iVarU = bVar2.g().v(bVar2.f()).u(bVar2.F());
        Object[] objArr = iE.f54929b;
        long[] jArr3 = iE.f54928a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap map4 = null;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j10) < 128) {
                            InterfaceC5279k interfaceC5279k = (InterfaceC5279k) objArr[(i13 << 3) + i16];
                            n nVarI = interfaceC5279k.i();
                            n nVarW2 = W(nVarI, iF, iVar);
                            if (nVarW2 == null || (nVarW = W(nVarI, iF, iVarU)) == null || AbstractC6492s.d(nVarW2, nVarW)) {
                                jArr2 = jArr3;
                                i11 = iF;
                            } else {
                                jArr2 = jArr3;
                                i11 = iF;
                                n nVarW3 = W(nVarI, bVar2.f(), bVar2.g());
                                if (nVarW3 == null) {
                                    V();
                                    throw new KotlinNothingValueException();
                                }
                                n nVarJ = interfaceC5279k.j(nVarW, nVarW2, nVarW3);
                                if (nVarJ == null) {
                                    return null;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(nVarW2, nVarJ);
                                map4 = map4;
                            }
                            map2 = null;
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = iF;
                            map2 = map3;
                            i12 = i14;
                        }
                        j10 >>= i12;
                        i16++;
                        map3 = map2;
                        i14 = i12;
                        jArr3 = jArr2;
                        iF = i11;
                    }
                    jArr = jArr3;
                    i10 = iF;
                    map = map3;
                    if (i15 != i14) {
                        return map4;
                    }
                } else {
                    jArr = jArr3;
                    i10 = iF;
                    map = map3;
                }
                if (i13 == length) {
                    map3 = map4;
                    break;
                }
                i13++;
                map3 = map;
                jArr3 = jArr;
                iF = i10;
            }
        }
        return map3;
    }

    public static final n S(n nVar, InterfaceC5279k interfaceC5279k, g gVar, n nVar2) {
        n nVarN;
        if (gVar.i()) {
            gVar.p(interfaceC5279k);
        }
        int iF = gVar.f();
        if (nVar2.f() == iF) {
            return nVar2;
        }
        synchronized (I()) {
            nVarN = N(nVar, interfaceC5279k);
        }
        nVarN.h(iF);
        if (nVar2.f() != 1) {
            gVar.p(interfaceC5279k);
        }
        return nVarN;
    }

    private static final boolean T(InterfaceC5279k interfaceC5279k) {
        n nVar;
        int iE = f28657f.e(f28656e);
        n nVar2 = null;
        n nVarI = null;
        int i10 = 0;
        for (n nVarI2 = interfaceC5279k.i(); nVarI2 != null; nVarI2 = nVarI2.e()) {
            int iF = nVarI2.f();
            if (iF != 0) {
                if (iF >= iE) {
                    i10++;
                } else if (nVar2 == null) {
                    i10++;
                    nVar2 = nVarI2;
                } else {
                    if (nVarI2.f() < nVar2.f()) {
                        nVar = nVar2;
                        nVar2 = nVarI2;
                    } else {
                        nVar = nVarI2;
                    }
                    if (nVarI == null) {
                        nVarI = interfaceC5279k.i();
                        n nVar3 = nVarI;
                        while (true) {
                            if (nVarI == null) {
                                nVarI = nVar3;
                                break;
                            }
                            if (nVarI.f() >= iE) {
                                break;
                            }
                            if (nVar3.f() < nVarI.f()) {
                                nVar3 = nVarI;
                            }
                            nVarI = nVarI.e();
                        }
                    }
                    nVar2.h(0);
                    nVar2.c(nVarI);
                    nVar2 = nVar;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(InterfaceC5279k interfaceC5279k) {
        if (T(interfaceC5279k)) {
            f28658g.a(interfaceC5279k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n W(n nVar, int i10, i iVar) {
        n nVar2 = null;
        while (nVar != null) {
            if (f0(nVar, i10, iVar) && (nVar2 == null || nVar2.f() < nVar.f())) {
                nVar2 = nVar;
            }
            nVar = nVar.e();
        }
        if (nVar2 != null) {
            return nVar2;
        }
        return null;
    }

    public static final n X(n nVar, InterfaceC5279k interfaceC5279k) {
        n nVarW;
        g.a aVar = g.f28632e;
        g gVarC = aVar.c();
        InterfaceC6835l interfaceC6835lH = gVarC.h();
        if (interfaceC6835lH != null) {
            interfaceC6835lH.invoke(interfaceC5279k);
        }
        n nVarW2 = W(nVar, gVarC.f(), gVarC.g());
        if (nVarW2 != null) {
            return nVarW2;
        }
        synchronized (I()) {
            g gVarC2 = aVar.c();
            n nVarI = interfaceC5279k.i();
            AbstractC6492s.g(nVarI, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            nVarW = W(nVarI, gVarC2.f(), gVarC2.g());
            if (nVarW == null) {
                V();
                throw new KotlinNothingValueException();
            }
        }
        return nVarW;
    }

    public static final void Y(int i10) {
        f28657f.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a0(g gVar, InterfaceC6835l interfaceC6835l) {
        Object objInvoke = interfaceC6835l.invoke(f28655d.k(gVar.f()));
        synchronized (I()) {
            int i10 = f28656e;
            f28656e = i10 + 1;
            f28655d = f28655d.k(gVar.f());
            f28661j.set(new androidx.compose.runtime.snapshots.a(i10, f28655d));
            gVar.d();
            f28655d = f28655d.v(i10);
            J j10 = J.f24997a;
        }
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g b0(InterfaceC6835l interfaceC6835l) {
        return (g) A(new e(interfaceC6835l));
    }

    public static final int c0(int i10, i iVar) {
        int iA;
        int iS = iVar.s(i10);
        synchronized (I()) {
            iA = f28657f.a(iS);
        }
        return iA;
    }

    private static final n d0(InterfaceC5279k interfaceC5279k) {
        int iE = f28657f.e(f28656e) - 1;
        i iVarA = i.f28640e.a();
        n nVar = null;
        for (n nVarI = interfaceC5279k.i(); nVarI != null; nVarI = nVarI.e()) {
            if (nVarI.f() == 0) {
                return nVarI;
            }
            if (f0(nVarI, iE, iVarA)) {
                if (nVar != null) {
                    return nVarI.f() < nVar.f() ? nVarI : nVar;
                }
                nVar = nVarI;
            }
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, i iVar) {
        return (i11 == 0 || i11 > i10 || iVar.q(i11)) ? false : true;
    }

    private static final boolean f0(n nVar, int i10, i iVar) {
        return e0(i10, nVar.f(), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(g gVar) {
        int iE;
        if (f28655d.q(gVar.f())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: id=");
        sb2.append(gVar.f());
        sb2.append(", disposed=");
        sb2.append(gVar.e());
        sb2.append(", applied=");
        androidx.compose.runtime.snapshots.b bVar = gVar instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) gVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (I()) {
            iE = f28657f.e(-1);
        }
        sb2.append(iE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final n h0(n nVar, InterfaceC5279k interfaceC5279k, g gVar) {
        n nVarW;
        if (gVar.i()) {
            gVar.p(interfaceC5279k);
        }
        int iF = gVar.f();
        n nVarW2 = W(nVar, iF, gVar.g());
        if (nVarW2 == null) {
            V();
            throw new KotlinNothingValueException();
        }
        if (nVarW2.f() == gVar.f()) {
            return nVarW2;
        }
        synchronized (I()) {
            nVarW = W(interfaceC5279k.i(), iF, gVar.g());
            if (nVarW == null) {
                V();
                throw new KotlinNothingValueException();
            }
            if (nVarW.f() != iF) {
                nVarW = P(nVarW, interfaceC5279k, gVar);
            }
        }
        AbstractC6492s.g(nVarW, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (nVarW2.f() != 1) {
            gVar.p(interfaceC5279k);
        }
        return nVarW;
    }

    public static final i z(i iVar, int i10, int i11) {
        while (i10 < i11) {
            iVar = iVar.v(i10);
            i10++;
        }
        return iVar;
    }
}
