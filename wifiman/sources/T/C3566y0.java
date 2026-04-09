package T;

import T.InterfaceC3530g0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: T.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3566y0 implements InterfaceC3530g0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3530g0 f21283a;

    /* renamed from: b, reason: collision with root package name */
    private final C3515b0 f21284b = new C3515b0();

    /* renamed from: T.y0$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f21285a;

        /* renamed from: b, reason: collision with root package name */
        Object f21286b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f21287c;

        /* renamed from: e, reason: collision with root package name */
        int f21289e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21287c = obj;
            this.f21289e |= PduHandle.NONE;
            return C3566y0.this.j(null, this);
        }
    }

    public C3566y0(InterfaceC3530g0 interfaceC3530g0) {
        this.f21283a = interfaceC3530g0;
    }

    public final void b() {
        this.f21284b.d();
    }

    public final void c() {
        this.f21284b.f();
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC3530g0.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.b(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // T.InterfaceC3530g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(mh.InterfaceC6835l r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof T.C3566y0.a
            if (r0 == 0) goto L13
            r0 = r7
            T.y0$a r0 = (T.C3566y0.a) r0
            int r1 = r0.f21289e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21289e = r1
            goto L18
        L13:
            T.y0$a r0 = new T.y0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21287c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f21289e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Yg.v.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f21286b
            mh.l r6 = (mh.InterfaceC6835l) r6
            java.lang.Object r2 = r0.f21285a
            T.y0 r2 = (T.C3566y0) r2
            Yg.v.b(r7)
            goto L53
        L40:
            Yg.v.b(r7)
            T.b0 r7 = r5.f21284b
            r0.f21285a = r5
            r0.f21286b = r6
            r0.f21289e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            T.g0 r7 = r2.f21283a
            r2 = 0
            r0.f21285a = r2
            r0.f21286b = r2
            r0.f21289e = r3
            java.lang.Object r7 = r7.j(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3566y0.j(mh.l, dh.e):java.lang.Object");
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC3530g0.a.d(this, interfaceC5384i);
    }
}
