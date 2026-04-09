package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.u f30104a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.v f30105b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.c f30106c;

    /* renamed from: d, reason: collision with root package name */
    public xk.a0 f30107d;

    /* renamed from: e, reason: collision with root package name */
    public final zk.h f30108e = com.bumptech.glide.e.f(-1, 6, null);

    public n0(i0.u uVar, xk.v vVar, c2.c cVar) {
        this.f30104a = uVar;
        this.f30105b = vVar;
        this.f30106c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        if (d0.m1.d(r2, r10, r12, r1) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:41:0x00d1, B:45:0x00e7], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r11v1, types: [ek.j, mk.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(nm.n0 r18, ek.c r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.n0.a(nm.n0, ek.c):java.lang.Object");
    }

    public final boolean b(h0 h0Var, float f10, mk.a aVar, mk.c cVar) {
        boolean zC;
        int iOrdinal = h0Var.ordinal();
        i0.u uVar = this.f30104a;
        if (iOrdinal == 0) {
            zC = uVar.c();
        } else {
            if (iOrdinal != 1) {
                throw new ac.m();
            }
            zC = uVar.d();
        }
        if (!zC) {
            return false;
        }
        if (this.f30107d == null) {
            this.f30107d = xk.x.v(this.f30105b, null, null, new l0(this, null, 0), 3);
        }
        this.f30108e.l(new j0(h0Var, f10, aVar, cVar));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ek.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof nm.m0
            if (r0 == 0) goto L13
            r0 = r8
            nm.m0 r0 = (nm.m0) r0
            int r1 = r0.f30099d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30099d = r1
            goto L18
        L13:
            nm.m0 r0 = new nm.m0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30097b
            int r1 = r0.f30099d
            yj.u r2 = yj.u.f37649a
            r3 = 0
            r4 = 2
            r5 = 1
            dk.a r6 = dk.a.f22275a
            if (r1 == 0) goto L3d
            if (r1 == r5) goto L37
            if (r1 != r4) goto L2f
            nm.n0 r0 = r0.f30096a
            ci.b.D(r8)
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            nm.n0 r1 = r0.f30096a
            ci.b.D(r8)
            goto L50
        L3d:
            ci.b.D(r8)
            nm.j0 r8 = nm.j0.f30068e
            r0.f30096a = r7
            r0.f30099d = r5
            zk.h r1 = r7.f30108e
            java.lang.Object r8 = r1.h(r0, r8)
            if (r8 != r6) goto L4f
            goto L65
        L4f:
            r1 = r7
        L50:
            xk.a0 r8 = r1.f30107d
            if (r8 == 0) goto L68
            r0.f30096a = r1
            r0.f30099d = r4
            r8.e(r3)
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r6) goto L62
            goto L63
        L62:
            r8 = r2
        L63:
            if (r8 != r6) goto L66
        L65:
            return r6
        L66:
            r0 = r1
        L67:
            r1 = r0
        L68:
            r1.f30107d = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.n0.c(ek.c):java.lang.Object");
    }
}
