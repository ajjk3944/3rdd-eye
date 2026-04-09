package qh;

import java.util.Random;

/* renamed from: qh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7508a extends AbstractC7510c {
    @Override // qh.AbstractC7510c
    public float c() {
        return h().nextFloat();
    }

    @Override // qh.AbstractC7510c
    public int d() {
        return h().nextInt();
    }

    @Override // qh.AbstractC7510c
    public int g(int i10) {
        return h().nextInt(i10);
    }

    public abstract Random h();
}
