package y1;

import A9.C0575f;
import A9.C0580h0;
import A9.C0597q;
import A9.E;
import A9.G;
import A9.InterfaceC0584j0;
import b9.C1992A;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;

/* compiled from: RunBlockingUninterruptible.android.kt */
/* loaded from: classes.dex */
public final class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RunBlockingUninterruptible.android.kt */
    @h9.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends h9.i implements p9.p<E, InterfaceC4347e<? super T>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f47999l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h9.i f48000m;

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @h9.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: y1.q$a$a, reason: collision with other inner class name */
        public static final class C0555a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f48001l;

            /* renamed from: m, reason: collision with root package name */
            public /* synthetic */ Object f48002m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ C0597q f48003n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ h9.i f48004o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0555a(C0597q c0597q, p9.p pVar, InterfaceC4347e interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f48003n = c0597q;
                this.f48004o = (h9.i) pVar;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [h9.i, p9.p] */
            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0555a c0555a = new C0555a(this.f48003n, this.f48004o, interfaceC4347e);
                c0555a.f48002m = obj;
                return c0555a;
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((C0555a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
            /* JADX WARN: Type inference failed for: r3v0, types: [h9.i, p9.p] */
            @Override // h9.AbstractC4424a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    g9.a r0 = g9.a.COROUTINE_SUSPENDED
                    int r1 = r4.f48001l
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r4.f48002m
                    A9.p r0 = (A9.InterfaceC0595p) r0
                    b9.n.b(r5)     // Catch: java.lang.Throwable -> L11
                    goto L39
                L11:
                    r5 = move-exception
                    goto L35
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    b9.n.b(r5)
                    java.lang.Object r5 = r4.f48002m
                    A9.E r5 = (A9.E) r5
                    A9.q r1 = r4.f48003n
                    h9.i r3 = r4.f48004o
                    r4.f48002m = r1     // Catch: java.lang.Throwable -> L33
                    r4.f48001l = r2     // Catch: java.lang.Throwable -> L33
                    java.lang.Object r5 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L33
                    if (r5 != r0) goto L31
                    return r0
                L31:
                    r0 = r1
                    goto L39
                L33:
                    r5 = move-exception
                    r0 = r1
                L35:
                    b9.m$a r5 = b9.n.a(r5)
                L39:
                    java.lang.Throwable r1 = b9.m.a(r5)
                    if (r1 != 0) goto L43
                    r0.q0(r5)
                    goto L46
                L43:
                    r0.p0(r1)
                L46:
                    b9.A r5 = b9.C1992A.f18074a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: y1.q.a.C0555a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @h9.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends h9.i implements p9.p<E, InterfaceC4347e<? super T>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f48005l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C0597q f48006m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C0597q c0597q, InterfaceC4347e interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f48006m = c0597q;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new b(this.f48006m, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, Object obj) {
                return ((b) create(e4, (InterfaceC4347e) obj)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) throws Throwable {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f48005l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                    return obj;
                }
                b9.n.b(obj);
                this.f48005l = 1;
                Object objT = this.f48006m.t(this);
                return objT == aVar ? aVar : objT;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p9.p<? super E, ? super InterfaceC4347e<? super T>, ? extends Object> pVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f48000m = (h9.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [h9.i, p9.p] */
        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = new a(this.f48000m, interfaceC4347e);
            aVar.f47999l = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(E e4, Object obj) {
            return ((a) create(e4, (InterfaceC4347e) obj)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [h9.i, p9.p] */
        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            InterfaceC4350h.a aVar2 = ((E) this.f47999l).k0().get(InterfaceC4348f.a.f37870b);
            kotlin.jvm.internal.l.c(aVar2);
            InterfaceC4348f interfaceC4348f = (InterfaceC4348f) aVar2;
            C0597q c0597q = new C0597q();
            C0575f.d(C0580h0.f248b, interfaceC4348f, G.UNDISPATCHED, new C0555a(c0597q, this.f48000m, null));
            while (c0597q.L() instanceof InterfaceC0584j0) {
                try {
                    return C0575f.g(interfaceC4348f, new b(c0597q, null));
                } catch (InterruptedException unused) {
                }
            }
            return c0597q.G();
        }
    }

    public static final <T> T a(p9.p<? super E, ? super InterfaceC4347e<? super T>, ? extends Object> pVar) {
        Thread.interrupted();
        return (T) C0575f.g(C4351i.f37871b, new a(pVar, null));
    }
}
