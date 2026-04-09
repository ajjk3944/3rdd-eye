package xb;

import gg.D;
import gg.E;
import gg.z;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* renamed from: xb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8443d implements E {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f65548a;

    /* renamed from: xb.d$a */
    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable throwable) {
            AbstractC6492s.i(throwable, "throwable");
            if (!(throwable instanceof HttpException)) {
                return z.p(throwable);
            }
            Throwable th2 = (Throwable) C8443d.this.f65548a.invoke(throwable);
            if (th2 != null) {
                throwable = th2;
            }
            return z.p(throwable);
        }
    }

    public C8443d(InterfaceC6835l httpExceptionTransformer) {
        AbstractC6492s.i(httpExceptionTransformer, "httpExceptionTransformer");
        this.f65548a = httpExceptionTransformer;
    }

    @Override // gg.E
    public D a(z upstream) {
        AbstractC6492s.i(upstream, "upstream");
        z zVarF = upstream.F(new a());
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
