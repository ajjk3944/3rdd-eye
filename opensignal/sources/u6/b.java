package u6;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements n6.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f23370d = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List f23371a;

    public b(z4.b bVar) {
        this.f23371a = Collections.singletonList(bVar);
    }

    @Override // n6.b
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // n6.b
    public final long e(int i10) {
        a5.a.e(i10 == 0);
        return 0L;
    }

    @Override // n6.b
    public final List f(long j) {
        return j >= 0 ? this.f23371a : Collections.EMPTY_LIST;
    }

    @Override // n6.b
    public final int h() {
        return 1;
    }

    public b() {
        this.f23371a = Collections.EMPTY_LIST;
    }
}
