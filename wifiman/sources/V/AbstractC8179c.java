package v;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import v.i;
import w.o;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8179c {

    /* renamed from: v.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f63277a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63278b;

        /* renamed from: c, reason: collision with root package name */
        int f63279c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63278b = obj;
            this.f63279c |= PduHandle.NONE;
            return AbstractC8179c.b(null, this);
        }
    }

    /* renamed from: v.c$b */
    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63280a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f63281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f63282c;

        /* renamed from: v.c$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f63283a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f63283a = iVar;
            }

            public final void a(long j10) {
                this.f63283a.b(new i.a.b(j10, null));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6531g) obj).v());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63282c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f63282c, interfaceC5380e);
            bVar.f63281b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63280a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f63281b;
                a aVar = new a(this.f63282c);
                this.f63280a = 1;
                if (AbstractC8179c.d(interfaceC8567G, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: v.c$c, reason: collision with other inner class name */
    static final class C2242c extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        int f63284b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f63285c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63286d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2242c(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63286d = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C2242c c2242c = new C2242c(this.f63286d, interfaceC5380e);
            c2242c.f63285c = obj;
            return c2242c;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r7.f63284b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yg.v.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f63285c
                y0.b r1 = (y0.InterfaceC8581b) r1
                Yg.v.b(r8)
                goto L35
            L22:
                Yg.v.b(r8)
                java.lang.Object r8 = r7.f63285c
                r1 = r8
                y0.b r1 = (y0.InterfaceC8581b) r1
                r7.f63285c = r1
                r7.f63284b = r3
                java.lang.Object r8 = v.AbstractC8179c.a(r1, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                y0.y r8 = (y0.C8604y) r8
                r8.a()
                mh.l r4 = r7.f63286d
                long r5 = r8.h()
                l0.g r8 = l0.C6531g.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f63285c = r8
                r7.f63284b = r2
                java.lang.Object r8 = w.AbstractC8235B.m(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
                return r0
            L53:
                y0.y r8 = (y0.C8604y) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                Yg.J r8 = Yg.J.f24997a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: v.AbstractC8179c.C2242c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
            return ((C2242c) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y0.InterfaceC8581b r8, dh.InterfaceC5380e r9) {
        /*
            boolean r0 = r9 instanceof v.AbstractC8179c.a
            if (r0 == 0) goto L13
            r0 = r9
            v.c$a r0 = (v.AbstractC8179c.a) r0
            int r1 = r0.f63279c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63279c = r1
            goto L18
        L13:
            v.c$a r0 = new v.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f63278b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f63279c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f63277a
            y0.b r8 = (y0.InterfaceC8581b) r8
            Yg.v.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Yg.v.b(r9)
        L38:
            r0.f63277a = r8
            r0.f63279c = r3
            r9 = 0
            java.lang.Object r9 = y0.InterfaceC8581b.s1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            y0.n r9 = (y0.C8593n) r9
            int r2 = r9.b()
            boolean r2 = y0.AbstractC8597r.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            y0.y r7 = (y0.C8604y) r7
            boolean r7 = y0.AbstractC8594o.a(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v.AbstractC8179c.b(y0.b, dh.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, i iVar) {
        return AbstractC8576P.d(eVar, C8180d.f63287a, new b(iVar, null));
    }

    public static final Object d(InterfaceC8567G interfaceC8567G, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Object objD = o.d(interfaceC8567G, new C2242c(interfaceC6835l, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : J.f24997a;
    }
}
