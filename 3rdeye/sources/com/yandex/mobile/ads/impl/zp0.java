package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class zp0 implements Iterator<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final zp0 f36585b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ zp0[] f36586c;

    static {
        zp0 zp0Var = new zp0();
        f36585b = zp0Var;
        f36586c = new zp0[]{zp0Var};
    }

    private zp0() {
    }

    public static zp0 valueOf(String str) {
        return (zp0) Enum.valueOf(zp0.class, str);
    }

    public static zp0[] values() {
        return (zp0[]) f36586c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
