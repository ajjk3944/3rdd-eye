package Ii;

import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* renamed from: Ii.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3053f {

    /* renamed from: Ii.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9315a;

        /* renamed from: b, reason: collision with root package name */
        int f9316b;

        /* renamed from: c, reason: collision with root package name */
        int f9317c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9318d;

        /* renamed from: e, reason: collision with root package name */
        int f9319e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9318d = obj;
            this.f9319e |= PduHandle.NONE;
            return AbstractC3053f.c(null, this);
        }
    }

    /* renamed from: Ii.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9320a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9321b;

        /* renamed from: c, reason: collision with root package name */
        int f9322c;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9321b = obj;
            this.f9322c |= PduHandle.NONE;
            return AbstractC3053f.b(null, this);
        }
    }

    public static final Object a(V[] vArr, InterfaceC5380e interfaceC5380e) {
        return vArr.length == 0 ? AbstractC3689v.l() : new C3051e(vArr).c(interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.Collection r4, dh.InterfaceC5380e r5) {
        /*
            boolean r0 = r5 instanceof Ii.AbstractC3053f.b
            if (r0 == 0) goto L13
            r0 = r5
            Ii.f$b r0 = (Ii.AbstractC3053f.b) r0
            int r1 = r0.f9322c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9322c = r1
            goto L18
        L13:
            Ii.f$b r0 = new Ii.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9321b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f9322c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f9320a
            java.util.Iterator r4 = (java.util.Iterator) r4
            Yg.v.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Yg.v.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            Ii.y0 r5 = (Ii.InterfaceC3091y0) r5
            r0.f9320a = r4
            r0.f9322c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            Yg.J r4 = Yg.J.f24997a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.AbstractC3053f.b(java.util.Collection, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Ii.InterfaceC3091y0[] r6, dh.InterfaceC5380e r7) {
        /*
            boolean r0 = r7 instanceof Ii.AbstractC3053f.a
            if (r0 == 0) goto L13
            r0 = r7
            Ii.f$a r0 = (Ii.AbstractC3053f.a) r0
            int r1 = r0.f9319e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9319e = r1
            goto L18
        L13:
            Ii.f$a r0 = new Ii.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9318d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f9319e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f9317c
            int r2 = r0.f9316b
            java.lang.Object r4 = r0.f9315a
            Ii.y0[] r4 = (Ii.InterfaceC3091y0[]) r4
            Yg.v.b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            Yg.v.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f9315a = r7
            r0.f9316b = r2
            r0.f9317c = r6
            r0.f9319e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ii.AbstractC3053f.c(Ii.y0[], dh.e):java.lang.Object");
    }
}
