package on;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f19603a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.k f19604b;

    /* renamed from: c, reason: collision with root package name */
    public final to.d f19605c;

    /* renamed from: d, reason: collision with root package name */
    public final iq.f f19606d;

    /* renamed from: e, reason: collision with root package name */
    public final no.b f19607e;

    /* renamed from: f, reason: collision with root package name */
    public final wt.q f19608f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f19609g;

    public e(k kVar, io.sentry.k kVar2, to.d dVar, iq.f fVar, no.b bVar) {
        br.l.e(kVar, "persistenceManager");
        br.l.e(kVar2, "eventManager");
        br.l.e(dVar, "contactsRepository");
        br.l.e(fVar, "timestampProvider");
        br.l.e(bVar, "logger");
        du.f fVar2 = wt.d0.f24610a;
        du.e eVar = du.e.f7570g;
        br.l.e(eVar, "ioDispatcher");
        this.f19603a = kVar;
        this.f19604b = kVar2;
        this.f19605c = dVar;
        this.f19606d = fVar;
        this.f19607e = bVar;
        this.f19608f = eVar;
        this.f19609g = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286 A[EDGE_INSN: B:85:0x0286->B:75:0x0286 BREAK  A[LOOP:0: B:70:0x0264->B:87:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(on.a r30, boolean r31, int r32, rq.c r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: on.e.a(on.a, boolean, int, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.survicate.surveys.entities.models.RespondentEvent.QuestionAnswered r11, long r12, rq.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof on.c
            if (r0 == 0) goto L13
            r0 = r14
            on.c r0 = (on.c) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            on.c r0 = new on.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f19598y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r12 = r0.f19597x
            on.e r11 = r0.f19596r
            lf.t1.G(r14)     // Catch: java.lang.Exception -> L2c
            r5 = r10
            goto L6a
        L2c:
            r0 = move-exception
            r14 = r0
            r5 = r10
            goto L5d
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            lf.t1.G(r14)
            wt.q r14 = r10.f19608f     // Catch: java.lang.Exception -> L58
            on.d r4 = new on.d     // Catch: java.lang.Exception -> L58
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L53
            r0.f19596r = r5     // Catch: java.lang.Exception -> L53
            r0.f19597x = r7     // Catch: java.lang.Exception -> L53
            r0.D = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r11 = wt.w.B(r14, r4, r0)     // Catch: java.lang.Exception -> L53
            if (r11 != r1) goto L6a
            return r1
        L53:
            r0 = move-exception
            r14 = r0
            r11 = r5
            r12 = r7
            goto L5d
        L58:
            r0 = move-exception
            r5 = r10
            r7 = r12
            r14 = r0
            r11 = r5
        L5d:
            no.b r11 = r11.f19607e
            java.lang.String r0 = "Could not save the answer to the question with id: "
            java.lang.String r12 = c7.a.m(r12, r0)
            sm.f r11 = (sm.f) r11
            r11.N(r14, r12)
        L6a:
            lq.b0 r11 = lq.b0.f15562a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: on.e.b(com.survicate.surveys.entities.models.RespondentEvent$QuestionAnswered, long, rq.c):java.lang.Object");
    }
}
