package eh;

import Yg.v;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5468c {

    /* renamed from: eh.c$a */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f46422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f46423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5380e interfaceC5380e, InterfaceC6835l interfaceC6835l) {
            super(interfaceC5380e);
            this.f46423b = interfaceC6835l;
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f46422a;
            if (i10 == 0) {
                this.f46422a = 1;
                v.b(obj);
                AbstractC6492s.g(this.f46423b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC6835l) V.f(this.f46423b, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f46422a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* renamed from: eh.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f46424a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f46425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i, InterfaceC6835l interfaceC6835l) {
            super(interfaceC5380e, interfaceC5384i);
            this.f46425b = interfaceC6835l;
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f46424a;
            if (i10 == 0) {
                this.f46424a = 1;
                v.b(obj);
                AbstractC6492s.g(this.f46425b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC6835l) V.f(this.f46425b, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f46424a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* renamed from: eh.c$c, reason: collision with other inner class name */
    public static final class C1749c extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f46426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f46427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f46428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1749c(InterfaceC5380e interfaceC5380e, InterfaceC6839p interfaceC6839p, Object obj) {
            super(interfaceC5380e);
            this.f46427b = interfaceC6839p;
            this.f46428c = obj;
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f46426a;
            if (i10 == 0) {
                this.f46426a = 1;
                v.b(obj);
                AbstractC6492s.g(this.f46427b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC6839p) V.f(this.f46427b, 2)).invoke(this.f46428c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f46426a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* renamed from: eh.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f46429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f46430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f46431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, Object obj) {
            super(interfaceC5380e, interfaceC5384i);
            this.f46430b = interfaceC6839p;
            this.f46431c = obj;
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f46429a;
            if (i10 == 0) {
                this.f46429a = 1;
                v.b(obj);
                AbstractC6492s.g(this.f46430b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC6839p) V.f(this.f46430b, 2)).invoke(this.f46431c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f46429a = 2;
            v.b(obj);
            return obj;
        }
    }

    /* renamed from: eh.c$e */
    public static final class e extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            v.b(obj);
            return obj;
        }
    }

    /* renamed from: eh.c$f */
    public static final class f extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i) {
            super(interfaceC5380e, interfaceC5384i);
            AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            v.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5380e a(InterfaceC6835l interfaceC6835l, InterfaceC5380e completion) {
        AbstractC6492s.i(interfaceC6835l, "<this>");
        AbstractC6492s.i(completion, "completion");
        InterfaceC5380e<?> interfaceC5380eA = h.a(completion);
        if (interfaceC6835l instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) interfaceC6835l).create(interfaceC5380eA);
        }
        InterfaceC5384i context = interfaceC5380eA.getContext();
        return context == C5385j.f46088a ? new a(interfaceC5380eA, interfaceC6835l) : new b(interfaceC5380eA, context, interfaceC6835l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5380e b(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e completion) {
        AbstractC6492s.i(interfaceC6839p, "<this>");
        AbstractC6492s.i(completion, "completion");
        InterfaceC5380e<?> interfaceC5380eA = h.a(completion);
        if (interfaceC6839p instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) interfaceC6839p).create(obj, interfaceC5380eA);
        }
        InterfaceC5384i context = interfaceC5380eA.getContext();
        return context == C5385j.f46088a ? new C1749c(interfaceC5380eA, interfaceC6839p, obj) : new d(interfaceC5380eA, context, interfaceC6839p, obj);
    }

    private static final InterfaceC5380e c(InterfaceC5380e interfaceC5380e) {
        InterfaceC5384i context = interfaceC5380e.getContext();
        return context == C5385j.f46088a ? new e(interfaceC5380e) : new f(interfaceC5380e, context);
    }

    public static InterfaceC5380e d(InterfaceC5380e interfaceC5380e) {
        InterfaceC5380e<Object> interfaceC5380eIntercepted;
        AbstractC6492s.i(interfaceC5380e, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = interfaceC5380e instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) interfaceC5380e : null;
        return (dVar == null || (interfaceC5380eIntercepted = dVar.intercepted()) == null) ? interfaceC5380e : interfaceC5380eIntercepted;
    }

    public static Object e(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e completion) {
        AbstractC6492s.i(interfaceC6839p, "<this>");
        AbstractC6492s.i(completion, "completion");
        return ((InterfaceC6839p) V.f(interfaceC6839p, 2)).invoke(obj, c(h.a(completion)));
    }

    public static Object f(q qVar, Object obj, Object obj2, InterfaceC5380e completion) {
        AbstractC6492s.i(qVar, "<this>");
        AbstractC6492s.i(completion, "completion");
        return ((q) V.f(qVar, 3)).s(obj, obj2, c(h.a(completion)));
    }
}
