package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class b6 extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f26508b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26509c;

    public b6(m5 m5Var, Comparator comparator) {
        super(m5Var);
        this.f26508b = comparator;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        this.f26509c = true;
        return false;
    }
}
