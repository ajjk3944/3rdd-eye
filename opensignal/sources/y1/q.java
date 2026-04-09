package y1;

import android.view.View;

/* loaded from: classes.dex */
public final class q extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25763d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25764g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(1);
        this.f25763d = i11;
        this.f25764g = i10;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f25763d) {
            case 0:
                return Boolean.valueOf(((e1.p) obj).g0(this.f25764g));
            default:
                return Boolean.valueOf(((View) obj).getId() == this.f25764g);
        }
    }
}
