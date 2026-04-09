package A2;

import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.C1922tl;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2069wN;

/* renamed from: A2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130s implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f324b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f325c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f326d;

    public /* synthetic */ C0130s(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, int i) {
        this.f323a = i;
        this.f324b = c1799rN;
        this.f325c = c1799rN2;
        this.f326d = c1799rN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f323a) {
            case 0:
                Object obj = (S) this.f324b.c();
                Object obj2 = (x) this.f325c.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                if (((Integer) this.f326d.c()).intValue() == 2) {
                    obj = obj2;
                }
                return new C1922tl(obj, c0623Mf);
            default:
                return new x((r) this.f324b.c(), ((Integer) this.f325c.c()).intValue(), (String) this.f326d.c());
        }
    }
}
