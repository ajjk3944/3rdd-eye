package qg;

import java.util.NoSuchElementException;
import yg.AbstractC8668c;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class l0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final Object f59122c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f59123d;

    static final class a extends AbstractC8668c implements gg.l {

        /* renamed from: c, reason: collision with root package name */
        final Object f59124c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f59125d;

        /* renamed from: e, reason: collision with root package name */
        Dj.c f59126e;

        /* renamed from: f, reason: collision with root package name */
        boolean f59127f;

        a(Dj.b bVar, Object obj, boolean z10) {
            super(bVar);
            this.f59124c = obj;
            this.f59125d = z10;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59127f) {
                return;
            }
            this.f59127f = true;
            Object obj = this.f66767b;
            this.f66767b = null;
            if (obj == null) {
                obj = this.f59124c;
            }
            if (obj != null) {
                d(obj);
            } else if (this.f59125d) {
                this.f66766a.onError(new NoSuchElementException());
            } else {
                this.f66766a.a();
            }
        }

        @Override // yg.AbstractC8668c, Dj.c
        public void cancel() {
            super.cancel();
            this.f59126e.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59127f) {
                return;
            }
            if (this.f66767b == null) {
                this.f66767b = obj;
                return;
            }
            this.f59127f = true;
            this.f59126e.cancel();
            this.f66766a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59126e, cVar)) {
                this.f59126e = cVar;
                this.f66766a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59127f) {
                Eg.a.v(th2);
            } else {
                this.f59127f = true;
                this.f66766a.onError(th2);
            }
        }
    }

    public l0(gg.i iVar, Object obj, boolean z10) {
        super(iVar);
        this.f59122c = obj;
        this.f59123d = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59122c, this.f59123d));
    }
}
