package w1;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Set;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {413, 420}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends h9.i implements p9.p<r, InterfaceC4347e<? super Set<? extends Integer>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47303l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f47305n;

    /* compiled from: InvalidationTracker.kt */
    @h9.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {421}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<q<Set<? extends Integer>>, InterfaceC4347e<? super Set<? extends Integer>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f47306l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f47307m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ u f47308n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47308n = uVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = new a(this.f47308n, interfaceC4347e);
            aVar.f47307m = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(q<Set<? extends Integer>> qVar, InterfaceC4347e<? super Set<? extends Integer>> interfaceC4347e) {
            return ((a) create(qVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f47306l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            q qVar = (q) this.f47307m;
            this.f47306l = 1;
            Object objA = u.a(this.f47308n, qVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, InterfaceC4347e<? super x> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47305n = uVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        x xVar = new x(this.f47305n, interfaceC4347e);
        xVar.f47304m = obj;
        return xVar;
    }

    @Override // p9.p
    public final Object invoke(r rVar, InterfaceC4347e<? super Set<? extends Integer>> interfaceC4347e) {
        return ((x) create(rVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r7.f47303l
            c9.v r2 = c9.C2101v.f18583b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            b9.n.b(r8)     // Catch: android.database.SQLException -> L56
            goto L53
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f47304m
            w1.r r1 = (w1.r) r1
            b9.n.b(r8)
            goto L35
        L22:
            b9.n.b(r8)
            java.lang.Object r8 = r7.f47304m
            r1 = r8
            w1.r r1 = (w1.r) r1
            r7.f47304m = r1
            r7.f47303l = r4
            java.lang.Object r8 = r1.b(r7)
            if (r8 != r0) goto L35
            goto L52
        L35:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3e
            goto L56
        L3e:
            w1.r$a r8 = w1.r.a.IMMEDIATE     // Catch: android.database.SQLException -> L56
            w1.x$a r4 = new w1.x$a     // Catch: android.database.SQLException -> L56
            w1.u r5 = r7.f47305n     // Catch: android.database.SQLException -> L56
            r6 = 0
            r4.<init>(r5, r6)     // Catch: android.database.SQLException -> L56
            r7.f47304m = r6     // Catch: android.database.SQLException -> L56
            r7.f47303l = r3     // Catch: android.database.SQLException -> L56
            java.lang.Object r8 = r1.c(r8, r4, r7)     // Catch: android.database.SQLException -> L56
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            java.util.Set r8 = (java.util.Set) r8     // Catch: android.database.SQLException -> L56
            return r8
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
