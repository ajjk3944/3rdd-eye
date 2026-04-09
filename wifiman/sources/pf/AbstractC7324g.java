package pf;

import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;
import xe.InterfaceC8511f;

/* renamed from: pf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7324g {

    /* renamed from: pf.g$a */
    public static final class a implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f57904a;

        /* renamed from: pf.g$a$a, reason: collision with other inner class name */
        public static final class C2040a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f57905a;

            /* renamed from: pf.g$a$a$a, reason: collision with other inner class name */
            public static final class C2041a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f57906a;

                /* renamed from: b, reason: collision with root package name */
                int f57907b;

                public C2041a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57906a = obj;
                    this.f57907b |= PduHandle.NONE;
                    return C2040a.this.a(null, this);
                }
            }

            public C2040a(InterfaceC3221h interfaceC3221h) {
                this.f57905a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pf.AbstractC7324g.a.C2040a.C2041a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pf.g$a$a$a r0 = (pf.AbstractC7324g.a.C2040a.C2041a) r0
                    int r1 = r0.f57907b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f57907b = r1
                    goto L18
                L13:
                    pf.g$a$a$a r0 = new pf.g$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f57906a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f57907b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f57905a
                    boolean r2 = r5 instanceof pf.AbstractC7319b.a
                    if (r2 == 0) goto L43
                    r0.f57907b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pf.AbstractC7324g.a.C2040a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public a(InterfaceC3220g interfaceC3220g) {
            this.f57904a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f57904a.b(new C2040a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final pf.AbstractC7319b r10, T.InterfaceC3540l r11, final int r12, final int r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.AbstractC7324g.c(pf.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(InterfaceC8511f.b bVar) {
        bVar.a();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(AbstractC7319b abstractC7319b, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(abstractC7319b, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
