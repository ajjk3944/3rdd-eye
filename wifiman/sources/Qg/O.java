package qg;

import java.util.Objects;
import xg.AbstractC8532a;

/* loaded from: classes4.dex */
public final class O extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58750c;

    static final class a extends AbstractC8532a {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f58751f;

        a(Dg.a aVar, kg.n nVar) {
            super(aVar);
            this.f58751f = nVar;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f66071d) {
                return;
            }
            if (this.f66072e != 0) {
                this.f66068a.h(null);
                return;
            }
            try {
                Object objApply = this.f58751f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f66068a.h(objApply);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            if (this.f66071d) {
                return true;
            }
            if (this.f66072e != 0) {
                this.f66068a.m(null);
                return true;
            }
            try {
                Object objApply = this.f58751f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return this.f66068a.m(objApply);
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f66070c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f58751f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    static final class b extends xg.b {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f58752f;

        b(Dj.b bVar, kg.n nVar) {
            super(bVar);
            this.f58752f = nVar;
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
                Object objApply = this.f58752f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f66073a.h(objApply);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f66075c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f58752f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    public O(gg.i iVar, kg.n nVar) {
        super(iVar);
        this.f58750c = nVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new a((Dg.a) bVar, this.f58750c));
        } else {
            this.f58857b.D1(new b(bVar, this.f58750c));
        }
    }
}
