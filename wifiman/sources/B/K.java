package B;

import B.InterfaceC2440d;
import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import o.C7006E;
import sh.C7974i;

/* loaded from: classes.dex */
public final class K implements androidx.compose.foundation.lazy.layout.c {

    /* renamed from: b, reason: collision with root package name */
    private final o.K f905b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f906c;

    /* renamed from: d, reason: collision with root package name */
    private final int f907d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f908a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7006E f910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K f911d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, C7006E c7006e, K k10) {
            super(1);
            this.f908a = i10;
            this.f909b = i11;
            this.f910c = c7006e;
            this.f911d = k10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(B.InterfaceC2440d.a r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                B.o$a r0 = (B.AbstractC2451o.a) r0
                mh.l r0 = r0.getKey()
                int r1 = r6.f908a
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f909b
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = B.I.a(r1)
            L3d:
                o.E r4 = r6.f910c
                r4.r(r3, r1)
                B.K r4 = r6.f911d
                java.lang.Object[] r4 = B.K.a(r4)
                B.K r5 = r6.f911d
                int r5 = B.K.d(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B.K.a.a(B.d$a):void");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2440d.a) obj);
            return Yg.J.f24997a;
        }
    }

    public K(C7974i c7974i, AbstractC2451o abstractC2451o) {
        InterfaceC2440d interfaceC2440dC = abstractC2451o.c();
        int i10 = c7974i.i();
        if (i10 < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(c7974i.j(), interfaceC2440dC.a() - 1);
        if (iMin < i10) {
            this.f905b = o.L.a();
            this.f906c = new Object[0];
            this.f907d = 0;
        } else {
            int i11 = (iMin - i10) + 1;
            this.f906c = new Object[i11];
            this.f907d = i10;
            C7006E c7006e = new C7006E(i11);
            interfaceC2440dC.b(i10, iMin, new a(i10, iMin, c7006e, this));
            this.f905b = c7006e;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public Object b(int i10) {
        Object[] objArr = this.f906c;
        int i11 = i10 - this.f907d;
        if (i11 < 0 || i11 > AbstractC3682n.g0(objArr)) {
            return null;
        }
        return objArr[i11];
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int c(Object obj) {
        o.K k10 = this.f905b;
        int iA = k10.a(obj);
        if (iA >= 0) {
            return k10.f54906c[iA];
        }
        return -1;
    }
}
