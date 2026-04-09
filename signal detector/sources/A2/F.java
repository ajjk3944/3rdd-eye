package A2;

import com.google.android.gms.internal.ads.C0540Hh;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import t2.C2905A;

/* loaded from: classes.dex */
public final class F implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161a;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f162b;

    public /* synthetic */ F(C0540Hh c0540Hh, int i) {
        this.f161a = i;
        this.f162b = c0540Hh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f161a) {
            case 0:
                return new E(this.f162b.a());
            default:
                return new C2905A(this.f162b.a());
        }
    }
}
