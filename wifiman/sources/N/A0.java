package N;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import Y0.h;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import mh.InterfaceC6824a;
import s.InterfaceC7834G;
import s.InterfaceC7836I;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f13518a = AbstractC3561w.f(b.f13526a);

    /* renamed from: b, reason: collision with root package name */
    private static final T.H0 f13519b = AbstractC3561w.d(null, a.f13525a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    private static final B0 f13520c;

    /* renamed from: d, reason: collision with root package name */
    private static final B0 f13521d;

    /* renamed from: e, reason: collision with root package name */
    private static final P.g f13522e;

    /* renamed from: f, reason: collision with root package name */
    private static final P.g f13523f;

    /* renamed from: g, reason: collision with root package name */
    private static final P.g f13524g;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13525a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3356y0 invoke() {
            return new C3356y0(0L, null, 3, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13526a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.a aVar = Y0.h.f24523b;
        float fC = aVar.c();
        C6733v0.a aVar2 = C6733v0.f52951b;
        f13520c = new B0(true, fC, aVar2.e(), (DefaultConstructorMarker) null);
        f13521d = new B0(false, aVar.c(), aVar2.e(), (DefaultConstructorMarker) null);
        f13522e = new P.g(0.16f, 0.24f, 0.08f, 0.24f);
        f13523f = new P.g(0.08f, 0.12f, 0.04f, 0.12f);
        f13524g = new P.g(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final T.H0 d() {
        return f13519b;
    }

    public static final InterfaceC7836I e(boolean z10, float f10, long j10) {
        return (Y0.h.n(f10, Y0.h.f24523b.c()) && C6733v0.m(j10, C6733v0.f52951b.e())) ? z10 ? f13520c : f13521d : new B0(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InterfaceC7836I f(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Y0.h.f24523b.c();
        }
        if ((i10 & 4) != 0) {
            j10 = C6733v0.f52951b.e();
        }
        return e(z10, f10, j10);
    }

    public static final InterfaceC7834G g(boolean z10, float f10, long j10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC7834G interfaceC7834GE;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            f10 = Y0.h.f24523b.c();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = C6733v0.f52951b.e();
        }
        long j11 = j10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-58830494, i10, -1, "androidx.compose.material.rippleOrFallbackImplementation (Ripple.kt:264)");
        }
        if (((Boolean) interfaceC3540l.t(f13518a)).booleanValue()) {
            interfaceC3540l.U(96412190);
            interfaceC7834GE = P.p.f(z11, f11, j11, interfaceC3540l, i10 & 1022, 0);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(96503175);
            interfaceC3540l.J();
            interfaceC7834GE = e(z11, f11, j11);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC7834GE;
    }
}
