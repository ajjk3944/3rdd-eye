package ra;

import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import ma.q;

/* compiled from: ZoneOffsetTransitionRule.java */
/* loaded from: classes3.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final ma.h f45851b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f45852c;

    /* renamed from: d, reason: collision with root package name */
    public final ma.b f45853d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.g f45854e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45855f;

    /* renamed from: g, reason: collision with root package name */
    public final b f45856g;

    /* renamed from: h, reason: collision with root package name */
    public final q f45857h;
    public final q i;

    /* renamed from: j, reason: collision with root package name */
    public final q f45858j;

    /* compiled from: ZoneOffsetTransitionRule.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45859a;

        static {
            int[] iArr = new int[b.values().length];
            f45859a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45859a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ZoneOffsetTransitionRule.java */
    public enum b {
        UTC,
        WALL,
        STANDARD;

        public ma.f createDateTime(ma.f fVar, q qVar, q qVar2) {
            int i = a.f45859a[ordinal()];
            return i != 1 ? i != 2 ? fVar : fVar.x0(qVar2.f44150c - qVar.f44150c) : fVar.x0(qVar2.f44150c - q.f44148g.f44150c);
        }
    }

    public e(ma.h hVar, int i, ma.b bVar, ma.g gVar, int i10, b bVar2, q qVar, q qVar2, q qVar3) {
        this.f45851b = hVar;
        this.f45852c = (byte) i;
        this.f45853d = bVar;
        this.f45854e = gVar;
        this.f45855f = i10;
        this.f45856g = bVar2;
        this.f45857h = qVar;
        this.i = qVar2;
        this.f45858j = qVar3;
    }

    public static e a(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        ma.h hVarOf = ma.h.of(i >>> 28);
        int i10 = ((264241152 & i) >>> 22) - 32;
        int i11 = (3670016 & i) >>> 19;
        ma.b bVarOf = i11 == 0 ? null : ma.b.of(i11);
        int i12 = (507904 & i) >>> 14;
        b bVar = b.values()[(i & 12288) >>> 12];
        int i13 = (i & 4080) >>> 4;
        int i14 = (i & 12) >>> 2;
        int i15 = i & 3;
        int i16 = i12 == 31 ? dataInput.readInt() : i12 * 3600;
        q qVarJ = q.j(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        int i17 = qVarJ.f44150c;
        q qVarJ2 = q.j(i14 == 3 ? dataInput.readInt() : (i14 * 1800) + i17);
        q qVarJ3 = i15 == 3 ? q.j(dataInput.readInt()) : q.j((i15 * 1800) + i17);
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        long j4 = ((i16 % 86400) + 86400) % 86400;
        ma.g gVar = ma.g.f44107f;
        qa.a.SECOND_OF_DAY.checkValidValue(j4);
        int i18 = (int) (j4 / 3600);
        long j10 = j4 - (i18 * 3600);
        return new e(hVarOf, i10, bVarOf, ma.g.j0(i18, (int) (j10 / 60), (int) (j10 - (r7 * 60)), 0), i16 >= 0 ? i16 / 86400 : ((i16 + 1) / 86400) - 1, bVar, qVarJ, qVarJ2, qVarJ3);
    }

    private Object writeReplace() {
        return new ra.a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f45851b == eVar.f45851b && this.f45852c == eVar.f45852c && this.f45853d == eVar.f45853d && this.f45856g == eVar.f45856g && this.f45855f == eVar.f45855f && this.f45854e.equals(eVar.f45854e) && this.f45857h.equals(eVar.f45857h) && this.i.equals(eVar.i) && this.f45858j.equals(eVar.f45858j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iU0 = ((this.f45854e.u0() + this.f45855f) << 15) + (this.f45851b.ordinal() << 11) + ((this.f45852c + 32) << 5);
        ma.b bVar = this.f45853d;
        return ((this.f45857h.f44150c ^ (this.f45856g.ordinal() + (iU0 + ((bVar == null ? 7 : bVar.ordinal()) << 2)))) ^ this.i.f44150c) ^ this.f45858j.f44150c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        q qVar = this.i;
        q qVar2 = this.f45858j;
        sb.append(qVar2.f44150c - qVar.f44150c > 0 ? "Gap " : "Overlap ");
        sb.append(qVar);
        sb.append(" to ");
        sb.append(qVar2);
        sb.append(", ");
        ma.h hVar = this.f45851b;
        byte b10 = this.f45852c;
        ma.b bVar = this.f45853d;
        if (bVar == null) {
            sb.append(hVar.name());
            sb.append(' ');
            sb.append((int) b10);
        } else if (b10 == -1) {
            sb.append(bVar.name());
            sb.append(" on or before last day of ");
            sb.append(hVar.name());
        } else if (b10 < 0) {
            sb.append(bVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b10) - 1);
            sb.append(" of ");
            sb.append(hVar.name());
        } else {
            sb.append(bVar.name());
            sb.append(" on or after ");
            sb.append(hVar.name());
            sb.append(' ');
            sb.append((int) b10);
        }
        sb.append(" at ");
        ma.g gVar = this.f45854e;
        int i = this.f45855f;
        if (i == 0) {
            sb.append(gVar);
        } else {
            long jU0 = (i * 1440) + (gVar.u0() / 60);
            long jO = com.google.gson.internal.c.o(jU0, 60L);
            if (jO < 10) {
                sb.append(0);
            }
            sb.append(jO);
            sb.append(':');
            long jP = com.google.gson.internal.c.p(60, jU0);
            if (jP < 10) {
                sb.append(0);
            }
            sb.append(jP);
        }
        sb.append(" ");
        sb.append(this.f45856g);
        sb.append(", standard offset ");
        sb.append(this.f45857h);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ma.g gVar = this.f45854e;
        int iU0 = (this.f45855f * 86400) + gVar.u0();
        q qVar = this.f45857h;
        int i = this.i.f44150c;
        int i10 = qVar.f44150c;
        int i11 = i - i10;
        int i12 = this.f45858j.f44150c;
        int i13 = i12 - i10;
        byte b10 = (iU0 % 3600 != 0 || iU0 > 86400) ? (byte) 31 : iU0 == 86400 ? (byte) 24 : gVar.f44110b;
        int i14 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i15 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i16 = (i13 == 0 || i13 == 1800 || i13 == 3600) ? i13 / 1800 : 3;
        ma.b bVar = this.f45853d;
        objectOutput.writeInt((this.f45851b.getValue() << 28) + ((this.f45852c + 32) << 22) + ((bVar == null ? 0 : bVar.getValue()) << 19) + (b10 << 14) + (this.f45856g.ordinal() << 12) + (i14 << 4) + (i15 << 2) + i16);
        if (b10 == 31) {
            objectOutput.writeInt(iU0);
        }
        if (i14 == 255) {
            objectOutput.writeInt(i10);
        }
        if (i15 == 3) {
            objectOutput.writeInt(i);
        }
        if (i16 == 3) {
            objectOutput.writeInt(i12);
        }
    }
}
