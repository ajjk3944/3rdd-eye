package kotlinx.coroutines.selects;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.r0;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public final class OnTimeout {

    /* renamed from: a, reason: collision with root package name */
    public final long f22628a;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f22629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnTimeout f22630b;

        public a(h hVar, OnTimeout onTimeout) {
            this.f22629a = hVar;
            this.f22630b = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22629a.h(this.f22630b, s.f25199a);
        }
    }

    public OnTimeout(long j10) {
        this.f22628a = j10;
    }

    public final c b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f22631a;
        p.c(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new d(this, (q) x.b(onTimeout$selectClause$1, 3), null, 4, null);
    }

    public final void c(h hVar, Object obj) {
        if (this.f22628a <= 0) {
            hVar.e(s.f25199a);
            return;
        }
        a aVar = new a(hVar, this);
        p.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kotlin.coroutines.d context = hVar.getContext();
        hVar.g(r0.c(context).e(this.f22628a, aVar, context));
    }
}
