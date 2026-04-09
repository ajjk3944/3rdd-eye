package tg;

import java.util.Objects;
import og.AbstractC7131a;

/* loaded from: classes4.dex */
public final class M extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62169b;

    static final class a extends AbstractC7131a {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f62170f;

        a(gg.x xVar, kg.n nVar) {
            super(xVar);
            this.f62170f = nVar;
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f55682d) {
                return;
            }
            if (this.f55683e != 0) {
                this.f55679a.h(null);
                return;
            }
            try {
                Object objApply = this.f62170f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f55679a.h(objApply);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f55681c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f62170f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return f(i10);
        }
    }

    public M(gg.v vVar, kg.n nVar) {
        super(vVar);
        this.f62169b = nVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62169b));
    }
}
