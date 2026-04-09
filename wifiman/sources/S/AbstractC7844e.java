package s;

import androidx.compose.foundation.BorderModifierNodeElement;
import j0.C6233d;
import j0.C6237h;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6525a;
import l0.AbstractC6526b;
import l0.C6531g;
import l0.C6535k;
import m0.AbstractC6688Y;
import m0.AbstractC6713l0;
import m0.U0;
import m0.Y0;
import m0.i1;
import m0.j1;
import mh.InterfaceC6835l;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7844e {

    /* renamed from: s.e$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60739a = new a();

        a() {
            super(1);
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.e$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f60740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f60741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f60742c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC7040g f60743d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC6713l0 abstractC6713l0, long j10, long j11, AbstractC7040g abstractC7040g) {
            super(1);
            this.f60740a = abstractC6713l0;
            this.f60741b = j10;
            this.f60742c = j11;
            this.f60743d = abstractC7040g;
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
            InterfaceC7039f.l0(interfaceC7036c, this.f60740a, this.f60741b, this.f60742c, 0.0f, this.f60743d, null, 0, 104, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, C7846g c7846g, i1 i1Var) {
        return g(eVar, c7846g.b(), c7846g.a(), i1Var);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, long j10, i1 i1Var) {
        return g(eVar, f10, new j1(j10, null), i1Var);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var) {
        return eVar.b0(new BorderModifierNodeElement(f10, abstractC6713l0, i1Var, null));
    }

    private static final C6535k h(float f10, C6535k c6535k) {
        return new C6535k(f10, f10, c6535k.j() - f10, c6535k.d() - f10, l(c6535k.h(), f10), l(c6535k.i(), f10), l(c6535k.c(), f10), l(c6535k.b(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 i(U0 u02, C6535k c6535k, float f10, boolean z10) {
        u02.a();
        U0.t(u02, c6535k, null, 2, null);
        if (!z10) {
            U0 u0A = AbstractC6688Y.a();
            U0.t(u0A, h(f10, c6535k), null, 2, null);
            u02.k(u02, u0A, Y0.f52866a.a());
        }
        return u02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6237h j(C6233d c6233d) {
        return c6233d.p(a.f60739a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6237h k(C6233d c6233d, AbstractC6713l0 abstractC6713l0, long j10, long j11, boolean z10, float f10) {
        return c6233d.p(new b(abstractC6713l0, z10 ? C6531g.f52335b.c() : j10, z10 ? c6233d.c() : j11, z10 ? C7043j.f55038a : new C7044k(f10, 0.0f, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10, float f10) {
        return AbstractC6526b.a(Math.max(0.0f, AbstractC6525a.d(j10) - f10), Math.max(0.0f, AbstractC6525a.e(j10) - f10));
    }
}
