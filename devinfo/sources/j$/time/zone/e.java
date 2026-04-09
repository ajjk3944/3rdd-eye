package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.k;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final k f26251a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f26252b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.time.c f26253c;

    /* renamed from: d, reason: collision with root package name */
    public final j$.time.i f26254d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26255e;

    /* renamed from: f, reason: collision with root package name */
    public final d f26256f;
    public final ZoneOffset g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f26257h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f26258i;

    public e(k kVar, int i4, j$.time.c cVar, j$.time.i iVar, boolean z3, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f26251a = kVar;
        this.f26252b = (byte) i4;
        this.f26253c = cVar;
        this.f26254d = iVar;
        this.f26255e = z3;
        this.f26256f = dVar;
        this.g = zoneOffset;
        this.f26257h = zoneOffset2;
        this.f26258i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iO = this.f26255e ? 86400 : this.f26254d.O();
        int i4 = this.g.f26051a;
        int i10 = this.f26257h.f26051a - i4;
        int i11 = this.f26258i.f26051a - i4;
        byte b10 = iO % 3600 == 0 ? this.f26255e ? (byte) 24 : this.f26254d.f26175a : (byte) 31;
        int i12 = i4 % 900 == 0 ? (i4 / 900) + 128 : 255;
        int i13 = (i10 == 0 || i10 == 1800 || i10 == 3600) ? i10 / 1800 : 3;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        j$.time.c cVar = this.f26253c;
        dataOutput.writeInt((this.f26251a.getValue() << 28) + ((this.f26252b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (b10 << 14) + (this.f26256f.ordinal() << 12) + (i12 << 4) + (i13 << 2) + i14);
        if (b10 == 31) {
            dataOutput.writeInt(iO);
        }
        if (i12 == 255) {
            dataOutput.writeInt(i4);
        }
        if (i13 == 3) {
            dataOutput.writeInt(this.f26257h.f26051a);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f26258i.f26051a);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        j$.time.i iVarD;
        int i4;
        int i10;
        int i11 = dataInput.readInt();
        k kVarF = k.F(i11 >>> 28);
        int i12 = ((264241152 & i11) >>> 22) - 32;
        int i13 = (3670016 & i11) >>> 19;
        j$.time.c cVarC = i13 == 0 ? null : j$.time.c.C(i13);
        int i14 = (507904 & i11) >>> 14;
        d dVar2 = d.values()[(i11 & 12288) >>> 12];
        int i15 = (i11 & 4080) >>> 4;
        int i16 = (i11 & 12) >>> 2;
        int i17 = i11 & 3;
        if (i14 == 31) {
            long j = dataInput.readInt();
            j$.time.i iVar = j$.time.i.f26172e;
            j$.time.temporal.a.SECOND_OF_DAY.s(j);
            int i18 = (int) (j / 3600);
            long j8 = j - (i18 * 3600);
            dVar = dVar2;
            iVarD = j$.time.i.D(i18, (int) (j8 / 60), (int) (j8 - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i19 = i14 % 24;
            j$.time.i iVar2 = j$.time.i.f26172e;
            j$.time.temporal.a.HOUR_OF_DAY.s(i19);
            iVarD = j$.time.i.f26174h[i19];
        }
        ZoneOffset zoneOffsetI = ZoneOffset.I(i15 == 255 ? dataInput.readInt() : (i15 - 128) * 900);
        if (i16 == 3) {
            i4 = dataInput.readInt();
        } else {
            i4 = (i16 * 1800) + zoneOffsetI.f26051a;
        }
        ZoneOffset zoneOffsetI2 = ZoneOffset.I(i4);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetI.f26051a;
        }
        ZoneOffset zoneOffsetI3 = ZoneOffset.I(i10);
        boolean z3 = i14 == 24;
        Objects.requireNonNull(kVarF, "month");
        Objects.requireNonNull(iVarD, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetI, "standardOffset");
        Objects.requireNonNull(zoneOffsetI2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetI3, "offsetAfter");
        if (i12 < -28 || i12 > 31 || i12 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z3 && !iVarD.equals(j$.time.i.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (iVarD.f26178d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(kVarF, i12, cVarC, iVarD, z3, dVar3, zoneOffsetI, zoneOffsetI2, zoneOffsetI3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f26251a == eVar.f26251a && this.f26252b == eVar.f26252b && this.f26253c == eVar.f26253c && this.f26256f == eVar.f26256f && this.f26254d.equals(eVar.f26254d) && this.f26255e == eVar.f26255e && this.g.equals(eVar.g) && this.f26257h.equals(eVar.f26257h) && this.f26258i.equals(eVar.f26258i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = ((this.f26254d.O() + (this.f26255e ? 1 : 0)) << 15) + (this.f26251a.ordinal() << 11) + ((this.f26252b + 32) << 5);
        j$.time.c cVar = this.f26253c;
        return ((this.g.f26051a ^ (this.f26256f.ordinal() + (iO + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.f26257h.f26051a) ^ this.f26258i.f26051a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f26258i.f26051a - this.f26257h.f26051a > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f26257h);
        sb2.append(" to ");
        sb2.append(this.f26258i);
        sb2.append(", ");
        j$.time.c cVar = this.f26253c;
        if (cVar != null) {
            byte b10 = this.f26252b;
            if (b10 == -1) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f26251a.name());
            } else if (b10 < 0) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f26252b) - 1);
                sb2.append(" of ");
                sb2.append(this.f26251a.name());
            } else {
                sb2.append(cVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f26251a.name());
                sb2.append(' ');
                sb2.append((int) this.f26252b);
            }
        } else {
            sb2.append(this.f26251a.name());
            sb2.append(' ');
            sb2.append((int) this.f26252b);
        }
        sb2.append(" at ");
        sb2.append(this.f26255e ? "24:00" : this.f26254d.toString());
        sb2.append(" ");
        sb2.append(this.f26256f);
        sb2.append(", standard offset ");
        sb2.append(this.g);
        sb2.append(']');
        return sb2.toString();
    }
}
