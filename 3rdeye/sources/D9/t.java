package D9;

import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f8.C4339b;
import f9.InterfaceC4347e;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class t implements InterfaceC0644f<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0641c f1251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4339b f1252c;

    /* compiled from: Emitters.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0645g f1253b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4339b f1254c;

        /* compiled from: Emitters.kt */
        @h9.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {219, 220}, m = "emit")
        /* renamed from: D9.t$a$a, reason: collision with other inner class name */
        public static final class C0015a extends h9.c {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f1255l;

            /* renamed from: m, reason: collision with root package name */
            public int f1256m;

            /* renamed from: o, reason: collision with root package name */
            public Object f1258o;

            /* renamed from: p, reason: collision with root package name */
            public InterfaceC0645g f1259p;

            public C0015a(InterfaceC4347e interfaceC4347e) {
                super(interfaceC4347e);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                this.f1255l = obj;
                this.f1256m |= RecyclerView.UNDEFINED_DURATION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC0645g interfaceC0645g, C4339b c4339b) {
            this.f1253b = interfaceC0645g;
            this.f1254c = c4339b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r6.emit(r2, r0) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // D9.InterfaceC0645g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, f9.InterfaceC4347e<? super b9.C1992A> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof D9.t.a.C0015a
                if (r0 == 0) goto L13
                r0 = r7
                D9.t$a$a r0 = (D9.t.a.C0015a) r0
                int r1 = r0.f1256m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1256m = r1
                goto L18
            L13:
                D9.t$a$a r0 = new D9.t$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1255l
                g9.a r1 = g9.a.COROUTINE_SUSPENDED
                int r2 = r0.f1256m
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                b9.n.b(r7)
                goto L5e
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                D9.g r6 = r0.f1259p
                java.lang.Object r2 = r0.f1258o
                b9.n.b(r7)
                goto L50
            L3a:
                b9.n.b(r7)
                r0.f1258o = r6
                D9.g r7 = r5.f1253b
                r0.f1259p = r7
                r0.f1256m = r4
                f8.b r2 = r5.f1254c
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L4e
                goto L5d
            L4e:
                r2 = r6
                r6 = r7
            L50:
                r7 = 0
                r0.f1258o = r7
                r0.f1259p = r7
                r0.f1256m = r3
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L5e
            L5d:
                return r1
            L5e:
                b9.A r6 = b9.C1992A.f18074a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: D9.t.a.emit(java.lang.Object, f9.e):java.lang.Object");
        }
    }

    public t(C0641c c0641c, C4339b c4339b) {
        this.f1251b = c0641c;
        this.f1252c = c4339b;
    }

    @Override // D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super Object> interfaceC0645g, InterfaceC4347e interfaceC4347e) {
        Object objB = this.f1251b.b(new a(interfaceC0645g, this.f1252c), interfaceC4347e);
        return objB == g9.a.COROUTINE_SUSPENDED ? objB : C1992A.f18074a;
    }
}
