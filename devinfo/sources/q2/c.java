package q2;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f32155a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32156b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32158d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32159e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f32160f;
    public final j0.c g;

    public c(long j, long j8, long j9, long j10, long j11, float[] fArr, j0.c cVar) {
        this.f32155a = j;
        this.f32156b = j8;
        this.f32157c = j9;
        this.f32158d = j10;
        this.f32159e = j11;
        this.f32160f = fArr;
        this.g = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<q2.c> r2 = q2.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            q2.c r7 = (q2.c) r7
            long r2 = r6.f32155a
            long r4 = r7.f32155a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f32156b
            long r4 = r7.f32156b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f32159e
            long r4 = r7.f32159e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f32157c
            long r4 = r7.f32157c
            boolean r2 = d3.i.a(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f32158d
            long r4 = r7.f32158d
            boolean r2 = d3.i.a(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f32160f
            float[] r3 = r6.f32160f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            j0.c r2 = r6.g
            j0.c r7 = r7.g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.f32155a;
        long j8 = this.f32156b;
        int i4 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f32159e;
        int i10 = (i4 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f32157c;
        int i11 = (((int) (j10 ^ (j10 >>> 32))) + i10) * 31;
        long j11 = this.f32158d;
        int i12 = (((int) (j11 ^ (j11 >>> 32))) + i11) * 31;
        float[] fArr = this.f32160f;
        return this.g.hashCode() + ((i12 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
