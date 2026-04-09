package au;

import java.util.ArrayList;
import lq.b0;

/* loaded from: classes.dex */
public abstract class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final pq.h f2324a;

    /* renamed from: d, reason: collision with root package name */
    public final int f2325d;

    /* renamed from: g, reason: collision with root package name */
    public final yt.a f2326g;

    public f(pq.h hVar, int i10, yt.a aVar) {
        this.f2324a = hVar;
        this.f2325d = i10;
        this.f2326g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // au.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zt.f a(pq.h r5, int r6, yt.a r7) {
        /*
            r4 = this;
            pq.h r0 = r4.f2324a
            pq.h r5 = r5.i0(r0)
            yt.a r1 = yt.a.SUSPEND
            yt.a r2 = r4.f2326g
            int r3 = r4.f2325d
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
            boolean r0 = br.l.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            au.f r5 = r4.c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.f.a(pq.h, int, yt.a):zt.f");
    }

    public abstract Object b(yt.p pVar, a8.h hVar);

    public abstract f c(pq.h hVar, int i10, yt.a aVar);

    public zt.f d() {
        return null;
    }

    @Override // zt.f
    public Object l(zt.g gVar, pq.c cVar) {
        Object objG = wt.w.g(new e(gVar, this, (pq.c) null, 0), cVar);
        return objG == qq.a.COROUTINE_SUSPENDED ? objG : b0.f15562a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        pq.i iVar = pq.i.f20621a;
        pq.h hVar = this.f2324a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i10 = this.f2325d;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        yt.a aVar = yt.a.SUSPEND;
        yt.a aVar2 = this.f2326g;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return h0.b.r(sb2, mq.o.x0(arrayList, ", ", null, null, null, 62), ']');
    }
}
