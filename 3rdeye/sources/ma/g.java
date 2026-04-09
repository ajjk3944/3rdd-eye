package ma;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: LocalTime.java */
/* loaded from: classes3.dex */
public final class g extends I9.g implements qa.d, qa.f, Comparable<g>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f44107f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f44108g;

    /* renamed from: h, reason: collision with root package name */
    public static final g[] f44109h = new g[24];

    /* renamed from: b, reason: collision with root package name */
    public final byte f44110b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f44111c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f44112d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44113e;

    /* compiled from: LocalTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44114a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44115b;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44115b = iArr;
            try {
                iArr[qa.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44115b[qa.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44115b[qa.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44115b[qa.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44115b[qa.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44115b[qa.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44115b[qa.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[qa.a.values().length];
            f44114a = iArr2;
            try {
                iArr2[qa.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44114a[qa.a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44114a[qa.a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44114a[qa.a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44114a[qa.a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44114a[qa.a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44114a[qa.a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44114a[qa.a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44114a[qa.a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44114a[qa.a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44114a[qa.a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44114a[qa.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44114a[qa.a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44114a[qa.a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f44114a[qa.a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i = 0;
        while (true) {
            g[] gVarArr = f44109h;
            if (i >= gVarArr.length) {
                g gVar = gVarArr[0];
                g gVar2 = gVarArr[12];
                f44107f = gVar;
                f44108g = new g(23, 59, 59, 999999999);
                return;
            }
            gVarArr[i] = new g(i, 0, 0, 0);
            i++;
        }
    }

    public g(int i, int i10, int i11, int i12) {
        this.f44110b = (byte) i;
        this.f44111c = (byte) i10;
        this.f44112d = (byte) i11;
        this.f44113e = i12;
    }

    public static g j0(int i, int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f44109h[i] : new g(i, i10, i11, i12);
    }

    public static g k0(qa.e eVar) {
        g gVar = (g) eVar.query(qa.i.f45481g);
        if (gVar != null) {
            return gVar;
        }
        throw new ma.a("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    public static g m0(long j4) {
        qa.a.NANO_OF_DAY.checkValidValue(j4);
        int i = (int) (j4 / 3600000000000L);
        long j10 = j4 - (i * 3600000000000L);
        int i10 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i10 * 60000000000L);
        int i11 = (int) (j11 / 1000000000);
        return j0(i, i10, i11, (int) (j11 - (i11 * 1000000000)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static g s0(ObjectInput objectInput) throws IOException {
        int i;
        int i10;
        int i11 = objectInput.readByte();
        byte b10 = 0;
        if (i11 < 0) {
            i11 = ~i11;
            i10 = 0;
            i = 0;
        } else {
            byte b11 = objectInput.readByte();
            if (b11 < 0) {
                ?? r72 = ~b11;
                i = 0;
                b10 = r72;
                i10 = 0;
            } else {
                byte b12 = objectInput.readByte();
                if (b12 < 0) {
                    i10 = ~b12;
                    i = 0;
                    b10 = b11;
                } else {
                    i = objectInput.readInt();
                    b10 = b11;
                    i10 = b12;
                }
            }
        }
        qa.a.HOUR_OF_DAY.checkValidValue(i11);
        qa.a.MINUTE_OF_HOUR.checkValidValue(b10);
        qa.a.SECOND_OF_MINUTE.checkValidValue(i10);
        qa.a.NANO_OF_SECOND.checkValidValue(i);
        return j0(i11, b10, i10, i);
    }

    private Object writeReplace() {
        return new m((byte) 5, this);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        return dVar.r0(t0(), qa.a.NANO_OF_DAY);
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return (g) eVar.adjustInto(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f44110b == gVar.f44110b && this.f44111c == gVar.f44111c && this.f44112d == gVar.f44112d && this.f44113e == gVar.f44113e) {
                return true;
            }
        }
        return false;
    }

    @Override // I9.g, qa.e
    public final int get(qa.h hVar) {
        return hVar instanceof qa.a ? l0(hVar) : super.get(hVar);
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.NANO_OF_DAY ? t0() : hVar == qa.a.MICRO_OF_DAY ? t0() / 1000 : l0(hVar) : hVar.getFrom(this);
    }

    public final int hashCode() {
        long jT0 = t0();
        return (int) (jT0 ^ (jT0 >>> 32));
    }

    @Override // java.lang.Comparable
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        byte b10 = gVar.f44110b;
        byte b11 = this.f44110b;
        int i = b11 < b10 ? -1 : b11 > b10 ? 1 : 0;
        if (i == 0) {
            byte b12 = this.f44111c;
            byte b13 = gVar.f44111c;
            i = b12 < b13 ? -1 : b12 > b13 ? 1 : 0;
            if (i == 0) {
                byte b14 = this.f44112d;
                byte b15 = gVar.f44112d;
                i = b14 < b15 ? -1 : b14 > b15 ? 1 : 0;
                if (i == 0) {
                    int i10 = this.f44113e;
                    int i11 = gVar.f44113e;
                    if (i10 < i11) {
                        return -1;
                    }
                    return i10 > i11 ? 1 : 0;
                }
            }
        }
        return i;
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() : hVar != null && hVar.isSupportedBy(this);
    }

    public final int l0(qa.h hVar) {
        int i = a.f44114a[((qa.a) hVar).ordinal()];
        byte b10 = this.f44111c;
        int i10 = this.f44113e;
        byte b11 = this.f44110b;
        switch (i) {
            case 1:
                return i10;
            case 2:
                throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
            case 3:
                return i10 / 1000;
            case 4:
                throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
            case 5:
                return i10 / 1000000;
            case 6:
                return (int) (t0() / 1000000);
            case 7:
                return this.f44112d;
            case 8:
                return u0();
            case 9:
                return b10;
            case 10:
                return (b11 * 60) + b10;
            case 11:
                return b11 % 12;
            case 12:
                int i11 = b11 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 14:
                if (b11 == 0) {
                    return 24;
                }
            case 13:
                return b11;
            case 15:
                return b11 / 12;
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    @Override // qa.d
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final g q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (g) kVar.addTo(this, j4);
        }
        switch (a.f44115b[((qa.b) kVar).ordinal()]) {
            case 1:
                return q0(j4);
            case 2:
                return q0((j4 % 86400000000L) * 1000);
            case 3:
                return q0((j4 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return r0(j4);
            case 5:
                return p0(j4);
            case 6:
                return o0(j4);
            case 7:
                return o0((j4 % 2) * 12);
            default:
                throw new qa.l("Unsupported unit: " + kVar);
        }
    }

    public final g o0(long j4) {
        if (j4 == 0) {
            return this;
        }
        return j0(((((int) (j4 % 24)) + this.f44110b) + 24) % 24, this.f44111c, this.f44112d, this.f44113e);
    }

    public final g p0(long j4) {
        if (j4 != 0) {
            int i = (this.f44110b * 60) + this.f44111c;
            int i10 = ((((int) (j4 % 1440)) + i) + 1440) % 1440;
            if (i != i10) {
                return j0(i10 / 60, i10 % 60, this.f44112d, this.f44113e);
            }
        }
        return this;
    }

    public final g q0(long j4) {
        if (j4 != 0) {
            long jT0 = t0();
            long j10 = (((j4 % 86400000000000L) + jT0) + 86400000000000L) % 86400000000000L;
            if (jT0 != j10) {
                return j0((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.NANOS;
        }
        if (jVar == qa.i.f45481g) {
            return this;
        }
        if (jVar == qa.i.f45476b || jVar == qa.i.f45475a || jVar == qa.i.f45478d || jVar == qa.i.f45479e || jVar == qa.i.f45480f) {
            return null;
        }
        return jVar.a(this);
    }

    public final g r0(long j4) {
        if (j4 != 0) {
            int i = (this.f44111c * 60) + (this.f44110b * 3600) + this.f44112d;
            int i10 = ((((int) (j4 % 86400)) + i) + 86400) % 86400;
            if (i != i10) {
                return j0(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f44113e);
            }
        }
        return this;
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        g gVarK0 = k0(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, gVarK0);
        }
        long jT0 = gVarK0.t0() - t0();
        switch (a.f44115b[bVar.ordinal()]) {
            case 1:
                return jT0;
            case 2:
                return jT0 / 1000;
            case 3:
                return jT0 / 1000000;
            case 4:
                return jT0 / 1000000000;
            case 5:
                return jT0 / 60000000000L;
            case 6:
                return jT0 / 3600000000000L;
            case 7:
                return jT0 / 43200000000000L;
            default:
                throw new qa.l("Unsupported unit: " + bVar);
        }
    }

    public final long t0() {
        return (this.f44112d * 1000000000) + (this.f44111c * 60000000000L) + (this.f44110b * 3600000000000L) + this.f44113e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b10 = this.f44110b;
        sb.append(b10 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb.append((int) b10);
        String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        byte b11 = this.f44111c;
        sb.append(b11 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append((int) b11);
        byte b12 = this.f44112d;
        int i = this.f44113e;
        if (b12 > 0 || i > 0) {
            if (b12 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append((int) b12);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }

    public final int u0() {
        return (this.f44111c * 60) + (this.f44110b * 3600) + this.f44112d;
    }

    @Override // qa.d
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final g r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (g) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = a.f44114a[aVar.ordinal()];
        byte b10 = this.f44111c;
        byte b11 = this.f44112d;
        int i10 = this.f44113e;
        byte b12 = this.f44110b;
        switch (i) {
            case 1:
                return w0((int) j4);
            case 2:
                return m0(j4);
            case 3:
                return w0(((int) j4) * 1000);
            case 4:
                return m0(j4 * 1000);
            case 5:
                return w0(((int) j4) * 1000000);
            case 6:
                return m0(j4 * 1000000);
            case 7:
                int i11 = (int) j4;
                if (b11 != i11) {
                    qa.a.SECOND_OF_MINUTE.checkValidValue(i11);
                    return j0(b12, b10, i11, i10);
                }
                return this;
            case 8:
                return r0(j4 - u0());
            case 9:
                int i12 = (int) j4;
                if (b10 != i12) {
                    qa.a.MINUTE_OF_HOUR.checkValidValue(i12);
                    return j0(b12, i12, b11, i10);
                }
                return this;
            case 10:
                return p0(j4 - ((b12 * 60) + b10));
            case 11:
                return o0(j4 - (b12 % 12));
            case 12:
                if (j4 == 12) {
                    j4 = 0;
                }
                return o0(j4 - (b12 % 12));
            case 13:
                int i13 = (int) j4;
                if (b12 != i13) {
                    qa.a.HOUR_OF_DAY.checkValidValue(i13);
                    return j0(i13, b10, b11, i10);
                }
                return this;
            case 14:
                if (j4 == 24) {
                    j4 = 0;
                }
                int i14 = (int) j4;
                if (b12 != i14) {
                    qa.a.HOUR_OF_DAY.checkValidValue(i14);
                    return j0(i14, b10, b11, i10);
                }
                return this;
            case 15:
                return o0((j4 - (b12 / 12)) * 12);
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    public final g w0(int i) {
        if (this.f44113e == i) {
            return this;
        }
        qa.a.NANO_OF_SECOND.checkValidValue(i);
        return j0(this.f44110b, this.f44111c, this.f44112d, i);
    }

    public final void x0(DataOutput dataOutput) throws IOException {
        byte b10 = this.f44112d;
        byte b11 = this.f44110b;
        byte b12 = this.f44111c;
        int i = this.f44113e;
        if (i != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b10);
            dataOutput.writeInt(i);
            return;
        }
        if (b10 != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(~b10);
        } else if (b12 == 0) {
            dataOutput.writeByte(~b11);
        } else {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(~b12);
        }
    }
}
