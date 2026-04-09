package Q;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;
import r.C7531h;
import r.C7548x;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3423a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f18723a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f18724b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f18725c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f18726d;

    /* renamed from: e, reason: collision with root package name */
    private static final C7548x f18727e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f18728f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f18729g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f18730h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f18731i;

    /* renamed from: Q.a$a, reason: collision with other inner class name */
    static final class C0664a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f18732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f18733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18734c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0664a(float f10, float f11, float f12) {
            super(0);
            this.f18732a = f10;
            this.f18733b = f11;
            this.f18734c = f12;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke() {
            return new A(this.f18732a, this.f18733b, this.f18734c);
        }
    }

    /* renamed from: Q.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f18735a;

        /* renamed from: b, reason: collision with root package name */
        Object f18736b;

        /* renamed from: c, reason: collision with root package name */
        Object f18737c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f18738d;

        /* renamed from: e, reason: collision with root package name */
        int f18739e;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18738d = obj;
            this.f18739e |= PduHandle.NONE;
            return AbstractC3423a.c(null, 0.0f, null, null, this);
        }
    }

    /* renamed from: Q.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f18740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f18741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f18742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K k10, A a10, K k11) {
            super(1);
            this.f18740a = k10;
            this.f18741b = a10;
            this.f18742c = k11;
        }

        public final void a(C7531h c7531h) {
            float fFloatValue = ((Number) c7531h.e()).floatValue() - this.f18740a.f51686a;
            float fD = this.f18741b.d();
            this.f18741b.g(fD + fFloatValue);
            float fAbs = Math.abs(fD - this.f18741b.d());
            this.f18740a.f51686a = ((Number) c7531h.e()).floatValue();
            this.f18742c.f51686a = ((Number) c7531h.f()).floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                c7531h.a();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return J.f24997a;
        }
    }

    /* renamed from: Q.a$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f18743a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(A a10) {
            super(1);
            this.f18743a = a10;
        }

        public final void a(C7531h c7531h) {
            this.f18743a.g(((Number) c7531h.e()).floatValue());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7531h) obj);
            return J.f24997a;
        }
    }

    static {
        float f10 = 16;
        float f11 = 12;
        float fJ = Y0.h.j(Y0.h.j(f10) - Y0.h.j(f11));
        f18723a = fJ;
        float fJ2 = Y0.h.j(Y0.h.j(f10) - Y0.h.j(f11));
        f18724b = fJ2;
        f18725c = Y0.h.j(Y0.h.j(f10) - fJ);
        f18726d = Y0.h.j(Y0.h.j(f11) - fJ2);
        f18727e = new C7548x(0.8f, 0.0f, 0.8f, 0.15f);
        f18728f = Y0.h.j(24);
        f18729g = Y0.h.j(28);
        float fJ3 = Y0.h.j(4);
        f18730h = fJ3;
        f18731i = Y0.h.j(Y0.h.j(f10) - fJ3);
    }

    public static final A b(float f10, float f11, float f12, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = -3.4028235E38f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1801969826, i10, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kA = A.f18716d.a();
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.g(f10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.g(f11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.g(f12)) || (i10 & 384) == 256);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C0664a(f10, f11, f12);
            interfaceC3540l.K(objF);
        }
        A a10 = (A) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Q.A r22, float r23, r.InterfaceC7550z r24, r.InterfaceC7533i r25, dh.InterfaceC5380e r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC3423a.c(Q.A, float, r.z, r.i, dh.e):java.lang.Object");
    }
}
