package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WB implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final WB f12185a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WB[] f12186b;

    static {
        WB wb = new WB("INSTANCE", 0);
        f12185a = wb;
        f12186b = new WB[]{wb};
    }

    public static WB[] values() {
        return (WB[]) f12186b.clone();
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
        AbstractC0582Jp.i0("no calls to next() since the last call to remove()", false);
    }
}
