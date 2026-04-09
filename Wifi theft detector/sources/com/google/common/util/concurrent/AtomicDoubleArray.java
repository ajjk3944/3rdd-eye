package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes2.dex */
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public transient AtomicLongArray f12153a;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        ImmutableLongArray.b bVarG = ImmutableLongArray.g();
        for (int i11 = 0; i11 < i10; i11++) {
            bVarG.a(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f12153a = new AtomicLongArray(bVarG.b().l());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int iD = d();
        objectOutputStream.writeInt(iD);
        for (int i10 = 0; i10 < iD; i10++) {
            objectOutputStream.writeDouble(a(i10));
        }
    }

    public final double a(int i10) {
        return Double.longBitsToDouble(this.f12153a.get(i10));
    }

    public final int d() {
        return this.f12153a.length();
    }

    public String toString() {
        int iD = d();
        int i10 = iD - 1;
        if (i10 == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(iD * 19);
        sb.append('[');
        int i11 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f12153a.get(i11)));
            if (i11 == i10) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i11++;
        }
    }
}
