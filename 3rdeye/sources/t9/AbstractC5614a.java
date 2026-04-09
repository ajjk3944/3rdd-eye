package t9;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5614a extends c {
    @Override // t9.c
    public final int a(int i) {
        return ((-i) >> 31) & (d().nextInt() >>> (32 - i));
    }

    @Override // t9.c
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
