package x;

import Yg.J;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;
import r.C7531h;
import r.InterfaceC7533i;
import r.InterfaceC7550z;
import sh.AbstractC7978m;
import w.InterfaceC8236C;
import w.v;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8407h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f65275a = Y0.h.j(400);

    /* renamed from: x.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        float f65276a;

        /* renamed from: b, reason: collision with root package name */
        Object f65277b;

        /* renamed from: c, reason: collision with root package name */
        Object f65278c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f65279d;

        /* renamed from: e, reason: collision with root package name */
        int f65280e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65279d = obj;
            this.f65280e |= PduHandle.NONE;
            return AbstractC8407h.f(null, 0.0f, null, null, null, this);
        }
    }

    /* renamed from: x.h$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f65281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f65282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f65283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f65284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, K k10, v vVar, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f65281a = f10;
            this.f65282b = k10;
            this.f65283c = vVar;
            this.f65284d = interfaceC6835l;
        }

        public final void a(C7531h c7531h) {
            if (Math.abs(((Number) c7531h.e()).floatValue()) < Math.abs(this.f65281a)) {
                AbstractC8407h.g(c7531h, this.f65283c, this.f65284d, ((Number) c7531h.e()).floatValue() - this.f65282b.f51686a);
                this.f65282b.f51686a = ((Number) c7531h.e()).floatValue();
                return;
            }
            float fJ = AbstractC8407h.j(((Number) c7531h.e()).floatValue(), this.f65281a);
            AbstractC8407h.g(c7531h, this.f65283c, this.f65284d, fJ - this.f65282b.f51686a);
            c7531h.a();
            this.f65282b.f51686a = fJ;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return J.f24997a;
        }
    }

    /* renamed from: x.h$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        float f65285a;

        /* renamed from: b, reason: collision with root package name */
        float f65286b;

        /* renamed from: c, reason: collision with root package name */
        Object f65287c;

        /* renamed from: d, reason: collision with root package name */
        Object f65288d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f65289e;

        /* renamed from: f, reason: collision with root package name */
        int f65290f;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65289e = obj;
            this.f65290f |= PduHandle.NONE;
            return AbstractC8407h.h(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* renamed from: x.h$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f65291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f65292b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f65293c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f65294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, K k10, v vVar, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f65291a = f10;
            this.f65292b = k10;
            this.f65293c = vVar;
            this.f65294d = interfaceC6835l;
        }

        public final void a(C7531h c7531h) {
            float fJ = AbstractC8407h.j(((Number) c7531h.e()).floatValue(), this.f65291a);
            float f10 = fJ - this.f65292b.f51686a;
            float fA = this.f65293c.a(f10);
            this.f65294d.invoke(Float.valueOf(fA));
            if (Math.abs(f10 - fA) > 0.5f || fJ != ((Number) c7531h.e()).floatValue()) {
                c7531h.a();
            }
            this.f65292b.f51686a += fA;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(w.v r5, float r6, r.C7536k r7, r.InterfaceC7550z r8, mh.InterfaceC6835l r9, dh.InterfaceC5380e r10) {
        /*
            boolean r0 = r10 instanceof x.AbstractC8407h.a
            if (r0 == 0) goto L13
            r0 = r10
            x.h$a r0 = (x.AbstractC8407h.a) r0
            int r1 = r0.f65280e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65280e = r1
            goto L18
        L13:
            x.h$a r0 = new x.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f65279d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f65280e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.f65276a
            java.lang.Object r5 = r0.f65278c
            kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
            java.lang.Object r7 = r0.f65277b
            r.k r7 = (r.C7536k) r7
            Yg.v.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Yg.v.b(r10)
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            java.lang.Object r2 = r7.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            x.h$b r4 = new x.h$b
            r4.<init>(r6, r10, r5, r9)
            r0.f65277b = r7
            r0.f65278c = r10
            r0.f65276a = r6
            r0.f65280e = r3
            java.lang.Object r5 = r.m0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            x.a r8 = new x.a
            float r5 = r5.f51686a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC8407h.f(w.v, float, r.k, r.z, mh.l, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C7531h c7531h, v vVar, InterfaceC6835l interfaceC6835l, float f10) {
        float fA = vVar.a(f10);
        interfaceC6835l.invoke(Float.valueOf(fA));
        if (Math.abs(f10 - fA) > 0.5f) {
            c7531h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(w.v r12, float r13, float r14, r.C7536k r15, r.InterfaceC7533i r16, mh.InterfaceC6835l r17, dh.InterfaceC5380e r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof x.AbstractC8407h.c
            if (r1 == 0) goto L16
            r1 = r0
            x.h$c r1 = (x.AbstractC8407h.c) r1
            int r2 = r1.f65290f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f65290f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            x.h$c r1 = new x.h$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f65289e
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r7.f65290f
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.f65286b
            float r2 = r7.f65285a
            java.lang.Object r3 = r7.f65288d
            kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
            java.lang.Object r4 = r7.f65287c
            r.k r4 = (r.C7536k) r4
            Yg.v.b(r0)
            r10 = r2
            r0 = r4
            goto L90
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            Yg.v.b(r0)
            kotlin.jvm.internal.K r0 = new kotlin.jvm.internal.K
            r0.<init>()
            java.lang.Object r2 = r15.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.c(r13)
            java.lang.Object r2 = r15.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r5 = r2 ^ 1
            x.h$d r6 = new x.h$d
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.f65287c = r9
            r7.f65288d = r0
            r10 = r13
            r7.f65285a = r10
            r7.f65286b = r8
            r7.f65290f = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = r.m0.i(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r3 = r0
            r1 = r8
            r0 = r9
        L90:
            java.lang.Object r2 = r0.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = j(r2, r1)
            x.a r11 = new x.a
            float r1 = r3.f51686a
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.c(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r.k r0 = r.AbstractC7537l.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC8407h.h(w.v, float, float, r.k, r.i, mh.l, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(v vVar, float f10, float f11, InterfaceC8401b interfaceC8401b, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return interfaceC8401b.a(vVar, kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), interfaceC6835l, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC7978m.f(f10, f11) : AbstractC7978m.c(f10, f11);
    }

    public static final float k() {
        return f65275a;
    }

    public static final InterfaceC8236C l(InterfaceC8408i interfaceC8408i, InterfaceC7550z interfaceC7550z, InterfaceC7533i interfaceC7533i) {
        return new C8406g(interfaceC8408i, interfaceC7550z, interfaceC7533i);
    }
}
