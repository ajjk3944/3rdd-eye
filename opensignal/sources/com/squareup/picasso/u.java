package com.squareup.picasso;

/* loaded from: classes.dex */
public enum u {
    MICRO(3, 96, 96),
    MINI(1, 512, 384),
    FULL(2, -1, -1);

    final int androidKind;
    final int height;
    final int width;

    u(int i10, int i11, int i12) {
        this.androidKind = i10;
        this.width = i11;
        this.height = i12;
    }
}
