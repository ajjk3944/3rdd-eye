package O1;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ki.k;
import Yg.J;
import dh.InterfaceC5380e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final N f16785a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f16786b;

    /* renamed from: c, reason: collision with root package name */
    private final Ki.g f16787c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f16788d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f16789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f16790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f16791c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, k kVar, InterfaceC6839p interfaceC6839p) {
            super(1);
            this.f16789a = interfaceC6835l;
            this.f16790b = kVar;
            this.f16791c = interfaceC6839p;
        }

        public final void a(Throwable th2) {
            J j10;
            this.f16789a.invoke(th2);
            this.f16790b.f16787c.f(th2);
            do {
                Object objF = Ki.k.f(this.f16790b.f16787c.d());
                if (objF == null) {
                    j10 = null;
                } else {
                    this.f16791c.invoke(objF, th2);
                    j10 = J.f24997a;
                }
            } while (j10 != null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f16792a;

        /* renamed from: b, reason: collision with root package name */
        int f16793b;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return k.this.new b(interfaceC5380e);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r5.f16793b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yg.v.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f16792a
                mh.p r1 = (mh.InterfaceC6839p) r1
                Yg.v.b(r6)
                goto L56
            L22:
                Yg.v.b(r6)
                O1.k r6 = O1.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = O1.k.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                O1.k r6 = O1.k.this
                Ii.N r6 = O1.k.d(r6)
                Ii.O.h(r6)
                O1.k r6 = O1.k.this
                mh.p r1 = O1.k.a(r6)
                O1.k r6 = O1.k.this
                Ki.g r6 = O1.k.b(r6)
                r5.f16792a = r1
                r5.f16793b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f16792a = r4
                r5.f16793b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                O1.k r6 = O1.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = O1.k.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                Yg.J r6 = Yg.J.f24997a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public k(N scope, InterfaceC6835l onComplete, InterfaceC6839p onUndeliveredElement, InterfaceC6839p consumeMessage) {
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(onComplete, "onComplete");
        AbstractC6492s.i(onUndeliveredElement, "onUndeliveredElement");
        AbstractC6492s.i(consumeMessage, "consumeMessage");
        this.f16785a = scope;
        this.f16786b = consumeMessage;
        this.f16787c = Ki.j.b(MPv3.MAX_MESSAGE_ID, null, null, 6, null);
        this.f16788d = new AtomicInteger(0);
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) scope.getCoroutineContext().get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 == null) {
            return;
        }
        interfaceC3091y0.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(Object obj) throws Throwable {
        Object objK = this.f16787c.k(obj);
        if (objK instanceof k.a) {
            Throwable thE = Ki.k.e(objK);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!Ki.k.j(objK)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f16788d.getAndIncrement() == 0) {
            AbstractC3063k.d(this.f16785a, null, null, new b(null), 3, null);
        }
    }
}
