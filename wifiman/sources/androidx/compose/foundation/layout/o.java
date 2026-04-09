package androidx.compose.foundation.layout;

import Yg.J;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.N;
import z.P;

/* loaded from: classes.dex */
public abstract class o {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28157b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f28158c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f28159d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f28156a = f10;
            this.f28157b = f11;
            this.f28158c = f12;
            this.f28159d = f13;
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

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f28161b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f28160a = f10;
            this.f28161b = f11;
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

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f28162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f28162a = f10;
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

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f28163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(1);
            this.f28163a = n10;
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

    public static final N a(float f10) {
        return new P(f10, f10, f10, f10, null);
    }

    public static final N b(float f10, float f11) {
        return new P(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ N c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        return b(f10, f11);
    }

    public static final N d(float f10, float f11, float f12, float f13) {
        return new P(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ N e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Y0.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Y0.h.j(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(N n10, Y0.t tVar) {
        return tVar == Y0.t.Ltr ? n10.b(tVar) : n10.a(tVar);
    }

    public static final float g(N n10, Y0.t tVar) {
        return tVar == Y0.t.Ltr ? n10.a(tVar) : n10.b(tVar);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, N n10) {
        return eVar.b0(new PaddingValuesElement(n10, new d(n10)));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        return eVar.b0(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        return eVar.b0(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        return eVar.b0(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Y0.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Y0.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Y0.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Y0.h.j(0);
        }
        return l(eVar, f10, f11, f12, f13);
    }
}
