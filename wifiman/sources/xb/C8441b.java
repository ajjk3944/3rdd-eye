package xb;

import gg.AbstractC5912b;
import gg.g;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* renamed from: xb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8441b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f65545a;

    /* renamed from: xb.b$a */
    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable throwable) {
            AbstractC6492s.i(throwable, "throwable");
            if (!(throwable instanceof HttpException)) {
                return AbstractC5912b.D(throwable);
            }
            Throwable th2 = (Throwable) C8441b.this.f65545a.invoke(throwable);
            if (th2 != null) {
                throwable = th2;
            }
            return AbstractC5912b.D(throwable);
        }
    }

    public C8441b(InterfaceC6835l httpExceptionTransformer) {
        AbstractC6492s.i(httpExceptionTransformer, "httpExceptionTransformer");
        this.f65545a = httpExceptionTransformer;
    }

    @Override // gg.g
    public gg.f a(AbstractC5912b upstream) {
        AbstractC6492s.i(upstream, "upstream");
        AbstractC5912b abstractC5912bO = upstream.O(new a());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }
}
