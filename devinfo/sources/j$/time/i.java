package j$.time;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final i f26172e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f26173f;
    public static final i g;

    /* renamed from: h, reason: collision with root package name */
    public static final i[] f26174h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f26175a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f26176b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f26177c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26178d;

    static {
        int i4 = 0;
        while (true) {
            i[] iVarArr = f26174h;
            if (i4 < iVarArr.length) {
                iVarArr[i4] = new i(i4, 0, 0, 0);
                i4++;
            } else {
                i iVar = iVarArr[0];
                g = iVar;
                i iVar2 = iVarArr[12];
                f26172e = iVar;
                f26173f = new i(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static i G(long j) {
        j$.time.temporal.a.NANO_OF_DAY.s(j);
        int i4 = (int) (j / 3600000000000L);
        long j8 = j - (i4 * 3600000000000L);
        int i10 = (int) (j8 / 60000000000L);
        long j9 = j8 - (i10 * 60000000000L);
        int i11 = (int) (j9 / 1000000000);
        return D(i4, i10, i11, (int) (j9 - (i11 * 1000000000)));
    }

    public static i E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        i iVar = (i) nVar.l(j$.time.temporal.r.g);
        if (iVar != null) {
            return iVar;
        }
        throw new a("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static i D(int i4, int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f26174h[i4];
        }
        return new i(i4, i10, i11, i12);
    }

    public i(int i4, int i10, int i11, int i12) {
        this.f26175a = (byte) i4;
        this.f26176b = (byte) i10;
        this.f26177c = (byte) i11;
        this.f26178d = i12;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w();
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return N();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return N() / 1000;
            }
            return F(qVar);
        }
        return qVar.l(this);
    }

    public final int F(j$.time.temporal.q qVar) {
        switch (h.f26170a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f26178d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f26178d / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f26178d / 1000000;
            case 6:
                return (int) (N() / 1000000);
            case 7:
                return this.f26177c;
            case 8:
                return O();
            case 9:
                return this.f26176b;
            case 10:
                return (this.f26175a * 60) + this.f26176b;
            case 11:
                return this.f26175a % 12;
            case 12:
                int i4 = this.f26175a % 12;
                if (i4 % 12 == 0) {
                    return 12;
                }
                return i4;
            case 13:
                return this.f26175a;
            case 14:
                byte b10 = this.f26175a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f26175a / 12;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final i c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (i) qVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j);
        switch (h.f26170a[aVar.ordinal()]) {
            case 1:
                return Q((int) j);
            case 2:
                return G(j);
            case 3:
                return Q(((int) j) * 1000);
            case 4:
                return G(j * 1000);
            case 5:
                return Q(((int) j) * 1000000);
            case 6:
                return G(j * 1000000);
            case 7:
                int i4 = (int) j;
                if (this.f26177c != i4) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.s(i4);
                    return D(this.f26175a, this.f26176b, i4, this.f26178d);
                }
                return this;
            case 8:
                return L(j - O());
            case 9:
                int i10 = (int) j;
                if (this.f26176b != i10) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.s(i10);
                    return D(this.f26175a, i10, this.f26177c, this.f26178d);
                }
                return this;
            case 10:
                return J(j - ((this.f26175a * 60) + this.f26176b));
            case 11:
                return I(j - (this.f26175a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return I(j - (this.f26175a % 12));
            case 13:
                int i11 = (int) j;
                if (this.f26175a != i11) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i11);
                    return D(i11, this.f26176b, this.f26177c, this.f26178d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i12 = (int) j;
                if (this.f26175a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i12);
                    return D(i12, this.f26176b, this.f26177c, this.f26178d);
                }
                return this;
            case 15:
                return I((j - (this.f26175a / 12)) * 12);
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final i Q(int i4) {
        if (this.f26178d == i4) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i4);
        return D(this.f26175a, this.f26176b, this.f26177c, i4);
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (h.f26171b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return K(j);
                case 2:
                    return K((j % 86400000000L) * 1000);
                case 3:
                    return K((j % 86400000) * 1000000);
                case 4:
                    return L(j);
                case 5:
                    return J(j);
                case 6:
                    return I(j);
                case 7:
                    return I((j % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (i) sVar.i(this, j);
    }

    public final i I(long j) {
        return j == 0 ? this : D(((((int) (j % 24)) + this.f26175a) + 24) % 24, this.f26176b, this.f26177c, this.f26178d);
    }

    public final i J(long j) {
        if (j != 0) {
            int i4 = (this.f26175a * 60) + this.f26176b;
            int i10 = ((((int) (j % 1440)) + i4) + 1440) % 1440;
            if (i4 != i10) {
                return D(i10 / 60, i10 % 60, this.f26177c, this.f26178d);
            }
        }
        return this;
    }

    public final i L(long j) {
        if (j != 0) {
            int i4 = (this.f26176b * 60) + (this.f26175a * 3600) + this.f26177c;
            int i10 = ((((int) (j % 86400)) + i4) + 86400) % 86400;
            if (i4 != i10) {
                return D(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f26178d);
            }
        }
        return this;
    }

    public final i K(long j) {
        if (j != 0) {
            long jN = N();
            long j8 = (((j % 86400000000000L) + jN) + 86400000000000L) % 86400000000000L;
            if (jN != j8) {
                return D((int) (j8 / 3600000000000L), (int) ((j8 / 60000000000L) % 60), (int) ((j8 / 1000000000) % 60), (int) (j8 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26223b || aVar == j$.time.temporal.r.f26222a || aVar == j$.time.temporal.r.f26226e || aVar == j$.time.temporal.r.f26225d) {
            return null;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this;
        }
        if (aVar == j$.time.temporal.r.f26227f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int O() {
        return (this.f26176b * 60) + (this.f26175a * 3600) + this.f26177c;
    }

    public final long N() {
        return (this.f26177c * 1000000000) + (this.f26176b * 60000000000L) + (this.f26175a * 3600000000000L) + this.f26178d;
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        int iCompare = Integer.compare(this.f26175a, iVar.f26175a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f26176b, iVar.f26176b)) == 0 && (iCompare = Integer.compare(this.f26177c, iVar.f26177c)) == 0) ? Integer.compare(this.f26178d, iVar.f26178d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f26175a == iVar.f26175a && this.f26176b == iVar.f26176b && this.f26177c == iVar.f26177c && this.f26178d == iVar.f26178d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (i) j$.com.android.tools.r8.a.a(fVar, this);
    }

    public final int hashCode() {
        long jN = N();
        return (int) (jN ^ (jN >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f26175a;
        byte b11 = this.f26176b;
        byte b12 = this.f26177c;
        int i4 = this.f26178d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i4 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i4 > 0) {
                sb2.append('.');
                if (i4 % 1000000 == 0) {
                    sb2.append(Integer.toString((i4 / 1000000) + 1000).substring(1));
                } else if (i4 % 1000 == 0) {
                    sb2.append(Integer.toString((i4 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i4 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void R(DataOutput dataOutput) throws IOException {
        if (this.f26178d == 0) {
            if (this.f26177c == 0) {
                if (this.f26176b == 0) {
                    dataOutput.writeByte(~this.f26175a);
                    return;
                } else {
                    dataOutput.writeByte(this.f26175a);
                    dataOutput.writeByte(~this.f26176b);
                    return;
                }
            }
            dataOutput.writeByte(this.f26175a);
            dataOutput.writeByte(this.f26176b);
            dataOutput.writeByte(~this.f26177c);
            return;
        }
        dataOutput.writeByte(this.f26175a);
        dataOutput.writeByte(this.f26176b);
        dataOutput.writeByte(this.f26177c);
        dataOutput.writeInt(this.f26178d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static i M(DataInput dataInput) throws IOException {
        int i4;
        int i10;
        int i11 = dataInput.readByte();
        byte b10 = 0;
        if (i11 < 0) {
            i11 = ~i11;
            i10 = 0;
            i4 = 0;
        } else {
            byte b11 = dataInput.readByte();
            if (b11 < 0) {
                ?? r72 = ~b11;
                i4 = 0;
                b10 = r72;
                i10 = 0;
            } else {
                byte b12 = dataInput.readByte();
                if (b12 < 0) {
                    i10 = ~b12;
                    i4 = 0;
                    b10 = b11;
                } else {
                    i4 = dataInput.readInt();
                    b10 = b11;
                    i10 = b12;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.s(i11);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(b10);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i10);
        j$.time.temporal.a.NANO_OF_SECOND.s(i4);
        return D(i11, b10, i10, i4);
    }
}
