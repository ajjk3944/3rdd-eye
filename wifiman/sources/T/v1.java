package T;

import e0.InterfaceC5409b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
final class v1 implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f21260a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21261b;

    /* renamed from: c, reason: collision with root package name */
    private final U f21262c;

    /* renamed from: d, reason: collision with root package name */
    private final w1 f21263d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21264e;

    /* renamed from: f, reason: collision with root package name */
    private int f21265f;

    public v1(C3516b1 c3516b1, int i10, U u10, w1 w1Var) {
        this.f21260a = c3516b1;
        this.f21261b = i10;
        this.f21263d = w1Var;
        this.f21264e = c3516b1.z();
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC5409b next() {
        Object obj;
        ArrayList arrayListB = this.f21262c.b();
        if (arrayListB != null) {
            int i10 = this.f21265f;
            this.f21265f = i10 + 1;
            obj = arrayListB.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C3520d) {
            return new C3519c1(this.f21260a, ((C3520d) obj).a(), this.f21264e);
        }
        if (obj instanceof U) {
            return new x1(this.f21260a, this.f21261b, (U) obj, new Q0(this.f21263d, this.f21265f - 1));
        }
        AbstractC3546o.s("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListB = this.f21262c.b();
        return arrayListB != null && this.f21265f < arrayListB.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
