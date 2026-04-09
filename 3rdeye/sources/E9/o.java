package E9;

import A9.C0572d0;
import D9.InterfaceC0645g;
import E9.p;
import b9.C1992A;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import y9.C5828j;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class o<T> extends h9.c implements InterfaceC0645g<T> {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0645g<T> f1564l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC4350h f1565m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1566n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC4350h f1567o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC4347e<? super C1992A> f1568p;

    /* compiled from: SafeCollector.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.p<Integer, InterfaceC4350h.a, Integer> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f1569g = new a(2);

        @Override // p9.p
        public final Integer invoke(Integer num, InterfaceC4350h.a aVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(InterfaceC0645g<? super T> interfaceC0645g, InterfaceC4350h interfaceC4350h) {
        super(m.f1562b, C4351i.f37871b);
        this.f1564l = interfaceC0645g;
        this.f1565m = interfaceC4350h;
        this.f1566n = ((Number) interfaceC4350h.fold(0, a.f1569g)).intValue();
    }

    public final Object b(InterfaceC4347e<? super C1992A> interfaceC4347e, T t10) {
        InterfaceC4350h context = interfaceC4347e.getContext();
        C0572d0.c(context);
        InterfaceC4350h interfaceC4350h = this.f1567o;
        if (interfaceC4350h != context) {
            if (interfaceC4350h instanceof k) {
                throw new IllegalStateException(C5828j.L("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((k) interfaceC4350h).f1560b + ", but then emission attempt of value '" + t10 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new q(this))).intValue() != this.f1566n) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1565m + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1567o = context;
        }
        this.f1568p = interfaceC4347e;
        p.a aVar = p.f1570a;
        InterfaceC0645g<T> interfaceC0645g = this.f1564l;
        kotlin.jvm.internal.l.d(interfaceC0645g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        aVar.getClass();
        Object objEmit = interfaceC0645g.emit(t10, this);
        if (!kotlin.jvm.internal.l.b(objEmit, g9.a.COROUTINE_SUSPENDED)) {
            this.f1568p = null;
        }
        return objEmit;
    }

    @Override // D9.InterfaceC0645g
    public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        try {
            Object objB = b(interfaceC4347e, t10);
            return objB == g9.a.COROUTINE_SUSPENDED ? objB : C1992A.f18074a;
        } catch (Throwable th) {
            this.f1567o = new k(interfaceC4347e.getContext(), th);
            throw th;
        }
    }

    @Override // h9.AbstractC4424a, h9.d
    public final h9.d getCallerFrame() {
        InterfaceC4347e<? super C1992A> interfaceC4347e = this.f1568p;
        if (interfaceC4347e instanceof h9.d) {
            return (h9.d) interfaceC4347e;
        }
        return null;
    }

    @Override // h9.c, f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        InterfaceC4350h interfaceC4350h = this.f1567o;
        return interfaceC4350h == null ? C4351i.f37871b : interfaceC4350h;
    }

    @Override // h9.AbstractC4424a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = b9.m.a(obj);
        if (thA != null) {
            this.f1567o = new k(getContext(), thA);
        }
        InterfaceC4347e<? super C1992A> interfaceC4347e = this.f1568p;
        if (interfaceC4347e != null) {
            interfaceC4347e.resumeWith(obj);
        }
        return g9.a.COROUTINE_SUSPENDED;
    }
}
