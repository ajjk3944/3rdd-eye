package sa;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import sa.h;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes3.dex */
public final class g implements c<Object, b<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f46203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f46204b;

    public g(Type type, Executor executor) {
        this.f46203a = type;
        this.f46204b = executor;
    }

    @Override // sa.c
    public final Type a() {
        return this.f46203a;
    }

    @Override // sa.c
    public final Object b(m mVar) {
        Executor executor = this.f46204b;
        return executor == null ? mVar : new h.a(executor, mVar);
    }
}
