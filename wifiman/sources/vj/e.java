package vj;

import Yg.m;
import Yg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.AbstractC7726l2;

/* loaded from: classes3.dex */
public class e implements DI {

    /* renamed from: c, reason: collision with root package name */
    public static final a f63666c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f63667a;

    /* renamed from: b, reason: collision with root package name */
    private final m f63668b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(boolean z10, InterfaceC6835l interfaceC6835l) {
            f fVar = new f(z10);
            interfaceC6835l.invoke(fVar);
            return fVar;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            if (e.this.f63667a.e() == null) {
                return e.this.f63667a;
            }
            throw new IllegalStateException("DI has not been initialized");
        }
    }

    public e(d _container) {
        AbstractC6492s.i(_container, "_container");
        this.f63667a = _container;
        this.f63668b = n.b(new b());
    }

    @Override // org.kodein.di.c
    public org.kodein.di.f I() {
        return DI.d.b(this);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return DI.d.a(this);
    }

    @Override // org.kodein.di.c
    public AbstractC7726l2 i() {
        DI.d.c(this);
        return null;
    }

    @Override // org.kodein.di.DI
    public final org.kodein.di.e y() {
        return (org.kodein.di.e) this.f63668b.getValue();
    }

    private e(f fVar, boolean z10) {
        this(new d(fVar.h(), fVar.i(), fVar.k(), fVar.j(), z10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, InterfaceC6835l init) {
        this(f63666c.b(z10, init), true);
        AbstractC6492s.i(init, "init");
    }
}
