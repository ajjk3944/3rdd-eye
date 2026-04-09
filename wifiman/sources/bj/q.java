package bj;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Zi.E f33455a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33456b;

    /* synthetic */ class a extends C6490p implements InterfaceC6839p {
        a(Object obj) {
            super(2, obj, q.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(Xi.f p02, int i10) {
            AbstractC6492s.i(p02, "p0");
            return Boolean.valueOf(((q) this.receiver).e(p02, i10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Xi.f) obj, ((Number) obj2).intValue());
        }
    }

    public q(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        this.f33455a = new Zi.E(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(Xi.f fVar, int i10) {
        boolean z10 = !fVar.j(i10) && fVar.i(i10).c();
        this.f33456b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f33456b;
    }

    public final void c(int i10) {
        this.f33455a.a(i10);
    }

    public final int d() {
        return this.f33455a.d();
    }
}
