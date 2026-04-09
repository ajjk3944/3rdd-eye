package I;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import T.InterfaceC3543m0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicReference;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f8014a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3543m0 f8015b = T.C0.a(0.0f);

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8016a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f8017b;

        /* renamed from: I.G$a$a, reason: collision with other inner class name */
        static final class C0330a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8019a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3091y0 f8020b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f8021c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0330a(InterfaceC3091y0 interfaceC3091y0, G g10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8020b = interfaceC3091y0;
                this.f8021c = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0330a(this.f8020b, this.f8021c, interfaceC5380e);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r8.f8019a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    Yg.v.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    Yg.v.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    Yg.v.b(r9)
                    goto L3a
                L2a:
                    Yg.v.b(r9)
                    Ii.y0 r9 = r8.f8020b
                    if (r9 == 0) goto L3a
                    r8.f8019a = r7
                    java.lang.Object r9 = Ii.A0.g(r9, r8)
                    if (r9 != r0) goto L3a
                    return r0
                L3a:
                    I.G r9 = r8.f8021c     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    I.G.b(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.f8019a = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = Ii.Y.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    return r0
                L4a:
                    I.G r9 = r8.f8021c     // Catch: java.lang.Throwable -> L18
                    I.G.b(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.f8019a = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = Ii.Y.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                    return r0
                L58:
                    I.G r0 = r8.f8021c
                    I.G.b(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: I.G.a.C0330a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0330a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = G.this.new a(interfaceC5380e);
            aVar.f8017b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f8016a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(r.Y.a(G.this.f8014a, null, AbstractC3063k.d((Ii.N) this.f8017b, null, null, new C0330a((InterfaceC3091y0) G.this.f8014a.getAndSet(null), G.this, null), 3, null)));
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(float f10) {
        this.f8015b.k(f10);
    }

    public final void c() {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) this.f8014a.getAndSet(null);
        if (interfaceC3091y0 != null) {
            InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        }
    }

    public final float d() {
        return this.f8015b.c();
    }

    public final Object f(InterfaceC5380e interfaceC5380e) {
        Object objG = Ii.O.g(new a(null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }
}
