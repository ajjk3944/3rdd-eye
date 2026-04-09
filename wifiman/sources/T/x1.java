package T;

import e0.InterfaceC5409b;
import java.util.Iterator;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
final class x1 implements InterfaceC5409b, Iterable, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f21277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21278b;

    /* renamed from: c, reason: collision with root package name */
    private final U f21279c;

    /* renamed from: d, reason: collision with root package name */
    private final w1 f21280d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21281e;

    /* renamed from: f, reason: collision with root package name */
    private final Iterable f21282f = this;

    public x1(C3516b1 c3516b1, int i10, U u10, w1 w1Var) {
        this.f21277a = c3516b1;
        this.f21278b = i10;
        this.f21280d = w1Var;
        this.f21281e = Integer.valueOf(u10.c());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new v1(this.f21277a, this.f21278b, this.f21279c, this.f21280d);
    }
}
