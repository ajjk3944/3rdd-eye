package b2;

import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import d2.g;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4059d {

    /* renamed from: a, reason: collision with root package name */
    private final Q f32796a;

    /* renamed from: b, reason: collision with root package name */
    private final P.c f32797b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4056a f32798c;

    public C4059d(Q store, P.c factory, AbstractC4056a extras) {
        AbstractC6492s.i(store, "store");
        AbstractC6492s.i(factory, "factory");
        AbstractC6492s.i(extras, "extras");
        this.f32796a = store;
        this.f32797b = factory;
        this.f32798c = extras;
    }

    public static /* synthetic */ N b(C4059d c4059d, th.d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = g.f45727a.c(dVar);
        }
        return c4059d.a(dVar, str);
    }

    public final N a(th.d modelClass, String key) {
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(key, "key");
        N nB = this.f32796a.b(key);
        if (!modelClass.J(nB)) {
            C4057b c4057b = new C4057b(this.f32798c);
            c4057b.c(g.a.f45728a, key);
            N nA = AbstractC4060e.a(this.f32797b, modelClass, c4057b);
            this.f32796a.d(key, nA);
            return nA;
        }
        Object obj = this.f32797b;
        if (obj instanceof P.e) {
            AbstractC6492s.f(nB);
            ((P.e) obj).d(nB);
        }
        AbstractC6492s.g(nB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return nB;
    }
}
