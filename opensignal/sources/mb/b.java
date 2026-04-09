package mb;

import eb.e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16669d = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List f16670a;

    public b(eb.b bVar) {
        this.f16670a = Collections.singletonList(bVar);
    }

    @Override // eb.e, n6.b
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // eb.e, n6.b
    public final long e(int i10) {
        qb.b.g(i10 == 0);
        return 0L;
    }

    @Override // eb.e, n6.b
    public final List f(long j) {
        return j >= 0 ? this.f16670a : Collections.EMPTY_LIST;
    }

    @Override // eb.e, n6.b
    public final int h() {
        return 1;
    }

    public b() {
        this.f16670a = Collections.EMPTY_LIST;
    }
}
