package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final j$.time.f f26103d = j$.time.f.K(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.f f26104a;

    /* renamed from: b, reason: collision with root package name */
    public final transient z f26105b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f26106c;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.i iVar) {
        return new g(this, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(j$.time.f r6) {
        /*
            r5 = this;
            r5.<init>()
            j$.time.f r0 = j$.time.chrono.y.f26103d
            boolean r1 = j$.time.b.b(r0)
            r2 = 1
            if (r1 == 0) goto L16
            r6.getClass()
            int r0 = r6.C(r0)
            if (r0 >= 0) goto L24
            goto L22
        L16:
            long r3 = r6.x()
            long r0 = r0.x()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L24
        L22:
            r0 = r2
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3a
            j$.time.chrono.z r0 = j$.time.chrono.z.h(r6)
            r5.f26105b = r0
            int r1 = r6.f26118a
            j$.time.f r0 = r0.f26110b
            int r0 = r0.f26118a
            int r1 = r1 - r0
            int r1 = r1 + r2
            r5.f26106c = r1
            r5.f26104a = r6
            return
        L3a:
            j$.time.a r6 = new j$.time.a
            java.lang.String r0 = "JapaneseDate before Meiji 6 is not supported"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.<init>(j$.time.f):void");
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return w.f26101c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.f26101c.getClass();
        return this.f26104a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return this.f26105b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // j$.time.chrono.d, j$.time.temporal.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.u k(j$.time.temporal.q r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            boolean r0 = r5.e(r6)
            if (r0 == 0) goto L8d
            j$.time.temporal.a r6 = (j$.time.temporal.a) r6
            int[] r0 = j$.time.chrono.x.f26102a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            if (r0 == r1) goto L81
            r4 = 2
            if (r0 == r4) goto L48
            r4 = 3
            if (r0 == r4) goto L26
            j$.time.chrono.w r0 = j$.time.chrono.w.f26101c
            j$.time.temporal.u r6 = r0.j(r6)
            return r6
        L26:
            j$.time.chrono.z r6 = r5.f26105b
            j$.time.f r0 = r6.f26110b
            int r0 = r0.f26118a
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L3e
            j$.time.f r6 = r6.f26110b
            int r6 = r6.f26118a
            int r6 = r6 - r0
            int r6 = r6 + r1
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L3e:
            r6 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r6 = r6 - r0
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L48:
            j$.time.chrono.z r6 = r5.f26105b
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L60
            j$.time.f r6 = r6.f26110b
            int r0 = r6.f26118a
            j$.time.f r4 = r5.f26104a
            int r4 = r4.f26118a
            if (r0 != r4) goto L60
            int r6 = r6.H()
            int r6 = r6 - r1
            goto L6d
        L60:
            j$.time.f r6 = r5.f26104a
            boolean r6 = r6.I()
            if (r6 == 0) goto L6b
            r6 = 366(0x16e, float:5.13E-43)
            goto L6d
        L6b:
            r6 = 365(0x16d, float:5.11E-43)
        L6d:
            int r0 = r5.f26106c
            if (r0 != r1) goto L7b
            j$.time.chrono.z r0 = r5.f26105b
            j$.time.f r0 = r0.f26110b
            int r0 = r0.H()
            int r0 = r0 - r1
            int r6 = r6 - r0
        L7b:
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L81:
            j$.time.f r6 = r5.f26104a
            int r6 = r6.J()
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L8d:
            j$.time.temporal.t r0 = new j$.time.temporal.t
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r6 = j$.time.b.a(r1, r6)
            r0.<init>(r6)
            throw r0
        L99:
            j$.time.temporal.u r6 = r6.j(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.k(j$.time.temporal.q):j$.time.temporal.u");
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        switch (x.f26102a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 2:
                return this.f26106c == 1 ? (this.f26104a.H() - this.f26105b.f26110b.H()) + 1 : this.f26104a.H();
            case 3:
                return this.f26106c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
            case 8:
                return this.f26105b.f26109a;
            default:
                return this.f26104a.w(qVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final y c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (w(aVar) == j) {
                return this;
            }
            int[] iArr = x.f26102a;
            int i4 = iArr[aVar.ordinal()];
            if (i4 == 3 || i4 == 8 || i4 == 9) {
                int iA = w.f26101c.j(aVar).a(j, aVar);
                int i10 = iArr[aVar.ordinal()];
                if (i10 == 3) {
                    return L(this.f26105b, iA);
                }
                if (i10 == 8) {
                    return L(z.q(iA), this.f26106c);
                }
                if (i10 == 9) {
                    return K(this.f26104a.U(iA));
                }
            }
            return K(this.f26104a.c(j, qVar));
        }
        return (y) super.c(j, qVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (y) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.f fVar) {
        return (y) super.j(fVar);
    }

    public final y L(z zVar, int i4) {
        w.f26101c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i10 = zVar.f26110b.f26118a;
        int i11 = (i10 + i4) - 1;
        if (i4 != 1 && (i11 < -999999999 || i11 > 999999999 || i11 < i10 || zVar != z.h(j$.time.f.K(i11, 1, 1)))) {
            throw new j$.time.a("Invalid yearOfEra value");
        }
        return K(this.f26104a.U(i11));
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return K(this.f26104a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b G(long j) {
        return K(this.f26104a.O(j));
    }

    @Override // j$.time.chrono.d
    public final b F(long j) {
        return K(this.f26104a.N(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.s sVar) {
        return (y) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (y) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: E */
    public final b s(long j, j$.time.temporal.s sVar) {
        return (y) super.s(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (y) super.s(j, bVar);
    }

    public final y K(j$.time.f fVar) {
        return fVar.equals(this.f26104a) ? this : new y(fVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f26104a.x();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f26104a.equals(((y) obj).f26104a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
    }
}
