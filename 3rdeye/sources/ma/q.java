package ma;

import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import ra.f;

/* compiled from: ZoneOffset.java */
/* loaded from: classes3.dex */
public final class q extends p implements qa.e, qa.f, Comparable<q> {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f44146e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f44147f = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final q f44148g = j(0);

    /* renamed from: h, reason: collision with root package name */
    public static final q f44149h = j(-64800);
    public static final q i = j(64800);

    /* renamed from: c, reason: collision with root package name */
    public final int f44150c;

    /* renamed from: d, reason: collision with root package name */
    public final transient String f44151d;

    public q(int i10) {
        String string;
        this.f44150c = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb.append(i10 < 0 ? "-" : "+");
            sb.append(i11 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
            sb.append(i11);
            String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
            sb.append(i12 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb.append(i13 < 10 ? ":0" : str);
                sb.append(i13);
            }
            string = sb.toString();
        }
        this.f44151d = string;
    }

    public static q g(qa.e eVar) {
        q qVar = (q) eVar.query(qa.i.f45479e);
        if (qVar != null) {
            return qVar;
        }
        throw new a("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ma.q h(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            com.google.gson.internal.c.v(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = ma.q.f44147f
            java.lang.Object r0 = r0.get(r7)
            ma.q r0 = (ma.q) r0
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
            int r0 = k(r7, r2, r3)
            int r1 = k(r7, r6, r2)
            int r2 = k(r7, r5, r2)
            goto L85
        L37:
            ma.a r0 = new ma.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = k(r7, r2, r3)
            int r1 = k(r7, r1, r3)
            int r2 = k(r7, r4, r3)
            goto L85
        L50:
            int r0 = k(r7, r2, r3)
            int r1 = k(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = k(r7, r2, r3)
            int r1 = k(r7, r1, r3)
            goto L58
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7f:
            int r0 = k(r7, r2, r3)
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
            ma.a r0 = new ma.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            ma.q r7 = i(r7, r0, r1)
            return r7
        La8:
            ma.q r7 = i(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.q.h(java.lang.String):ma.q");
    }

    public static q i(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new a(C4356c.i(i10, "Zone offset hours not in valid range: value ", " is not in the range -18 to 18"));
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i11) > 59) {
            throw new a("Zone offset minutes not in valid range: abs(value) " + Math.abs(i11) + " is not in the range 0 to 59");
        }
        if (Math.abs(i12) > 59) {
            throw new a("Zone offset seconds not in valid range: abs(value) " + Math.abs(i12) + " is not in the range 0 to 59");
        }
        if (Math.abs(i10) == 18 && (Math.abs(i11) > 0 || Math.abs(i12) > 0)) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        return j((i11 * 60) + (i10 * 3600) + i12);
    }

    public static q j(int i10) {
        if (Math.abs(i10) > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 != 0) {
            return new q(i10);
        }
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = f44146e;
        q qVar = (q) concurrentHashMap.get(numValueOf);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new q(i10));
        q qVar2 = (q) concurrentHashMap.get(numValueOf);
        f44147f.putIfAbsent(qVar2.f44151d, qVar2);
        return qVar2;
    }

    public static int k(String str, int i10, boolean z10) {
        if (z10 && str.charAt(i10 - 1) != ':') {
            throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i10);
        char cCharAt2 = str.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static q l(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        return b10 == 127 ? j(objectInput.readInt()) : j(b10 * 900);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 8, this);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        return dVar.r0(this.f44150c, qa.a.OFFSET_SECONDS);
    }

    @Override // ma.p
    public final String b() {
        return this.f44151d;
    }

    @Override // ma.p
    public final ra.f c() {
        return new f.a(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        return qVar.f44150c - this.f44150c;
    }

    @Override // ma.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (this.f44150c == ((q) obj).f44150c) {
                return true;
            }
        }
        return false;
    }

    @Override // ma.p
    public final void f(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        m(objectOutput);
    }

    @Override // qa.e
    public final int get(qa.h hVar) {
        if (hVar == qa.a.OFFSET_SECONDS) {
            return this.f44150c;
        }
        if (androidx.work.s.n(hVar)) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return range(hVar).a(getLong(hVar), hVar);
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        if (hVar == qa.a.OFFSET_SECONDS) {
            return this.f44150c;
        }
        if (hVar instanceof qa.a) {
            throw new a(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.getFrom(this);
    }

    @Override // ma.p
    public final int hashCode() {
        return this.f44150c;
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.OFFSET_SECONDS : hVar != null && hVar.isSupportedBy(this);
    }

    public final void m(DataOutput dataOutput) throws IOException {
        int i10 = this.f44150c;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45479e || jVar == qa.i.f45478d) {
            return this;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45477c || jVar == qa.i.f45476b || jVar == qa.i.f45475a) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // qa.e
    public final qa.m range(qa.h hVar) {
        if (hVar == qa.a.OFFSET_SECONDS) {
            return hVar.range();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.rangeRefinedBy(this);
    }

    @Override // ma.p
    public final String toString() {
        return this.f44151d;
    }
}
