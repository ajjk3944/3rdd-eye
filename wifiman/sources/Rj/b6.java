package rj;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class b6 implements uj.o {

    /* renamed from: a, reason: collision with root package name */
    public static final b6 f60605a = new b6();

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SoftReference f60606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SoftReference softReference) {
            super(0);
            this.f60606a = softReference;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f60606a.get();
        }
    }

    private b6() {
    }

    @Override // uj.o
    public uj.p a(InterfaceC6824a creator) {
        AbstractC6492s.i(creator, "creator");
        Object objInvoke = creator.invoke();
        return new uj.p(objInvoke, new a(new SoftReference(objInvoke)));
    }
}
