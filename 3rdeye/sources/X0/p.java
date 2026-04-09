package X0;

import D9.InterfaceC0645g;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Collect.kt */
/* loaded from: classes.dex */
public final class p implements InterfaceC0645g<B<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g f13480b;

    @h9.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f13481l;

        /* renamed from: m, reason: collision with root package name */
        public int f13482m;

        public a(InterfaceC4347e interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f13481l = obj;
            this.f13482m |= RecyclerView.UNDEFINED_DURATION;
            return p.this.emit(null, this);
        }
    }

    public p(InterfaceC0645g interfaceC0645g) {
        this.f13480b = interfaceC0645g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // D9.InterfaceC0645g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(X0.B<java.lang.Object> r5, f9.InterfaceC4347e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof X0.p.a
            if (r0 == 0) goto L13
            r0 = r6
            X0.p$a r0 = (X0.p.a) r0
            int r1 = r0.f13482m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13482m = r1
            goto L18
        L13:
            X0.p$a r0 = new X0.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13481l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13482m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            b9.n.b(r6)
            X0.B r5 = (X0.B) r5
            boolean r6 = r5 instanceof X0.k
            if (r6 != 0) goto L69
            boolean r6 = r5 instanceof X0.i
            if (r6 != 0) goto L64
            boolean r6 = r5 instanceof X0.C1640c
            if (r6 == 0) goto L52
            X0.c r5 = (X0.C1640c) r5
            T r5 = r5.f13425a
            r0.f13482m = r3
            D9.g r6 = r4.f13480b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L52:
            boolean r5 = r5 instanceof X0.C
            if (r5 == 0) goto L5e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L5e:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        L64:
            X0.i r5 = (X0.i) r5
            java.lang.Throwable r5 = r5.f13443a
            throw r5
        L69:
            X0.k r5 = (X0.k) r5
            java.lang.Throwable r5 = r5.f13444a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.p.emit(java.lang.Object, f9.e):java.lang.Object");
    }
}
