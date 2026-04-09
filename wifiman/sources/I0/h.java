package I0;

import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import org.snmp4j.mp.PduHandle;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f8432a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f8433b;

    /* renamed from: c, reason: collision with root package name */
    private float f8434c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8435a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8436b;

        /* renamed from: d, reason: collision with root package name */
        int f8438d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8436b = obj;
            this.f8438d |= PduHandle.NONE;
            return h.this.e(0.0f, this);
        }
    }

    public h(int i10, InterfaceC6839p interfaceC6839p) {
        this.f8432a = i10;
        this.f8433b = interfaceC6839p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof I0.h.a
            if (r0 == 0) goto L13
            r0 = r6
            I0.h$a r0 = (I0.h.a) r0
            int r1 = r0.f8438d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8438d = r1
            goto L18
        L13:
            I0.h$a r0 = new I0.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8436b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f8438d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f8435a
            I0.h r5 = (I0.h) r5
            Yg.v.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Yg.v.b(r6)
            mh.p r6 = r4.f8433b
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            r0.f8435a = r4
            r0.f8438d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f8434c
            float r0 = r0 + r6
            r5.f8434c = r0
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.h.e(float, dh.e):java.lang.Object");
    }

    public final float b() {
        return this.f8434c;
    }

    public final int c(int i10) {
        return AbstractC7978m.k(i10 - AbstractC7137b.e(this.f8434c), 0, this.f8432a);
    }

    public final void d() {
        this.f8434c = 0.0f;
    }

    public final Object f(int i10, int i11, InterfaceC5380e interfaceC5380e) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f8432a;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f8432a).toString());
        }
        float f10 = i10;
        float f11 = this.f8434c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return J.f24997a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public final Object g(float f10, InterfaceC5380e interfaceC5380e) {
        Object objE = e(f10 - this.f8434c, interfaceC5380e);
        return objE == AbstractC5467b.g() ? objE : J.f24997a;
    }
}
