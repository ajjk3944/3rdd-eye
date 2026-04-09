package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.temporal.o;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f26259i = new long[0];
    public static final e[] j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f26260k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    public static final b[] f26261l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f26262a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f26263b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f26264c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f26265d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f26266e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f26267f;
    public final TimeZone g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f26268h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f26246b;
        if (bVar.i()) {
            if (localDateTime.E(localDateTime2)) {
                return bVar.f26247c;
            }
            if (!localDateTime.E(bVar.f26246b.I(bVar.f26248d.f26051a - bVar.f26247c.f26051a))) {
                return bVar.f26248d;
            }
        } else {
            if (!localDateTime.E(localDateTime2)) {
                return bVar.f26248d;
            }
            if (localDateTime.E(bVar.f26246b.I(bVar.f26248d.f26051a - bVar.f26247c.f26051a))) {
                return bVar.f26247c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f26262a = jArr;
        this.f26263b = zoneOffsetArr;
        this.f26264c = jArr2;
        this.f26266e = zoneOffsetArr2;
        this.f26267f = eVarArr;
        if (jArr2.length == 0) {
            this.f26265d = f26260k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 < jArr2.length) {
                int i10 = i4 + 1;
                b bVar = new b(jArr2[i4], zoneOffsetArr2[i4], zoneOffsetArr2[i10]);
                if (bVar.i()) {
                    arrayList.add(bVar.f26246b);
                    arrayList.add(bVar.f26246b.I(bVar.f26248d.f26051a - bVar.f26247c.f26051a));
                } else {
                    arrayList.add(bVar.f26246b.I(bVar.f26248d.f26051a - bVar.f26247c.f26051a));
                    arrayList.add(bVar.f26246b);
                }
                i4 = i10;
            }
            this.f26265d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f26263b = zoneOffsetArr;
        long[] jArr = f26259i;
        this.f26262a = jArr;
        this.f26264c = jArr;
        this.f26265d = f26260k;
        this.f26266e = zoneOffsetArr;
        this.f26267f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f26263b = zoneOffsetArr;
        long[] jArr = f26259i;
        this.f26262a = jArr;
        this.f26264c = jArr;
        this.f26265d = f26260k;
        this.f26266e = zoneOffsetArr;
        this.f26267f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i4) {
        return ZoneOffset.I(i4 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j8, ZoneOffset zoneOffset) {
        return j$.time.f.L(j$.com.android.tools.r8.a.B(j8 + zoneOffset.f26051a, 86400)).f26118a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f26264c;
        if (jArr.length == 0) {
            return this.f26263b[0];
        }
        long j8 = instant.f26038a;
        if (this.f26267f.length > 0 && j8 > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(j8, this.f26266e[r8.length - 1]));
            b bVar = null;
            for (int i4 = 0; i4 < bVarArrB.length; i4++) {
                bVar = bVarArrB[i4];
                if (j8 < bVar.f26245a) {
                    return bVar.f26247c;
                }
            }
            return bVar.f26248d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f26266e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        if (bVar.i()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.f26247c, bVar.f26248d};
        ArrayList arrayList = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            arrayList.add(Objects.requireNonNull(objArr[i4]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.C(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f26043b.N() <= r0.f26043b.N()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i4) {
        j$.time.f fVarD;
        b[] bVarArr = f26261l;
        Integer numValueOf = Integer.valueOf(i4);
        b[] bVarArr2 = (b[]) this.f26268h.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j8 = 1;
        final int i10 = 0;
        final int i11 = 1;
        if (this.g != null) {
            if (i4 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f26040c;
            j$.time.f fVarK = j$.time.f.K(i4 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.s(0);
            long jT = j$.com.android.tools.r8.a.t(new LocalDateTime(fVarK, j$.time.i.f26174h[0]), this.f26263b[0]);
            long j9 = 1000;
            int offset = this.g.getOffset(jT * 1000);
            long j10 = 31968000 + jT;
            while (jT < j10) {
                long j11 = jT + 7776000;
                long j12 = j9;
                if (offset != this.g.getOffset(j11 * j12)) {
                    while (j11 - jT > j8) {
                        long jB = j$.com.android.tools.r8.a.B(j11 + jT, 2L);
                        if (this.g.getOffset(jB * j12) == offset) {
                            jT = jB;
                        } else {
                            j11 = jB;
                        }
                        j8 = 1;
                    }
                    if (this.g.getOffset(jT * j12) == offset) {
                        jT = j11;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.g.getOffset(jT * j12);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jT, zoneOffsetG2) == i4) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jT, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jT = j11;
                }
                j9 = j12;
                j8 = 1;
            }
            if (1916 <= i4 && i4 < 2100) {
                this.f26268h.putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f26267f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i12 = 0;
        while (i12 < eVarArr.length) {
            e eVar = eVarArr[i12];
            byte b10 = eVar.f26252b;
            if (b10 < 0) {
                k kVar = eVar.f26251a;
                long j13 = i4;
                t.f26098c.getClass();
                int iD = kVar.D(t.j(j13)) + 1 + eVar.f26252b;
                j$.time.f fVar = j$.time.f.f26116d;
                j$.time.temporal.a.YEAR.s(j13);
                Objects.requireNonNull(kVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(iD);
                fVarD = j$.time.f.D(i4, kVar.getValue(), iD);
                j$.time.c cVar = eVar.f26253c;
                if (cVar != null) {
                    final int value = cVar.getValue();
                    fVarD = fVarD.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m o(m mVar) {
                            switch (i11) {
                                case 0:
                                    int i13 = mVar.i(a.DAY_OF_WEEK);
                                    int i14 = value;
                                    if (i13 == i14) {
                                        return mVar;
                                    }
                                    return mVar.d(i13 - i14 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i15 = mVar.i(a.DAY_OF_WEEK);
                                    int i16 = value;
                                    if (i15 == i16) {
                                        return mVar;
                                    }
                                    return mVar.s(i16 - i15 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            } else {
                k kVar2 = eVar.f26251a;
                j$.time.f fVar2 = j$.time.f.f26116d;
                j$.time.temporal.a.YEAR.s(i4);
                Objects.requireNonNull(kVar2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b10);
                fVarD = j$.time.f.D(i4, kVar2.getValue(), b10);
                j$.time.c cVar2 = eVar.f26253c;
                if (cVar2 != null) {
                    final int value2 = cVar2.getValue();
                    fVarD = fVarD.j(new o() { // from class: j$.time.temporal.p
                        @Override // j$.time.temporal.o
                        public final m o(m mVar) {
                            switch (i10) {
                                case 0:
                                    int i13 = mVar.i(a.DAY_OF_WEEK);
                                    int i14 = value2;
                                    if (i13 == i14) {
                                        return mVar;
                                    }
                                    return mVar.d(i13 - i14 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i15 = mVar.i(a.DAY_OF_WEEK);
                                    int i16 = value2;
                                    if (i15 == i16) {
                                        return mVar;
                                    }
                                    return mVar.s(i16 - i15 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.f26255e) {
                fVarD = fVarD.N(1L);
            }
            LocalDateTime localDateTimeF = LocalDateTime.F(fVarD, eVar.f26254d);
            d dVar = eVar.f26256f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.f26257h;
            dVar.getClass();
            int i13 = c.f26249a[dVar.ordinal()];
            if (i13 == 1) {
                localDateTimeF = localDateTimeF.I(zoneOffset2.f26051a - ZoneOffset.UTC.f26051a);
            } else if (i13 == 2) {
                localDateTimeF = localDateTimeF.I(zoneOffset2.f26051a - zoneOffset.f26051a);
            }
            bVarArr3[i12] = new b(localDateTimeF, eVar.f26257h, eVar.f26258i);
            i12++;
            i10 = 0;
        }
        if (i4 < 2100) {
            this.f26268h.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.f26262a, fVar.f26262a) && Arrays.equals(this.f26263b, fVar.f26263b) && Arrays.equals(this.f26264c, fVar.f26264c) && Arrays.equals(this.f26266e, fVar.f26266e) && Arrays.equals(this.f26267f, fVar.f26267f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.f26262a)) ^ Arrays.hashCode(this.f26263b)) ^ Arrays.hashCode(this.f26264c)) ^ Arrays.hashCode(this.f26266e)) ^ Arrays.hashCode(this.f26267f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f26263b[r0.length - 1] + "]";
    }
}
