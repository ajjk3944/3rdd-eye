package o9;

import kotlin.random.Random;

/* loaded from: classes4.dex */
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public int e(int i10) {
        return c.e(l().nextInt(), i10);
    }

    @Override // kotlin.random.Random
    public int g() {
        return l().nextInt();
    }

    @Override // kotlin.random.Random
    public int h(int i10) {
        return l().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public long j() {
        return l().nextLong();
    }

    public abstract java.util.Random l();
}
