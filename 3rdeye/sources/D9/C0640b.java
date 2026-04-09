package D9;

import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: Builders.kt */
/* renamed from: D9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0640b<T> extends C0642d<T> {

    /* compiled from: Builders.kt */
    @h9.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    /* renamed from: D9.b$a */
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public C9.u f1179l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1180m;

        /* renamed from: o, reason: collision with root package name */
        public int f1182o;

        public a(h9.c cVar) {
            super(cVar);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1180m = obj;
            this.f1182o |= RecyclerView.UNDEFINED_DURATION;
            return C0640b.this.d(null, this);
        }
    }

    public C0640b(p9.p<? super C9.u<? super T>, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4350h interfaceC4350h, int i, C9.a aVar) {
        super(pVar, interfaceC4350h, i, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [h9.i, p9.p] */
    @Override // E9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(C9.u<? super T> r5, f9.InterfaceC4347e<? super b9.C1992A> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof D9.C0640b.a
            if (r0 == 0) goto L13
            r0 = r6
            D9.b$a r0 = (D9.C0640b.a) r0
            int r1 = r0.f1182o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1182o = r1
            goto L1a
        L13:
            D9.b$a r0 = new D9.b$a
            h9.c r6 = (h9.c) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f1180m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1182o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            C9.u r5 = r0.f1179l
            b9.n.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            b9.n.b(r6)
            r0.f1179l = r5
            r0.f1182o = r3
            h9.i r6 = r4.f1184e
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            goto L45
        L43:
            b9.A r6 = b9.C1992A.f18074a
        L45:
            if (r6 != r1) goto L48
            return r1
        L48:
            boolean r5 = r5.o()
            if (r5 == 0) goto L51
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C0640b.d(C9.u, f9.e):java.lang.Object");
    }
}
