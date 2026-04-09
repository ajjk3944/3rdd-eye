package A6;

import H6.C0675l;
import K6.C0745n;
import N7.C1175g0;
import N7.C1397vb;
import b9.C1992A;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: TimerController.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C1397vb f75a;

    /* renamed from: b, reason: collision with root package name */
    public final C0745n f76b;

    /* renamed from: c, reason: collision with root package name */
    public final Q6.c f77c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.d f78d;

    /* renamed from: e, reason: collision with root package name */
    public C0675l f79e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80f;

    /* renamed from: g, reason: collision with root package name */
    public final List<C1175g0> f81g;

    /* renamed from: h, reason: collision with root package name */
    public final List<C1175g0> f82h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final A6.e f83j;

    /* compiled from: TimerController.kt */
    public static final class a extends m implements p9.l<Long, C1992A> {
        public a() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Long l5) {
            l5.longValue();
            l.a(l.this);
            return C1992A.f18074a;
        }
    }

    /* compiled from: TimerController.kt */
    public static final class b extends m implements p9.l<Long, C1992A> {
        public b() {
            super(1);
        }

        @Override // p9.l
        public final C1992A invoke(Long l5) {
            l5.longValue();
            l.a(l.this);
            return C1992A.f18074a;
        }
    }

    /* compiled from: TimerController.kt */
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements p9.l<Long, C1992A> {
        @Override // p9.l
        public final C1992A invoke(Long l5) {
            ((l) this.receiver).b(l5.longValue());
            return C1992A.f18074a;
        }
    }

    /* compiled from: TimerController.kt */
    public /* synthetic */ class d extends kotlin.jvm.internal.k implements p9.l<Long, C1992A> {
        @Override // p9.l
        public final C1992A invoke(Long l5) {
            ((l) this.receiver).b(l5.longValue());
            return C1992A.f18074a;
        }
    }

    /* compiled from: TimerController.kt */
    public /* synthetic */ class e extends kotlin.jvm.internal.k implements p9.l<Long, C1992A> {
        @Override // p9.l
        public final C1992A invoke(Long l5) {
            long jLongValue = l5.longValue();
            l lVar = (l) this.receiver;
            lVar.b(jLongValue);
            C0675l c0675l = lVar.f79e;
            if (c0675l != null) {
                lVar.f76b.d(c0675l, c0675l.getExpressionResolver(), lVar.f81g, "timer", null);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: TimerController.kt */
    public /* synthetic */ class f extends kotlin.jvm.internal.k implements p9.l<Long, C1992A> {
        @Override // p9.l
        public final C1992A invoke(Long l5) {
            long jLongValue = l5.longValue();
            l lVar = (l) this.receiver;
            lVar.b(jLongValue);
            C0675l c0675l = lVar.f79e;
            if (c0675l != null) {
                lVar.f76b.d(c0675l, c0675l.getExpressionResolver(), lVar.f82h, "timer", null);
            }
            return C1992A.f18074a;
        }
    }

    public l(C1397vb divTimer, C0745n c0745n, Q6.c cVar, A7.d dVar) {
        kotlin.jvm.internal.l.f(divTimer, "divTimer");
        this.f75a = divTimer;
        this.f76b = c0745n;
        this.f77c = cVar;
        this.f78d = dVar;
        String str = divTimer.f9641c;
        this.f80f = divTimer.f9644f;
        this.f81g = divTimer.f9640b;
        this.f82h = divTimer.f9642d;
        this.f83j = new A6.e(str, new c(1, this, l.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new d(1, this, l.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new e(1, this, l.class, "onEnd", "onEnd(J)V", 0), new f(1, this, l.class, "onTick", "onTick(J)V", 0), cVar);
        divTimer.f9639a.e(dVar, new a());
        A7.b<Long> bVar = divTimer.f9643e;
        if (bVar != null) {
            bVar.e(dVar, new b());
        }
    }

    public static final void a(l lVar) {
        C1397vb c1397vb = lVar.f75a;
        A7.b<Long> bVar = c1397vb.f9639a;
        A7.d dVar = lVar.f78d;
        long jLongValue = bVar.a(dVar).longValue();
        A7.b<Long> bVar2 = c1397vb.f9643e;
        Long lA = bVar2 != null ? bVar2.a(dVar) : null;
        A6.e eVar = lVar.f83j;
        eVar.f54h = lA;
        eVar.f53g = jLongValue != 0 ? Long.valueOf(jLongValue) : null;
    }

    public final void b(long j4) {
        C0675l c0675l;
        String str = this.f80f;
        if (str == null || (c0675l = this.f79e) == null) {
            return;
        }
        c0675l.G(str, String.valueOf(j4));
    }
}
