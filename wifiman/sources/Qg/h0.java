package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import qg.f0;
import yg.EnumC8669d;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59046c;

    static final class a extends f0.c {
        a(Dj.b bVar, Fg.b bVar2, Dj.c cVar) {
            super(bVar, bVar2, cVar);
        }

        @Override // Dj.b
        public void a() {
            this.f58985k.cancel();
            this.f58983i.a();
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            s(th2);
        }
    }

    public h0(gg.i iVar, kg.n nVar) {
        super(iVar);
        this.f59046c = nVar;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        Ig.a aVar = new Ig.a(bVar);
        Fg.b bVarH2 = Fg.e.k2(8).h2();
        try {
            Object objApply = this.f59046c.apply(bVarH2);
            Objects.requireNonNull(objApply, "handler returned a null Publisher");
            Dj.a aVar2 = (Dj.a) objApply;
            f0.b bVar2 = new f0.b(this.f58857b);
            a aVar3 = new a(aVar, bVarH2, bVar2);
            bVar2.f58982d = aVar3;
            bVar.j(aVar3);
            aVar2.b(bVar2);
            bVar2.h(0);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
