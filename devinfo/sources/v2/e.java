package v2;

import b7.u;
import xk.m1;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d8.g f35767a;

    /* renamed from: b, reason: collision with root package name */
    public final a f35768b;

    /* renamed from: c, reason: collision with root package name */
    public final km.n f35769c;

    /* renamed from: d, reason: collision with root package name */
    public final h f35770d;

    /* renamed from: e, reason: collision with root package name */
    public final o.e f35771e;

    public e(d8.g gVar, a aVar) {
        km.n nVar = f.f35772a;
        km.n nVar2 = f.f35772a;
        h hVar = new h();
        g gVar2 = h.f35773a;
        yk.d dVar = z2.g.f37862a;
        gVar2.getClass();
        x.b(wd.b.O(gVar2, dVar).y(ck.i.f2898a).y(new m1(null)));
        o.e eVar = new o.e((byte) 0, 21);
        this.f35767a = gVar;
        this.f35768b = aVar;
        this.f35769c = nVar;
        this.f35770d = hVar;
        this.f35771e = eVar;
        new u(24, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079 A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #2 {Exception -> 0x0081, blocks: (B:15:0x0027, B:17:0x003a, B:20:0x003f, B:22:0x0043, B:25:0x0050, B:42:0x0079, B:43:0x0080, B:24:0x004c), top: B:53:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v2.r a(v2.q r7) {
        /*
            r6 = this;
            km.n r0 = r6.f35769c
            java.lang.Object r1 = r0.f28442b
            z2.k r1 = (z2.k) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f28443c     // Catch: java.lang.Throwable -> L24
            androidx.recyclerview.widget.g2 r2 = (androidx.recyclerview.widget.g2) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.g(r7)     // Catch: java.lang.Throwable -> L24
            v2.r r2 = (v2.r) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            boolean r3 = r2.f35790b     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f28443c     // Catch: java.lang.Throwable -> L24
            androidx.recyclerview.widget.g2 r2 = (androidx.recyclerview.widget.g2) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.l(r7)     // Catch: java.lang.Throwable -> L24
            v2.r r2 = (v2.r) r2     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r7 = move-exception
            goto L8a
        L26:
            monitor-exit(r1)
            v2.h r1 = r6.f35770d     // Catch: java.lang.Exception -> L81
            r1.getClass()     // Catch: java.lang.Exception -> L81
            v2.p r1 = r7.f35784a     // Catch: java.lang.Exception -> L81
            o.e r2 = r6.f35771e     // Catch: java.lang.Exception -> L81
            java.lang.Object r2 = r2.f30195b     // Catch: java.lang.Exception -> L81
            v2.n r2 = (v2.n) r2     // Catch: java.lang.Exception -> L81
            int r3 = r7.f35786c     // Catch: java.lang.Exception -> L81
            v2.k r4 = r7.f35785b     // Catch: java.lang.Exception -> L81
            if (r1 == 0) goto L4c
            boolean r5 = r1 instanceof v2.b     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L3f
            goto L4c
        L3f:
            boolean r5 = r1 instanceof v2.m     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L4a
            v2.m r1 = (v2.m) r1     // Catch: java.lang.Exception -> L81
            android.graphics.Typeface r1 = r2.g(r1, r4, r3)     // Catch: java.lang.Exception -> L81
            goto L50
        L4a:
            r1 = 0
            goto L56
        L4c:
            android.graphics.Typeface r1 = r2.f(r4, r3)     // Catch: java.lang.Exception -> L81
        L50:
            v2.r r2 = new v2.r     // Catch: java.lang.Exception -> L81
            r2.<init>(r1)     // Catch: java.lang.Exception -> L81
            r1 = r2
        L56:
            if (r1 == 0) goto L79
            java.lang.Object r2 = r0.f28442b
            z2.k r2 = (z2.k) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f28443c     // Catch: java.lang.Throwable -> L73
            androidx.recyclerview.widget.g2 r3 = (androidx.recyclerview.widget.g2) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.g(r7)     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L75
            boolean r3 = r1.f35790b     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L75
            java.lang.Object r0 = r0.f28443c     // Catch: java.lang.Throwable -> L73
            androidx.recyclerview.widget.g2 r0 = (androidx.recyclerview.widget.g2) r0     // Catch: java.lang.Throwable -> L73
            r0.k(r7, r1)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r7 = move-exception
            goto L77
        L75:
            monitor-exit(r2)
            return r1
        L77:
            monitor-exit(r2)
            throw r7
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L81
            throw r7     // Catch: java.lang.Exception -> L81
        L81:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L8a:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.e.a(v2.q):v2.r");
    }

    public final r b(p pVar, k kVar, int i4, int i10) {
        a aVar = this.f35768b;
        aVar.getClass();
        int i11 = aVar.f35766a;
        k kVar2 = (i11 == 0 || i11 == Integer.MAX_VALUE) ? kVar : new k(ci.b.e(kVar.f35780a + i11, 1, 1000));
        this.f35767a.getClass();
        return a(new q(pVar, kVar2, i4, i10, null));
    }
}
