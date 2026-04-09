package C;

import Yg.J;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import org.snmp4j.mp.PduHandle;
import w.InterfaceC8236C;

/* loaded from: classes.dex */
final class E implements w.n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8236C f1926a;

    /* renamed from: b, reason: collision with root package name */
    private final C f1927b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f1928a;

        /* renamed from: c, reason: collision with root package name */
        int f1930c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1928a = obj;
            this.f1930c |= PduHandle.NONE;
            return E.this.a(null, 0.0f, this);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.v f1932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w.v vVar) {
            super(1);
            this.f1932b = vVar;
        }

        public final void a(float f10) {
            E.this.d().k0(this.f1932b, AbstractC7137b.e(E.this.d().H() != 0 ? f10 / E.this.d().H() : 0.0f) + E.this.d().v());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return J.f24997a;
        }
    }

    public E(InterfaceC8236C interfaceC8236C, C c10) {
        this.f1926a = interfaceC8236C;
        this.f1927b = c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(w.v r5, float r6, dh.InterfaceC5380e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof C.E.a
            if (r0 == 0) goto L13
            r0 = r7
            C.E$a r0 = (C.E.a) r0
            int r1 = r0.f1930c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1930c = r1
            goto L18
        L13:
            C.E$a r0 = new C.E$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1928a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f1930c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yg.v.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Yg.v.b(r7)
            w.C r7 = r4.f1926a
            C.E$b r2 = new C.E$b
            r2.<init>(r5)
            r0.f1930c = r3
            java.lang.Object r7 = r7.c(r5, r6, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C.E.a(w.v, float, dh.e):java.lang.Object");
    }

    public final C d() {
        return this.f1927b;
    }
}
