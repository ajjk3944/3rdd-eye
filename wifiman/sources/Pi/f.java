package Pi;

import Ki.g;
import Ki.j;
import Ki.k;
import Ki.w;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
final class f implements Dj.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f18702a;

    /* renamed from: b, reason: collision with root package name */
    private Dj.c f18703b;

    /* renamed from: c, reason: collision with root package name */
    private final g f18704c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f18705a;

        /* renamed from: c, reason: collision with root package name */
        int f18707c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18705a = obj;
            this.f18707c |= PduHandle.NONE;
            return f.this.d(this);
        }
    }

    public f(int i10, Ki.a aVar, long j10) {
        this.f18702a = j10;
        this.f18704c = j.b(i10 == 0 ? 1 : i10, aVar, null, 4, null);
    }

    @Override // Dj.b
    public void a() {
        w.a.a(this.f18704c, null, 1, null);
    }

    public final void b() {
        Dj.c cVar = this.f18703b;
        if (cVar == null) {
            AbstractC6492s.v("subscription");
            cVar = null;
        }
        cVar.cancel();
    }

    public final void c() {
        Dj.c cVar = this.f18703b;
        if (cVar == null) {
            AbstractC6492s.v("subscription");
            cVar = null;
        }
        cVar.request(this.f18702a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(dh.InterfaceC5380e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Pi.f.a
            if (r0 == 0) goto L13
            r0 = r5
            Pi.f$a r0 = (Pi.f.a) r0
            int r1 = r0.f18707c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18707c = r1
            goto L18
        L13:
            Pi.f$a r0 = new Pi.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18705a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f18707c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Yg.v.b(r5)
            Ki.k r5 = (Ki.k) r5
            java.lang.Object r5 = r5.l()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            Yg.v.b(r5)
            Ki.g r5 = r4.f18704c
            r0.f18707c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Throwable r0 = Ki.k.e(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5 instanceof Ki.k.c
            if (r0 == 0) goto L53
            Ki.k.e(r5)
            r5 = 0
        L53:
            return r5
        L54:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.f.d(dh.e):java.lang.Object");
    }

    @Override // Dj.b
    public void h(Object obj) {
        if (k.j(this.f18704c.k(obj))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + obj + " was not added to channel because it was full, " + this.f18704c).toString());
    }

    @Override // Dj.b, gg.l
    public void j(Dj.c cVar) {
        this.f18703b = cVar;
        c();
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        this.f18704c.f(th2);
    }
}
