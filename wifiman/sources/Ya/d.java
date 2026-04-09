package ya;

import Ii.N;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class d implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final a f66626c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8439a.c f66627a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC8439a.b f66628b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f66629a;

        /* renamed from: c, reason: collision with root package name */
        int f66631c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66629a = obj;
            this.f66631c |= PduHandle.NONE;
            return d.this.c(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66632a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f66632a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC8439a.c cVar = dVar.f66627a;
            dVar.j(cVar != null ? cVar.a() : null);
            return kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public d(InterfaceC8439a.c cVar) {
        this.f66627a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "Source [Local] - load initiated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(long j10) {
        return "Source [Local]  - load finished. Took " + j10 + " ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "Source [Local] - sync() skipped since there is nothing to sync";
    }

    @Override // ya.n
    public Object a(InterfaceC5380e interfaceC5380e) {
        Ba.a.b(new InterfaceC6824a() { // from class: ya.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return d.k();
            }
        });
        return J.f24997a;
    }

    @Override // ya.n
    public InterfaceC8439a.b b() {
        return this.f66628b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ya.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ya.d.b
            if (r0 == 0) goto L13
            r0 = r6
            ya.d$b r0 = (ya.d.b) r0
            int r1 = r0.f66631c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66631c = r1
            goto L18
        L13:
            ya.d$b r0 = new ya.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f66629a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f66631c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Yg.v.b(r6)
            ya.b r6 = new ya.b
            r6.<init>()
            Ba.a.b(r6)
            Ii.J r6 = Ii.C3048c0.b()
            ya.d$c r2 = new ya.d$c
            r4 = 0
            r2.<init>(r4)
            r0.f66631c = r3
            java.lang.Object r6 = Ii.AbstractC3059i.g(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            ya.c r6 = new ya.c
            r6.<init>()
            Ba.a.b(r6)
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.c(dh.e):java.lang.Object");
    }

    public void j(InterfaceC8439a.b bVar) {
        this.f66628b = bVar;
    }
}
