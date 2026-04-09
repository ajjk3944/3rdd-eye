package j$.time;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ZoneOffset extends v implements j$.time.temporal.n, j$.time.temporal.o, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: a, reason: collision with root package name */
    public final int f26051a;

    /* renamed from: b, reason: collision with root package name */
    public final transient String f26052b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f26047c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f26048d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = I(0);

    /* renamed from: e, reason: collision with root package name */
    public static final ZoneOffset f26049e = I(-64800);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f26050f = I(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f26051a - this.f26051a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset G(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f26048d
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r6, r2)
            int r2 = J(r7, r5, r2)
            goto L85
        L37:
            j$.time.a r0 = new j$.time.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r1, r3)
            int r2 = J(r7, r4, r3)
            goto L85
        L50:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = J(r7, r2, r3)
            int r1 = J(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = J(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.a r0 = new j$.time.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = H(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = H(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.G(java.lang.String):j$.time.ZoneOffset");
    }

    @Override // j$.time.v
    public final j$.time.zone.f C() {
        Objects.requireNonNull(this, "offset");
        return new j$.time.zone.f(this);
    }

    public static int J(CharSequence charSequence, int i4, boolean z3) {
        if (z3) {
            String str = (String) charSequence;
            if (str.charAt(i4 - 1) != ':') {
                throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i4);
        char cCharAt2 = str2.charAt(i4 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset H(int i4, int i10, int i11) {
        if (i4 < -18 || i4 > 18) {
            throw new a("Zone offset hours not in valid range: value " + i4 + " is not in the range -18 to 18");
        }
        if (i4 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i4 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new a("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new a("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (Math.abs(i4) == 18 && (i10 | i11) != 0) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        return I((i10 * 60) + (i4 * 3600) + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset I(int i4) {
        if (i4 < -64800 || i4 > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i4 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i4);
            ConcurrentHashMap concurrentHashMap = f26047c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i4));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f26048d.putIfAbsent(zoneOffset2.f26052b, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i4);
    }

    public ZoneOffset(int i4) {
        String string;
        this.f26051a = i4;
        if (i4 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i4);
            StringBuilder sb2 = new StringBuilder();
            int i10 = iAbs / 3600;
            int i11 = (iAbs / 60) % 60;
            sb2.append(i4 < 0 ? "-" : "+");
            sb2.append(i10 < 10 ? "0" : "");
            sb2.append(i10);
            sb2.append(i11 < 10 ? ":0" : ":");
            sb2.append(i11);
            int i12 = iAbs % 60;
            if (i12 != 0) {
                sb2.append(i12 < 10 ? ":0" : ":");
                sb2.append(i12);
            }
            string = sb2.toString();
        }
        this.f26052b = string;
    }

    @Override // j$.time.v
    public final String h() {
        return this.f26052b;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f26051a;
        }
        if (b.b(qVar)) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return j$.time.temporal.r.d(this, qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f26051a;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.r.f26225d || aVar == j$.time.temporal.r.f26226e) ? this : j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f26051a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f26051a == ((ZoneOffset) obj).f26051a;
    }

    @Override // j$.time.v
    public final int hashCode() {
        return this.f26051a;
    }

    @Override // j$.time.v
    public final String toString() {
        return this.f26052b;
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.v
    public final void F(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        L(dataOutput);
    }

    public final void L(DataOutput dataOutput) throws IOException {
        int i4 = this.f26051a;
        int i10 = i4 % 900 == 0 ? i4 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i4);
        }
    }

    public static ZoneOffset K(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? I(dataInput.readInt()) : I(b10 * 900);
    }
}
