package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class LongAdder extends Striped64 implements Serializable, b {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f12086c = 0;
        this.f12084a = null;
        this.f12085b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(k());
    }

    @Override // com.google.common.hash.b
    public void add(long j10) {
        int length;
        Striped64.b bVar;
        Striped64.b[] bVarArr = this.f12084a;
        if (bVarArr == null) {
            long j11 = this.f12085b;
            if (e(j11, j11 + j10)) {
                return;
            }
        }
        int[] iArr = (int[]) Striped64.f12078d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j12 = bVar.f12089a;
            zA = bVar.a(j12, j12 + j10);
            if (zA) {
                return;
            }
        }
        j(j10, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return k();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return k();
    }

    @Override // com.google.common.hash.Striped64
    public final long h(long j10, long j11) {
        return j10 + j11;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) k();
    }

    public long k() {
        long j10 = this.f12085b;
        Striped64.b[] bVarArr = this.f12084a;
        if (bVarArr != null) {
            for (Striped64.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f12089a;
                }
            }
        }
        return j10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return k();
    }

    public String toString() {
        return Long.toString(k());
    }
}
