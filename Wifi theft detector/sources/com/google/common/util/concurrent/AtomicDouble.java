package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public transient AtomicLong f12152a;

    public AtomicDouble(double d10) {
        this.f12152a = new AtomicLong(Double.doubleToRawLongBits(d10));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f12152a = new AtomicLong();
        e(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(d());
    }

    public final double d() {
        return Double.longBitsToDouble(this.f12152a.get());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return d();
    }

    public final void e(double d10) {
        this.f12152a.set(Double.doubleToRawLongBits(d10));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) d();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) d();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) d();
    }

    public String toString() {
        return Double.toString(d());
    }

    public AtomicDouble() {
        this(0.0d);
    }
}
