package K6;

import A7.b;
import H6.C0672i;
import N7.B8;
import N7.C9;
import N7.S2;
import N7.W4;
import b9.C1992A;
import java.util.ArrayList;
import java.util.List;
import z6.C5865d;

/* compiled from: DivLayoutProviderVariablesHolder.kt */
/* loaded from: classes.dex */
public final class Q0 extends i7.i<C1992A> implements i7.k {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3313b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3314c = new ArrayList();

    /* compiled from: DivLayoutProviderVariablesHolder.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Long, C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b.c<?, Long> f3316h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.c<?, Long> cVar) {
            super(1);
            this.f3316h = cVar;
        }

        @Override // p9.l
        public final C1992A invoke(Long l5) {
            l5.longValue();
            Q0.this.f3313b.addAll(this.f3316h.f().c());
            return C1992A.f18074a;
        }
    }

    @Override // i7.k
    public final /* synthetic */ void b(j6.d dVar) {
        B8.c(this, dVar);
    }

    @Override // i7.i
    public final C1992A d(C0672i context, N7.Z data, C5865d path) {
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(path, "path");
        S2 s2D = data.d();
        C9 width = s2D.getWidth();
        A7.d dVar = context.f2147b;
        j(width, dVar);
        j(s2D.getHeight(), dVar);
        return C1992A.f18074a;
    }

    @Override // i7.k
    public final List<j6.d> getSubscriptions() {
        return this.f3314c;
    }

    @Override // i7.k
    public final /* synthetic */ void h() throws Exception {
        B8.d(this);
    }

    public final void j(C9 c92, A7.d dVar) {
        Object objC = c92.c();
        W4 w42 = objC instanceof W4 ? (W4) objC : null;
        if (w42 == null) {
            return;
        }
        A7.b<Long> bVar = w42.f7613b;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar == null) {
            return;
        }
        B8.c(this, cVar.d(dVar, new a(cVar)));
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
    }
}
