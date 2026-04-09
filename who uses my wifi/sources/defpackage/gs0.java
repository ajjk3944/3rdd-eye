package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gs0 extends qj implements av {
    public final av i;
    public final hk j;
    public final int k;
    public hk l;
    public qj m;

    public gs0(av avVar, hk hkVar) {
        super(og.h, ls.f);
        this.i = avVar;
        this.j = hkVar;
        this.k = ((Number) hkVar.f(0, ik.j)).intValue();
    }

    @Override // defpackage.s9, defpackage.sk
    public final sk c() {
        qj qjVar = this.m;
        if (qjVar != null) {
            return qjVar;
        }
        return null;
    }

    @Override // defpackage.av
    public final Object d(Object obj, qj qjVar) {
        try {
            Object objO = o(qjVar, obj);
            return objO == rk.f ? objO : z31.a;
        } catch (Throwable th) {
            this.l = new rp(qjVar.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.qj, defpackage.oj
    public final hk getContext() {
        hk hkVar = this.l;
        return hkVar == null ? ls.f : hkVar;
    }

    @Override // defpackage.s9
    public final StackTraceElement i() {
        return null;
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        Throwable thA = jq0.a(obj);
        if (thA != null) {
            this.l = new rp(getContext(), thA);
        }
        qj qjVar = this.m;
        if (qjVar != null) {
            qjVar.e(obj);
        }
        return rk.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.qj r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs0.o(qj, java.lang.Object):java.lang.Object");
    }
}
