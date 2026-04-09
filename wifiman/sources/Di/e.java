package Di;

import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class e extends b implements Ci.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f3570b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f3571c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3573e;

    public e(Object[] root, Object[] tail, int i10, int i11) {
        AbstractC6492s.i(root, "root");
        AbstractC6492s.i(tail, "tail");
        this.f3570b = root;
        this.f3571c = tail;
        this.f3572d = i10;
        this.f3573e = i11;
        if (size() > 32) {
            Hi.a.a(size() - l.c(size()) <= AbstractC7978m.g(tail.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final int J() {
        return l.c(size());
    }

    private final Object[] y(int i10) {
        if (J() <= i10) {
            return this.f3571c;
        }
        Object[] objArr = this.f3570b;
        for (int i11 = this.f3573e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // Ci.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public f c() {
        return new f(this, this.f3570b, this.f3571c, this.f3573e);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        Hi.d.a(i10, size());
        return y(i10)[i10 & 31];
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f3572d;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator(int i10) {
        Hi.d.b(i10, size());
        return new g(this.f3570b, this.f3571c, i10, size(), (this.f3573e / 5) + 1);
    }
}
