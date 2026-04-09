package I0;

import C0.AbstractC2538s;
import I0.d;
import Ii.O;
import J0.p;
import T.InterfaceC3551q0;
import T.t1;
import Y0.q;
import Yg.J;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import ch.AbstractC4260a;
import dh.InterfaceC5384i;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC6475a;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import m0.b1;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class l implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f8439a = t1.d(Boolean.FALSE, null, 2, null);

    /* synthetic */ class a extends AbstractC6475a implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj, V.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(m mVar) {
            ((V.b) this.f51704a).b(mVar);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8440a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(m mVar) {
            return Integer.valueOf(mVar.b());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8441a = new c();

        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable invoke(m mVar) {
            return Integer.valueOf(mVar.d().e());
        }
    }

    private final void e(boolean z10) {
        this.f8439a.setValue(Boolean.valueOf(z10));
    }

    @Override // I0.d.a
    public void a() {
        e(true);
    }

    @Override // I0.d.a
    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f8439a.getValue()).booleanValue();
    }

    public final void d(View view, p pVar, InterfaceC5384i interfaceC5384i, Consumer<ScrollCaptureTarget> consumer) {
        V.b bVar = new V.b(new m[16], 0);
        n.e(pVar.a(), 0, new a(bVar), 2, null);
        bVar.F(AbstractC4260a.c(b.f8440a, c.f8441a));
        m mVar = (m) (bVar.s() ? null : bVar.m()[bVar.o() - 1]);
        if (mVar == null) {
            return;
        }
        d dVar = new d(mVar.c(), mVar.d(), O.a(interfaceC5384i), this);
        C6533i c6533iB = AbstractC2538s.b(mVar.a());
        long jI = mVar.d().i();
        ScrollCaptureTarget scrollCaptureTargetA = k.a(view, b1.a(q.b(c6533iB)), new Point(Y0.n.h(jI), Y0.n.i(jI)), i.a(dVar));
        scrollCaptureTargetA.setScrollBounds(b1.a(mVar.d()));
        consumer.accept(scrollCaptureTargetA);
    }
}
