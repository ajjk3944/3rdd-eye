package g1;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f24275a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24276b;

    /* renamed from: c, reason: collision with root package name */
    public x.z f24277c;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f24283k;

    /* renamed from: d, reason: collision with root package name */
    public int f24278d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final x.e0 f24279e = com.bumptech.glide.f.i();

    /* renamed from: f, reason: collision with root package name */
    public final x.e0 f24280f = new x.e0();
    public final x.f0 g = new x.f0();

    /* renamed from: h, reason: collision with root package name */
    public final w0.e f24281h = new w0.e(new u0.d0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final s f24282i = new s(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final x.e0 f24284l = com.bumptech.glide.f.i();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f24285m = new HashMap();

    public t(mk.c cVar) {
        this.f24275a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0219 A[PHI: r23
  0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[PHI: r23
  0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fd A[EDGE_INSN: B:244:0x04f6->B:246:0x04fd BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
  0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056e A[PHI: r0
  0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r23
  0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.util.Set r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.t.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, x.z r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f24283k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f36967c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f36966b
            r7[r4] = r1
            int[] r3 = r3.f36967c
            r3[r4] = r2
            boolean r3 = r1 instanceof u0.d0
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            u0.d0 r2 = (u0.d0) r2
            u0.c0 r2 = r2.h()
            java.util.HashMap r3 = r0.f24285m
            java.lang.Object r7 = r2.f34756f
            r3.put(r1, r7)
            x.z r2 = r2.f34755e
            x.e0 r3 = r0.f24284l
            com.bumptech.glide.f.z(r3, r1)
            java.lang.Object[] r7 = r2.f36966b
            long[] r2 = r2.f36965a
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
            g1.x r9 = (g1.x) r9
            boolean r5 = r9 instanceof g1.y
            if (r5 == 0) goto L82
            r5 = r9
            g1.y r5 = (g1.y) r5
            r5.f(r4)
        L82:
            com.bumptech.glide.f.c(r3, r9, r1)
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
            boolean r2 = r1 instanceof g1.y
            if (r2 == 0) goto L9d
            r2 = r1
            g1.y r2 = (g1.y) r2
            r2.f(r4)
        L9d:
            x.e0 r2 = r0.f24279e
            r3 = r23
            com.bumptech.glide.f.c(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.t.b(java.lang.Object, int, java.lang.Object, x.z):void");
    }

    public final void c(Object obj, Object obj2) {
        x.e0 e0Var = this.f24279e;
        com.bumptech.glide.f.y(e0Var, obj2, obj);
        if (!(obj2 instanceof u0.d0) || e0Var.c(obj2)) {
            return;
        }
        com.bumptech.glide.f.z(this.f24284l, obj2);
        this.f24285m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.t.d():void");
    }
}
