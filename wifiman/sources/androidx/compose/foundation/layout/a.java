package androidx.compose.foundation.layout;

import C0.AbstractC2521a;
import C0.AbstractC2522b;
import C0.B;
import C0.C2533m;
import C0.D;
import Y0.h;
import Yg.J;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    static final class C1048a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2521a f28092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28094c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28095d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28096e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28097f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f28098g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1048a(AbstractC2521a abstractC2521a, float f10, int i10, int i11, int i12, androidx.compose.ui.layout.t tVar, int i13) {
            super(1);
            this.f28092a = abstractC2521a;
            this.f28093b = f10;
            this.f28094c = i10;
            this.f28095d = i11;
            this.f28096e = i12;
            this.f28097f = tVar;
            this.f28098g = i13;
        }

        public final void a(t.a aVar) {
            int iI0;
            if (a.d(this.f28092a)) {
                iI0 = 0;
            } else {
                iI0 = !Y0.h.n(this.f28093b, Y0.h.f24523b.c()) ? this.f28094c : (this.f28095d - this.f28096e) - this.f28097f.I0();
            }
            t.a.l(aVar, this.f28097f, iI0, a.d(this.f28092a) ? !Y0.h.n(this.f28093b, Y0.h.f24523b.c()) ? this.f28094c : (this.f28098g - this.f28096e) - this.f28097f.C0() : 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2521a f28099a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28100b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f28101c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2521a abstractC2521a, float f10, float f11) {
            super(1);
            this.f28099a = abstractC2521a;
            this.f28100b = f10;
            this.f28101c = f11;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D c(androidx.compose.ui.layout.m mVar, AbstractC2521a abstractC2521a, float f10, float f11, B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(d(abstractC2521a) ? Y0.b.d(j10, 0, 0, 0, 0, 11, null) : Y0.b.d(j10, 0, 0, 0, 0, 14, null));
        int iX = tVarT.X(abstractC2521a);
        if (iX == Integer.MIN_VALUE) {
            iX = 0;
        }
        int iC0 = d(abstractC2521a) ? tVarT.C0() : tVarT.I0();
        int iK = d(abstractC2521a) ? Y0.b.k(j10) : Y0.b.l(j10);
        h.a aVar = Y0.h.f24523b;
        int i10 = iK - iC0;
        int iK2 = AbstractC7978m.k((!Y0.h.n(f10, aVar.c()) ? mVar.x1(f10) : 0) - iX, 0, i10);
        int iK3 = AbstractC7978m.k(((!Y0.h.n(f11, aVar.c()) ? mVar.x1(f11) : 0) - iC0) + iX, 0, i10 - iK2);
        int iI0 = d(abstractC2521a) ? tVarT.I0() : Math.max(tVarT.I0() + iK2 + iK3, Y0.b.n(j10));
        int iMax = d(abstractC2521a) ? Math.max(tVarT.C0() + iK2 + iK3, Y0.b.m(j10)) : tVarT.C0();
        return androidx.compose.ui.layout.m.x0(mVar, iI0, iMax, null, new C1048a(abstractC2521a, f10, iK2, iI0, iK3, tVarT, iMax), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AbstractC2521a abstractC2521a) {
        return abstractC2521a instanceof C2533m;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, AbstractC2521a abstractC2521a, float f10, float f11) {
        return eVar.b0(new AlignmentLineOffsetDpElement(abstractC2521a, f10, f11, AbstractC3964z0.b() ? new b(abstractC2521a, f10, f11) : AbstractC3964z0.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, AbstractC2521a abstractC2521a, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = Y0.h.f24523b.c();
        }
        if ((i10 & 4) != 0) {
            f11 = Y0.h.f24523b.c();
        }
        return e(eVar, abstractC2521a, f10, f11);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, float f11) {
        h.a aVar = Y0.h.f24523b;
        return eVar.b0(!Y0.h.n(f10, aVar.c()) ? f(androidx.compose.ui.e.f28771b0, AbstractC2522b.a(), f10, 0.0f, 4, null) : androidx.compose.ui.e.f28771b0).b0(!Y0.h.n(f11, aVar.c()) ? f(androidx.compose.ui.e.f28771b0, AbstractC2522b.b(), 0.0f, f11, 2, null) : androidx.compose.ui.e.f28771b0);
    }
}
