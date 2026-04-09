package fr;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // fr.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (d().nextInt() >>> (32 - i10));
    }

    @Override // fr.d
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();

    public final int e(int i10) {
        return d().nextInt(i10);
    }
}
