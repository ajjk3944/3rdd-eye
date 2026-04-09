package x0;

import com.google.android.gms.internal.measurement.b4;
import java.util.HashMap;
import n0.d0;
import u.a0;
import u.b0;
import x1.m1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ar.k f24728a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24729b;

    /* renamed from: c, reason: collision with root package name */
    public u.y f24730c;
    public int j;

    /* renamed from: d, reason: collision with root package name */
    public int f24731d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f24732e = b4.k();

    /* renamed from: f, reason: collision with root package name */
    public final a0 f24733f = new a0();

    /* renamed from: g, reason: collision with root package name */
    public final b0 f24734g = new b0();

    /* renamed from: h, reason: collision with root package name */
    public final p0.e f24735h = new p0.e(new d0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final n0.n f24736i = new n0.n(1, this);
    public final a0 k = b4.k();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f24737l = new HashMap();

    public q(ar.k kVar) {
        this.f24728a = kVar;
    }

    public final void a(m1 m1Var, cg.j jVar, ar.a aVar) {
        Object obj;
        int i10;
        boolean z10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        Object obj3 = this.f24729b;
        u.y yVar = this.f24730c;
        int i14 = this.f24731d;
        this.f24729b = m1Var;
        this.f24730c = (u.y) this.f24733f.g(m1Var);
        if (this.f24731d == -1) {
            this.f24731d = Long.hashCode(l.k().g());
        }
        n0.n nVar = this.f24736i;
        p0.e eVarA = androidx.compose.runtime.c.a();
        boolean z11 = true;
        try {
            eVarA.b(nVar);
            p.h(aVar, jVar);
            eVarA.k(eVarA.f20232g - 1);
            Object obj4 = this.f24729b;
            br.l.b(obj4);
            int i15 = this.f24731d;
            u.y yVar2 = this.f24730c;
            if (yVar2 != null) {
                long[] jArr = yVar2.f23128a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j = jArr[i16];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            z10 = z11;
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    i13 = i17;
                                    Object obj5 = yVar2.f23129b[i20];
                                    i12 = i19;
                                    boolean z12 = yVar2.f23130c[i20] != i15 ? z10 : false;
                                    if (z12) {
                                        i11 = i15;
                                        a0 a0Var = this.f24732e;
                                        b4.Y(a0Var, obj5, obj4);
                                        obj2 = obj4;
                                        if ((obj5 instanceof d0) && !a0Var.c(obj5)) {
                                            b4.Z(this.k, obj5);
                                            this.f24737l.remove(obj5);
                                        }
                                    } else {
                                        obj2 = obj4;
                                        i11 = i15;
                                    }
                                    if (z12) {
                                        yVar2.g(i20);
                                    }
                                } else {
                                    obj2 = obj4;
                                    i11 = i15;
                                    i12 = i19;
                                    i13 = i17;
                                }
                                j >>= i13;
                                i19 = i12 + 1;
                                i17 = i13;
                                i15 = i11;
                                obj4 = obj2;
                            }
                            obj = obj4;
                            i10 = i15;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            obj = obj4;
                            i10 = i15;
                            z10 = z11;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        z11 = z10;
                        i15 = i10;
                        obj4 = obj;
                    }
                }
            }
            this.f24729b = obj3;
            this.f24730c = yVar;
            this.f24731d = i14;
        } catch (Throwable th2) {
            eVarA.k(eVarA.f20232g - 1);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0278 A[PHI: r12
  0x0278: PHI (r12v46 boolean) = (r12v45 boolean), (r12v47 boolean) binds: [B:103:0x024d, B:111:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b1 A[PHI: r12
  0x03b1: PHI (r12v28 boolean) = (r12v27 boolean), (r12v29 boolean) binds: [B:159:0x0386, B:167:0x03af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0473 A[PHI: r12
  0x0473: PHI (r12v15 boolean) = (r12v14 boolean), (r12v16 boolean) binds: [B:193:0x044c, B:201:0x0471] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04dc A[EDGE_INSN: B:226:0x04dc->B:306:0x04e5 BREAK  A[LOOP:18: B:216:0x04ab->B:227:0x04de], PHI: r12
  0x04dc: PHI (r12v5 boolean) = (r12v4 boolean), (r12v6 boolean) binds: [B:217:0x04b5, B:225:0x04da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[PHI: r31
  0x0130: PHI (r31v13 boolean) = (r31v12 boolean), (r31v14 boolean) binds: [B:44:0x0105, B:53:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[PHI: r12
  0x0203: PHI (r12v56 boolean) = (r12v55 boolean), (r12v57 boolean) binds: [B:79:0x01d8, B:87:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.util.Set r45) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.q.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, u.y r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f23130c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f23129b
            r7[r4] = r1
            int[] r3 = r3.f23130c
            r3[r4] = r2
            boolean r3 = r1 instanceof n0.d0
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            n0.d0 r2 = (n0.d0) r2
            n0.c0 r2 = r2.m()
            java.util.HashMap r3 = r0.f24737l
            java.lang.Object r7 = r2.f17143f
            r3.put(r1, r7)
            u.y r2 = r2.f17142e
            u.a0 r3 = r0.k
            com.google.android.gms.internal.measurement.b4.Z(r3, r1)
            java.lang.Object[] r7 = r2.f23129b
            long[] r2 = r2.f23128a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            x0.t r9 = (x0.t) r9
            boolean r5 = r9 instanceof x0.u
            if (r5 == 0) goto L82
            r5 = r9
            x0.u r5 = (x0.u) r5
            r5.h(r4)
        L82:
            com.google.android.gms.internal.measurement.b4.c(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof x0.u
            if (r2 == 0) goto L9d
            r2 = r1
            x0.u r2 = (x0.u) r2
            r2.h(r4)
        L9d:
            u.a0 r2 = r0.f24732e
            r3 = r23
            com.google.android.gms.internal.measurement.b4.c(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.q.c(java.lang.Object, int, java.lang.Object, u.y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.q.d():void");
    }
}
