package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    public byte f26242a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26243b;

    public a() {
    }

    public a(byte b10, Object obj) {
        this.f26242a = b10;
        this.f26243b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f26242a;
        Object obj = this.f26243b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                b bVar = (b) obj;
                c(bVar.f26245a, objectOutput);
                d(bVar.f26247c, objectOutput);
                d(bVar.f26248d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) obj).g.getID());
                return;
            }
        }
        f fVar = (f) obj;
        objectOutput.writeInt(fVar.f26262a.length);
        for (long j : fVar.f26262a) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f26263b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(fVar.f26264c.length);
        for (long j8 : fVar.f26264c) {
            c(j8, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f26266e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(fVar.f26267f.length);
        for (e eVar : fVar.f26267f) {
            eVar.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object fVar;
        byte b10 = objectInput.readByte();
        this.f26242a = b10;
        if (b10 == 1) {
            long[] jArr = f.f26259i;
            int i4 = objectInput.readInt();
            long[] jArr2 = i4 == 0 ? jArr : new long[i4];
            for (int i10 = 0; i10 < i4; i10++) {
                jArr2[i10] = a(objectInput);
            }
            int i11 = i4 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                zoneOffsetArr[i12] = b(objectInput);
            }
            int i13 = objectInput.readInt();
            if (i13 != 0) {
                jArr = new long[i13];
            }
            long[] jArr3 = jArr;
            for (int i14 = 0; i14 < i13; i14++) {
                jArr3[i14] = a(objectInput);
            }
            int i15 = i13 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                zoneOffsetArr2[i16] = b(objectInput);
            }
            int i17 = objectInput.readByte();
            e[] eVarArr = i17 == 0 ? f.j : new e[i17];
            for (int i18 = 0; i18 < i17; i18++) {
                eVarArr[i18] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b10 == 2) {
            int i19 = b.f26244e;
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b10 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b10 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f26243b = fVar;
    }

    private Object readResolve() {
        return this.f26243b;
    }

    public static ZoneOffset b(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? ZoneOffset.I(dataInput.readInt()) : ZoneOffset.I(b10 * 900);
    }

    public static void c(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i4 = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i4 >>> 16) & 255);
            dataOutput.writeByte((i4 >>> 8) & 255);
            dataOutput.writeByte(i4 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int i4 = zoneOffset.f26051a;
        int i10 = i4 % 900 == 0 ? i4 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i4);
        }
    }
}
