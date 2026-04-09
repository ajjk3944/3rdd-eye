package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes2.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* renamed from: a, reason: collision with root package name */
    public static final UnsignedInteger f12107a = b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final UnsignedInteger f12108b = b(1);

    /* renamed from: c, reason: collision with root package name */
    public static final UnsignedInteger f12109c = b(-1);
    private final int value;

    public UnsignedInteger(int i10) {
        this.value = i10;
    }

    public static UnsignedInteger b(int i10) {
        return new UnsignedInteger(i10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(UnsignedInteger unsignedInteger) {
        com.google.common.base.g.m(unsignedInteger);
        return g.a(this.value, unsignedInteger.value);
    }

    public String c(int i10) {
        return g.d(this.value, i10);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.value == ((UnsignedInteger) obj).value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.value;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return g.c(this.value);
    }

    public String toString() {
        return c(10);
    }
}
