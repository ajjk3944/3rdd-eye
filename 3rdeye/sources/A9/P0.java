package A9;

/* compiled from: Timeout.kt */
/* loaded from: classes3.dex */
public final class P0<U, T extends U> extends F9.v<T> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final long f200f;

    public P0(long j4, h9.c cVar) {
        super(cVar, cVar.getContext());
        this.f200f = j4;
    }

    @Override // A9.C0605u0
    public final String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.T());
        sb.append("(timeMillis=");
        return androidx.work.s.f(sb, this.f200f, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            f9.h r0 = r4.f219d
            A9.N r0 = A9.O.b(r0)
            boolean r1 = r0 instanceof A9.P
            if (r1 == 0) goto Ld
            A9.P r0 = (A9.P) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r4.f200f
            if (r0 == 0) goto L1f
            int r3 = z9.C5870a.f48496e
            z9.c r3 = z9.EnumC5872c.MILLISECONDS
            k8.F.x(r1, r3)
            java.lang.String r0 = r0.B()
            if (r0 != 0) goto L32
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Timed out waiting for "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            A9.O0 r1 = new A9.O0
            r1.<init>(r0, r4)
            r4.u(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.P0.run():void");
    }
}
