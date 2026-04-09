package D9;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Share.kt */
/* loaded from: classes3.dex */
public final class M<T> implements InterfaceC0645g<T> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [h9.c, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b9.C1992A b(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof D9.L
            if (r0 == 0) goto L13
            r0 = r5
            D9.L r0 = (D9.L) r0
            int r1 = r0.f1174p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1174p = r1
            goto L18
        L13:
            D9.L r0 = new D9.L
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1172n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r1 = r0.f1174p
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L34
            r0 = 2
            if (r1 != r0) goto L2c
            b9.n.b(r5)
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L34:
            E9.o r1 = r0.f1171m
            D9.M r0 = r0.f1170l
            b9.n.b(r5)     // Catch: java.lang.Throwable -> L44
            r1.releaseIntercepted()
            r0.getClass()
            b9.A r5 = b9.C1992A.f18074a
            return r5
        L44:
            r5 = move-exception
            goto L5a
        L46:
            b9.n.b(r5)
            E9.o r1 = new E9.o
            f9.h r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.f1170l = r4     // Catch: java.lang.Throwable -> L44
            r0.f1171m = r1     // Catch: java.lang.Throwable -> L44
            r0.f1174p = r2     // Catch: java.lang.Throwable -> L44
            throw r3     // Catch: java.lang.Throwable -> L44
        L5a:
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.M.b(h9.c):b9.A");
    }

    @Override // D9.InterfaceC0645g
    public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        throw null;
    }
}
