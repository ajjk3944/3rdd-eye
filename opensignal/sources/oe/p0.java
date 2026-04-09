package oe;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p0 implements ne.n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f19365a;

    public p0() {
        s.c(2, "expectedValuesPerKey");
        this.f19365a = 2;
    }

    @Override // ne.n
    public final Object get() {
        return new ArrayList(this.f19365a);
    }
}
