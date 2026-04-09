package xb;

import gg.D;
import gg.E;
import gg.z;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: xb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8445f implements E {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8440a f65552a;

    /* renamed from: xb.f$a */
    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable throwable) {
            AbstractC6492s.i(throwable, "throwable");
            return z.p(C8445f.this.f65552a.a(throwable));
        }
    }

    public C8445f(InterfaceC8440a exceptionMapper) {
        AbstractC6492s.i(exceptionMapper, "exceptionMapper");
        this.f65552a = exceptionMapper;
    }

    @Override // gg.E
    public D a(z upstream) {
        AbstractC6492s.i(upstream, "upstream");
        z zVarF = upstream.F(new a());
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
