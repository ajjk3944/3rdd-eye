package jj;

import T.InterfaceC3551q0;
import T.t1;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import org.snmp4j.mp.PduHandle;
import r.C7517a;
import r.u0;

/* loaded from: classes4.dex */
public final class j implements InterfaceC6350b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f50993d = C7517a.f59558m;

    /* renamed from: a, reason: collision with root package name */
    private final float f50994a;

    /* renamed from: b, reason: collision with root package name */
    private final C7517a f50995b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f50996c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f50997a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f50998b;

        /* renamed from: d, reason: collision with root package name */
        int f51000d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50998b = obj;
            this.f51000d |= PduHandle.NONE;
            return j.this.b(null, 0L, this);
        }
    }

    public j(float f10) {
        this.f50994a = f10;
        C6531g.a aVar = C6531g.f52335b;
        this.f50995b = new C7517a(C6531g.d(aVar.c()), u0.h(aVar), null, 4, null);
        this.f50996c = t1.d(null, null, 2, null);
    }

    private void c(d dVar) {
        this.f50996c.setValue(dVar);
    }

    @Override // jj.InterfaceC6350b
    public long a() {
        return ((C6531g) this.f50995b.m()).v();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // jj.InterfaceC6350b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(jj.d r11, long r12, dh.InterfaceC5380e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof jj.j.a
            if (r0 == 0) goto L14
            r0 = r14
            jj.j$a r0 = (jj.j.a) r0
            int r1 = r0.f51000d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f51000d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            jj.j$a r0 = new jj.j$a
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f50998b
            java.lang.Object r0 = eh.AbstractC5467b.g()
            int r1 = r6.f51000d
            r9 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r11 = r6.f50997a
            jj.j r11 = (jj.j) r11
            Yg.v.b(r14)
            goto L87
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r6.f50997a
            jj.j r11 = (jj.j) r11
            Yg.v.b(r14)
            goto L5b
        L43:
            Yg.v.b(r14)
            r10.c(r11)
            r.a r11 = r10.f50995b
            l0.g r12 = l0.C6531g.d(r12)
            r6.f50997a = r10
            r6.f51000d = r3
            java.lang.Object r11 = r11.t(r12, r6)
            if (r11 != r0) goto L5a
            return r0
        L5a:
            r11 = r10
        L5b:
            r.a r1 = r11.f50995b
            l0.g$a r12 = l0.C6531g.f52335b
            long r13 = r12.c()
            l0.g r13 = l0.C6531g.d(r13)
            float r14 = r11.f50994a
            long r4 = r.I0.e(r12)
            l0.g r12 = l0.C6531g.d(r4)
            r4 = 0
            r.h0 r3 = r.AbstractC7535j.j(r4, r14, r12, r3, r9)
            r6.f50997a = r11
            r6.f51000d = r2
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r2 = r13
            java.lang.Object r12 = r.C7517a.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L87
            return r0
        L87:
            r11.c(r9)
            Yg.J r11 = Yg.J.f24997a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.j.b(jj.d, long, dh.e):java.lang.Object");
    }

    @Override // jj.InterfaceC6350b
    public d getPosition() {
        return (d) this.f50996c.getValue();
    }

    public /* synthetic */ j(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 400.0f : f10);
    }
}
