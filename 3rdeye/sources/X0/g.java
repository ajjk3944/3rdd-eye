package X0;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DataMigrationInitializer.kt */
@h9.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends h9.i implements p9.p<Object, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public Iterator f13434l;

    /* renamed from: m, reason: collision with root package name */
    public d f13435m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13436n;

    /* renamed from: o, reason: collision with root package name */
    public int f13437o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13438p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List<d<Object>> f13439q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13440r;

    /* compiled from: DataMigrationInitializer.kt */
    @h9.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.l<InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f13441l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d<Object> f13442m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Object> dVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(1, interfaceC4347e);
            this.f13442m = dVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f13442m, interfaceC4347e);
        }

        @Override // p9.l
        public final Object invoke(InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f13441l;
            if (i == 0) {
                b9.n.b(obj);
                this.f13441l = 1;
                if (this.f13442m.s() == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13439q = list;
        this.f13440r = arrayList;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        g gVar = new g(this.f13439q, this.f13440r, interfaceC4347e);
        gVar.f13438p = obj;
        return gVar;
    }

    @Override // p9.p
    public final Object invoke(Object obj, InterfaceC4347e<Object> interfaceC4347e) {
        return ((g) create(obj, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r8.f13437o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r8.f13434l
            java.lang.Object r4 = r8.f13438p
            java.util.List r4 = (java.util.List) r4
            b9.n.b(r9)
            goto L3e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f13436n
            X0.d r4 = r8.f13435m
            java.util.Iterator r5 = r8.f13434l
            java.lang.Object r6 = r8.f13438p
            java.util.List r6 = (java.util.List) r6
            b9.n.b(r9)
            r7 = r6
            r6 = r4
            r4 = r7
            goto L60
        L2f:
            b9.n.b(r9)
            java.lang.Object r9 = r8.f13438p
            java.util.List<X0.d<java.lang.Object>> r1 = r8.f13439q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r8.f13440r
        L3e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r1.next()
            X0.d r5 = (X0.d) r5
            r8.f13438p = r4
            r8.f13434l = r1
            r8.f13435m = r5
            r8.f13436n = r9
            r8.f13437o = r3
            java.lang.Object r6 = r5.b()
            if (r6 != r0) goto L5b
            goto L81
        L5b:
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L60:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            X0.g$a r9 = new X0.g$a
            r1 = 0
            r9.<init>(r6, r1)
            r4.add(r9)
            r8.f13438p = r4
            r8.f13434l = r5
            r8.f13435m = r1
            r8.f13436n = r1
            r8.f13437o = r2
            java.lang.Object r9 = r6.a()
            if (r9 != r0) goto L82
        L81:
            return r0
        L82:
            r1 = r5
            goto L3e
        L84:
            r9 = r1
            goto L82
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
