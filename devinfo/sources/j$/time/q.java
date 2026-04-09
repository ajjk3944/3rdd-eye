package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f26194a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26195b;

    public q() {
    }

    public q(byte b10, Object obj) {
        this.f26194a = b10;
        this.f26195b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f26194a;
        Object obj = this.f26195b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f26035a);
                objectOutput.writeInt(duration.f26036b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f26038a);
                objectOutput.writeInt(instant.f26039b);
                return;
            case 3:
                f fVar = (f) obj;
                objectOutput.writeInt(fVar.f26118a);
                objectOutput.writeByte(fVar.f26119b);
                objectOutput.writeByte(fVar.f26120c);
                return;
            case 4:
                ((i) obj).R(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                f fVar2 = localDateTime.f26042a;
                objectOutput.writeInt(fVar2.f26118a);
                objectOutput.writeByte(fVar2.f26119b);
                objectOutput.writeByte(fVar2.f26120c);
                localDateTime.f26043b.R(objectOutput);
                return;
            case 6:
                y yVar = (y) obj;
                LocalDateTime localDateTime2 = yVar.f26239a;
                f fVar3 = localDateTime2.f26042a;
                objectOutput.writeInt(fVar3.f26118a);
                objectOutput.writeByte(fVar3.f26119b);
                objectOutput.writeByte(fVar3.f26120c);
                localDateTime2.f26043b.R(objectOutput);
                yVar.f26240b.L(objectOutput);
                yVar.f26241c.F(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).f26236a);
                return;
            case 8:
                ((ZoneOffset) obj).L(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.f26188a.R(objectOutput);
                oVar.f26189b.L(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f26045a;
                f fVar4 = localDateTime3.f26042a;
                objectOutput.writeInt(fVar4.f26118a);
                objectOutput.writeByte(fVar4.f26119b);
                objectOutput.writeByte(fVar4.f26120c);
                localDateTime3.f26043b.R(objectOutput);
                offsetDateTime.f26046b.L(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).f26199a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.f26233a);
                objectOutput.writeByte(uVar.f26234b);
                return;
            case 13:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.f26184a);
                objectOutput.writeByte(mVar.f26185b);
                return;
            case 14:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.f26191a);
                objectOutput.writeInt(pVar.f26192b);
                objectOutput.writeInt(pVar.f26193c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f26194a = b10;
        this.f26195b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f26034c;
                long j = objectInput.readLong();
                long j8 = objectInput.readInt();
                return Duration.i(j$.com.android.tools.r8.a.x(j, j$.com.android.tools.r8.a.B(j8, 1000000000L)), (int) j$.com.android.tools.r8.a.A(j8, 1000000000L));
            case 2:
                Instant instant = Instant.f26037c;
                return Instant.D(objectInput.readLong(), objectInput.readInt());
            case 3:
                f fVar = f.f26116d;
                return f.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return i.M(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f26040c;
                f fVar2 = f.f26116d;
                return LocalDateTime.F(f.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.M(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f26040c;
                f fVar3 = f.f26116d;
                LocalDateTime localDateTimeF = LocalDateTime.F(f.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.M(objectInput));
                ZoneOffset zoneOffsetK = ZoneOffset.K(objectInput);
                v vVar = (v) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeF, "localDateTime");
                Objects.requireNonNull(zoneOffsetK, "offset");
                Objects.requireNonNull(vVar, "zone");
                if (!(vVar instanceof ZoneOffset) || zoneOffsetK.equals(vVar)) {
                    return new y(localDateTimeF, vVar, zoneOffsetK);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i4 = w.f26235c;
                String utf = objectInput.readUTF();
                Objects.requireNonNull(utf, "zoneId");
                return (utf.length() <= 1 || utf.startsWith("+") || utf.startsWith("-")) ? ZoneOffset.G(utf) : (utf.startsWith("UTC") || utf.startsWith("GMT")) ? v.E(utf, 3) : utf.startsWith("UT") ? v.E(utf, 2) : w.G(utf);
            case 8:
                return ZoneOffset.K(objectInput);
            case 9:
                int i10 = o.f26187c;
                return new o(i.M(objectInput), ZoneOffset.K(objectInput));
            case 10:
                int i11 = OffsetDateTime.f26044c;
                f fVar4 = f.f26116d;
                return new OffsetDateTime(LocalDateTime.F(f.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.M(objectInput)), ZoneOffset.K(objectInput));
            case 11:
                int i12 = s.f26198b;
                return s.C(objectInput.readInt());
            case 12:
                int i13 = u.f26232c;
                int i14 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.s(i14);
                j$.time.temporal.a.MONTH_OF_YEAR.s(b11);
                return new u(i14, b11);
            case 13:
                int i15 = m.f26183c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                k kVarF = k.F(b12);
                Objects.requireNonNull(kVarF, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b13);
                if (b13 <= kVarF.E()) {
                    return new m(kVarF.getValue(), b13);
                }
                throw new a("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + kVarF.name());
            case 14:
                p pVar = p.f26190d;
                int i16 = objectInput.readInt();
                int i17 = objectInput.readInt();
                int i18 = objectInput.readInt();
                return ((i16 | i17) | i18) == 0 ? p.f26190d : new p(i16, i17, i18);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f26195b;
    }
}
