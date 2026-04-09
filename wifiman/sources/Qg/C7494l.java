package qg;

import ig.AbstractC6152a;
import java.util.Collection;
import java.util.Objects;
import yg.EnumC8669d;
import zg.AbstractC8755h;

/* renamed from: qg.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7494l extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59118c;

    /* renamed from: d, reason: collision with root package name */
    final kg.q f59119d;

    /* renamed from: qg.l$a */
    static final class a extends xg.b {

        /* renamed from: f, reason: collision with root package name */
        final Collection f59120f;

        /* renamed from: g, reason: collision with root package name */
        final kg.n f59121g;

        a(Dj.b bVar, kg.n nVar, Collection collection) {
            super(bVar);
            this.f59121g = nVar;
            this.f59120f = collection;
        }

        @Override // xg.b, Dj.b
        public void a() {
            if (this.f66076d) {
                return;
            }
            this.f66076d = true;
            this.f59120f.clear();
            this.f66073a.a();
        }

        @Override // xg.b, Dg.g
        public void clear() {
            this.f59120f.clear();
            super.clear();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f66076d) {
                return;
            }
            if (this.f66077e != 0) {
                this.f66073a.h(null);
                return;
            }
            try {
                Object objApply = this.f59121g.apply(obj);
                Objects.requireNonNull(objApply, "The keySelector returned a null key");
                if (this.f59120f.add(objApply)) {
                    this.f66073a.h(obj);
                } else {
                    this.f66074b.request(1L);
                }
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // xg.b, Dj.b
        public void onError(Throwable th2) {
            if (this.f66076d) {
                Eg.a.v(th2);
                return;
            }
            this.f66076d = true;
            this.f59120f.clear();
            this.f66073a.onError(th2);
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll;
            while (true) {
                objPoll = this.f66075c.poll();
                if (objPoll == null) {
                    break;
                }
                Collection collection = this.f59120f;
                Object objApply = this.f59121g.apply(objPoll);
                Objects.requireNonNull(objApply, "The keySelector returned a null key");
                if (collection.add(objApply)) {
                    break;
                }
                if (this.f66077e == 2) {
                    this.f66074b.request(1L);
                }
            }
            return objPoll;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    public C7494l(gg.i iVar, kg.n nVar, kg.q qVar) {
        super(iVar);
        this.f59118c = nVar;
        this.f59119d = qVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        try {
            this.f58857b.D1(new a(bVar, this.f59118c, (Collection) AbstractC8755h.c(this.f59119d.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
