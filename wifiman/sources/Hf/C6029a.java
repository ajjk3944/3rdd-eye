package hf;

import N.AbstractC3309a0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6029a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6029a f48641a = new C6029a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f48642b = b0.c.c(-1417992201, false, C1804a.f48644a);

    /* renamed from: c, reason: collision with root package name */
    public static mh.q f48643c = b0.c.c(871484216, false, b.f48645a);

    /* renamed from: hf.a$a, reason: collision with other inner class name */
    static final class C1804a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1804a f48644a = new C1804a();

        C1804a() {
        }

        public final void a(String it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1417992201, i10, -1, "com.ui.wifiman.ui.speedtest.component.ComposableSingletons$NetworkSpeedStringKt.lambda-1.<anonymous> (NetworkSpeedString.kt:180)");
            }
            AbstractC3309a0.a(AbstractC8049c.i(Pe.a.f18599a.N(), interfaceC3540l, 6), AbstractC7930a.b(new d.b(AbstractC6780c.f53577s3), interfaceC3540l, 0), androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), AbstractC5822c.a(EnumC5820a.DOWN, interfaceC3540l, 6), interfaceC3540l, 384, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: hf.a$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f48645a = new b();

        b() {
        }

        public final void a(String it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(871484216, i10, -1, "com.ui.wifiman.ui.speedtest.component.ComposableSingletons$NetworkSpeedStringKt.lambda-2.<anonymous> (NetworkSpeedString.kt:191)");
            }
            AbstractC3309a0.a(AbstractC8049c.i(Pe.a.f18599a.O(), interfaceC3540l, 6), AbstractC7930a.b(new d.b(AbstractC6780c.f53584t3), interfaceC3540l, 0), androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), AbstractC5822c.a(EnumC5820a.UP, interfaceC3540l, 6), interfaceC3540l, 384, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public final mh.q a() {
        return f48642b;
    }

    public final mh.q b() {
        return f48643c;
    }
}
