package ra;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import kotlin.KotlinVersion;
import ma.q;

/* compiled from: Ser.java */
/* loaded from: classes3.dex */
public final class a implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    public byte f45833b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f45834c;

    public a() {
    }

    public static long a(DataInput dataInput) throws IOException {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static Serializable b(byte b10, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    return e.a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long jA = a(dataInput);
            q qVarC = c(dataInput);
            q qVarC2 = c(dataInput);
            if (qVarC.equals(qVarC2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            return new d(jA, qVarC, qVarC2);
        }
        int i = dataInput.readInt();
        long[] jArr = new long[i];
        for (int i10 = 0; i10 < i; i10++) {
            jArr[i10] = a(dataInput);
        }
        int i11 = i + 1;
        q[] qVarArr = new q[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            qVarArr[i12] = c(dataInput);
        }
        int i13 = dataInput.readInt();
        long[] jArr2 = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            jArr2[i14] = a(dataInput);
        }
        int i15 = i13 + 1;
        q[] qVarArr2 = new q[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            qVarArr2[i16] = c(dataInput);
        }
        int i17 = dataInput.readByte();
        e[] eVarArr = new e[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            eVarArr[i18] = e.a(dataInput);
        }
        return new b(jArr, qVarArr, jArr2, qVarArr2, eVarArr);
    }

    public static q c(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? q.j(dataInput.readInt()) : q.j(b10 * 900);
    }

    public static void d(long j4, ObjectOutput objectOutput) throws IOException {
        if (j4 < -4575744000L || j4 >= 10413792000L || j4 % 900 != 0) {
            objectOutput.writeByte(KotlinVersion.MAX_COMPONENT_VALUE);
            objectOutput.writeLong(j4);
        } else {
            int i = (int) ((j4 + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            objectOutput.writeByte((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            objectOutput.writeByte(i & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public static void e(q qVar, ObjectOutput objectOutput) throws IOException {
        int i = qVar.f44150c;
        int i10 = i % 900 == 0 ? i / 900 : 127;
        objectOutput.writeByte(i10);
        if (i10 == 127) {
            objectOutput.writeInt(i);
        }
    }

    private Object readResolve() {
        return this.f45834c;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b10 = objectInput.readByte();
        this.f45833b = b10;
        this.f45834c = b(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f45833b;
        Serializable serializable = this.f45834c;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((e) serializable).writeExternal(objectOutput);
                return;
            } else {
                d dVar = (d) serializable;
                ma.f fVar = dVar.f45848b;
                q qVar = dVar.f45849c;
                d(fVar.m0(qVar), objectOutput);
                e(qVar, objectOutput);
                e(dVar.f45850d, objectOutput);
                return;
            }
        }
        b bVar = (b) serializable;
        long[] jArr = bVar.f45835b;
        objectOutput.writeInt(jArr.length);
        for (long j4 : jArr) {
            d(j4, objectOutput);
        }
        for (q qVar2 : bVar.f45836c) {
            e(qVar2, objectOutput);
        }
        long[] jArr2 = bVar.f45837d;
        objectOutput.writeInt(jArr2.length);
        for (long j10 : jArr2) {
            d(j10, objectOutput);
        }
        for (q qVar3 : bVar.f45839f) {
            e(qVar3, objectOutput);
        }
        e[] eVarArr = bVar.f45840g;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    public a(byte b10, Serializable serializable) {
        this.f45833b = b10;
        this.f45834c = serializable;
    }
}
