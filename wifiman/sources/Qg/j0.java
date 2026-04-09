package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import kg.InterfaceC6465b;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class j0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6465b f59083c;

    static final class a implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59084a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6465b f59085b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59086c;

        /* renamed from: d, reason: collision with root package name */
        Object f59087d;

        /* renamed from: e, reason: collision with root package name */
        boolean f59088e;

        a(Dj.b bVar, InterfaceC6465b interfaceC6465b) {
            this.f59084a = bVar;
            this.f59085b = interfaceC6465b;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59088e) {
                return;
            }
            this.f59088e = true;
            this.f59084a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59086c.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59088e) {
                return;
            }
            Dj.b bVar = this.f59084a;
            Object obj2 = this.f59087d;
            if (obj2 == null) {
                this.f59087d = obj;
                bVar.h(obj);
                return;
            }
            try {
                Object objApply = this.f59085b.apply(obj2, obj);
                Objects.requireNonNull(objApply, "The value returned by the accumulator is null");
                this.f59087d = objApply;
                bVar.h(objApply);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59086c.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59086c, cVar)) {
                this.f59086c = cVar;
                this.f59084a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59088e) {
                Eg.a.v(th2);
            } else {
                this.f59088e = true;
                this.f59084a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f59086c.request(j10);
        }
    }

    public j0(gg.i iVar, InterfaceC6465b interfaceC6465b) {
        super(iVar);
        this.f59083c = interfaceC6465b;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59083c));
    }
}
