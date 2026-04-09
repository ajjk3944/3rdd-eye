package A2;

import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2069wN;

/* loaded from: classes.dex */
public final class T implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2069wN f214a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f215b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f216c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f217d;

    public T(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4) {
        this.f214a = c1799rN;
        this.f215b = c1799rN2;
        this.f216c = c1799rN3;
        this.f217d = c1799rN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final /* bridge */ /* synthetic */ Object c() {
        return new S((C0750Tn) this.f214a.c(), (Q) this.f215b.c(), (String) this.f216c.c(), ((Integer) this.f217d.c()).intValue());
    }
}
