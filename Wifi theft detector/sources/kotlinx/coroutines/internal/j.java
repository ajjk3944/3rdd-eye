package kotlinx.coroutines.internal;

import kotlinx.coroutines.c1;
import kotlinx.coroutines.p2;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f22539a = new c0("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f22540b = new c0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:45:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(c9.c r6, java.lang.Object r7, l9.l r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.i
            if (r0 == 0) goto Lb3
            kotlinx.coroutines.internal.i r6 = (kotlinx.coroutines.internal.i) r6
            java.lang.Object r8 = kotlinx.coroutines.f0.c(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.f22535d
            kotlin.coroutines.d r1 = r6.getContext()
            boolean r0 = r0.Z(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f22537f = r8
            r6.f22692c = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f22535d
            kotlin.coroutines.d r8 = r6.getContext()
            r7.X(r8, r6)
            goto Lad
        L26:
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.p2.f22589a
            kotlinx.coroutines.c1 r0 = r0.b()
            boolean r2 = r0.i0()
            if (r2 == 0) goto L3b
            r6.f22537f = r8
            r6.f22692c = r1
            r0.e0(r6)
            goto Lad
        L3b:
            r0.g0(r1)
            r2 = 0
            kotlin.coroutines.d r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.r1$b r4 = kotlinx.coroutines.r1.H8     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.d$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.r1 r3 = (kotlinx.coroutines.r1) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.m()     // Catch: java.lang.Throwable -> L68
            r6.b(r8, r7)     // Catch: java.lang.Throwable -> L68
            kotlin.Result$a r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.c.a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            c9.c r8 = r6.f22536e     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.f22538g     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.d r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.internal.c0 r5 = kotlinx.coroutines.internal.ThreadContextKt.f22512a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            kotlinx.coroutines.s2 r8 = kotlinx.coroutines.CoroutineContextKt.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            c9.c r5 = r6.f22536e     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            y8.s r7 = y8.s.f25199a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.U0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.l0()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.b0(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.U0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.h(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.b0(r1)
            throw r6
        Lb3:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.j.b(c9.c, java.lang.Object, l9.l):void");
    }

    public static /* synthetic */ void c(c9.c cVar, Object obj, l9.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(cVar, obj, lVar);
    }

    public static final boolean d(i iVar) {
        y8.s sVar = y8.s.f25199a;
        c1 c1VarB = p2.f22589a.b();
        if (c1VarB.j0()) {
            return false;
        }
        if (c1VarB.i0()) {
            iVar.f22537f = sVar;
            iVar.f22692c = 1;
            c1VarB.e0(iVar);
            return true;
        }
        c1VarB.g0(true);
        try {
            iVar.run();
            do {
            } while (c1VarB.l0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
