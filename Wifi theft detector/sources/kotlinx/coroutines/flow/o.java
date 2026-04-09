package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class o {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f22486a;

        public a(Object obj) {
            this.f22486a = obj;
        }

        @Override // kotlinx.coroutines.flow.b
        public Object collect(c cVar, c9.c cVar2) {
            Object objEmit = cVar.emit(this.f22486a, cVar2);
            return objEmit == kotlin.coroutines.intrinsics.a.f() ? objEmit : y8.s.f25199a;
        }
    }

    public static final b a(l9.p pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final b b(l9.p pVar) {
        return new kotlinx.coroutines.flow.a(pVar, null, 0, null, 14, null);
    }

    public static final b c(l9.p pVar) {
        return new w0(pVar);
    }

    public static final b d(Object obj) {
        return new a(obj);
    }
}
