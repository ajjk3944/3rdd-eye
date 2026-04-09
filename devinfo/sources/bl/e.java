package bl;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ck.h f2288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2289b;

    /* renamed from: c, reason: collision with root package name */
    public final zk.a f2290c;

    public e(ck.h hVar, int i4, zk.a aVar) {
        this.f2288a = hVar;
        this.f2289b = i4;
        this.f2290c = aVar;
    }

    @Override // al.h
    public Object a(al.i iVar, ck.c cVar) {
        Object objH = xk.x.h(new bh.t(iVar, this, (ck.c) null, 2), cVar);
        return objH == dk.a.f22275a ? objH : yj.u.f37649a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // bl.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final al.h b(ck.h r5, int r6, zk.a r7) {
        /*
            r4 = this;
            ck.h r0 = r4.f2288a
            ck.h r5 = r5.y(r0)
            zk.a r1 = zk.a.f38322a
            zk.a r2 = r4.f2290c
            int r3 = r4.f2289b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = nk.k.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            bl.e r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.e.b(ck.h, int, zk.a):al.h");
    }

    public abstract Object c(zk.u uVar, ck.c cVar);

    public abstract e d(ck.h hVar, int i4, zk.a aVar);

    public al.h e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        ck.i iVar = ck.i.f2898a;
        ck.h hVar = this.f2288a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i4 = this.f2289b;
        if (i4 != -3) {
            arrayList.add("capacity=" + i4);
        }
        zk.a aVar = zk.a.f38322a;
        zk.a aVar2 = this.f2290c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return r5.c.l(sb2, zj.n.g0(arrayList, ", ", null, null, null, 62), ']');
    }
}
