package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class j0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.f f26077a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public j0(j$.time.f fVar) {
        Objects.requireNonNull(fVar, "isoDate");
        this.f26077a = fVar;
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return h0.f26074c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        h0.f26074c.getClass();
        return this.f26077a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return J() >= 1 ? k0.BE : k0.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.n(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i4 = i0.f26076a[aVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return this.f26077a.k(qVar);
        }
        if (i4 != 4) {
            return h0.f26074c.j(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f26204b;
        return j$.time.temporal.u.e(1L, J() <= 0 ? (-(uVar.f26228a + 543)) + 1 : 543 + uVar.f26231d);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = i0.f26076a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i4 == 5) {
                return ((J() * 12) + this.f26077a.f26119b) - 1;
            }
            if (i4 == 6) {
                return J();
            }
            if (i4 != 7) {
                return this.f26077a.w(qVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return qVar.l(this);
    }

    public final int J() {
        return this.f26077a.f26118a + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.j0 c(long r8, j$.time.temporal.q r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.w(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.i0.f26076a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.h0 r10 = j$.time.chrono.h0.f26074c
            j$.time.temporal.u r10 = r10.j(r0)
            r10.b(r8, r0)
            int r10 = r7.J()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.f r10 = r7.f26077a
            short r2 = r10.f26119b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.f r8 = r10.O(r8)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L49:
            j$.time.chrono.h0 r2 = j$.time.chrono.h0.f26074c
            j$.time.temporal.u r2 = r2.j(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.f r0 = r7.f26077a
            j$.time.f r8 = r0.c(r8, r10)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L6a:
            j$.time.f r8 = r7.f26077a
            int r9 = r7.J()
            int r9 = (-542) - r9
            j$.time.f r8 = r8.U(r9)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L7b:
            j$.time.f r8 = r7.f26077a
            int r2 = r2 + (-543)
            j$.time.f r8 = r8.U(r2)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L88:
            j$.time.f r8 = r7.f26077a
            int r9 = r7.J()
            r10 = 1
            if (r9 < r10) goto L92
            goto L94
        L92:
            int r2 = 1 - r2
        L94:
            int r2 = r2 + (-543)
            j$.time.f r8 = r8.U(r2)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L9f:
            j$.time.chrono.b r8 = super.c(r8, r10)
            j$.time.chrono.j0 r8 = (j$.time.chrono.j0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.j0.c(long, j$.time.temporal.q):j$.time.chrono.j0");
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (j0) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.f fVar) {
        return (j0) super.j(fVar);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return L(this.f26077a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b G(long j) {
        return L(this.f26077a.O(j));
    }

    @Override // j$.time.chrono.d
    public final b F(long j) {
        return L(this.f26077a.N(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.s sVar) {
        return (j0) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (j0) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: E */
    public final b s(long j, j$.time.temporal.s sVar) {
        return (j0) super.s(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (j0) super.s(j, bVar);
    }

    public final j0 L(j$.time.f fVar) {
        return fVar.equals(this.f26077a) ? this : new j0(fVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f26077a.x();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f26077a.equals(((j0) obj).f26077a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 8, this);
    }
}
