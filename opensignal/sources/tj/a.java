package tj;

import android.view.View;
import ar.n;
import h9.p;
import lq.b0;
import pq.c;
import rq.i;
import st.k;

/* loaded from: classes.dex */
public final class a extends i implements n {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22874g;

    /* renamed from: r, reason: collision with root package name */
    public int f22875r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22876x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22877y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, c cVar, int i10) {
        super(2, cVar);
        this.f22874g = i10;
        this.f22877y = obj;
    }

    @Override // rq.a
    public final c o(Object obj, c cVar) {
        switch (this.f22874g) {
            case 0:
                a aVar = new a((p) this.f22877y, cVar, 0);
                aVar.f22876x = obj;
                return aVar;
            default:
                a aVar2 = new a((View) this.f22877y, cVar, 1);
                aVar2.f22876x = obj;
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f22874g
            switch(r0) {
                case 0: goto L6e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f22877y
            android.view.View r0 = (android.view.View) r0
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r7.f22875r
            lq.b0 r3 = lq.b0.f15562a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 == r5) goto L24
            if (r2 != r4) goto L1c
            lf.t1.G(r8)
        L1a:
            r1 = r3
            goto L6d
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            java.lang.Object r2 = r7.f22876x
            st.k r2 = (st.k) r2
            lf.t1.G(r8)
            goto L3f
        L2c:
            lf.t1.G(r8)
            java.lang.Object r8 = r7.f22876x
            r2 = r8
            st.k r2 = (st.k) r2
            r7.f22876x = r2
            r7.f22875r = r5
            qq.a r8 = r2.b(r0, r7)
            if (r8 != r1) goto L3f
            goto L6d
        L3f:
            boolean r8 = r0 instanceof android.view.ViewGroup
            if (r8 == 0) goto L1a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8 = 0
            r7.f22876x = r8
            r7.f22875r = r4
            r2.getClass()
            st.o r8 = new st.o
            br.b r5 = new br.b
            r6 = 7
            r5.<init>(r6, r0)
            r8.<init>(r5)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L60
            r8 = r3
            goto L67
        L60:
            r2.f22299g = r8
            r2.f22297a = r4
            r2.f22300r = r7
            r8 = r1
        L67:
            if (r8 != r1) goto L6a
            goto L6b
        L6a:
            r8 = r3
        L6b:
            if (r8 != r1) goto L1a
        L6d:
            return r1
        L6e:
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            int r1 = r7.f22875r
            lq.b0 r2 = lq.b0.f15562a
            r3 = 1
            if (r1 == 0) goto L86
            if (r1 != r3) goto L7e
            lf.t1.G(r8)
        L7c:
            r0 = r2
            goto Lba
        L7e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L86:
            lf.t1.G(r8)
            java.lang.Object r8 = r7.f22876x
            st.k r8 = (st.k) r8
            java.lang.Object r1 = r7.f22877y
            h9.p r1 = (h9.p) r1
            java.util.ArrayList r1 = r1.f10444b
            r7.f22875r = r3
            r8.getClass()
            if (r1 == 0) goto La2
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto La2
        La0:
            r8 = r2
            goto Lb8
        La2:
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto Lae
            r8 = r2
            goto Lb6
        Lae:
            r8.f22299g = r1
            r1 = 2
            r8.f22297a = r1
            r8.f22300r = r7
            r8 = r0
        Lb6:
            if (r8 != r0) goto La0
        Lb8:
            if (r8 != r0) goto L7c
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.a.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        k kVar = (k) obj;
        c cVar = (c) obj2;
        switch (this.f22874g) {
        }
        return ((a) o(kVar, cVar)).q(b0.f15562a);
    }
}
