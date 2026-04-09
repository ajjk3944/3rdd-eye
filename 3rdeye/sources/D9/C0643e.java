package D9;

import D9.C0648j;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Distinct.kt */
/* renamed from: D9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0643e<T> implements InterfaceC0644f<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0644f<T> f1185b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.m f1186c;

    /* renamed from: d, reason: collision with root package name */
    public final C0648j.a f1187d;

    /* compiled from: Distinct.kt */
    /* renamed from: D9.e$a */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0643e<T> f1188b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.w<Object> f1189c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0645g<T> f1190d;

        /* compiled from: Distinct.kt */
        @h9.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        /* renamed from: D9.e$a$a, reason: collision with other inner class name */
        public static final class C0014a extends h9.c {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f1191l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ a<T> f1192m;

            /* renamed from: n, reason: collision with root package name */
            public int f1193n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0014a(a<? super T> aVar, InterfaceC4347e<? super C0014a> interfaceC4347e) {
                super(interfaceC4347e);
                this.f1192m = aVar;
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                this.f1191l = obj;
                this.f1193n |= RecyclerView.UNDEFINED_DURATION;
                return this.f1192m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C0643e<T> c0643e, kotlin.jvm.internal.w<Object> wVar, InterfaceC0645g<? super T> interfaceC0645g) {
            this.f1188b = c0643e;
            this.f1189c = wVar;
            this.f1190d = interfaceC0645g;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // D9.InterfaceC0645g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, f9.InterfaceC4347e<? super b9.C1992A> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof D9.C0643e.a.C0014a
                if (r0 == 0) goto L13
                r0 = r9
                D9.e$a$a r0 = (D9.C0643e.a.C0014a) r0
                int r1 = r0.f1193n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1193n = r1
                goto L18
            L13:
                D9.e$a$a r0 = new D9.e$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f1191l
                g9.a r1 = g9.a.COROUTINE_SUSPENDED
                int r2 = r0.f1193n
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                b9.n.b(r9)
                goto L61
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                b9.n.b(r9)
                D9.e<T> r9 = r7.f1188b
                kotlin.jvm.internal.m r2 = r9.f1186c
                java.lang.Object r2 = r2.invoke(r8)
                kotlin.jvm.internal.w<java.lang.Object> r4 = r7.f1189c
                T r5 = r4.f43660b
                F9.y r6 = E9.c.f1489b
                if (r5 == r6) goto L54
                D9.j$a r9 = r9.f1187d
                java.lang.Object r9 = r9.invoke(r5, r2)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L51
                goto L54
            L51:
                b9.A r8 = b9.C1992A.f18074a
                return r8
            L54:
                r4.f43660b = r2
                r0.f1193n = r3
                D9.g<T> r9 = r7.f1190d
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L61
                return r1
            L61:
                b9.A r8 = b9.C1992A.f18074a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: D9.C0643e.a.emit(java.lang.Object, f9.e):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0643e(InterfaceC0644f interfaceC0644f, p9.l lVar, C0648j.a aVar) {
        this.f1185b = interfaceC0644f;
        this.f1186c = (kotlin.jvm.internal.m) lVar;
        this.f1187d = aVar;
    }

    @Override // D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super T> interfaceC0645g, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f43660b = (T) E9.c.f1489b;
        Object objB = this.f1185b.b(new a(this, wVar, interfaceC0645g), interfaceC4347e);
        return objB == g9.a.COROUTINE_SUSPENDED ? objB : C1992A.f18074a;
    }
}
