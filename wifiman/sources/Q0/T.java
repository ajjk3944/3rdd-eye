package Q0;

import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private final T0.r f19014a = T0.q.a();

    /* renamed from: b, reason: collision with root package name */
    private final P0.b f19015b = new P0.b(16);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f19017b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S s10) {
            super(1);
            this.f19017b = s10;
        }

        public final void a(U u10) {
            T0.r rVarB = T.this.b();
            T t10 = T.this;
            S s10 = this.f19017b;
            synchronized (rVarB) {
                try {
                    if (u10.h()) {
                        t10.f19015b.e(s10, u10);
                    } else {
                        t10.f19015b.f(s10);
                    }
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U) obj);
            return Yg.J.f24997a;
        }
    }

    public final T0.r b() {
        return this.f19014a;
    }

    public final z1 c(S s10, InterfaceC6835l interfaceC6835l) {
        synchronized (this.f19014a) {
            U u10 = (U) this.f19015b.d(s10);
            if (u10 != null) {
                if (u10.h()) {
                    return u10;
                }
            }
            try {
                U u11 = (U) interfaceC6835l.invoke(new a(s10));
                synchronized (this.f19014a) {
                    try {
                        if (this.f19015b.d(s10) == null && u11.h()) {
                            this.f19015b.e(s10, u11);
                        }
                        Yg.J j10 = Yg.J.f24997a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return u11;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
