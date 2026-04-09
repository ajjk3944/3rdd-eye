package vb;

import gg.D;
import gg.E;
import gg.z;
import java.util.concurrent.Semaphore;
import kg.InterfaceC6469f;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: vb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8207c implements E {

    /* renamed from: a, reason: collision with root package name */
    private z f63539a;

    /* renamed from: b, reason: collision with root package name */
    private final Semaphore f63540b = new Semaphore(1);

    /* renamed from: vb.c$a */
    static final class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            C8207c.this.f63539a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D d(C8207c c8207c, z zVar) {
        c8207c.f63540b.acquireUninterruptibly();
        if (c8207c.f63539a != null) {
            c8207c.f63540b.release();
            return c8207c.f63539a;
        }
        z zVarE = zVar.m(c8207c.new a()).e();
        c8207c.f63539a = zVarE;
        c8207c.f63540b.release();
        return zVarE;
    }

    @Override // gg.E
    public D a(final z upstream) {
        AbstractC6492s.i(upstream, "upstream");
        z zVarJ = z.j(new q() { // from class: vb.b
            @Override // kg.q
            public final Object get() {
                return C8207c.d(this.f63537a, upstream);
            }
        });
        AbstractC6492s.h(zVarJ, "defer(...)");
        return zVarJ;
    }
}
