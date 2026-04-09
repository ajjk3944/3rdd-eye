package com.squareup.picasso;

/* loaded from: classes.dex */
public enum w {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    w(int i10) {
        this.index = i10;
    }

    public static boolean shouldReadFromMemoryCache(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
