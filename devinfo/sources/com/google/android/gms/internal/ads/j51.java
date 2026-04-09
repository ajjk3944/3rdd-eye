package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j51 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final j51 f12642a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j51[] f12643b;

    static {
        j51 j51Var = new j51("INSTANCE", 0);
        f12642a = j51Var;
        f12643b = new j51[]{j51Var};
    }

    public static j51[] values() {
        return (j51[]) f12643b.clone();
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
        mq0.d0("no calls to next() since the last call to remove()", false);
    }
}
