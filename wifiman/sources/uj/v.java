package uj;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class v implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final v f63248a = new v();

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f63249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(0);
            this.f63249a = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return this.f63249a;
        }
    }

    private v() {
    }

    @Override // uj.o
    public p a(InterfaceC6824a creator) {
        AbstractC6492s.i(creator, "creator");
        Object objInvoke = creator.invoke();
        return new p(objInvoke, new a(objInvoke));
    }
}
