package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import yg.C8670e;
import yg.EnumC8669d;

/* loaded from: classes4.dex */
public abstract class i0 {

    static final class a extends gg.i {

        /* renamed from: b, reason: collision with root package name */
        final Object f59064b;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f59065c;

        a(Object obj, kg.n nVar) {
            this.f59064b = obj;
            this.f59065c = nVar;
        }

        @Override // gg.i
        public void E1(Dj.b bVar) {
            try {
                Object objApply = this.f59065c.apply(this.f59064b);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                Dj.a aVar = (Dj.a) objApply;
                if (!(aVar instanceof kg.q)) {
                    aVar.b(bVar);
                    return;
                }
                try {
                    Object obj = ((kg.q) aVar).get();
                    if (obj == null) {
                        EnumC8669d.complete(bVar);
                    } else {
                        bVar.j(new C8670e(bVar, obj));
                    }
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    EnumC8669d.error(th2, bVar);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                EnumC8669d.error(th3, bVar);
            }
        }
    }

    public static gg.i a(Object obj, kg.n nVar) {
        return Eg.a.o(new a(obj, nVar));
    }

    public static boolean b(Dj.a aVar, Dj.b bVar, kg.n nVar) {
        if (!(aVar instanceof kg.q)) {
            return false;
        }
        try {
            Object obj = ((kg.q) aVar).get();
            if (obj == null) {
                EnumC8669d.complete(bVar);
                return true;
            }
            try {
                Object objApply = nVar.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                Dj.a aVar2 = (Dj.a) objApply;
                if (aVar2 instanceof kg.q) {
                    try {
                        Object obj2 = ((kg.q) aVar2).get();
                        if (obj2 == null) {
                            EnumC8669d.complete(bVar);
                            return true;
                        }
                        bVar.j(new C8670e(bVar, obj2));
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        EnumC8669d.error(th2, bVar);
                        return true;
                    }
                } else {
                    aVar2.b(bVar);
                }
                return true;
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                EnumC8669d.error(th3, bVar);
                return true;
            }
        } catch (Throwable th4) {
            AbstractC6152a.b(th4);
            EnumC8669d.error(th4, bVar);
            return true;
        }
    }
}
