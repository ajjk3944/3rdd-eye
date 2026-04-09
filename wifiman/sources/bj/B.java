package bj;

import Zg.AbstractC3689v;
import Zg.U;
import aj.AbstractC3868b;
import aj.C3864E;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class B extends z {

    /* renamed from: l, reason: collision with root package name */
    private final C3864E f33388l;

    /* renamed from: m, reason: collision with root package name */
    private final List f33389m;

    /* renamed from: n, reason: collision with root package name */
    private final int f33390n;

    /* renamed from: o, reason: collision with root package name */
    private int f33391o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractC3868b json, C3864E value) {
        super(json, value, null, null, 12, null);
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(value, "value");
        this.f33388l = value;
        List listI1 = AbstractC3689v.i1(A0().keySet());
        this.f33389m = listI1;
        this.f33390n = listI1.size() * 2;
        this.f33391o = -1;
    }

    @Override // bj.z, bj.AbstractC4120c
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public C3864E A0() {
        return this.f33388l;
    }

    @Override // bj.z, bj.AbstractC4120c, Yi.c
    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
    }

    @Override // bj.z, Zi.AbstractC3723o0
    protected String g0(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return (String) this.f33389m.get(i10 / 2);
    }

    @Override // bj.z, Yi.c
    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        int i10 = this.f33391o;
        if (i10 >= this.f33390n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f33391o = i11;
        return i11;
    }

    @Override // bj.z, bj.AbstractC4120c
    protected aj.j m0(String tag) {
        AbstractC6492s.i(tag, "tag");
        return this.f33391o % 2 == 0 ? aj.k.b(tag) : (aj.j) U.i(A0(), tag);
    }
}
