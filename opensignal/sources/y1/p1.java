package y1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p1 implements x1.m1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f25761b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25762c;

    public p1(int i10, ArrayList arrayList) {
        this.f25761b = i10;
        this.f25762c = arrayList;
    }

    @Override // x1.m1
    public final boolean j() {
        return this.f25762c.contains(this);
    }
}
