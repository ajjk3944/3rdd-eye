package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class Z extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58830c;

    static final class a extends xg.j {

        /* renamed from: e, reason: collision with root package name */
        final kg.n f58831e;

        a(Dj.b bVar, kg.n nVar) {
            super(bVar);
            this.f58831e = nVar;
        }

        @Override // Dj.b
        public void a() {
            this.f66089a.a();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f66092d++;
            this.f66089a.h(obj);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            try {
                Object objApply = this.f58831e.apply(th2);
                Objects.requireNonNull(objApply, "The valueSupplier returned a null value");
                d(objApply);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f66089a.onError(new CompositeException(th2, th3));
            }
        }
    }

    public Z(gg.i iVar, kg.n nVar) {
        super(iVar);
        this.f58830c = nVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58830c));
    }
}
