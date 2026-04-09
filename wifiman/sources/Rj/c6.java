package rj;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class c6 implements uj.o {

    /* renamed from: a, reason: collision with root package name */
    public static final c6 f60607a = new c6();

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f60608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WeakReference weakReference) {
            super(0);
            this.f60608a = weakReference;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f60608a.get();
        }
    }

    private c6() {
    }

    @Override // uj.o
    public uj.p a(InterfaceC6824a creator) {
        AbstractC6492s.i(creator, "creator");
        Object objInvoke = creator.invoke();
        return new uj.p(objInvoke, new a(new WeakReference(objInvoke)));
    }
}
