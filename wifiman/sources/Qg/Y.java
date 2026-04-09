package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import yg.C8671f;

/* loaded from: classes4.dex */
public final class Y extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58824c;

    static final class a extends C8671f implements gg.l {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f58825i;

        /* renamed from: j, reason: collision with root package name */
        final kg.n f58826j;

        /* renamed from: k, reason: collision with root package name */
        boolean f58827k;

        /* renamed from: l, reason: collision with root package name */
        boolean f58828l;

        /* renamed from: m, reason: collision with root package name */
        long f58829m;

        a(Dj.b bVar, kg.n nVar) {
            super(false);
            this.f58825i = bVar;
            this.f58826j = nVar;
        }

        @Override // Dj.b
        public void a() {
            if (this.f58828l) {
                return;
            }
            this.f58828l = true;
            this.f58827k = true;
            this.f58825i.a();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f58828l) {
                return;
            }
            if (!this.f58827k) {
                this.f58829m++;
            }
            this.f58825i.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f58827k) {
                if (this.f58828l) {
                    Eg.a.v(th2);
                    return;
                } else {
                    this.f58825i.onError(th2);
                    return;
                }
            }
            this.f58827k = true;
            try {
                Object objApply = this.f58826j.apply(th2);
                Objects.requireNonNull(objApply, "The nextSupplier returned a null Publisher");
                Dj.a aVar = (Dj.a) objApply;
                long j10 = this.f58829m;
                if (j10 != 0) {
                    p(j10);
                }
                aVar.b(this);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f58825i.onError(new CompositeException(th2, th3));
            }
        }
    }

    public Y(gg.i iVar, kg.n nVar) {
        super(iVar);
        this.f58824c = nVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar, this.f58824c);
        bVar.j(aVar);
        this.f58857b.D1(aVar);
    }
}
