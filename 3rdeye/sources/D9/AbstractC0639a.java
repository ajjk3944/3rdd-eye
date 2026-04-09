package D9;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: Flow.kt */
/* renamed from: D9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0639a<T> implements InterfaceC0644f<T> {

    /* compiled from: Flow.kt */
    @h9.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: D9.a$a, reason: collision with other inner class name */
    public static final class C0013a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public E9.o f1175l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1176m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AbstractC0639a<T> f1177n;

        /* renamed from: o, reason: collision with root package name */
        public int f1178o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0013a(AbstractC0639a<T> abstractC0639a, InterfaceC4347e<? super C0013a> interfaceC4347e) {
            super(interfaceC4347e);
            this.f1177n = abstractC0639a;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1176m = obj;
            this.f1178o |= RecyclerView.UNDEFINED_DURATION;
            return this.f1177n.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [h9.i, p9.p] */
    @Override // D9.InterfaceC0644f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(D9.InterfaceC0645g<? super T> r6, f9.InterfaceC4347e<? super b9.C1992A> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof D9.AbstractC0639a.C0013a
            if (r0 == 0) goto L13
            r0 = r7
            D9.a$a r0 = (D9.AbstractC0639a.C0013a) r0
            int r1 = r0.f1178o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1178o = r1
            goto L18
        L13:
            D9.a$a r0 = new D9.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1176m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1178o
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            E9.o r6 = r0.f1175l
            b9.n.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r7 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            b9.n.b(r7)
            E9.o r7 = new E9.o
            f9.h r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f1175l = r7     // Catch: java.lang.Throwable -> L5f
            r0.f1178o = r3     // Catch: java.lang.Throwable -> L5f
            r6 = r5
            D9.B r6 = (D9.B) r6     // Catch: java.lang.Throwable -> L5f
            h9.i r6 = r6.f1131b     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r1) goto L4f
            goto L51
        L4f:
            b9.A r6 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L5f
        L51:
            if (r6 != r1) goto L54
            return r1
        L54:
            r6 = r7
        L55:
            r6.releaseIntercepted()
            b9.A r6 = b9.C1992A.f18074a
            return r6
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L61
        L5f:
            r6 = move-exception
            goto L5b
        L61:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.AbstractC0639a.b(D9.g, f9.e):java.lang.Object");
    }
}
