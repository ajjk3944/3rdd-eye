package u6;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class d {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f62703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f62704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f62705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6824a interfaceC6824a, c cVar, Object obj) {
            super(0);
            this.f62703a = interfaceC6824a;
            this.f62704b = cVar;
            this.f62705c = obj;
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            Object objInvoke = this.f62703a.invoke();
            this.f62704b.e(this.f62705c, objInvoke);
            return objInvoke;
        }
    }

    public static final Object a(c cVar, Object key, InterfaceC6824a block) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(block, "block");
        return cVar.p(key) ? cVar.q(key) : block.invoke();
    }

    public static final Object b(c cVar, Object key, InterfaceC6824a block) {
        AbstractC6492s.i(cVar, "<this>");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(block, "block");
        return a(cVar, key, new a(block, cVar, key));
    }
}
