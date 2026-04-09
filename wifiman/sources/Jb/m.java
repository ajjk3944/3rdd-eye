package jb;

import aj.AbstractC3868b;
import db.C5339a;
import gg.z;
import java.util.concurrent.Callable;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import lb.UnifiCloudAccess;
import mh.InterfaceC6824a;
import ub.C8156c;

/* loaded from: classes3.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.f f50218a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f50219b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f50220c;

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f50222a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifiCloudAccess apply(String it) {
            AbstractC6492s.i(it, "it");
            AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
            abstractC3868bD.a();
            return (UnifiCloudAccess) abstractC3868bD.b(UnifiCloudAccess.INSTANCE.serializer(), it);
        }
    }

    public m(final C5339a configClient, Gb.f ucoreStorage) {
        AbstractC6492s.i(configClient, "configClient");
        AbstractC6492s.i(ucoreStorage, "ucoreStorage");
        this.f50218a = ucoreStorage;
        this.f50219b = Yg.n.b(new InterfaceC6824a() { // from class: jb.k
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return m.h(configClient, this);
            }
        });
        this.f50220c = Yg.n.b(new InterfaceC6824a() { // from class: jb.l
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return m.g(this.f50217a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(UnifiCloudAccess oVar) {
        Gb.f fVar = this.f50218a;
        AbstractC3868b abstractC3868bD = C8156c.f62925a.d();
        abstractC3868bD.a();
        fVar.t(abstractC3868bD.c(UnifiCloudAccess.INSTANCE.serializer(), oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z g(m mVar) {
        z zVarO = gg.n.r(mVar.k(), mVar.i()).o0().O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.n h(C5339a c5339a, m mVar) {
        z zVarO = c5339a.a().o(new InterfaceC6469f() { // from class: jb.m.a
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(UnifiCloudAccess p02) {
                AbstractC6492s.i(p02, "p0");
                m.this.f(p02);
            }
        });
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        gg.n nVarX = vb.d.a(zVarO).X();
        AbstractC6492s.h(nVarX, "toMaybe(...)");
        return nVarX;
    }

    private final gg.n i() {
        gg.n nVarP = gg.n.m(new Callable() { // from class: jb.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.j(this.f50214a);
            }
        }).p(b.f50222a);
        AbstractC6492s.h(nVarP, "map(...)");
        return nVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(m mVar) {
        return mVar.f50218a.e();
    }

    private final gg.n k() {
        return (gg.n) this.f50219b.getValue();
    }

    @Override // jb.i
    public z e() {
        return (z) this.f50220c.getValue();
    }
}
