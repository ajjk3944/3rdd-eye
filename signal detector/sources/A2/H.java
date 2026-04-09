package A2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0540Hh;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0642Nh;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC2069wN;
import q2.C2841s;
import u2.C2951a;

/* loaded from: classes.dex */
public final class H implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* renamed from: b, reason: collision with root package name */
    public final C0540Hh f170b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f171c;

    public /* synthetic */ H(C0540Hh c0540Hh, InterfaceC2069wN interfaceC2069wN, int i) {
        this.f169a = i;
        this.f170b = c0540Hh;
        this.f171c = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        int i = this.f169a;
        InterfaceC2069wN interfaceC2069wN = this.f171c;
        C0540Hh c0540Hh = this.f170b;
        switch (i) {
            case 0:
                Context contextA = c0540Hh.a();
                E9 e9 = H9.f8707a;
                return new G(contextA, C2841s.f23267e.f23268a.C(), ((C0642Nh) interfaceC2069wN).a());
            case 1:
                return new V2.e((Context) c0540Hh.c(), (C2951a) ((C0642Nh) interfaceC2069wN).c());
            default:
                Context contextA2 = c0540Hh.a();
                C0852Zn c0852Zn = (C0852Zn) interfaceC2069wN.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new L(contextA2, c0852Zn, c0623Mf);
        }
    }
}
