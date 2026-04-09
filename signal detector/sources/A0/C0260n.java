package a0;

import c5.C0412i;
import h5.InterfaceC2370d;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260n extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4587e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0244C f4589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260n(C0244C c0244c, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4589g = c0244c;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0260n) j((InterfaceC2370d) obj2, (AbstractC0258l) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C0260n c0260n = new C0260n(this.f4589g, interfaceC2370d);
        c0260n.f4588f = obj;
        return c0260n;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[RETURN] */
    @Override // j5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f4587e
            c5.i r1 = c5.C0412i.f5929a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L18
            if (r0 != r2) goto L10
            R2.a.H(r7)
            return r1
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            R2.a.H(r7)
            return r1
        L1c:
            R2.a.H(r7)
            java.lang.Object r7 = r6.f4588f
            a0.l r7 = (a0.AbstractC0258l) r7
            boolean r0 = r7 instanceof a0.C0256j
            a0.C r4 = r6.f4589g
            i5.a r5 = i5.EnumC2380a.f20635a
            if (r0 == 0) goto L6a
            a0.j r7 = (a0.C0256j) r7
            r6.f4587e = r3
            C5.o r0 = r4.f4557e
            java.lang.Object r0 = r0.I()
            a0.D r0 = (a0.AbstractC0245D) r0
            boolean r2 = r0 instanceof a0.C0247a
            if (r2 == 0) goto L3c
            goto L5e
        L3c:
            boolean r2 = r0 instanceof a0.C0254h
            if (r2 == 0) goto L4b
            a0.D r7 = r7.f4581a
            if (r0 != r7) goto L5e
            java.lang.Object r7 = r4.e(r6)
            if (r7 != r5) goto L5e
            goto L5f
        L4b:
            a0.E r7 = a0.C0246E.f4560a
            boolean r7 = q5.i.a(r0, r7)
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r4.e(r6)
            if (r7 != r5) goto L5e
            goto L5f
        L5a:
            boolean r7 = r0 instanceof a0.C0253g
            if (r7 != 0) goto L62
        L5e:
            r7 = r1
        L5f:
            if (r7 != r5) goto L79
            goto L78
        L62:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            r7.<init>(r0)
            throw r7
        L6a:
            boolean r0 = r7 instanceof a0.C0257k
            if (r0 == 0) goto L79
            a0.k r7 = (a0.C0257k) r7
            r6.f4587e = r2
            java.lang.Object r7 = a0.C0244C.a(r4, r7, r6)
            if (r7 != r5) goto L79
        L78:
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0260n.l(java.lang.Object):java.lang.Object");
    }
}
