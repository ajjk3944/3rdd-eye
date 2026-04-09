package Li;

import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3215b extends AbstractC3217d {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6839p f11898e;

    /* renamed from: Li.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11899a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11900b;

        /* renamed from: d, reason: collision with root package name */
        int f11902d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11900b = obj;
            this.f11902d |= PduHandle.NONE;
            return C3215b.this.g(null, this);
        }
    }

    public /* synthetic */ C3215b(InterfaceC6839p interfaceC6839p, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6839p, (i11 & 2) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Ki.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Li.AbstractC3217d, Mi.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object g(Ki.t r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Li.C3215b.a
            if (r0 == 0) goto L13
            r0 = r6
            Li.b$a r0 = (Li.C3215b.a) r0
            int r1 = r0.f11902d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11902d = r1
            goto L18
        L13:
            Li.b$a r0 = new Li.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11900b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11902d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f11899a
            Ki.t r5 = (Ki.t) r5
            Yg.v.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Yg.v.b(r6)
            r0.f11899a = r5
            r0.f11902d = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.l()
            if (r5 == 0) goto L4c
            Yg.J r5 = Yg.J.f24997a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.C3215b.g(Ki.t, dh.e):java.lang.Object");
    }

    @Override // Mi.d
    protected Mi.d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new C3215b(this.f11898e, interfaceC5384i, i10, aVar);
    }

    public C3215b(InterfaceC6839p interfaceC6839p, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC6839p, interfaceC5384i, i10, aVar);
        this.f11898e = interfaceC6839p;
    }
}
