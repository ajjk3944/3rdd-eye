package N6;

import com.polidea.rxandroidble3.exceptions.BleScanException;

/* loaded from: classes3.dex */
public class r implements q {

    /* renamed from: a, reason: collision with root package name */
    final P6.G f15370a;

    /* renamed from: b, reason: collision with root package name */
    final P6.x f15371b;

    public r(P6.G g10, P6.x xVar) {
        this.f15370a = g10;
        this.f15371b = xVar;
    }

    @Override // N6.q
    public void a(boolean z10) {
        if (!this.f15370a.b()) {
            throw new BleScanException(2);
        }
        if (!this.f15370a.c()) {
            throw new BleScanException(1);
        }
        if (!this.f15371b.b()) {
            throw new BleScanException(3);
        }
        if (z10 && !this.f15371b.a()) {
            throw new BleScanException(4);
        }
    }
}
